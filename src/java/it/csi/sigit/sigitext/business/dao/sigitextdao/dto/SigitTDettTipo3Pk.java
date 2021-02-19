package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTDettTipo3Dto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTDettTipo3Pk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_DETT_TIPO3
	 * @generated
	 */
	protected java.math.BigDecimal idDettTipo3;

	/**
	 * Imposta il valore della proprieta' idDettTipo3 associata alla
	 * colonna ID_DETT_TIPO3.
	 * @generated
	 */
	public void setIdDettTipo3(java.math.BigDecimal val) {

		idDettTipo3 = val;

	}

	/**
	 * Legge il valore della proprieta' idDettTipo3 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdDettTipo3() {

		return idDettTipo3;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTDettTipo3Pk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTDettTipo3Pk(

			final java.math.BigDecimal idDettTipo3

	) {

		this.setIdDettTipo3(idDettTipo3);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTDettTipo3Pk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTDettTipo3Pk)) {
			return false;
		}

		final SigitTDettTipo3Pk _cast = (SigitTDettTipo3Pk) _other;

		if (idDettTipo3 == null ? _cast.getIdDettTipo3() != null : !idDettTipo3.equals(_cast.getIdDettTipo3())) {
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

		if (idDettTipo3 != null) {
			_hashCode = 29 * _hashCode + idDettTipo3.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTDettTipo3Pk: ");
		ret.append("idDettTipo3=" + idDettTipo3);

		return ret.toString();
	}
}
