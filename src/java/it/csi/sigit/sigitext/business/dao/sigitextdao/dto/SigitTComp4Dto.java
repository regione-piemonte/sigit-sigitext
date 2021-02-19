package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTComp4Dao.
 * @generated
 */
public class SigitTComp4Dto extends SigitTComp4Pk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna DT_CONTROLLOWEB
	 * @generated
	 */
	protected java.sql.Timestamp dtControlloweb;

	/**
	 * Imposta il valore della proprieta' dtControlloweb associata alla
	 * colonna DT_CONTROLLOWEB.
	 * @generated
	 */
	public void setDtControlloweb(java.sql.Timestamp val) {

		if (val != null) {
			dtControlloweb = new java.sql.Timestamp(val.getTime());
		} else {
			dtControlloweb = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dtControlloweb associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDtControlloweb() {

		if (dtControlloweb != null) {
			return new java.sql.Timestamp(dtControlloweb.getTime());
		} else {
			return null;
		}

	}

	/**
	 * Crea una istanza di SigitTComp4Pk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTComp4Pk
	 * @generated
	 */
	public SigitTComp4Pk createPk() {
		return new SigitTComp4Pk(codiceImpianto, idTipoComponente, progressivo);
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
