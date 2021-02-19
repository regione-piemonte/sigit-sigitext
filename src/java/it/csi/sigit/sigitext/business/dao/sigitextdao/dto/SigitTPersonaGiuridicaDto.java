package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTPersonaGiuridicaDao.
 * @generated
 */
public class SigitTPersonaGiuridicaDto extends SigitTPersonaGiuridicaPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna DENOMINAZIONE
	 * @generated
	 */
	protected String denominazione;

	/**
	 * Imposta il valore della proprieta' denominazione associata alla
	 * colonna DENOMINAZIONE.
	 * @generated
	 */
	public void setDenominazione(String val) {

		denominazione = val;

	}

	/**
	 * Legge il valore della proprieta' denominazione associata alla
	 * @generated
	 */
	public String getDenominazione() {

		return denominazione;

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
	 * store della proprieta' associata alla colonna DATA_INIZIO_ATTIVITA
	 * @generated
	 */
	protected java.sql.Date dataInizioAttivita;

	/**
	 * Imposta il valore della proprieta' dataInizioAttivita associata alla
	 * colonna DATA_INIZIO_ATTIVITA.
	 * @generated
	 */
	public void setDataInizioAttivita(java.sql.Date val) {

		if (val != null) {
			dataInizioAttivita = new java.sql.Date(val.getTime());
		} else {
			dataInizioAttivita = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataInizioAttivita associata alla
	 * @generated
	 */
	public java.sql.Date getDataInizioAttivita() {

		if (dataInizioAttivita != null) {
			return new java.sql.Date(dataInizioAttivita.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna DATA_CESSAZIONE
	 * @generated
	 */
	protected java.sql.Date dataCessazione;

	/**
	 * Imposta il valore della proprieta' dataCessazione associata alla
	 * colonna DATA_CESSAZIONE.
	 * @generated
	 */
	public void setDataCessazione(java.sql.Date val) {

		if (val != null) {
			dataCessazione = new java.sql.Date(val.getTime());
		} else {
			dataCessazione = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataCessazione associata alla
	 * @generated
	 */
	public java.sql.Date getDataCessazione() {

		if (dataCessazione != null) {
			return new java.sql.Date(dataCessazione.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna SIGLA_REA
	 * @generated
	 */
	protected String siglaRea;

	/**
	 * Imposta il valore della proprieta' siglaRea associata alla
	 * colonna SIGLA_REA.
	 * @generated
	 */
	public void setSiglaRea(String val) {

		siglaRea = val;

	}

	/**
	 * Legge il valore della proprieta' siglaRea associata alla
	 * @generated
	 */
	public String getSiglaRea() {

		return siglaRea;

	}

	/**
	 * store della proprieta' associata alla colonna NUMERO_REA
	 * @generated
	 */
	protected java.math.BigDecimal numeroRea;

	/**
	 * Imposta il valore della proprieta' numeroRea associata alla
	 * colonna NUMERO_REA.
	 * @generated
	 */
	public void setNumeroRea(java.math.BigDecimal val) {

		numeroRea = val;

	}

	/**
	 * Legge il valore della proprieta' numeroRea associata alla
	 * @generated
	 */
	public java.math.BigDecimal getNumeroRea() {

		return numeroRea;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_AMMINISTRATORE
	 * @generated
	 */
	protected java.math.BigDecimal flgAmministratore;

	/**
	 * Imposta il valore della proprieta' flgAmministratore associata alla
	 * colonna FLG_AMMINISTRATORE.
	 * @generated
	 */
	public void setFlgAmministratore(java.math.BigDecimal val) {

		flgAmministratore = val;

	}

	/**
	 * Legge il valore della proprieta' flgAmministratore associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgAmministratore() {

		return flgAmministratore;

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
	 * store della proprieta' associata alla colonna FLG_TERZO_RESPONSABILE
	 * @generated
	 */
	protected java.math.BigDecimal flgTerzoResponsabile;

	/**
	 * Imposta il valore della proprieta' flgTerzoResponsabile associata alla
	 * colonna FLG_TERZO_RESPONSABILE.
	 * @generated
	 */
	public void setFlgTerzoResponsabile(java.math.BigDecimal val) {

		flgTerzoResponsabile = val;

	}

	/**
	 * Legge il valore della proprieta' flgTerzoResponsabile associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgTerzoResponsabile() {

		return flgTerzoResponsabile;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_DISTRIBUTORE
	 * @generated
	 */
	protected java.math.BigDecimal flgDistributore;

	/**
	 * Imposta il valore della proprieta' flgDistributore associata alla
	 * colonna FLG_DISTRIBUTORE.
	 * @generated
	 */
	public void setFlgDistributore(java.math.BigDecimal val) {

		flgDistributore = val;

	}

	/**
	 * Legge il valore della proprieta' flgDistributore associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgDistributore() {

		return flgDistributore;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_CAT
	 * @generated
	 */
	protected java.math.BigDecimal flgCat;

	/**
	 * Imposta il valore della proprieta' flgCat associata alla
	 * colonna FLG_CAT.
	 * @generated
	 */
	public void setFlgCat(java.math.BigDecimal val) {

		flgCat = val;

	}

	/**
	 * Legge il valore della proprieta' flgCat associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgCat() {

		return flgCat;

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
	 * store della proprieta' associata alla colonna FK_STATO_PG
	 * @generated
	 */
	protected Integer fkStatoPg;

	/**
	 * Imposta il valore della proprieta' fkStatoPg associata alla
	 * colonna FK_STATO_PG.
	 * @generated
	 */
	public void setFkStatoPg(Integer val) {

		fkStatoPg = val;

	}

	/**
	 * Legge il valore della proprieta' fkStatoPg associata alla
	 * @generated
	 */
	public Integer getFkStatoPg() {

		return fkStatoPg;

	}

	/**
	 * store della proprieta' associata alla colonna DT_AGG_DICHIARAZIONE
	 * @generated
	 */
	protected java.sql.Timestamp dtAggDichiarazione;

	/**
	 * Imposta il valore della proprieta' dtAggDichiarazione associata alla
	 * colonna DT_AGG_DICHIARAZIONE.
	 * @generated
	 */
	public void setDtAggDichiarazione(java.sql.Timestamp val) {

		if (val != null) {
			dtAggDichiarazione = new java.sql.Timestamp(val.getTime());
		} else {
			dtAggDichiarazione = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dtAggDichiarazione associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDtAggDichiarazione() {

		if (dtAggDichiarazione != null) {
			return new java.sql.Timestamp(dtAggDichiarazione.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna FLG_DM37_LETTERAC
	 * @generated
	 */
	protected java.math.BigDecimal flgDm37Letterac;

	/**
	 * Imposta il valore della proprieta' flgDm37Letterac associata alla
	 * colonna FLG_DM37_LETTERAC.
	 * @generated
	 */
	public void setFlgDm37Letterac(java.math.BigDecimal val) {

		flgDm37Letterac = val;

	}

	/**
	 * Legge il valore della proprieta' flgDm37Letterac associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgDm37Letterac() {

		return flgDm37Letterac;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_DM37_LETTERAD
	 * @generated
	 */
	protected java.math.BigDecimal flgDm37Letterad;

	/**
	 * Imposta il valore della proprieta' flgDm37Letterad associata alla
	 * colonna FLG_DM37_LETTERAD.
	 * @generated
	 */
	public void setFlgDm37Letterad(java.math.BigDecimal val) {

		flgDm37Letterad = val;

	}

	/**
	 * Legge il valore della proprieta' flgDm37Letterad associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgDm37Letterad() {

		return flgDm37Letterad;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_DM37_LETTERAE
	 * @generated
	 */
	protected java.math.BigDecimal flgDm37Letterae;

	/**
	 * Imposta il valore della proprieta' flgDm37Letterae associata alla
	 * colonna FLG_DM37_LETTERAE.
	 * @generated
	 */
	public void setFlgDm37Letterae(java.math.BigDecimal val) {

		flgDm37Letterae = val;

	}

	/**
	 * Legge il valore della proprieta' flgDm37Letterae associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgDm37Letterae() {

		return flgDm37Letterae;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_FGAS
	 * @generated
	 */
	protected java.math.BigDecimal flgFgas;

	/**
	 * Imposta il valore della proprieta' flgFgas associata alla
	 * colonna FLG_FGAS.
	 * @generated
	 */
	public void setFlgFgas(java.math.BigDecimal val) {

		flgFgas = val;

	}

	/**
	 * Legge il valore della proprieta' flgFgas associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgFgas() {

		return flgFgas;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_CONDUTTORE
	 * @generated
	 */
	protected java.math.BigDecimal flgConduttore;

	/**
	 * Imposta il valore della proprieta' flgConduttore associata alla
	 * colonna FLG_CONDUTTORE.
	 * @generated
	 */
	public void setFlgConduttore(java.math.BigDecimal val) {

		flgConduttore = val;

	}

	/**
	 * Legge il valore della proprieta' flgConduttore associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgConduttore() {

		return flgConduttore;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_SOGG_INCARICATO
	 * @generated
	 */
	protected java.math.BigDecimal flgSoggIncaricato;

	/**
	 * Imposta il valore della proprieta' flgSoggIncaricato associata alla
	 * colonna FLG_SOGG_INCARICATO.
	 * @generated
	 */
	public void setFlgSoggIncaricato(java.math.BigDecimal val) {

		flgSoggIncaricato = val;

	}

	/**
	 * Legge il valore della proprieta' flgSoggIncaricato associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgSoggIncaricato() {

		return flgSoggIncaricato;

	}

	/**
	 * store della proprieta' associata alla colonna DELEGA_SOGG_INCARICATO
	 * @generated
	 */
	protected String delegaSoggIncaricato;

	/**
	 * Imposta il valore della proprieta' delegaSoggIncaricato associata alla
	 * colonna DELEGA_SOGG_INCARICATO.
	 * @generated
	 */
	public void setDelegaSoggIncaricato(String val) {

		delegaSoggIncaricato = val;

	}

	/**
	 * Legge il valore della proprieta' delegaSoggIncaricato associata alla
	 * @generated
	 */
	public String getDelegaSoggIncaricato() {

		return delegaSoggIncaricato;

	}

	/**
	 * store della proprieta' associata alla colonna DT_CREAZIONE_TOKEN
	 * @generated
	 */
	protected java.sql.Date dtCreazioneToken;

	/**
	 * Imposta il valore della proprieta' dtCreazioneToken associata alla
	 * colonna DT_CREAZIONE_TOKEN.
	 * @generated
	 */
	public void setDtCreazioneToken(java.sql.Date val) {

		if (val != null) {
			dtCreazioneToken = new java.sql.Date(val.getTime());
		} else {
			dtCreazioneToken = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dtCreazioneToken associata alla
	 * @generated
	 */
	public java.sql.Date getDtCreazioneToken() {

		if (dtCreazioneToken != null) {
			return new java.sql.Date(dtCreazioneToken.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna DT_SCADENZA_TOKEN
	 * @generated
	 */
	protected java.sql.Date dtScadenzaToken;

	/**
	 * Imposta il valore della proprieta' dtScadenzaToken associata alla
	 * colonna DT_SCADENZA_TOKEN.
	 * @generated
	 */
	public void setDtScadenzaToken(java.sql.Date val) {

		if (val != null) {
			dtScadenzaToken = new java.sql.Date(val.getTime());
		} else {
			dtScadenzaToken = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dtScadenzaToken associata alla
	 * @generated
	 */
	public java.sql.Date getDtScadenzaToken() {

		if (dtScadenzaToken != null) {
			return new java.sql.Date(dtScadenzaToken.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna TOKEN
	 * @generated
	 */
	protected String token;

	/**
	 * Imposta il valore della proprieta' token associata alla
	 * colonna TOKEN.
	 * @generated
	 */
	public void setToken(String val) {

		token = val;

	}

	/**
	 * Legge il valore della proprieta' token associata alla
	 * @generated
	 */
	public String getToken() {

		return token;

	}

	/**
	 * Crea una istanza di SigitTPersonaGiuridicaPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTPersonaGiuridicaPk
	 * @generated
	 */
	public SigitTPersonaGiuridicaPk createPk() {
		return new SigitTPersonaGiuridicaPk(idPersonaGiuridica);
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
