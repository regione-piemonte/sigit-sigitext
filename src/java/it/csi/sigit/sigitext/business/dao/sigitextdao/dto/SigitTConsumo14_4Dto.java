package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTConsumo14_4Dao.
 * @generated
 */
public class SigitTConsumo14_4Dto extends SigitTConsumo14_4Pk {

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
	 * store della proprieta' associata alla colonna FLG_CIRCUITO_IT
	 * @generated
	 */
	protected java.math.BigDecimal flgCircuitoIt;

	/**
	 * Imposta il valore della proprieta' flgCircuitoIt associata alla
	 * colonna FLG_CIRCUITO_IT.
	 * @generated
	 */
	public void setFlgCircuitoIt(java.math.BigDecimal val) {

		flgCircuitoIt = val;

	}

	/**
	 * Legge il valore della proprieta' flgCircuitoIt associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgCircuitoIt() {

		return flgCircuitoIt;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_CIRCUITO_ACS
	 * @generated
	 */
	protected java.math.BigDecimal flgCircuitoAcs;

	/**
	 * Imposta il valore della proprieta' flgCircuitoAcs associata alla
	 * colonna FLG_CIRCUITO_ACS.
	 * @generated
	 */
	public void setFlgCircuitoAcs(java.math.BigDecimal val) {

		flgCircuitoAcs = val;

	}

	/**
	 * Legge il valore della proprieta' flgCircuitoAcs associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgCircuitoAcs() {

		return flgCircuitoAcs;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_ACA
	 * @generated
	 */
	protected java.math.BigDecimal flgAca;

	/**
	 * Imposta il valore della proprieta' flgAca associata alla
	 * colonna FLG_ACA.
	 * @generated
	 */
	public void setFlgAca(java.math.BigDecimal val) {

		flgAca = val;

	}

	/**
	 * Legge il valore della proprieta' flgAca associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgAca() {

		return flgAca;

	}

	/**
	 * store della proprieta' associata alla colonna NOME_PRODOTTO
	 * @generated
	 */
	protected String nomeProdotto;

	/**
	 * Imposta il valore della proprieta' nomeProdotto associata alla
	 * colonna NOME_PRODOTTO.
	 * @generated
	 */
	public void setNomeProdotto(String val) {

		nomeProdotto = val;

	}

	/**
	 * Legge il valore della proprieta' nomeProdotto associata alla
	 * @generated
	 */
	public String getNomeProdotto() {

		return nomeProdotto;

	}

	/**
	 * store della proprieta' associata alla colonna QTA_CONSUMATA
	 * @generated
	 */
	protected java.math.BigDecimal qtaConsumata;

	/**
	 * Imposta il valore della proprieta' qtaConsumata associata alla
	 * colonna QTA_CONSUMATA.
	 * @generated
	 */
	public void setQtaConsumata(java.math.BigDecimal val) {

		qtaConsumata = val;

	}

	/**
	 * Legge il valore della proprieta' qtaConsumata associata alla
	 * @generated
	 */
	public java.math.BigDecimal getQtaConsumata() {

		return qtaConsumata;

	}

	/**
	 * store della proprieta' associata alla colonna FK_UNITA_MISURA
	 * @generated
	 */
	protected String fkUnitaMisura;

	/**
	 * Imposta il valore della proprieta' fkUnitaMisura associata alla
	 * colonna FK_UNITA_MISURA.
	 * @generated
	 */
	public void setFkUnitaMisura(String val) {

		fkUnitaMisura = val;

	}

	/**
	 * Legge il valore della proprieta' fkUnitaMisura associata alla
	 * @generated
	 */
	public String getFkUnitaMisura() {

		return fkUnitaMisura;

	}

	/**
	 * store della proprieta' associata alla colonna ESERCIZIO_DA
	 * @generated
	 */
	protected java.math.BigDecimal esercizioDa;

	/**
	 * Imposta il valore della proprieta' esercizioDa associata alla
	 * colonna ESERCIZIO_DA.
	 * @generated
	 */
	public void setEsercizioDa(java.math.BigDecimal val) {

		esercizioDa = val;

	}

	/**
	 * Legge il valore della proprieta' esercizioDa associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEsercizioDa() {

		return esercizioDa;

	}

	/**
	 * store della proprieta' associata alla colonna ESERCIZIO_A
	 * @generated
	 */
	protected java.math.BigDecimal esercizioA;

	/**
	 * Imposta il valore della proprieta' esercizioA associata alla
	 * colonna ESERCIZIO_A.
	 * @generated
	 */
	public void setEsercizioA(java.math.BigDecimal val) {

		esercizioA = val;

	}

	/**
	 * Legge il valore della proprieta' esercizioA associata alla
	 * @generated
	 */
	public java.math.BigDecimal getEsercizioA() {

		return esercizioA;

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
	 * store della proprieta' associata alla colonna ESERCIZIO
	 * @generated
	 */
	protected String esercizio;

	/**
	 * Imposta il valore della proprieta' esercizio associata alla
	 * colonna ESERCIZIO.
	 * @generated
	 */
	public void setEsercizio(String val) {

		esercizio = val;

	}

	/**
	 * Legge il valore della proprieta' esercizio associata alla
	 * @generated
	 */
	public String getEsercizio() {

		return esercizio;

	}

	/**
	 * Crea una istanza di SigitTConsumo14_4Pk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTConsumo14_4Pk
	 * @generated
	 */
	public SigitTConsumo14_4Pk createPk() {
		return new SigitTConsumo14_4Pk(idConsumoH2o);
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
