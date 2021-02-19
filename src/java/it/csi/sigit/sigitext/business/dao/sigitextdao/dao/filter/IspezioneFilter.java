/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter;

import java.math.BigDecimal;
import java.util.Date;


/**
 * Filtro per cercare le ispezioni
 * 
 */
public class IspezioneFilter {

	/**
	 * Codice impianto
	 */
	private Integer codiceImpianto = null;
	
	
	private Integer idStatoIspezione;
	
	private String elencoIdIspezione2018;

	
	/**
	 * Inizializza un'istanza della classe
	 */
	public IspezioneFilter(Integer codiceImpianto, Integer idStatoIspezione) {
		this.codiceImpianto = codiceImpianto;
		this.idStatoIspezione = idStatoIspezione;
	}

	public IspezioneFilter() {
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
	
	public Integer getIdStatoIspezione() {
		return idStatoIspezione;
	}


	public void setIdStatoIspezione(Integer idStatoIspezione) {
		this.idStatoIspezione = idStatoIspezione;
	}

	public String getElencoIdIspezione2018() {
		return elencoIdIspezione2018;
	}

	public void setElencoIdIspezione2018(String elencoIdIspezione2018) {
		this.elencoIdIspezione2018 = elencoIdIspezione2018;
	}

	
}
