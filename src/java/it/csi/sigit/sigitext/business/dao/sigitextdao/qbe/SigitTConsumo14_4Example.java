package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTConsumo14_4Dto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTConsumo14_4Example extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idConsumoH2o;

	/**
	 * @generated
	 */
	public void setIdConsumoH2o(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idConsumoH2o = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdConsumoH2o() {
		return idConsumoH2o;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgCircuitoIt;

	/**
	 * @generated
	 */
	public void setFlgCircuitoIt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgCircuitoIt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgCircuitoIt() {
		return flgCircuitoIt;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgCircuitoAcs;

	/**
	 * @generated
	 */
	public void setFlgCircuitoAcs(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgCircuitoAcs = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgCircuitoAcs() {
		return flgCircuitoAcs;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgAca;

	/**
	 * @generated
	 */
	public void setFlgAca(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgAca = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgAca() {
		return flgAca;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk nomeProdotto;

	/**
	 * @generated
	 */
	public void setNomeProdotto(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		nomeProdotto = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getNomeProdotto() {
		return nomeProdotto;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk qtaConsumata;

	/**
	 * @generated
	 */
	public void setQtaConsumata(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		qtaConsumata = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getQtaConsumata() {
		return qtaConsumata;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkUnitaMisura;

	/**
	 * @generated
	 */
	public void setFkUnitaMisura(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkUnitaMisura = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkUnitaMisura() {
		return fkUnitaMisura;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk esercizioDa;

	/**
	 * @generated
	 */
	public void setEsercizioDa(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		esercizioDa = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEsercizioDa() {
		return esercizioDa;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk esercizioA;

	/**
	 * @generated
	 */
	public void setEsercizioA(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		esercizioA = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEsercizioA() {
		return esercizioA;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk esercizio;

	/**
	 * @generated
	 */
	public void setEsercizio(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		esercizio = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getEsercizio() {
		return esercizio;
	}

}
