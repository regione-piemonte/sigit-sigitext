package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTPersonaFisicaDao.
 * @generated
 */
public class SigitTPersonaFisicaDto extends SigitTPersonaFisicaPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna NOME
	 * @generated
	 */
	protected String nome;

	/**
	 * Imposta il valore della proprieta' nome associata alla
	 * colonna NOME.
	 * @generated
	 */
	public void setNome(String val) {

		nome = val;

	}

	/**
	 * Legge il valore della proprieta' nome associata alla
	 * @generated
	 */
	public String getNome() {

		return nome;

	}

	/**
	 * store della proprieta' associata alla colonna COGNOME
	 * @generated
	 */
	protected String cognome;

	/**
	 * Imposta il valore della proprieta' cognome associata alla
	 * colonna COGNOME.
	 * @generated
	 */
	public void setCognome(String val) {

		cognome = val;

	}

	/**
	 * Legge il valore della proprieta' cognome associata alla
	 * @generated
	 */
	public String getCognome() {

		return cognome;

	}

	/**
	 * store della proprieta' associata alla colonna CODICE_FISCALE
	 * @generated
	 */
	protected String codiceFiscale;

	/**
	 * Imposta il valore della proprieta' codiceFiscale associata alla
	 * colonna CODICE_FISCALE.
	 * @generated
	 */
	public void setCodiceFiscale(String val) {

		codiceFiscale = val;

	}

	/**
	 * Legge il valore della proprieta' codiceFiscale associata alla
	 * @generated
	 */
	public String getCodiceFiscale() {

		return codiceFiscale;

	}

	/**
	 * store della proprieta' associata alla colonna FK_L2
	 * @generated
	 */
	protected java.math.BigDecimal fkL2;

	/**
	 * Imposta il valore della proprieta' fkL2 associata alla
	 * colonna FK_L2.
	 * @generated
	 */
	public void setFkL2(java.math.BigDecimal val) {

		fkL2 = val;

	}

	/**
	 * Legge il valore della proprieta' fkL2 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkL2() {

		return fkL2;

	}

	/**
	 * store della proprieta' associata alla colonna INDIRIZZO_SITAD
	 * @generated
	 */
	protected String indirizzoSitad;

	/**
	 * Imposta il valore della proprieta' indirizzoSitad associata alla
	 * colonna INDIRIZZO_SITAD.
	 * @generated
	 */
	public void setIndirizzoSitad(String val) {

		indirizzoSitad = val;

	}

	/**
	 * Legge il valore della proprieta' indirizzoSitad associata alla
	 * @generated
	 */
	public String getIndirizzoSitad() {

		return indirizzoSitad;

	}

	/**
	 * store della proprieta' associata alla colonna INDIRIZZO_NON_TROVATO
	 * @generated
	 */
	protected String indirizzoNonTrovato;

	/**
	 * Imposta il valore della proprieta' indirizzoNonTrovato associata alla
	 * colonna INDIRIZZO_NON_TROVATO.
	 * @generated
	 */
	public void setIndirizzoNonTrovato(String val) {

		indirizzoNonTrovato = val;

	}

	/**
	 * Legge il valore della proprieta' indirizzoNonTrovato associata alla
	 * @generated
	 */
	public String getIndirizzoNonTrovato() {

		return indirizzoNonTrovato;

	}

	/**
	 * store della proprieta' associata alla colonna ISTAT_COMUNE
	 * @generated
	 */
	protected String istatComune;

	/**
	 * Imposta il valore della proprieta' istatComune associata alla
	 * colonna ISTAT_COMUNE.
	 * @generated
	 */
	public void setIstatComune(String val) {

		istatComune = val;

	}

	/**
	 * Legge il valore della proprieta' istatComune associata alla
	 * @generated
	 */
	public String getIstatComune() {

		return istatComune;

	}

	/**
	 * store della proprieta' associata alla colonna SIGLA_PROV
	 * @generated
	 */
	protected String siglaProv;

	/**
	 * Imposta il valore della proprieta' siglaProv associata alla
	 * colonna SIGLA_PROV.
	 * @generated
	 */
	public void setSiglaProv(String val) {

		siglaProv = val;

	}

	/**
	 * Legge il valore della proprieta' siglaProv associata alla
	 * @generated
	 */
	public String getSiglaProv() {

		return siglaProv;

	}

	/**
	 * store della proprieta' associata alla colonna COMUNE
	 * @generated
	 */
	protected String comune;

	/**
	 * Imposta il valore della proprieta' comune associata alla
	 * colonna COMUNE.
	 * @generated
	 */
	public void setComune(String val) {

		comune = val;

	}

	/**
	 * Legge il valore della proprieta' comune associata alla
	 * @generated
	 */
	public String getComune() {

		return comune;

	}

	/**
	 * store della proprieta' associata alla colonna PROVINCIA
	 * @generated
	 */
	protected String provincia;

	/**
	 * Imposta il valore della proprieta' provincia associata alla
	 * colonna PROVINCIA.
	 * @generated
	 */
	public void setProvincia(String val) {

		provincia = val;

	}

	/**
	 * Legge il valore della proprieta' provincia associata alla
	 * @generated
	 */
	public String getProvincia() {

		return provincia;

	}

	/**
	 * store della proprieta' associata alla colonna CIVICO
	 * @generated
	 */
	protected String civico;

	/**
	 * Imposta il valore della proprieta' civico associata alla
	 * colonna CIVICO.
	 * @generated
	 */
	public void setCivico(String val) {

		civico = val;

	}

	/**
	 * Legge il valore della proprieta' civico associata alla
	 * @generated
	 */
	public String getCivico() {

		return civico;

	}

	/**
	 * store della proprieta' associata alla colonna CAP
	 * @generated
	 */
	protected String cap;

	/**
	 * Imposta il valore della proprieta' cap associata alla
	 * colonna CAP.
	 * @generated
	 */
	public void setCap(String val) {

		cap = val;

	}

	/**
	 * Legge il valore della proprieta' cap associata alla
	 * @generated
	 */
	public String getCap() {

		return cap;

	}

	/**
	 * store della proprieta' associata alla colonna EMAIL
	 * @generated
	 */
	protected String email;

	/**
	 * Imposta il valore della proprieta' email associata alla
	 * colonna EMAIL.
	 * @generated
	 */
	public void setEmail(String val) {

		email = val;

	}

	/**
	 * Legge il valore della proprieta' email associata alla
	 * @generated
	 */
	public String getEmail() {

		return email;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_ACCREDITATO
	 * @generated
	 */
	protected String flgAccreditato;

	/**
	 * Imposta il valore della proprieta' flgAccreditato associata alla
	 * colonna FLG_ACCREDITATO.
	 * @generated
	 */
	public void setFlgAccreditato(String val) {

		flgAccreditato = val;

	}

	/**
	 * Legge il valore della proprieta' flgAccreditato associata alla
	 * @generated
	 */
	public String getFlgAccreditato() {

		return flgAccreditato;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_ULT_MOD
	 * @generated
	 */
	protected java.sql.Timestamp dataUltMod;

	/**
	 * Imposta il valore della proprieta' dataUltMod associata alla
	 * colonna DATA_ULT_MOD.
	 * @generated
	 */
	public void setDataUltMod(java.sql.Timestamp val) {

		if (val != null) {
			dataUltMod = new java.sql.Timestamp(val.getTime());
		} else {
			dataUltMod = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataUltMod associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDataUltMod() {

		if (dataUltMod != null) {
			return new java.sql.Timestamp(dataUltMod.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna UTENTE_ULT_MOD
	 * @generated
	 */
	protected String utenteUltMod;

	/**
	 * Imposta il valore della proprieta' utenteUltMod associata alla
	 * colonna UTENTE_ULT_MOD.
	 * @generated
	 */
	public void setUtenteUltMod(String val) {

		utenteUltMod = val;

	}

	/**
	 * Legge il valore della proprieta' utenteUltMod associata alla
	 * @generated
	 */
	public String getUtenteUltMod() {

		return utenteUltMod;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_INDIRIZZO_ESTERO
	 * @generated
	 */
	protected java.math.BigDecimal flgIndirizzoEstero;

	/**
	 * Imposta il valore della proprieta' flgIndirizzoEstero associata alla
	 * colonna FLG_INDIRIZZO_ESTERO.
	 * @generated
	 */
	public void setFlgIndirizzoEstero(java.math.BigDecimal val) {

		flgIndirizzoEstero = val;

	}

	/**
	 * Legge il valore della proprieta' flgIndirizzoEstero associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgIndirizzoEstero() {

		return flgIndirizzoEstero;

	}

	/**
	 * store della proprieta' associata alla colonna STATO_ESTERO
	 * @generated
	 */
	protected String statoEstero;

	/**
	 * Imposta il valore della proprieta' statoEstero associata alla
	 * colonna STATO_ESTERO.
	 * @generated
	 */
	public void setStatoEstero(String val) {

		statoEstero = val;

	}

	/**
	 * Legge il valore della proprieta' statoEstero associata alla
	 * @generated
	 */
	public String getStatoEstero() {

		return statoEstero;

	}

	/**
	 * store della proprieta' associata alla colonna CITTA_ESTERO
	 * @generated
	 */
	protected String cittaEstero;

	/**
	 * Imposta il valore della proprieta' cittaEstero associata alla
	 * colonna CITTA_ESTERO.
	 * @generated
	 */
	public void setCittaEstero(String val) {

		cittaEstero = val;

	}

	/**
	 * Legge il valore della proprieta' cittaEstero associata alla
	 * @generated
	 */
	public String getCittaEstero() {

		return cittaEstero;

	}

	/**
	 * store della proprieta' associata alla colonna INDIRIZZO_ESTERO
	 * @generated
	 */
	protected String indirizzoEstero;

	/**
	 * Imposta il valore della proprieta' indirizzoEstero associata alla
	 * colonna INDIRIZZO_ESTERO.
	 * @generated
	 */
	public void setIndirizzoEstero(String val) {

		indirizzoEstero = val;

	}

	/**
	 * Legge il valore della proprieta' indirizzoEstero associata alla
	 * @generated
	 */
	public String getIndirizzoEstero() {

		return indirizzoEstero;

	}

	/**
	 * store della proprieta' associata alla colonna CAP_ESTERO
	 * @generated
	 */
	protected String capEstero;

	/**
	 * Imposta il valore della proprieta' capEstero associata alla
	 * colonna CAP_ESTERO.
	 * @generated
	 */
	public void setCapEstero(String val) {

		capEstero = val;

	}

	/**
	 * Legge il valore della proprieta' capEstero associata alla
	 * @generated
	 */
	public String getCapEstero() {

		return capEstero;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_NEWSLETTER
	 * @generated
	 */
	protected java.math.BigDecimal flgNewsletter;

	/**
	 * Imposta il valore della proprieta' flgNewsletter associata alla
	 * colonna FLG_NEWSLETTER.
	 * @generated
	 */
	public void setFlgNewsletter(java.math.BigDecimal val) {

		flgNewsletter = val;

	}

	/**
	 * Legge il valore della proprieta' flgNewsletter associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgNewsletter() {

		return flgNewsletter;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_GDPR
	 * @generated
	 */
	protected java.math.BigDecimal flgGdpr;

	/**
	 * Imposta il valore della proprieta' flgGdpr associata alla
	 * colonna FLG_GDPR.
	 * @generated
	 */
	public void setFlgGdpr(java.math.BigDecimal val) {

		flgGdpr = val;

	}

	/**
	 * Legge il valore della proprieta' flgGdpr associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgGdpr() {

		return flgGdpr;

	}

	/**
	 * Crea una istanza di SigitTPersonaFisicaPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTPersonaFisicaPk
	 * @generated
	 */
	public SigitTPersonaFisicaPk createPk() {
		return new SigitTPersonaFisicaPk(idPersonaFisica);
	}

	/**
	 * la semantica dell'equals del DTO e' la stessa della PK
	 * (ovvero della superclasse).
	 * @param other l'oggetto con cui effettuare il confronto
	 * @return true se i due oggetti sono semanticamente da considerarsi uguali
	 */
	public boolean equals(Object other) {
		return super.equals(other);
	}

	/**
	 * la semantica dell'hashCode del DTO e' la stessa della PK
	 * (ovvero della superclasse).
	 * 
	 * @return int
	 */
	public int hashCode() {
		return super.hashCode();
	}

}
