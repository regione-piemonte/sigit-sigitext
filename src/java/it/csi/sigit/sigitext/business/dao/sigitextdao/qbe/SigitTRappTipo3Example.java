package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTRappTipo3Dto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTRappTipo3Example extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idAllegato;

	/**
	 * @generated
	 */
	public void setIdAllegato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idAllegato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdAllegato() {
		return idAllegato;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgLocaleIdoneo;

	/**
	 * @generated
	 */
	public void setDFlgLocaleIdoneo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgLocaleIdoneo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgLocaleIdoneo() {
		return dFlgLocaleIdoneo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgLineaElettIdonea;

	/**
	 * @generated
	 */
	public void setDFlgLineaElettIdonea(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgLineaElettIdonea = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgLineaElettIdonea() {
		return dFlgLineaElettIdonea;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgCoibIdonea;

	/**
	 * @generated
	 */
	public void setDFlgCoibIdonea(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgCoibIdonea = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgCoibIdonea() {
		return dFlgCoibIdonea;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgAssenzaPerdite;

	/**
	 * @generated
	 */
	public void setDFlgAssenzaPerdite(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgAssenzaPerdite = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgAssenzaPerdite() {
		return dFlgAssenzaPerdite;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgValvoleTermost;

	/**
	 * @generated
	 */
	public void setFFlgValvoleTermost(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgValvoleTermost = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgValvoleTermost() {
		return fFlgValvoleTermost;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgVerificaParam;

	/**
	 * @generated
	 */
	public void setFFlgVerificaParam(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgVerificaParam = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgVerificaParam() {
		return fFlgVerificaParam;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgPerditeH2o;

	/**
	 * @generated
	 */
	public void setFFlgPerditeH2o(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgPerditeH2o = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgPerditeH2o() {
		return fFlgPerditeH2o;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgInstallInvolucro;

	/**
	 * @generated
	 */
	public void setFFlgInstallInvolucro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgInstallInvolucro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgInstallInvolucro() {
		return fFlgInstallInvolucro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk cFlgTrattClimaNonRichiest;

	/**
	 * @generated
	 */
	public void setCFlgTrattClimaNonRichiest(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		cFlgTrattClimaNonRichiest = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCFlgTrattClimaNonRichiest() {
		return cFlgTrattClimaNonRichiest;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk cFlgTrattAcsNonRichiesto;

	/**
	 * @generated
	 */
	public void setCFlgTrattAcsNonRichiesto(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		cFlgTrattAcsNonRichiesto = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCFlgTrattAcsNonRichiesto() {
		return cFlgTrattAcsNonRichiesto;
	}

}
