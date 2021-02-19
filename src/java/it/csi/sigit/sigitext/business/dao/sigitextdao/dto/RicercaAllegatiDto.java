package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO RicercaAllegatiDao.
 * @generated
 */
public class RicercaAllegatiDto implements Serializable {

	private static final long serialVersionUID = 1L;

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
	 * store della proprieta' associata alla colonna FK_ISPEZ_ISPET
	 * @generated
	 */
	protected java.math.BigDecimal fkIspezIspet;

	/**
	 * Imposta il valore della proprieta' fkIspezIspet associata alla
	 * colonna FK_ISPEZ_ISPET.
	 * @generated
	 */
	public void setFkIspezIspet(java.math.BigDecimal val) {

		fkIspezIspet = val;

	}

	/**
	 * Legge il valore della proprieta' fkIspezIspet associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkIspezIspet() {

		return fkIspezIspet;

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
	 * store della proprieta' associata alla colonna DATA_RESPINTA
	 * @generated
	 */
	protected java.sql.Date dataRespinta;

	/**
	 * Imposta il valore della proprieta' dataRespinta associata alla
	 * colonna DATA_RESPINTA.
	 * @generated
	 */
	public void setDataRespinta(java.sql.Date val) {

		if (val != null) {
			dataRespinta = new java.sql.Date(val.getTime());
		} else {
			dataRespinta = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataRespinta associata alla
	 * @generated
	 */
	public java.sql.Date getDataRespinta() {

		if (dataRespinta != null) {
			return new java.sql.Date(dataRespinta.getTime());
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
	 * store della proprieta' associata alla colonna DES_RUOLO
	 * @generated
	 */
	protected String desRuolo;

	/**
	 * Imposta il valore della proprieta' desRuolo associata alla
	 * colonna DES_RUOLO.
	 * @generated
	 */
	public void setDesRuolo(String val) {

		desRuolo = val;

	}

	/**
	 * Legge il valore della proprieta' desRuolo associata alla
	 * @generated
	 */
	public String getDesRuolo() {

		return desRuolo;

	}

	/**
	 * store della proprieta' associata alla colonna RUOLO_FUNZ
	 * @generated
	 */
	protected String ruoloFunz;

	/**
	 * Imposta il valore della proprieta' ruoloFunz associata alla
	 * colonna RUOLO_FUNZ.
	 * @generated
	 */
	public void setRuoloFunz(String val) {

		ruoloFunz = val;

	}

	/**
	 * Legge il valore della proprieta' ruoloFunz associata alla
	 * @generated
	 */
	public String getRuoloFunz() {

		return ruoloFunz;

	}

	/**
	 * store della proprieta' associata alla colonna ID_PERSONA_GIURIDICA
	 * @generated
	 */
	protected java.math.BigDecimal idPersonaGiuridica;

	/**
	 * Imposta il valore della proprieta' idPersonaGiuridica associata alla
	 * colonna ID_PERSONA_GIURIDICA.
	 * @generated
	 */
	public void setIdPersonaGiuridica(java.math.BigDecimal val) {

		idPersonaGiuridica = val;

	}

	/**
	 * Legge il valore della proprieta' idPersonaGiuridica associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdPersonaGiuridica() {

		return idPersonaGiuridica;

	}

	/**
	 * store della proprieta' associata alla colonna PG_DENOMINAZIONE
	 * @generated
	 */
	protected String pgDenominazione;

	/**
	 * Imposta il valore della proprieta' pgDenominazione associata alla
	 * colonna PG_DENOMINAZIONE.
	 * @generated
	 */
	public void setPgDenominazione(String val) {

		pgDenominazione = val;

	}

	/**
	 * Legge il valore della proprieta' pgDenominazione associata alla
	 * @generated
	 */
	public String getPgDenominazione() {

		return pgDenominazione;

	}

	/**
	 * store della proprieta' associata alla colonna PG_CODICE_FISCALE
	 * @generated
	 */
	protected String pgCodiceFiscale;

	/**
	 * Imposta il valore della proprieta' pgCodiceFiscale associata alla
	 * colonna PG_CODICE_FISCALE.
	 * @generated
	 */
	public void setPgCodiceFiscale(String val) {

		pgCodiceFiscale = val;

	}

	/**
	 * Legge il valore della proprieta' pgCodiceFiscale associata alla
	 * @generated
	 */
	public String getPgCodiceFiscale() {

		return pgCodiceFiscale;

	}

	/**
	 * store della proprieta' associata alla colonna PG_SIGLA_REA
	 * @generated
	 */
	protected String pgSiglaRea;

	/**
	 * Imposta il valore della proprieta' pgSiglaRea associata alla
	 * colonna PG_SIGLA_REA.
	 * @generated
	 */
	public void setPgSiglaRea(String val) {

		pgSiglaRea = val;

	}

	/**
	 * Legge il valore della proprieta' pgSiglaRea associata alla
	 * @generated
	 */
	public String getPgSiglaRea() {

		return pgSiglaRea;

	}

	/**
	 * store della proprieta' associata alla colonna PG_NUMERO_REA
	 * @generated
	 */
	protected java.math.BigDecimal pgNumeroRea;

	/**
	 * Imposta il valore della proprieta' pgNumeroRea associata alla
	 * colonna PG_NUMERO_REA.
	 * @generated
	 */
	public void setPgNumeroRea(java.math.BigDecimal val) {

		pgNumeroRea = val;

	}

	/**
	 * Legge il valore della proprieta' pgNumeroRea associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPgNumeroRea() {

		return pgNumeroRea;

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
	 * store della proprieta' associata alla colonna COMUNE_IMPIANTO
	 * @generated
	 */
	protected String comuneImpianto;

	/**
	 * Imposta il valore della proprieta' comuneImpianto associata alla
	 * colonna COMUNE_IMPIANTO.
	 * @generated
	 */
	public void setComuneImpianto(String val) {

		comuneImpianto = val;

	}

	/**
	 * Legge il valore della proprieta' comuneImpianto associata alla
	 * @generated
	 */
	public String getComuneImpianto() {

		return comuneImpianto;

	}

	/**
	 * store della proprieta' associata alla colonna SIGLA_PROV_IMPIANTO
	 * @generated
	 */
	protected String siglaProvImpianto;

	/**
	 * Imposta il valore della proprieta' siglaProvImpianto associata alla
	 * colonna SIGLA_PROV_IMPIANTO.
	 * @generated
	 */
	public void setSiglaProvImpianto(String val) {

		siglaProvImpianto = val;

	}

	/**
	 * Legge il valore della proprieta' siglaProvImpianto associata alla
	 * @generated
	 */
	public String getSiglaProvImpianto() {

		return siglaProvImpianto;

	}

	/**
	 * store della proprieta' associata alla colonna INDIRIZZO_UNITA_IMMOB
	 * @generated
	 */
	protected String indirizzoUnitaImmob;

	/**
	 * Imposta il valore della proprieta' indirizzoUnitaImmob associata alla
	 * colonna INDIRIZZO_UNITA_IMMOB.
	 * @generated
	 */
	public void setIndirizzoUnitaImmob(String val) {

		indirizzoUnitaImmob = val;

	}

	/**
	 * Legge il valore della proprieta' indirizzoUnitaImmob associata alla
	 * @generated
	 */
	public String getIndirizzoUnitaImmob() {

		return indirizzoUnitaImmob;

	}

	/**
	 * store della proprieta' associata alla colonna CIVICO_UNITA_IMMOB
	 * @generated
	 */
	protected String civicoUnitaImmob;

	/**
	 * Imposta il valore della proprieta' civicoUnitaImmob associata alla
	 * colonna CIVICO_UNITA_IMMOB.
	 * @generated
	 */
	public void setCivicoUnitaImmob(String val) {

		civicoUnitaImmob = val;

	}

	/**
	 * Legge il valore della proprieta' civicoUnitaImmob associata alla
	 * @generated
	 */
	public String getCivicoUnitaImmob() {

		return civicoUnitaImmob;

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
	 * store della proprieta' associata alla colonna FK_PG_CAT
	 * @generated
	 */
	protected java.math.BigDecimal fkPgCat;

	/**
	 * Imposta il valore della proprieta' fkPgCat associata alla
	 * colonna FK_PG_CAT.
	 * @generated
	 */
	public void setFkPgCat(java.math.BigDecimal val) {

		fkPgCat = val;

	}

	/**
	 * Legge il valore della proprieta' fkPgCat associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkPgCat() {

		return fkPgCat;

	}

	/**
	 * store della proprieta' associata alla colonna PG_FK_STATO_PG
	 * @generated
	 */
	protected Integer pgFkStatoPg;

	/**
	 * Imposta il valore della proprieta' pgFkStatoPg associata alla
	 * colonna PG_FK_STATO_PG.
	 * @generated
	 */
	public void setPgFkStatoPg(Integer val) {

		pgFkStatoPg = val;

	}

	/**
	 * Legge il valore della proprieta' pgFkStatoPg associata alla
	 * @generated
	 */
	public Integer getPgFkStatoPg() {

		return pgFkStatoPg;

	}

	/**
	 * store della proprieta' associata alla colonna ID_TIPO_MANUTENZIONE
	 * @generated
	 */
	protected java.math.BigDecimal idTipoManutenzione;

	/**
	 * Imposta il valore della proprieta' idTipoManutenzione associata alla
	 * colonna ID_TIPO_MANUTENZIONE.
	 * @generated
	 */
	public void setIdTipoManutenzione(java.math.BigDecimal val) {

		idTipoManutenzione = val;

	}

	/**
	 * Legge il valore della proprieta' idTipoManutenzione associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdTipoManutenzione() {

		return idTipoManutenzione;

	}

	/**
	 * store della proprieta' associata alla colonna DES_TIPO_MANUTENZIONE
	 * @generated
	 */
	protected String desTipoManutenzione;

	/**
	 * Imposta il valore della proprieta' desTipoManutenzione associata alla
	 * colonna DES_TIPO_MANUTENZIONE.
	 * @generated
	 */
	public void setDesTipoManutenzione(String val) {

		desTipoManutenzione = val;

	}

	/**
	 * Legge il valore della proprieta' desTipoManutenzione associata alla
	 * @generated
	 */
	public String getDesTipoManutenzione() {

		return desTipoManutenzione;

	}

	/**
	 * store della proprieta' associata alla colonna ALTRO_DESCR
	 * @generated
	 */
	protected String altroDescr;

	/**
	 * Imposta il valore della proprieta' altroDescr associata alla
	 * colonna ALTRO_DESCR.
	 * @generated
	 */
	public void setAltroDescr(String val) {

		altroDescr = val;

	}

	/**
	 * Legge il valore della proprieta' altroDescr associata alla
	 * @generated
	 */
	public String getAltroDescr() {

		return altroDescr;

	}

}
