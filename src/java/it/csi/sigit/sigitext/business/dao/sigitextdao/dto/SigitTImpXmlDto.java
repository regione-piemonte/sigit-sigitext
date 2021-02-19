package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTImpXmlDao.
 * @generated
 */
public class SigitTImpXmlDto extends SigitTImpXmlPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna FILE_IMPORT
	 * @generated
	 */
	protected String fileImport;

	/**
	 * Imposta il valore della proprieta' fileImport associata alla
	 * colonna FILE_IMPORT.
	 * @generated
	 */
	public void setFileImport(String val) {

		fileImport = val;

	}

	/**
	 * Legge il valore della proprieta' fileImport associata alla
	 * @generated
	 */
	public String getFileImport() {

		return fileImport;

	}

	/**
	 * Crea una istanza di SigitTImpXmlPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTImpXmlPk
	 * @generated
	 */
	public SigitTImpXmlPk createPk() {
		return new SigitTImpXmlPk(idImport);
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
