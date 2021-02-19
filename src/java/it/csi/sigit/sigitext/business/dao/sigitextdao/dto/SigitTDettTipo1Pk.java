package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTDettTipo1Dto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTDettTipo1Pk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_DETT_TIPO1
	 * @generated
	 */
	protected java.math.BigDecimal idDettTipo1;

	/**
	 * Imposta il valore della proprieta' idDettTipo1 associata alla
	 * colonna ID_DETT_TIPO1.
	 * @generated
	 */
	public void setIdDettTipo1(java.math.BigDecimal val) {

		idDettTipo1 = val;

	}

	/**
	 * Legge il valore della proprieta' idDettTipo1 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdDettTipo1() {

		return idDettTipo1;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTDettTipo1Pk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTDettTipo1Pk(

			final java.math.BigDecimal idDettTipo1

	) {

		this.setIdDettTipo1(idDettTipo1);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTDettTipo1Pk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTDettTipo1Pk)) {
			return false;
		}

		final SigitTDettTipo1Pk _cast = (SigitTDettTipo1Pk) _other;

		if (idDettTipo1 == null ? _cast.getIdDettTipo1() != null : !idDettTipo1.equals(_cast.getIdDettTipo1())) {
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

		if (idDettTipo1 != null) {
			_hashCode = 29 * _hashCode + idDettTipo1.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTDettTipo1Pk: ");
		ret.append("idDettTipo1=" + idDettTipo1);

		return ret.toString();
	}
}
