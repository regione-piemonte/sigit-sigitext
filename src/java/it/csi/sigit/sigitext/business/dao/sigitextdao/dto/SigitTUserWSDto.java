package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTUserWSDao.
 * @generated
 */
public class SigitTUserWSDto extends SigitTUserWSPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna USER_WS
	 * @generated
	 */
	protected String userWs;

	/**
	 * Imposta il valore della proprieta' userWs associata alla
	 * colonna USER_WS.
	 * @generated
	 */
	public void setUserWs(String val) {

		userWs = val;

	}

	/**
	 * Legge il valore della proprieta' userWs associata alla
	 * @generated
	 */
	public String getUserWs() {

		return userWs;

	}

	/**
	 * store della proprieta' associata alla colonna PWD_WS
	 * @generated
	 */
	protected String pwdWs;

	/**
	 * Imposta il valore della proprieta' pwdWs associata alla
	 * colonna PWD_WS.
	 * @generated
	 */
	public void setPwdWs(String val) {

		pwdWs = val;

	}

	/**
	 * Legge il valore della proprieta' pwdWs associata alla
	 * @generated
	 */
	public String getPwdWs() {

		return pwdWs;

	}

	/**
	 * store della proprieta' associata alla colonna DT_CREAZIONE_TOKEN
	 * @generated
	 */
	protected java.sql.Date dtCreazioneToken;

	/**
	 * Imposta il valore della proprieta' dtCreazioneToken associata alla
	 * colonna DT_CREAZIONE_TOKEN.
	 * @generated
	 */
	public void setDtCreazioneToken(java.sql.Date val) {

		if (val != null) {
			dtCreazioneToken = new java.sql.Date(val.getTime());
		} else {
			dtCreazioneToken = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dtCreazioneToken associata alla
	 * @generated
	 */
	public java.sql.Date getDtCreazioneToken() {

		if (dtCreazioneToken != null) {
			return new java.sql.Date(dtCreazioneToken.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna DT_SCADENZA_TOKEN
	 * @generated
	 */
	protected java.sql.Date dtScadenzaToken;

	/**
	 * Imposta il valore della proprieta' dtScadenzaToken associata alla
	 * colonna DT_SCADENZA_TOKEN.
	 * @generated
	 */
	public void setDtScadenzaToken(java.sql.Date val) {

		if (val != null) {
			dtScadenzaToken = new java.sql.Date(val.getTime());
		} else {
			dtScadenzaToken = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dtScadenzaToken associata alla
	 * @generated
	 */
	public java.sql.Date getDtScadenzaToken() {

		if (dtScadenzaToken != null) {
			return new java.sql.Date(dtScadenzaToken.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna TOKEN
	 * @generated
	 */
	protected String token;

	/**
	 * Imposta il valore della proprieta' token associata alla
	 * colonna TOKEN.
	 * @generated
	 */
	public void setToken(String val) {

		token = val;

	}

	/**
	 * Legge il valore della proprieta' token associata alla
	 * @generated
	 */
	public String getToken() {

		return token;

	}

	/**
	 * Crea una istanza di SigitTUserWSPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTUserWSPk
	 * @generated
	 */
	public SigitTUserWSPk createPk() {
		return new SigitTUserWSPk(idUserWs);
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
