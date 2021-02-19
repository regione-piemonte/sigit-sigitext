package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompBrRcDao.
 * @generated
 */
public class SigitTCompBrRcDto extends SigitTCompBrRcPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna TIPOLOGIA_BR_RC
	 * @generated
	 */
	protected String tipologiaBrRc;

	/**
	 * Imposta il valore della proprieta' tipologiaBrRc associata alla
	 * colonna TIPOLOGIA_BR_RC.
	 * @generated
	 */
	public void setTipologiaBrRc(String val) {

		tipologiaBrRc = val;

	}

	/**
	 * Legge il valore della proprieta' tipologiaBrRc associata alla
	 * @generated
	 */
	public String getTipologiaBrRc() {

		return tipologiaBrRc;

	}

	/**
	 * store della proprieta' associata alla colonna PROGRESSIVO_BR_RC
	 * @generated
	 */
	protected java.math.BigDecimal progressivoBrRc;

	/**
	 * Imposta il valore della proprieta' progressivoBrRc associata alla
	 * colonna PROGRESSIVO_BR_RC.
	 * @generated
	 */
	public void setProgressivoBrRc(java.math.BigDecimal val) {

		progressivoBrRc = val;

	}

	/**
	 * Legge il valore della proprieta' progressivoBrRc associata alla
	 * @generated
	 */
	public java.math.BigDecimal getProgressivoBrRc() {

		return progressivoBrRc;

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
	 * store della proprieta' associata alla colonna FK_PROGRESSIVO
	 * @generated
	 */
	protected java.math.BigDecimal fkProgressivo;

	/**
	 * Imposta il valore della proprieta' fkProgressivo associata alla
	 * colonna FK_PROGRESSIVO.
	 * @generated
	 */
	public void setFkProgressivo(java.math.BigDecimal val) {

		fkProgressivo = val;

	}

	/**
	 * Legge il valore della proprieta' fkProgressivo associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkProgressivo() {

		return fkProgressivo;

	}

	/**
	 * store della proprieta' associata alla colonna FK_DATA_INSTALL
	 * @generated
	 */
	protected java.sql.Date fkDataInstall;

	/**
	 * Imposta il valore della proprieta' fkDataInstall associata alla
	 * colonna FK_DATA_INSTALL.
	 * @generated
	 */
	public void setFkDataInstall(java.sql.Date val) {

		if (val != null) {
			fkDataInstall = new java.sql.Date(val.getTime());
		} else {
			fkDataInstall = null;
		}

	}

	/**
	 * Legge il valore della proprieta' fkDataInstall associata alla
	 * @generated
	 */
	public java.sql.Date getFkDataInstall() {

		if (fkDataInstall != null) {
			return new java.sql.Date(fkDataInstall.getTime());
		} else {
			return null;
		}

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
	 * store della proprieta' associata alla colonna POT_TERM_MAX_KW
	 * @generated
	 */
	protected java.math.BigDecimal potTermMaxKw;

	/**
	 * Imposta il valore della proprieta' potTermMaxKw associata alla
	 * colonna POT_TERM_MAX_KW.
	 * @generated
	 */
	public void setPotTermMaxKw(java.math.BigDecimal val) {

		potTermMaxKw = val;

	}

	/**
	 * Legge il valore della proprieta' potTermMaxKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPotTermMaxKw() {

		return potTermMaxKw;

	}

	/**
	 * store della proprieta' associata alla colonna POT_TERM_MIN_KW
	 * @generated
	 */
	protected java.math.BigDecimal potTermMinKw;

	/**
	 * Imposta il valore della proprieta' potTermMinKw associata alla
	 * colonna POT_TERM_MIN_KW.
	 * @generated
	 */
	public void setPotTermMinKw(java.math.BigDecimal val) {

		potTermMinKw = val;

	}

	/**
	 * Legge il valore della proprieta' potTermMinKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPotTermMinKw() {

		return potTermMinKw;

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
	 * Crea una istanza di SigitTCompBrRcPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompBrRcPk
	 * @generated
	 */
	public SigitTCompBrRcPk createPk() {
		return new SigitTCompBrRcPk(idCompBrRc);
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
