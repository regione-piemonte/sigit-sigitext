package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO UserElencoWsDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class UserElencoWsPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_USER_WS
	 * @generated
	 */
	protected Integer idUserWs;

	/**
	 * Imposta il valore della proprieta' idUserWs associata alla
	 * colonna ID_USER_WS.
	 * @generated
	 */
	public void setIdUserWs(Integer val) {

		idUserWs = val;

	}

	/**
	 * Legge il valore della proprieta' idUserWs associata alla
	 * @generated
	 */
	public Integer getIdUserWs() {

		return idUserWs;

	}

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
	public UserElencoWsPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public UserElencoWsPk(

			final Integer idUserWs, final Integer idElencoWs

	) {

		this.setIdUserWs(idUserWs);

		this.setIdElencoWs(idElencoWs);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di UserElencoWsPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof UserElencoWsPk)) {
			return false;
		}

		final UserElencoWsPk _cast = (UserElencoWsPk) _other;

		if (idUserWs == null ? _cast.getIdUserWs() != null : !idUserWs.equals(_cast.getIdUserWs())) {
			return false;
		}

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

		if (idUserWs != null) {
			_hashCode = 29 * _hashCode + idUserWs.hashCode();
		}

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

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.UserElencoWsPk: ");
		ret.append("idUserWs=" + idUserWs);

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.UserElencoWsPk: ");
		ret.append("idElencoWs=" + idElencoWs);

		return ret.toString();
	}
}
