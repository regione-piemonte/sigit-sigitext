package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTLibrettoDao.
 * @generated
 */
public class SigitTLibrettoDto extends SigitTLibrettoPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna FK_STATO
	 * @generated
	 */
	protected java.math.BigDecimal fkStato;

	/**
	 * Imposta il valore della proprieta' fkStato associata alla
	 * colonna FK_STATO.
	 * @generated
	 */
	public void setFkStato(java.math.BigDecimal val) {

		fkStato = val;

	}

	/**
	 * Legge il valore della proprieta' fkStato associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkStato() {

		return fkStato;

	}

	/**
	 * store della proprieta' associata alla colonna FK_MOTIVO_CONSOLID
	 * @generated
	 */
	protected java.math.BigDecimal fkMotivoConsolid;

	/**
	 * Imposta il valore della proprieta' fkMotivoConsolid associata alla
	 * colonna FK_MOTIVO_CONSOLID.
	 * @generated
	 */
	public void setFkMotivoConsolid(java.math.BigDecimal val) {

		fkMotivoConsolid = val;

	}

	/**
	 * Legge il valore della proprieta' fkMotivoConsolid associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkMotivoConsolid() {

		return fkMotivoConsolid;

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
	 * store della proprieta' associata alla colonna DATA_CONSOLIDAMENTO
	 * @generated
	 */
	protected java.sql.Date dataConsolidamento;

	/**
	 * Imposta il valore della proprieta' dataConsolidamento associata alla
	 * colonna DATA_CONSOLIDAMENTO.
	 * @generated
	 */
	public void setDataConsolidamento(java.sql.Date val) {

		if (val != null) {
			dataConsolidamento = new java.sql.Date(val.getTime());
		} else {
			dataConsolidamento = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataConsolidamento associata alla
	 * @generated
	 */
	public java.sql.Date getDataConsolidamento() {

		if (dataConsolidamento != null) {
			return new java.sql.Date(dataConsolidamento.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna FILE_INDEX
	 * @generated
	 */
	protected String fileIndex;

	/**
	 * Imposta il valore della proprieta' fileIndex associata alla
	 * colonna FILE_INDEX.
	 * @generated
	 */
	public void setFileIndex(String val) {

		fileIndex = val;

	}

	/**
	 * Legge il valore della proprieta' fileIndex associata alla
	 * @generated
	 */
	public String getFileIndex() {

		return fileIndex;

	}

	/**
	 * store della proprieta' associata alla colonna UID_INDEX
	 * @generated
	 */
	protected String uidIndex;

	/**
	 * Imposta il valore della proprieta' uidIndex associata alla
	 * colonna UID_INDEX.
	 * @generated
	 */
	public void setUidIndex(String val) {

		uidIndex = val;

	}

	/**
	 * Legge il valore della proprieta' uidIndex associata alla
	 * @generated
	 */
	public String getUidIndex() {

		return uidIndex;

	}

	/**
	 * store della proprieta' associata alla colonna CF_REDATTORE
	 * @generated
	 */
	protected String cfRedattore;

	/**
	 * Imposta il valore della proprieta' cfRedattore associata alla
	 * colonna CF_REDATTORE.
	 * @generated
	 */
	public void setCfRedattore(String val) {

		cfRedattore = val;

	}

	/**
	 * Legge il valore della proprieta' cfRedattore associata alla
	 * @generated
	 */
	public String getCfRedattore() {

		return cfRedattore;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_CONTROLLO_BOZZA
	 * @generated
	 */
	protected java.math.BigDecimal flgControlloBozza;

	/**
	 * Imposta il valore della proprieta' flgControlloBozza associata alla
	 * colonna FLG_CONTROLLO_BOZZA.
	 * @generated
	 */
	public void setFlgControlloBozza(java.math.BigDecimal val) {

		flgControlloBozza = val;

	}

	/**
	 * Legge il valore della proprieta' flgControlloBozza associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgControlloBozza() {

		return flgControlloBozza;

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
	 * Crea una istanza di SigitTLibrettoPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTLibrettoPk
	 * @generated
	 */
	public SigitTLibrettoPk createPk() {
		return new SigitTLibrettoPk(idLibretto);
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
