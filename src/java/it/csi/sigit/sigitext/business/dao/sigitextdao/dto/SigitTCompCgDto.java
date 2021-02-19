package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompCgDao.
 * @generated
 */
public class SigitTCompCgDto extends SigitTCompCgPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna TIPOLOGIA
	 * @generated
	 */
	protected String tipologia;

	/**
	 * Imposta il valore della proprieta' tipologia associata alla
	 * colonna TIPOLOGIA.
	 * @generated
	 */
	public void setTipologia(String val) {

		tipologia = val;

	}

	/**
	 * Legge il valore della proprieta' tipologia associata alla
	 * @generated
	 */
	public String getTipologia() {

		return tipologia;

	}

	/**
	 * store della proprieta' associata alla colonna POTENZA_ELETTRICA_KW
	 * @generated
	 */
	protected java.math.BigDecimal potenzaElettricaKw;

	/**
	 * Imposta il valore della proprieta' potenzaElettricaKw associata alla
	 * colonna POTENZA_ELETTRICA_KW.
	 * @generated
	 */
	public void setPotenzaElettricaKw(java.math.BigDecimal val) {

		potenzaElettricaKw = val;

	}

	/**
	 * Legge il valore della proprieta' potenzaElettricaKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPotenzaElettricaKw() {

		return potenzaElettricaKw;

	}

	/**
	 * store della proprieta' associata alla colonna TEMP_H2O_OUT_MIN
	 * @generated
	 */
	protected java.math.BigDecimal tempH2oOutMin;

	/**
	 * Imposta il valore della proprieta' tempH2oOutMin associata alla
	 * colonna TEMP_H2O_OUT_MIN.
	 * @generated
	 */
	public void setTempH2oOutMin(java.math.BigDecimal val) {

		tempH2oOutMin = val;

	}

	/**
	 * Legge il valore della proprieta' tempH2oOutMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getTempH2oOutMin() {

		return tempH2oOutMin;

	}

	/**
	 * store della proprieta' associata alla colonna TEMP_H2O_OUT_MAX
	 * @generated
	 */
	protected java.math.BigDecimal tempH2oOutMax;

	/**
	 * Imposta il valore della proprieta' tempH2oOutMax associata alla
	 * colonna TEMP_H2O_OUT_MAX.
	 * @generated
	 */
	public void setTempH2oOutMax(java.math.BigDecimal val) {

		tempH2oOutMax = val;

	}

	/**
	 * Legge il valore della proprieta' tempH2oOutMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getTempH2oOutMax() {

		return tempH2oOutMax;

	}

	/**
	 * store della proprieta' associata alla colonna TEMP_H2O_IN_MIN
	 * @generated
	 */
	protected java.math.BigDecimal tempH2oInMin;

	/**
	 * Imposta il valore della proprieta' tempH2oInMin associata alla
	 * colonna TEMP_H2O_IN_MIN.
	 * @generated
	 */
	public void setTempH2oInMin(java.math.BigDecimal val) {

		tempH2oInMin = val;

	}

	/**
	 * Legge il valore della proprieta' tempH2oInMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getTempH2oInMin() {

		return tempH2oInMin;

	}

	/**
	 * store della proprieta' associata alla colonna TEMP_H2O_IN_MAX
	 * @generated
	 */
	protected java.math.BigDecimal tempH2oInMax;

	/**
	 * Imposta il valore della proprieta' tempH2oInMax associata alla
	 * colonna TEMP_H2O_IN_MAX.
	 * @generated
	 */
	public void setTempH2oInMax(java.math.BigDecimal val) {

		tempH2oInMax = val;

	}

	/**
	 * Legge il valore della proprieta' tempH2oInMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getTempH2oInMax() {

		return tempH2oInMax;

	}

	/**
	 * store della proprieta' associata alla colonna TEMP_H2O_MOTORE_MIN
	 * @generated
	 */
	protected java.math.BigDecimal tempH2oMotoreMin;

	/**
	 * Imposta il valore della proprieta' tempH2oMotoreMin associata alla
	 * colonna TEMP_H2O_MOTORE_MIN.
	 * @generated
	 */
	public void setTempH2oMotoreMin(java.math.BigDecimal val) {

		tempH2oMotoreMin = val;

	}

	/**
	 * Legge il valore della proprieta' tempH2oMotoreMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getTempH2oMotoreMin() {

		return tempH2oMotoreMin;

	}

	/**
	 * store della proprieta' associata alla colonna TEMP_H2O_MOTORE_MAX
	 * @generated
	 */
	protected java.math.BigDecimal tempH2oMotoreMax;

	/**
	 * Imposta il valore della proprieta' tempH2oMotoreMax associata alla
	 * colonna TEMP_H2O_MOTORE_MAX.
	 * @generated
	 */
	public void setTempH2oMotoreMax(java.math.BigDecimal val) {

		tempH2oMotoreMax = val;

	}

	/**
	 * Legge il valore della proprieta' tempH2oMotoreMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getTempH2oMotoreMax() {

		return tempH2oMotoreMax;

	}

	/**
	 * store della proprieta' associata alla colonna TEMP_FUMI_VALLE_MIN
	 * @generated
	 */
	protected java.math.BigDecimal tempFumiValleMin;

	/**
	 * Imposta il valore della proprieta' tempFumiValleMin associata alla
	 * colonna TEMP_FUMI_VALLE_MIN.
	 * @generated
	 */
	public void setTempFumiValleMin(java.math.BigDecimal val) {

		tempFumiValleMin = val;

	}

	/**
	 * Legge il valore della proprieta' tempFumiValleMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getTempFumiValleMin() {

		return tempFumiValleMin;

	}

	/**
	 * store della proprieta' associata alla colonna TEMP_FUMI_VALLE_MAX
	 * @generated
	 */
	protected java.math.BigDecimal tempFumiValleMax;

	/**
	 * Imposta il valore della proprieta' tempFumiValleMax associata alla
	 * colonna TEMP_FUMI_VALLE_MAX.
	 * @generated
	 */
	public void setTempFumiValleMax(java.math.BigDecimal val) {

		tempFumiValleMax = val;

	}

	/**
	 * Legge il valore della proprieta' tempFumiValleMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getTempFumiValleMax() {

		return tempFumiValleMax;

	}

	/**
	 * store della proprieta' associata alla colonna TEMP_FUMI_MONTE_MIN
	 * @generated
	 */
	protected java.math.BigDecimal tempFumiMonteMin;

	/**
	 * Imposta il valore della proprieta' tempFumiMonteMin associata alla
	 * colonna TEMP_FUMI_MONTE_MIN.
	 * @generated
	 */
	public void setTempFumiMonteMin(java.math.BigDecimal val) {

		tempFumiMonteMin = val;

	}

	/**
	 * Legge il valore della proprieta' tempFumiMonteMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getTempFumiMonteMin() {

		return tempFumiMonteMin;

	}

	/**
	 * store della proprieta' associata alla colonna TEMP_FUMI_MONTE_MAX
	 * @generated
	 */
	protected java.math.BigDecimal tempFumiMonteMax;

	/**
	 * Imposta il valore della proprieta' tempFumiMonteMax associata alla
	 * colonna TEMP_FUMI_MONTE_MAX.
	 * @generated
	 */
	public void setTempFumiMonteMax(java.math.BigDecimal val) {

		tempFumiMonteMax = val;

	}

	/**
	 * Legge il valore della proprieta' tempFumiMonteMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getTempFumiMonteMax() {

		return tempFumiMonteMax;

	}

	/**
	 * store della proprieta' associata alla colonna CO_MIN
	 * @generated
	 */
	protected java.math.BigDecimal coMin;

	/**
	 * Imposta il valore della proprieta' coMin associata alla
	 * colonna CO_MIN.
	 * @generated
	 */
	public void setCoMin(java.math.BigDecimal val) {

		coMin = val;

	}

	/**
	 * Legge il valore della proprieta' coMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getCoMin() {

		return coMin;

	}

	/**
	 * store della proprieta' associata alla colonna CO_MAX
	 * @generated
	 */
	protected java.math.BigDecimal coMax;

	/**
	 * Imposta il valore della proprieta' coMax associata alla
	 * colonna CO_MAX.
	 * @generated
	 */
	public void setCoMax(java.math.BigDecimal val) {

		coMax = val;

	}

	/**
	 * Legge il valore della proprieta' coMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getCoMax() {

		return coMax;

	}

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
	 * store della proprieta' associata alla colonna FK_COMBUSTIBILE
	 * @generated
	 */
	protected java.math.BigDecimal fkCombustibile;

	/**
	 * Imposta il valore della proprieta' fkCombustibile associata alla
	 * colonna FK_COMBUSTIBILE.
	 * @generated
	 */
	public void setFkCombustibile(java.math.BigDecimal val) {

		fkCombustibile = val;

	}

	/**
	 * Legge il valore della proprieta' fkCombustibile associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkCombustibile() {

		return fkCombustibile;

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
	 * store della proprieta' associata alla colonna ALIMENTAZIONE
	 * @generated
	 */
	protected String alimentazione;

	/**
	 * Imposta il valore della proprieta' alimentazione associata alla
	 * colonna ALIMENTAZIONE.
	 * @generated
	 */
	public void setAlimentazione(String val) {

		alimentazione = val;

	}

	/**
	 * Legge il valore della proprieta' alimentazione associata alla
	 * @generated
	 */
	public String getAlimentazione() {

		return alimentazione;

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
	 * Crea una istanza di SigitTCompCgPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompCgPk
	 * @generated
	 */
	public SigitTCompCgPk createPk() {
		return new SigitTCompCgPk(idTipoComponente, progressivo, dataInstall, codiceImpianto);
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
