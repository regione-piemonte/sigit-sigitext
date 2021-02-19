/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter;

import java.util.List;
import java.sql.Date;

public class CompFilter {

	private Integer idPG;
	private Integer idAllegato;
	private Integer codImpianto;
	private String tipoComponente;
	private Date dataInstallazione;
	private List<String> listDateInstallazione;
	private String dateDismissione;
	private String progressivo;
	private List<String> listProgressivi;
	private List<String> listCombustibile;
	private Integer idRuolo;
	private String ruoloFunz;
	
	public CompFilter()
	{
		
	}
	
	public CompFilter(Integer codImpianto)
	{
		this.codImpianto = codImpianto;
	}
	
	public CompFilter(Integer codImpianto, String tipoComponente, List<String> listCombustibile, Date dataInstallazione)
	{
		this.codImpianto = codImpianto;
		this.tipoComponente = tipoComponente;
		this.listCombustibile = listCombustibile;
		this.dataInstallazione = dataInstallazione;
	}
	
	public CompFilter(Integer codImpianto, List<String> listProgressivi, Date dataInstallazione)
	{
		this.codImpianto = codImpianto;
		this.listProgressivi = listProgressivi;
		this.dataInstallazione = dataInstallazione;
	}
	
	public CompFilter(Integer codImpianto, String progressivo)
	{
		this.codImpianto = codImpianto;
		this.progressivo = progressivo;
	}
	
	public CompFilter(Integer codImpianto, String progressivo, Integer idAllegato)
	{
		this.codImpianto = codImpianto;
		this.progressivo = progressivo;
		this.idAllegato = idAllegato;
	}
	
	public String getTipoComponente() {
		return tipoComponente;
	}
	public void setTipoComponente(String tipoComponente) {
		this.tipoComponente = tipoComponente;
	}
	public String getProgressivo() {
		return progressivo;
	}
	public void setProgressivo(String progressivo) {
		this.progressivo = progressivo;
	}
	public Integer getCodImpianto() {
		return codImpianto;
	}
	public void setCodImpianto(Integer codImpianto) {
		this.codImpianto = codImpianto;
	}
	public List<String> getListDateInstallazione() {
		return listDateInstallazione;
	}
	public void setListDateInstallazione(List<String> dateInstallazione) {
		this.listDateInstallazione = dateInstallazione;
	}
	public List<String> getListProgressivi() {
		return listProgressivi;
	}
	public void setListProgressivi(List<String> listProgressivi) {
		this.listProgressivi = listProgressivi;
	}
	public Date getDataInstallazione() {
		return dataInstallazione;
	}
	public void setDataInstallazione(Date dataInstallazione) {
		this.dataInstallazione = dataInstallazione;
	}
	public String getDateDismissione() {
		return dateDismissione;
	}
	public void setDateDismissione(String dateDismissione) {
		this.dateDismissione = dateDismissione;
	}
	public List<String> getListCombustibile() {
		return listCombustibile;
	}
	public void setListCombustibile(List<String> listCombustibile) {
		this.listCombustibile = listCombustibile;
	}
	public Integer getIdPG() {
		return idPG;
	}
	public void setIdPG(Integer idPG) {
		this.idPG = idPG;
	}
	
	public Integer getIdAllegato() {
		return idAllegato;
	}
	public void setIdAllegato(Integer idAllegato) {
		this.idAllegato = idAllegato;
	}

	public Integer getIdRuolo() {
		return idRuolo;
	}

	public void setIdRuolo(Integer idRuolo) {
		this.idRuolo = idRuolo;
	}

	public String getRuoloFunz() {
		return ruoloFunz;
	}

	public void setRuoloFunz(String ruoloFunz) {
		this.ruoloFunz = ruoloFunz;
	}
	
}
