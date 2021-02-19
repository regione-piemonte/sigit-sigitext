package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompSrDao.
 * @generated
 */
public class SigitTCompSrDto extends SigitTCompSrPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna NUM_PTI_REGOLAZIONE
	 * @generated
	 */
	protected java.math.BigDecimal numPtiRegolazione;

	/**
	 * Imposta il valore della proprieta' numPtiRegolazione associata alla
	 * colonna NUM_PTI_REGOLAZIONE.
	 * @generated
	 */
	public void setNumPtiRegolazione(java.math.BigDecimal val) {

		numPtiRegolazione = val;

	}

	/**
	 * Legge il valore della proprieta' numPtiRegolazione associata alla
	 * @generated
	 */
	public java.math.BigDecimal getNumPtiRegolazione() {

		return numPtiRegolazione;

	}

	/**
	 * store della proprieta' associata alla colonna NUM_LIV_TEMP
	 * @generated
	 */
	protected java.math.BigDecimal numLivTemp;

	/**
	 * Imposta il valore della proprieta' numLivTemp associata alla
	 * colonna NUM_LIV_TEMP.
	 * @generated
	 */
	public void setNumLivTemp(java.math.BigDecimal val) {

		numLivTemp = val;

	}

	/**
	 * Legge il valore della proprieta' numLivTemp associata alla
	 * @generated
	 */
	public java.math.BigDecimal getNumLivTemp() {

		return numLivTemp;

	}

	/**
	 * Crea una istanza di SigitTCompSrPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompSrPk
	 * @generated
	 */
	public SigitTCompSrPk createPk() {
		return new SigitTCompSrPk(codiceImpianto, idTipoComponente, progressivo, dataInstall);
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
