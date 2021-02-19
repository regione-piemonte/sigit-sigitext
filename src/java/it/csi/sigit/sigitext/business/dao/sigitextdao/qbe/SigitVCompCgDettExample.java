package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitVCompCgDettDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitVCompCgDettExample extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk ePotenzaAssorbCombKw;

	/**
	 * @generated
	 */
	public void setEPotenzaAssorbCombKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		ePotenzaAssorbCombKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEPotenzaAssorbCombKw() {
		return ePotenzaAssorbCombKw;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk ePotenzaTermBypassKw;

	/**
	 * @generated
	 */
	public void setEPotenzaTermBypassKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		ePotenzaTermBypassKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEPotenzaTermBypassKw() {
		return ePotenzaTermBypassKw;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTempAriaC;

	/**
	 * @generated
	 */
	public void setETempAriaC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTempAriaC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETempAriaC() {
		return eTempAriaC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTempH2oOutC;

	/**
	 * @generated
	 */
	public void setETempH2oOutC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTempH2oOutC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETempH2oOutC() {
		return eTempH2oOutC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTempH2oInC;

	/**
	 * @generated
	 */
	public void setETempH2oInC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTempH2oInC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETempH2oInC() {
		return eTempH2oInC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk ePotenzaMorsettiKw;

	/**
	 * @generated
	 */
	public void setEPotenzaMorsettiKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		ePotenzaMorsettiKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEPotenzaMorsettiKw() {
		return ePotenzaMorsettiKw;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTempH2oMotoreC;

	/**
	 * @generated
	 */
	public void setETempH2oMotoreC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTempH2oMotoreC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETempH2oMotoreC() {
		return eTempH2oMotoreC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTempFumiValleC;

	/**
	 * @generated
	 */
	public void setETempFumiValleC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTempFumiValleC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETempFumiValleC() {
		return eTempFumiValleC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk eTempFumiMonteC;

	/**
	 * @generated
	 */
	public void setETempFumiMonteC(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		eTempFumiMonteC = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getETempFumiMonteC() {
		return eTempFumiMonteC;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataUltModDett;

	/**
	 * @generated
	 */
	public void setDataUltModDett(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataUltModDett = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataUltModDett() {
		return dataUltModDett;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk utenteUltModDett;

	/**
	 * @generated
	 */
	public void setUtenteUltModDett(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		utenteUltModDett = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getUtenteUltModDett() {
		return utenteUltModDett;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SovrafreqSogliaHzMin;

	/**
	 * @generated
	 */
	public void setL114SovrafreqSogliaHzMin(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SovrafreqSogliaHzMin = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SovrafreqSogliaHzMin() {
		return l114SovrafreqSogliaHzMin;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SovrafreqSogliaHzMed;

	/**
	 * @generated
	 */
	public void setL114SovrafreqSogliaHzMed(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SovrafreqSogliaHzMed = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SovrafreqSogliaHzMed() {
		return l114SovrafreqSogliaHzMed;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SovrafreqSogliaHzMax;

	/**
	 * @generated
	 */
	public void setL114SovrafreqSogliaHzMax(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SovrafreqSogliaHzMax = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SovrafreqSogliaHzMax() {
		return l114SovrafreqSogliaHzMax;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SovrafreqTempoSMin;

	/**
	 * @generated
	 */
	public void setL114SovrafreqTempoSMin(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SovrafreqTempoSMin = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SovrafreqTempoSMin() {
		return l114SovrafreqTempoSMin;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SovrafreqTempoSMed;

	/**
	 * @generated
	 */
	public void setL114SovrafreqTempoSMed(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SovrafreqTempoSMed = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SovrafreqTempoSMed() {
		return l114SovrafreqTempoSMed;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SovrafreqTempoSMax;

	/**
	 * @generated
	 */
	public void setL114SovrafreqTempoSMax(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SovrafreqTempoSMax = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SovrafreqTempoSMax() {
		return l114SovrafreqTempoSMax;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SottofreqSogliaHzMin;

	/**
	 * @generated
	 */
	public void setL114SottofreqSogliaHzMin(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SottofreqSogliaHzMin = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SottofreqSogliaHzMin() {
		return l114SottofreqSogliaHzMin;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SottofreqSogliaHzMed;

	/**
	 * @generated
	 */
	public void setL114SottofreqSogliaHzMed(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SottofreqSogliaHzMed = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SottofreqSogliaHzMed() {
		return l114SottofreqSogliaHzMed;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SottofreqSogliaHzMax;

	/**
	 * @generated
	 */
	public void setL114SottofreqSogliaHzMax(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SottofreqSogliaHzMax = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SottofreqSogliaHzMax() {
		return l114SottofreqSogliaHzMax;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SottofreqTempoSMin;

	/**
	 * @generated
	 */
	public void setL114SottofreqTempoSMin(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SottofreqTempoSMin = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SottofreqTempoSMin() {
		return l114SottofreqTempoSMin;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SottofreqTempoSMed;

	/**
	 * @generated
	 */
	public void setL114SottofreqTempoSMed(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SottofreqTempoSMed = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SottofreqTempoSMed() {
		return l114SottofreqTempoSMed;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SottofreqTempoSMax;

	/**
	 * @generated
	 */
	public void setL114SottofreqTempoSMax(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SottofreqTempoSMax = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SottofreqTempoSMax() {
		return l114SottofreqTempoSMax;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SovratensSogliaVMin;

	/**
	 * @generated
	 */
	public void setL114SovratensSogliaVMin(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SovratensSogliaVMin = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SovratensSogliaVMin() {
		return l114SovratensSogliaVMin;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SovratensSogliaVMed;

	/**
	 * @generated
	 */
	public void setL114SovratensSogliaVMed(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SovratensSogliaVMed = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SovratensSogliaVMed() {
		return l114SovratensSogliaVMed;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SovratensSogliaVMax;

	/**
	 * @generated
	 */
	public void setL114SovratensSogliaVMax(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SovratensSogliaVMax = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SovratensSogliaVMax() {
		return l114SovratensSogliaVMax;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SovratensTempoSMin;

	/**
	 * @generated
	 */
	public void setL114SovratensTempoSMin(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SovratensTempoSMin = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SovratensTempoSMin() {
		return l114SovratensTempoSMin;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SovratensTempoSMed;

	/**
	 * @generated
	 */
	public void setL114SovratensTempoSMed(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SovratensTempoSMed = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SovratensTempoSMed() {
		return l114SovratensTempoSMed;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SovratensTempoSMax;

	/**
	 * @generated
	 */
	public void setL114SovratensTempoSMax(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SovratensTempoSMax = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SovratensTempoSMax() {
		return l114SovratensTempoSMax;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SottotensSogliaVMin;

	/**
	 * @generated
	 */
	public void setL114SottotensSogliaVMin(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SottotensSogliaVMin = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SottotensSogliaVMin() {
		return l114SottotensSogliaVMin;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SottotensSogliaVMed;

	/**
	 * @generated
	 */
	public void setL114SottotensSogliaVMed(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SottotensSogliaVMed = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SottotensSogliaVMed() {
		return l114SottotensSogliaVMed;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SottotensSogliaVMax;

	/**
	 * @generated
	 */
	public void setL114SottotensSogliaVMax(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SottotensSogliaVMax = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SottotensSogliaVMax() {
		return l114SottotensSogliaVMax;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SottotensTempoSMin;

	/**
	 * @generated
	 */
	public void setL114SottotensTempoSMin(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SottotensTempoSMin = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SottotensTempoSMin() {
		return l114SottotensTempoSMin;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SottotensTempoSMed;

	/**
	 * @generated
	 */
	public void setL114SottotensTempoSMed(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SottotensTempoSMed = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SottotensTempoSMed() {
		return l114SottotensTempoSMed;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l114SottotensTempoSMax;

	/**
	 * @generated
	 */
	public void setL114SottotensTempoSMax(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l114SottotensTempoSMax = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL114SottotensTempoSMax() {
		return l114SottotensTempoSMax;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk coMin;

	/**
	 * @generated
	 */
	public void setCoMin(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		coMin = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCoMin() {
		return coMin;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk coMax;

	/**
	 * @generated
	 */
	public void setCoMax(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		coMax = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCoMax() {
		return coMax;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk siglaRea;

	/**
	 * @generated
	 */
	public void setSiglaRea(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		siglaRea = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getSiglaRea() {
		return siglaRea;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk numeroRea;

	/**
	 * @generated
	 */
	public void setNumeroRea(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		numeroRea = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getNumeroRea() {
		return numeroRea;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idPersonaGiuridica;

	/**
	 * @generated
	 */
	public void setIdPersonaGiuridica(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idPersonaGiuridica = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdPersonaGiuridica() {
		return idPersonaGiuridica;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkRuolo;

	/**
	 * @generated
	 */
	public void setFkRuolo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkRuolo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkRuolo() {
		return fkRuolo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkStatoRapp;

	/**
	 * @generated
	 */
	public void setFkStatoRapp(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkStatoRapp = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkStatoRapp() {
		return fkStatoRapp;
	}

}
