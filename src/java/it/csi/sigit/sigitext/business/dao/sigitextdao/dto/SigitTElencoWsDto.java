package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTElencoWsDao.
 * @generated
 */
public class SigitTElencoWsDto extends SigitTElencoWsPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna DESCRIZIONE_WS
	 * @generated
	 */
	protected String descrizioneWs;

	/**
	 * Imposta il valore della proprieta' descrizioneWs associata alla
	 * colonna DESCRIZIONE_WS.
	 * @generated
	 */
	public void setDescrizioneWs(String val) {

		descrizioneWs = val;

	}

	/**
	 * Legge il valore della proprieta' descrizioneWs associata alla
	 * @generated
	 */
	public String getDescrizioneWs() {

		return descrizioneWs;

	}

	/**
	 * Crea una istanza di SigitTElencoWsPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTElencoWsPk
	 * @generated
	 */
	public SigitTElencoWsPk createPk() {
		return new SigitTElencoWsPk(idElencoWs);
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
