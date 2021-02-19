package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTCodiceBollDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTCodiceBollExample extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk siglaBollino;

	/**
	 * @generated
	 */
	public void setSiglaBollino(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		siglaBollino = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getSiglaBollino() {
		return siglaBollino;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk numeroBollino;

	/**
	 * @generated
	 */
	public void setNumeroBollino(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		numeroBollino = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getNumeroBollino() {
		return numeroBollino;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkTransazioneBoll;

	/**
	 * @generated
	 */
	public void setFkTransazioneBoll(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkTransazioneBoll = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkTransazioneBoll() {
		return fkTransazioneBoll;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkPotenza;

	/**
	 * @generated
	 */
	public void setFkPotenza(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkPotenza = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkPotenza() {
		return fkPotenza;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkPrezzo;

	/**
	 * @generated
	 */
	public void setFkPrezzo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkPrezzo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkPrezzo() {
		return fkPrezzo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkDtInizioAcquisto;

	/**
	 * @generated
	 */
	public void setFkDtInizioAcquisto(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkDtInizioAcquisto = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkDtInizioAcquisto() {
		return fkDtInizioAcquisto;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgPregresso;

	/**
	 * @generated
	 */
	public void setFlgPregresso(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgPregresso = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgPregresso() {
		return flgPregresso;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dtInserimento;

	/**
	 * @generated
	 */
	public void setDtInserimento(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dtInserimento = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDtInserimento() {
		return dtInserimento;
	}

}
