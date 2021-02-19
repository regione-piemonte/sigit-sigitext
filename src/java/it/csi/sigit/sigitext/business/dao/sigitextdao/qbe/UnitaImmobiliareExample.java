package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [UnitaImmobiliareDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class UnitaImmobiliareExample extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idUnitaImm;

	/**
	 * @generated
	 */
	public void setIdUnitaImm(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idUnitaImm = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdUnitaImm() {
		return idUnitaImm;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkL2;

	/**
	 * @generated
	 */
	public void setFkL2(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkL2 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkL2() {
		return fkL2;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk indirizzoSitad;

	/**
	 * @generated
	 */
	public void setIndirizzoSitad(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		indirizzoSitad = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIndirizzoSitad() {
		return indirizzoSitad;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk indirizzoNonTrovato;

	/**
	 * @generated
	 */
	public void setIndirizzoNonTrovato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		indirizzoNonTrovato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIndirizzoNonTrovato() {
		return indirizzoNonTrovato;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk civico;

	/**
	 * @generated
	 */
	public void setCivico(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		civico = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCivico() {
		return civico;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk cap;

	/**
	 * @generated
	 */
	public void setCap(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		cap = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCap() {
		return cap;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk scala;

	/**
	 * @generated
	 */
	public void setScala(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		scala = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getScala() {
		return scala;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk palazzo;

	/**
	 * @generated
	 */
	public void setPalazzo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		palazzo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getPalazzo() {
		return palazzo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk interno;

	/**
	 * @generated
	 */
	public void setInterno(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		interno = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getInterno() {
		return interno;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk note;

	/**
	 * @generated
	 */
	public void setNote(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		note = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getNote() {
		return note;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgPrincipale;

	/**
	 * @generated
	 */
	public void setFlgPrincipale(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgPrincipale = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgPrincipale() {
		return flgPrincipale;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk sezione;

	/**
	 * @generated
	 */
	public void setSezione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		sezione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getSezione() {
		return sezione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk foglio;

	/**
	 * @generated
	 */
	public void setFoglio(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		foglio = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFoglio() {
		return foglio;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk particella;

	/**
	 * @generated
	 */
	public void setParticella(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		particella = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getParticella() {
		return particella;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk subalterno;

	/**
	 * @generated
	 */
	public void setSubalterno(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		subalterno = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getSubalterno() {
		return subalterno;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk podElettrico;

	/**
	 * @generated
	 */
	public void setPodElettrico(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		podElettrico = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getPodElettrico() {
		return podElettrico;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk pdrGas;

	/**
	 * @generated
	 */
	public void setPdrGas(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		pdrGas = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getPdrGas() {
		return pdrGas;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l12FlgSingolaUnita;

	/**
	 * @generated
	 */
	public void setL12FlgSingolaUnita(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l12FlgSingolaUnita = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL12FlgSingolaUnita() {
		return l12FlgSingolaUnita;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l12FkCategoria;

	/**
	 * @generated
	 */
	public void setL12FkCategoria(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l12FkCategoria = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL12FkCategoria() {
		return l12FkCategoria;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l12VolRiscM3;

	/**
	 * @generated
	 */
	public void setL12VolRiscM3(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l12VolRiscM3 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL12VolRiscM3() {
		return l12VolRiscM3;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l12VolRaffM3;

	/**
	 * @generated
	 */
	public void setL12VolRaffM3(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l12VolRaffM3 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL12VolRaffM3() {
		return l12VolRaffM3;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgNopdr;

	/**
	 * @generated
	 */
	public void setFlgNopdr(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgNopdr = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgNopdr() {
		return flgNopdr;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgNoaccatastato;

	/**
	 * @generated
	 */
	public void setFlgNoaccatastato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgNoaccatastato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgNoaccatastato() {
		return flgNoaccatastato;
	}

}
