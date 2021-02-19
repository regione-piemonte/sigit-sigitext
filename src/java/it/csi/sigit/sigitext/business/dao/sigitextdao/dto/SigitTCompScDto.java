package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompScDao.
 * @generated
 */
public class SigitTCompScDto extends SigitTCompScPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna DATA_DISMISS
	 * @generated
	 */
	protected java.sql.Date dataDismiss;

	/**
	 * Imposta il valore della proprieta' dataDismiss associata alla
	 * colonna DATA_DISMISS.
	 * @generated
	 */
	public void setDataDismiss(java.sql.Date val) {

		if (val != null) {
			dataDismiss = new java.sql.Date(val.getTime());
		} else {
			dataDismiss = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataDismiss associata alla
	 * @generated
	 */
	public java.sql.Date getDataDismiss() {

		if (dataDismiss != null) {
			return new java.sql.Date(dataDismiss.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna FLG_DISMISSIONE
	 * @generated
	 */
	protected java.math.BigDecimal flgDismissione;

	/**
	 * Imposta il valore della proprieta' flgDismissione associata alla
	 * colonna FLG_DISMISSIONE.
	 * @generated
	 */
	public void setFlgDismissione(java.math.BigDecimal val) {

		flgDismissione = val;

	}

	/**
	 * Legge il valore della proprieta' flgDismissione associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgDismissione() {

		return flgDismissione;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_ULT_MOD
	 * @generated
	 */
	protected java.sql.Timestamp dataUltMod;

	/**
	 * Imposta il valore della proprieta' dataUltMod associata alla
	 * colonna DATA_ULT_MOD.
	 * @generated
	 */
	public void setDataUltMod(java.sql.Timestamp val) {

		if (val != null) {
			dataUltMod = new java.sql.Timestamp(val.getTime());
		} else {
			dataUltMod = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataUltMod associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDataUltMod() {

		if (dataUltMod != null) {
			return new java.sql.Timestamp(dataUltMod.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna UTENTE_ULT_MOD
	 * @generated
	 */
	protected String utenteUltMod;

	/**
	 * Imposta il valore della proprieta' utenteUltMod associata alla
	 * colonna UTENTE_ULT_MOD.
	 * @generated
	 */
	public void setUtenteUltMod(String val) {

		utenteUltMod = val;

	}

	/**
	 * Legge il valore della proprieta' utenteUltMod associata alla
	 * @generated
	 */
	public String getUtenteUltMod() {

		return utenteUltMod;

	}

	/**
	 * store della proprieta' associata alla colonna FK_MARCA
	 * @generated
	 */
	protected java.math.BigDecimal fkMarca;

	/**
	 * Imposta il valore della proprieta' fkMarca associata alla
	 * colonna FK_MARCA.
	 * @generated
	 */
	public void setFkMarca(java.math.BigDecimal val) {

		fkMarca = val;

	}

	/**
	 * Legge il valore della proprieta' fkMarca associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkMarca() {

		return fkMarca;

	}

	/**
	 * store della proprieta' associata alla colonna MATRICOLA
	 * @generated
	 */
	protected String matricola;

	/**
	 * Imposta il valore della proprieta' matricola associata alla
	 * colonna MATRICOLA.
	 * @generated
	 */
	public void setMatricola(String val) {

		matricola = val;

	}

	/**
	 * Legge il valore della proprieta' matricola associata alla
	 * @generated
	 */
	public String getMatricola() {

		return matricola;

	}

	/**
	 * store della proprieta' associata alla colonna MODELLO
	 * @generated
	 */
	protected String modello;

	/**
	 * Imposta il valore della proprieta' modello associata alla
	 * colonna MODELLO.
	 * @generated
	 */
	public void setModello(String val) {

		modello = val;

	}

	/**
	 * Legge il valore della proprieta' modello associata alla
	 * @generated
	 */
	public String getModello() {

		return modello;

	}

	/**
	 * store della proprieta' associata alla colonna POTENZA_TERMICA_KW
	 * @generated
	 */
	protected java.math.BigDecimal potenzaTermicaKw;

	/**
	 * Imposta il valore della proprieta' potenzaTermicaKw associata alla
	 * colonna POTENZA_TERMICA_KW.
	 * @generated
	 */
	public void setPotenzaTermicaKw(java.math.BigDecimal val) {

		potenzaTermicaKw = val;

	}

	/**
	 * Legge il valore della proprieta' potenzaTermicaKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPotenzaTermicaKw() {

		return potenzaTermicaKw;

	}

	/**
	 * store della proprieta' associata alla colonna NOME_PROPRIETARIO
	 * @generated
	 */
	protected String nomeProprietario;

	/**
	 * Imposta il valore della proprieta' nomeProprietario associata alla
	 * colonna NOME_PROPRIETARIO.
	 * @generated
	 */
	public void setNomeProprietario(String val) {

		nomeProprietario = val;

	}

	/**
	 * Legge il valore della proprieta' nomeProprietario associata alla
	 * @generated
	 */
	public String getNomeProprietario() {

		return nomeProprietario;

	}

	/**
	 * store della proprieta' associata alla colonna CF_PROPRIETARIO
	 * @generated
	 */
	protected String cfProprietario;

	/**
	 * Imposta il valore della proprieta' cfProprietario associata alla
	 * colonna CF_PROPRIETARIO.
	 * @generated
	 */
	public void setCfProprietario(String val) {

		cfProprietario = val;

	}

	/**
	 * Legge il valore della proprieta' cfProprietario associata alla
	 * @generated
	 */
	public String getCfProprietario() {

		return cfProprietario;

	}

	/**
	 * store della proprieta' associata alla colonna NOTE
	 * @generated
	 */
	protected String note;

	/**
	 * Imposta il valore della proprieta' note associata alla
	 * colonna NOTE.
	 * @generated
	 */
	public void setNote(String val) {

		note = val;

	}

	/**
	 * Legge il valore della proprieta' note associata alla
	 * @generated
	 */
	public String getNote() {

		return note;

	}

	/**
	 * store della proprieta' associata alla colonna TEMPO_MANUT_ANNI
	 * @generated
	 */
	protected java.math.BigDecimal tempoManutAnni;

	/**
	 * Imposta il valore della proprieta' tempoManutAnni associata alla
	 * colonna TEMPO_MANUT_ANNI.
	 * @generated
	 */
	public void setTempoManutAnni(java.math.BigDecimal val) {

		tempoManutAnni = val;

	}

	/**
	 * Legge il valore della proprieta' tempoManutAnni associata alla
	 * @generated
	 */
	public java.math.BigDecimal getTempoManutAnni() {

		return tempoManutAnni;

	}

	/**
	 * Crea una istanza di SigitTCompScPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompScPk
	 * @generated
	 */
	public SigitTCompScPk createPk() {
		return new SigitTCompScPk(idTipoComponente, progressivo, dataInstall, codiceImpianto);
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
