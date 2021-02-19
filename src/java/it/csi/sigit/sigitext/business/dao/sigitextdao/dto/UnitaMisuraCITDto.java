package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO UnitaMisuraCITDao.
 * @generated
 */
public class UnitaMisuraCITDto extends UnitaMisuraCITPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna DES_UNITA_MISURA
	 * @generated
	 */
	protected String desUnitaMisura;

	/**
	 * Imposta il valore della proprieta' desUnitaMisura associata alla
	 * colonna DES_UNITA_MISURA.
	 * @generated
	 */
	public void setDesUnitaMisura(String val) {

		desUnitaMisura = val;

	}

	/**
	 * Legge il valore della proprieta' desUnitaMisura associata alla
	 * @generated
	 */
	public String getDesUnitaMisura() {

		return desUnitaMisura;

	}

	/**
	 * Crea una istanza di UnitaMisuraCITPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return UnitaMisuraCITPk
	 * @generated
	 */
	public UnitaMisuraCITPk createPk() {
		return new UnitaMisuraCITPk(idUnitaMisura);
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
