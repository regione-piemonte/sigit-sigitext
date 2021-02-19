package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTPersonaFisicaDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTPersonaFisicaExample extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgAccreditato;

	/**
	 * @generated
	 */
	public void setFlgAccreditato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgAccreditato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgAccreditato() {
		return flgAccreditato;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgNewsletter;

	/**
	 * @generated
	 */
	public void setFlgNewsletter(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgNewsletter = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgNewsletter() {
		return flgNewsletter;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgGdpr;

	/**
	 * @generated
	 */
	public void setFlgGdpr(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgGdpr = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgGdpr() {
		return flgGdpr;
	}

}
