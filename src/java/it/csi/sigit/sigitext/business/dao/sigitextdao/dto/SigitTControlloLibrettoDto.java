package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTControlloLibrettoDao.
 * @generated
 */
public class SigitTControlloLibrettoDto extends SigitTControlloLibrettoPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna FLG_L1_CONTROLLOWEB
	 * @generated
	 */
	protected java.math.BigDecimal flgL1Controlloweb;

	/**
	 * Imposta il valore della proprieta' flgL1Controlloweb associata alla
	 * colonna FLG_L1_CONTROLLOWEB.
	 * @generated
	 */
	public void setFlgL1Controlloweb(java.math.BigDecimal val) {

		flgL1Controlloweb = val;

	}

	/**
	 * Legge il valore della proprieta' flgL1Controlloweb associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgL1Controlloweb() {

		return flgL1Controlloweb;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_L5_CONTROLLOWEB
	 * @generated
	 */
	protected java.math.BigDecimal flgL5Controlloweb;

	/**
	 * Imposta il valore della proprieta' flgL5Controlloweb associata alla
	 * colonna FLG_L5_CONTROLLOWEB.
	 * @generated
	 */
	public void setFlgL5Controlloweb(java.math.BigDecimal val) {

		flgL5Controlloweb = val;

	}

	/**
	 * Legge il valore della proprieta' flgL5Controlloweb associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgL5Controlloweb() {

		return flgL5Controlloweb;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_L6_CONTROLLOWEB
	 * @generated
	 */
	protected java.math.BigDecimal flgL6Controlloweb;

	/**
	 * Imposta il valore della proprieta' flgL6Controlloweb associata alla
	 * colonna FLG_L6_CONTROLLOWEB.
	 * @generated
	 */
	public void setFlgL6Controlloweb(java.math.BigDecimal val) {

		flgL6Controlloweb = val;

	}

	/**
	 * Legge il valore della proprieta' flgL6Controlloweb associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgL6Controlloweb() {

		return flgL6Controlloweb;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_L7_CONTROLLOWEB
	 * @generated
	 */
	protected java.math.BigDecimal flgL7Controlloweb;

	/**
	 * Imposta il valore della proprieta' flgL7Controlloweb associata alla
	 * colonna FLG_L7_CONTROLLOWEB.
	 * @generated
	 */
	public void setFlgL7Controlloweb(java.math.BigDecimal val) {

		flgL7Controlloweb = val;

	}

	/**
	 * Legge il valore della proprieta' flgL7Controlloweb associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgL7Controlloweb() {

		return flgL7Controlloweb;

	}

	/**
	 * store della proprieta' associata alla colonna DT_ULT_MOD
	 * @generated
	 */
	protected java.sql.Timestamp dtUltMod;

	/**
	 * Imposta il valore della proprieta' dtUltMod associata alla
	 * colonna DT_ULT_MOD.
	 * @generated
	 */
	public void setDtUltMod(java.sql.Timestamp val) {

		if (val != null) {
			dtUltMod = new java.sql.Timestamp(val.getTime());
		} else {
			dtUltMod = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dtUltMod associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDtUltMod() {

		if (dtUltMod != null) {
			return new java.sql.Timestamp(dtUltMod.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna UTENTE_ULT_AGG
	 * @generated
	 */
	protected String utenteUltAgg;

	/**
	 * Imposta il valore della proprieta' utenteUltAgg associata alla
	 * colonna UTENTE_ULT_AGG.
	 * @generated
	 */
	public void setUtenteUltAgg(String val) {

		utenteUltAgg = val;

	}

	/**
	 * Legge il valore della proprieta' utenteUltAgg associata alla
	 * @generated
	 */
	public String getUtenteUltAgg() {

		return utenteUltAgg;

	}

	/**
	 * Crea una istanza di SigitTControlloLibrettoPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTControlloLibrettoPk
	 * @generated
	 */
	public SigitTControlloLibrettoPk createPk() {
		return new SigitTControlloLibrettoPk(codiceImpianto);
	}

	/**
	 * la semantica dell'equals del DTO e' la stessa della PK
	 * (ovvero della superclasse).
	 * @param other l'oggetto con cui effettuare il confronto
	 * @return true se i due oggetti sono semanticamente da considerarsi uguali
	 */
	public boolean equals(Object other) {
		return super.equals(other);
	}

	/**
	 * la semantica dell'hashCode del DTO e' la stessa della PK
	 * (ovvero della superclasse).
	 * 
	 * @return int
	 */
	public int hashCode() {
		return super.hashCode();
	}

}
