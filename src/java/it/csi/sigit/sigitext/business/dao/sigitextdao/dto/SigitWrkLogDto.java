package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitWrkLogDao.
 * @generated
 */
public class SigitWrkLogDto extends SigitWrkLogPk {

	private static final long serialVersionUID = 1L;

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
	 * store della proprieta' associata alla colonna DATA_OPERAZIONE
	 * @generated
	 */
	protected java.sql.Timestamp dataOperazione;

	/**
	 * Imposta il valore della proprieta' dataOperazione associata alla
	 * colonna DATA_OPERAZIONE.
	 * @generated
	 */
	public void setDataOperazione(java.sql.Timestamp val) {

		if (val != null) {
			dataOperazione = new java.sql.Timestamp(val.getTime());
		} else {
			dataOperazione = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataOperazione associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDataOperazione() {

		if (dataOperazione != null) {
			return new java.sql.Timestamp(dataOperazione.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna TBL_IMPATTATA
	 * @generated
	 */
	protected String tblImpattata;

	/**
	 * Imposta il valore della proprieta' tblImpattata associata alla
	 * colonna TBL_IMPATTATA.
	 * @generated
	 */
	public void setTblImpattata(String val) {

		tblImpattata = val;

	}

	/**
	 * Legge il valore della proprieta' tblImpattata associata alla
	 * @generated
	 */
	public String getTblImpattata() {

		return tblImpattata;

	}

	/**
	 * store della proprieta' associata alla colonna ID_RECORD
	 * @generated
	 */
	protected String idRecord;

	/**
	 * Imposta il valore della proprieta' idRecord associata alla
	 * colonna ID_RECORD.
	 * @generated
	 */
	public void setIdRecord(String val) {

		idRecord = val;

	}

	/**
	 * Legge il valore della proprieta' idRecord associata alla
	 * @generated
	 */
	public String getIdRecord() {

		return idRecord;

	}

	/**
	 * store della proprieta' associata alla colonna TIPO_OPERAZIONE
	 * @generated
	 */
	protected String tipoOperazione;

	/**
	 * Imposta il valore della proprieta' tipoOperazione associata alla
	 * colonna TIPO_OPERAZIONE.
	 * @generated
	 */
	public void setTipoOperazione(String val) {

		tipoOperazione = val;

	}

	/**
	 * Legge il valore della proprieta' tipoOperazione associata alla
	 * @generated
	 */
	public String getTipoOperazione() {

		return tipoOperazione;

	}

	/**
	 * Crea una istanza di SigitWrkLogPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitWrkLogPk
	 * @generated
	 */
	public SigitWrkLogPk createPk() {
		return new SigitWrkLogPk(idLog);
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
