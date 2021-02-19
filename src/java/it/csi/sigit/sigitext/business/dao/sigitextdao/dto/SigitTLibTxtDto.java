package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTLibTxtDao.
 * @generated
 */
public class SigitTLibTxtDto extends SigitTLibTxtPk {

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
	 * Crea una istanza di SigitTLibTxtPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTLibTxtPk
	 * @generated
	 */
	public SigitTLibTxtPk createPk() {
		return new SigitTLibTxtPk(idLibretto);
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
