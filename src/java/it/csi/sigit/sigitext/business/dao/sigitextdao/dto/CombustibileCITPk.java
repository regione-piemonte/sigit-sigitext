package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO CombustibileCITDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class CombustibileCITPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_COMBUSTIBILE
	 * @generated
	 */
	protected java.math.BigDecimal idCombustibile;

	/**
	 * Imposta il valore della proprieta' idCombustibile associata alla
	 * colonna ID_COMBUSTIBILE.
	 * @generated
	 */
	public void setIdCombustibile(java.math.BigDecimal val) {

		idCombustibile = val;

	}

	/**
	 * Legge il valore della proprieta' idCombustibile associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdCombustibile() {

		return idCombustibile;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public CombustibileCITPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public CombustibileCITPk(

			final java.math.BigDecimal idCombustibile

	) {

		this.setIdCombustibile(idCombustibile);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di CombustibileCITPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof CombustibileCITPk)) {
			return false;
		}

		final CombustibileCITPk _cast = (CombustibileCITPk) _other;

		if (idCombustibile == null
				? _cast.getIdCombustibile() != null
				: !idCombustibile.equals(_cast.getIdCombustibile())) {
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

		if (idCombustibile != null) {
			_hashCode = 29 * _hashCode + idCombustibile.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.CombustibileCITPk: ");
		ret.append("idCombustibile=" + idCombustibile);

		return ret.toString();
	}
}
