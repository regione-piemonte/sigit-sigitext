package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompUtDao.
 * @generated
 */
public class SigitTCompUtDto extends SigitTCompUtPk {

	private static final long serialVersionUID = 1L;

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
	 * Crea una istanza di SigitTCompUtPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompUtPk
	 * @generated
	 */
	public SigitTCompUtPk createPk() {
		return new SigitTCompUtPk(codiceImpianto, idTipoComponente, progressivo, dataInstall);
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
