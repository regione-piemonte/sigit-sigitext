package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitVSk4GfDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitVSk4GfExample extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkDettaglioGf;

	/**
	 * @generated
	 */
	public void setFkDettaglioGf(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkDettaglioGf = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkDettaglioGf() {
		return fkDettaglioGf;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk desDettaglioGf;

	/**
	 * @generated
	 */
	public void setDesDettaglioGf(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		desDettaglioGf = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDesDettaglioGf() {
		return desDettaglioGf;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgSorgenteExt;

	/**
	 * @generated
	 */
	public void setFlgSorgenteExt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgSorgenteExt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgSorgenteExt() {
		return flgSorgenteExt;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgFluidoUtenze;

	/**
	 * @generated
	 */
	public void setFlgFluidoUtenze(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgFluidoUtenze = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgFluidoUtenze() {
		return flgFluidoUtenze;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fluidoFrigorigeno;

	/**
	 * @generated
	 */
	public void setFluidoFrigorigeno(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fluidoFrigorigeno = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFluidoFrigorigeno() {
		return fluidoFrigorigeno;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk nCircuiti;

	/**
	 * @generated
	 */
	public void setNCircuiti(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		nCircuiti = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getNCircuiti() {
		return nCircuiti;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk raffrescamentoEer;

	/**
	 * @generated
	 */
	public void setRaffrescamentoEer(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		raffrescamentoEer = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getRaffrescamentoEer() {
		return raffrescamentoEer;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk raffPotenzaKw;

	/**
	 * @generated
	 */
	public void setRaffPotenzaKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		raffPotenzaKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getRaffPotenzaKw() {
		return raffPotenzaKw;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk raffPotenzaAss;

	/**
	 * @generated
	 */
	public void setRaffPotenzaAss(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		raffPotenzaAss = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getRaffPotenzaAss() {
		return raffPotenzaAss;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk riscaldamentoCop;

	/**
	 * @generated
	 */
	public void setRiscaldamentoCop(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		riscaldamentoCop = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getRiscaldamentoCop() {
		return riscaldamentoCop;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk riscPotenzaKw;

	/**
	 * @generated
	 */
	public void setRiscPotenzaKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		riscPotenzaKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getRiscPotenzaKw() {
		return riscPotenzaKw;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk riscPotenzaAssKw;

	/**
	 * @generated
	 */
	public void setRiscPotenzaAssKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		riscPotenzaAssKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getRiscPotenzaAssKw() {
		return riscPotenzaAssKw;
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
