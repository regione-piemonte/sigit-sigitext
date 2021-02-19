package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitVRicercaIspezioniDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitVRicercaIspezioniExample extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idIspezione2018;

	/**
	 * @generated
	 */
	public void setIdIspezione2018(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idIspezione2018 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdIspezione2018() {
		return idIspezione2018;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk codiceImpianto;

	/**
	 * @generated
	 */
	public void setCodiceImpianto(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		codiceImpianto = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCodiceImpianto() {
		return codiceImpianto;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idIspezIspet;

	/**
	 * @generated
	 */
	public void setIdIspezIspet(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idIspezIspet = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdIspezIspet() {
		return idIspezIspet;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkStatoIspezione;

	/**
	 * @generated
	 */
	public void setFkStatoIspezione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkStatoIspezione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkStatoIspezione() {
		return fkStatoIspezione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk desStatoIspezione;

	/**
	 * @generated
	 */
	public void setDesStatoIspezione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		desStatoIspezione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDesStatoIspezione() {
		return desStatoIspezione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk enteCompetente;

	/**
	 * @generated
	 */
	public void setEnteCompetente(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		enteCompetente = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEnteCompetente() {
		return enteCompetente;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dtCreazione;

	/**
	 * @generated
	 */
	public void setDtCreazione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dtCreazione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDtCreazione() {
		return dtCreazione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dtConclusione;

	/**
	 * @generated
	 */
	public void setDtConclusione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dtConclusione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDtConclusione() {
		return dtConclusione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgEsito;

	/**
	 * @generated
	 */
	public void setFlgEsito(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgEsito = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgEsito() {
		return flgEsito;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk note;

	/**
	 * @generated
	 */
	public void setNote(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		note = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getNote() {
		return note;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idAllegato;

	/**
	 * @generated
	 */
	public void setIdAllegato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idAllegato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdAllegato() {
		return idAllegato;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkStatoRapp;

	/**
	 * @generated
	 */
	public void setFkStatoRapp(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkStatoRapp = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkStatoRapp() {
		return fkStatoRapp;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk desStatoRapp;

	/**
	 * @generated
	 */
	public void setDesStatoRapp(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		desStatoRapp = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDesStatoRapp() {
		return desStatoRapp;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkTipoDocumento;

	/**
	 * @generated
	 */
	public void setFkTipoDocumento(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkTipoDocumento = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkTipoDocumento() {
		return fkTipoDocumento;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk desTipoDocumento;

	/**
	 * @generated
	 */
	public void setDesTipoDocumento(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		desTipoDocumento = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDesTipoDocumento() {
		return desTipoDocumento;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkSiglaBollino;

	/**
	 * @generated
	 */
	public void setFkSiglaBollino(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkSiglaBollino = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkSiglaBollino() {
		return fkSiglaBollino;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkNumeroBollino;

	/**
	 * @generated
	 */
	public void setFkNumeroBollino(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkNumeroBollino = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkNumeroBollino() {
		return fkNumeroBollino;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataControllo;

	/**
	 * @generated
	 */
	public void setDataControllo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataControllo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataControllo() {
		return dataControllo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk bFlgLibrettoUso;

	/**
	 * @generated
	 */
	public void setBFlgLibrettoUso(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		bFlgLibrettoUso = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getBFlgLibrettoUso() {
		return bFlgLibrettoUso;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk bFlgDichiarConform;

	/**
	 * @generated
	 */
	public void setBFlgDichiarConform(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		bFlgDichiarConform = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getBFlgDichiarConform() {
		return bFlgDichiarConform;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk bFlgLibImp;

	/**
	 * @generated
	 */
	public void setBFlgLibImp(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		bFlgLibImp = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getBFlgLibImp() {
		return bFlgLibImp;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk bFlgLibCompl;

	/**
	 * @generated
	 */
	public void setBFlgLibCompl(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		bFlgLibCompl = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getBFlgLibCompl() {
		return bFlgLibCompl;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fOsservazioni;

	/**
	 * @generated
	 */
	public void setFOsservazioni(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fOsservazioni = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFOsservazioni() {
		return fOsservazioni;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fRaccomandazioni;

	/**
	 * @generated
	 */
	public void setFRaccomandazioni(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fRaccomandazioni = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFRaccomandazioni() {
		return fRaccomandazioni;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fPrescrizioni;

	/**
	 * @generated
	 */
	public void setFPrescrizioni(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fPrescrizioni = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFPrescrizioni() {
		return fPrescrizioni;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgPuoFunzionare;

	/**
	 * @generated
	 */
	public void setFFlgPuoFunzionare(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgPuoFunzionare = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgPuoFunzionare() {
		return fFlgPuoFunzionare;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fInterventoEntro;

	/**
	 * @generated
	 */
	public void setFInterventoEntro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fInterventoEntro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFInterventoEntro() {
		return fInterventoEntro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fOraArrivo;

	/**
	 * @generated
	 */
	public void setFOraArrivo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fOraArrivo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFOraArrivo() {
		return fOraArrivo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fOraPartenza;

	/**
	 * @generated
	 */
	public void setFOraPartenza(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fOraPartenza = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFOraPartenza() {
		return fOraPartenza;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fDenominazTecnico;

	/**
	 * @generated
	 */
	public void setFDenominazTecnico(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fDenominazTecnico = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFDenominazTecnico() {
		return fDenominazTecnico;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgFirmaTecnico;

	/**
	 * @generated
	 */
	public void setFFlgFirmaTecnico(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgFirmaTecnico = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgFirmaTecnico() {
		return fFlgFirmaTecnico;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgFirmaResponsabile;

	/**
	 * @generated
	 */
	public void setFFlgFirmaResponsabile(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgFirmaResponsabile = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgFirmaResponsabile() {
		return fFlgFirmaResponsabile;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataInvio;

	/**
	 * @generated
	 */
	public void setDataInvio(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataInvio = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataInvio() {
		return dataInvio;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk nomeAllegato;

	/**
	 * @generated
	 */
	public void setNomeAllegato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		nomeAllegato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getNomeAllegato() {
		return nomeAllegato;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataUltModAllegato;

	/**
	 * @generated
	 */
	public void setDataUltModAllegato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataUltModAllegato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataUltModAllegato() {
		return dataUltModAllegato;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk utenteUltModAllegato;

	/**
	 * @generated
	 */
	public void setUtenteUltModAllegato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		utenteUltModAllegato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getUtenteUltModAllegato() {
		return utenteUltModAllegato;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk cfRedattore;

	/**
	 * @generated
	 */
	public void setCfRedattore(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		cfRedattore = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCfRedattore() {
		return cfRedattore;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk uidIndex;

	/**
	 * @generated
	 */
	public void setUidIndex(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		uidIndex = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getUidIndex() {
		return uidIndex;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFirmaTecnico;

	/**
	 * @generated
	 */
	public void setFFirmaTecnico(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFirmaTecnico = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFirmaTecnico() {
		return fFirmaTecnico;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFirmaResponsabile;

	/**
	 * @generated
	 */
	public void setFFirmaResponsabile(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFirmaResponsabile = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFirmaResponsabile() {
		return fFirmaResponsabile;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgControlloBozza;

	/**
	 * @generated
	 */
	public void setFlgControlloBozza(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgControlloBozza = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgControlloBozza() {
		return flgControlloBozza;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk aPotenzaTermicaNominaleMax;

	/**
	 * @generated
	 */
	public void setAPotenzaTermicaNominaleMax(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		aPotenzaTermicaNominaleMax = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getAPotenzaTermicaNominaleMax() {
		return aPotenzaTermicaNominaleMax;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk elencoCombustibili;

	/**
	 * @generated
	 */
	public void setElencoCombustibili(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		elencoCombustibili = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getElencoCombustibili() {
		return elencoCombustibili;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk elencoApparecchiature;

	/**
	 * @generated
	 */
	public void setElencoApparecchiature(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		elencoApparecchiature = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getElencoApparecchiature() {
		return elencoApparecchiature;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idPersonaFisica;

	/**
	 * @generated
	 */
	public void setIdPersonaFisica(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idPersonaFisica = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdPersonaFisica() {
		return idPersonaFisica;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk nome;

	/**
	 * @generated
	 */
	public void setNome(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		nome = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getNome() {
		return nome;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk cognome;

	/**
	 * @generated
	 */
	public void setCognome(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		cognome = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCognome() {
		return cognome;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk codiceFiscale;

	/**
	 * @generated
	 */
	public void setCodiceFiscale(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		codiceFiscale = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCodiceFiscale() {
		return codiceFiscale;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk istatProvCompetenza;

	/**
	 * @generated
	 */
	public void setIstatProvCompetenza(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		istatProvCompetenza = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIstatProvCompetenza() {
		return istatProvCompetenza;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgAccSostitutivo;

	/**
	 * @generated
	 */
	public void setFlgAccSostitutivo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgAccSostitutivo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgAccSostitutivo() {
		return flgAccSostitutivo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk cfIspettoreSecondario;

	/**
	 * @generated
	 */
	public void setCfIspettoreSecondario(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		cfIspettoreSecondario = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCfIspettoreSecondario() {
		return cfIspettoreSecondario;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgIspPagamento;

	/**
	 * @generated
	 */
	public void setFlgIspPagamento(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgIspPagamento = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgIspPagamento() {
		return flgIspPagamento;
	}

}
