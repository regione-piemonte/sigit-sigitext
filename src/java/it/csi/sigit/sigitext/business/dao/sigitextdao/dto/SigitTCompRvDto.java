package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompRvDao.
 * @generated
 */
public class SigitTCompRvDto extends SigitTCompRvPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna NUM_VENTILATORI
	 * @generated
	 */
	protected java.math.BigDecimal numVentilatori;

	/**
	 * Imposta il valore della proprieta' numVentilatori associata alla
	 * colonna NUM_VENTILATORI.
	 * @generated
	 */
	public void setNumVentilatori(java.math.BigDecimal val) {

		numVentilatori = val;

	}

	/**
	 * Legge il valore della proprieta' numVentilatori associata alla
	 * @generated
	 */
	public java.math.BigDecimal getNumVentilatori() {

		return numVentilatori;

	}

	/**
	 * store della proprieta' associata alla colonna TIPO_VENTILATORI
	 * @generated
	 */
	protected String tipoVentilatori;

	/**
	 * Imposta il valore della proprieta' tipoVentilatori associata alla
	 * colonna TIPO_VENTILATORI.
	 * @generated
	 */
	public void setTipoVentilatori(String val) {

		tipoVentilatori = val;

	}

	/**
	 * Legge il valore della proprieta' tipoVentilatori associata alla
	 * @generated
	 */
	public String getTipoVentilatori() {

		return tipoVentilatori;

	}

	/**
	 * Crea una istanza di SigitTCompRvPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompRvPk
	 * @generated
	 */
	public SigitTCompRvPk createPk() {
		return new SigitTCompRvPk(codiceImpianto, idTipoComponente, progressivo, dataInstall);
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
