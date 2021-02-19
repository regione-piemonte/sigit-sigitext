package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO CombustibileCITDao.
 * @generated
 */
public class CombustibileCITDto extends CombustibileCITPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna DES_COMBUSTIBILE
	 * @generated
	 */
	protected String desCombustibile;

	/**
	 * Imposta il valore della proprieta' desCombustibile associata alla
	 * colonna DES_COMBUSTIBILE.
	 * @generated
	 */
	public void setDesCombustibile(String val) {

		desCombustibile = val;

	}

	/**
	 * Legge il valore della proprieta' desCombustibile associata alla
	 * @generated
	 */
	public String getDesCombustibile() {

		return desCombustibile;

	}

	/**
	 * Crea una istanza di CombustibileCITPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return CombustibileCITPk
	 * @generated
	 */
	public CombustibileCITPk createPk() {
		return new CombustibileCITPk(idCombustibile);
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
