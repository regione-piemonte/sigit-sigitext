package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitRComp4ManutAllDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitRComp4ManutAllPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_ALLEGATO
	 * @generated
	 */
	protected java.math.BigDecimal idAllegato;

	/**
	 * Imposta il valore della proprieta' idAllegato associata alla
	 * colonna ID_ALLEGATO.
	 * @generated
	 */
	public void setIdAllegato(java.math.BigDecimal val) {

		idAllegato = val;

	}

	/**
	 * Legge il valore della proprieta' idAllegato associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdAllegato() {

		return idAllegato;

	}

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
	public SigitRComp4ManutAllPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitRComp4ManutAllPk(

			final java.math.BigDecimal idAllegato, final Integer idRComp4Manut

	) {

		this.setIdAllegato(idAllegato);

		this.setIdRComp4Manut(idRComp4Manut);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitRComp4ManutAllPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitRComp4ManutAllPk)) {
			return false;
		}

		final SigitRComp4ManutAllPk _cast = (SigitRComp4ManutAllPk) _other;

		if (idAllegato == null ? _cast.getIdAllegato() != null : !idAllegato.equals(_cast.getIdAllegato())) {
			return false;
		}

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

		if (idAllegato != null) {
			_hashCode = 29 * _hashCode + idAllegato.hashCode();
		}

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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRComp4ManutAllPk: ");
		ret.append("idAllegato=" + idAllegato);

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRComp4ManutAllPk: ");
		ret.append("idRComp4Manut=" + idRComp4Manut);

		return ret.toString();
	}
}
