package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTElencoWsDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTElencoWsPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_ELENCO_WS
	 * @generated
	 */
	protected Integer idElencoWs;

	/**
	 * Imposta il valore della proprieta' idElencoWs associata alla
	 * colonna ID_ELENCO_WS.
	 * @generated
	 */
	public void setIdElencoWs(Integer val) {

		idElencoWs = val;

	}

	/**
	 * Legge il valore della proprieta' idElencoWs associata alla
	 * @generated
	 */
	public Integer getIdElencoWs() {

		return idElencoWs;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTElencoWsPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTElencoWsPk(

			final Integer idElencoWs

	) {

		this.setIdElencoWs(idElencoWs);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTElencoWsPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTElencoWsPk)) {
			return false;
		}

		final SigitTElencoWsPk _cast = (SigitTElencoWsPk) _other;

		if (idElencoWs == null ? _cast.getIdElencoWs() != null : !idElencoWs.equals(_cast.getIdElencoWs())) {
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

		if (idElencoWs != null) {
			_hashCode = 29 * _hashCode + idElencoWs.hashCode();
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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTElencoWsPk: ");
		ret.append("idElencoWs=" + idElencoWs);

		return ret.toString();
	}
}
