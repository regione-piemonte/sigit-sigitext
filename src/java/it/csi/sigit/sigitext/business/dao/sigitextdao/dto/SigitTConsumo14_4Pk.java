package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTConsumo14_4Dto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTConsumo14_4Pk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_CONSUMO_H2O
	 * @generated
	 */
	protected java.math.BigDecimal idConsumoH2o;

	/**
	 * Imposta il valore della proprieta' idConsumoH2o associata alla
	 * colonna ID_CONSUMO_H2O.
	 * @generated
	 */
	public void setIdConsumoH2o(java.math.BigDecimal val) {

		idConsumoH2o = val;

	}

	/**
	 * Legge il valore della proprieta' idConsumoH2o associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdConsumoH2o() {

		return idConsumoH2o;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTConsumo14_4Pk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTConsumo14_4Pk(

			final java.math.BigDecimal idConsumoH2o

	) {

		this.setIdConsumoH2o(idConsumoH2o);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTConsumo14_4Pk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTConsumo14_4Pk)) {
			return false;
		}

		final SigitTConsumo14_4Pk _cast = (SigitTConsumo14_4Pk) _other;

		if (idConsumoH2o == null ? _cast.getIdConsumoH2o() != null : !idConsumoH2o.equals(_cast.getIdConsumoH2o())) {
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

		if (idConsumoH2o != null) {
			_hashCode = 29 * _hashCode + idConsumoH2o.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTConsumo14_4Pk: ");
		ret.append("idConsumoH2o=" + idConsumoH2o);

		return ret.toString();
	}
}
