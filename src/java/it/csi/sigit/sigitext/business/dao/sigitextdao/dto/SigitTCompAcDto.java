package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompAcDao.
 * @generated
 */
public class SigitTCompAcDto extends SigitTCompAcPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna CAPACITA
	 * @generated
	 */
	protected java.math.BigDecimal capacita;

	/**
	 * Imposta il valore della proprieta' capacita associata alla
	 * colonna CAPACITA.
	 * @generated
	 */
	public void setCapacita(java.math.BigDecimal val) {

		capacita = val;

	}

	/**
	 * Legge il valore della proprieta' capacita associata alla
	 * @generated
	 */
	public java.math.BigDecimal getCapacita() {

		return capacita;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_ACS
	 * @generated
	 */
	protected java.math.BigDecimal flgAcs;

	/**
	 * Imposta il valore della proprieta' flgAcs associata alla
	 * colonna FLG_ACS.
	 * @generated
	 */
	public void setFlgAcs(java.math.BigDecimal val) {

		flgAcs = val;

	}

	/**
	 * Legge il valore della proprieta' flgAcs associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgAcs() {

		return flgAcs;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_RISC
	 * @generated
	 */
	protected java.math.BigDecimal flgRisc;

	/**
	 * Imposta il valore della proprieta' flgRisc associata alla
	 * colonna FLG_RISC.
	 * @generated
	 */
	public void setFlgRisc(java.math.BigDecimal val) {

		flgRisc = val;

	}

	/**
	 * Legge il valore della proprieta' flgRisc associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgRisc() {

		return flgRisc;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_RAFF
	 * @generated
	 */
	protected java.math.BigDecimal flgRaff;

	/**
	 * Imposta il valore della proprieta' flgRaff associata alla
	 * colonna FLG_RAFF.
	 * @generated
	 */
	public void setFlgRaff(java.math.BigDecimal val) {

		flgRaff = val;

	}

	/**
	 * Legge il valore della proprieta' flgRaff associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgRaff() {

		return flgRaff;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_COIB
	 * @generated
	 */
	protected String flgCoib;

	/**
	 * Imposta il valore della proprieta' flgCoib associata alla
	 * colonna FLG_COIB.
	 * @generated
	 */
	public void setFlgCoib(String val) {

		flgCoib = val;

	}

	/**
	 * Legge il valore della proprieta' flgCoib associata alla
	 * @generated
	 */
	public String getFlgCoib() {

		return flgCoib;

	}

	/**
	 * Crea una istanza di SigitTCompAcPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompAcPk
	 * @generated
	 */
	public SigitTCompAcPk createPk() {
		return new SigitTCompAcPk(codiceImpianto, idTipoComponente, progressivo, dataInstall);
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
