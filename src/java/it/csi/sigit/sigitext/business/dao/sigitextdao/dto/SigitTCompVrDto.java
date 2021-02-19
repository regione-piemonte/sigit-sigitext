package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompVrDao.
 * @generated
 */
public class SigitTCompVrDto extends SigitTCompVrPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna NUM_VIE
	 * @generated
	 */
	protected java.math.BigDecimal numVie;

	/**
	 * Imposta il valore della proprieta' numVie associata alla
	 * colonna NUM_VIE.
	 * @generated
	 */
	public void setNumVie(java.math.BigDecimal val) {

		numVie = val;

	}

	/**
	 * Legge il valore della proprieta' numVie associata alla
	 * @generated
	 */
	public java.math.BigDecimal getNumVie() {

		return numVie;

	}

	/**
	 * store della proprieta' associata alla colonna SERVOMOTORE
	 * @generated
	 */
	protected String servomotore;

	/**
	 * Imposta il valore della proprieta' servomotore associata alla
	 * colonna SERVOMOTORE.
	 * @generated
	 */
	public void setServomotore(String val) {

		servomotore = val;

	}

	/**
	 * Legge il valore della proprieta' servomotore associata alla
	 * @generated
	 */
	public String getServomotore() {

		return servomotore;

	}

	/**
	 * Crea una istanza di SigitTCompVrPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompVrPk
	 * @generated
	 */
	public SigitTCompVrPk createPk() {
		return new SigitTCompVrPk(codiceImpianto, idTipoComponente, progressivo, dataInstall);
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
