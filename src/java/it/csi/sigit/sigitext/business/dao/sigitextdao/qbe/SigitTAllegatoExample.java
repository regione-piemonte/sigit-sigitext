package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTAllegatoDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTAllegatoExample extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataUltMod;

	/**
	 * @generated
	 */
	public void setDataUltMod(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataUltMod = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataUltMod() {
		return dataUltMod;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk utenteUltMod;

	/**
	 * @generated
	 */
	public void setUtenteUltMod(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		utenteUltMod = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getUtenteUltMod() {
		return utenteUltMod;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataRespinta;

	/**
	 * @generated
	 */
	public void setDataRespinta(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataRespinta = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataRespinta() {
		return dataRespinta;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk motivoRespinta;

	/**
	 * @generated
	 */
	public void setMotivoRespinta(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		motivoRespinta = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getMotivoRespinta() {
		return motivoRespinta;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkPgCat;

	/**
	 * @generated
	 */
	public void setFkPgCat(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkPgCat = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkPgCat() {
		return fkPgCat;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk abcdfControlloweb;

	/**
	 * @generated
	 */
	public void setAbcdfControlloweb(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		abcdfControlloweb = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getAbcdfControlloweb() {
		return abcdfControlloweb;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkTipoManutenzione;

	/**
	 * @generated
	 */
	public void setFkTipoManutenzione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkTipoManutenzione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkTipoManutenzione() {
		return fkTipoManutenzione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk altroDescr;

	/**
	 * @generated
	 */
	public void setAltroDescr(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		altroDescr = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getAltroDescr() {
		return altroDescr;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkIspezIspet;

	/**
	 * @generated
	 */
	public void setFkIspezIspet(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkIspezIspet = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkIspezIspet() {
		return fkIspezIspet;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dtInvioMemo;

	/**
	 * @generated
	 */
	public void setDtInvioMemo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dtInvioMemo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDtInvioMemo() {
		return dtInvioMemo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk mailInvioMemo;

	/**
	 * @generated
	 */
	public void setMailInvioMemo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		mailInvioMemo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getMailInvioMemo() {
		return mailInvioMemo;
	}

}
