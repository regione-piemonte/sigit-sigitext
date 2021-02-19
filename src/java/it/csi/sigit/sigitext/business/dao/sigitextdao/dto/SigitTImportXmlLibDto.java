package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTImportXmlLibDao.
 * @generated
 */
public class SigitTImportXmlLibDto extends SigitTImportXmlLibPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna XML_LIBRETTO
	 * @generated
	 */
	protected String xmlLibretto;

	/**
	 * Imposta il valore della proprieta' xmlLibretto associata alla
	 * colonna XML_LIBRETTO.
	 * @generated
	 */
	public void setXmlLibretto(String val) {

		xmlLibretto = val;

	}

	/**
	 * Legge il valore della proprieta' xmlLibretto associata alla
	 * @generated
	 */
	public String getXmlLibretto() {

		return xmlLibretto;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_ULT_MOD
	 * @generated
	 */
	protected java.sql.Date dataUltMod;

	/**
	 * Imposta il valore della proprieta' dataUltMod associata alla
	 * colonna DATA_ULT_MOD.
	 * @generated
	 */
	public void setDataUltMod(java.sql.Date val) {

		if (val != null) {
			dataUltMod = new java.sql.Date(val.getTime());
		} else {
			dataUltMod = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataUltMod associata alla
	 * @generated
	 */
	public java.sql.Date getDataUltMod() {

		if (dataUltMod != null) {
			return new java.sql.Date(dataUltMod.getTime());
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
	 * Crea una istanza di SigitTImportXmlLibPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTImportXmlLibPk
	 * @generated
	 */
	public SigitTImportXmlLibPk createPk() {
		return new SigitTImportXmlLibPk(codiceImpianto);
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
