/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter;

import java.math.BigDecimal;

/**
 * Filtro per cercare per codice REA
 * 
 */
public class CodiceReaAndFiscaleFilter {
	/**
	 * Sigla REA
	 */
	private String siglaRea = null;
	/**
	 * Numero REA
	 */
	private BigDecimal numeroRea = null;

	/**
	 * Codice fiscale
	 */
	private String codiceFiscale = null;

	/**
	 * Inizializza un'istanza della classe
	 */
	public CodiceReaAndFiscaleFilter() {
	}

	/**
	 * Inizializza un'istanza della classe
	 * 
	 * @param siglaRea Sigla REA
	 * @param numeroRea Numero REA
	 * @param codiceFiscale  Codice fiscale
	 */
	public CodiceReaAndFiscaleFilter(String siglaRea, BigDecimal numeroRea, String codiceFiscale) {
		this.siglaRea = siglaRea;
		this.numeroRea = numeroRea;
		this.codiceFiscale = codiceFiscale;
	}

	/**
	 * Inizializza un'istanza della classe
	 * 
	 * @param siglaRea Sigla REA
	 * @param numeroRea Numero REA
	 */
	public CodiceReaAndFiscaleFilter(String siglaRea, BigDecimal numeroRea) {
		this.siglaRea = siglaRea;
		this.numeroRea = numeroRea;
	}
	
	/**
	 * Inizializza un'istanza della classe
	 * 
	 * @param codiceFiscale  Codice fiscale
	 */
	public CodiceReaAndFiscaleFilter(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	
	/**
	 * Restituisce la sigla REA
	 * 
	 * @return Sigla REA
	 */
	public String getSiglaRea() {
		return siglaRea;
	}

	/**
	 * Imposta la sigla REA
	 * 
	 * @param siglaRea Sigla REA
	 */
	public void setSiglaRea(String siglaRea) {
		this.siglaRea = siglaRea;
	}

	/**
	 * Restituisce il numero REA
	 * 
	 * @return Numero REA
	 */
	public BigDecimal getNumeroRea() {
		return numeroRea;
	}

	/**
	 * Imposta il numero REA
	 * 
	 * @param numeroRea Numero REA
	 */
	public void setNumeroRea(BigDecimal numeroRea) {
		this.numeroRea = numeroRea;
	}
	
	/**
	 * Imposta il codice fiscale
	 * 
	 * @param codiceFiscale Codice fiscale
	 */
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	/**
	 * Restituisce il codice fiscale
	 * 
	 * @return Codice fiscale
	 */
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
}
