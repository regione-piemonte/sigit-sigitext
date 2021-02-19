package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTControlloLibrettoDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTControlloLibrettoExample extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk codiceImpianto;

	/**
	 * @generated
	 */
	public void setCodiceImpianto(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		codiceImpianto = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCodiceImpianto() {
		return codiceImpianto;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgL1Controlloweb;

	/**
	 * @generated
	 */
	public void setFlgL1Controlloweb(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgL1Controlloweb = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgL1Controlloweb() {
		return flgL1Controlloweb;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgL5Controlloweb;

	/**
	 * @generated
	 */
	public void setFlgL5Controlloweb(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgL5Controlloweb = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgL5Controlloweb() {
		return flgL5Controlloweb;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgL6Controlloweb;

	/**
	 * @generated
	 */
	public void setFlgL6Controlloweb(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgL6Controlloweb = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgL6Controlloweb() {
		return flgL6Controlloweb;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgL7Controlloweb;

	/**
	 * @generated
	 */
	public void setFlgL7Controlloweb(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgL7Controlloweb = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgL7Controlloweb() {
		return flgL7Controlloweb;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dtUltMod;

	/**
	 * @generated
	 */
	public void setDtUltMod(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dtUltMod = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDtUltMod() {
		return dtUltMod;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk utenteUltAgg;

	/**
	 * @generated
	 */
	public void setUtenteUltAgg(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		utenteUltAgg = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getUtenteUltAgg() {
		return utenteUltAgg;
	}

}
