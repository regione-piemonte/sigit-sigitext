package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO PotenzaImpDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class PotenzaImpPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_POTENZA
	 * @generated
	 */
	protected java.math.BigDecimal idPotenza;

	/**
	 * Imposta il valore della proprieta' idPotenza associata alla
	 * colonna ID_POTENZA.
	 * @generated
	 */
	public void setIdPotenza(java.math.BigDecimal val) {

		idPotenza = val;

	}

	/**
	 * Legge il valore della proprieta' idPotenza associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdPotenza() {

		return idPotenza;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public PotenzaImpPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public PotenzaImpPk(

			final java.math.BigDecimal idPotenza

	) {

		this.setIdPotenza(idPotenza);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di PotenzaImpPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof PotenzaImpPk)) {
			return false;
		}

		final PotenzaImpPk _cast = (PotenzaImpPk) _other;

		if (idPotenza == null ? _cast.getIdPotenza() != null : !idPotenza.equals(_cast.getIdPotenza())) {
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

		if (idPotenza != null) {
			_hashCode = 29 * _hashCode + idPotenza.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.PotenzaImpPk: ");
		ret.append("idPotenza=" + idPotenza);

		return ret.toString();
	}
}
