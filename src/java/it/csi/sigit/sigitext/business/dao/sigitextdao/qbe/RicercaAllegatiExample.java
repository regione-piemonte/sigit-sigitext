package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [RicercaAllegatiDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class RicercaAllegatiExample extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk desRuolo;

	/**
	 * @generated
	 */
	public void setDesRuolo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		desRuolo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDesRuolo() {
		return desRuolo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk ruoloFunz;

	/**
	 * @generated
	 */
	public void setRuoloFunz(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		ruoloFunz = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getRuoloFunz() {
		return ruoloFunz;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idPersonaGiuridica;

	/**
	 * @generated
	 */
	public void setIdPersonaGiuridica(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idPersonaGiuridica = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdPersonaGiuridica() {
		return idPersonaGiuridica;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk pgDenominazione;

	/**
	 * @generated
	 */
	public void setPgDenominazione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		pgDenominazione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getPgDenominazione() {
		return pgDenominazione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk pgCodiceFiscale;

	/**
	 * @generated
	 */
	public void setPgCodiceFiscale(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		pgCodiceFiscale = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getPgCodiceFiscale() {
		return pgCodiceFiscale;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk pgSiglaRea;

	/**
	 * @generated
	 */
	public void setPgSiglaRea(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		pgSiglaRea = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getPgSiglaRea() {
		return pgSiglaRea;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk pgNumeroRea;

	/**
	 * @generated
	 */
	public void setPgNumeroRea(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		pgNumeroRea = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getPgNumeroRea() {
		return pgNumeroRea;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk comuneImpianto;

	/**
	 * @generated
	 */
	public void setComuneImpianto(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		comuneImpianto = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getComuneImpianto() {
		return comuneImpianto;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk siglaProvImpianto;

	/**
	 * @generated
	 */
	public void setSiglaProvImpianto(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		siglaProvImpianto = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getSiglaProvImpianto() {
		return siglaProvImpianto;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk indirizzoUnitaImmob;

	/**
	 * @generated
	 */
	public void setIndirizzoUnitaImmob(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		indirizzoUnitaImmob = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIndirizzoUnitaImmob() {
		return indirizzoUnitaImmob;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk civicoUnitaImmob;

	/**
	 * @generated
	 */
	public void setCivicoUnitaImmob(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		civicoUnitaImmob = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCivicoUnitaImmob() {
		return civicoUnitaImmob;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk pgFkStatoPg;

	/**
	 * @generated
	 */
	public void setPgFkStatoPg(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		pgFkStatoPg = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getPgFkStatoPg() {
		return pgFkStatoPg;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idTipoManutenzione;

	/**
	 * @generated
	 */
	public void setIdTipoManutenzione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idTipoManutenzione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdTipoManutenzione() {
		return idTipoManutenzione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk desTipoManutenzione;

	/**
	 * @generated
	 */
	public void setDesTipoManutenzione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		desTipoManutenzione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDesTipoManutenzione() {
		return desTipoManutenzione;
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

}
