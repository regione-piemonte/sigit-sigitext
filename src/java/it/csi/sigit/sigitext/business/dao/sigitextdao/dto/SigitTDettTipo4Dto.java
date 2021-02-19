package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTDettTipo4Dao.
 * @generated
 */
public class SigitTDettTipo4Dto extends SigitTDettTipo4Pk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna FK_ALLEGATO
	 * @generated
	 */
	protected java.math.BigDecimal fkAllegato;

	/**
	 * Imposta il valore della proprieta' fkAllegato associata alla
	 * colonna FK_ALLEGATO.
	 * @generated
	 */
	public void setFkAllegato(java.math.BigDecimal val) {

		fkAllegato = val;

	}

	/**
	 * Legge il valore della proprieta' fkAllegato associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkAllegato() {

		return fkAllegato;

	}

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
	 * store della proprieta' associata alla colonna FK_TIPO_COMPONENTE
	 * @generated
	 */
	protected String fkTipoComponente;

	/**
	 * Imposta il valore della proprieta' fkTipoComponente associata alla
	 * colonna FK_TIPO_COMPONENTE.
	 * @generated
	 */
	public void setFkTipoComponente(String val) {

		fkTipoComponente = val;

	}

	/**
	 * Legge il valore della proprieta' fkTipoComponente associata alla
	 * @generated
	 */
	public String getFkTipoComponente() {

		return fkTipoComponente;

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
	 * store della proprieta' associata alla colonna FK_FLUIDO
	 * @generated
	 */
	protected java.math.BigDecimal fkFluido;

	/**
	 * Imposta il valore della proprieta' fkFluido associata alla
	 * colonna FK_FLUIDO.
	 * @generated
	 */
	public void setFkFluido(java.math.BigDecimal val) {

		fkFluido = val;

	}

	/**
	 * Legge il valore della proprieta' fkFluido associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkFluido() {

		return fkFluido;

	}

	/**
	 * store della proprieta' associata alla colonna E_POTENZA_ASSORB_COMB_KW
	 * @generated
	 */
	protected java.math.BigDecimal ePotenzaAssorbCombKw;

	/**
	 * Imposta il valore della proprieta' ePotenzaAssorbCombKw associata alla
	 * colonna E_POTENZA_ASSORB_COMB_KW.
	 * @generated
	 */
	public void setEPotenzaAssorbCombKw(java.math.BigDecimal val) {

		ePotenzaAssorbCombKw = val;

	}

	/**
	 * Legge il valore della proprieta' ePotenzaAssorbCombKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEPotenzaAssorbCombKw() {

		return ePotenzaAssorbCombKw;

	}

	/**
	 * store della proprieta' associata alla colonna E_POTENZA_TERM_BYPASS_KW
	 * @generated
	 */
	protected java.math.BigDecimal ePotenzaTermBypassKw;

	/**
	 * Imposta il valore della proprieta' ePotenzaTermBypassKw associata alla
	 * colonna E_POTENZA_TERM_BYPASS_KW.
	 * @generated
	 */
	public void setEPotenzaTermBypassKw(java.math.BigDecimal val) {

		ePotenzaTermBypassKw = val;

	}

	/**
	 * Legge il valore della proprieta' ePotenzaTermBypassKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEPotenzaTermBypassKw() {

		return ePotenzaTermBypassKw;

	}

	/**
	 * store della proprieta' associata alla colonna E_TEMP_ARIA_C
	 * @generated
	 */
	protected java.math.BigDecimal eTempAriaC;

	/**
	 * Imposta il valore della proprieta' eTempAriaC associata alla
	 * colonna E_TEMP_ARIA_C.
	 * @generated
	 */
	public void setETempAriaC(java.math.BigDecimal val) {

		eTempAriaC = val;

	}

	/**
	 * Legge il valore della proprieta' eTempAriaC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETempAriaC() {

		return eTempAriaC;

	}

	/**
	 * store della proprieta' associata alla colonna E_TEMP_H2O_OUT_C
	 * @generated
	 */
	protected java.math.BigDecimal eTempH2oOutC;

	/**
	 * Imposta il valore della proprieta' eTempH2oOutC associata alla
	 * colonna E_TEMP_H2O_OUT_C.
	 * @generated
	 */
	public void setETempH2oOutC(java.math.BigDecimal val) {

		eTempH2oOutC = val;

	}

	/**
	 * Legge il valore della proprieta' eTempH2oOutC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETempH2oOutC() {

		return eTempH2oOutC;

	}

	/**
	 * store della proprieta' associata alla colonna E_TEMP_H2O_IN_C
	 * @generated
	 */
	protected java.math.BigDecimal eTempH2oInC;

	/**
	 * Imposta il valore della proprieta' eTempH2oInC associata alla
	 * colonna E_TEMP_H2O_IN_C.
	 * @generated
	 */
	public void setETempH2oInC(java.math.BigDecimal val) {

		eTempH2oInC = val;

	}

	/**
	 * Legge il valore della proprieta' eTempH2oInC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETempH2oInC() {

		return eTempH2oInC;

	}

	/**
	 * store della proprieta' associata alla colonna E_POTENZA_MORSETTI_KW
	 * @generated
	 */
	protected java.math.BigDecimal ePotenzaMorsettiKw;

	/**
	 * Imposta il valore della proprieta' ePotenzaMorsettiKw associata alla
	 * colonna E_POTENZA_MORSETTI_KW.
	 * @generated
	 */
	public void setEPotenzaMorsettiKw(java.math.BigDecimal val) {

		ePotenzaMorsettiKw = val;

	}

	/**
	 * Legge il valore della proprieta' ePotenzaMorsettiKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEPotenzaMorsettiKw() {

		return ePotenzaMorsettiKw;

	}

	/**
	 * store della proprieta' associata alla colonna E_TEMP_H2O_MOTORE_C
	 * @generated
	 */
	protected java.math.BigDecimal eTempH2oMotoreC;

	/**
	 * Imposta il valore della proprieta' eTempH2oMotoreC associata alla
	 * colonna E_TEMP_H2O_MOTORE_C.
	 * @generated
	 */
	public void setETempH2oMotoreC(java.math.BigDecimal val) {

		eTempH2oMotoreC = val;

	}

	/**
	 * Legge il valore della proprieta' eTempH2oMotoreC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETempH2oMotoreC() {

		return eTempH2oMotoreC;

	}

	/**
	 * store della proprieta' associata alla colonna E_TEMP_FUMI_VALLE_C
	 * @generated
	 */
	protected java.math.BigDecimal eTempFumiValleC;

	/**
	 * Imposta il valore della proprieta' eTempFumiValleC associata alla
	 * colonna E_TEMP_FUMI_VALLE_C.
	 * @generated
	 */
	public void setETempFumiValleC(java.math.BigDecimal val) {

		eTempFumiValleC = val;

	}

	/**
	 * Legge il valore della proprieta' eTempFumiValleC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETempFumiValleC() {

		return eTempFumiValleC;

	}

	/**
	 * store della proprieta' associata alla colonna E_TEMP_FUMI_MONTE_C
	 * @generated
	 */
	protected java.math.BigDecimal eTempFumiMonteC;

	/**
	 * Imposta il valore della proprieta' eTempFumiMonteC associata alla
	 * colonna E_TEMP_FUMI_MONTE_C.
	 * @generated
	 */
	public void setETempFumiMonteC(java.math.BigDecimal val) {

		eTempFumiMonteC = val;

	}

	/**
	 * Legge il valore della proprieta' eTempFumiMonteC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETempFumiMonteC() {

		return eTempFumiMonteC;

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
	 * store della proprieta' associata alla colonna L11_4_SOVRAFREQ_SOGLIA_HZ_MIN
	 * @generated
	 */
	protected java.math.BigDecimal l114SovrafreqSogliaHzMin;

	/**
	 * Imposta il valore della proprieta' l114SovrafreqSogliaHzMin associata alla
	 * colonna L11_4_SOVRAFREQ_SOGLIA_HZ_MIN.
	 * @generated
	 */
	public void setL114SovrafreqSogliaHzMin(java.math.BigDecimal val) {

		l114SovrafreqSogliaHzMin = val;

	}

	/**
	 * Legge il valore della proprieta' l114SovrafreqSogliaHzMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SovrafreqSogliaHzMin() {

		return l114SovrafreqSogliaHzMin;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOVRAFREQ_SOGLIA_HZ_MED
	 * @generated
	 */
	protected java.math.BigDecimal l114SovrafreqSogliaHzMed;

	/**
	 * Imposta il valore della proprieta' l114SovrafreqSogliaHzMed associata alla
	 * colonna L11_4_SOVRAFREQ_SOGLIA_HZ_MED.
	 * @generated
	 */
	public void setL114SovrafreqSogliaHzMed(java.math.BigDecimal val) {

		l114SovrafreqSogliaHzMed = val;

	}

	/**
	 * Legge il valore della proprieta' l114SovrafreqSogliaHzMed associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SovrafreqSogliaHzMed() {

		return l114SovrafreqSogliaHzMed;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOVRAFREQ_SOGLIA_HZ_MAX
	 * @generated
	 */
	protected java.math.BigDecimal l114SovrafreqSogliaHzMax;

	/**
	 * Imposta il valore della proprieta' l114SovrafreqSogliaHzMax associata alla
	 * colonna L11_4_SOVRAFREQ_SOGLIA_HZ_MAX.
	 * @generated
	 */
	public void setL114SovrafreqSogliaHzMax(java.math.BigDecimal val) {

		l114SovrafreqSogliaHzMax = val;

	}

	/**
	 * Legge il valore della proprieta' l114SovrafreqSogliaHzMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SovrafreqSogliaHzMax() {

		return l114SovrafreqSogliaHzMax;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOVRAFREQ_TEMPO_S_MIN
	 * @generated
	 */
	protected java.math.BigDecimal l114SovrafreqTempoSMin;

	/**
	 * Imposta il valore della proprieta' l114SovrafreqTempoSMin associata alla
	 * colonna L11_4_SOVRAFREQ_TEMPO_S_MIN.
	 * @generated
	 */
	public void setL114SovrafreqTempoSMin(java.math.BigDecimal val) {

		l114SovrafreqTempoSMin = val;

	}

	/**
	 * Legge il valore della proprieta' l114SovrafreqTempoSMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SovrafreqTempoSMin() {

		return l114SovrafreqTempoSMin;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOVRAFREQ_TEMPO_S_MED
	 * @generated
	 */
	protected java.math.BigDecimal l114SovrafreqTempoSMed;

	/**
	 * Imposta il valore della proprieta' l114SovrafreqTempoSMed associata alla
	 * colonna L11_4_SOVRAFREQ_TEMPO_S_MED.
	 * @generated
	 */
	public void setL114SovrafreqTempoSMed(java.math.BigDecimal val) {

		l114SovrafreqTempoSMed = val;

	}

	/**
	 * Legge il valore della proprieta' l114SovrafreqTempoSMed associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SovrafreqTempoSMed() {

		return l114SovrafreqTempoSMed;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOVRAFREQ_TEMPO_S_MAX
	 * @generated
	 */
	protected java.math.BigDecimal l114SovrafreqTempoSMax;

	/**
	 * Imposta il valore della proprieta' l114SovrafreqTempoSMax associata alla
	 * colonna L11_4_SOVRAFREQ_TEMPO_S_MAX.
	 * @generated
	 */
	public void setL114SovrafreqTempoSMax(java.math.BigDecimal val) {

		l114SovrafreqTempoSMax = val;

	}

	/**
	 * Legge il valore della proprieta' l114SovrafreqTempoSMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SovrafreqTempoSMax() {

		return l114SovrafreqTempoSMax;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOTTOFREQ_SOGLIA_HZ_MIN
	 * @generated
	 */
	protected java.math.BigDecimal l114SottofreqSogliaHzMin;

	/**
	 * Imposta il valore della proprieta' l114SottofreqSogliaHzMin associata alla
	 * colonna L11_4_SOTTOFREQ_SOGLIA_HZ_MIN.
	 * @generated
	 */
	public void setL114SottofreqSogliaHzMin(java.math.BigDecimal val) {

		l114SottofreqSogliaHzMin = val;

	}

	/**
	 * Legge il valore della proprieta' l114SottofreqSogliaHzMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SottofreqSogliaHzMin() {

		return l114SottofreqSogliaHzMin;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOTTOFREQ_SOGLIA_HZ_MED
	 * @generated
	 */
	protected java.math.BigDecimal l114SottofreqSogliaHzMed;

	/**
	 * Imposta il valore della proprieta' l114SottofreqSogliaHzMed associata alla
	 * colonna L11_4_SOTTOFREQ_SOGLIA_HZ_MED.
	 * @generated
	 */
	public void setL114SottofreqSogliaHzMed(java.math.BigDecimal val) {

		l114SottofreqSogliaHzMed = val;

	}

	/**
	 * Legge il valore della proprieta' l114SottofreqSogliaHzMed associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SottofreqSogliaHzMed() {

		return l114SottofreqSogliaHzMed;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOTTOFREQ_SOGLIA_HZ_MAX
	 * @generated
	 */
	protected java.math.BigDecimal l114SottofreqSogliaHzMax;

	/**
	 * Imposta il valore della proprieta' l114SottofreqSogliaHzMax associata alla
	 * colonna L11_4_SOTTOFREQ_SOGLIA_HZ_MAX.
	 * @generated
	 */
	public void setL114SottofreqSogliaHzMax(java.math.BigDecimal val) {

		l114SottofreqSogliaHzMax = val;

	}

	/**
	 * Legge il valore della proprieta' l114SottofreqSogliaHzMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SottofreqSogliaHzMax() {

		return l114SottofreqSogliaHzMax;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOTTOFREQ_TEMPO_S_MIN
	 * @generated
	 */
	protected java.math.BigDecimal l114SottofreqTempoSMin;

	/**
	 * Imposta il valore della proprieta' l114SottofreqTempoSMin associata alla
	 * colonna L11_4_SOTTOFREQ_TEMPO_S_MIN.
	 * @generated
	 */
	public void setL114SottofreqTempoSMin(java.math.BigDecimal val) {

		l114SottofreqTempoSMin = val;

	}

	/**
	 * Legge il valore della proprieta' l114SottofreqTempoSMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SottofreqTempoSMin() {

		return l114SottofreqTempoSMin;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOTTOFREQ_TEMPO_S_MED
	 * @generated
	 */
	protected java.math.BigDecimal l114SottofreqTempoSMed;

	/**
	 * Imposta il valore della proprieta' l114SottofreqTempoSMed associata alla
	 * colonna L11_4_SOTTOFREQ_TEMPO_S_MED.
	 * @generated
	 */
	public void setL114SottofreqTempoSMed(java.math.BigDecimal val) {

		l114SottofreqTempoSMed = val;

	}

	/**
	 * Legge il valore della proprieta' l114SottofreqTempoSMed associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SottofreqTempoSMed() {

		return l114SottofreqTempoSMed;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOTTOFREQ_TEMPO_S_MAX
	 * @generated
	 */
	protected java.math.BigDecimal l114SottofreqTempoSMax;

	/**
	 * Imposta il valore della proprieta' l114SottofreqTempoSMax associata alla
	 * colonna L11_4_SOTTOFREQ_TEMPO_S_MAX.
	 * @generated
	 */
	public void setL114SottofreqTempoSMax(java.math.BigDecimal val) {

		l114SottofreqTempoSMax = val;

	}

	/**
	 * Legge il valore della proprieta' l114SottofreqTempoSMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SottofreqTempoSMax() {

		return l114SottofreqTempoSMax;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOVRATENS_SOGLIA_V_MIN
	 * @generated
	 */
	protected java.math.BigDecimal l114SovratensSogliaVMin;

	/**
	 * Imposta il valore della proprieta' l114SovratensSogliaVMin associata alla
	 * colonna L11_4_SOVRATENS_SOGLIA_V_MIN.
	 * @generated
	 */
	public void setL114SovratensSogliaVMin(java.math.BigDecimal val) {

		l114SovratensSogliaVMin = val;

	}

	/**
	 * Legge il valore della proprieta' l114SovratensSogliaVMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SovratensSogliaVMin() {

		return l114SovratensSogliaVMin;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOVRATENS_SOGLIA_V_MED
	 * @generated
	 */
	protected java.math.BigDecimal l114SovratensSogliaVMed;

	/**
	 * Imposta il valore della proprieta' l114SovratensSogliaVMed associata alla
	 * colonna L11_4_SOVRATENS_SOGLIA_V_MED.
	 * @generated
	 */
	public void setL114SovratensSogliaVMed(java.math.BigDecimal val) {

		l114SovratensSogliaVMed = val;

	}

	/**
	 * Legge il valore della proprieta' l114SovratensSogliaVMed associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SovratensSogliaVMed() {

		return l114SovratensSogliaVMed;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOVRATENS_SOGLIA_V_MAX
	 * @generated
	 */
	protected java.math.BigDecimal l114SovratensSogliaVMax;

	/**
	 * Imposta il valore della proprieta' l114SovratensSogliaVMax associata alla
	 * colonna L11_4_SOVRATENS_SOGLIA_V_MAX.
	 * @generated
	 */
	public void setL114SovratensSogliaVMax(java.math.BigDecimal val) {

		l114SovratensSogliaVMax = val;

	}

	/**
	 * Legge il valore della proprieta' l114SovratensSogliaVMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SovratensSogliaVMax() {

		return l114SovratensSogliaVMax;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOVRATENS_TEMPO_S_MIN
	 * @generated
	 */
	protected java.math.BigDecimal l114SovratensTempoSMin;

	/**
	 * Imposta il valore della proprieta' l114SovratensTempoSMin associata alla
	 * colonna L11_4_SOVRATENS_TEMPO_S_MIN.
	 * @generated
	 */
	public void setL114SovratensTempoSMin(java.math.BigDecimal val) {

		l114SovratensTempoSMin = val;

	}

	/**
	 * Legge il valore della proprieta' l114SovratensTempoSMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SovratensTempoSMin() {

		return l114SovratensTempoSMin;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOVRATENS_TEMPO_S_MED
	 * @generated
	 */
	protected java.math.BigDecimal l114SovratensTempoSMed;

	/**
	 * Imposta il valore della proprieta' l114SovratensTempoSMed associata alla
	 * colonna L11_4_SOVRATENS_TEMPO_S_MED.
	 * @generated
	 */
	public void setL114SovratensTempoSMed(java.math.BigDecimal val) {

		l114SovratensTempoSMed = val;

	}

	/**
	 * Legge il valore della proprieta' l114SovratensTempoSMed associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SovratensTempoSMed() {

		return l114SovratensTempoSMed;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOVRATENS_TEMPO_S_MAX
	 * @generated
	 */
	protected java.math.BigDecimal l114SovratensTempoSMax;

	/**
	 * Imposta il valore della proprieta' l114SovratensTempoSMax associata alla
	 * colonna L11_4_SOVRATENS_TEMPO_S_MAX.
	 * @generated
	 */
	public void setL114SovratensTempoSMax(java.math.BigDecimal val) {

		l114SovratensTempoSMax = val;

	}

	/**
	 * Legge il valore della proprieta' l114SovratensTempoSMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SovratensTempoSMax() {

		return l114SovratensTempoSMax;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOTTOTENS_SOGLIA_V_MIN
	 * @generated
	 */
	protected java.math.BigDecimal l114SottotensSogliaVMin;

	/**
	 * Imposta il valore della proprieta' l114SottotensSogliaVMin associata alla
	 * colonna L11_4_SOTTOTENS_SOGLIA_V_MIN.
	 * @generated
	 */
	public void setL114SottotensSogliaVMin(java.math.BigDecimal val) {

		l114SottotensSogliaVMin = val;

	}

	/**
	 * Legge il valore della proprieta' l114SottotensSogliaVMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SottotensSogliaVMin() {

		return l114SottotensSogliaVMin;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOTTOTENS_SOGLIA_V_MED
	 * @generated
	 */
	protected java.math.BigDecimal l114SottotensSogliaVMed;

	/**
	 * Imposta il valore della proprieta' l114SottotensSogliaVMed associata alla
	 * colonna L11_4_SOTTOTENS_SOGLIA_V_MED.
	 * @generated
	 */
	public void setL114SottotensSogliaVMed(java.math.BigDecimal val) {

		l114SottotensSogliaVMed = val;

	}

	/**
	 * Legge il valore della proprieta' l114SottotensSogliaVMed associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SottotensSogliaVMed() {

		return l114SottotensSogliaVMed;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOTTOTENS_SOGLIA_V_MAX
	 * @generated
	 */
	protected java.math.BigDecimal l114SottotensSogliaVMax;

	/**
	 * Imposta il valore della proprieta' l114SottotensSogliaVMax associata alla
	 * colonna L11_4_SOTTOTENS_SOGLIA_V_MAX.
	 * @generated
	 */
	public void setL114SottotensSogliaVMax(java.math.BigDecimal val) {

		l114SottotensSogliaVMax = val;

	}

	/**
	 * Legge il valore della proprieta' l114SottotensSogliaVMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SottotensSogliaVMax() {

		return l114SottotensSogliaVMax;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOTTOTENS_TEMPO_S_MIN
	 * @generated
	 */
	protected java.math.BigDecimal l114SottotensTempoSMin;

	/**
	 * Imposta il valore della proprieta' l114SottotensTempoSMin associata alla
	 * colonna L11_4_SOTTOTENS_TEMPO_S_MIN.
	 * @generated
	 */
	public void setL114SottotensTempoSMin(java.math.BigDecimal val) {

		l114SottotensTempoSMin = val;

	}

	/**
	 * Legge il valore della proprieta' l114SottotensTempoSMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SottotensTempoSMin() {

		return l114SottotensTempoSMin;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOTTOTENS_TEMPO_S_MED
	 * @generated
	 */
	protected java.math.BigDecimal l114SottotensTempoSMed;

	/**
	 * Imposta il valore della proprieta' l114SottotensTempoSMed associata alla
	 * colonna L11_4_SOTTOTENS_TEMPO_S_MED.
	 * @generated
	 */
	public void setL114SottotensTempoSMed(java.math.BigDecimal val) {

		l114SottotensTempoSMed = val;

	}

	/**
	 * Legge il valore della proprieta' l114SottotensTempoSMed associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SottotensTempoSMed() {

		return l114SottotensTempoSMed;

	}

	/**
	 * store della proprieta' associata alla colonna L11_4_SOTTOTENS_TEMPO_S_MAX
	 * @generated
	 */
	protected java.math.BigDecimal l114SottotensTempoSMax;

	/**
	 * Imposta il valore della proprieta' l114SottotensTempoSMax associata alla
	 * colonna L11_4_SOTTOTENS_TEMPO_S_MAX.
	 * @generated
	 */
	public void setL114SottotensTempoSMax(java.math.BigDecimal val) {

		l114SottotensTempoSMax = val;

	}

	/**
	 * Legge il valore della proprieta' l114SottotensTempoSMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL114SottotensTempoSMax() {

		return l114SottotensTempoSMax;

	}

	/**
	 * store della proprieta' associata alla colonna E_CONTROLLOWEB
	 * @generated
	 */
	protected java.sql.Timestamp eControlloweb;

	/**
	 * Imposta il valore della proprieta' eControlloweb associata alla
	 * colonna E_CONTROLLOWEB.
	 * @generated
	 */
	public void setEControlloweb(java.sql.Timestamp val) {

		if (val != null) {
			eControlloweb = new java.sql.Timestamp(val.getTime());
		} else {
			eControlloweb = null;
		}

	}

	/**
	 * Legge il valore della proprieta' eControlloweb associata alla
	 * @generated
	 */
	public java.sql.Timestamp getEControlloweb() {

		if (eControlloweb != null) {
			return new java.sql.Timestamp(eControlloweb.getTime());
		} else {
			return null;
		}

	}

	/**
	 * Crea una istanza di SigitTDettTipo4Pk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTDettTipo4Pk
	 * @generated
	 */
	public SigitTDettTipo4Pk createPk() {
		return new SigitTDettTipo4Pk(idDettTipo4);
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
