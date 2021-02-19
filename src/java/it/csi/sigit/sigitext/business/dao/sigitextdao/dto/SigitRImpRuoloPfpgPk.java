package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitRImpRuoloPfpgDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitRImpRuoloPfpgPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_IMP_RUOLO_PFPG
	 * @generated
	 */
	protected java.math.BigDecimal idImpRuoloPfpg;

	/**
	 * Imposta il valore della proprieta' idImpRuoloPfpg associata alla
	 * colonna ID_IMP_RUOLO_PFPG.
	 * @generated
	 */
	public void setIdImpRuoloPfpg(java.math.BigDecimal val) {

		idImpRuoloPfpg = val;

	}

	/**
	 * Legge il valore della proprieta' idImpRuoloPfpg associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdImpRuoloPfpg() {

		return idImpRuoloPfpg;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitRImpRuoloPfpgPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitRImpRuoloPfpgPk(

			final java.math.BigDecimal idImpRuoloPfpg

	) {

		this.setIdImpRuoloPfpg(idImpRuoloPfpg);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitRImpRuoloPfpgPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitRImpRuoloPfpgPk)) {
			return false;
		}

		final SigitRImpRuoloPfpgPk _cast = (SigitRImpRuoloPfpgPk) _other;

		if (idImpRuoloPfpg == null
				? _cast.getIdImpRuoloPfpg() != null
				: !idImpRuoloPfpg.equals(_cast.getIdImpRuoloPfpg())) {
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

		if (idImpRuoloPfpg != null) {
			_hashCode = 29 * _hashCode + idImpRuoloPfpg.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRImpRuoloPfpgPk: ");
		ret.append("idImpRuoloPfpg=" + idImpRuoloPfpg);

		return ret.toString();
	}
}
