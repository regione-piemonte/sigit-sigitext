/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.util;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlError;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;

import it.csi.sigit.sigitext.business.util.exception.XmlValidatorException;

/**
 * Validatore di file XML
 * 
 * @author 71845 - Marco Giacometto
 */
public class XmlValidator {
	
	protected static final Logger log = Logger.getLogger(Constants.APPLICATION_CODE + ".SigitextManager==>");
	
	/**
	 * Valida un file XML
	 * 
	 * @param xmlReader Reader dell'XML da validare
	 * @param xmlSchemaReader Reader dello schema con cui validare l'XML
	 * @throws XmlValidatorException Lo schema o il file XML non e' valido
	 */
	public static void validate(Reader xmlReader, Reader xmlSchemaReader) throws XmlValidatorException {
		XmlValidatorException exception = null;
		XmlOptions xmlOptions = null;
//		Collection<XmlError> errors = null;
		SchemaTypeLoader schemaTypeLoader = null;
		XmlObject xml = null;

		schemaTypeLoader = loadSchema(xmlSchemaReader);
		xml = loadXml(xmlReader, schemaTypeLoader);
		if(xml.schemaType() == XmlObject.type) {
			log.debug("schema type non valido");
			throw new XmlValidatorException("Tipo di schema dell'XML non valido");
		}
//		errors = new ArrayList<XmlError>();
		xmlOptions = new XmlOptions();
//		xmlOptions.setErrorListener(errors);
		if(!xml.validate(xmlOptions)) {
			exception = new XmlValidatorException("L'XML non e' valido");
//			exception.setErrors(errors);
			log.error("51 - Errore validazione xml", exception);
//			for (XmlError xmlError : errors) {
//				log.debug("Errore: " + xmlError.getMessage() + "->" + xmlError);
//			}
			throw exception;
		}
	}

	/**
	 * Carica un XML
	 * 
	 * @param xmlReader Reader dell'XML da caricare
	 * @param schemaTypeLoader Parsificatore di XML da utilizzare
	 * @return XML caricato
	 * @throws XmlValidatorException L'XML non e' stato trovato o non e' valido
	 */
	private static XmlObject loadXml(Reader xmlReader, SchemaTypeLoader schemaTypeLoader) throws XmlValidatorException {
		XmlOptions xmlOptions = null;
		XmlObject xml = null;

		xmlOptions = new XmlOptions();
		xmlOptions.setLoadLineNumbers(XmlOptions.LOAD_LINE_NUMBERS_END_ELEMENT);
		try {
			xml = schemaTypeLoader.parse(xmlReader, null, xmlOptions);
		}
		catch(XmlException e) {
			throw new XmlValidatorException("L'XML non e' valido", e);
		}
		catch(IOException e) {
			throw new XmlValidatorException("Impossibile caricare l'XML", e);
		}
		return xml;
	}

	/**
	 * Carica uno schema
	 * 
	 * @param xmlSchemaReader Reader dello schema da caricare
	 * @return Schema caricato
	 * @throws XmlValidatorException Lo schema non e' stato trovato o non e'
	 *             valido
	 */
	private static SchemaTypeLoader loadSchema(Reader xmlSchemaReader) throws XmlValidatorException {
		XmlValidatorException exception = null;
		XmlOptions xmlOptions = null;
		XmlObject[] schemas = null;
//		Collection<XmlError> errors = null;
		SchemaTypeLoader schemaTypeLoader = null;

		xmlOptions = new XmlOptions();
		xmlOptions.setLoadLineNumbers();
		xmlOptions.setLoadMessageDigest();
		schemas = new XmlObject[1];
		try {
			schemas[0] = XmlObject.Factory.parse(xmlSchemaReader, xmlOptions);
//			errors = new ArrayList<XmlError>();
//			xmlOptions = new XmlOptions();
//			xmlOptions.setErrorListener(errors);
			schemaTypeLoader = XmlBeans.compileXsd(schemas, schemaTypeLoader, xmlOptions);
		}
		catch(XmlException e) {
			exception = new XmlValidatorException("Lo schema non e' valido", e);
//			exception.setErrors(errors);
			throw exception;
		}
		catch(IOException e) {
			throw new XmlValidatorException("Impossibile caricare lo schema", e);
		}
		return schemaTypeLoader;
	}
}
