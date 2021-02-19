package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTCompVmDao.
 * @generated
 */
public class SigitTCompVmDto extends SigitTCompVmPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna FK_DETTAGLIO_VM
	 * @generated
	 */
	protected java.math.BigDecimal fkDettaglioVm;

	/**
	 * Imposta il valore della proprieta' fkDettaglioVm associata alla
	 * colonna FK_DETTAGLIO_VM.
	 * @generated
	 */
	public void setFkDettaglioVm(java.math.BigDecimal val) {

		fkDettaglioVm = val;

	}

	/**
	 * Legge il valore della proprieta' fkDettaglioVm associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkDettaglioVm() {

		return fkDettaglioVm;

	}

	/**
	 * store della proprieta' associata alla colonna ALTRO_TIPOLOGIA
	 * @generated
	 */
	protected String altroTipologia;

	/**
	 * Imposta il valore della proprieta' altroTipologia associata alla
	 * colonna ALTRO_TIPOLOGIA.
	 * @generated
	 */
	public void setAltroTipologia(String val) {

		altroTipologia = val;

	}

	/**
	 * Legge il valore della proprieta' altroTipologia associata alla
	 * @generated
	 */
	public String getAltroTipologia() {

		return altroTipologia;

	}

	/**
	 * store della proprieta' associata alla colonna PORTATA_MAX_ARIA_M3H
	 * @generated
	 */
	protected java.math.BigDecimal portataMaxAriaM3h;

	/**
	 * Imposta il valore della proprieta' portataMaxAriaM3h associata alla
	 * colonna PORTATA_MAX_ARIA_M3H.
	 * @generated
	 */
	public void setPortataMaxAriaM3h(java.math.BigDecimal val) {

		portataMaxAriaM3h = val;

	}

	/**
	 * Legge il valore della proprieta' portataMaxAriaM3h associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPortataMaxAriaM3h() {

		return portataMaxAriaM3h;

	}

	/**
	 * store della proprieta' associata alla colonna RENDIMENTO_COP
	 * @generated
	 */
	protected String rendimentoCop;

	/**
	 * Imposta il valore della proprieta' rendimentoCop associata alla
	 * colonna RENDIMENTO_COP.
	 * @generated
	 */
	public void setRendimentoCop(String val) {

		rendimentoCop = val;

	}

	/**
	 * Legge il valore della proprieta' rendimentoCop associata alla
	 * @generated
	 */
	public String getRendimentoCop() {

		return rendimentoCop;

	}

	/**
	 * Crea una istanza di SigitTCompVmPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTCompVmPk
	 * @generated
	 */
	public SigitTCompVmPk createPk() {
		return new SigitTCompVmPk(codiceImpianto, idTipoComponente, progressivo, dataInstall);
	}

	/**
	 * la semantica dell'equals del DTO e' la stessa della PK
	 * (ovvero della superclasse).
	 * @param other l'oggetto con cui effettuare il confronto
	 * @return true se i due oggetti sono semanticamente da considerarsi uguali
	 */
	public boolean equals(Object other) {
		return super.equals(other);
	}

	/**
	 * la semantica dell'hashCode del DTO e' la stessa della PK
	 * (ovvero della superclasse).
	 * 
	 * @return int
	 */
	public int hashCode() {
		return super.hashCode();
	}

}
