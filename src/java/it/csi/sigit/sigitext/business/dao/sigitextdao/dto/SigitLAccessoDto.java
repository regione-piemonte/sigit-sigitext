package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitLAccessoDao.
 * @generated
 */
public class SigitLAccessoDto extends SigitLAccessoPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna CODICE_FISCALE
	 * @generated
	 */
	protected String codiceFiscale;

	/**
	 * Imposta il valore della proprieta' codiceFiscale associata alla
	 * colonna CODICE_FISCALE.
	 * @generated
	 */
	public void setCodiceFiscale(String val) {

		codiceFiscale = val;

	}

	/**
	 * Legge il valore della proprieta' codiceFiscale associata alla
	 * @generated
	 */
	public String getCodiceFiscale() {

		return codiceFiscale;

	}

	/**
	 * store della proprieta' associata alla colonna NOME
	 * @generated
	 */
	protected String nome;

	/**
	 * Imposta il valore della proprieta' nome associata alla
	 * colonna NOME.
	 * @generated
	 */
	public void setNome(String val) {

		nome = val;

	}

	/**
	 * Legge il valore della proprieta' nome associata alla
	 * @generated
	 */
	public String getNome() {

		return nome;

	}

	/**
	 * store della proprieta' associata alla colonna COGNOME
	 * @generated
	 */
	protected String cognome;

	/**
	 * Imposta il valore della proprieta' cognome associata alla
	 * colonna COGNOME.
	 * @generated
	 */
	public void setCognome(String val) {

		cognome = val;

	}

	/**
	 * Legge il valore della proprieta' cognome associata alla
	 * @generated
	 */
	public String getCognome() {

		return cognome;

	}

	/**
	 * store della proprieta' associata alla colonna RUOLO
	 * @generated
	 */
	protected String ruolo;

	/**
	 * Imposta il valore della proprieta' ruolo associata alla
	 * colonna RUOLO.
	 * @generated
	 */
	public void setRuolo(String val) {

		ruolo = val;

	}

	/**
	 * Legge il valore della proprieta' ruolo associata alla
	 * @generated
	 */
	public String getRuolo() {

		return ruolo;

	}

	/**
	 * Crea una istanza di SigitLAccessoPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitLAccessoPk
	 * @generated
	 */
	public SigitLAccessoPk createPk() {
		return new SigitLAccessoPk(dtAccesso);
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
