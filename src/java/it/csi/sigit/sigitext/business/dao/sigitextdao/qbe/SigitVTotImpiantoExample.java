package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitVTotImpiantoDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitVTotImpiantoExample extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk denominazioneProvincia;

	/**
	 * @generated
	 */
	public void setDenominazioneProvincia(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		denominazioneProvincia = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDenominazioneProvincia() {
		return denominazioneProvincia;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk siglaProvincia;

	/**
	 * @generated
	 */
	public void setSiglaProvincia(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		siglaProvincia = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getSiglaProvincia() {
		return siglaProvincia;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk denominazioneComune;

	/**
	 * @generated
	 */
	public void setDenominazioneComune(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		denominazioneComune = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDenominazioneComune() {
		return denominazioneComune;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgPrincipale;

	/**
	 * @generated
	 */
	public void setFlgPrincipale(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgPrincipale = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgPrincipale() {
		return flgPrincipale;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk pfPg;

	/**
	 * @generated
	 */
	public void setPfPg(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		pfPg = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getPfPg() {
		return pfPg;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idRuolo;

	/**
	 * @generated
	 */
	public void setIdRuolo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idRuolo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdRuolo() {
		return idRuolo;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idImpRuoloPfpg;

	/**
	 * @generated
	 */
	public void setIdImpRuoloPfpg(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idImpRuoloPfpg = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdImpRuoloPfpg() {
		return idImpRuoloPfpg;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataInizioPfpg;

	/**
	 * @generated
	 */
	public void setDataInizioPfpg(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataInizioPfpg = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataInizioPfpg() {
		return dataInizioPfpg;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataFinePfpg;

	/**
	 * @generated
	 */
	public void setDataFinePfpg(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataFinePfpg = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataFinePfpg() {
		return dataFinePfpg;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgVisuProprietario;

	/**
	 * @generated
	 */
	public void setFlgVisuProprietario(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgVisuProprietario = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgVisuProprietario() {
		return flgVisuProprietario;
	}

}
