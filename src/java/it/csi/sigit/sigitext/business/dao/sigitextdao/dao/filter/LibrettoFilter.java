/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter;

/**
 * Filtro per cercare il libretto
 * 
 */
public class LibrettoFilter {

	/**
	 * Codice impianto
	 */
	private Integer codiceImpianto = null;
	
	/**
	 * Stato Libretto
	 */
	private Integer idStatoLibretto = null;
	
	/**
	 * Inizializza un'istanza della classe
	 */
	public LibrettoFilter() {
	}

	/**
	 * Inizializza un'istanza della classe
	 */
	public LibrettoFilter(Integer codiceImpianto, Integer idStatoLibretto) {
		setCodiceImpianto(codiceImpianto);
		setIdStatoLibretto(idStatoLibretto);
	}
	
	/**
	 * Imposta il codice impianto
	 * 
	 * @param codiceFiscale Codice impianto
	 */
	public void setCodiceImpianto(Integer codiceImpianto) {
		this.codiceImpianto = codiceImpianto;
	}

	/**
	 * Restituisce il codice impianto
	 * 
	 * @return Codice impianto
	 */
	public Integer getCodiceImpianto() {
		return codiceImpianto;
	}
	
	/**
	 * Restituisce lo stato libretto
	 * 
	 * @return Id stato libretto
	 */
	public Integer getIdStatoLibretto() {
		return idStatoLibretto;
	}

	/**
	 * Imposta lo stato libretto
	 * 
	 * @param idStatoLibretto Stato libretto
	 */
	public void setIdStatoLibretto(Integer idStatoLibretto) {
		this.idStatoLibretto = idStatoLibretto;
	}

}
