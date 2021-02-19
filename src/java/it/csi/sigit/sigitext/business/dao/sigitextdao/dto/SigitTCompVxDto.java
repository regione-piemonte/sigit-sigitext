package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompVxDao.
 * @generated
 */
public class SigitTCompVxDto extends SigitTCompVxPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna CAPACITA_L
	 * @generated
	 */
	protected java.math.BigDecimal capacitaL;

	/**
	 * Imposta il valore della proprieta' capacitaL associata alla
	 * colonna CAPACITA_L.
	 * @generated
	 */
	public void setCapacitaL(java.math.BigDecimal val) {

		capacitaL = val;

	}

	/**
	 * Legge il valore della proprieta' capacitaL associata alla
	 * @generated
	 */
	public java.math.BigDecimal getCapacitaL() {

		return capacitaL;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_VASO
	 * @generated
	 */
	protected String flgVaso;

	/**
	 * Imposta il valore della proprieta' flgVaso associata alla
	 * colonna FLG_VASO.
	 * @generated
	 */
	public void setFlgVaso(String val) {

		flgVaso = val;

	}

	/**
	 * Legge il valore della proprieta' flgVaso associata alla
	 * @generated
	 */
	public String getFlgVaso() {

		return flgVaso;

	}

	/**
	 * store della proprieta' associata alla colonna PRESSIONE_BAR
	 * @generated
	 */
	protected java.math.BigDecimal pressioneBar;

	/**
	 * Imposta il valore della proprieta' pressioneBar associata alla
	 * colonna PRESSIONE_BAR.
	 * @generated
	 */
	public void setPressioneBar(java.math.BigDecimal val) {

		pressioneBar = val;

	}

	/**
	 * Legge il valore della proprieta' pressioneBar associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPressioneBar() {

		return pressioneBar;

	}

	/**
	 * Crea una istanza di SigitTCompVxPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompVxPk
	 * @generated
	 */
	public SigitTCompVxPk createPk() {
		return new SigitTCompVxPk(codiceImpianto, idTipoComponente, progressivo, dataInstall);
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
