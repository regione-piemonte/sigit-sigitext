package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitVCompGfDettDao.
 * @generated
 */
public class SigitVCompGfDettDto implements Serializable {

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
	 * store della proprieta' associata alla colonna ID_DETT_TIPO2
	 * @generated
	 */
	protected java.math.BigDecimal idDettTipo2;

	/**
	 * Imposta il valore della proprieta' idDettTipo2 associata alla
	 * colonna ID_DETT_TIPO2.
	 * @generated
	 */
	public void setIdDettTipo2(java.math.BigDecimal val) {

		idDettTipo2 = val;

	}

	/**
	 * Legge il valore della proprieta' idDettTipo2 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdDettTipo2() {

		return idDettTipo2;

	}

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
	 * store della proprieta' associata alla colonna E_N_CIRCUITO
	 * @generated
	 */
	protected String eNCircuito;

	/**
	 * Imposta il valore della proprieta' eNCircuito associata alla
	 * colonna E_N_CIRCUITO.
	 * @generated
	 */
	public void setENCircuito(String val) {

		eNCircuito = val;

	}

	/**
	 * Legge il valore della proprieta' eNCircuito associata alla
	 * @generated
	 */
	public String getENCircuito() {

		return eNCircuito;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_MOD_PROVA
	 * @generated
	 */
	protected String eFlgModProva;

	/**
	 * Imposta il valore della proprieta' eFlgModProva associata alla
	 * colonna E_FLG_MOD_PROVA.
	 * @generated
	 */
	public void setEFlgModProva(String val) {

		eFlgModProva = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgModProva associata alla
	 * @generated
	 */
	public String getEFlgModProva() {

		return eFlgModProva;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_PERDITA_GAS
	 * @generated
	 */
	protected java.math.BigDecimal eFlgPerditaGas;

	/**
	 * Imposta il valore della proprieta' eFlgPerditaGas associata alla
	 * colonna E_FLG_PERDITA_GAS.
	 * @generated
	 */
	public void setEFlgPerditaGas(java.math.BigDecimal val) {

		eFlgPerditaGas = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgPerditaGas associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgPerditaGas() {

		return eFlgPerditaGas;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_LEAK_DETECTOR
	 * @generated
	 */
	protected java.math.BigDecimal eFlgLeakDetector;

	/**
	 * Imposta il valore della proprieta' eFlgLeakDetector associata alla
	 * colonna E_FLG_LEAK_DETECTOR.
	 * @generated
	 */
	public void setEFlgLeakDetector(java.math.BigDecimal val) {

		eFlgLeakDetector = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgLeakDetector associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgLeakDetector() {

		return eFlgLeakDetector;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_PARAM_TERMODINAM
	 * @generated
	 */
	protected java.math.BigDecimal eFlgParamTermodinam;

	/**
	 * Imposta il valore della proprieta' eFlgParamTermodinam associata alla
	 * colonna E_FLG_PARAM_TERMODINAM.
	 * @generated
	 */
	public void setEFlgParamTermodinam(java.math.BigDecimal val) {

		eFlgParamTermodinam = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgParamTermodinam associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgParamTermodinam() {

		return eFlgParamTermodinam;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_INCROSTAZIONI
	 * @generated
	 */
	protected java.math.BigDecimal eFlgIncrostazioni;

	/**
	 * Imposta il valore della proprieta' eFlgIncrostazioni associata alla
	 * colonna E_FLG_INCROSTAZIONI.
	 * @generated
	 */
	public void setEFlgIncrostazioni(java.math.BigDecimal val) {

		eFlgIncrostazioni = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgIncrostazioni associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgIncrostazioni() {

		return eFlgIncrostazioni;

	}

	/**
	 * store della proprieta' associata alla colonna E_T_SURRISC_C
	 * @generated
	 */
	protected java.math.BigDecimal eTSurriscC;

	/**
	 * Imposta il valore della proprieta' eTSurriscC associata alla
	 * colonna E_T_SURRISC_C.
	 * @generated
	 */
	public void setETSurriscC(java.math.BigDecimal val) {

		eTSurriscC = val;

	}

	/**
	 * Legge il valore della proprieta' eTSurriscC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETSurriscC() {

		return eTSurriscC;

	}

	/**
	 * store della proprieta' associata alla colonna E_T_SOTTORAF_C
	 * @generated
	 */
	protected java.math.BigDecimal eTSottorafC;

	/**
	 * Imposta il valore della proprieta' eTSottorafC associata alla
	 * colonna E_T_SOTTORAF_C.
	 * @generated
	 */
	public void setETSottorafC(java.math.BigDecimal val) {

		eTSottorafC = val;

	}

	/**
	 * Legge il valore della proprieta' eTSottorafC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETSottorafC() {

		return eTSottorafC;

	}

	/**
	 * store della proprieta' associata alla colonna E_T_CONDENSAZIONE_C
	 * @generated
	 */
	protected java.math.BigDecimal eTCondensazioneC;

	/**
	 * Imposta il valore della proprieta' eTCondensazioneC associata alla
	 * colonna E_T_CONDENSAZIONE_C.
	 * @generated
	 */
	public void setETCondensazioneC(java.math.BigDecimal val) {

		eTCondensazioneC = val;

	}

	/**
	 * Legge il valore della proprieta' eTCondensazioneC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETCondensazioneC() {

		return eTCondensazioneC;

	}

	/**
	 * store della proprieta' associata alla colonna E_T_EVAPORAZIONE_C
	 * @generated
	 */
	protected java.math.BigDecimal eTEvaporazioneC;

	/**
	 * Imposta il valore della proprieta' eTEvaporazioneC associata alla
	 * colonna E_T_EVAPORAZIONE_C.
	 * @generated
	 */
	public void setETEvaporazioneC(java.math.BigDecimal val) {

		eTEvaporazioneC = val;

	}

	/**
	 * Legge il valore della proprieta' eTEvaporazioneC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETEvaporazioneC() {

		return eTEvaporazioneC;

	}

	/**
	 * store della proprieta' associata alla colonna E_T_IN_EXT_C
	 * @generated
	 */
	protected java.math.BigDecimal eTInExtC;

	/**
	 * Imposta il valore della proprieta' eTInExtC associata alla
	 * colonna E_T_IN_EXT_C.
	 * @generated
	 */
	public void setETInExtC(java.math.BigDecimal val) {

		eTInExtC = val;

	}

	/**
	 * Legge il valore della proprieta' eTInExtC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETInExtC() {

		return eTInExtC;

	}

	/**
	 * store della proprieta' associata alla colonna E_T_OUT_EXT_C
	 * @generated
	 */
	protected java.math.BigDecimal eTOutExtC;

	/**
	 * Imposta il valore della proprieta' eTOutExtC associata alla
	 * colonna E_T_OUT_EXT_C.
	 * @generated
	 */
	public void setETOutExtC(java.math.BigDecimal val) {

		eTOutExtC = val;

	}

	/**
	 * Legge il valore della proprieta' eTOutExtC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETOutExtC() {

		return eTOutExtC;

	}

	/**
	 * store della proprieta' associata alla colonna E_T_IN_UTENZE_C
	 * @generated
	 */
	protected java.math.BigDecimal eTInUtenzeC;

	/**
	 * Imposta il valore della proprieta' eTInUtenzeC associata alla
	 * colonna E_T_IN_UTENZE_C.
	 * @generated
	 */
	public void setETInUtenzeC(java.math.BigDecimal val) {

		eTInUtenzeC = val;

	}

	/**
	 * Legge il valore della proprieta' eTInUtenzeC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETInUtenzeC() {

		return eTInUtenzeC;

	}

	/**
	 * store della proprieta' associata alla colonna E_T_OUT_UTENZE_C
	 * @generated
	 */
	protected java.math.BigDecimal eTOutUtenzeC;

	/**
	 * Imposta il valore della proprieta' eTOutUtenzeC associata alla
	 * colonna E_T_OUT_UTENZE_C.
	 * @generated
	 */
	public void setETOutUtenzeC(java.math.BigDecimal val) {

		eTOutUtenzeC = val;

	}

	/**
	 * Legge il valore della proprieta' eTOutUtenzeC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETOutUtenzeC() {

		return eTOutUtenzeC;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_ULT_MOD_DETT
	 * @generated
	 */
	protected java.sql.Timestamp dataUltModDett;

	/**
	 * Imposta il valore della proprieta' dataUltModDett associata alla
	 * colonna DATA_ULT_MOD_DETT.
	 * @generated
	 */
	public void setDataUltModDett(java.sql.Timestamp val) {

		if (val != null) {
			dataUltModDett = new java.sql.Timestamp(val.getTime());
		} else {
			dataUltModDett = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataUltModDett associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDataUltModDett() {

		if (dataUltModDett != null) {
			return new java.sql.Timestamp(dataUltModDett.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna UTENTE_ULT_MOD_DETT
	 * @generated
	 */
	protected String utenteUltModDett;

	/**
	 * Imposta il valore della proprieta' utenteUltModDett associata alla
	 * colonna UTENTE_ULT_MOD_DETT.
	 * @generated
	 */
	public void setUtenteUltModDett(String val) {

		utenteUltModDett = val;

	}

	/**
	 * Legge il valore della proprieta' utenteUltModDett associata alla
	 * @generated
	 */
	public String getUtenteUltModDett() {

		return utenteUltModDett;

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
	 * store della proprieta' associata alla colonna L11_2_TORRE_T_OUT_FLUIDO
	 * @generated
	 */
	protected java.math.BigDecimal l112TorreTOutFluido;

	/**
	 * Imposta il valore della proprieta' l112TorreTOutFluido associata alla
	 * colonna L11_2_TORRE_T_OUT_FLUIDO.
	 * @generated
	 */
	public void setL112TorreTOutFluido(java.math.BigDecimal val) {

		l112TorreTOutFluido = val;

	}

	/**
	 * Legge il valore della proprieta' l112TorreTOutFluido associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL112TorreTOutFluido() {

		return l112TorreTOutFluido;

	}

	/**
	 * store della proprieta' associata alla colonna L11_2_TORRE_T_BULBO_UMIDO
	 * @generated
	 */
	protected java.math.BigDecimal l112TorreTBulboUmido;

	/**
	 * Imposta il valore della proprieta' l112TorreTBulboUmido associata alla
	 * colonna L11_2_TORRE_T_BULBO_UMIDO.
	 * @generated
	 */
	public void setL112TorreTBulboUmido(java.math.BigDecimal val) {

		l112TorreTBulboUmido = val;

	}

	/**
	 * Legge il valore della proprieta' l112TorreTBulboUmido associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL112TorreTBulboUmido() {

		return l112TorreTBulboUmido;

	}

	/**
	 * store della proprieta' associata alla colonna L11_2_SCAMBIATORE_T_IN_EXT
	 * @generated
	 */
	protected java.math.BigDecimal l112ScambiatoreTInExt;

	/**
	 * Imposta il valore della proprieta' l112ScambiatoreTInExt associata alla
	 * colonna L11_2_SCAMBIATORE_T_IN_EXT.
	 * @generated
	 */
	public void setL112ScambiatoreTInExt(java.math.BigDecimal val) {

		l112ScambiatoreTInExt = val;

	}

	/**
	 * Legge il valore della proprieta' l112ScambiatoreTInExt associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL112ScambiatoreTInExt() {

		return l112ScambiatoreTInExt;

	}

	/**
	 * store della proprieta' associata alla colonna L11_2_SCAMBIATORE_T_OUT_EXT
	 * @generated
	 */
	protected java.math.BigDecimal l112ScambiatoreTOutExt;

	/**
	 * Imposta il valore della proprieta' l112ScambiatoreTOutExt associata alla
	 * colonna L11_2_SCAMBIATORE_T_OUT_EXT.
	 * @generated
	 */
	public void setL112ScambiatoreTOutExt(java.math.BigDecimal val) {

		l112ScambiatoreTOutExt = val;

	}

	/**
	 * Legge il valore della proprieta' l112ScambiatoreTOutExt associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL112ScambiatoreTOutExt() {

		return l112ScambiatoreTOutExt;

	}

	/**
	 * store della proprieta' associata alla colonna L11_2_SCAMBIAT_T_IN_MACCHINA
	 * @generated
	 */
	protected java.math.BigDecimal l112ScambiatTInMacchina;

	/**
	 * Imposta il valore della proprieta' l112ScambiatTInMacchina associata alla
	 * colonna L11_2_SCAMBIAT_T_IN_MACCHINA.
	 * @generated
	 */
	public void setL112ScambiatTInMacchina(java.math.BigDecimal val) {

		l112ScambiatTInMacchina = val;

	}

	/**
	 * Legge il valore della proprieta' l112ScambiatTInMacchina associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL112ScambiatTInMacchina() {

		return l112ScambiatTInMacchina;

	}

	/**
	 * store della proprieta' associata alla colonna L11_2_SCAMBIAT_T_OUT_MACCHINA
	 * @generated
	 */
	protected java.math.BigDecimal l112ScambiatTOutMacchina;

	/**
	 * Imposta il valore della proprieta' l112ScambiatTOutMacchina associata alla
	 * colonna L11_2_SCAMBIAT_T_OUT_MACCHINA.
	 * @generated
	 */
	public void setL112ScambiatTOutMacchina(java.math.BigDecimal val) {

		l112ScambiatTOutMacchina = val;

	}

	/**
	 * Legge il valore della proprieta' l112ScambiatTOutMacchina associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL112ScambiatTOutMacchina() {

		return l112ScambiatTOutMacchina;

	}

	/**
	 * store della proprieta' associata alla colonna L11_2_POTENZA_ASSORBITA_KW
	 * @generated
	 */
	protected java.math.BigDecimal l112PotenzaAssorbitaKw;

	/**
	 * Imposta il valore della proprieta' l112PotenzaAssorbitaKw associata alla
	 * colonna L11_2_POTENZA_ASSORBITA_KW.
	 * @generated
	 */
	public void setL112PotenzaAssorbitaKw(java.math.BigDecimal val) {

		l112PotenzaAssorbitaKw = val;

	}

	/**
	 * Legge il valore della proprieta' l112PotenzaAssorbitaKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL112PotenzaAssorbitaKw() {

		return l112PotenzaAssorbitaKw;

	}

	/**
	 * store della proprieta' associata alla colonna L11_2_FLG_PULIZIA_FILTRI
	 * @generated
	 */
	protected java.math.BigDecimal l112FlgPuliziaFiltri;

	/**
	 * Imposta il valore della proprieta' l112FlgPuliziaFiltri associata alla
	 * colonna L11_2_FLG_PULIZIA_FILTRI.
	 * @generated
	 */
	public void setL112FlgPuliziaFiltri(java.math.BigDecimal val) {

		l112FlgPuliziaFiltri = val;

	}

	/**
	 * Legge il valore della proprieta' l112FlgPuliziaFiltri associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL112FlgPuliziaFiltri() {

		return l112FlgPuliziaFiltri;

	}

	/**
	 * store della proprieta' associata alla colonna L11_2_FLG_VERIFICA_SUPERATA
	 * @generated
	 */
	protected java.math.BigDecimal l112FlgVerificaSuperata;

	/**
	 * Imposta il valore della proprieta' l112FlgVerificaSuperata associata alla
	 * colonna L11_2_FLG_VERIFICA_SUPERATA.
	 * @generated
	 */
	public void setL112FlgVerificaSuperata(java.math.BigDecimal val) {

		l112FlgVerificaSuperata = val;

	}

	/**
	 * Legge il valore della proprieta' l112FlgVerificaSuperata associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL112FlgVerificaSuperata() {

		return l112FlgVerificaSuperata;

	}

	/**
	 * store della proprieta' associata alla colonna L11_2_DATA_RIPRISTINO
	 * @generated
	 */
	protected java.sql.Date l112DataRipristino;

	/**
	 * Imposta il valore della proprieta' l112DataRipristino associata alla
	 * colonna L11_2_DATA_RIPRISTINO.
	 * @generated
	 */
	public void setL112DataRipristino(java.sql.Date val) {

		if (val != null) {
			l112DataRipristino = new java.sql.Date(val.getTime());
		} else {
			l112DataRipristino = null;
		}

	}

	/**
	 * Legge il valore della proprieta' l112DataRipristino associata alla
	 * @generated
	 */
	public java.sql.Date getL112DataRipristino() {

		if (l112DataRipristino != null) {
			return new java.sql.Date(l112DataRipristino.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna SIGLA_REA
	 * @generated
	 */
	protected String siglaRea;

	/**
	 * Imposta il valore della proprieta' siglaRea associata alla
	 * colonna SIGLA_REA.
	 * @generated
	 */
	public void setSiglaRea(String val) {

		siglaRea = val;

	}

	/**
	 * Legge il valore della proprieta' siglaRea associata alla
	 * @generated
	 */
	public String getSiglaRea() {

		return siglaRea;

	}

	/**
	 * store della proprieta' associata alla colonna NUMERO_REA
	 * @generated
	 */
	protected java.math.BigDecimal numeroRea;

	/**
	 * Imposta il valore della proprieta' numeroRea associata alla
	 * colonna NUMERO_REA.
	 * @generated
	 */
	public void setNumeroRea(java.math.BigDecimal val) {

		numeroRea = val;

	}

	/**
	 * Legge il valore della proprieta' numeroRea associata alla
	 * @generated
	 */
	public java.math.BigDecimal getNumeroRea() {

		return numeroRea;

	}

	/**
	 * store della proprieta' associata alla colonna ID_PERSONA_GIURIDICA
	 * @generated
	 */
	protected java.math.BigDecimal idPersonaGiuridica;

	/**
	 * Imposta il valore della proprieta' idPersonaGiuridica associata alla
	 * colonna ID_PERSONA_GIURIDICA.
	 * @generated
	 */
	public void setIdPersonaGiuridica(java.math.BigDecimal val) {

		idPersonaGiuridica = val;

	}

	/**
	 * Legge il valore della proprieta' idPersonaGiuridica associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdPersonaGiuridica() {

		return idPersonaGiuridica;

	}

	/**
	 * store della proprieta' associata alla colonna FK_RUOLO
	 * @generated
	 */
	protected java.math.BigDecimal fkRuolo;

	/**
	 * Imposta il valore della proprieta' fkRuolo associata alla
	 * colonna FK_RUOLO.
	 * @generated
	 */
	public void setFkRuolo(java.math.BigDecimal val) {

		fkRuolo = val;

	}

	/**
	 * Legge il valore della proprieta' fkRuolo associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkRuolo() {

		return fkRuolo;

	}

	/**
	 * store della proprieta' associata alla colonna FK_STATO_RAPP
	 * @generated
	 */
	protected java.math.BigDecimal fkStatoRapp;

	/**
	 * Imposta il valore della proprieta' fkStatoRapp associata alla
	 * colonna FK_STATO_RAPP.
	 * @generated
	 */
	public void setFkStatoRapp(java.math.BigDecimal val) {

		fkStatoRapp = val;

	}

	/**
	 * Legge il valore della proprieta' fkStatoRapp associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkStatoRapp() {

		return fkStatoRapp;

	}

}
