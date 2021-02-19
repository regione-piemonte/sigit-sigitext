package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTPersonaGiuridicaDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTPersonaGiuridicaExample extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk denominazione;

	/**
	 * @generated
	 */
	public void setDenominazione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		denominazione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDenominazione() {
		return denominazione;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkL2;

	/**
	 * @generated
	 */
	public void setFkL2(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkL2 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkL2() {
		return fkL2;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk indirizzoSitad;

	/**
	 * @generated
	 */
	public void setIndirizzoSitad(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		indirizzoSitad = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIndirizzoSitad() {
		return indirizzoSitad;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk indirizzoNonTrovato;

	/**
	 * @generated
	 */
	public void setIndirizzoNonTrovato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		indirizzoNonTrovato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIndirizzoNonTrovato() {
		return indirizzoNonTrovato;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk siglaProv;

	/**
	 * @generated
	 */
	public void setSiglaProv(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		siglaProv = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getSiglaProv() {
		return siglaProv;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk istatComune;

	/**
	 * @generated
	 */
	public void setIstatComune(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		istatComune = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIstatComune() {
		return istatComune;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk comune;

	/**
	 * @generated
	 */
	public void setComune(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		comune = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getComune() {
		return comune;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk provincia;

	/**
	 * @generated
	 */
	public void setProvincia(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		provincia = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getProvincia() {
		return provincia;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk civico;

	/**
	 * @generated
	 */
	public void setCivico(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		civico = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCivico() {
		return civico;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk cap;

	/**
	 * @generated
	 */
	public void setCap(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		cap = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCap() {
		return cap;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk email;

	/**
	 * @generated
	 */
	public void setEmail(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		email = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEmail() {
		return email;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataInizioAttivita;

	/**
	 * @generated
	 */
	public void setDataInizioAttivita(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataInizioAttivita = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataInizioAttivita() {
		return dataInizioAttivita;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataCessazione;

	/**
	 * @generated
	 */
	public void setDataCessazione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataCessazione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataCessazione() {
		return dataCessazione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk siglaRea;

	/**
	 * @generated
	 */
	public void setSiglaRea(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		siglaRea = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getSiglaRea() {
		return siglaRea;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk numeroRea;

	/**
	 * @generated
	 */
	public void setNumeroRea(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		numeroRea = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getNumeroRea() {
		return numeroRea;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgAmministratore;

	/**
	 * @generated
	 */
	public void setFlgAmministratore(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgAmministratore = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgAmministratore() {
		return flgAmministratore;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgTerzoResponsabile;

	/**
	 * @generated
	 */
	public void setFlgTerzoResponsabile(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgTerzoResponsabile = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgTerzoResponsabile() {
		return flgTerzoResponsabile;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgDistributore;

	/**
	 * @generated
	 */
	public void setFlgDistributore(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgDistributore = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgDistributore() {
		return flgDistributore;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgCat;

	/**
	 * @generated
	 */
	public void setFlgCat(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgCat = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgCat() {
		return flgCat;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgIndirizzoEstero;

	/**
	 * @generated
	 */
	public void setFlgIndirizzoEstero(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgIndirizzoEstero = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgIndirizzoEstero() {
		return flgIndirizzoEstero;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk statoEstero;

	/**
	 * @generated
	 */
	public void setStatoEstero(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		statoEstero = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getStatoEstero() {
		return statoEstero;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk cittaEstero;

	/**
	 * @generated
	 */
	public void setCittaEstero(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		cittaEstero = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCittaEstero() {
		return cittaEstero;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk indirizzoEstero;

	/**
	 * @generated
	 */
	public void setIndirizzoEstero(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		indirizzoEstero = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIndirizzoEstero() {
		return indirizzoEstero;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk capEstero;

	/**
	 * @generated
	 */
	public void setCapEstero(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		capEstero = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCapEstero() {
		return capEstero;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkStatoPg;

	/**
	 * @generated
	 */
	public void setFkStatoPg(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkStatoPg = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkStatoPg() {
		return fkStatoPg;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dtAggDichiarazione;

	/**
	 * @generated
	 */
	public void setDtAggDichiarazione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dtAggDichiarazione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDtAggDichiarazione() {
		return dtAggDichiarazione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgDm37Letterac;

	/**
	 * @generated
	 */
	public void setFlgDm37Letterac(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgDm37Letterac = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgDm37Letterac() {
		return flgDm37Letterac;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgDm37Letterad;

	/**
	 * @generated
	 */
	public void setFlgDm37Letterad(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgDm37Letterad = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgDm37Letterad() {
		return flgDm37Letterad;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgDm37Letterae;

	/**
	 * @generated
	 */
	public void setFlgDm37Letterae(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgDm37Letterae = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgDm37Letterae() {
		return flgDm37Letterae;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgFgas;

	/**
	 * @generated
	 */
	public void setFlgFgas(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgFgas = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgFgas() {
		return flgFgas;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgConduttore;

	/**
	 * @generated
	 */
	public void setFlgConduttore(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgConduttore = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgConduttore() {
		return flgConduttore;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgSoggIncaricato;

	/**
	 * @generated
	 */
	public void setFlgSoggIncaricato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgSoggIncaricato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgSoggIncaricato() {
		return flgSoggIncaricato;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk delegaSoggIncaricato;

	/**
	 * @generated
	 */
	public void setDelegaSoggIncaricato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		delegaSoggIncaricato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDelegaSoggIncaricato() {
		return delegaSoggIncaricato;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dtCreazioneToken;

	/**
	 * @generated
	 */
	public void setDtCreazioneToken(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dtCreazioneToken = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDtCreazioneToken() {
		return dtCreazioneToken;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dtScadenzaToken;

	/**
	 * @generated
	 */
	public void setDtScadenzaToken(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dtScadenzaToken = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDtScadenzaToken() {
		return dtScadenzaToken;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk token;

	/**
	 * @generated
	 */
	public void setToken(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		token = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getToken() {
		return token;
	}

}
