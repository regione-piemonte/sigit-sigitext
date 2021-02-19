/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter;

import java.sql.Date;

public class ResponsabileFilter {

	/**
	 * Codice impianto
	 */
	private Integer codiceImpianto = null;
	
	/**
	 * Data rapporto
	 */
	private Date dataRapporto = null;

	public ResponsabileFilter() {
	}
	
	public ResponsabileFilter(Integer codiceImpianto, Date dataRapporto) {
		this.codiceImpianto = codiceImpianto;
		this.dataRapporto = dataRapporto;
	}

	
	public Integer getCodiceImpianto() {
		return codiceImpianto;
	}

	public void setCodiceImpianto(Integer codiceImpianto) {
		this.codiceImpianto = codiceImpianto;
	}

	public Date getDataRapporto() {
		return dataRapporto;
	}

	public void setDataRapporto(Date dataRapporto) {
		this.dataRapporto = dataRapporto;
	}
	
	
}
