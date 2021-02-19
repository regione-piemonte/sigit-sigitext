/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;


import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitVTotImpiantoDao.
 * @generated
 */
public class ExtImpiantoDto implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna CODICE_IMPIANTO
	 * @generated
	 */
	private java.math.BigDecimal _codiceImpianto;

	/**
	 * Imposta il valore della proprieta' codiceImpianto associata alla
	 * colonna CODICE_IMPIANTO.
	 * @generated
	 */
	public void setCodiceImpianto(java.math.BigDecimal val) {
		_codiceImpianto = val;
	}

	/**
	 * Legge il valore della proprieta' codiceImpianto associata alla
	 * @generated
	 */
	public java.math.BigDecimal getCodiceImpianto() {
		return _codiceImpianto;
	}

	/**
	 * store della proprieta' associata alla colonna DES_STATO
	 * @generated
	 */
	private String _desStato;

	/**
	 * Imposta il valore della proprieta' desStatoDistrib associata alla
	 * colonna DES_STATO.
	 * @generated
	 */
	public void setDesStato(String val) {
		_desStato = val;
	}

	/**
	 * Legge il valore della proprieta' desStato associata alla
	 * @generated
	 */
	public String getDesStato() {
		return _desStato;
	}
	/**
	 * store della proprieta' associata alla colonna DATA_ASSEGNAZIONE
	 * @generated
	 */
	private java.sql.Date _dataAssegnazione;

	/**
	 * Imposta il valore della proprieta' dataAssegnazione associata alla
	 * colonna DATA_ASSEGNAZIONE.
	 * @generated
	 */
	public void setDataAssegnazione(java.sql.Date val) {
		_dataAssegnazione = val;
	}

	/**
	 * Legge il valore della proprieta' dataAssegnazione associata alla
	 * @generated
	 */
	public java.sql.Date getDataAssegnazione() {
		return _dataAssegnazione;
	}

	/**
	 * store della proprieta' associata alla colonna DATA_DISMISSIONE
	 * @generated
	 */
	private java.sql.Date _dataDismissione;

	/**
	 * Imposta il valore della proprieta' dataDismissione associata alla
	 * colonna DATA_DISMISSIONE.
	 * @generated
	 */
	public void setDataDismissione(java.sql.Date val) {
		_dataDismissione = val;
	}

	/**
	 * Legge il valore della proprieta' dataDismissione associata alla
	 * @generated
	 */
	public java.sql.Date getDataDismissione() {
		return _dataDismissione;
	}
	
	/**
	 * store della proprieta' associata alla colonna MOTIVAZIONE
	 * @generated
	 */
	private String _motivazione;

	/**
	 * Imposta il valore della proprieta' motivazione associata alla
	 * colonna MOTIVAZIONE.
	 * @generated
	 */
	public void setMotivazione(String val) {
		_motivazione = val;
	}

	/**
	 * Legge il valore della proprieta' motivazione associata alla
	 * @generated
	 */
	public String getMotivazione() {
		return _motivazione;
	}
	
	/**
	 * store della proprieta' associata alla colonna SIGLA_PROVINCIA
	 * @generated
	 */
	private String _siglaProvincia;

	/**
	 * Imposta il valore della proprieta' siglaProvincia associata alla
	 * colonna SIGLA_PROVINCIA.
	 * @generated
	 */
	public void setSiglaProvincia(String val) {
		_siglaProvincia = val;
	}

	/**
	 * Legge il valore della proprieta' siglaProvincia associata alla
	 * @generated
	 */
	public String getSiglaProvincia() {
		return _siglaProvincia;
	}

	/**
	 * store della proprieta' associata alla colonna DENOMINAZIONE_COMUNE
	 * @generated
	 */
	private String _denominazioneComune;

	/**
	 * Imposta il valore della proprieta' denominazioneComune associata alla
	 * colonna DENOMINAZIONE_COMUNE.
	 * @generated
	 */
	public void setDenominazioneComune(String val) {
		_denominazioneComune = val;
	}

	/**
	 * Legge il valore della proprieta' denominazioneComune associata alla
	 * @generated
	 */
	public String getDenominazioneComune() {
		return _denominazioneComune;
	}

	/**
	 * store della proprieta' associata alla colonna INDIRIZZO
	 * @generated
	 */
	private String _indirizzo;

	/**
	 * Imposta il valore della proprieta' indirizzo associata alla
	 * colonna INDIRIZZO_UNITA_IMMOB.
	 * @generated
	 */
	public void setIndirizzo(String val) {
		_indirizzo = val;
	}

	/**
	 * Legge il valore della proprieta' indirizzo associata alla
	 * @generated
	 */
	public String getIndirizzo() {
		return _indirizzo;
	}
	

	/**
	 * store della proprieta' associata alla colonna CIVICO
	 * @generated
	 */
	private String _civico;

	/**
	 * Imposta il valore della proprieta' civico associata alla
	 * colonna CIVICO.
	 * @generated
	 */
	public void setCivico(String val) {
		_civico = val;
	}

	/**
	 * Legge il valore della proprieta' civico associata alla
	 * @generated
	 */
	public String getCivico() {
		return _civico;
	}

	private String denominazioneResponsabile;
	
	public String getDenominazioneResponsabile() {
		return denominazioneResponsabile;
	}
	
	public void setDenominazioneResponsabile(String denominazioneResponsabile) {
		this.denominazioneResponsabile = denominazioneResponsabile;
	}

	private String cfResponsabile;
	
	public String getCfResponsabile() {
		return cfResponsabile;
	}
	
	public void setCfResponsabile(String cfResponsabile) {
		this.cfResponsabile = cfResponsabile;
	}

	
	private String denominazione3Responsabile;

	public String getDenominazione3Responsabile() {
		return denominazione3Responsabile;
	}

	public void setDenominazione3Responsabile(String denominazione3Responsabile) {
		this.denominazione3Responsabile = denominazione3Responsabile;
	}
	
	private String cf3Responsabile;

	public String getCf3Responsabile() {
		return cf3Responsabile;
	}

	public void setCf3Responsabile(String cf3Responsabile) {
		this.cf3Responsabile = cf3Responsabile;
	}
	
	/**
	 * store della proprieta' associata alla colonna DATA_CONSOLIDAMENTO
	 * @generated
	 */
	private java.sql.Date _dataConsolidamento;

	/**
	 * Imposta il valore della proprieta' dataConsolidamento associata alla
	 * colonna DATA_CONSOLIDAMENTO.
	 * @generated
	 */
	public void setDataConsolidamento(java.sql.Date val) {
		_dataConsolidamento = val;
	}

	/**
	 * Legge il valore della proprieta' dataConsolidamento associata alla
	 * @generated
	 */
	public java.sql.Date getDataConsolidamento() {
		return _dataConsolidamento;
	}
	
	/**
	 * store della proprieta' associata alla colonna UID_INDEX
	 * @generated
	 */
	private String _uidIndex;

	/**
	 * Imposta il valore della proprieta' uidIndex associata alla
	 * colonna UID_INDEX.
	 * @generated
	 */
	public void setUidIndex(String val) {
		_uidIndex = val;
	}

	/**
	 * Legge il valore della proprieta' uidIndex associata alla
	 * @generated
	 */
	public String getUidIndex() {
		return _uidIndex;
	}
	
}
