package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * DTO specifico della query modellata nel finder byCodiceImpianto.
 * @generated
 */
public class AllegatoByCodiceImpiantoDto implements Serializable {

	/*	 
	 * @generated
	 */
	private String tipodocDesTipoDocumento;

	/**
	 * @generated
	 */
	public void setTipodocDesTipoDocumento(String val) {

		tipodocDesTipoDocumento = val;

	}
	/**
	 * @generated
	 */
	public String getTipodocDesTipoDocumento() {

		return tipodocDesTipoDocumento;

	}

	/*	 
	 * @generated
	 */
	private String allegatoFkSiglaBollino;

	/**
	 * @generated
	 */
	public void setAllegatoFkSiglaBollino(String val) {

		allegatoFkSiglaBollino = val;

	}
	/**
	 * @generated
	 */
	public String getAllegatoFkSiglaBollino() {

		return allegatoFkSiglaBollino;

	}

	/*	 
	 * @generated
	 */
	private java.math.BigDecimal allegatoFkNumeroBollino;

	/**
	 * @generated
	 */
	public void setAllegatoFkNumeroBollino(java.math.BigDecimal val) {

		allegatoFkNumeroBollino = val;

	}
	/**
	 * @generated
	 */
	public java.math.BigDecimal getAllegatoFkNumeroBollino() {

		return allegatoFkNumeroBollino;

	}

	/*	 
	 * @generated
	 */
	private java.sql.Date allegatoDataControllo;

	/**
	 * @generated
	 */
	public void setAllegatoDataControllo(java.sql.Date val) {

		if (val != null) {
			allegatoDataControllo = new java.sql.Date(val.getTime());
		} else {
			allegatoDataControllo = null;
		}

	}
	/**
	 * @generated
	 */
	public java.sql.Date getAllegatoDataControllo() {

		if (allegatoDataControllo != null) {
			return new java.sql.Date(allegatoDataControllo.getTime());
		} else {
			return null;
		}

	}

	/*	 
	 * @generated
	 */
	private String allegatoElencoApparecchiature;

	/**
	 * @generated
	 */
	public void setAllegatoElencoApparecchiature(String val) {

		allegatoElencoApparecchiature = val;

	}
	/**
	 * @generated
	 */
	public String getAllegatoElencoApparecchiature() {

		return allegatoElencoApparecchiature;

	}

	/*	 
	 * @generated
	 */
	private String allegatoUidIndex;

	/**
	 * @generated
	 */
	public void setAllegatoUidIndex(String val) {

		allegatoUidIndex = val;

	}
	/**
	 * @generated
	 */
	public String getAllegatoUidIndex() {

		return allegatoUidIndex;

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
