package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTCompAcDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTCompAcExample extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idTipoComponente;

	/**
	 * @generated
	 */
	public void setIdTipoComponente(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idTipoComponente = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdTipoComponente() {
		return idTipoComponente;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk progressivo;

	/**
	 * @generated
	 */
	public void setProgressivo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		progressivo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getProgressivo() {
		return progressivo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataInstall;

	/**
	 * @generated
	 */
	public void setDataInstall(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataInstall = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataInstall() {
		return dataInstall;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk capacita;

	/**
	 * @generated
	 */
	public void setCapacita(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		capacita = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCapacita() {
		return capacita;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgAcs;

	/**
	 * @generated
	 */
	public void setFlgAcs(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgAcs = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgAcs() {
		return flgAcs;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgRisc;

	/**
	 * @generated
	 */
	public void setFlgRisc(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgRisc = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgRisc() {
		return flgRisc;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgRaff;

	/**
	 * @generated
	 */
	public void setFlgRaff(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgRaff = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgRaff() {
		return flgRaff;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgCoib;

	/**
	 * @generated
	 */
	public void setFlgCoib(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgCoib = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgCoib() {
		return flgCoib;
	}

}
