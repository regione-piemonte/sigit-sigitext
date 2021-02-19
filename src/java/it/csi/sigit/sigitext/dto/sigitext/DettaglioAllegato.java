/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.dto.sigitext;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTPersonaGiuridicaDto;

public class DettaglioAllegato implements java.io.Serializable {

	private java.lang.Integer idAllegato = null;

	public void setIdAllegato(java.lang.Integer val) {
		idAllegato = val;
	}

	public java.lang.Integer getIdAllegato() {
		return idAllegato;
	}

	private java.lang.String dataControllo = null;

	public void setDataControllo(java.lang.String val) {
		dataControllo = val;
	}

	public java.lang.String getDataControllo() {
		return dataControllo;
	}

	private java.lang.String dataIntervento = null;

	public void setDataIntervento(java.lang.String val) {
		dataIntervento = val;
	}

	public java.lang.String getDataIntervento() {
		return dataIntervento;
	}
	
	private java.lang.String tipoAllegato = null;

	public void setTipoAllegato(java.lang.String val) {
		tipoAllegato = val;
	}

	public java.lang.String getTipoAllegato() {
		return tipoAllegato;
	}

	private java.lang.String statoAllegato = null;

	public void setStatoAllegato(java.lang.String val) {
		statoAllegato = val;
	}
	
	public java.lang.String getStatoAllegato() {
		return statoAllegato;
	}

	private java.lang.String osservazioni = null;

	public void setOsservazioni(java.lang.String val) {
		osservazioni = val;
	}

	public java.lang.String getOsservazioni() {
		return osservazioni;
	}

	private java.lang.String raccomandazioni = null;

	public void setRaccomandazioni(java.lang.String val) {
		raccomandazioni = val;
	}

	public java.lang.String getRaccomandazioni() {
		return raccomandazioni;
	}

	private java.lang.String prescrizioni = null;

	public void setPrescrizioni(java.lang.String val) {
		prescrizioni = val;
	}

	public java.lang.String getPrescrizioni() {
		return prescrizioni;
	}

	private java.lang.String interventoRaccomandato = null;

	public void setInterventoRaccomandato(java.lang.String val) {
		interventoRaccomandato = val;
	}

	public java.lang.String getInterventoRaccomandato() {
		return interventoRaccomandato;
	}

	private java.lang.String numeroBollinoVerde = null;

	public void setNumeroBollinoVerde(java.lang.String val) {
		numeroBollinoVerde = val;
	}

	public java.lang.String getNumeroBollinoVerde() {
		return numeroBollinoVerde;
	}

	private java.lang.String idTipoAllegato = null;

	public void setIdTipoAllegato(java.lang.String val) {
		idTipoAllegato = val;
	}

	public java.lang.String getIdTipoAllegato() {
		return idTipoAllegato;
	}

	private java.lang.String siglaBollino = null;

	public void setSiglaBollino(java.lang.String val) {
		siglaBollino = val;
	}

	public java.lang.String getSiglaBollino() {
		return siglaBollino;
	}

	private java.lang.Integer idStatoRapporto = null;

	public void setIdStatoRapporto(java.lang.Integer val) {
		idStatoRapporto = val;
	}

	public java.lang.Integer getIdStatoRapporto() {
		return idStatoRapporto;
	}

	private java.lang.String idIspezIspet = null;

	public void setIdIspezIspet(java.lang.String val) {
		idIspezIspet = val;
	}

	public java.lang.String getIdIspezIspet() {
		return idIspezIspet;
	}

	private java.lang.String codiceImpianto = null;

	public void setCodiceImpianto(java.lang.String val) {
		codiceImpianto = val;
	}

	public java.lang.String getCodiceImpianto() {
		return codiceImpianto;
	}

	private java.lang.Integer flagControlloBozza = null;

	public void setFlagControlloBozza(java.lang.Integer val) {
		flagControlloBozza = val;
	}

	public java.lang.Integer getFlagControlloBozza() {
		return flagControlloBozza;
	}

	private java.lang.String codFiscaleUtenteLoggato = null;

	public void setCodFiscaleUtenteLoggato(java.lang.String val) {
		codFiscaleUtenteLoggato = val;
	}

	public java.lang.String getCodFiscaleUtenteLoggato() {
		return codFiscaleUtenteLoggato;
	}

	private java.lang.String arrivoDa = null;

	public void setArrivoDa(java.lang.String val) {
		arrivoDa = val;
	}

	public java.lang.String getArrivoDa() {
		return arrivoDa;
	}

	private java.util.ArrayList<java.lang.String> idTipiCombustibile = new java.util.ArrayList<java.lang.String>();

	public void setIdTipiCombustibile(java.util.ArrayList<java.lang.String> val) {
		idTipiCombustibile = val;
	}
	
	public java.util.ArrayList<java.lang.String> getIdTipiCombustibile() {
		return idTipiCombustibile;
	}

	private java.util.ArrayList<java.lang.String> idApparecchiature = new java.util.ArrayList<java.lang.String>();

	public void setIdApparecchiature(java.util.ArrayList<java.lang.String> val) {
		idApparecchiature = val;
	}

	public java.util.ArrayList<java.lang.String> getIdApparecchiature() {
		return idApparecchiature;
	}

	private java.util.ArrayList<java.lang.String> idApparecchiatureFunz = new java.util.ArrayList<java.lang.String>();

	public void setIdApparecchiatureFunz(java.util.ArrayList<java.lang.String> val) {
		idApparecchiatureFunz = val;
	}
	
	public java.util.ArrayList<java.lang.String> getIdApparecchiatureFunz() {
		return idApparecchiatureFunz;
	}

	private java.lang.String elencoCombustibili = null;

	public void setElencoCombustibili(java.lang.String val) {
		elencoCombustibili = val;
	}

	public java.lang.String getElencoCombustibili() {
		return elencoCombustibili;
	}

	private java.lang.String elencoApparecchiature = null;

	public void setElencoApparecchiature(java.lang.String val) {
		elencoApparecchiature = val;
	}

	public java.lang.String getElencoApparecchiature() {
		return elencoApparecchiature;
	}

	private java.lang.Integer idIspezione = null;

	public void setIdIspezione(java.lang.Integer val) {
		idIspezione = val;
	}

	public java.lang.Integer getIdIspezione() {
		return idIspezione;
	}

	private java.lang.String ruoloFunzionale = null;

	public void setRuoloFunzionale(java.lang.String val) {
		ruoloFunzionale = val;
	}

	public java.lang.String getRuoloFunzionale() {
		return ruoloFunzionale;
	}

	private SigitTPersonaGiuridicaDto personaGiuridica = null;

	public void setPersonaGiuridica(SigitTPersonaGiuridicaDto val) {
		personaGiuridica = val;
	}

	public SigitTPersonaGiuridicaDto getPersonaGiuridica() {
		return personaGiuridica;
	}

	private java.util.ArrayList<java.lang.String> idCom4Manut = new java.util.ArrayList<java.lang.String>();

	public void setIdCom4Manut(java.util.ArrayList<java.lang.String> val) {
		idCom4Manut = val;
	}

	public java.util.ArrayList<java.lang.String> getIdCom4Manut() {
		return idCom4Manut;
	}

	private java.lang.String codiceReaPg = null;

	public void setCodiceReaPg(java.lang.String val) {
		codiceReaPg = val;
	}

	public java.lang.String getCodiceReaPg() {
		return codiceReaPg;
	}

	private java.lang.String codiceFiscalePg = null;

	public void setCodiceFiscalePg(java.lang.String val) {
		codiceFiscalePg = val;
	}

	public java.lang.String getCodiceFiscalePg() {
		return codiceFiscalePg;
	}

	private java.lang.Integer idStatoPg = null;

	public void setIdStatoPg(java.lang.Integer val) {
		idStatoPg = val;
	}

	public java.lang.Integer getIdStatoPg() {
		return idStatoPg;
	}

	private java.lang.String codiceBollino = null;

	public void setCodiceBollino(java.lang.String val) {
		codiceBollino = val;
	}

	public java.lang.String getCodiceBollino() {
		return codiceBollino;
	}

	private java.lang.Integer idTipoRapProva = null;

	public void setIdTipoRapProva(java.lang.Integer val) {
		idTipoRapProva = val;
	}

	public java.lang.Integer getIdTipoRapProva() {
		return idTipoRapProva;
	}

	private java.lang.Integer idIspezione2018 = null;

	public void setIdIspezione2018(java.lang.Integer val) {
		idIspezione2018 = val;
	}

	public java.lang.Integer getIdIspezione2018() {
		return idIspezione2018;
	}

	private java.lang.String oraArrivo = null;

	public void setOraArrivo(java.lang.String val) {
		oraArrivo = val;
	}

	public java.lang.String getOraArrivo() {
		return oraArrivo;
	}

	private java.lang.String presenzaVerifica = null;

	public void setPresenzaVerifica(java.lang.String val) {
		presenzaVerifica = val;
	}

	public java.lang.String getPresenzaVerifica() {
		return presenzaVerifica;
	}

	private static final long serialVersionUID = 1L;

	public DettaglioAllegato() {
		super();

	}

	public String toString() {
		return super.toString();
	}
}
