package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTDettTipo3Dto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTDettTipo3Example extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idDettTipo3;

	/**
	 * @generated
	 */
	public void setIdDettTipo3(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idDettTipo3 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdDettTipo3() {
		return idDettTipo3;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkAllegato;

	/**
	 * @generated
	 */
	public void setFkAllegato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkAllegato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkAllegato() {
		return fkAllegato;
	}

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkTipoComponente;

	/**
	 * @generated
	 */
	public void setFkTipoComponente(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkTipoComponente = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkTipoComponente() {
		return fkTipoComponente;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkFluido;

	/**
	 * @generated
	 */
	public void setFkFluido(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkFluido = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkFluido() {
		return fkFluido;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkFluidoAlimentaz;

	/**
	 * @generated
	 */
	public void setFkFluidoAlimentaz(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkFluidoAlimentaz = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkFluidoAlimentaz() {
		return fkFluidoAlimentaz;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eFluidoAltro;

	/**
	 * @generated
	 */
	public void setEFluidoAltro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eFluidoAltro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEFluidoAltro() {
		return eFluidoAltro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eAlimentazioneAltro;

	/**
	 * @generated
	 */
	public void setEAlimentazioneAltro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eAlimentazioneAltro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEAlimentazioneAltro() {
		return eAlimentazioneAltro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eFlgClimaInverno;

	/**
	 * @generated
	 */
	public void setEFlgClimaInverno(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eFlgClimaInverno = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEFlgClimaInverno() {
		return eFlgClimaInverno;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eFlgProduzAcs;

	/**
	 * @generated
	 */
	public void setEFlgProduzAcs(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eFlgProduzAcs = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEFlgProduzAcs() {
		return eFlgProduzAcs;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eFlgPotenzaCompatibile;

	/**
	 * @generated
	 */
	public void setEFlgPotenzaCompatibile(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eFlgPotenzaCompatibile = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEFlgPotenzaCompatibile() {
		return eFlgPotenzaCompatibile;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eFlgCoibIdonea;

	/**
	 * @generated
	 */
	public void setEFlgCoibIdonea(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eFlgCoibIdonea = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEFlgCoibIdonea() {
		return eFlgCoibIdonea;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eFlgDispFunzionanti;

	/**
	 * @generated
	 */
	public void setEFlgDispFunzionanti(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eFlgDispFunzionanti = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEFlgDispFunzionanti() {
		return eFlgDispFunzionanti;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTempExtC;

	/**
	 * @generated
	 */
	public void setETempExtC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTempExtC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETempExtC() {
		return eTempExtC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTempMandPrimarioC;

	/**
	 * @generated
	 */
	public void setETempMandPrimarioC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTempMandPrimarioC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETempMandPrimarioC() {
		return eTempMandPrimarioC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTempRitorPrimarioC;

	/**
	 * @generated
	 */
	public void setETempRitorPrimarioC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTempRitorPrimarioC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETempRitorPrimarioC() {
		return eTempRitorPrimarioC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTempMandSecondarioC;

	/**
	 * @generated
	 */
	public void setETempMandSecondarioC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTempMandSecondarioC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETempMandSecondarioC() {
		return eTempMandSecondarioC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTempRitSecondarioC;

	/**
	 * @generated
	 */
	public void setETempRitSecondarioC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTempRitSecondarioC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETempRitSecondarioC() {
		return eTempRitSecondarioC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk ePotenzaTermKw;

	/**
	 * @generated
	 */
	public void setEPotenzaTermKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		ePotenzaTermKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEPotenzaTermKw() {
		return ePotenzaTermKw;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk ePortFluidoM3H;

	/**
	 * @generated
	 */
	public void setEPortFluidoM3H(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		ePortFluidoM3H = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEPortFluidoM3H() {
		return ePortFluidoM3H;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataUltMod;

	/**
	 * @generated
	 */
	public void setDataUltMod(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataUltMod = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataUltMod() {
		return dataUltMod;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk utenteUltMod;

	/**
	 * @generated
	 */
	public void setUtenteUltMod(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		utenteUltMod = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getUtenteUltMod() {
		return utenteUltMod;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eControlloweb;

	/**
	 * @generated
	 */
	public void setEControlloweb(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eControlloweb = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEControlloweb() {
		return eControlloweb;
	}

}
