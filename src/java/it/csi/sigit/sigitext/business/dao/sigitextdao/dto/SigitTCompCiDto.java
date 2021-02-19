package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompCiDao.
 * @generated
 */
public class SigitTCompCiDto extends SigitTCompCiPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna LUNGHEZZA_CIRC_M
	 * @generated
	 */
	protected java.math.BigDecimal lunghezzaCircM;

	/**
	 * Imposta il valore della proprieta' lunghezzaCircM associata alla
	 * colonna LUNGHEZZA_CIRC_M.
	 * @generated
	 */
	public void setLunghezzaCircM(java.math.BigDecimal val) {

		lunghezzaCircM = val;

	}

	/**
	 * Legge il valore della proprieta' lunghezzaCircM associata alla
	 * @generated
	 */
	public java.math.BigDecimal getLunghezzaCircM() {

		return lunghezzaCircM;

	}

	/**
	 * store della proprieta' associata alla colonna SUPERF_SCAMB_M2
	 * @generated
	 */
	protected java.math.BigDecimal superfScambM2;

	/**
	 * Imposta il valore della proprieta' superfScambM2 associata alla
	 * colonna SUPERF_SCAMB_M2.
	 * @generated
	 */
	public void setSuperfScambM2(java.math.BigDecimal val) {

		superfScambM2 = val;

	}

	/**
	 * Legge il valore della proprieta' superfScambM2 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getSuperfScambM2() {

		return superfScambM2;

	}

	/**
	 * store della proprieta' associata alla colonna PROF_INSTALL_M
	 * @generated
	 */
	protected java.math.BigDecimal profInstallM;

	/**
	 * Imposta il valore della proprieta' profInstallM associata alla
	 * colonna PROF_INSTALL_M.
	 * @generated
	 */
	public void setProfInstallM(java.math.BigDecimal val) {

		profInstallM = val;

	}

	/**
	 * Legge il valore della proprieta' profInstallM associata alla
	 * @generated
	 */
	public java.math.BigDecimal getProfInstallM() {

		return profInstallM;

	}

	/**
	 * Crea una istanza di SigitTCompCiPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompCiPk
	 * @generated
	 */
	public SigitTCompCiPk createPk() {
		return new SigitTCompCiPk(codiceImpianto, idTipoComponente, progressivo, dataInstall);
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
