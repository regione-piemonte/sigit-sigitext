package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitVCompVmDao.
 * @generated
 */
public class SigitVCompVmDto implements Serializable {

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
	 * store della proprieta' associata alla colonna FK_DETTAGLIO_VM
	 * @generated
	 */
	protected java.math.BigDecimal fkDettaglioVm;

	/**
	 * Imposta il valore della proprieta' fkDettaglioVm associata alla
	 * colonna FK_DETTAGLIO_VM.
	 * @generated
	 */
	public void setFkDettaglioVm(java.math.BigDecimal val) {

		fkDettaglioVm = val;

	}

	/**
	 * Legge il valore della proprieta' fkDettaglioVm associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkDettaglioVm() {

		return fkDettaglioVm;

	}

	/**
	 * store della proprieta' associata alla colonna DES_DETTAGLIO_VM
	 * @generated
	 */
	protected String desDettaglioVm;

	/**
	 * Imposta il valore della proprieta' desDettaglioVm associata alla
	 * colonna DES_DETTAGLIO_VM.
	 * @generated
	 */
	public void setDesDettaglioVm(String val) {

		desDettaglioVm = val;

	}

	/**
	 * Legge il valore della proprieta' desDettaglioVm associata alla
	 * @generated
	 */
	public String getDesDettaglioVm() {

		return desDettaglioVm;

	}

	/**
	 * store della proprieta' associata alla colonna ALTRO_TIPOLOGIA
	 * @generated
	 */
	protected String altroTipologia;

	/**
	 * Imposta il valore della proprieta' altroTipologia associata alla
	 * colonna ALTRO_TIPOLOGIA.
	 * @generated
	 */
	public void setAltroTipologia(String val) {

		altroTipologia = val;

	}

	/**
	 * Legge il valore della proprieta' altroTipologia associata alla
	 * @generated
	 */
	public String getAltroTipologia() {

		return altroTipologia;

	}

	/**
	 * store della proprieta' associata alla colonna PORTATA_MAX_ARIA_M3H
	 * @generated
	 */
	protected java.math.BigDecimal portataMaxAriaM3h;

	/**
	 * Imposta il valore della proprieta' portataMaxAriaM3h associata alla
	 * colonna PORTATA_MAX_ARIA_M3H.
	 * @generated
	 */
	public void setPortataMaxAriaM3h(java.math.BigDecimal val) {

		portataMaxAriaM3h = val;

	}

	/**
	 * Legge il valore della proprieta' portataMaxAriaM3h associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPortataMaxAriaM3h() {

		return portataMaxAriaM3h;

	}

	/**
	 * store della proprieta' associata alla colonna RENDIMENTO_COP
	 * @generated
	 */
	protected String rendimentoCop;

	/**
	 * Imposta il valore della proprieta' rendimentoCop associata alla
	 * colonna RENDIMENTO_COP.
	 * @generated
	 */
	public void setRendimentoCop(String val) {

		rendimentoCop = val;

	}

	/**
	 * Legge il valore della proprieta' rendimentoCop associata alla
	 * @generated
	 */
	public String getRendimentoCop() {

		return rendimentoCop;

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

}
