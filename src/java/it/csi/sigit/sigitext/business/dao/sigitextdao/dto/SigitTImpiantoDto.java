package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTImpiantoDao.
 * @generated
 */
public class SigitTImpiantoDto extends SigitTImpiantoPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ISTAT_COMUNE
	 * @generated
	 */
	protected String istatComune;

	/**
	 * Imposta il valore della proprieta' istatComune associata alla
	 * colonna ISTAT_COMUNE.
	 * @generated
	 */
	public void setIstatComune(String val) {

		istatComune = val;

	}

	/**
	 * Legge il valore della proprieta' istatComune associata alla
	 * @generated
	 */
	public String getIstatComune() {

		return istatComune;

	}

	/**
	 * store della proprieta' associata alla colonna FK_STATO
	 * @generated
	 */
	protected java.math.BigDecimal fkStato;

	/**
	 * Imposta il valore della proprieta' fkStato associata alla
	 * colonna FK_STATO.
	 * @generated
	 */
	public void setFkStato(java.math.BigDecimal val) {

		fkStato = val;

	}

	/**
	 * Legge il valore della proprieta' fkStato associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkStato() {

		return fkStato;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_ASSEGNAZIONE
	 * @generated
	 */
	protected java.sql.Date dataAssegnazione;

	/**
	 * Imposta il valore della proprieta' dataAssegnazione associata alla
	 * colonna DATA_ASSEGNAZIONE.
	 * @generated
	 */
	public void setDataAssegnazione(java.sql.Date val) {

		if (val != null) {
			dataAssegnazione = new java.sql.Date(val.getTime());
		} else {
			dataAssegnazione = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataAssegnazione associata alla
	 * @generated
	 */
	public java.sql.Date getDataAssegnazione() {

		if (dataAssegnazione != null) {
			return new java.sql.Date(dataAssegnazione.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna DATA_DISMISSIONE
	 * @generated
	 */
	protected java.sql.Date dataDismissione;

	/**
	 * Imposta il valore della proprieta' dataDismissione associata alla
	 * colonna DATA_DISMISSIONE.
	 * @generated
	 */
	public void setDataDismissione(java.sql.Date val) {

		if (val != null) {
			dataDismissione = new java.sql.Date(val.getTime());
		} else {
			dataDismissione = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataDismissione associata alla
	 * @generated
	 */
	public java.sql.Date getDataDismissione() {

		if (dataDismissione != null) {
			return new java.sql.Date(dataDismissione.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna DENOMINAZIONE_COMUNE
	 * @generated
	 */
	protected String denominazioneComune;

	/**
	 * Imposta il valore della proprieta' denominazioneComune associata alla
	 * colonna DENOMINAZIONE_COMUNE.
	 * @generated
	 */
	public void setDenominazioneComune(String val) {

		denominazioneComune = val;

	}

	/**
	 * Legge il valore della proprieta' denominazioneComune associata alla
	 * @generated
	 */
	public String getDenominazioneComune() {

		return denominazioneComune;

	}

	/**
	 * store della proprieta' associata alla colonna SIGLA_PROVINCIA
	 * @generated
	 */
	protected String siglaProvincia;

	/**
	 * Imposta il valore della proprieta' siglaProvincia associata alla
	 * colonna SIGLA_PROVINCIA.
	 * @generated
	 */
	public void setSiglaProvincia(String val) {

		siglaProvincia = val;

	}

	/**
	 * Legge il valore della proprieta' siglaProvincia associata alla
	 * @generated
	 */
	public String getSiglaProvincia() {

		return siglaProvincia;

	}

	/**
	 * store della proprieta' associata alla colonna DENOMINAZIONE_PROVINCIA
	 * @generated
	 */
	protected String denominazioneProvincia;

	/**
	 * Imposta il valore della proprieta' denominazioneProvincia associata alla
	 * colonna DENOMINAZIONE_PROVINCIA.
	 * @generated
	 */
	public void setDenominazioneProvincia(String val) {

		denominazioneProvincia = val;

	}

	/**
	 * Legge il valore della proprieta' denominazioneProvincia associata alla
	 * @generated
	 */
	public String getDenominazioneProvincia() {

		return denominazioneProvincia;

	}

	/**
	 * store della proprieta' associata alla colonna L1_3_POT_H2O_KW
	 * @generated
	 */
	protected java.math.BigDecimal l13PotH2oKw;

	/**
	 * Imposta il valore della proprieta' l13PotH2oKw associata alla
	 * colonna L1_3_POT_H2O_KW.
	 * @generated
	 */
	public void setL13PotH2oKw(java.math.BigDecimal val) {

		l13PotH2oKw = val;

	}

	/**
	 * Legge il valore della proprieta' l13PotH2oKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL13PotH2oKw() {

		return l13PotH2oKw;

	}

	/**
	 * store della proprieta' associata alla colonna L1_3_POT_CLIMA_INV_KW
	 * @generated
	 */
	protected java.math.BigDecimal l13PotClimaInvKw;

	/**
	 * Imposta il valore della proprieta' l13PotClimaInvKw associata alla
	 * colonna L1_3_POT_CLIMA_INV_KW.
	 * @generated
	 */
	public void setL13PotClimaInvKw(java.math.BigDecimal val) {

		l13PotClimaInvKw = val;

	}

	/**
	 * Legge il valore della proprieta' l13PotClimaInvKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL13PotClimaInvKw() {

		return l13PotClimaInvKw;

	}

	/**
	 * store della proprieta' associata alla colonna L1_3_POT_CLIMA_EST_KW
	 * @generated
	 */
	protected java.math.BigDecimal l13PotClimaEstKw;

	/**
	 * Imposta il valore della proprieta' l13PotClimaEstKw associata alla
	 * colonna L1_3_POT_CLIMA_EST_KW.
	 * @generated
	 */
	public void setL13PotClimaEstKw(java.math.BigDecimal val) {

		l13PotClimaEstKw = val;

	}

	/**
	 * Legge il valore della proprieta' l13PotClimaEstKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL13PotClimaEstKw() {

		return l13PotClimaEstKw;

	}

	/**
	 * store della proprieta' associata alla colonna L1_3_ALTRO
	 * @generated
	 */
	protected String l13Altro;

	/**
	 * Imposta il valore della proprieta' l13Altro associata alla
	 * colonna L1_3_ALTRO.
	 * @generated
	 */
	public void setL13Altro(String val) {

		l13Altro = val;

	}

	/**
	 * Legge il valore della proprieta' l13Altro associata alla
	 * @generated
	 */
	public String getL13Altro() {

		return l13Altro;

	}

	/**
	 * store della proprieta' associata alla colonna L1_4_FLG_H2O
	 * @generated
	 */
	protected java.math.BigDecimal l14FlgH2o;

	/**
	 * Imposta il valore della proprieta' l14FlgH2o associata alla
	 * colonna L1_4_FLG_H2O.
	 * @generated
	 */
	public void setL14FlgH2o(java.math.BigDecimal val) {

		l14FlgH2o = val;

	}

	/**
	 * Legge il valore della proprieta' l14FlgH2o associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL14FlgH2o() {

		return l14FlgH2o;

	}

	/**
	 * store della proprieta' associata alla colonna L1_4_FLG_ARIA
	 * @generated
	 */
	protected java.math.BigDecimal l14FlgAria;

	/**
	 * Imposta il valore della proprieta' l14FlgAria associata alla
	 * colonna L1_4_FLG_ARIA.
	 * @generated
	 */
	public void setL14FlgAria(java.math.BigDecimal val) {

		l14FlgAria = val;

	}

	/**
	 * Legge il valore della proprieta' l14FlgAria associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL14FlgAria() {

		return l14FlgAria;

	}

	/**
	 * store della proprieta' associata alla colonna L1_4_ALTRO
	 * @generated
	 */
	protected String l14Altro;

	/**
	 * Imposta il valore della proprieta' l14Altro associata alla
	 * colonna L1_4_ALTRO.
	 * @generated
	 */
	public void setL14Altro(String val) {

		l14Altro = val;

	}

	/**
	 * Legge il valore della proprieta' l14Altro associata alla
	 * @generated
	 */
	public String getL14Altro() {

		return l14Altro;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_FLG_GENERATORE
	 * @generated
	 */
	protected java.math.BigDecimal l15FlgGeneratore;

	/**
	 * Imposta il valore della proprieta' l15FlgGeneratore associata alla
	 * colonna L1_5_FLG_GENERATORE.
	 * @generated
	 */
	public void setL15FlgGeneratore(java.math.BigDecimal val) {

		l15FlgGeneratore = val;

	}

	/**
	 * Legge il valore della proprieta' l15FlgGeneratore associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL15FlgGeneratore() {

		return l15FlgGeneratore;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_FLG_POMPA
	 * @generated
	 */
	protected java.math.BigDecimal l15FlgPompa;

	/**
	 * Imposta il valore della proprieta' l15FlgPompa associata alla
	 * colonna L1_5_FLG_POMPA.
	 * @generated
	 */
	public void setL15FlgPompa(java.math.BigDecimal val) {

		l15FlgPompa = val;

	}

	/**
	 * Legge il valore della proprieta' l15FlgPompa associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL15FlgPompa() {

		return l15FlgPompa;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_FLG_FRIGO
	 * @generated
	 */
	protected java.math.BigDecimal l15FlgFrigo;

	/**
	 * Imposta il valore della proprieta' l15FlgFrigo associata alla
	 * colonna L1_5_FLG_FRIGO.
	 * @generated
	 */
	public void setL15FlgFrigo(java.math.BigDecimal val) {

		l15FlgFrigo = val;

	}

	/**
	 * Legge il valore della proprieta' l15FlgFrigo associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL15FlgFrigo() {

		return l15FlgFrigo;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_FLG_TELERISC
	 * @generated
	 */
	protected java.math.BigDecimal l15FlgTelerisc;

	/**
	 * Imposta il valore della proprieta' l15FlgTelerisc associata alla
	 * colonna L1_5_FLG_TELERISC.
	 * @generated
	 */
	public void setL15FlgTelerisc(java.math.BigDecimal val) {

		l15FlgTelerisc = val;

	}

	/**
	 * Legge il valore della proprieta' l15FlgTelerisc associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL15FlgTelerisc() {

		return l15FlgTelerisc;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_FLG_TELERAFFR
	 * @generated
	 */
	protected java.math.BigDecimal l15FlgTeleraffr;

	/**
	 * Imposta il valore della proprieta' l15FlgTeleraffr associata alla
	 * colonna L1_5_FLG_TELERAFFR.
	 * @generated
	 */
	public void setL15FlgTeleraffr(java.math.BigDecimal val) {

		l15FlgTeleraffr = val;

	}

	/**
	 * Legge il valore della proprieta' l15FlgTeleraffr associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL15FlgTeleraffr() {

		return l15FlgTeleraffr;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_FLG_COGENERATORE
	 * @generated
	 */
	protected java.math.BigDecimal l15FlgCogeneratore;

	/**
	 * Imposta il valore della proprieta' l15FlgCogeneratore associata alla
	 * colonna L1_5_FLG_COGENERATORE.
	 * @generated
	 */
	public void setL15FlgCogeneratore(java.math.BigDecimal val) {

		l15FlgCogeneratore = val;

	}

	/**
	 * Legge il valore della proprieta' l15FlgCogeneratore associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL15FlgCogeneratore() {

		return l15FlgCogeneratore;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_ALTRO
	 * @generated
	 */
	protected String l15Altro;

	/**
	 * Imposta il valore della proprieta' l15Altro associata alla
	 * colonna L1_5_ALTRO.
	 * @generated
	 */
	public void setL15Altro(String val) {

		l15Altro = val;

	}

	/**
	 * Legge il valore della proprieta' l15Altro associata alla
	 * @generated
	 */
	public String getL15Altro() {

		return l15Altro;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_SUP_PANNELLI_SOL_M2
	 * @generated
	 */
	protected java.math.BigDecimal l15SupPannelliSolM2;

	/**
	 * Imposta il valore della proprieta' l15SupPannelliSolM2 associata alla
	 * colonna L1_5_SUP_PANNELLI_SOL_M2.
	 * @generated
	 */
	public void setL15SupPannelliSolM2(java.math.BigDecimal val) {

		l15SupPannelliSolM2 = val;

	}

	/**
	 * Legge il valore della proprieta' l15SupPannelliSolM2 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL15SupPannelliSolM2() {

		return l15SupPannelliSolM2;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_ALTRO_INTEGRAZIONE
	 * @generated
	 */
	protected String l15AltroIntegrazione;

	/**
	 * Imposta il valore della proprieta' l15AltroIntegrazione associata alla
	 * colonna L1_5_ALTRO_INTEGRAZIONE.
	 * @generated
	 */
	public void setL15AltroIntegrazione(String val) {

		l15AltroIntegrazione = val;

	}

	/**
	 * Legge il valore della proprieta' l15AltroIntegrazione associata alla
	 * @generated
	 */
	public String getL15AltroIntegrazione() {

		return l15AltroIntegrazione;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_ALTRO_INTEGR_POT_KW
	 * @generated
	 */
	protected java.math.BigDecimal l15AltroIntegrPotKw;

	/**
	 * Imposta il valore della proprieta' l15AltroIntegrPotKw associata alla
	 * colonna L1_5_ALTRO_INTEGR_POT_KW.
	 * @generated
	 */
	public void setL15AltroIntegrPotKw(java.math.BigDecimal val) {

		l15AltroIntegrPotKw = val;

	}

	/**
	 * Legge il valore della proprieta' l15AltroIntegrPotKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL15AltroIntegrPotKw() {

		return l15AltroIntegrPotKw;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_FLG_ALTRO_CLIMA_INV
	 * @generated
	 */
	protected java.math.BigDecimal l15FlgAltroClimaInv;

	/**
	 * Imposta il valore della proprieta' l15FlgAltroClimaInv associata alla
	 * colonna L1_5_FLG_ALTRO_CLIMA_INV.
	 * @generated
	 */
	public void setL15FlgAltroClimaInv(java.math.BigDecimal val) {

		l15FlgAltroClimaInv = val;

	}

	/**
	 * Legge il valore della proprieta' l15FlgAltroClimaInv associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL15FlgAltroClimaInv() {

		return l15FlgAltroClimaInv;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_FLG_ALTRO_CLIMA_ESTATE
	 * @generated
	 */
	protected java.math.BigDecimal l15FlgAltroClimaEstate;

	/**
	 * Imposta il valore della proprieta' l15FlgAltroClimaEstate associata alla
	 * colonna L1_5_FLG_ALTRO_CLIMA_ESTATE.
	 * @generated
	 */
	public void setL15FlgAltroClimaEstate(java.math.BigDecimal val) {

		l15FlgAltroClimaEstate = val;

	}

	/**
	 * Legge il valore della proprieta' l15FlgAltroClimaEstate associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL15FlgAltroClimaEstate() {

		return l15FlgAltroClimaEstate;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_FLG_ALTRO_ACS
	 * @generated
	 */
	protected java.math.BigDecimal l15FlgAltroAcs;

	/**
	 * Imposta il valore della proprieta' l15FlgAltroAcs associata alla
	 * colonna L1_5_FLG_ALTRO_ACS.
	 * @generated
	 */
	public void setL15FlgAltroAcs(java.math.BigDecimal val) {

		l15FlgAltroAcs = val;

	}

	/**
	 * Legge il valore della proprieta' l15FlgAltroAcs associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL15FlgAltroAcs() {

		return l15FlgAltroAcs;

	}

	/**
	 * store della proprieta' associata alla colonna L1_5_ALTRO_DESC
	 * @generated
	 */
	protected String l15AltroDesc;

	/**
	 * Imposta il valore della proprieta' l15AltroDesc associata alla
	 * colonna L1_5_ALTRO_DESC.
	 * @generated
	 */
	public void setL15AltroDesc(String val) {

		l15AltroDesc = val;

	}

	/**
	 * Legge il valore della proprieta' l15AltroDesc associata alla
	 * @generated
	 */
	public String getL15AltroDesc() {

		return l15AltroDesc;

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
	 * store della proprieta' associata alla colonna MOTIVAZIONE
	 * @generated
	 */
	protected String motivazione;

	/**
	 * Imposta il valore della proprieta' motivazione associata alla
	 * colonna MOTIVAZIONE.
	 * @generated
	 */
	public void setMotivazione(String val) {

		motivazione = val;

	}

	/**
	 * Legge il valore della proprieta' motivazione associata alla
	 * @generated
	 */
	public String getMotivazione() {

		return motivazione;

	}

	/**
	 * store della proprieta' associata alla colonna PROPRIETARIO
	 * @generated
	 */
	protected String proprietario;

	/**
	 * Imposta il valore della proprieta' proprietario associata alla
	 * colonna PROPRIETARIO.
	 * @generated
	 */
	public void setProprietario(String val) {

		proprietario = val;

	}

	/**
	 * Legge il valore della proprieta' proprietario associata alla
	 * @generated
	 */
	public String getProprietario() {

		return proprietario;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_INSERIMENTO
	 * @generated
	 */
	protected java.sql.Timestamp dataInserimento;

	/**
	 * Imposta il valore della proprieta' dataInserimento associata alla
	 * colonna DATA_INSERIMENTO.
	 * @generated
	 */
	public void setDataInserimento(java.sql.Timestamp val) {

		if (val != null) {
			dataInserimento = new java.sql.Timestamp(val.getTime());
		} else {
			dataInserimento = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataInserimento associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDataInserimento() {

		if (dataInserimento != null) {
			return new java.sql.Timestamp(dataInserimento.getTime());
		} else {
			return null;
		}

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
	 * store della proprieta' associata alla colonna FLG_TIPO_IMPIANTO
	 * @generated
	 */
	protected String flgTipoImpianto;

	/**
	 * Imposta il valore della proprieta' flgTipoImpianto associata alla
	 * colonna FLG_TIPO_IMPIANTO.
	 * @generated
	 */
	public void setFlgTipoImpianto(String val) {

		flgTipoImpianto = val;

	}

	/**
	 * Legge il valore della proprieta' flgTipoImpianto associata alla
	 * @generated
	 */
	public String getFlgTipoImpianto() {

		return flgTipoImpianto;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_APPARECC_UI_EXT
	 * @generated
	 */
	protected java.math.BigDecimal flgAppareccUiExt;

	/**
	 * Imposta il valore della proprieta' flgAppareccUiExt associata alla
	 * colonna FLG_APPARECC_UI_EXT.
	 * @generated
	 */
	public void setFlgAppareccUiExt(java.math.BigDecimal val) {

		flgAppareccUiExt = val;

	}

	/**
	 * Legge il valore della proprieta' flgAppareccUiExt associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgAppareccUiExt() {

		return flgAppareccUiExt;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_CONTABILIZZAZIONE
	 * @generated
	 */
	protected java.math.BigDecimal flgContabilizzazione;

	/**
	 * Imposta il valore della proprieta' flgContabilizzazione associata alla
	 * colonna FLG_CONTABILIZZAZIONE.
	 * @generated
	 */
	public void setFlgContabilizzazione(java.math.BigDecimal val) {

		flgContabilizzazione = val;

	}

	/**
	 * Legge il valore della proprieta' flgContabilizzazione associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgContabilizzazione() {

		return flgContabilizzazione;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_INTERVENTO
	 * @generated
	 */
	protected java.sql.Date dataIntervento;

	/**
	 * Imposta il valore della proprieta' dataIntervento associata alla
	 * colonna DATA_INTERVENTO.
	 * @generated
	 */
	public void setDataIntervento(java.sql.Date val) {

		if (val != null) {
			dataIntervento = new java.sql.Date(val.getTime());
		} else {
			dataIntervento = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataIntervento associata alla
	 * @generated
	 */
	public java.sql.Date getDataIntervento() {

		if (dataIntervento != null) {
			return new java.sql.Date(dataIntervento.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna FK_TIPO_INTERVENTO
	 * @generated
	 */
	protected java.math.BigDecimal fkTipoIntervento;

	/**
	 * Imposta il valore della proprieta' fkTipoIntervento associata alla
	 * colonna FK_TIPO_INTERVENTO.
	 * @generated
	 */
	public void setFkTipoIntervento(java.math.BigDecimal val) {

		fkTipoIntervento = val;

	}

	/**
	 * Legge il valore della proprieta' fkTipoIntervento associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkTipoIntervento() {

		return fkTipoIntervento;

	}

	/**
	 * store della proprieta' associata alla colonna L11_1_FLG_NORMA_UNI_10389_1
	 * @generated
	 */
	protected java.math.BigDecimal l111FlgNormaUni103891;

	/**
	 * Imposta il valore della proprieta' l111FlgNormaUni103891 associata alla
	 * colonna L11_1_FLG_NORMA_UNI_10389_1.
	 * @generated
	 */
	public void setL111FlgNormaUni103891(java.math.BigDecimal val) {

		l111FlgNormaUni103891 = val;

	}

	/**
	 * Legge il valore della proprieta' l111FlgNormaUni103891 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL111FlgNormaUni103891() {

		return l111FlgNormaUni103891;

	}

	/**
	 * store della proprieta' associata alla colonna L11_1_ALTRA_NORMA
	 * @generated
	 */
	protected String l111AltraNorma;

	/**
	 * Imposta il valore della proprieta' l111AltraNorma associata alla
	 * colonna L11_1_ALTRA_NORMA.
	 * @generated
	 */
	public void setL111AltraNorma(String val) {

		l111AltraNorma = val;

	}

	/**
	 * Legge il valore della proprieta' l111AltraNorma associata alla
	 * @generated
	 */
	public String getL111AltraNorma() {

		return l111AltraNorma;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_BLOCCO_NOMINA_3R
	 * @generated
	 */
	protected java.math.BigDecimal flgBloccoNomina3r;

	/**
	 * Imposta il valore della proprieta' flgBloccoNomina3r associata alla
	 * colonna FLG_BLOCCO_NOMINA_3R.
	 * @generated
	 */
	public void setFlgBloccoNomina3r(java.math.BigDecimal val) {

		flgBloccoNomina3r = val;

	}

	/**
	 * Legge il valore della proprieta' flgBloccoNomina3r associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgBloccoNomina3r() {

		return flgBloccoNomina3r;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_VISU_PROPRIETARIO
	 * @generated
	 */
	protected java.math.BigDecimal flgVisuProprietario;

	/**
	 * Imposta il valore della proprieta' flgVisuProprietario associata alla
	 * colonna FLG_VISU_PROPRIETARIO.
	 * @generated
	 */
	public void setFlgVisuProprietario(java.math.BigDecimal val) {

		flgVisuProprietario = val;

	}

	/**
	 * Legge il valore della proprieta' flgVisuProprietario associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgVisuProprietario() {

		return flgVisuProprietario;

	}

	/**
	 * Crea una istanza di SigitTImpiantoPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTImpiantoPk
	 * @generated
	 */
	public SigitTImpiantoPk createPk() {
		return new SigitTImpiantoPk(codiceImpianto);
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
