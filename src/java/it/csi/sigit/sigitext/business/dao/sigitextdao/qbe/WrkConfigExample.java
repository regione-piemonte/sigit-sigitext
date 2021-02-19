package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [WrkConfigDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class WrkConfigExample extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idConfig;

	/**
	 * @generated
	 */
	public void setIdConfig(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idConfig = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdConfig() {
		return idConfig;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk chiaveConfig;

	/**
	 * @generated
	 */
	public void setChiaveConfig(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		chiaveConfig = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getChiaveConfig() {
		return chiaveConfig;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk valoreConfigNum;

	/**
	 * @generated
	 */
	public void setValoreConfigNum(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		valoreConfigNum = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getValoreConfigNum() {
		return valoreConfigNum;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk valoreConfigChar;

	/**
	 * @generated
	 */
	public void setValoreConfigChar(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		valoreConfigChar = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getValoreConfigChar() {
		return valoreConfigChar;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk valoreFlag;

	/**
	 * @generated
	 */
	public void setValoreFlag(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		valoreFlag = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getValoreFlag() {
		return valoreFlag;
	}

}
