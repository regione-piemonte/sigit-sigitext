package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTPersonaGiuridicaDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTPersonaGiuridicaPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_PERSONA_GIURIDICA
	 * @generated
	 */
	protected java.math.BigDecimal idPersonaGiuridica;

	/**
	 * Imposta il valore della proprieta' idPersonaGiuridica associata alla
	 * colonna ID_PERSONA_GIURIDICA.
	 * @generated
	 */
	public void setIdPersonaGiuridica(java.math.BigDecimal val) {

		idPersonaGiuridica = val;

	}

	/**
	 * Legge il valore della proprieta' idPersonaGiuridica associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdPersonaGiuridica() {

		return idPersonaGiuridica;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTPersonaGiuridicaPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTPersonaGiuridicaPk(

			final java.math.BigDecimal idPersonaGiuridica

	) {

		this.setIdPersonaGiuridica(idPersonaGiuridica);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTPersonaGiuridicaPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTPersonaGiuridicaPk)) {
			return false;
		}

		final SigitTPersonaGiuridicaPk _cast = (SigitTPersonaGiuridicaPk) _other;

		if (idPersonaGiuridica == null
				? _cast.getIdPersonaGiuridica() != null
				: !idPersonaGiuridica.equals(_cast.getIdPersonaGiuridica())) {
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

		if (idPersonaGiuridica != null) {
			_hashCode = 29 * _hashCode + idPersonaGiuridica.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTPersonaGiuridicaPk: ");
		ret.append("idPersonaGiuridica=" + idPersonaGiuridica);

		return ret.toString();
	}
}
