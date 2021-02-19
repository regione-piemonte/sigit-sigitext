package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitRAllegatoCompGtDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitRAllegatoCompGtPk implements Serializable {

	private static final long serialVersionUID = 1L;

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
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitRAllegatoCompGtPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitRAllegatoCompGtPk(

			final java.math.BigDecimal idAllegato, final String idTipoComponente,
			final java.math.BigDecimal progressivo, final java.math.BigDecimal codiceImpianto,
			final java.sql.Date dataInstall

	) {

		this.setIdAllegato(idAllegato);

		this.setIdTipoComponente(idTipoComponente);

		this.setProgressivo(progressivo);

		this.setCodiceImpianto(codiceImpianto);

		this.setDataInstall(dataInstall);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitRAllegatoCompGtPk sono equals se i valori di tutti i campi coincidono.
	 * 
	 * @param _other
	 * @return boolean se i due oggetti sono uguali
	 */
	public boolean equals(Object _other) {
		if (_other == null) {
			return false;
		}

		if (_other == this) {
			return true;
		}

		if (!(_other instanceof SigitRAllegatoCompGtPk)) {
			return false;
		}

		final SigitRAllegatoCompGtPk _cast = (SigitRAllegatoCompGtPk) _other;

		if (idAllegato == null ? _cast.getIdAllegato() != null : !idAllegato.equals(_cast.getIdAllegato())) {
			return false;
		}

		if (idTipoComponente == null
				? _cast.getIdTipoComponente() != null
				: !idTipoComponente.equals(_cast.getIdTipoComponente())) {
			return false;
		}

		if (progressivo == null ? _cast.getProgressivo() != null : !progressivo.equals(_cast.getProgressivo())) {
			return false;
		}

		if (codiceImpianto == null
				? _cast.getCodiceImpianto() != null
				: !codiceImpianto.equals(_cast.getCodiceImpianto())) {
			return false;
		}

		if (dataInstall == null ? _cast.getDataInstall() != null : !dataInstall.equals(_cast.getDataInstall())) {
			return false;
		}

		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode() {
		int _hashCode = 0;

		if (idAllegato != null) {
			_hashCode = 29 * _hashCode + idAllegato.hashCode();
		}

		if (idTipoComponente != null) {
			_hashCode = 29 * _hashCode + idTipoComponente.hashCode();
		}

		if (progressivo != null) {
			_hashCode = 29 * _hashCode + progressivo.hashCode();
		}

		if (codiceImpianto != null) {
			_hashCode = 29 * _hashCode + codiceImpianto.hashCode();
		}

		if (dataInstall != null) {
			_hashCode = 29 * _hashCode + dataInstall.hashCode();
		}

		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString() {
		StringBuilder ret = new StringBuilder();

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRAllegatoCompGtPk: ");
		ret.append("idAllegato=" + idAllegato);

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRAllegatoCompGtPk: ");
		ret.append("idTipoComponente=" + idTipoComponente);

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRAllegatoCompGtPk: ");
		ret.append("progressivo=" + progressivo);

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRAllegatoCompGtPk: ");
		ret.append("codiceImpianto=" + codiceImpianto);

		ret.append("it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRAllegatoCompGtPk: ");
		ret.append("dataInstall=" + dataInstall);

		return ret.toString();
	}
}
