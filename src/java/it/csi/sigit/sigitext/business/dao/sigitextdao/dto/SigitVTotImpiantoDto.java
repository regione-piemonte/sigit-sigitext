package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitVTotImpiantoDao.
 * @generated
 */
public class SigitVTotImpiantoDto implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna CODICE_IMPIANTO
	 * @generated
	 */
	protected java.math.BigDecimal codiceImpianto;

	/**
	 * Imposta il valore della proprieta' codiceImpianto associata alla
	 * colonna CODICE_IMPIANTO.
	 * @generated
	 */
	public void setCodiceImpianto(java.math.BigDecimal val) {

		codiceImpianto = val;

	}

	/**
	 * Legge il valore della proprieta' codiceImpianto associata alla
	 * @generated
	 */
	public java.math.BigDecimal getCodiceImpianto() {

		return codiceImpianto;

	}

	/**
	 * store della proprieta' associata alla colonna DENOMINAZIONE_PROVINCIA
	 * @generated
	 */
	protected String denominazioneProvincia;

	/**
	 * Imposta il valore della proprieta' denominazioneProvincia associata alla
	 * colonna DENOMINAZIONE_PROVINCIA.
	 * @generated
	 */
	public void setDenominazioneProvincia(String val) {

		denominazioneProvincia = val;

	}

	/**
	 * Legge il valore della proprieta' denominazioneProvincia associata alla
	 * @generated
	 */
	public String getDenominazioneProvincia() {

		return denominazioneProvincia;

	}

	/**
	 * store della proprieta' associata alla colonna SIGLA_PROVINCIA
	 * @generated
	 */
	protected String siglaProvincia;

	/**
	 * Imposta il valore della proprieta' siglaProvincia associata alla
	 * colonna SIGLA_PROVINCIA.
	 * @generated
	 */
	public void setSiglaProvincia(String val) {

		siglaProvincia = val;

	}

	/**
	 * Legge il valore della proprieta' siglaProvincia associata alla
	 * @generated
	 */
	public String getSiglaProvincia() {

		return siglaProvincia;

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
	 * store della proprieta' associata alla colonna DENOMINAZIONE_COMUNE
	 * @generated
	 */
	protected String denominazioneComune;

	/**
	 * Imposta il valore della proprieta' denominazioneComune associata alla
	 * colonna DENOMINAZIONE_COMUNE.
	 * @generated
	 */
	public void setDenominazioneComune(String val) {

		denominazioneComune = val;

	}

	/**
	 * Legge il valore della proprieta' denominazioneComune associata alla
	 * @generated
	 */
	public String getDenominazioneComune() {

		return denominazioneComune;

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
	 * store della proprieta' associata alla colonna FLG_PRINCIPALE
	 * @generated
	 */
	protected java.math.BigDecimal flgPrincipale;

	/**
	 * Imposta il valore della proprieta' flgPrincipale associata alla
	 * colonna FLG_PRINCIPALE.
	 * @generated
	 */
	public void setFlgPrincipale(java.math.BigDecimal val) {

		flgPrincipale = val;

	}

	/**
	 * Legge il valore della proprieta' flgPrincipale associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgPrincipale() {

		return flgPrincipale;

	}

	/**
	 * store della proprieta' associata alla colonna PF_PG
	 * @generated
	 */
	protected String pfPg;

	/**
	 * Imposta il valore della proprieta' pfPg associata alla
	 * colonna PF_PG.
	 * @generated
	 */
	public void setPfPg(String val) {

		pfPg = val;

	}

	/**
	 * Legge il valore della proprieta' pfPg associata alla
	 * @generated
	 */
	public String getPfPg() {

		return pfPg;

	}

	/**
	 * store della proprieta' associata alla colonna ID_PERSONA_FISICA
	 * @generated
	 */
	protected java.math.BigDecimal idPersonaFisica;

	/**
	 * Imposta il valore della proprieta' idPersonaFisica associata alla
	 * colonna ID_PERSONA_FISICA.
	 * @generated
	 */
	public void setIdPersonaFisica(java.math.BigDecimal val) {

		idPersonaFisica = val;

	}

	/**
	 * Legge il valore della proprieta' idPersonaFisica associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdPersonaFisica() {

		return idPersonaFisica;

	}

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
	 * store della proprieta' associata alla colonna ID_RUOLO
	 * @generated
	 */
	protected java.math.BigDecimal idRuolo;

	/**
	 * Imposta il valore della proprieta' idRuolo associata alla
	 * colonna ID_RUOLO.
	 * @generated
	 */
	public void setIdRuolo(java.math.BigDecimal val) {

		idRuolo = val;

	}

	/**
	 * Legge il valore della proprieta' idRuolo associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdRuolo() {

		return idRuolo;

	}

	/**
	 * store della proprieta' associata alla colonna DES_RUOLO
	 * @generated
	 */
	protected String desRuolo;

	/**
	 * Imposta il valore della proprieta' desRuolo associata alla
	 * colonna DES_RUOLO.
	 * @generated
	 */
	public void setDesRuolo(String val) {

		desRuolo = val;

	}

	/**
	 * Legge il valore della proprieta' desRuolo associata alla
	 * @generated
	 */
	public String getDesRuolo() {

		return desRuolo;

	}

	/**
	 * store della proprieta' associata alla colonna RUOLO_FUNZ
	 * @generated
	 */
	protected String ruoloFunz;

	/**
	 * Imposta il valore della proprieta' ruoloFunz associata alla
	 * colonna RUOLO_FUNZ.
	 * @generated
	 */
	public void setRuoloFunz(String val) {

		ruoloFunz = val;

	}

	/**
	 * Legge il valore della proprieta' ruoloFunz associata alla
	 * @generated
	 */
	public String getRuoloFunz() {

		return ruoloFunz;

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
	 * store della proprieta' associata alla colonna ID_IMP_RUOLO_PFPG
	 * @generated
	 */
	protected java.math.BigDecimal idImpRuoloPfpg;

	/**
	 * Imposta il valore della proprieta' idImpRuoloPfpg associata alla
	 * colonna ID_IMP_RUOLO_PFPG.
	 * @generated
	 */
	public void setIdImpRuoloPfpg(java.math.BigDecimal val) {

		idImpRuoloPfpg = val;

	}

	/**
	 * Legge il valore della proprieta' idImpRuoloPfpg associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdImpRuoloPfpg() {

		return idImpRuoloPfpg;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_INIZIO_PFPG
	 * @generated
	 */
	protected java.sql.Date dataInizioPfpg;

	/**
	 * Imposta il valore della proprieta' dataInizioPfpg associata alla
	 * colonna DATA_INIZIO_PFPG.
	 * @generated
	 */
	public void setDataInizioPfpg(java.sql.Date val) {

		if (val != null) {
			dataInizioPfpg = new java.sql.Date(val.getTime());
		} else {
			dataInizioPfpg = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataInizioPfpg associata alla
	 * @generated
	 */
	public java.sql.Date getDataInizioPfpg() {

		if (dataInizioPfpg != null) {
			return new java.sql.Date(dataInizioPfpg.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna DATA_FINE_PFPG
	 * @generated
	 */
	protected java.sql.Date dataFinePfpg;

	/**
	 * Imposta il valore della proprieta' dataFinePfpg associata alla
	 * colonna DATA_FINE_PFPG.
	 * @generated
	 */
	public void setDataFinePfpg(java.sql.Date val) {

		if (val != null) {
			dataFinePfpg = new java.sql.Date(val.getTime());
		} else {
			dataFinePfpg = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataFinePfpg associata alla
	 * @generated
	 */
	public java.sql.Date getDataFinePfpg() {

		if (dataFinePfpg != null) {
			return new java.sql.Date(dataFinePfpg.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna FLG_VISU_PROPRIETARIO
	 * @generated
	 */
	protected java.math.BigDecimal flgVisuProprietario;

	/**
	 * Imposta il valore della proprieta' flgVisuProprietario associata alla
	 * colonna FLG_VISU_PROPRIETARIO.
	 * @generated
	 */
	public void setFlgVisuProprietario(java.math.BigDecimal val) {

		flgVisuProprietario = val;

	}

	/**
	 * Legge il valore della proprieta' flgVisuProprietario associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgVisuProprietario() {

		return flgVisuProprietario;

	}

}
