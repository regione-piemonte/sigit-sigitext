package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTCompBrRcDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTCompBrRcExample extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idCompBrRc;

	/**
	 * @generated
	 */
	public void setIdCompBrRc(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idCompBrRc = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdCompBrRc() {
		return idCompBrRc;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk tipologiaBrRc;

	/**
	 * @generated
	 */
	public void setTipologiaBrRc(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		tipologiaBrRc = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getTipologiaBrRc() {
		return tipologiaBrRc;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk progressivoBrRc;

	/**
	 * @generated
	 */
	public void setProgressivoBrRc(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		progressivoBrRc = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getProgressivoBrRc() {
		return progressivoBrRc;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkProgressivo;

	/**
	 * @generated
	 */
	public void setFkProgressivo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkProgressivo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkProgressivo() {
		return fkProgressivo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkDataInstall;

	/**
	 * @generated
	 */
	public void setFkDataInstall(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkDataInstall = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkDataInstall() {
		return fkDataInstall;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk tipologia;

	/**
	 * @generated
	 */
	public void setTipologia(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		tipologia = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getTipologia() {
		return tipologia;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk potTermMaxKw;

	/**
	 * @generated
	 */
	public void setPotTermMaxKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		potTermMaxKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getPotTermMaxKw() {
		return potTermMaxKw;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk potTermMinKw;

	/**
	 * @generated
	 */
	public void setPotTermMinKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		potTermMinKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getPotTermMinKw() {
		return potTermMinKw;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataDismiss;

	/**
	 * @generated
	 */
	public void setDataDismiss(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataDismiss = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataDismiss() {
		return dataDismiss;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkMarca;

	/**
	 * @generated
	 */
	public void setFkMarca(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkMarca = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkMarca() {
		return fkMarca;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk modello;

	/**
	 * @generated
	 */
	public void setModello(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		modello = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getModello() {
		return modello;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk matricola;

	/**
	 * @generated
	 */
	public void setMatricola(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		matricola = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getMatricola() {
		return matricola;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkCombustibile;

	/**
	 * @generated
	 */
	public void setFkCombustibile(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkCombustibile = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkCombustibile() {
		return fkCombustibile;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgDismissione;

	/**
	 * @generated
	 */
	public void setFlgDismissione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgDismissione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgDismissione() {
		return flgDismissione;
	}

}
