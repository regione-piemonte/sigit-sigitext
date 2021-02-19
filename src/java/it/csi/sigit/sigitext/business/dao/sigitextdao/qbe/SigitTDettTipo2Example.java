package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTDettTipo2Dto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTDettTipo2Example extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idDettTipo2;

	/**
	 * @generated
	 */
	public void setIdDettTipo2(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idDettTipo2 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdDettTipo2() {
		return idDettTipo2;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eNCircuito;

	/**
	 * @generated
	 */
	public void setENCircuito(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eNCircuito = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getENCircuito() {
		return eNCircuito;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eFlgModProva;

	/**
	 * @generated
	 */
	public void setEFlgModProva(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eFlgModProva = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEFlgModProva() {
		return eFlgModProva;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eFlgPerditaGas;

	/**
	 * @generated
	 */
	public void setEFlgPerditaGas(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eFlgPerditaGas = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEFlgPerditaGas() {
		return eFlgPerditaGas;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eFlgLeakDetector;

	/**
	 * @generated
	 */
	public void setEFlgLeakDetector(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eFlgLeakDetector = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEFlgLeakDetector() {
		return eFlgLeakDetector;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eFlgParamTermodinam;

	/**
	 * @generated
	 */
	public void setEFlgParamTermodinam(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eFlgParamTermodinam = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEFlgParamTermodinam() {
		return eFlgParamTermodinam;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eFlgIncrostazioni;

	/**
	 * @generated
	 */
	public void setEFlgIncrostazioni(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eFlgIncrostazioni = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEFlgIncrostazioni() {
		return eFlgIncrostazioni;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTSurriscC;

	/**
	 * @generated
	 */
	public void setETSurriscC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTSurriscC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETSurriscC() {
		return eTSurriscC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTSottorafC;

	/**
	 * @generated
	 */
	public void setETSottorafC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTSottorafC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETSottorafC() {
		return eTSottorafC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTCondensazioneC;

	/**
	 * @generated
	 */
	public void setETCondensazioneC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTCondensazioneC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETCondensazioneC() {
		return eTCondensazioneC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTEvaporazioneC;

	/**
	 * @generated
	 */
	public void setETEvaporazioneC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTEvaporazioneC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETEvaporazioneC() {
		return eTEvaporazioneC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTInExtC;

	/**
	 * @generated
	 */
	public void setETInExtC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTInExtC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETInExtC() {
		return eTInExtC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTOutExtC;

	/**
	 * @generated
	 */
	public void setETOutExtC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTOutExtC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETOutExtC() {
		return eTOutExtC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTInUtenzeC;

	/**
	 * @generated
	 */
	public void setETInUtenzeC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTInUtenzeC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETInUtenzeC() {
		return eTInUtenzeC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTOutUtenzeC;

	/**
	 * @generated
	 */
	public void setETOutUtenzeC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTOutUtenzeC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETOutUtenzeC() {
		return eTOutUtenzeC;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l112TorreTOutFluido;

	/**
	 * @generated
	 */
	public void setL112TorreTOutFluido(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l112TorreTOutFluido = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL112TorreTOutFluido() {
		return l112TorreTOutFluido;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l112TorreTBulboUmido;

	/**
	 * @generated
	 */
	public void setL112TorreTBulboUmido(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l112TorreTBulboUmido = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL112TorreTBulboUmido() {
		return l112TorreTBulboUmido;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l112ScambiatoreTInExt;

	/**
	 * @generated
	 */
	public void setL112ScambiatoreTInExt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l112ScambiatoreTInExt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL112ScambiatoreTInExt() {
		return l112ScambiatoreTInExt;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l112ScambiatoreTOutExt;

	/**
	 * @generated
	 */
	public void setL112ScambiatoreTOutExt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l112ScambiatoreTOutExt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL112ScambiatoreTOutExt() {
		return l112ScambiatoreTOutExt;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l112ScambiatTInMacchina;

	/**
	 * @generated
	 */
	public void setL112ScambiatTInMacchina(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l112ScambiatTInMacchina = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL112ScambiatTInMacchina() {
		return l112ScambiatTInMacchina;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l112ScambiatTOutMacchina;

	/**
	 * @generated
	 */
	public void setL112ScambiatTOutMacchina(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l112ScambiatTOutMacchina = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL112ScambiatTOutMacchina() {
		return l112ScambiatTOutMacchina;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l112PotenzaAssorbitaKw;

	/**
	 * @generated
	 */
	public void setL112PotenzaAssorbitaKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l112PotenzaAssorbitaKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL112PotenzaAssorbitaKw() {
		return l112PotenzaAssorbitaKw;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l112FlgPuliziaFiltri;

	/**
	 * @generated
	 */
	public void setL112FlgPuliziaFiltri(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l112FlgPuliziaFiltri = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL112FlgPuliziaFiltri() {
		return l112FlgPuliziaFiltri;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l112FlgVerificaSuperata;

	/**
	 * @generated
	 */
	public void setL112FlgVerificaSuperata(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l112FlgVerificaSuperata = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL112FlgVerificaSuperata() {
		return l112FlgVerificaSuperata;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l112DataRipristino;

	/**
	 * @generated
	 */
	public void setL112DataRipristino(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l112DataRipristino = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL112DataRipristino() {
		return l112DataRipristino;
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
