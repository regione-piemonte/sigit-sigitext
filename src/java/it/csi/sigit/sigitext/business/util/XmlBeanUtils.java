/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
/**
 * 
 */
package it.csi.sigit.sigitext.business.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;

/**
 * @author 70140
 *
 */
public class XmlBeanUtils {

	//private static final String UTF_8 = "UTF-8";
	protected static final Logger log = Logger.getLogger(Constants.APPLICATION_CODE + ".util");
	
    public static XmlOptions createXmlOption()
    {
        XmlOptions xmlo = new XmlOptions();
        xmlo.setCharacterEncoding(Constants.UTF_8_ENCODING);
        xmlo.setSavePrettyPrint();
        
        return xmlo;
    }

    public static byte[] extractByteArray(XmlObject moduloDocument) throws IOException
    {
    	log.debug("[XmlBeanUtils:extractByteArray] START");	
        XmlOptions xmlo = XmlBeanUtils.createXmlOption();        
        ByteArrayOutputStream bios = new ByteArrayOutputStream();
        moduloDocument.save(bios,xmlo);
        byte[] result = bios.toByteArray();

        if (log.isDebugEnabled())
        	log.debug("XML Generato:\n"+new String(result, Constants.UTF_8_ENCODING));

        log.debug("[XmlBeanUtils:extractByteArray] END");
        return  result;
    }
	
    /**
	 * Legge un file
	 * 
	 * @param fileReader Lettore del file
	 * @return Contenuto del file
	 * @throws IOException Errore durante la lettura del file
	 */
    public static String readFile(Reader fileReader) throws IOException {
		StringBuilder fileContent = null;
		BufferedReader reader = null;
		String line = null;

		reader = new BufferedReader(fileReader);
		fileContent = new StringBuilder();
		while((line = reader.readLine()) != null) {
			fileContent.append(line).append("\n");
		}
		return fileContent.toString();
	}

    public static String readByteArray(byte[] input) throws IOException {
    	return new String(input, Constants.UTF_8_ENCODING);
    }

    public static byte[] readString(String input) throws IOException {
    	return input.getBytes(Constants.UTF_8_ENCODING);
    }
    
}