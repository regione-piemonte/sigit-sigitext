package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTPersonaFisicaDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTPersonaFisicaPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_PERSONA_FISICA
	 * @generated
	 */
	protected java.math.BigDecimal idPersonaFisica;

	/**
	 * Imposta il valore della proprieta' idPersonaFisica associata alla
	 * colonna ID_PERSONA_FISICA.
	 * @generated
	 */
	public void setIdPersonaFisica(java.math.BigDecimal val) {

		idPersonaFisica = val;

	}

	/**
	 * Legge il valore della proprieta' idPersonaFisica associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdPersonaFisica() {

		return idPersonaFisica;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTPersonaFisicaPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTPersonaFisicaPk(

			final java.math.BigDecimal idPersonaFisica

	) {

		this.setIdPersonaFisica(idPersonaFisica);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTPersonaFisicaPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTPersonaFisicaPk)) {
			return false;
		}

		final SigitTPersonaFisicaPk _cast = (SigitTPersonaFisicaPk) _other;

		if (idPersonaFisica == null
				? _cast.getIdPersonaFisica() != null
				: !idPersonaFisica.equals(_cast.getIdPersonaFisica())) {
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

		if (idPersonaFisica != null) {
			_hashCode = 29 * _hashCode + idPersonaFisica.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTPersonaFisicaPk: ");
		ret.append("idPersonaFisica=" + idPersonaFisica);

		return ret.toString();
	}
}
