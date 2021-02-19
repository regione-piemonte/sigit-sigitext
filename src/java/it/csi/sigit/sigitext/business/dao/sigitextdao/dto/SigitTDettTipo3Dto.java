package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTDettTipo3Dao.
 * @generated
 */
public class SigitTDettTipo3Dto extends SigitTDettTipo3Pk {

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
	 * store della proprieta' associata alla colonna FK_FLUIDO_ALIMENTAZ
	 * @generated
	 */
	protected java.math.BigDecimal fkFluidoAlimentaz;

	/**
	 * Imposta il valore della proprieta' fkFluidoAlimentaz associata alla
	 * colonna FK_FLUIDO_ALIMENTAZ.
	 * @generated
	 */
	public void setFkFluidoAlimentaz(java.math.BigDecimal val) {

		fkFluidoAlimentaz = val;

	}

	/**
	 * Legge il valore della proprieta' fkFluidoAlimentaz associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkFluidoAlimentaz() {

		return fkFluidoAlimentaz;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLUIDO_ALTRO
	 * @generated
	 */
	protected String eFluidoAltro;

	/**
	 * Imposta il valore della proprieta' eFluidoAltro associata alla
	 * colonna E_FLUIDO_ALTRO.
	 * @generated
	 */
	public void setEFluidoAltro(String val) {

		eFluidoAltro = val;

	}

	/**
	 * Legge il valore della proprieta' eFluidoAltro associata alla
	 * @generated
	 */
	public String getEFluidoAltro() {

		return eFluidoAltro;

	}

	/**
	 * store della proprieta' associata alla colonna E_ALIMENTAZIONE_ALTRO
	 * @generated
	 */
	protected String eAlimentazioneAltro;

	/**
	 * Imposta il valore della proprieta' eAlimentazioneAltro associata alla
	 * colonna E_ALIMENTAZIONE_ALTRO.
	 * @generated
	 */
	public void setEAlimentazioneAltro(String val) {

		eAlimentazioneAltro = val;

	}

	/**
	 * Legge il valore della proprieta' eAlimentazioneAltro associata alla
	 * @generated
	 */
	public String getEAlimentazioneAltro() {

		return eAlimentazioneAltro;

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
	 * store della proprieta' associata alla colonna E_FLG_POTENZA_COMPATIBILE
	 * @generated
	 */
	protected java.math.BigDecimal eFlgPotenzaCompatibile;

	/**
	 * Imposta il valore della proprieta' eFlgPotenzaCompatibile associata alla
	 * colonna E_FLG_POTENZA_COMPATIBILE.
	 * @generated
	 */
	public void setEFlgPotenzaCompatibile(java.math.BigDecimal val) {

		eFlgPotenzaCompatibile = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgPotenzaCompatibile associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgPotenzaCompatibile() {

		return eFlgPotenzaCompatibile;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_COIB_IDONEA
	 * @generated
	 */
	protected java.math.BigDecimal eFlgCoibIdonea;

	/**
	 * Imposta il valore della proprieta' eFlgCoibIdonea associata alla
	 * colonna E_FLG_COIB_IDONEA.
	 * @generated
	 */
	public void setEFlgCoibIdonea(java.math.BigDecimal val) {

		eFlgCoibIdonea = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgCoibIdonea associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgCoibIdonea() {

		return eFlgCoibIdonea;

	}

	/**
	 * store della proprieta' associata alla colonna E_FLG_DISP_FUNZIONANTI
	 * @generated
	 */
	protected java.math.BigDecimal eFlgDispFunzionanti;

	/**
	 * Imposta il valore della proprieta' eFlgDispFunzionanti associata alla
	 * colonna E_FLG_DISP_FUNZIONANTI.
	 * @generated
	 */
	public void setEFlgDispFunzionanti(java.math.BigDecimal val) {

		eFlgDispFunzionanti = val;

	}

	/**
	 * Legge il valore della proprieta' eFlgDispFunzionanti associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEFlgDispFunzionanti() {

		return eFlgDispFunzionanti;

	}

	/**
	 * store della proprieta' associata alla colonna E_TEMP_EXT_C
	 * @generated
	 */
	protected java.math.BigDecimal eTempExtC;

	/**
	 * Imposta il valore della proprieta' eTempExtC associata alla
	 * colonna E_TEMP_EXT_C.
	 * @generated
	 */
	public void setETempExtC(java.math.BigDecimal val) {

		eTempExtC = val;

	}

	/**
	 * Legge il valore della proprieta' eTempExtC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETempExtC() {

		return eTempExtC;

	}

	/**
	 * store della proprieta' associata alla colonna E_TEMP_MAND_PRIMARIO_C
	 * @generated
	 */
	protected java.math.BigDecimal eTempMandPrimarioC;

	/**
	 * Imposta il valore della proprieta' eTempMandPrimarioC associata alla
	 * colonna E_TEMP_MAND_PRIMARIO_C.
	 * @generated
	 */
	public void setETempMandPrimarioC(java.math.BigDecimal val) {

		eTempMandPrimarioC = val;

	}

	/**
	 * Legge il valore della proprieta' eTempMandPrimarioC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETempMandPrimarioC() {

		return eTempMandPrimarioC;

	}

	/**
	 * store della proprieta' associata alla colonna E_TEMP_RITOR_PRIMARIO_C
	 * @generated
	 */
	protected java.math.BigDecimal eTempRitorPrimarioC;

	/**
	 * Imposta il valore della proprieta' eTempRitorPrimarioC associata alla
	 * colonna E_TEMP_RITOR_PRIMARIO_C.
	 * @generated
	 */
	public void setETempRitorPrimarioC(java.math.BigDecimal val) {

		eTempRitorPrimarioC = val;

	}

	/**
	 * Legge il valore della proprieta' eTempRitorPrimarioC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETempRitorPrimarioC() {

		return eTempRitorPrimarioC;

	}

	/**
	 * store della proprieta' associata alla colonna E_TEMP_MAND_SECONDARIO_C
	 * @generated
	 */
	protected java.math.BigDecimal eTempMandSecondarioC;

	/**
	 * Imposta il valore della proprieta' eTempMandSecondarioC associata alla
	 * colonna E_TEMP_MAND_SECONDARIO_C.
	 * @generated
	 */
	public void setETempMandSecondarioC(java.math.BigDecimal val) {

		eTempMandSecondarioC = val;

	}

	/**
	 * Legge il valore della proprieta' eTempMandSecondarioC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETempMandSecondarioC() {

		return eTempMandSecondarioC;

	}

	/**
	 * store della proprieta' associata alla colonna E_TEMP_RIT_SECONDARIO_C
	 * @generated
	 */
	protected java.math.BigDecimal eTempRitSecondarioC;

	/**
	 * Imposta il valore della proprieta' eTempRitSecondarioC associata alla
	 * colonna E_TEMP_RIT_SECONDARIO_C.
	 * @generated
	 */
	public void setETempRitSecondarioC(java.math.BigDecimal val) {

		eTempRitSecondarioC = val;

	}

	/**
	 * Legge il valore della proprieta' eTempRitSecondarioC associata alla
	 * @generated
	 */
	public java.math.BigDecimal getETempRitSecondarioC() {

		return eTempRitSecondarioC;

	}

	/**
	 * store della proprieta' associata alla colonna E_POTENZA_TERM_KW
	 * @generated
	 */
	protected java.math.BigDecimal ePotenzaTermKw;

	/**
	 * Imposta il valore della proprieta' ePotenzaTermKw associata alla
	 * colonna E_POTENZA_TERM_KW.
	 * @generated
	 */
	public void setEPotenzaTermKw(java.math.BigDecimal val) {

		ePotenzaTermKw = val;

	}

	/**
	 * Legge il valore della proprieta' ePotenzaTermKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEPotenzaTermKw() {

		return ePotenzaTermKw;

	}

	/**
	 * store della proprieta' associata alla colonna E_PORT_FLUIDO_M3_H
	 * @generated
	 */
	protected java.math.BigDecimal ePortFluidoM3H;

	/**
	 * Imposta il valore della proprieta' ePortFluidoM3H associata alla
	 * colonna E_PORT_FLUIDO_M3_H.
	 * @generated
	 */
	public void setEPortFluidoM3H(java.math.BigDecimal val) {

		ePortFluidoM3H = val;

	}

	/**
	 * Legge il valore della proprieta' ePortFluidoM3H associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEPortFluidoM3H() {

		return ePortFluidoM3H;

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
	 * Crea una istanza di SigitTDettTipo3Pk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTDettTipo3Pk
	 * @generated
	 */
	public SigitTDettTipo3Pk createPk() {
		return new SigitTDettTipo3Pk(idDettTipo3);
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
