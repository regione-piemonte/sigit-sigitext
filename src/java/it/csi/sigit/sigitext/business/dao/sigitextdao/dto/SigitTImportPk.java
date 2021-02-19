package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTImportDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTImportPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_IMPORT
	 * @generated
	 */
	protected Integer idImport;

	/**
	 * Imposta il valore della proprieta' idImport associata alla
	 * colonna ID_IMPORT.
	 * @generated
	 */
	public void setIdImport(Integer val) {

		idImport = val;

	}

	/**
	 * Legge il valore della proprieta' idImport associata alla
	 * @generated
	 */
	public Integer getIdImport() {

		return idImport;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTImportPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTImportPk(

			final Integer idImport

	) {

		this.setIdImport(idImport);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTImportPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTImportPk)) {
			return false;
		}

		final SigitTImportPk _cast = (SigitTImportPk) _other;

		if (idImport == null ? _cast.getIdImport() != null : !idImport.equals(_cast.getIdImport())) {
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

		if (idImport != null) {
			_hashCode = 29 * _hashCode + idImport.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTImportPk: ");
		ret.append("idImport=" + idImport);

		return ret.toString();
	}
}
