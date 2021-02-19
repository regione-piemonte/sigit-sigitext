package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTConsumoDao.
 * @generated
 */
public class SigitTConsumoDto extends SigitTConsumoPk {

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
	 * store della proprieta' associata alla colonna FK_TIPO_CONSUMO
	 * @generated
	 */
	protected String fkTipoConsumo;

	/**
	 * Imposta il valore della proprieta' fkTipoConsumo associata alla
	 * colonna FK_TIPO_CONSUMO.
	 * @generated
	 */
	public void setFkTipoConsumo(String val) {

		fkTipoConsumo = val;

	}

	/**
	 * Legge il valore della proprieta' fkTipoConsumo associata alla
	 * @generated
	 */
	public String getFkTipoConsumo() {

		return fkTipoConsumo;

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
	 * store della proprieta' associata alla colonna ACQUISTI
	 * @generated
	 */
	protected String acquisti;

	/**
	 * Imposta il valore della proprieta' acquisti associata alla
	 * colonna ACQUISTI.
	 * @generated
	 */
	public void setAcquisti(String val) {

		acquisti = val;

	}

	/**
	 * Legge il valore della proprieta' acquisti associata alla
	 * @generated
	 */
	public String getAcquisti() {

		return acquisti;

	}

	/**
	 * store della proprieta' associata alla colonna LETTURA_INIZIALE
	 * @generated
	 */
	protected java.math.BigDecimal letturaIniziale;

	/**
	 * Imposta il valore della proprieta' letturaIniziale associata alla
	 * colonna LETTURA_INIZIALE.
	 * @generated
	 */
	public void setLetturaIniziale(java.math.BigDecimal val) {

		letturaIniziale = val;

	}

	/**
	 * Legge il valore della proprieta' letturaIniziale associata alla
	 * @generated
	 */
	public java.math.BigDecimal getLetturaIniziale() {

		return letturaIniziale;

	}

	/**
	 * store della proprieta' associata alla colonna LETTURA_FINALE
	 * @generated
	 */
	protected java.math.BigDecimal letturaFinale;

	/**
	 * Imposta il valore della proprieta' letturaFinale associata alla
	 * colonna LETTURA_FINALE.
	 * @generated
	 */
	public void setLetturaFinale(java.math.BigDecimal val) {

		letturaFinale = val;

	}

	/**
	 * Legge il valore della proprieta' letturaFinale associata alla
	 * @generated
	 */
	public java.math.BigDecimal getLetturaFinale() {

		return letturaFinale;

	}

	/**
	 * store della proprieta' associata alla colonna CONSUMO
	 * @generated
	 */
	protected java.math.BigDecimal consumo;

	/**
	 * Imposta il valore della proprieta' consumo associata alla
	 * colonna CONSUMO.
	 * @generated
	 */
	public void setConsumo(java.math.BigDecimal val) {

		consumo = val;

	}

	/**
	 * Legge il valore della proprieta' consumo associata alla
	 * @generated
	 */
	public java.math.BigDecimal getConsumo() {

		return consumo;

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
	 * Crea una istanza di SigitTConsumoPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTConsumoPk
	 * @generated
	 */
	public SigitTConsumoPk createPk() {
		return new SigitTConsumoPk(idConsumo);
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
