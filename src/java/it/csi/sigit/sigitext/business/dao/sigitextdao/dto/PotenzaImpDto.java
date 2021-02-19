package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO PotenzaImpDao.
 * @generated
 */
public class PotenzaImpDto extends PotenzaImpPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna DES_POTENZA
	 * @generated
	 */
	protected String desPotenza;

	/**
	 * Imposta il valore della proprieta' desPotenza associata alla
	 * colonna DES_POTENZA.
	 * @generated
	 */
	public void setDesPotenza(String val) {

		desPotenza = val;

	}

	/**
	 * Legge il valore della proprieta' desPotenza associata alla
	 * @generated
	 */
	public String getDesPotenza() {

		return desPotenza;

	}

	/**
	 * store della proprieta' associata alla colonna LIMITE_INFERIORE
	 * @generated
	 */
	protected java.math.BigDecimal limiteInferiore;

	/**
	 * Imposta il valore della proprieta' limiteInferiore associata alla
	 * colonna LIMITE_INFERIORE.
	 * @generated
	 */
	public void setLimiteInferiore(java.math.BigDecimal val) {

		limiteInferiore = val;

	}

	/**
	 * Legge il valore della proprieta' limiteInferiore associata alla
	 * @generated
	 */
	public java.math.BigDecimal getLimiteInferiore() {

		return limiteInferiore;

	}

	/**
	 * store della proprieta' associata alla colonna LIMITE_SUPERIORE
	 * @generated
	 */
	protected java.math.BigDecimal limiteSuperiore;

	/**
	 * Imposta il valore della proprieta' limiteSuperiore associata alla
	 * colonna LIMITE_SUPERIORE.
	 * @generated
	 */
	public void setLimiteSuperiore(java.math.BigDecimal val) {

		limiteSuperiore = val;

	}

	/**
	 * Legge il valore della proprieta' limiteSuperiore associata alla
	 * @generated
	 */
	public java.math.BigDecimal getLimiteSuperiore() {

		return limiteSuperiore;

	}

	/**
	 * Crea una istanza di PotenzaImpPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return PotenzaImpPk
	 * @generated
	 */
	public PotenzaImpPk createPk() {
		return new PotenzaImpPk(idPotenza);
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
