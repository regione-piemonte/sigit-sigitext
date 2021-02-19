package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitVCompUtDao.
 * @generated
 */
public class SigitVCompUtDto implements Serializable {

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
	 * store della proprieta' associata alla colonna PORTATA_MANDATA_LS
	 * @generated
	 */
	protected java.math.BigDecimal portataMandataLs;

	/**
	 * Imposta il valore della proprieta' portataMandataLs associata alla
	 * colonna PORTATA_MANDATA_LS.
	 * @generated
	 */
	public void setPortataMandataLs(java.math.BigDecimal val) {

		portataMandataLs = val;

	}

	/**
	 * Legge il valore della proprieta' portataMandataLs associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPortataMandataLs() {

		return portataMandataLs;

	}

	/**
	 * store della proprieta' associata alla colonna PORTATA_RIPRESA_LS
	 * @generated
	 */
	protected java.math.BigDecimal portataRipresaLs;

	/**
	 * Imposta il valore della proprieta' portataRipresaLs associata alla
	 * colonna PORTATA_RIPRESA_LS.
	 * @generated
	 */
	public void setPortataRipresaLs(java.math.BigDecimal val) {

		portataRipresaLs = val;

	}

	/**
	 * Legge il valore della proprieta' portataRipresaLs associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPortataRipresaLs() {

		return portataRipresaLs;

	}

	/**
	 * store della proprieta' associata alla colonna POTENZA_MANDATA_KW
	 * @generated
	 */
	protected java.math.BigDecimal potenzaMandataKw;

	/**
	 * Imposta il valore della proprieta' potenzaMandataKw associata alla
	 * colonna POTENZA_MANDATA_KW.
	 * @generated
	 */
	public void setPotenzaMandataKw(java.math.BigDecimal val) {

		potenzaMandataKw = val;

	}

	/**
	 * Legge il valore della proprieta' potenzaMandataKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPotenzaMandataKw() {

		return potenzaMandataKw;

	}

	/**
	 * store della proprieta' associata alla colonna POTENZA_RIPRESA_KW
	 * @generated
	 */
	protected java.math.BigDecimal potenzaRipresaKw;

	/**
	 * Imposta il valore della proprieta' potenzaRipresaKw associata alla
	 * colonna POTENZA_RIPRESA_KW.
	 * @generated
	 */
	public void setPotenzaRipresaKw(java.math.BigDecimal val) {

		potenzaRipresaKw = val;

	}

	/**
	 * Legge il valore della proprieta' potenzaRipresaKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPotenzaRipresaKw() {

		return potenzaRipresaKw;

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
