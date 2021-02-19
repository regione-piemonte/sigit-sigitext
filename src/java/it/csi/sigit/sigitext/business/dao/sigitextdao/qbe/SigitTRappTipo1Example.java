package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTRappTipo1Dto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTRappTipo1Example extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgLocaleIntIdoneo;

	/**
	 * @generated
	 */
	public void setDFlgLocaleIntIdoneo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgLocaleIntIdoneo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgLocaleIntIdoneo() {
		return dFlgLocaleIntIdoneo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgGenExtIdoneo;

	/**
	 * @generated
	 */
	public void setDFlgGenExtIdoneo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgGenExtIdoneo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgGenExtIdoneo() {
		return dFlgGenExtIdoneo;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgScaricoIdoneo;

	/**
	 * @generated
	 */
	public void setDFlgScaricoIdoneo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgScaricoIdoneo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgScaricoIdoneo() {
		return dFlgScaricoIdoneo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgTempAmbFunz;

	/**
	 * @generated
	 */
	public void setDFlgTempAmbFunz(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgTempAmbFunz = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgTempAmbFunz() {
		return dFlgTempAmbFunz;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgAssenzaPerdComb;

	/**
	 * @generated
	 */
	public void setDFlgAssenzaPerdComb(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgAssenzaPerdComb = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgAssenzaPerdComb() {
		return dFlgAssenzaPerdComb;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dFlgIdoTenImpInt;

	/**
	 * @generated
	 */
	public void setDFlgIdoTenImpInt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dFlgIdoTenImpInt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDFlgIdoTenImpInt() {
		return dFlgIdoTenImpInt;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgAdozioneValvoleTerm;

	/**
	 * @generated
	 */
	public void setFFlgAdozioneValvoleTerm(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgAdozioneValvoleTerm = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgAdozioneValvoleTerm() {
		return fFlgAdozioneValvoleTerm;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgIsolamenteRete;

	/**
	 * @generated
	 */
	public void setFFlgIsolamenteRete(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgIsolamenteRete = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgIsolamenteRete() {
		return fFlgIsolamenteRete;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgAdozSistTrattamH2o;

	/**
	 * @generated
	 */
	public void setFFlgAdozSistTrattamH2o(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgAdozSistTrattamH2o = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgAdozSistTrattamH2o() {
		return fFlgAdozSistTrattamH2o;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fFlgSostituzSistRegolaz;

	/**
	 * @generated
	 */
	public void setFFlgSostituzSistRegolaz(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fFlgSostituzSistRegolaz = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFFlgSostituzSistRegolaz() {
		return fFlgSostituzSistRegolaz;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk cFlgTrattClimaNonRich;

	/**
	 * @generated
	 */
	public void setCFlgTrattClimaNonRich(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		cFlgTrattClimaNonRich = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCFlgTrattClimaNonRich() {
		return cFlgTrattClimaNonRich;
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
