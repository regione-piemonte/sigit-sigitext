/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.util.exception;

import java.util.Collection;

import org.apache.xmlbeans.XmlError;

import it.csi.sigit.sigitext.business.util.XmlValidator;

/**
 * Eccezione sollevata dalla classe {@link XmlValidator}
 * 
 * @author 71845 - Marco Giacometto
 */
public class XmlValidatorException extends Exception {
	/**
	 * Id univoco della classe
	 */
	private static final long serialVersionUID = 8903271242660055218L;

	/**
	 * Inizializza un'istanza della classe
	 */
	public XmlValidatorException() {
	}

	/**
	 * Inizializza un'istanza della classe
	 * 
	 * @param message Messaggio d'errore
	 */
	public XmlValidatorException(String message) {
		super(message);
	}

	/**
	 * Inizializza un'istanza della classe
	 * 
	 * @param cause Causa dell'eccezione
	 */
	public XmlValidatorException(Throwable cause) {
		super(cause);
	}

	/**
	 * Inizializza un'istanza della classe
	 * 
	 * @param message Messaggio d'errore
	 * @param cause Causa dell'eccezione
	 */
	public XmlValidatorException(String message, Throwable cause) {
		super(message, cause);
	}
}
