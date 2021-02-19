package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitRComp4ManutDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitRComp4ManutPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_R_COMP4_MANUT
	 * @generated
	 */
	protected Integer idRComp4Manut;

	/**
	 * Imposta il valore della proprieta' idRComp4Manut associata alla
	 * colonna ID_R_COMP4_MANUT.
	 * @generated
	 */
	public void setIdRComp4Manut(Integer val) {

		idRComp4Manut = val;

	}

	/**
	 * Legge il valore della proprieta' idRComp4Manut associata alla
	 * @generated
	 */
	public Integer getIdRComp4Manut() {

		return idRComp4Manut;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitRComp4ManutPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitRComp4ManutPk(

			final Integer idRComp4Manut

	) {

		this.setIdRComp4Manut(idRComp4Manut);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitRComp4ManutPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitRComp4ManutPk)) {
			return false;
		}

		final SigitRComp4ManutPk _cast = (SigitRComp4ManutPk) _other;

		if (idRComp4Manut == null
				? _cast.getIdRComp4Manut() != null
				: !idRComp4Manut.equals(_cast.getIdRComp4Manut())) {
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

		if (idRComp4Manut != null) {
			_hashCode = 29 * _hashCode + idRComp4Manut.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRComp4ManutPk: ");
		ret.append("idRComp4Manut=" + idRComp4Manut);

		return ret.toString();
	}
}
