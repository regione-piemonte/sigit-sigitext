package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTDettTipo2Dto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTDettTipo2Pk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_DETT_TIPO2
	 * @generated
	 */
	protected java.math.BigDecimal idDettTipo2;

	/**
	 * Imposta il valore della proprieta' idDettTipo2 associata alla
	 * colonna ID_DETT_TIPO2.
	 * @generated
	 */
	public void setIdDettTipo2(java.math.BigDecimal val) {

		idDettTipo2 = val;

	}

	/**
	 * Legge il valore della proprieta' idDettTipo2 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdDettTipo2() {

		return idDettTipo2;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTDettTipo2Pk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTDettTipo2Pk(

			final java.math.BigDecimal idDettTipo2

	) {

		this.setIdDettTipo2(idDettTipo2);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTDettTipo2Pk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTDettTipo2Pk)) {
			return false;
		}

		final SigitTDettTipo2Pk _cast = (SigitTDettTipo2Pk) _other;

		if (idDettTipo2 == null ? _cast.getIdDettTipo2() != null : !idDettTipo2.equals(_cast.getIdDettTipo2())) {
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

		if (idDettTipo2 != null) {
			_hashCode = 29 * _hashCode + idDettTipo2.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTDettTipo2Pk: ");
		ret.append("idDettTipo2=" + idDettTipo2);

		return ret.toString();
	}
}
