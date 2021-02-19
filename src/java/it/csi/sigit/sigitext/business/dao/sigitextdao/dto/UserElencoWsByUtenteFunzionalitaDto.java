package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * DTO specifico della query modellata nel finder byUtenteFunzionalita.
 * @generated
 */
public class UserElencoWsByUtenteFunzionalitaDto implements Serializable {

	/*	 
	 * @generated
	 */
	private Integer utenteIdUserWs;

	/**
	 * @generated
	 */
	public void setUtenteIdUserWs(Integer val) {

		utenteIdUserWs = val;

	}
	/**
	 * @generated
	 */
	public Integer getUtenteIdUserWs() {

		return utenteIdUserWs;

	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 * @generated
	 */
	public boolean equals(Object _other) {
		return super.equals(_other);
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 * @generated
	 */
	public int hashCode() {
		return super.hashCode();
	}

}
