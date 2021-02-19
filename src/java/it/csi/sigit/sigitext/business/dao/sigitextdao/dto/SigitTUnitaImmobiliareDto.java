package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTUnitaImmobiliareDao.
 * @generated
 */
public class SigitTUnitaImmobiliareDto extends SigitTUnitaImmobiliarePk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna CODICE_IMPIANTO
	 * @generated
	 */
	protected java.math.BigDecimal codiceImpianto;

	/**
	 * Imposta il valore della proprieta' codiceImpianto associata alla
	 * colonna CODICE_IMPIANTO.
	 * @generated
	 */
	public void setCodiceImpianto(java.math.BigDecimal val) {

		codiceImpianto = val;

	}

	/**
	 * Legge il valore della proprieta' codiceImpianto associata alla
	 * @generated
	 */
	public java.math.BigDecimal getCodiceImpianto() {

		return codiceImpianto;

	}

	/**
	 * store della proprieta' associata alla colonna FK_L2
	 * @generated
	 */
	protected java.math.BigDecimal fkL2;

	/**
	 * Imposta il valore della proprieta' fkL2 associata alla
	 * colonna FK_L2.
	 * @generated
	 */
	public void setFkL2(java.math.BigDecimal val) {

		fkL2 = val;

	}

	/**
	 * Legge il valore della proprieta' fkL2 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkL2() {

		return fkL2;

	}

	/**
	 * store della proprieta' associata alla colonna INDIRIZZO_SITAD
	 * @generated
	 */
	protected String indirizzoSitad;

	/**
	 * Imposta il valore della proprieta' indirizzoSitad associata alla
	 * colonna INDIRIZZO_SITAD.
	 * @generated
	 */
	public void setIndirizzoSitad(String val) {

		indirizzoSitad = val;

	}

	/**
	 * Legge il valore della proprieta' indirizzoSitad associata alla
	 * @generated
	 */
	public String getIndirizzoSitad() {

		return indirizzoSitad;

	}

	/**
	 * store della proprieta' associata alla colonna INDIRIZZO_NON_TROVATO
	 * @generated
	 */
	protected String indirizzoNonTrovato;

	/**
	 * Imposta il valore della proprieta' indirizzoNonTrovato associata alla
	 * colonna INDIRIZZO_NON_TROVATO.
	 * @generated
	 */
	public void setIndirizzoNonTrovato(String val) {

		indirizzoNonTrovato = val;

	}

	/**
	 * Legge il valore della proprieta' indirizzoNonTrovato associata alla
	 * @generated
	 */
	public String getIndirizzoNonTrovato() {

		return indirizzoNonTrovato;

	}

	/**
	 * store della proprieta' associata alla colonna CIVICO
	 * @generated
	 */
	protected String civico;

	/**
	 * Imposta il valore della proprieta' civico associata alla
	 * colonna CIVICO.
	 * @generated
	 */
	public void setCivico(String val) {

		civico = val;

	}

	/**
	 * Legge il valore della proprieta' civico associata alla
	 * @generated
	 */
	public String getCivico() {

		return civico;

	}

	/**
	 * store della proprieta' associata alla colonna CAP
	 * @generated
	 */
	protected String cap;

	/**
	 * Imposta il valore della proprieta' cap associata alla
	 * colonna CAP.
	 * @generated
	 */
	public void setCap(String val) {

		cap = val;

	}

	/**
	 * Legge il valore della proprieta' cap associata alla
	 * @generated
	 */
	public String getCap() {

		return cap;

	}

	/**
	 * store della proprieta' associata alla colonna SCALA
	 * @generated
	 */
	protected String scala;

	/**
	 * Imposta il valore della proprieta' scala associata alla
	 * colonna SCALA.
	 * @generated
	 */
	public void setScala(String val) {

		scala = val;

	}

	/**
	 * Legge il valore della proprieta' scala associata alla
	 * @generated
	 */
	public String getScala() {

		return scala;

	}

	/**
	 * store della proprieta' associata alla colonna PALAZZO
	 * @generated
	 */
	protected String palazzo;

	/**
	 * Imposta il valore della proprieta' palazzo associata alla
	 * colonna PALAZZO.
	 * @generated
	 */
	public void setPalazzo(String val) {

		palazzo = val;

	}

	/**
	 * Legge il valore della proprieta' palazzo associata alla
	 * @generated
	 */
	public String getPalazzo() {

		return palazzo;

	}

	/**
	 * store della proprieta' associata alla colonna INTERNO
	 * @generated
	 */
	protected String interno;

	/**
	 * Imposta il valore della proprieta' interno associata alla
	 * colonna INTERNO.
	 * @generated
	 */
	public void setInterno(String val) {

		interno = val;

	}

	/**
	 * Legge il valore della proprieta' interno associata alla
	 * @generated
	 */
	public String getInterno() {

		return interno;

	}

	/**
	 * store della proprieta' associata alla colonna NOTE
	 * @generated
	 */
	protected String note;

	/**
	 * Imposta il valore della proprieta' note associata alla
	 * colonna NOTE.
	 * @generated
	 */
	public void setNote(String val) {

		note = val;

	}

	/**
	 * Legge il valore della proprieta' note associata alla
	 * @generated
	 */
	public String getNote() {

		return note;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_PRINCIPALE
	 * @generated
	 */
	protected java.math.BigDecimal flgPrincipale;

	/**
	 * Imposta il valore della proprieta' flgPrincipale associata alla
	 * colonna FLG_PRINCIPALE.
	 * @generated
	 */
	public void setFlgPrincipale(java.math.BigDecimal val) {

		flgPrincipale = val;

	}

	/**
	 * Legge il valore della proprieta' flgPrincipale associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgPrincipale() {

		return flgPrincipale;

	}

	/**
	 * store della proprieta' associata alla colonna SEZIONE
	 * @generated
	 */
	protected String sezione;

	/**
	 * Imposta il valore della proprieta' sezione associata alla
	 * colonna SEZIONE.
	 * @generated
	 */
	public void setSezione(String val) {

		sezione = val;

	}

	/**
	 * Legge il valore della proprieta' sezione associata alla
	 * @generated
	 */
	public String getSezione() {

		return sezione;

	}

	/**
	 * store della proprieta' associata alla colonna FOGLIO
	 * @generated
	 */
	protected String foglio;

	/**
	 * Imposta il valore della proprieta' foglio associata alla
	 * colonna FOGLIO.
	 * @generated
	 */
	public void setFoglio(String val) {

		foglio = val;

	}

	/**
	 * Legge il valore della proprieta' foglio associata alla
	 * @generated
	 */
	public String getFoglio() {

		return foglio;

	}

	/**
	 * store della proprieta' associata alla colonna PARTICELLA
	 * @generated
	 */
	protected String particella;

	/**
	 * Imposta il valore della proprieta' particella associata alla
	 * colonna PARTICELLA.
	 * @generated
	 */
	public void setParticella(String val) {

		particella = val;

	}

	/**
	 * Legge il valore della proprieta' particella associata alla
	 * @generated
	 */
	public String getParticella() {

		return particella;

	}

	/**
	 * store della proprieta' associata alla colonna SUBALTERNO
	 * @generated
	 */
	protected String subalterno;

	/**
	 * Imposta il valore della proprieta' subalterno associata alla
	 * colonna SUBALTERNO.
	 * @generated
	 */
	public void setSubalterno(String val) {

		subalterno = val;

	}

	/**
	 * Legge il valore della proprieta' subalterno associata alla
	 * @generated
	 */
	public String getSubalterno() {

		return subalterno;

	}

	/**
	 * store della proprieta' associata alla colonna POD_ELETTRICO
	 * @generated
	 */
	protected String podElettrico;

	/**
	 * Imposta il valore della proprieta' podElettrico associata alla
	 * colonna POD_ELETTRICO.
	 * @generated
	 */
	public void setPodElettrico(String val) {

		podElettrico = val;

	}

	/**
	 * Legge il valore della proprieta' podElettrico associata alla
	 * @generated
	 */
	public String getPodElettrico() {

		return podElettrico;

	}

	/**
	 * store della proprieta' associata alla colonna PDR_GAS
	 * @generated
	 */
	protected String pdrGas;

	/**
	 * Imposta il valore della proprieta' pdrGas associata alla
	 * colonna PDR_GAS.
	 * @generated
	 */
	public void setPdrGas(String val) {

		pdrGas = val;

	}

	/**
	 * Legge il valore della proprieta' pdrGas associata alla
	 * @generated
	 */
	public String getPdrGas() {

		return pdrGas;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_ULT_MOD
	 * @generated
	 */
	protected java.sql.Timestamp dataUltMod;

	/**
	 * Imposta il valore della proprieta' dataUltMod associata alla
	 * colonna DATA_ULT_MOD.
	 * @generated
	 */
	public void setDataUltMod(java.sql.Timestamp val) {

		if (val != null) {
			dataUltMod = new java.sql.Timestamp(val.getTime());
		} else {
			dataUltMod = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataUltMod associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDataUltMod() {

		if (dataUltMod != null) {
			return new java.sql.Timestamp(dataUltMod.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna UTENTE_ULT_MOD
	 * @generated
	 */
	protected String utenteUltMod;

	/**
	 * Imposta il valore della proprieta' utenteUltMod associata alla
	 * colonna UTENTE_ULT_MOD.
	 * @generated
	 */
	public void setUtenteUltMod(String val) {

		utenteUltMod = val;

	}

	/**
	 * Legge il valore della proprieta' utenteUltMod associata alla
	 * @generated
	 */
	public String getUtenteUltMod() {

		return utenteUltMod;

	}

	/**
	 * store della proprieta' associata alla colonna L1_2_FLG_SINGOLA_UNITA
	 * @generated
	 */
	protected java.math.BigDecimal l12FlgSingolaUnita;

	/**
	 * Imposta il valore della proprieta' l12FlgSingolaUnita associata alla
	 * colonna L1_2_FLG_SINGOLA_UNITA.
	 * @generated
	 */
	public void setL12FlgSingolaUnita(java.math.BigDecimal val) {

		l12FlgSingolaUnita = val;

	}

	/**
	 * Legge il valore della proprieta' l12FlgSingolaUnita associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL12FlgSingolaUnita() {

		return l12FlgSingolaUnita;

	}

	/**
	 * store della proprieta' associata alla colonna L1_2_FK_CATEGORIA
	 * @generated
	 */
	protected String l12FkCategoria;

	/**
	 * Imposta il valore della proprieta' l12FkCategoria associata alla
	 * colonna L1_2_FK_CATEGORIA.
	 * @generated
	 */
	public void setL12FkCategoria(String val) {

		l12FkCategoria = val;

	}

	/**
	 * Legge il valore della proprieta' l12FkCategoria associata alla
	 * @generated
	 */
	public String getL12FkCategoria() {

		return l12FkCategoria;

	}

	/**
	 * store della proprieta' associata alla colonna L1_2_VOL_RISC_M3
	 * @generated
	 */
	protected java.math.BigDecimal l12VolRiscM3;

	/**
	 * Imposta il valore della proprieta' l12VolRiscM3 associata alla
	 * colonna L1_2_VOL_RISC_M3.
	 * @generated
	 */
	public void setL12VolRiscM3(java.math.BigDecimal val) {

		l12VolRiscM3 = val;

	}

	/**
	 * Legge il valore della proprieta' l12VolRiscM3 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL12VolRiscM3() {

		return l12VolRiscM3;

	}

	/**
	 * store della proprieta' associata alla colonna L1_2_VOL_RAFF_M3
	 * @generated
	 */
	protected java.math.BigDecimal l12VolRaffM3;

	/**
	 * Imposta il valore della proprieta' l12VolRaffM3 associata alla
	 * colonna L1_2_VOL_RAFF_M3.
	 * @generated
	 */
	public void setL12VolRaffM3(java.math.BigDecimal val) {

		l12VolRaffM3 = val;

	}

	/**
	 * Legge il valore della proprieta' l12VolRaffM3 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getL12VolRaffM3() {

		return l12VolRaffM3;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_NOPDR
	 * @generated
	 */
	protected java.math.BigDecimal flgNopdr;

	/**
	 * Imposta il valore della proprieta' flgNopdr associata alla
	 * colonna FLG_NOPDR.
	 * @generated
	 */
	public void setFlgNopdr(java.math.BigDecimal val) {

		flgNopdr = val;

	}

	/**
	 * Legge il valore della proprieta' flgNopdr associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgNopdr() {

		return flgNopdr;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_NOACCATASTATO
	 * @generated
	 */
	protected java.math.BigDecimal flgNoaccatastato;

	/**
	 * Imposta il valore della proprieta' flgNoaccatastato associata alla
	 * colonna FLG_NOACCATASTATO.
	 * @generated
	 */
	public void setFlgNoaccatastato(java.math.BigDecimal val) {

		flgNoaccatastato = val;

	}

	/**
	 * Legge il valore della proprieta' flgNoaccatastato associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgNoaccatastato() {

		return flgNoaccatastato;

	}

	/**
	 * Crea una istanza di SigitTUnitaImmobiliarePk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTUnitaImmobiliarePk
	 * @generated
	 */
	public SigitTUnitaImmobiliarePk createPk() {
		return new SigitTUnitaImmobiliarePk(idUnitaImm);
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
