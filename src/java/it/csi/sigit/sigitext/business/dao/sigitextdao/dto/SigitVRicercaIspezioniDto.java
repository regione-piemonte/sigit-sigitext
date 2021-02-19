package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitVRicercaIspezioniDao.
 * @generated
 */
public class SigitVRicercaIspezioniDto implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_ISPEZIONE_2018
	 * @generated
	 */
	protected java.math.BigDecimal idIspezione2018;

	/**
	 * Imposta il valore della proprieta' idIspezione2018 associata alla
	 * colonna ID_ISPEZIONE_2018.
	 * @generated
	 */
	public void setIdIspezione2018(java.math.BigDecimal val) {

		idIspezione2018 = val;

	}

	/**
	 * Legge il valore della proprieta' idIspezione2018 associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdIspezione2018() {

		return idIspezione2018;

	}

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
	 * store della proprieta' associata alla colonna ID_ISPEZ_ISPET
	 * @generated
	 */
	protected java.math.BigDecimal idIspezIspet;

	/**
	 * Imposta il valore della proprieta' idIspezIspet associata alla
	 * colonna ID_ISPEZ_ISPET.
	 * @generated
	 */
	public void setIdIspezIspet(java.math.BigDecimal val) {

		idIspezIspet = val;

	}

	/**
	 * Legge il valore della proprieta' idIspezIspet associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdIspezIspet() {

		return idIspezIspet;

	}

	/**
	 * store della proprieta' associata alla colonna FK_STATO_ISPEZIONE
	 * @generated
	 */
	protected java.math.BigDecimal fkStatoIspezione;

	/**
	 * Imposta il valore della proprieta' fkStatoIspezione associata alla
	 * colonna FK_STATO_ISPEZIONE.
	 * @generated
	 */
	public void setFkStatoIspezione(java.math.BigDecimal val) {

		fkStatoIspezione = val;

	}

	/**
	 * Legge il valore della proprieta' fkStatoIspezione associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkStatoIspezione() {

		return fkStatoIspezione;

	}

	/**
	 * store della proprieta' associata alla colonna DES_STATO_ISPEZIONE
	 * @generated
	 */
	protected String desStatoIspezione;

	/**
	 * Imposta il valore della proprieta' desStatoIspezione associata alla
	 * colonna DES_STATO_ISPEZIONE.
	 * @generated
	 */
	public void setDesStatoIspezione(String val) {

		desStatoIspezione = val;

	}

	/**
	 * Legge il valore della proprieta' desStatoIspezione associata alla
	 * @generated
	 */
	public String getDesStatoIspezione() {

		return desStatoIspezione;

	}

	/**
	 * store della proprieta' associata alla colonna ENTE_COMPETENTE
	 * @generated
	 */
	protected String enteCompetente;

	/**
	 * Imposta il valore della proprieta' enteCompetente associata alla
	 * colonna ENTE_COMPETENTE.
	 * @generated
	 */
	public void setEnteCompetente(String val) {

		enteCompetente = val;

	}

	/**
	 * Legge il valore della proprieta' enteCompetente associata alla
	 * @generated
	 */
	public String getEnteCompetente() {

		return enteCompetente;

	}

	/**
	 * store della proprieta' associata alla colonna DT_CREAZIONE
	 * @generated
	 */
	protected java.sql.Timestamp dtCreazione;

	/**
	 * Imposta il valore della proprieta' dtCreazione associata alla
	 * colonna DT_CREAZIONE.
	 * @generated
	 */
	public void setDtCreazione(java.sql.Timestamp val) {

		if (val != null) {
			dtCreazione = new java.sql.Timestamp(val.getTime());
		} else {
			dtCreazione = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dtCreazione associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDtCreazione() {

		if (dtCreazione != null) {
			return new java.sql.Timestamp(dtCreazione.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna DT_CONCLUSIONE
	 * @generated
	 */
	protected java.sql.Timestamp dtConclusione;

	/**
	 * Imposta il valore della proprieta' dtConclusione associata alla
	 * colonna DT_CONCLUSIONE.
	 * @generated
	 */
	public void setDtConclusione(java.sql.Timestamp val) {

		if (val != null) {
			dtConclusione = new java.sql.Timestamp(val.getTime());
		} else {
			dtConclusione = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dtConclusione associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDtConclusione() {

		if (dtConclusione != null) {
			return new java.sql.Timestamp(dtConclusione.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna FLG_ESITO
	 * @generated
	 */
	protected java.math.BigDecimal flgEsito;

	/**
	 * Imposta il valore della proprieta' flgEsito associata alla
	 * colonna FLG_ESITO.
	 * @generated
	 */
	public void setFlgEsito(java.math.BigDecimal val) {

		flgEsito = val;

	}

	/**
	 * Legge il valore della proprieta' flgEsito associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgEsito() {

		return flgEsito;

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
	 * store della proprieta' associata alla colonna ID_ALLEGATO
	 * @generated
	 */
	protected java.math.BigDecimal idAllegato;

	/**
	 * Imposta il valore della proprieta' idAllegato associata alla
	 * colonna ID_ALLEGATO.
	 * @generated
	 */
	public void setIdAllegato(java.math.BigDecimal val) {

		idAllegato = val;

	}

	/**
	 * Legge il valore della proprieta' idAllegato associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdAllegato() {

		return idAllegato;

	}

	/**
	 * store della proprieta' associata alla colonna FK_STATO_RAPP
	 * @generated
	 */
	protected java.math.BigDecimal fkStatoRapp;

	/**
	 * Imposta il valore della proprieta' fkStatoRapp associata alla
	 * colonna FK_STATO_RAPP.
	 * @generated
	 */
	public void setFkStatoRapp(java.math.BigDecimal val) {

		fkStatoRapp = val;

	}

	/**
	 * Legge il valore della proprieta' fkStatoRapp associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkStatoRapp() {

		return fkStatoRapp;

	}

	/**
	 * store della proprieta' associata alla colonna DES_STATO_RAPP
	 * @generated
	 */
	protected String desStatoRapp;

	/**
	 * Imposta il valore della proprieta' desStatoRapp associata alla
	 * colonna DES_STATO_RAPP.
	 * @generated
	 */
	public void setDesStatoRapp(String val) {

		desStatoRapp = val;

	}

	/**
	 * Legge il valore della proprieta' desStatoRapp associata alla
	 * @generated
	 */
	public String getDesStatoRapp() {

		return desStatoRapp;

	}

	/**
	 * store della proprieta' associata alla colonna FK_TIPO_DOCUMENTO
	 * @generated
	 */
	protected java.math.BigDecimal fkTipoDocumento;

	/**
	 * Imposta il valore della proprieta' fkTipoDocumento associata alla
	 * colonna FK_TIPO_DOCUMENTO.
	 * @generated
	 */
	public void setFkTipoDocumento(java.math.BigDecimal val) {

		fkTipoDocumento = val;

	}

	/**
	 * Legge il valore della proprieta' fkTipoDocumento associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkTipoDocumento() {

		return fkTipoDocumento;

	}

	/**
	 * store della proprieta' associata alla colonna DES_TIPO_DOCUMENTO
	 * @generated
	 */
	protected String desTipoDocumento;

	/**
	 * Imposta il valore della proprieta' desTipoDocumento associata alla
	 * colonna DES_TIPO_DOCUMENTO.
	 * @generated
	 */
	public void setDesTipoDocumento(String val) {

		desTipoDocumento = val;

	}

	/**
	 * Legge il valore della proprieta' desTipoDocumento associata alla
	 * @generated
	 */
	public String getDesTipoDocumento() {

		return desTipoDocumento;

	}

	/**
	 * store della proprieta' associata alla colonna FK_SIGLA_BOLLINO
	 * @generated
	 */
	protected String fkSiglaBollino;

	/**
	 * Imposta il valore della proprieta' fkSiglaBollino associata alla
	 * colonna FK_SIGLA_BOLLINO.
	 * @generated
	 */
	public void setFkSiglaBollino(String val) {

		fkSiglaBollino = val;

	}

	/**
	 * Legge il valore della proprieta' fkSiglaBollino associata alla
	 * @generated
	 */
	public String getFkSiglaBollino() {

		return fkSiglaBollino;

	}

	/**
	 * store della proprieta' associata alla colonna FK_NUMERO_BOLLINO
	 * @generated
	 */
	protected java.math.BigDecimal fkNumeroBollino;

	/**
	 * Imposta il valore della proprieta' fkNumeroBollino associata alla
	 * colonna FK_NUMERO_BOLLINO.
	 * @generated
	 */
	public void setFkNumeroBollino(java.math.BigDecimal val) {

		fkNumeroBollino = val;

	}

	/**
	 * Legge il valore della proprieta' fkNumeroBollino associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkNumeroBollino() {

		return fkNumeroBollino;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_CONTROLLO
	 * @generated
	 */
	protected java.sql.Date dataControllo;

	/**
	 * Imposta il valore della proprieta' dataControllo associata alla
	 * colonna DATA_CONTROLLO.
	 * @generated
	 */
	public void setDataControllo(java.sql.Date val) {

		if (val != null) {
			dataControllo = new java.sql.Date(val.getTime());
		} else {
			dataControllo = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataControllo associata alla
	 * @generated
	 */
	public java.sql.Date getDataControllo() {

		if (dataControllo != null) {
			return new java.sql.Date(dataControllo.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna B_FLG_LIBRETTO_USO
	 * @generated
	 */
	protected java.math.BigDecimal bFlgLibrettoUso;

	/**
	 * Imposta il valore della proprieta' bFlgLibrettoUso associata alla
	 * colonna B_FLG_LIBRETTO_USO.
	 * @generated
	 */
	public void setBFlgLibrettoUso(java.math.BigDecimal val) {

		bFlgLibrettoUso = val;

	}

	/**
	 * Legge il valore della proprieta' bFlgLibrettoUso associata alla
	 * @generated
	 */
	public java.math.BigDecimal getBFlgLibrettoUso() {

		return bFlgLibrettoUso;

	}

	/**
	 * store della proprieta' associata alla colonna B_FLG_DICHIAR_CONFORM
	 * @generated
	 */
	protected java.math.BigDecimal bFlgDichiarConform;

	/**
	 * Imposta il valore della proprieta' bFlgDichiarConform associata alla
	 * colonna B_FLG_DICHIAR_CONFORM.
	 * @generated
	 */
	public void setBFlgDichiarConform(java.math.BigDecimal val) {

		bFlgDichiarConform = val;

	}

	/**
	 * Legge il valore della proprieta' bFlgDichiarConform associata alla
	 * @generated
	 */
	public java.math.BigDecimal getBFlgDichiarConform() {

		return bFlgDichiarConform;

	}

	/**
	 * store della proprieta' associata alla colonna B_FLG_LIB_IMP
	 * @generated
	 */
	protected java.math.BigDecimal bFlgLibImp;

	/**
	 * Imposta il valore della proprieta' bFlgLibImp associata alla
	 * colonna B_FLG_LIB_IMP.
	 * @generated
	 */
	public void setBFlgLibImp(java.math.BigDecimal val) {

		bFlgLibImp = val;

	}

	/**
	 * Legge il valore della proprieta' bFlgLibImp associata alla
	 * @generated
	 */
	public java.math.BigDecimal getBFlgLibImp() {

		return bFlgLibImp;

	}

	/**
	 * store della proprieta' associata alla colonna B_FLG_LIB_COMPL
	 * @generated
	 */
	protected java.math.BigDecimal bFlgLibCompl;

	/**
	 * Imposta il valore della proprieta' bFlgLibCompl associata alla
	 * colonna B_FLG_LIB_COMPL.
	 * @generated
	 */
	public void setBFlgLibCompl(java.math.BigDecimal val) {

		bFlgLibCompl = val;

	}

	/**
	 * Legge il valore della proprieta' bFlgLibCompl associata alla
	 * @generated
	 */
	public java.math.BigDecimal getBFlgLibCompl() {

		return bFlgLibCompl;

	}

	/**
	 * store della proprieta' associata alla colonna F_OSSERVAZIONI
	 * @generated
	 */
	protected String fOsservazioni;

	/**
	 * Imposta il valore della proprieta' fOsservazioni associata alla
	 * colonna F_OSSERVAZIONI.
	 * @generated
	 */
	public void setFOsservazioni(String val) {

		fOsservazioni = val;

	}

	/**
	 * Legge il valore della proprieta' fOsservazioni associata alla
	 * @generated
	 */
	public String getFOsservazioni() {

		return fOsservazioni;

	}

	/**
	 * store della proprieta' associata alla colonna F_RACCOMANDAZIONI
	 * @generated
	 */
	protected String fRaccomandazioni;

	/**
	 * Imposta il valore della proprieta' fRaccomandazioni associata alla
	 * colonna F_RACCOMANDAZIONI.
	 * @generated
	 */
	public void setFRaccomandazioni(String val) {

		fRaccomandazioni = val;

	}

	/**
	 * Legge il valore della proprieta' fRaccomandazioni associata alla
	 * @generated
	 */
	public String getFRaccomandazioni() {

		return fRaccomandazioni;

	}

	/**
	 * store della proprieta' associata alla colonna F_PRESCRIZIONI
	 * @generated
	 */
	protected String fPrescrizioni;

	/**
	 * Imposta il valore della proprieta' fPrescrizioni associata alla
	 * colonna F_PRESCRIZIONI.
	 * @generated
	 */
	public void setFPrescrizioni(String val) {

		fPrescrizioni = val;

	}

	/**
	 * Legge il valore della proprieta' fPrescrizioni associata alla
	 * @generated
	 */
	public String getFPrescrizioni() {

		return fPrescrizioni;

	}

	/**
	 * store della proprieta' associata alla colonna F_FLG_PUO_FUNZIONARE
	 * @generated
	 */
	protected java.math.BigDecimal fFlgPuoFunzionare;

	/**
	 * Imposta il valore della proprieta' fFlgPuoFunzionare associata alla
	 * colonna F_FLG_PUO_FUNZIONARE.
	 * @generated
	 */
	public void setFFlgPuoFunzionare(java.math.BigDecimal val) {

		fFlgPuoFunzionare = val;

	}

	/**
	 * Legge il valore della proprieta' fFlgPuoFunzionare associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFFlgPuoFunzionare() {

		return fFlgPuoFunzionare;

	}

	/**
	 * store della proprieta' associata alla colonna F_INTERVENTO_ENTRO
	 * @generated
	 */
	protected java.sql.Date fInterventoEntro;

	/**
	 * Imposta il valore della proprieta' fInterventoEntro associata alla
	 * colonna F_INTERVENTO_ENTRO.
	 * @generated
	 */
	public void setFInterventoEntro(java.sql.Date val) {

		if (val != null) {
			fInterventoEntro = new java.sql.Date(val.getTime());
		} else {
			fInterventoEntro = null;
		}

	}

	/**
	 * Legge il valore della proprieta' fInterventoEntro associata alla
	 * @generated
	 */
	public java.sql.Date getFInterventoEntro() {

		if (fInterventoEntro != null) {
			return new java.sql.Date(fInterventoEntro.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna F_ORA_ARRIVO
	 * @generated
	 */
	protected String fOraArrivo;

	/**
	 * Imposta il valore della proprieta' fOraArrivo associata alla
	 * colonna F_ORA_ARRIVO.
	 * @generated
	 */
	public void setFOraArrivo(String val) {

		fOraArrivo = val;

	}

	/**
	 * Legge il valore della proprieta' fOraArrivo associata alla
	 * @generated
	 */
	public String getFOraArrivo() {

		return fOraArrivo;

	}

	/**
	 * store della proprieta' associata alla colonna F_ORA_PARTENZA
	 * @generated
	 */
	protected String fOraPartenza;

	/**
	 * Imposta il valore della proprieta' fOraPartenza associata alla
	 * colonna F_ORA_PARTENZA.
	 * @generated
	 */
	public void setFOraPartenza(String val) {

		fOraPartenza = val;

	}

	/**
	 * Legge il valore della proprieta' fOraPartenza associata alla
	 * @generated
	 */
	public String getFOraPartenza() {

		return fOraPartenza;

	}

	/**
	 * store della proprieta' associata alla colonna F_DENOMINAZ_TECNICO
	 * @generated
	 */
	protected String fDenominazTecnico;

	/**
	 * Imposta il valore della proprieta' fDenominazTecnico associata alla
	 * colonna F_DENOMINAZ_TECNICO.
	 * @generated
	 */
	public void setFDenominazTecnico(String val) {

		fDenominazTecnico = val;

	}

	/**
	 * Legge il valore della proprieta' fDenominazTecnico associata alla
	 * @generated
	 */
	public String getFDenominazTecnico() {

		return fDenominazTecnico;

	}

	/**
	 * store della proprieta' associata alla colonna F_FLG_FIRMA_TECNICO
	 * @generated
	 */
	protected java.math.BigDecimal fFlgFirmaTecnico;

	/**
	 * Imposta il valore della proprieta' fFlgFirmaTecnico associata alla
	 * colonna F_FLG_FIRMA_TECNICO.
	 * @generated
	 */
	public void setFFlgFirmaTecnico(java.math.BigDecimal val) {

		fFlgFirmaTecnico = val;

	}

	/**
	 * Legge il valore della proprieta' fFlgFirmaTecnico associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFFlgFirmaTecnico() {

		return fFlgFirmaTecnico;

	}

	/**
	 * store della proprieta' associata alla colonna F_FLG_FIRMA_RESPONSABILE
	 * @generated
	 */
	protected java.math.BigDecimal fFlgFirmaResponsabile;

	/**
	 * Imposta il valore della proprieta' fFlgFirmaResponsabile associata alla
	 * colonna F_FLG_FIRMA_RESPONSABILE.
	 * @generated
	 */
	public void setFFlgFirmaResponsabile(java.math.BigDecimal val) {

		fFlgFirmaResponsabile = val;

	}

	/**
	 * Legge il valore della proprieta' fFlgFirmaResponsabile associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFFlgFirmaResponsabile() {

		return fFlgFirmaResponsabile;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_INVIO
	 * @generated
	 */
	protected java.sql.Date dataInvio;

	/**
	 * Imposta il valore della proprieta' dataInvio associata alla
	 * colonna DATA_INVIO.
	 * @generated
	 */
	public void setDataInvio(java.sql.Date val) {

		if (val != null) {
			dataInvio = new java.sql.Date(val.getTime());
		} else {
			dataInvio = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataInvio associata alla
	 * @generated
	 */
	public java.sql.Date getDataInvio() {

		if (dataInvio != null) {
			return new java.sql.Date(dataInvio.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna NOME_ALLEGATO
	 * @generated
	 */
	protected String nomeAllegato;

	/**
	 * Imposta il valore della proprieta' nomeAllegato associata alla
	 * colonna NOME_ALLEGATO.
	 * @generated
	 */
	public void setNomeAllegato(String val) {

		nomeAllegato = val;

	}

	/**
	 * Legge il valore della proprieta' nomeAllegato associata alla
	 * @generated
	 */
	public String getNomeAllegato() {

		return nomeAllegato;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_ULT_MOD_ALLEGATO
	 * @generated
	 */
	protected java.sql.Timestamp dataUltModAllegato;

	/**
	 * Imposta il valore della proprieta' dataUltModAllegato associata alla
	 * colonna DATA_ULT_MOD_ALLEGATO.
	 * @generated
	 */
	public void setDataUltModAllegato(java.sql.Timestamp val) {

		if (val != null) {
			dataUltModAllegato = new java.sql.Timestamp(val.getTime());
		} else {
			dataUltModAllegato = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataUltModAllegato associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDataUltModAllegato() {

		if (dataUltModAllegato != null) {
			return new java.sql.Timestamp(dataUltModAllegato.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna UTENTE_ULT_MOD_ALLEGATO
	 * @generated
	 */
	protected String utenteUltModAllegato;

	/**
	 * Imposta il valore della proprieta' utenteUltModAllegato associata alla
	 * colonna UTENTE_ULT_MOD_ALLEGATO.
	 * @generated
	 */
	public void setUtenteUltModAllegato(String val) {

		utenteUltModAllegato = val;

	}

	/**
	 * Legge il valore della proprieta' utenteUltModAllegato associata alla
	 * @generated
	 */
	public String getUtenteUltModAllegato() {

		return utenteUltModAllegato;

	}

	/**
	 * store della proprieta' associata alla colonna CF_REDATTORE
	 * @generated
	 */
	protected String cfRedattore;

	/**
	 * Imposta il valore della proprieta' cfRedattore associata alla
	 * colonna CF_REDATTORE.
	 * @generated
	 */
	public void setCfRedattore(String val) {

		cfRedattore = val;

	}

	/**
	 * Legge il valore della proprieta' cfRedattore associata alla
	 * @generated
	 */
	public String getCfRedattore() {

		return cfRedattore;

	}

	/**
	 * store della proprieta' associata alla colonna UID_INDEX
	 * @generated
	 */
	protected String uidIndex;

	/**
	 * Imposta il valore della proprieta' uidIndex associata alla
	 * colonna UID_INDEX.
	 * @generated
	 */
	public void setUidIndex(String val) {

		uidIndex = val;

	}

	/**
	 * Legge il valore della proprieta' uidIndex associata alla
	 * @generated
	 */
	public String getUidIndex() {

		return uidIndex;

	}

	/**
	 * store della proprieta' associata alla colonna F_FIRMA_TECNICO
	 * @generated
	 */
	protected String fFirmaTecnico;

	/**
	 * Imposta il valore della proprieta' fFirmaTecnico associata alla
	 * colonna F_FIRMA_TECNICO.
	 * @generated
	 */
	public void setFFirmaTecnico(String val) {

		fFirmaTecnico = val;

	}

	/**
	 * Legge il valore della proprieta' fFirmaTecnico associata alla
	 * @generated
	 */
	public String getFFirmaTecnico() {

		return fFirmaTecnico;

	}

	/**
	 * store della proprieta' associata alla colonna F_FIRMA_RESPONSABILE
	 * @generated
	 */
	protected String fFirmaResponsabile;

	/**
	 * Imposta il valore della proprieta' fFirmaResponsabile associata alla
	 * colonna F_FIRMA_RESPONSABILE.
	 * @generated
	 */
	public void setFFirmaResponsabile(String val) {

		fFirmaResponsabile = val;

	}

	/**
	 * Legge il valore della proprieta' fFirmaResponsabile associata alla
	 * @generated
	 */
	public String getFFirmaResponsabile() {

		return fFirmaResponsabile;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_CONTROLLO_BOZZA
	 * @generated
	 */
	protected java.math.BigDecimal flgControlloBozza;

	/**
	 * Imposta il valore della proprieta' flgControlloBozza associata alla
	 * colonna FLG_CONTROLLO_BOZZA.
	 * @generated
	 */
	public void setFlgControlloBozza(java.math.BigDecimal val) {

		flgControlloBozza = val;

	}

	/**
	 * Legge il valore della proprieta' flgControlloBozza associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgControlloBozza() {

		return flgControlloBozza;

	}

	/**
	 * store della proprieta' associata alla colonna A_POTENZA_TERMICA_NOMINALE_MAX
	 * @generated
	 */
	protected java.math.BigDecimal aPotenzaTermicaNominaleMax;

	/**
	 * Imposta il valore della proprieta' aPotenzaTermicaNominaleMax associata alla
	 * colonna A_POTENZA_TERMICA_NOMINALE_MAX.
	 * @generated
	 */
	public void setAPotenzaTermicaNominaleMax(java.math.BigDecimal val) {

		aPotenzaTermicaNominaleMax = val;

	}

	/**
	 * Legge il valore della proprieta' aPotenzaTermicaNominaleMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getAPotenzaTermicaNominaleMax() {

		return aPotenzaTermicaNominaleMax;

	}

	/**
	 * store della proprieta' associata alla colonna ELENCO_COMBUSTIBILI
	 * @generated
	 */
	protected String elencoCombustibili;

	/**
	 * Imposta il valore della proprieta' elencoCombustibili associata alla
	 * colonna ELENCO_COMBUSTIBILI.
	 * @generated
	 */
	public void setElencoCombustibili(String val) {

		elencoCombustibili = val;

	}

	/**
	 * Legge il valore della proprieta' elencoCombustibili associata alla
	 * @generated
	 */
	public String getElencoCombustibili() {

		return elencoCombustibili;

	}

	/**
	 * store della proprieta' associata alla colonna ELENCO_APPARECCHIATURE
	 * @generated
	 */
	protected String elencoApparecchiature;

	/**
	 * Imposta il valore della proprieta' elencoApparecchiature associata alla
	 * colonna ELENCO_APPARECCHIATURE.
	 * @generated
	 */
	public void setElencoApparecchiature(String val) {

		elencoApparecchiature = val;

	}

	/**
	 * Legge il valore della proprieta' elencoApparecchiature associata alla
	 * @generated
	 */
	public String getElencoApparecchiature() {

		return elencoApparecchiature;

	}

	/**
	 * store della proprieta' associata alla colonna ID_PERSONA_FISICA
	 * @generated
	 */
	protected java.math.BigDecimal idPersonaFisica;

	/**
	 * Imposta il valore della proprieta' idPersonaFisica associata alla
	 * colonna ID_PERSONA_FISICA.
	 * @generated
	 */
	public void setIdPersonaFisica(java.math.BigDecimal val) {

		idPersonaFisica = val;

	}

	/**
	 * Legge il valore della proprieta' idPersonaFisica associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdPersonaFisica() {

		return idPersonaFisica;

	}

	/**
	 * store della proprieta' associata alla colonna NOME
	 * @generated
	 */
	protected String nome;

	/**
	 * Imposta il valore della proprieta' nome associata alla
	 * colonna NOME.
	 * @generated
	 */
	public void setNome(String val) {

		nome = val;

	}

	/**
	 * Legge il valore della proprieta' nome associata alla
	 * @generated
	 */
	public String getNome() {

		return nome;

	}

	/**
	 * store della proprieta' associata alla colonna COGNOME
	 * @generated
	 */
	protected String cognome;

	/**
	 * Imposta il valore della proprieta' cognome associata alla
	 * colonna COGNOME.
	 * @generated
	 */
	public void setCognome(String val) {

		cognome = val;

	}

	/**
	 * Legge il valore della proprieta' cognome associata alla
	 * @generated
	 */
	public String getCognome() {

		return cognome;

	}

	/**
	 * store della proprieta' associata alla colonna CODICE_FISCALE
	 * @generated
	 */
	protected String codiceFiscale;

	/**
	 * Imposta il valore della proprieta' codiceFiscale associata alla
	 * colonna CODICE_FISCALE.
	 * @generated
	 */
	public void setCodiceFiscale(String val) {

		codiceFiscale = val;

	}

	/**
	 * Legge il valore della proprieta' codiceFiscale associata alla
	 * @generated
	 */
	public String getCodiceFiscale() {

		return codiceFiscale;

	}

	/**
	 * store della proprieta' associata alla colonna ISTAT_PROV_COMPETENZA
	 * @generated
	 */
	protected String istatProvCompetenza;

	/**
	 * Imposta il valore della proprieta' istatProvCompetenza associata alla
	 * colonna ISTAT_PROV_COMPETENZA.
	 * @generated
	 */
	public void setIstatProvCompetenza(String val) {

		istatProvCompetenza = val;

	}

	/**
	 * Legge il valore della proprieta' istatProvCompetenza associata alla
	 * @generated
	 */
	public String getIstatProvCompetenza() {

		return istatProvCompetenza;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_ACC_SOSTITUTIVO
	 * @generated
	 */
	protected java.math.BigDecimal flgAccSostitutivo;

	/**
	 * Imposta il valore della proprieta' flgAccSostitutivo associata alla
	 * colonna FLG_ACC_SOSTITUTIVO.
	 * @generated
	 */
	public void setFlgAccSostitutivo(java.math.BigDecimal val) {

		flgAccSostitutivo = val;

	}

	/**
	 * Legge il valore della proprieta' flgAccSostitutivo associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgAccSostitutivo() {

		return flgAccSostitutivo;

	}

	/**
	 * store della proprieta' associata alla colonna CF_ISPETTORE_SECONDARIO
	 * @generated
	 */
	protected String cfIspettoreSecondario;

	/**
	 * Imposta il valore della proprieta' cfIspettoreSecondario associata alla
	 * colonna CF_ISPETTORE_SECONDARIO.
	 * @generated
	 */
	public void setCfIspettoreSecondario(String val) {

		cfIspettoreSecondario = val;

	}

	/**
	 * Legge il valore della proprieta' cfIspettoreSecondario associata alla
	 * @generated
	 */
	public String getCfIspettoreSecondario() {

		return cfIspettoreSecondario;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_ISP_PAGAMENTO
	 * @generated
	 */
	protected java.math.BigDecimal flgIspPagamento;

	/**
	 * Imposta il valore della proprieta' flgIspPagamento associata alla
	 * colonna FLG_ISP_PAGAMENTO.
	 * @generated
	 */
	public void setFlgIspPagamento(java.math.BigDecimal val) {

		flgIspPagamento = val;

	}

	/**
	 * Legge il valore della proprieta' flgIspPagamento associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgIspPagamento() {

		return flgIspPagamento;

	}

}
