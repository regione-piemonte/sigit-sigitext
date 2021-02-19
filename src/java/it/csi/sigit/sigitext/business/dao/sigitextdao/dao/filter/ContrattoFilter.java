/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter;

import java.math.BigDecimal;
import java.util.Date;

public class ContrattoFilter {

	private BigDecimal codiceImpianto;
	private Date dataDal;
	private Date dataAl;
	private boolean conTacitoRinnovo;
	private String idTipoComponente;
	private java.util.ArrayList<java.lang.String> elencoComponenti = new java.util.ArrayList<java.lang.String>();
	private java.lang.String componente;
	
	
	public BigDecimal getCodiceImpianto() {
		return codiceImpianto;
	}
	public void setCodiceImpianto(BigDecimal codiceImpianto) {
		this.codiceImpianto = codiceImpianto;
	}
	public Date getDataDal() {
		return dataDal;
	}
	public void setDataDal(Date dataDal) {
		this.dataDal = dataDal;
	}
	public Date getDataAl() {
		return dataAl;
	}
	public void setDataAl(Date dataAl) {
		this.dataAl = dataAl;
	}
	public boolean isConTacitoRinnovo() {
		return conTacitoRinnovo;
	}
	public void setConTacitoRinnovo(boolean conTacitoRinnovo) {
		this.conTacitoRinnovo = conTacitoRinnovo;
	}
	
	public String getIdTipoComponente() {
		return idTipoComponente;
	}
	public void setIdTipoComponente(String idTipoComponente) {
		this.idTipoComponente = idTipoComponente;
	}
	public java.util.ArrayList<java.lang.String> getElencoComponenti() {
		return elencoComponenti;
	}
	public void setElencoComponenti(
			java.util.ArrayList<java.lang.String> elencoComponenti) {
		this.elencoComponenti = elencoComponenti;
	}
	
	public void addElencoComponenti(
			java.lang.String componente) {
		this.elencoComponenti.add(componente);
	}
	public java.lang.String getComponente() {
		return componente;
	}
	public void setComponente(java.lang.String componente) {
		this.componente = componente;
	}
	
}
