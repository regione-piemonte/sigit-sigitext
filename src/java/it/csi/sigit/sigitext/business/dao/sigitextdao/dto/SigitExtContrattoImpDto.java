/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class SigitExtContrattoImpDto implements Serializable{
	private static final long serialVersionUID = 1263978099684804784L;
	//	A.CODICE_IMPIANTO, 
	private BigDecimal codiceImpianto;
//	A.FK_RUOLO, 
	private BigDecimal fkRuolo;
//	DR.DES_RUOLO,
	private String desRuolo;
//	IC.ID_CONTRATTO, 
	private BigDecimal idContratto;
//	IC.DATA_CARICAMENTO, 
	private Date dataCaricamento;
//	IC.DATA_REVOCA, 
	private Date dataCessazione;
//	IC.DATA_INSERIMENTO_REVOCA, 
	private Date dataInserimentoCessazione;
//	C.FK_PG_3_RESP, 
	private BigDecimal fkPg3Resp;
//	FK_PG_RESPONSABILE, 
	private BigDecimal fkPgResponsabile;
//	FK_PF_RESPONSABILE, 
	private BigDecimal fkPfResponsabile;
//	C.DATA_INIZIO AS DATA_INIZIO_CONTRATTO, 
	private Date dataInizioContratto;
//	C.DATA_FINE AS DATA_FINE_CONTRATTO, 
	private Date dataFineContratto;
//	FLG_TACITO_RINNOVO,
	private BigDecimal flagTacitoRinnovo;
//	COALESCE(PG.CODICE_FISCALE, PF.CODICE_FISCALE) AS RESP_CODICE_FISCALE,
	private String respCodiceFiscale;
//	COALESCE(PG.DENOMINAZIONE,  PF.COGNOME) AS RESP_DENOMINAZIONE,
	private String respDenominazione;
//	PF.NOME 
	private String respNome;
//	PG3R.DENOMINAZIONE AS TERZO_RESP_DENOMINAZIONE, 
	private String terzoRespDenominazione;
//	PG3R.SIGLA_REA AS TERZO_RESP_SIGLA_REA,
	private String terzoRespSiglaRea;
//	PG3R.NUMERO_REA AS TERZO_RESP_NUMERO_REA
	private BigDecimal terzoRespNumeroRea;
	
	//DENOM_COMUNE_3_RESP, 
	private String denomComune3Resp;
	//	SIGLA_PROV_3_RESP, 
	private String siglaProv3Resp;
	//DENOM_PROVINCIA_3_RESP
	private String denomProvincia3Resp;
//	CODICE_FISCALE_3_RESP
	private String codiceFiscale3Resp;
	
//	DENOM_COMUNE_IMPIANTO
	private String denomComuneImpianto;
//	DENOM_PROV_IMPIANTO
	private String denomProvImpianto;
//	SIGLA_PROV_IMPIANTO
	private String siglaProvImpianto;
	
	private BigDecimal idTipoCessazione;
	private String desTipoCessazione;
	private String motivoCessazione;
	
	public String getDesRuolo() {
		return desRuolo;
	}
	public void setDesRuolo(String desRuolo) {
		this.desRuolo = desRuolo;
	}
	public Date getDataCaricamento() {
		return dataCaricamento;
	}
	public void setDataCaricamento(Date dataCaricamento) {
		this.dataCaricamento = dataCaricamento;
	}
	public Date getDataInizioContratto() {
		return dataInizioContratto;
	}
	public void setDataInizioContratto(Date dataInizioContratto) {
		this.dataInizioContratto = dataInizioContratto;
	}
	public Date getDataFineContratto() {
		return dataFineContratto;
	}
	public void setDataFineContratto(Date dataFineContratto) {
		this.dataFineContratto = dataFineContratto;
	}
	public BigDecimal getFlagTacitoRinnovo() {
		return flagTacitoRinnovo;
	}
	public void setFlagTacitoRinnovo(BigDecimal flagTacitoRinnovo) {
		this.flagTacitoRinnovo = flagTacitoRinnovo;
	}
	public String getRespCodiceFiscale() {
		return respCodiceFiscale;
	}
	public void setRespCodiceFiscale(String respCodiceFiscale) {
		this.respCodiceFiscale = respCodiceFiscale;
	}
	public String getRespDenominazione() {
		return respDenominazione;
	}
	public void setRespDenominazione(String respDenominazione) {
		this.respDenominazione = respDenominazione;
	}
	public String getTerzoRespDenominazione() {
		return terzoRespDenominazione;
	}
	public void setTerzoRespDenominazione(String terzoRespDenominazione) {
		this.terzoRespDenominazione = terzoRespDenominazione;
	}
	public String getTerzoRespSiglaRea() {
		return terzoRespSiglaRea;
	}
	public void setTerzoRespSiglaRea(String terzoRespSiglaRea) {
		this.terzoRespSiglaRea = terzoRespSiglaRea;
	}
	public BigDecimal getCodiceImpianto() {
		return codiceImpianto;
	}
	public void setCodiceImpianto(BigDecimal codiceImpianto) {
		this.codiceImpianto = codiceImpianto;
	}
	public BigDecimal getFkPg3Resp() {
		return fkPg3Resp;
	}
	public void setFkPg3Resp(BigDecimal fkPg3Resp) {
		this.fkPg3Resp = fkPg3Resp;
	}
	public BigDecimal getFkPgResponsabile() {
		return fkPgResponsabile;
	}
	public void setFkPgResponsabile(BigDecimal fkPgResponsabile) {
		this.fkPgResponsabile = fkPgResponsabile;
	}
	public BigDecimal getFkPfResponsabile() {
		return fkPfResponsabile;
	}
	public void setFkPfResponsabile(BigDecimal fkPfResponsabile) {
		this.fkPfResponsabile = fkPfResponsabile;
	}
	public BigDecimal getTerzoRespNumeroRea() {
		return terzoRespNumeroRea;
	}
	public void setTerzoRespNumeroRea(BigDecimal terzoRespNumeroRea) {
		this.terzoRespNumeroRea = terzoRespNumeroRea;
	}
	public BigDecimal getFkRuolo() {
		return fkRuolo;
	}
	public void setFkRuolo(BigDecimal fkRuolo) {
		this.fkRuolo = fkRuolo;
	}
	public BigDecimal getIdContratto() {
		return idContratto;
	}
	public void setIdContratto(BigDecimal idContratto) {
		this.idContratto = idContratto;
	}
	public String getRespNome() {
		return respNome;
	}
	public void setRespNome(String respNome) {
		this.respNome = respNome;
	}
	public String getDenomComune3Resp() {
		return denomComune3Resp;
	}
	public void setDenomComune3Resp(String denomComune3Resp) {
		this.denomComune3Resp = denomComune3Resp;
	}
	public String getSiglaProv3Resp() {
		return siglaProv3Resp;
	}
	public void setSiglaProv3Resp(String siglaProv3Resp) {
		this.siglaProv3Resp = siglaProv3Resp;
	}
	public String getDenomProvincia3Resp() {
		return denomProvincia3Resp;
	}
	public void setDenomProvincia3Resp(String denomProvincia3Resp) {
		this.denomProvincia3Resp = denomProvincia3Resp;
	}
	public String getCodiceFiscale3Resp() {
		return codiceFiscale3Resp;
	}
	public void setCodiceFiscale3Resp(String codiceFiscale3Resp) {
		this.codiceFiscale3Resp = codiceFiscale3Resp;
	}
	public String getDenomComuneImpianto() {
		return denomComuneImpianto;
	}
	public void setDenomComuneImpianto(String denomComuneImpianto) {
		this.denomComuneImpianto = denomComuneImpianto;
	}
	public String getDenomProvImpianto() {
		return denomProvImpianto;
	}
	public void setDenomProvImpianto(String denomProvImpianto) {
		this.denomProvImpianto = denomProvImpianto;
	}
	public String getSiglaProvImpianto() {
		return siglaProvImpianto;
	}
	public void setSiglaProvImpianto(String siglaProvImpianto) {
		this.siglaProvImpianto = siglaProvImpianto;
	}
	public Date getDataCessazione() {
		return dataCessazione;
	}
	public void setDataCessazione(Date dataCessazione) {
		this.dataCessazione = dataCessazione;
	}
	public Date getDataInserimentoCessazione() {
		return dataInserimentoCessazione;
	}
	public void setDataInserimentoCessazione(Date dataInserimentoCessazione) {
		this.dataInserimentoCessazione = dataInserimentoCessazione;
	}
	public BigDecimal getIdTipoCessazione() {
		return idTipoCessazione;
	}
	public void setIdTipoCessazione(BigDecimal idTipoCessazione) {
		this.idTipoCessazione = idTipoCessazione;
	}
	public String getDesTipoCessazione() {
		return desTipoCessazione;
	}
	public void setDesTipoCessazione(String desTipoCessazione) {
		this.desTipoCessazione = desTipoCessazione;
	}
	public String getMotivoCessazione() {
		return motivoCessazione;
	}
	public void setMotivoCessazione(String motivoCessazione) {
		this.motivoCessazione = motivoCessazione;
	}

	
}
