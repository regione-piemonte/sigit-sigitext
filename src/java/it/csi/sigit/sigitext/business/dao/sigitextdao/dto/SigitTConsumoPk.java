package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTConsumoDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTConsumoPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_CONSUMO
	 * @generated
	 */
	protected java.math.BigDecimal idConsumo;

	/**
	 * Imposta il valore della proprieta' idConsumo associata alla
	 * colonna ID_CONSUMO.
	 * @generated
	 */
	public void setIdConsumo(java.math.BigDecimal val) {

		idConsumo = val;

	}

	/**
	 * Legge il valore della proprieta' idConsumo associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdConsumo() {

		return idConsumo;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTConsumoPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTConsumoPk(

			final java.math.BigDecimal idConsumo

	) {

		this.setIdConsumo(idConsumo);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTConsumoPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTConsumoPk)) {
			return false;
		}

		final SigitTConsumoPk _cast = (SigitTConsumoPk) _other;

		if (idConsumo == null ? _cast.getIdConsumo() != null : !idConsumo.equals(_cast.getIdConsumo())) {
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

		if (idConsumo != null) {
			_hashCode = 29 * _hashCode + idConsumo.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTConsumoPk: ");
		ret.append("idConsumo=" + idConsumo);

		return ret.toString();
	}
}
