/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter;

import java.sql.Date;
import java.util.List;

public class AllegatiCompFilter {

	private String codImpianto;
	private Integer idImpRuoloPfPg;
	private Date dataControllo;
	private Integer idAllegato;
	
	public AllegatiCompFilter()
	{
		
	}
	
	public AllegatiCompFilter(String codImpianto) {
		this.codImpianto = codImpianto;
	}
	
	public AllegatiCompFilter(String codImpianto, Date dataControllo)
	{
		this.codImpianto = codImpianto;
		this.dataControllo = dataControllo;
	}

	public AllegatiCompFilter(String codImpianto, Integer idImpRuoloPfPg)
	{
		this.codImpianto = codImpianto;
		this.idImpRuoloPfPg = idImpRuoloPfPg;
	}

	public String getCodImpianto() {
		return codImpianto;
	}

	public void setCodImpianto(String codImpianto) {
		this.codImpianto = codImpianto;
	}

	public Date getDataControllo() {
		return dataControllo;
	}

	public void setDataControllo(Date dataControllo) {
		this.dataControllo = dataControllo;
	}

	public Integer getIdAllegato() {
		return idAllegato;
	}

	public void setIdAllegato(Integer idAllegato) {
		this.idAllegato = idAllegato;
	}

	public Integer getIdImpRuoloPfPg() {
		return idImpRuoloPfPg;
	}

	public void setIdImpRuoloPfPg(Integer idImpRuoloPfPg) {
		this.idImpRuoloPfPg = idImpRuoloPfPg;
	}
	
}
