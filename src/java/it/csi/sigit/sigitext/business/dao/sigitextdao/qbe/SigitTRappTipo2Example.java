package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTRappTipo2Dto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTRappTipo2Example extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgApertureLibere;

	/**
	 * @generated
	 */
	public void setDFlgApertureLibere(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgApertureLibere = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgApertureLibere() {
		return dFlgApertureLibere;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgApertureAdeg;

	/**
	 * @generated
	 */
	public void setDFlgApertureAdeg(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgApertureAdeg = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgApertureAdeg() {
		return dFlgApertureAdeg;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgSostituzGeneratori;

	/**
	 * @generated
	 */
	public void setFFlgSostituzGeneratori(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgSostituzGeneratori = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgSostituzGeneratori() {
		return fFlgSostituzGeneratori;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgSostituzSistemiReg;

	/**
	 * @generated
	 */
	public void setFFlgSostituzSistemiReg(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgSostituzSistemiReg = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgSostituzSistemiReg() {
		return fFlgSostituzSistemiReg;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgIsolDistribuzH2o;

	/**
	 * @generated
	 */
	public void setFFlgIsolDistribuzH2o(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgIsolDistribuzH2o = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgIsolDistribuzH2o() {
		return fFlgIsolDistribuzH2o;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgIsolDistribuzAria;

	/**
	 * @generated
	 */
	public void setFFlgIsolDistribuzAria(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgIsolDistribuzAria = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgIsolDistribuzAria() {
		return fFlgIsolDistribuzAria;
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

}
