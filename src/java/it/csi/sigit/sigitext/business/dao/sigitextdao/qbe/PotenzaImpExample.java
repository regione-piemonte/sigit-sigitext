package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [PotenzaImpDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class PotenzaImpExample extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idPotenza;

	/**
	 * @generated
	 */
	public void setIdPotenza(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idPotenza = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdPotenza() {
		return idPotenza;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk desPotenza;

	/**
	 * @generated
	 */
	public void setDesPotenza(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		desPotenza = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDesPotenza() {
		return desPotenza;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk limiteInferiore;

	/**
	 * @generated
	 */
	public void setLimiteInferiore(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		limiteInferiore = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getLimiteInferiore() {
		return limiteInferiore;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk limiteSuperiore;

	/**
	 * @generated
	 */
	public void setLimiteSuperiore(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		limiteSuperiore = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getLimiteSuperiore() {
		return limiteSuperiore;
	}

}
