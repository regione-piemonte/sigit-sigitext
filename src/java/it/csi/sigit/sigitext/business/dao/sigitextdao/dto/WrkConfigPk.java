package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO WrkConfigDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class WrkConfigPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_CONFIG
	 * @generated
	 */
	protected java.math.BigDecimal idConfig;

	/**
	 * Imposta il valore della proprieta' idConfig associata alla
	 * colonna ID_CONFIG.
	 * @generated
	 */
	public void setIdConfig(java.math.BigDecimal val) {

		idConfig = val;

	}

	/**
	 * Legge il valore della proprieta' idConfig associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdConfig() {

		return idConfig;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public WrkConfigPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public WrkConfigPk(

			final java.math.BigDecimal idConfig

	) {

		this.setIdConfig(idConfig);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di WrkConfigPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof WrkConfigPk)) {
			return false;
		}

		final WrkConfigPk _cast = (WrkConfigPk) _other;

		if (idConfig == null ? _cast.getIdConfig() != null : !idConfig.equals(_cast.getIdConfig())) {
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

		if (idConfig != null) {
			_hashCode = 29 * _hashCode + idConfig.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.WrkConfigPk: ");
		ret.append("idConfig=" + idConfig);

		return ret.toString();
	}
}
