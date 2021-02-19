/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter;

import java.sql.Timestamp;

import it.csi.sigit.sigitext.dto.sigitext.DettaglioAllegato;

public class ImportFilter {
	
	private byte[] datiXml;
	private Timestamp dataInizio;
	private String codiceImpianto;
	private String nomeFile;
	private Integer idPreImport;
	private DettaglioAllegato dettaglioAllegato;
	
	public String getNomeFile() {
		return nomeFile;
	}
	public void setNomeFile(String nomeFile) {
		this.nomeFile = nomeFile;
	}
	public String getCodiceImpianto() {
		return codiceImpianto;
	}
	public void setCodiceImpianto(String codiceImpianto) {
		this.codiceImpianto = codiceImpianto;
	}
	public byte[] getDatiXml() {
		return datiXml;
	}
	public void setDatiXml(byte[] datiXml) {
		this.datiXml = datiXml;
	}
	public Timestamp getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(Timestamp dataInizio) {
		this.dataInizio = dataInizio;
	}
	public Integer getIdPreImport() {
		return idPreImport;
	}
	public void setIdPreImport(Integer idPreImport) {
		this.idPreImport = idPreImport;
	}
	public DettaglioAllegato getDettaglioAllegato() {
		return dettaglioAllegato;
	}
	public void setDettaglioAllegato(DettaglioAllegato dettaglioAllegato) {
		this.dettaglioAllegato = dettaglioAllegato;
	}
	
}
