package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTPreImportDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTPreImportPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_PRE_IMPORT
	 * @generated
	 */
	protected Integer idPreImport;

	/**
	 * Imposta il valore della proprieta' idPreImport associata alla
	 * colonna ID_PRE_IMPORT.
	 * @generated
	 */
	public void setIdPreImport(Integer val) {

		idPreImport = val;

	}

	/**
	 * Legge il valore della proprieta' idPreImport associata alla
	 * @generated
	 */
	public Integer getIdPreImport() {

		return idPreImport;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTPreImportPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTPreImportPk(

			final Integer idPreImport

	) {

		this.setIdPreImport(idPreImport);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTPreImportPk sono equals se i valori di tutti i campi coincidono.
	 * 
	 * @param _other
	 * @return boolean se i due oggetti sono uguali
	 */
	public boolean equals(Object _other) {
		if (_other == null) {
			return false;
		}

		if (_other == this) {
			return true;
		}

		if (!(_other instanceof SigitTPreImportPk)) {
			return false;
		}

		final SigitTPreImportPk _cast = (SigitTPreImportPk) _other;

		if (idPreImport == null ? _cast.getIdPreImport() != null : !idPreImport.equals(_cast.getIdPreImport())) {
			return false;
		}

		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode() {
		int _hashCode = 0;

		if (idPreImport != null) {
			_hashCode = 29 * _hashCode + idPreImport.hashCode();
		}

		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString() {
		StringBuilder ret = new StringBuilder();

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTPreImportPk: ");
		ret.append("idPreImport=" + idPreImport);

		return ret.toString();
	}
}
