package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitVSk4GtDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitVSk4GtExample extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk desMarca;

	/**
	 * @generated
	 */
	public void setDesMarca(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		desMarca = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDesMarca() {
		return desMarca;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idCombustibile;

	/**
	 * @generated
	 */
	public void setIdCombustibile(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idCombustibile = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdCombustibile() {
		return idCombustibile;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk desCombustibile;

	/**
	 * @generated
	 */
	public void setDesCombustibile(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		desCombustibile = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDesCombustibile() {
		return desCombustibile;
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

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkDettaglioGt;

	/**
	 * @generated
	 */
	public void setFkDettaglioGt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkDettaglioGt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkDettaglioGt() {
		return fkDettaglioGt;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk desDettaglioGt;

	/**
	 * @generated
	 */
	public void setDesDettaglioGt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		desDettaglioGt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDesDettaglioGt() {
		return desDettaglioGt;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk potenzaTermicaKw;

	/**
	 * @generated
	 */
	public void setPotenzaTermicaKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		potenzaTermicaKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getPotenzaTermicaKw() {
		return potenzaTermicaKw;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk rendimentoPerc;

	/**
	 * @generated
	 */
	public void setRendimentoPerc(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		rendimentoPerc = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getRendimentoPerc() {
		return rendimentoPerc;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk nModuli;

	/**
	 * @generated
	 */
	public void setNModuli(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		nModuli = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getNModuli() {
		return nModuli;
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

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataControllo;

	/**
	 * @generated
	 */
	public void setDataControllo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataControllo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataControllo() {
		return dataControllo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk tempoManutAnni;

	/**
	 * @generated
	 */
	public void setTempoManutAnni(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		tempoManutAnni = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getTempoManutAnni() {
		return tempoManutAnni;
	}

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkTipoDocumento;

	/**
	 * @generated
	 */
	public void setFkTipoDocumento(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkTipoDocumento = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkTipoDocumento() {
		return fkTipoDocumento;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk desTipoDocumento;

	/**
	 * @generated
	 */
	public void setDesTipoDocumento(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		desTipoDocumento = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDesTipoDocumento() {
		return desTipoDocumento;
	}

}
