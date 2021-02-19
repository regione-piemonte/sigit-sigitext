package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTConsumoDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTConsumoExample extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk idConsumo;

	/**
	 * @generated
	 */
	public void setIdConsumo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		idConsumo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIdConsumo() {
		return idConsumo;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkTipoConsumo;

	/**
	 * @generated
	 */
	public void setFkTipoConsumo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkTipoConsumo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkTipoConsumo() {
		return fkTipoConsumo;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk acquisti;

	/**
	 * @generated
	 */
	public void setAcquisti(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		acquisti = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getAcquisti() {
		return acquisti;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk letturaIniziale;

	/**
	 * @generated
	 */
	public void setLetturaIniziale(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		letturaIniziale = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getLetturaIniziale() {
		return letturaIniziale;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk letturaFinale;

	/**
	 * @generated
	 */
	public void setLetturaFinale(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		letturaFinale = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getLetturaFinale() {
		return letturaFinale;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk consumo;

	/**
	 * @generated
	 */
	public void setConsumo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		consumo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getConsumo() {
		return consumo;
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

}
