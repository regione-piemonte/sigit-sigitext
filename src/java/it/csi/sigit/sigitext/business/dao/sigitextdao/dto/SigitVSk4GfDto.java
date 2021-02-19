package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitVSk4GfDao.
 * @generated
 */
public class SigitVSk4GfDto implements Serializable {

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
	 * store della proprieta' associata alla colonna FK_DETTAGLIO_GF
	 * @generated
	 */
	protected java.math.BigDecimal fkDettaglioGf;

	/**
	 * Imposta il valore della proprieta' fkDettaglioGf associata alla
	 * colonna FK_DETTAGLIO_GF.
	 * @generated
	 */
	public void setFkDettaglioGf(java.math.BigDecimal val) {

		fkDettaglioGf = val;

	}

	/**
	 * Legge il valore della proprieta' fkDettaglioGf associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkDettaglioGf() {

		return fkDettaglioGf;

	}

	/**
	 * store della proprieta' associata alla colonna DES_DETTAGLIO_GF
	 * @generated
	 */
	protected String desDettaglioGf;

	/**
	 * Imposta il valore della proprieta' desDettaglioGf associata alla
	 * colonna DES_DETTAGLIO_GF.
	 * @generated
	 */
	public void setDesDettaglioGf(String val) {

		desDettaglioGf = val;

	}

	/**
	 * Legge il valore della proprieta' desDettaglioGf associata alla
	 * @generated
	 */
	public String getDesDettaglioGf() {

		return desDettaglioGf;

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
	 * store della proprieta' associata alla colonna FLG_SORGENTE_EXT
	 * @generated
	 */
	protected String flgSorgenteExt;

	/**
	 * Imposta il valore della proprieta' flgSorgenteExt associata alla
	 * colonna FLG_SORGENTE_EXT.
	 * @generated
	 */
	public void setFlgSorgenteExt(String val) {

		flgSorgenteExt = val;

	}

	/**
	 * Legge il valore della proprieta' flgSorgenteExt associata alla
	 * @generated
	 */
	public String getFlgSorgenteExt() {

		return flgSorgenteExt;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_FLUIDO_UTENZE
	 * @generated
	 */
	protected String flgFluidoUtenze;

	/**
	 * Imposta il valore della proprieta' flgFluidoUtenze associata alla
	 * colonna FLG_FLUIDO_UTENZE.
	 * @generated
	 */
	public void setFlgFluidoUtenze(String val) {

		flgFluidoUtenze = val;

	}

	/**
	 * Legge il valore della proprieta' flgFluidoUtenze associata alla
	 * @generated
	 */
	public String getFlgFluidoUtenze() {

		return flgFluidoUtenze;

	}

	/**
	 * store della proprieta' associata alla colonna FLUIDO_FRIGORIGENO
	 * @generated
	 */
	protected String fluidoFrigorigeno;

	/**
	 * Imposta il valore della proprieta' fluidoFrigorigeno associata alla
	 * colonna FLUIDO_FRIGORIGENO.
	 * @generated
	 */
	public void setFluidoFrigorigeno(String val) {

		fluidoFrigorigeno = val;

	}

	/**
	 * Legge il valore della proprieta' fluidoFrigorigeno associata alla
	 * @generated
	 */
	public String getFluidoFrigorigeno() {

		return fluidoFrigorigeno;

	}

	/**
	 * store della proprieta' associata alla colonna N_CIRCUITI
	 * @generated
	 */
	protected java.math.BigDecimal nCircuiti;

	/**
	 * Imposta il valore della proprieta' nCircuiti associata alla
	 * colonna N_CIRCUITI.
	 * @generated
	 */
	public void setNCircuiti(java.math.BigDecimal val) {

		nCircuiti = val;

	}

	/**
	 * Legge il valore della proprieta' nCircuiti associata alla
	 * @generated
	 */
	public java.math.BigDecimal getNCircuiti() {

		return nCircuiti;

	}

	/**
	 * store della proprieta' associata alla colonna RAFFRESCAMENTO_EER
	 * @generated
	 */
	protected String raffrescamentoEer;

	/**
	 * Imposta il valore della proprieta' raffrescamentoEer associata alla
	 * colonna RAFFRESCAMENTO_EER.
	 * @generated
	 */
	public void setRaffrescamentoEer(String val) {

		raffrescamentoEer = val;

	}

	/**
	 * Legge il valore della proprieta' raffrescamentoEer associata alla
	 * @generated
	 */
	public String getRaffrescamentoEer() {

		return raffrescamentoEer;

	}

	/**
	 * store della proprieta' associata alla colonna RAFF_POTENZA_KW
	 * @generated
	 */
	protected java.math.BigDecimal raffPotenzaKw;

	/**
	 * Imposta il valore della proprieta' raffPotenzaKw associata alla
	 * colonna RAFF_POTENZA_KW.
	 * @generated
	 */
	public void setRaffPotenzaKw(java.math.BigDecimal val) {

		raffPotenzaKw = val;

	}

	/**
	 * Legge il valore della proprieta' raffPotenzaKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getRaffPotenzaKw() {

		return raffPotenzaKw;

	}

	/**
	 * store della proprieta' associata alla colonna RAFF_POTENZA_ASS
	 * @generated
	 */
	protected java.math.BigDecimal raffPotenzaAss;

	/**
	 * Imposta il valore della proprieta' raffPotenzaAss associata alla
	 * colonna RAFF_POTENZA_ASS.
	 * @generated
	 */
	public void setRaffPotenzaAss(java.math.BigDecimal val) {

		raffPotenzaAss = val;

	}

	/**
	 * Legge il valore della proprieta' raffPotenzaAss associata alla
	 * @generated
	 */
	public java.math.BigDecimal getRaffPotenzaAss() {

		return raffPotenzaAss;

	}

	/**
	 * store della proprieta' associata alla colonna RISCALDAMENTO_COP
	 * @generated
	 */
	protected String riscaldamentoCop;

	/**
	 * Imposta il valore della proprieta' riscaldamentoCop associata alla
	 * colonna RISCALDAMENTO_COP.
	 * @generated
	 */
	public void setRiscaldamentoCop(String val) {

		riscaldamentoCop = val;

	}

	/**
	 * Legge il valore della proprieta' riscaldamentoCop associata alla
	 * @generated
	 */
	public String getRiscaldamentoCop() {

		return riscaldamentoCop;

	}

	/**
	 * store della proprieta' associata alla colonna RISC_POTENZA_KW
	 * @generated
	 */
	protected java.math.BigDecimal riscPotenzaKw;

	/**
	 * Imposta il valore della proprieta' riscPotenzaKw associata alla
	 * colonna RISC_POTENZA_KW.
	 * @generated
	 */
	public void setRiscPotenzaKw(java.math.BigDecimal val) {

		riscPotenzaKw = val;

	}

	/**
	 * Legge il valore della proprieta' riscPotenzaKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getRiscPotenzaKw() {

		return riscPotenzaKw;

	}

	/**
	 * store della proprieta' associata alla colonna RISC_POTENZA_ASS_KW
	 * @generated
	 */
	protected java.math.BigDecimal riscPotenzaAssKw;

	/**
	 * Imposta il valore della proprieta' riscPotenzaAssKw associata alla
	 * colonna RISC_POTENZA_ASS_KW.
	 * @generated
	 */
	public void setRiscPotenzaAssKw(java.math.BigDecimal val) {

		riscPotenzaAssKw = val;

	}

	/**
	 * Legge il valore della proprieta' riscPotenzaAssKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getRiscPotenzaAssKw() {

		return riscPotenzaAssKw;

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
