package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitVSk4CgDao.
 * @generated
 */
public class SigitVSk4CgDto implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna CODICE_IMPIANTO
	 * @generated
	 */
	protected java.math.BigDecimal codiceImpianto;

	/**
	 * Imposta il valore della proprieta' codiceImpianto associata alla
	 * colonna CODICE_IMPIANTO.
	 * @generated
	 */
	public void setCodiceImpianto(java.math.BigDecimal val) {

		codiceImpianto = val;

	}

	/**
	 * Legge il valore della proprieta' codiceImpianto associata alla
	 * @generated
	 */
	public java.math.BigDecimal getCodiceImpianto() {

		return codiceImpianto;

	}

	/**
	 * store della proprieta' associata alla colonna ID_TIPO_COMPONENTE
	 * @generated
	 */
	protected String idTipoComponente;

	/**
	 * Imposta il valore della proprieta' idTipoComponente associata alla
	 * colonna ID_TIPO_COMPONENTE.
	 * @generated
	 */
	public void setIdTipoComponente(String val) {

		idTipoComponente = val;

	}

	/**
	 * Legge il valore della proprieta' idTipoComponente associata alla
	 * @generated
	 */
	public String getIdTipoComponente() {

		return idTipoComponente;

	}

	/**
	 * store della proprieta' associata alla colonna PROGRESSIVO
	 * @generated
	 */
	protected java.math.BigDecimal progressivo;

	/**
	 * Imposta il valore della proprieta' progressivo associata alla
	 * colonna PROGRESSIVO.
	 * @generated
	 */
	public void setProgressivo(java.math.BigDecimal val) {

		progressivo = val;

	}

	/**
	 * Legge il valore della proprieta' progressivo associata alla
	 * @generated
	 */
	public java.math.BigDecimal getProgressivo() {

		return progressivo;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_INSTALL
	 * @generated
	 */
	protected java.sql.Date dataInstall;

	/**
	 * Imposta il valore della proprieta' dataInstall associata alla
	 * colonna DATA_INSTALL.
	 * @generated
	 */
	public void setDataInstall(java.sql.Date val) {

		if (val != null) {
			dataInstall = new java.sql.Date(val.getTime());
		} else {
			dataInstall = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataInstall associata alla
	 * @generated
	 */
	public java.sql.Date getDataInstall() {

		if (dataInstall != null) {
			return new java.sql.Date(dataInstall.getTime());
		} else {
			return null;
		}

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
	 * store della proprieta' associata alla colonna DES_MARCA
	 * @generated
	 */
	protected String desMarca;

	/**
	 * Imposta il valore della proprieta' desMarca associata alla
	 * colonna DES_MARCA.
	 * @generated
	 */
	public void setDesMarca(String val) {

		desMarca = val;

	}

	/**
	 * Legge il valore della proprieta' desMarca associata alla
	 * @generated
	 */
	public String getDesMarca() {

		return desMarca;

	}

	/**
	 * store della proprieta' associata alla colonna ID_COMBUSTIBILE
	 * @generated
	 */
	protected java.math.BigDecimal idCombustibile;

	/**
	 * Imposta il valore della proprieta' idCombustibile associata alla
	 * colonna ID_COMBUSTIBILE.
	 * @generated
	 */
	public void setIdCombustibile(java.math.BigDecimal val) {

		idCombustibile = val;

	}

	/**
	 * Legge il valore della proprieta' idCombustibile associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdCombustibile() {

		return idCombustibile;

	}

	/**
	 * store della proprieta' associata alla colonna DES_COMBUSTIBILE
	 * @generated
	 */
	protected String desCombustibile;

	/**
	 * Imposta il valore della proprieta' desCombustibile associata alla
	 * colonna DES_COMBUSTIBILE.
	 * @generated
	 */
	public void setDesCombustibile(String val) {

		desCombustibile = val;

	}

	/**
	 * Legge il valore della proprieta' desCombustibile associata alla
	 * @generated
	 */
	public String getDesCombustibile() {

		return desCombustibile;

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
	 * store della proprieta' associata alla colonna DATA_CONTROLLO
	 * @generated
	 */
	protected java.sql.Date dataControllo;

	/**
	 * Imposta il valore della proprieta' dataControllo associata alla
	 * colonna DATA_CONTROLLO.
	 * @generated
	 */
	public void setDataControllo(java.sql.Date val) {

		if (val != null) {
			dataControllo = new java.sql.Date(val.getTime());
		} else {
			dataControllo = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataControllo associata alla
	 * @generated
	 */
	public java.sql.Date getDataControllo() {

		if (dataControllo != null) {
			return new java.sql.Date(dataControllo.getTime());
		} else {
			return null;
		}

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
	 * store della proprieta' associata alla colonna ID_ALLEGATO
	 * @generated
	 */
	protected java.math.BigDecimal idAllegato;

	/**
	 * Imposta il valore della proprieta' idAllegato associata alla
	 * colonna ID_ALLEGATO.
	 * @generated
	 */
	public void setIdAllegato(java.math.BigDecimal val) {

		idAllegato = val;

	}

	/**
	 * Legge il valore della proprieta' idAllegato associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdAllegato() {

		return idAllegato;

	}

	/**
	 * store della proprieta' associata alla colonna FK_TIPO_DOCUMENTO
	 * @generated
	 */
	protected java.math.BigDecimal fkTipoDocumento;

	/**
	 * Imposta il valore della proprieta' fkTipoDocumento associata alla
	 * colonna FK_TIPO_DOCUMENTO.
	 * @generated
	 */
	public void setFkTipoDocumento(java.math.BigDecimal val) {

		fkTipoDocumento = val;

	}

	/**
	 * Legge il valore della proprieta' fkTipoDocumento associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkTipoDocumento() {

		return fkTipoDocumento;

	}

	/**
	 * store della proprieta' associata alla colonna DES_TIPO_DOCUMENTO
	 * @generated
	 */
	protected String desTipoDocumento;

	/**
	 * Imposta il valore della proprieta' desTipoDocumento associata alla
	 * colonna DES_TIPO_DOCUMENTO.
	 * @generated
	 */
	public void setDesTipoDocumento(String val) {

		desTipoDocumento = val;

	}

	/**
	 * Legge il valore della proprieta' desTipoDocumento associata alla
	 * @generated
	 */
	public String getDesTipoDocumento() {

		return desTipoDocumento;

	}

}
