package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitSLibrettoDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitSLibrettoPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_LIBRETTO
	 * @generated
	 */
	protected java.math.BigDecimal idLibretto;

	/**
	 * Imposta il valore della proprieta' idLibretto associata alla
	 * colonna ID_LIBRETTO.
	 * @generated
	 */
	public void setIdLibretto(java.math.BigDecimal val) {

		idLibretto = val;

	}

	/**
	 * Legge il valore della proprieta' idLibretto associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdLibretto() {

		return idLibretto;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitSLibrettoPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitSLibrettoPk(

			final java.math.BigDecimal idLibretto

	) {

		this.setIdLibretto(idLibretto);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitSLibrettoPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitSLibrettoPk)) {
			return false;
		}

		final SigitSLibrettoPk _cast = (SigitSLibrettoPk) _other;

		if (idLibretto == null ? _cast.getIdLibretto() != null : !idLibretto.equals(_cast.getIdLibretto())) {
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

		if (idLibretto != null) {
			_hashCode = 29 * _hashCode + idLibretto.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitSLibrettoPk: ");
		ret.append("idLibretto=" + idLibretto);

		return ret.toString();
	}
}
