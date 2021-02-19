package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTPreImportDao.
 * @generated
 */
public class SigitTPreImportDto extends SigitTPreImportPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna N_FILE
	 * @generated
	 */
	protected Integer nFile;

	/**
	 * Imposta il valore della proprieta' nFile associata alla
	 * colonna N_FILE.
	 * @generated
	 */
	public void setNFile(Integer val) {

		nFile = val;

	}

	/**
	 * Legge il valore della proprieta' nFile associata alla
	 * @generated
	 */
	public Integer getNFile() {

		return nFile;

	}

	/**
	 * store della proprieta' associata alla colonna MSG
	 * @generated
	 */
	protected String msg;

	/**
	 * Imposta il valore della proprieta' msg associata alla
	 * colonna MSG.
	 * @generated
	 */
	public void setMsg(String val) {

		msg = val;

	}

	/**
	 * Legge il valore della proprieta' msg associata alla
	 * @generated
	 */
	public String getMsg() {

		return msg;

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
	 * Crea una istanza di SigitTPreImportPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTPreImportPk
	 * @generated
	 */
	public SigitTPreImportPk createPk() {
		return new SigitTPreImportPk(idPreImport);
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
