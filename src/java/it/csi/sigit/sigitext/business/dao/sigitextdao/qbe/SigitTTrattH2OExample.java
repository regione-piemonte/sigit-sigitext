package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTTrattH2ODto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTTrattH2OExample extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l21H2oClimaM3;

	/**
	 * @generated
	 */
	public void setL21H2oClimaM3(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l21H2oClimaM3 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL21H2oClimaM3() {
		return l21H2oClimaM3;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l22DurezzaH2oFr;

	/**
	 * @generated
	 */
	public void setL22DurezzaH2oFr(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l22DurezzaH2oFr = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL22DurezzaH2oFr() {
		return l22DurezzaH2oFr;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23FlgTrattRiscNonRich;

	/**
	 * @generated
	 */
	public void setL23FlgTrattRiscNonRich(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23FlgTrattRiscNonRich = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23FlgTrattRiscNonRich() {
		return l23FlgTrattRiscNonRich;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23FlgTrattClimaAssente;

	/**
	 * @generated
	 */
	public void setL23FlgTrattClimaAssente(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23FlgTrattClimaAssente = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23FlgTrattClimaAssente() {
		return l23FlgTrattClimaAssente;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23DurezzaTotH2oFr;

	/**
	 * @generated
	 */
	public void setL23DurezzaTotH2oFr(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23DurezzaTotH2oFr = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23DurezzaTotH2oFr() {
		return l23DurezzaTotH2oFr;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23FlgTrattClimaFiltr;

	/**
	 * @generated
	 */
	public void setL23FlgTrattClimaFiltr(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23FlgTrattClimaFiltr = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23FlgTrattClimaFiltr() {
		return l23FlgTrattClimaFiltr;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23FlgTrattClimaAddolc;

	/**
	 * @generated
	 */
	public void setL23FlgTrattClimaAddolc(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23FlgTrattClimaAddolc = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23FlgTrattClimaAddolc() {
		return l23FlgTrattClimaAddolc;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23FlgTrattClimaChimico;

	/**
	 * @generated
	 */
	public void setL23FlgTrattClimaChimico(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23FlgTrattClimaChimico = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23FlgTrattClimaChimico() {
		return l23FlgTrattClimaChimico;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23FlgTrattGeloAssente;

	/**
	 * @generated
	 */
	public void setL23FlgTrattGeloAssente(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23FlgTrattGeloAssente = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23FlgTrattGeloAssente() {
		return l23FlgTrattGeloAssente;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23FlgTrattGeloGliEtil;

	/**
	 * @generated
	 */
	public void setL23FlgTrattGeloGliEtil(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23FlgTrattGeloGliEtil = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23FlgTrattGeloGliEtil() {
		return l23FlgTrattGeloGliEtil;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23PercGliEtil;

	/**
	 * @generated
	 */
	public void setL23PercGliEtil(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23PercGliEtil = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23PercGliEtil() {
		return l23PercGliEtil;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23PhGliEtil;

	/**
	 * @generated
	 */
	public void setL23PhGliEtil(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23PhGliEtil = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23PhGliEtil() {
		return l23PhGliEtil;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23FlgTrattGeloGliProp;

	/**
	 * @generated
	 */
	public void setL23FlgTrattGeloGliProp(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23FlgTrattGeloGliProp = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23FlgTrattGeloGliProp() {
		return l23FlgTrattGeloGliProp;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23PercGliProp;

	/**
	 * @generated
	 */
	public void setL23PercGliProp(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23PercGliProp = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23PercGliProp() {
		return l23PercGliProp;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l23PhGliProp;

	/**
	 * @generated
	 */
	public void setL23PhGliProp(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l23PhGliProp = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL23PhGliProp() {
		return l23PhGliProp;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l24FlgTrattAcsNonRich;

	/**
	 * @generated
	 */
	public void setL24FlgTrattAcsNonRich(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l24FlgTrattAcsNonRich = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL24FlgTrattAcsNonRich() {
		return l24FlgTrattAcsNonRich;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l24FlgTrattAcsAssente;

	/**
	 * @generated
	 */
	public void setL24FlgTrattAcsAssente(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l24FlgTrattAcsAssente = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL24FlgTrattAcsAssente() {
		return l24FlgTrattAcsAssente;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l24FlgTrattAcsFiltr;

	/**
	 * @generated
	 */
	public void setL24FlgTrattAcsFiltr(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l24FlgTrattAcsFiltr = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL24FlgTrattAcsFiltr() {
		return l24FlgTrattAcsFiltr;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l24FlgTrattAcsAddolc;

	/**
	 * @generated
	 */
	public void setL24FlgTrattAcsAddolc(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l24FlgTrattAcsAddolc = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL24FlgTrattAcsAddolc() {
		return l24FlgTrattAcsAddolc;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l24DurezzaAddolcFr;

	/**
	 * @generated
	 */
	public void setL24DurezzaAddolcFr(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l24DurezzaAddolcFr = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL24DurezzaAddolcFr() {
		return l24DurezzaAddolcFr;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l24FlgTrattAcsChimico;

	/**
	 * @generated
	 */
	public void setL24FlgTrattAcsChimico(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l24FlgTrattAcsChimico = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL24FlgTrattAcsChimico() {
		return l24FlgTrattAcsChimico;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattRaffAssente;

	/**
	 * @generated
	 */
	public void setL25FlgTrattRaffAssente(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattRaffAssente = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattRaffAssente() {
		return l25FlgTrattRaffAssente;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattRaffNoRt;

	/**
	 * @generated
	 */
	public void setL25FlgTrattRaffNoRt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattRaffNoRt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattRaffNoRt() {
		return l25FlgTrattRaffNoRt;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattRaffRtp;

	/**
	 * @generated
	 */
	public void setL25FlgTrattRaffRtp(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattRaffRtp = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattRaffRtp() {
		return l25FlgTrattRaffRtp;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattRaffRtt;

	/**
	 * @generated
	 */
	public void setL25FlgTrattRaffRtt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattRaffRtt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattRaffRtt() {
		return l25FlgTrattRaffRtt;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattRaffAcq;

	/**
	 * @generated
	 */
	public void setL25FlgTrattRaffAcq(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattRaffAcq = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattRaffAcq() {
		return l25FlgTrattRaffAcq;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattRaffPzz;

	/**
	 * @generated
	 */
	public void setL25FlgTrattRaffPzz(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattRaffPzz = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattRaffPzz() {
		return l25FlgTrattRaffPzz;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattRaffH2oSup;

	/**
	 * @generated
	 */
	public void setL25FlgTrattRaffH2oSup(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattRaffH2oSup = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattRaffH2oSup() {
		return l25FlgTrattRaffH2oSup;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattFFiltSic;

	/**
	 * @generated
	 */
	public void setL25FlgTrattFFiltSic(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattFFiltSic = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattFFiltSic() {
		return l25FlgTrattFFiltSic;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattFFiltMas;

	/**
	 * @generated
	 */
	public void setL25FlgTrattFFiltMas(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattFFiltMas = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattFFiltMas() {
		return l25FlgTrattFFiltMas;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattFNoTratt;

	/**
	 * @generated
	 */
	public void setL25FlgTrattFNoTratt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattFNoTratt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattFNoTratt() {
		return l25FlgTrattFNoTratt;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25TrattFAltro;

	/**
	 * @generated
	 */
	public void setL25TrattFAltro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25TrattFAltro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25TrattFAltro() {
		return l25TrattFAltro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattTAddolc;

	/**
	 * @generated
	 */
	public void setL25FlgTrattTAddolc(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattTAddolc = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattTAddolc() {
		return l25FlgTrattTAddolc;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattTOsmosi;

	/**
	 * @generated
	 */
	public void setL25FlgTrattTOsmosi(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattTOsmosi = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattTOsmosi() {
		return l25FlgTrattTOsmosi;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattTDemin;

	/**
	 * @generated
	 */
	public void setL25FlgTrattTDemin(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattTDemin = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattTDemin() {
		return l25FlgTrattTDemin;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattTNoTratt;

	/**
	 * @generated
	 */
	public void setL25FlgTrattTNoTratt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattTNoTratt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattTNoTratt() {
		return l25FlgTrattTNoTratt;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25TrattTAltro;

	/**
	 * @generated
	 */
	public void setL25TrattTAltro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25TrattTAltro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25TrattTAltro() {
		return l25TrattTAltro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattCPaantincro;

	/**
	 * @generated
	 */
	public void setL25FlgTrattCPaantincro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattCPaantincro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattCPaantincro() {
		return l25FlgTrattCPaantincro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattCPaanticorr;

	/**
	 * @generated
	 */
	public void setL25FlgTrattCPaanticorr(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattCPaanticorr = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattCPaanticorr() {
		return l25FlgTrattCPaanticorr;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattCAaa;

	/**
	 * @generated
	 */
	public void setL25FlgTrattCAaa(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattCAaa = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattCAaa() {
		return l25FlgTrattCAaa;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattCBiocida;

	/**
	 * @generated
	 */
	public void setL25FlgTrattCBiocida(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattCBiocida = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattCBiocida() {
		return l25FlgTrattCBiocida;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgTrattCNoTratt;

	/**
	 * @generated
	 */
	public void setL25FlgTrattCNoTratt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgTrattCNoTratt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgTrattCNoTratt() {
		return l25FlgTrattCNoTratt;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25TrattCAltro;

	/**
	 * @generated
	 */
	public void setL25TrattCAltro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25TrattCAltro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25TrattCAltro() {
		return l25TrattCAltro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25FlgSpurgoAutom;

	/**
	 * @generated
	 */
	public void setL25FlgSpurgoAutom(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25FlgSpurgoAutom = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25FlgSpurgoAutom() {
		return l25FlgSpurgoAutom;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25ConducH2oIng;

	/**
	 * @generated
	 */
	public void setL25ConducH2oIng(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25ConducH2oIng = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25ConducH2oIng() {
		return l25ConducH2oIng;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l25Taratura;

	/**
	 * @generated
	 */
	public void setL25Taratura(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l25Taratura = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL25Taratura() {
		return l25Taratura;
	}

}
