package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitVCompGtDettDao.
 * @generated
 */
public class SigitVCompGtDettDto implements Serializable {

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
	 * store della proprieta' associata alla colonna ID_DETT_TIPO1
	 * @generated
	 */
	protected java.math.BigDecimal idDettTipo1;

	/**
	 * Imposta il valore della proprieta' idDettTipo1 associata alla
	 * colonna ID_DETT_TIPO1.
	 * @generated
	 */
	public void setIdDettTipo1(java.math.BigDecimal val) {

		idDettTipo1 = val;

	}

	/**
	 * Legge il valore della proprieta' idDettTipo1 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdDettTipo1() {

		return idDettTipo1;

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
	 * store della proprieta' associata alla colonna E_N_MODULO_TERMICO
	 * @generated
	 */
	protected Integer eNModuloTermico;

	/**
	 * Imposta il valore della proprieta' eNModuloTermico associata alla
	 * colonna E_N_MODULO_TERMICO.
	 * @generated
	 */
	public void setENModuloTermico(Integer val) {

		eNModuloTermico = val;

	}

	/**
	 * Legge il valore della proprieta' eNModuloTermico associata alla
	 * @generated
	 */
	public Integer getENModuloTermico() {

		return eNModuloTermico;

	}

	/**
	 * store della proprieta' associata alla colonna E_POT_TERM_FOCOL_KW
	 * @generated
	 */
	protected java.math.BigDecimal ePotTermFocolKw;

	/**
	 * Imposta il valore della proprieta' ePotTermFocolKw associata alla
	 * colonna E_POT_TERM_FOCOL_KW.
	 * @generated
	 */
	public void setEPotTermFocolKw(java.math.BigDecimal val) {

		ePotTermFocolKw = val;

	}

	/**
	 * Legge il valore della proprieta' ePotTermFocolKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEPotTermFocolKw() {

		return ePotTermFocolKw;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_CLIMA_INVERNO
	 * @generated
	 */
	protected java.math.BigDecimal eFlgClimaInverno;

	/**
	 * Imposta il valore della proprieta' eFlgClimaInverno associata alla
	 * colonna E_FLG_CLIMA_INVERNO.
	 * @generated
	 */
	public void setEFlgClimaInverno(java.math.BigDecimal val) {

		eFlgClimaInverno = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgClimaInverno associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgClimaInverno() {

		return eFlgClimaInverno;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_PRODUZ_ACS
	 * @generated
	 */
	protected java.math.BigDecimal eFlgProduzAcs;

	/**
	 * Imposta il valore della proprieta' eFlgProduzAcs associata alla
	 * colonna E_FLG_PRODUZ_ACS.
	 * @generated
	 */
	public void setEFlgProduzAcs(java.math.BigDecimal val) {

		eFlgProduzAcs = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgProduzAcs associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgProduzAcs() {

		return eFlgProduzAcs;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_DISPOS_COMANDO
	 * @generated
	 */
	protected java.math.BigDecimal eFlgDisposComando;

	/**
	 * Imposta il valore della proprieta' eFlgDisposComando associata alla
	 * colonna E_FLG_DISPOS_COMANDO.
	 * @generated
	 */
	public void setEFlgDisposComando(java.math.BigDecimal val) {

		eFlgDisposComando = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgDisposComando associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgDisposComando() {

		return eFlgDisposComando;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_DISPOS_SICUREZZA
	 * @generated
	 */
	protected java.math.BigDecimal eFlgDisposSicurezza;

	/**
	 * Imposta il valore della proprieta' eFlgDisposSicurezza associata alla
	 * colonna E_FLG_DISPOS_SICUREZZA.
	 * @generated
	 */
	public void setEFlgDisposSicurezza(java.math.BigDecimal val) {

		eFlgDisposSicurezza = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgDisposSicurezza associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgDisposSicurezza() {

		return eFlgDisposSicurezza;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_VALVOLA_SICUREZZA
	 * @generated
	 */
	protected java.math.BigDecimal eFlgValvolaSicurezza;

	/**
	 * Imposta il valore della proprieta' eFlgValvolaSicurezza associata alla
	 * colonna E_FLG_VALVOLA_SICUREZZA.
	 * @generated
	 */
	public void setEFlgValvolaSicurezza(java.math.BigDecimal val) {

		eFlgValvolaSicurezza = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgValvolaSicurezza associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgValvolaSicurezza() {

		return eFlgValvolaSicurezza;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_SCAMBIATORE_FUMI
	 * @generated
	 */
	protected java.math.BigDecimal eFlgScambiatoreFumi;

	/**
	 * Imposta il valore della proprieta' eFlgScambiatoreFumi associata alla
	 * colonna E_FLG_SCAMBIATORE_FUMI.
	 * @generated
	 */
	public void setEFlgScambiatoreFumi(java.math.BigDecimal val) {

		eFlgScambiatoreFumi = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgScambiatoreFumi associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgScambiatoreFumi() {

		return eFlgScambiatoreFumi;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_RIFLUSSO
	 * @generated
	 */
	protected java.math.BigDecimal eFlgRiflusso;

	/**
	 * Imposta il valore della proprieta' eFlgRiflusso associata alla
	 * colonna E_FLG_RIFLUSSO.
	 * @generated
	 */
	public void setEFlgRiflusso(java.math.BigDecimal val) {

		eFlgRiflusso = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgRiflusso associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgRiflusso() {

		return eFlgRiflusso;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_UNI_10389_1
	 * @generated
	 */
	protected java.math.BigDecimal eFlgUni103891;

	/**
	 * Imposta il valore della proprieta' eFlgUni103891 associata alla
	 * colonna E_FLG_UNI_10389_1.
	 * @generated
	 */
	public void setEFlgUni103891(java.math.BigDecimal val) {

		eFlgUni103891 = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgUni103891 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgUni103891() {

		return eFlgUni103891;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_EVACU_FUMI
	 * @generated
	 */
	protected String eFlgEvacuFumi;

	/**
	 * Imposta il valore della proprieta' eFlgEvacuFumi associata alla
	 * colonna E_FLG_EVACU_FUMI.
	 * @generated
	 */
	public void setEFlgEvacuFumi(String val) {

		eFlgEvacuFumi = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgEvacuFumi associata alla
	 * @generated
	 */
	public String getEFlgEvacuFumi() {

		return eFlgEvacuFumi;

	}

	/**
	 * store della proprieta' associata alla colonna E_DEPR_CANALE_FUMO_PA
	 * @generated
	 */
	protected java.math.BigDecimal eDeprCanaleFumoPa;

	/**
	 * Imposta il valore della proprieta' eDeprCanaleFumoPa associata alla
	 * colonna E_DEPR_CANALE_FUMO_PA.
	 * @generated
	 */
	public void setEDeprCanaleFumoPa(java.math.BigDecimal val) {

		eDeprCanaleFumoPa = val;

	}

	/**
	 * Legge il valore della proprieta' eDeprCanaleFumoPa associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEDeprCanaleFumoPa() {

		return eDeprCanaleFumoPa;

	}

	/**
	 * store della proprieta' associata alla colonna E_TEMP_FUMI_C
	 * @generated
	 */
	protected java.math.BigDecimal eTempFumiC;

	/**
	 * Imposta il valore della proprieta' eTempFumiC associata alla
	 * colonna E_TEMP_FUMI_C.
	 * @generated
	 */
	public void setETempFumiC(java.math.BigDecimal val) {

		eTempFumiC = val;

	}

	/**
	 * Legge il valore della proprieta' eTempFumiC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETempFumiC() {

		return eTempFumiC;

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
	 * store della proprieta' associata alla colonna E_O2_PERC
	 * @generated
	 */
	protected java.math.BigDecimal eO2Perc;

	/**
	 * Imposta il valore della proprieta' eO2Perc associata alla
	 * colonna E_O2_PERC.
	 * @generated
	 */
	public void setEO2Perc(java.math.BigDecimal val) {

		eO2Perc = val;

	}

	/**
	 * Legge il valore della proprieta' eO2Perc associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEO2Perc() {

		return eO2Perc;

	}

	/**
	 * store della proprieta' associata alla colonna E_CO2_PERC
	 * @generated
	 */
	protected java.math.BigDecimal eCo2Perc;

	/**
	 * Imposta il valore della proprieta' eCo2Perc associata alla
	 * colonna E_CO2_PERC.
	 * @generated
	 */
	public void setECo2Perc(java.math.BigDecimal val) {

		eCo2Perc = val;

	}

	/**
	 * Legge il valore della proprieta' eCo2Perc associata alla
	 * @generated
	 */
	public java.math.BigDecimal getECo2Perc() {

		return eCo2Perc;

	}

	/**
	 * store della proprieta' associata alla colonna E_BACHARACH_MIN
	 * @generated
	 */
	protected String eBacharachMin;

	/**
	 * Imposta il valore della proprieta' eBacharachMin associata alla
	 * colonna E_BACHARACH_MIN.
	 * @generated
	 */
	public void setEBacharachMin(String val) {

		eBacharachMin = val;

	}

	/**
	 * Legge il valore della proprieta' eBacharachMin associata alla
	 * @generated
	 */
	public String getEBacharachMin() {

		return eBacharachMin;

	}

	/**
	 * store della proprieta' associata alla colonna E_BACHARACH_MED
	 * @generated
	 */
	protected String eBacharachMed;

	/**
	 * Imposta il valore della proprieta' eBacharachMed associata alla
	 * colonna E_BACHARACH_MED.
	 * @generated
	 */
	public void setEBacharachMed(String val) {

		eBacharachMed = val;

	}

	/**
	 * Legge il valore della proprieta' eBacharachMed associata alla
	 * @generated
	 */
	public String getEBacharachMed() {

		return eBacharachMed;

	}

	/**
	 * store della proprieta' associata alla colonna E_BACHARACH_MAX
	 * @generated
	 */
	protected String eBacharachMax;

	/**
	 * Imposta il valore della proprieta' eBacharachMax associata alla
	 * colonna E_BACHARACH_MAX.
	 * @generated
	 */
	public void setEBacharachMax(String val) {

		eBacharachMax = val;

	}

	/**
	 * Legge il valore della proprieta' eBacharachMax associata alla
	 * @generated
	 */
	public String getEBacharachMax() {

		return eBacharachMax;

	}

	/**
	 * store della proprieta' associata alla colonna E_CO_CORRETTO_PPM
	 * @generated
	 */
	protected java.math.BigDecimal eCoCorrettoPpm;

	/**
	 * Imposta il valore della proprieta' eCoCorrettoPpm associata alla
	 * colonna E_CO_CORRETTO_PPM.
	 * @generated
	 */
	public void setECoCorrettoPpm(java.math.BigDecimal val) {

		eCoCorrettoPpm = val;

	}

	/**
	 * Legge il valore della proprieta' eCoCorrettoPpm associata alla
	 * @generated
	 */
	public java.math.BigDecimal getECoCorrettoPpm() {

		return eCoCorrettoPpm;

	}

	/**
	 * store della proprieta' associata alla colonna E_REND_COMB_PERC
	 * @generated
	 */
	protected java.math.BigDecimal eRendCombPerc;

	/**
	 * Imposta il valore della proprieta' eRendCombPerc associata alla
	 * colonna E_REND_COMB_PERC.
	 * @generated
	 */
	public void setERendCombPerc(java.math.BigDecimal val) {

		eRendCombPerc = val;

	}

	/**
	 * Legge il valore della proprieta' eRendCombPerc associata alla
	 * @generated
	 */
	public java.math.BigDecimal getERendCombPerc() {

		return eRendCombPerc;

	}

	/**
	 * store della proprieta' associata alla colonna E_REND_MIN_LEGGE_PERC
	 * @generated
	 */
	protected java.math.BigDecimal eRendMinLeggePerc;

	/**
	 * Imposta il valore della proprieta' eRendMinLeggePerc associata alla
	 * colonna E_REND_MIN_LEGGE_PERC.
	 * @generated
	 */
	public void setERendMinLeggePerc(java.math.BigDecimal val) {

		eRendMinLeggePerc = val;

	}

	/**
	 * Legge il valore della proprieta' eRendMinLeggePerc associata alla
	 * @generated
	 */
	public java.math.BigDecimal getERendMinLeggePerc() {

		return eRendMinLeggePerc;

	}

	/**
	 * store della proprieta' associata alla colonna E_NOX_PPM
	 * @generated
	 */
	protected java.math.BigDecimal eNoxPpm;

	/**
	 * Imposta il valore della proprieta' eNoxPpm associata alla
	 * colonna E_NOX_PPM.
	 * @generated
	 */
	public void setENoxPpm(java.math.BigDecimal val) {

		eNoxPpm = val;

	}

	/**
	 * Legge il valore della proprieta' eNoxPpm associata alla
	 * @generated
	 */
	public java.math.BigDecimal getENoxPpm() {

		return eNoxPpm;

	}

	/**
	 * store della proprieta' associata alla colonna E_NOX_MG_KWH
	 * @generated
	 */
	protected java.math.BigDecimal eNoxMgKwh;

	/**
	 * Imposta il valore della proprieta' eNoxMgKwh associata alla
	 * colonna E_NOX_MG_KWH.
	 * @generated
	 */
	public void setENoxMgKwh(java.math.BigDecimal val) {

		eNoxMgKwh = val;

	}

	/**
	 * Legge il valore della proprieta' eNoxMgKwh associata alla
	 * @generated
	 */
	public java.math.BigDecimal getENoxMgKwh() {

		return eNoxMgKwh;

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
	 * store della proprieta' associata alla colonna L11_1_PORTATA_COMBUSTIBILE
	 * @generated
	 */
	protected java.math.BigDecimal l111PortataCombustibile;

	/**
	 * Imposta il valore della proprieta' l111PortataCombustibile associata alla
	 * colonna L11_1_PORTATA_COMBUSTIBILE.
	 * @generated
	 */
	public void setL111PortataCombustibile(java.math.BigDecimal val) {

		l111PortataCombustibile = val;

	}

	/**
	 * Legge il valore della proprieta' l111PortataCombustibile associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL111PortataCombustibile() {

		return l111PortataCombustibile;

	}

	/**
	 * store della proprieta' associata alla colonna L11_1_PORTATA_COMBUSTIBILE_UM
	 * @generated
	 */
	protected String l111PortataCombustibileUm;

	/**
	 * Imposta il valore della proprieta' l111PortataCombustibileUm associata alla
	 * colonna L11_1_PORTATA_COMBUSTIBILE_UM.
	 * @generated
	 */
	public void setL111PortataCombustibileUm(String val) {

		l111PortataCombustibileUm = val;

	}

	/**
	 * Legge il valore della proprieta' l111PortataCombustibileUm associata alla
	 * @generated
	 */
	public String getL111PortataCombustibileUm() {

		return l111PortataCombustibileUm;

	}

	/**
	 * store della proprieta' associata alla colonna L11_1_ALTRO_RIFERIMENTO
	 * @generated
	 */
	protected String l111AltroRiferimento;

	/**
	 * Imposta il valore della proprieta' l111AltroRiferimento associata alla
	 * colonna L11_1_ALTRO_RIFERIMENTO.
	 * @generated
	 */
	public void setL111AltroRiferimento(String val) {

		l111AltroRiferimento = val;

	}

	/**
	 * Legge il valore della proprieta' l111AltroRiferimento associata alla
	 * @generated
	 */
	public String getL111AltroRiferimento() {

		return l111AltroRiferimento;

	}

	/**
	 * store della proprieta' associata alla colonna L11_1_CO_NO_ARIA_PPM
	 * @generated
	 */
	protected java.math.BigDecimal l111CoNoAriaPpm;

	/**
	 * Imposta il valore della proprieta' l111CoNoAriaPpm associata alla
	 * colonna L11_1_CO_NO_ARIA_PPM.
	 * @generated
	 */
	public void setL111CoNoAriaPpm(java.math.BigDecimal val) {

		l111CoNoAriaPpm = val;

	}

	/**
	 * Legge il valore della proprieta' l111CoNoAriaPpm associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL111CoNoAriaPpm() {

		return l111CoNoAriaPpm;

	}

	/**
	 * store della proprieta' associata alla colonna L11_1_FLG_RISPETTA_BACHARACH
	 * @generated
	 */
	protected java.math.BigDecimal l111FlgRispettaBacharach;

	/**
	 * Imposta il valore della proprieta' l111FlgRispettaBacharach associata alla
	 * colonna L11_1_FLG_RISPETTA_BACHARACH.
	 * @generated
	 */
	public void setL111FlgRispettaBacharach(java.math.BigDecimal val) {

		l111FlgRispettaBacharach = val;

	}

	/**
	 * Legge il valore della proprieta' l111FlgRispettaBacharach associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL111FlgRispettaBacharach() {

		return l111FlgRispettaBacharach;

	}

	/**
	 * store della proprieta' associata alla colonna L11_1_FLG_CO_MIN_1000
	 * @generated
	 */
	protected java.math.BigDecimal l111FlgCoMin1000;

	/**
	 * Imposta il valore della proprieta' l111FlgCoMin1000 associata alla
	 * colonna L11_1_FLG_CO_MIN_1000.
	 * @generated
	 */
	public void setL111FlgCoMin1000(java.math.BigDecimal val) {

		l111FlgCoMin1000 = val;

	}

	/**
	 * Legge il valore della proprieta' l111FlgCoMin1000 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL111FlgCoMin1000() {

		return l111FlgCoMin1000;

	}

	/**
	 * store della proprieta' associata alla colonna L11_1_FLG_REND_MAG_REND_MIN
	 * @generated
	 */
	protected java.math.BigDecimal l111FlgRendMagRendMin;

	/**
	 * Imposta il valore della proprieta' l111FlgRendMagRendMin associata alla
	 * colonna L11_1_FLG_REND_MAG_REND_MIN.
	 * @generated
	 */
	public void setL111FlgRendMagRendMin(java.math.BigDecimal val) {

		l111FlgRendMagRendMin = val;

	}

	/**
	 * Legge il valore della proprieta' l111FlgRendMagRendMin associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL111FlgRendMagRendMin() {

		return l111FlgRendMagRendMin;

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
