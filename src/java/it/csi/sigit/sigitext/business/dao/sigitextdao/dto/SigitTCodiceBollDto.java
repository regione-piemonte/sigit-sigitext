package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCodiceBollDao.
 * @generated
 */
public class SigitTCodiceBollDto extends SigitTCodiceBollPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna FK_TRANSAZIONE_BOLL
	 * @generated
	 */
	protected java.math.BigDecimal fkTransazioneBoll;

	/**
	 * Imposta il valore della proprieta' fkTransazioneBoll associata alla
	 * colonna FK_TRANSAZIONE_BOLL.
	 * @generated
	 */
	public void setFkTransazioneBoll(java.math.BigDecimal val) {

		fkTransazioneBoll = val;

	}

	/**
	 * Legge il valore della proprieta' fkTransazioneBoll associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkTransazioneBoll() {

		return fkTransazioneBoll;

	}

	/**
	 * store della proprieta' associata alla colonna FK_POTENZA
	 * @generated
	 */
	protected java.math.BigDecimal fkPotenza;

	/**
	 * Imposta il valore della proprieta' fkPotenza associata alla
	 * colonna FK_POTENZA.
	 * @generated
	 */
	public void setFkPotenza(java.math.BigDecimal val) {

		fkPotenza = val;

	}

	/**
	 * Legge il valore della proprieta' fkPotenza associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkPotenza() {

		return fkPotenza;

	}

	/**
	 * store della proprieta' associata alla colonna FK_PREZZO
	 * @generated
	 */
	protected java.math.BigDecimal fkPrezzo;

	/**
	 * Imposta il valore della proprieta' fkPrezzo associata alla
	 * colonna FK_PREZZO.
	 * @generated
	 */
	public void setFkPrezzo(java.math.BigDecimal val) {

		fkPrezzo = val;

	}

	/**
	 * Legge il valore della proprieta' fkPrezzo associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkPrezzo() {

		return fkPrezzo;

	}

	/**
	 * store della proprieta' associata alla colonna FK_DT_INIZIO_ACQUISTO
	 * @generated
	 */
	protected java.sql.Date fkDtInizioAcquisto;

	/**
	 * Imposta il valore della proprieta' fkDtInizioAcquisto associata alla
	 * colonna FK_DT_INIZIO_ACQUISTO.
	 * @generated
	 */
	public void setFkDtInizioAcquisto(java.sql.Date val) {

		if (val != null) {
			fkDtInizioAcquisto = new java.sql.Date(val.getTime());
		} else {
			fkDtInizioAcquisto = null;
		}

	}

	/**
	 * Legge il valore della proprieta' fkDtInizioAcquisto associata alla
	 * @generated
	 */
	public java.sql.Date getFkDtInizioAcquisto() {

		if (fkDtInizioAcquisto != null) {
			return new java.sql.Date(fkDtInizioAcquisto.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna FLG_PREGRESSO
	 * @generated
	 */
	protected java.math.BigDecimal flgPregresso;

	/**
	 * Imposta il valore della proprieta' flgPregresso associata alla
	 * colonna FLG_PREGRESSO.
	 * @generated
	 */
	public void setFlgPregresso(java.math.BigDecimal val) {

		flgPregresso = val;

	}

	/**
	 * Legge il valore della proprieta' flgPregresso associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgPregresso() {

		return flgPregresso;

	}

	/**
	 * store della proprieta' associata alla colonna DT_INSERIMENTO
	 * @generated
	 */
	protected java.sql.Timestamp dtInserimento;

	/**
	 * Imposta il valore della proprieta' dtInserimento associata alla
	 * colonna DT_INSERIMENTO.
	 * @generated
	 */
	public void setDtInserimento(java.sql.Timestamp val) {

		if (val != null) {
			dtInserimento = new java.sql.Timestamp(val.getTime());
		} else {
			dtInserimento = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dtInserimento associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDtInserimento() {

		if (dtInserimento != null) {
			return new java.sql.Timestamp(dtInserimento.getTime());
		} else {
			return null;
		}

	}

	/**
	 * Crea una istanza di SigitTCodiceBollPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCodiceBollPk
	 * @generated
	 */
	public SigitTCodiceBollPk createPk() {
		return new SigitTCodiceBollPk(siglaBollino, numeroBollino);
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
