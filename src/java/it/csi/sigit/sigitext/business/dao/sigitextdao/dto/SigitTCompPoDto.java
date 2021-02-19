package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompPoDao.
 * @generated
 */
public class SigitTCompPoDto extends SigitTCompPoPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna FLG_GIRI_VARIABILI
	 * @generated
	 */
	protected java.math.BigDecimal flgGiriVariabili;

	/**
	 * Imposta il valore della proprieta' flgGiriVariabili associata alla
	 * colonna FLG_GIRI_VARIABILI.
	 * @generated
	 */
	public void setFlgGiriVariabili(java.math.BigDecimal val) {

		flgGiriVariabili = val;

	}

	/**
	 * Legge il valore della proprieta' flgGiriVariabili associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgGiriVariabili() {

		return flgGiriVariabili;

	}

	/**
	 * store della proprieta' associata alla colonna POT_NOMINALE_KW
	 * @generated
	 */
	protected java.math.BigDecimal potNominaleKw;

	/**
	 * Imposta il valore della proprieta' potNominaleKw associata alla
	 * colonna POT_NOMINALE_KW.
	 * @generated
	 */
	public void setPotNominaleKw(java.math.BigDecimal val) {

		potNominaleKw = val;

	}

	/**
	 * Legge il valore della proprieta' potNominaleKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPotNominaleKw() {

		return potNominaleKw;

	}

	/**
	 * Crea una istanza di SigitTCompPoPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompPoPk
	 * @generated
	 */
	public SigitTCompPoPk createPk() {
		return new SigitTCompPoPk(codiceImpianto, idTipoComponente, progressivo, dataInstall);
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
