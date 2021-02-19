package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * DTO specifico della query modellata nel finder consByCodiceImpianto.
 * @generated
 */
public class SigitVRicercaIspezioniConsByCodiceImpiantoDto implements Serializable {

	/*	 
	 * @generated
	 */
	private java.math.BigDecimal idIspezione2018;

	/**
	 * @generated
	 */
	public void setIdIspezione2018(java.math.BigDecimal val) {

		idIspezione2018 = val;

	}

	/**
	 * @generated
	 */
	public java.math.BigDecimal getIdIspezione2018() {

		return idIspezione2018;

	}

	/*	 
	 * @generated
	 */
	private java.sql.Timestamp dtCreazione;

	/**
	 * @generated
	 */
	public void setDtCreazione(java.sql.Timestamp val) {

		if (val != null) {
			dtCreazione = new java.sql.Timestamp(val.getTime());
		} else {
			dtCreazione = null;
		}

	}

	/**
	 * @generated
	 */
	public java.sql.Timestamp getDtCreazione() {

		if (dtCreazione != null) {
			return new java.sql.Timestamp(dtCreazione.getTime());
		} else {
			return null;
		}

	}

	/*	 
	 * @generated
	 */
	private String enteCompetente;

	/**
	 * @generated
	 */
	public void setEnteCompetente(String val) {

		enteCompetente = val;

	}

	/**
	 * @generated
	 */
	public String getEnteCompetente() {

		return enteCompetente;

	}

	/*	 
	 * @generated
	 */
	private String note;

	/**
	 * @generated
	 */
	public void setNote(String val) {

		note = val;

	}

	/**
	 * @generated
	 */
	public String getNote() {

		return note;

	}

	/*	 
	 * @generated
	 */
	private java.math.BigDecimal flgEsito;

	/**
	 * @generated
	 */
	public void setFlgEsito(java.math.BigDecimal val) {

		flgEsito = val;

	}

	/**
	 * @generated
	 */
	public java.math.BigDecimal getFlgEsito() {

		return flgEsito;

	}

	/**	 
	* @generated
	*/
	private java.math.BigDecimal max_id_ispez_ispet;

	/**
	* @generated
	*/
	public void setMax_id_ispez_ispet(java.math.BigDecimal val) {

		max_id_ispez_ispet = val;

	}
	/**
	* @generated
	*/
	public java.math.BigDecimal getMax_id_ispez_ispet() {

		return max_id_ispez_ispet;

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
