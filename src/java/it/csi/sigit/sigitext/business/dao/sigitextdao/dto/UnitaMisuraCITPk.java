package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO UnitaMisuraCITDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class UnitaMisuraCITPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_UNITA_MISURA
	 * @generated
	 */
	protected String idUnitaMisura;

	/**
	 * Imposta il valore della proprieta' idUnitaMisura associata alla
	 * colonna ID_UNITA_MISURA.
	 * @generated
	 */
	public void setIdUnitaMisura(String val) {

		idUnitaMisura = val;

	}

	/**
	 * Legge il valore della proprieta' idUnitaMisura associata alla
	 * @generated
	 */
	public String getIdUnitaMisura() {

		return idUnitaMisura;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public UnitaMisuraCITPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public UnitaMisuraCITPk(

			final String idUnitaMisura

	) {

		this.setIdUnitaMisura(idUnitaMisura);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di UnitaMisuraCITPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof UnitaMisuraCITPk)) {
			return false;
		}

		final UnitaMisuraCITPk _cast = (UnitaMisuraCITPk) _other;

		if (idUnitaMisura == null
				? _cast.getIdUnitaMisura() != null
				: !idUnitaMisura.equals(_cast.getIdUnitaMisura())) {
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

		if (idUnitaMisura != null) {
			_hashCode = 29 * _hashCode + idUnitaMisura.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.UnitaMisuraCITPk: ");
		ret.append("idUnitaMisura=" + idUnitaMisura);

		return ret.toString();
	}
}
