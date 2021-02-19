package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompScxDao.
 * @generated
 */
public class SigitTCompScxDto extends SigitTCompScxPk {

	private static final long serialVersionUID = 1L;

	/**
	 * Crea una istanza di SigitTCompScxPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompScxPk
	 * @generated
	 */
	public SigitTCompScxPk createPk() {
		return new SigitTCompScxPk(codiceImpianto, idTipoComponente, progressivo, dataInstall);
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
