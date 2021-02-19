package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitRComp4ManutAllDao.
 * @generated
 */
public class SigitRComp4ManutAllDto extends SigitRComp4ManutAllPk {

	private static final long serialVersionUID = 1L;

	/**
	 * Crea una istanza di SigitRComp4ManutAllPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitRComp4ManutAllPk
	 * @generated
	 */
	public SigitRComp4ManutAllPk createPk() {
		return new SigitRComp4ManutAllPk(idAllegato, idRComp4Manut);
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
