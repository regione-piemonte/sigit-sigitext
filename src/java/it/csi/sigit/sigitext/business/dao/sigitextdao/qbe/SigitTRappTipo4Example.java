package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTRappTipo4Dto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTRappTipo4Example extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgLuogoIdoneo;

	/**
	 * @generated
	 */
	public void setDFlgLuogoIdoneo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgLuogoIdoneo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgLuogoIdoneo() {
		return dFlgLuogoIdoneo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgVentilazAdeg;

	/**
	 * @generated
	 */
	public void setDFlgVentilazAdeg(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgVentilazAdeg = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgVentilazAdeg() {
		return dFlgVentilazAdeg;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgVentilazLibera;

	/**
	 * @generated
	 */
	public void setDFlgVentilazLibera(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgVentilazLibera = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgVentilazLibera() {
		return dFlgVentilazLibera;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgCaminoIdoneo;

	/**
	 * @generated
	 */
	public void setDFlgCaminoIdoneo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgCaminoIdoneo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgCaminoIdoneo() {
		return dFlgCaminoIdoneo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgCapsulaIdonea;

	/**
	 * @generated
	 */
	public void setDFlgCapsulaIdonea(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgCapsulaIdonea = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgCapsulaIdonea() {
		return dFlgCapsulaIdonea;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgCircIdrIdoneo;

	/**
	 * @generated
	 */
	public void setDFlgCircIdrIdoneo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgCircIdrIdoneo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgCircIdrIdoneo() {
		return dFlgCircIdrIdoneo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgCircOlioIdoneo;

	/**
	 * @generated
	 */
	public void setDFlgCircOlioIdoneo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgCircOlioIdoneo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgCircOlioIdoneo() {
		return dFlgCircOlioIdoneo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgCircCombIdoneo;

	/**
	 * @generated
	 */
	public void setDFlgCircCombIdoneo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgCircCombIdoneo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgCircCombIdoneo() {
		return dFlgCircCombIdoneo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgFunzScambIdonea;

	/**
	 * @generated
	 */
	public void setDFlgFunzScambIdonea(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgFunzScambIdonea = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgFunzScambIdonea() {
		return dFlgFunzScambIdonea;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgAdozioneValvole;

	/**
	 * @generated
	 */
	public void setFFlgAdozioneValvole(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgAdozioneValvole = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgAdozioneValvole() {
		return fFlgAdozioneValvole;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgIsolamentoRete;

	/**
	 * @generated
	 */
	public void setFFlgIsolamentoRete(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgIsolamentoRete = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgIsolamentoRete() {
		return fFlgIsolamentoRete;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgSistemaTrattH2o;

	/**
	 * @generated
	 */
	public void setFFlgSistemaTrattH2o(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgSistemaTrattH2o = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgSistemaTrattH2o() {
		return fFlgSistemaTrattH2o;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgSostSistemaRegolaz;

	/**
	 * @generated
	 */
	public void setFFlgSostSistemaRegolaz(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgSostSistemaRegolaz = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgSostSistemaRegolaz() {
		return fFlgSostSistemaRegolaz;
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

}
