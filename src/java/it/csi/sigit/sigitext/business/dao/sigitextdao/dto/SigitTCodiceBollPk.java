package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTCodiceBollDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTCodiceBollPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna SIGLA_BOLLINO
	 * @generated
	 */
	protected String siglaBollino;

	/**
	 * Imposta il valore della proprieta' siglaBollino associata alla
	 * colonna SIGLA_BOLLINO.
	 * @generated
	 */
	public void setSiglaBollino(String val) {

		siglaBollino = val;

	}

	/**
	 * Legge il valore della proprieta' siglaBollino associata alla
	 * @generated
	 */
	public String getSiglaBollino() {

		return siglaBollino;

	}

	/**
	 * store della proprieta' associata alla colonna NUMERO_BOLLINO
	 * @generated
	 */
	protected java.math.BigDecimal numeroBollino;

	/**
	 * Imposta il valore della proprieta' numeroBollino associata alla
	 * colonna NUMERO_BOLLINO.
	 * @generated
	 */
	public void setNumeroBollino(java.math.BigDecimal val) {

		numeroBollino = val;

	}

	/**
	 * Legge il valore della proprieta' numeroBollino associata alla
	 * @generated
	 */
	public java.math.BigDecimal getNumeroBollino() {

		return numeroBollino;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTCodiceBollPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTCodiceBollPk(

			final String siglaBollino, final java.math.BigDecimal numeroBollino

	) {

		this.setSiglaBollino(siglaBollino);

		this.setNumeroBollino(numeroBollino);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTCodiceBollPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTCodiceBollPk)) {
			return false;
		}

		final SigitTCodiceBollPk _cast = (SigitTCodiceBollPk) _other;

		if (siglaBollino == null ? _cast.getSiglaBollino() != null : !siglaBollino.equals(_cast.getSiglaBollino())) {
			return false;
		}

		if (numeroBollino == null
				? _cast.getNumeroBollino() != null
				: !numeroBollino.equals(_cast.getNumeroBollino())) {
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

		if (siglaBollino != null) {
			_hashCode = 29 * _hashCode + siglaBollino.hashCode();
		}

		if (numeroBollino != null) {
			_hashCode = 29 * _hashCode + numeroBollino.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCodiceBollPk: ");
		ret.append("siglaBollino=" + siglaBollino);

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCodiceBollPk: ");
		ret.append("numeroBollino=" + numeroBollino);

		return ret.toString();
	}
}
