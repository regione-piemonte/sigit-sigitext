package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [FluidoCITDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class FluidoCITExample extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idFluido;

	/**
	 * @generated
	 */
	public void setIdFluido(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idFluido = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdFluido() {
		return idFluido;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk desFluido;

	/**
	 * @generated
	 */
	public void setDesFluido(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		desFluido = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDesFluido() {
		return desFluido;
	}

}
