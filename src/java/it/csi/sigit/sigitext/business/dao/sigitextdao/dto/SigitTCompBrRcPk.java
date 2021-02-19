package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTCompBrRcDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTCompBrRcPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_COMP_BR_RC
	 * @generated
	 */
	protected java.math.BigDecimal idCompBrRc;

	/**
	 * Imposta il valore della proprieta' idCompBrRc associata alla
	 * colonna ID_COMP_BR_RC.
	 * @generated
	 */
	public void setIdCompBrRc(java.math.BigDecimal val) {

		idCompBrRc = val;

	}

	/**
	 * Legge il valore della proprieta' idCompBrRc associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdCompBrRc() {

		return idCompBrRc;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTCompBrRcPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTCompBrRcPk(

			final java.math.BigDecimal idCompBrRc

	) {

		this.setIdCompBrRc(idCompBrRc);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTCompBrRcPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTCompBrRcPk)) {
			return false;
		}

		final SigitTCompBrRcPk _cast = (SigitTCompBrRcPk) _other;

		if (idCompBrRc == null ? _cast.getIdCompBrRc() != null : !idCompBrRc.equals(_cast.getIdCompBrRc())) {
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

		if (idCompBrRc != null) {
			_hashCode = 29 * _hashCode + idCompBrRc.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompBrRcPk: ");
		ret.append("idCompBrRc=" + idCompBrRc);

		return ret.toString();
	}
}
