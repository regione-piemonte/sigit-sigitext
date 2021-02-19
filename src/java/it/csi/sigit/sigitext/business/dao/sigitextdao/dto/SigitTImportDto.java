package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTImportDao.
 * @generated
 */
public class SigitTImportDto extends SigitTImportPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna DATA_INIZIO
	 * @generated
	 */
	protected java.sql.Timestamp dataInizio;

	/**
	 * Imposta il valore della proprieta' dataInizio associata alla
	 * colonna DATA_INIZIO.
	 * @generated
	 */
	public void setDataInizio(java.sql.Timestamp val) {

		if (val != null) {
			dataInizio = new java.sql.Timestamp(val.getTime());
		} else {
			dataInizio = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataInizio associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDataInizio() {

		if (dataInizio != null) {
			return new java.sql.Timestamp(dataInizio.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna DATA_FINE
	 * @generated
	 */
	protected java.sql.Timestamp dataFine;

	/**
	 * Imposta il valore della proprieta' dataFine associata alla
	 * colonna DATA_FINE.
	 * @generated
	 */
	public void setDataFine(java.sql.Timestamp val) {

		if (val != null) {
			dataFine = new java.sql.Timestamp(val.getTime());
		} else {
			dataFine = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataFine associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDataFine() {

		if (dataFine != null) {
			return new java.sql.Timestamp(dataFine.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna NOME_FILE_IMPORT
	 * @generated
	 */
	protected String nomeFileImport;

	/**
	 * Imposta il valore della proprieta' nomeFileImport associata alla
	 * colonna NOME_FILE_IMPORT.
	 * @generated
	 */
	public void setNomeFileImport(String val) {

		nomeFileImport = val;

	}

	/**
	 * Legge il valore della proprieta' nomeFileImport associata alla
	 * @generated
	 */
	public String getNomeFileImport() {

		return nomeFileImport;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_ESITO
	 * @generated
	 */
	protected java.math.BigDecimal flgEsito;

	/**
	 * Imposta il valore della proprieta' flgEsito associata alla
	 * colonna FLG_ESITO.
	 * @generated
	 */
	public void setFlgEsito(java.math.BigDecimal val) {

		flgEsito = val;

	}

	/**
	 * Legge il valore della proprieta' flgEsito associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgEsito() {

		return flgEsito;

	}

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
	 * store della proprieta' associata alla colonna FK_PRE_IMPORT
	 * @generated
	 */
	protected Integer fkPreImport;

	/**
	 * Imposta il valore della proprieta' fkPreImport associata alla
	 * colonna FK_PRE_IMPORT.
	 * @generated
	 */
	public void setFkPreImport(Integer val) {

		fkPreImport = val;

	}

	/**
	 * Legge il valore della proprieta' fkPreImport associata alla
	 * @generated
	 */
	public Integer getFkPreImport() {

		return fkPreImport;

	}

	/**
	 * store della proprieta' associata alla colonna FK_ALLEGATO
	 * @generated
	 */
	protected java.math.BigDecimal fkAllegato;

	/**
	 * Imposta il valore della proprieta' fkAllegato associata alla
	 * colonna FK_ALLEGATO.
	 * @generated
	 */
	public void setFkAllegato(java.math.BigDecimal val) {

		fkAllegato = val;

	}

	/**
	 * Legge il valore della proprieta' fkAllegato associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkAllegato() {

		return fkAllegato;

	}

	/**
	 * store della proprieta' associata alla colonna MSG_ERRORE
	 * @generated
	 */
	protected String msgErrore;

	/**
	 * Imposta il valore della proprieta' msgErrore associata alla
	 * colonna MSG_ERRORE.
	 * @generated
	 */
	public void setMsgErrore(String val) {

		msgErrore = val;

	}

	/**
	 * Legge il valore della proprieta' msgErrore associata alla
	 * @generated
	 */
	public String getMsgErrore() {

		return msgErrore;

	}

	/**
	 * store della proprieta' associata alla colonna FK_PERSONA_GIURIDICA
	 * @generated
	 */
	protected java.math.BigDecimal fkPersonaGiuridica;

	/**
	 * Imposta il valore della proprieta' fkPersonaGiuridica associata alla
	 * colonna FK_PERSONA_GIURIDICA.
	 * @generated
	 */
	public void setFkPersonaGiuridica(java.math.BigDecimal val) {

		fkPersonaGiuridica = val;

	}

	/**
	 * Legge il valore della proprieta' fkPersonaGiuridica associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkPersonaGiuridica() {

		return fkPersonaGiuridica;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_INVIO_MAIL_MANUT
	 * @generated
	 */
	protected java.sql.Timestamp dataInvioMailManut;

	/**
	 * Imposta il valore della proprieta' dataInvioMailManut associata alla
	 * colonna DATA_INVIO_MAIL_MANUT.
	 * @generated
	 */
	public void setDataInvioMailManut(java.sql.Timestamp val) {

		if (val != null) {
			dataInvioMailManut = new java.sql.Timestamp(val.getTime());
		} else {
			dataInvioMailManut = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataInvioMailManut associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDataInvioMailManut() {

		if (dataInvioMailManut != null) {
			return new java.sql.Timestamp(dataInvioMailManut.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna DATA_INVIO_MAIL_ASSISTENZA
	 * @generated
	 */
	protected java.sql.Timestamp dataInvioMailAssistenza;

	/**
	 * Imposta il valore della proprieta' dataInvioMailAssistenza associata alla
	 * colonna DATA_INVIO_MAIL_ASSISTENZA.
	 * @generated
	 */
	public void setDataInvioMailAssistenza(java.sql.Timestamp val) {

		if (val != null) {
			dataInvioMailAssistenza = new java.sql.Timestamp(val.getTime());
		} else {
			dataInvioMailAssistenza = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataInvioMailAssistenza associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDataInvioMailAssistenza() {

		if (dataInvioMailAssistenza != null) {
			return new java.sql.Timestamp(dataInvioMailAssistenza.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna FK_PG_CAT
	 * @generated
	 */
	protected java.math.BigDecimal fkPgCat;

	/**
	 * Imposta il valore della proprieta' fkPgCat associata alla
	 * colonna FK_PG_CAT.
	 * @generated
	 */
	public void setFkPgCat(java.math.BigDecimal val) {

		fkPgCat = val;

	}

	/**
	 * Legge il valore della proprieta' fkPgCat associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkPgCat() {

		return fkPgCat;

	}

	/**
	 * Crea una istanza di SigitTImportPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTImportPk
	 * @generated
	 */
	public SigitTImportPk createPk() {
		return new SigitTImportPk(idImport);
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
