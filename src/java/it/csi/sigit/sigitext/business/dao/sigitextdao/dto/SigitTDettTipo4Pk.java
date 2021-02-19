package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTDettTipo4Dto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTDettTipo4Pk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_DETT_TIPO4
	 * @generated
	 */
	protected java.math.BigDecimal idDettTipo4;

	/**
	 * Imposta il valore della proprieta' idDettTipo4 associata alla
	 * colonna ID_DETT_TIPO4.
	 * @generated
	 */
	public void setIdDettTipo4(java.math.BigDecimal val) {

		idDettTipo4 = val;

	}

	/**
	 * Legge il valore della proprieta' idDettTipo4 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdDettTipo4() {

		return idDettTipo4;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTDettTipo4Pk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTDettTipo4Pk(

			final java.math.BigDecimal idDettTipo4

	) {

		this.setIdDettTipo4(idDettTipo4);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTDettTipo4Pk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTDettTipo4Pk)) {
			return false;
		}

		final SigitTDettTipo4Pk _cast = (SigitTDettTipo4Pk) _other;

		if (idDettTipo4 == null ? _cast.getIdDettTipo4() != null : !idDettTipo4.equals(_cast.getIdDettTipo4())) {
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

		if (idDettTipo4 != null) {
			_hashCode = 29 * _hashCode + idDettTipo4.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTDettTipo4Pk: ");
		ret.append("idDettTipo4=" + idDettTipo4);

		return ret.toString();
	}
}
