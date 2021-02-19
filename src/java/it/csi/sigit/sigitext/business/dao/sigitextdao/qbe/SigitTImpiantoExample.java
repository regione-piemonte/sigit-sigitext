package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTImpiantoDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTImpiantoExample extends AbstractExample {

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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk istatComune;

	/**
	 * @generated
	 */
	public void setIstatComune(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		istatComune = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getIstatComune() {
		return istatComune;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkStato;

	/**
	 * @generated
	 */
	public void setFkStato(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkStato = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkStato() {
		return fkStato;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataAssegnazione;

	/**
	 * @generated
	 */
	public void setDataAssegnazione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataAssegnazione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataAssegnazione() {
		return dataAssegnazione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataDismissione;

	/**
	 * @generated
	 */
	public void setDataDismissione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataDismissione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataDismissione() {
		return dataDismissione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk denominazioneComune;

	/**
	 * @generated
	 */
	public void setDenominazioneComune(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		denominazioneComune = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDenominazioneComune() {
		return denominazioneComune;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk siglaProvincia;

	/**
	 * @generated
	 */
	public void setSiglaProvincia(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		siglaProvincia = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getSiglaProvincia() {
		return siglaProvincia;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk denominazioneProvincia;

	/**
	 * @generated
	 */
	public void setDenominazioneProvincia(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		denominazioneProvincia = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDenominazioneProvincia() {
		return denominazioneProvincia;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l13PotH2oKw;

	/**
	 * @generated
	 */
	public void setL13PotH2oKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l13PotH2oKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL13PotH2oKw() {
		return l13PotH2oKw;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l13PotClimaInvKw;

	/**
	 * @generated
	 */
	public void setL13PotClimaInvKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l13PotClimaInvKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL13PotClimaInvKw() {
		return l13PotClimaInvKw;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l13PotClimaEstKw;

	/**
	 * @generated
	 */
	public void setL13PotClimaEstKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l13PotClimaEstKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL13PotClimaEstKw() {
		return l13PotClimaEstKw;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l13Altro;

	/**
	 * @generated
	 */
	public void setL13Altro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l13Altro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL13Altro() {
		return l13Altro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l14FlgH2o;

	/**
	 * @generated
	 */
	public void setL14FlgH2o(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l14FlgH2o = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL14FlgH2o() {
		return l14FlgH2o;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l14FlgAria;

	/**
	 * @generated
	 */
	public void setL14FlgAria(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l14FlgAria = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL14FlgAria() {
		return l14FlgAria;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l14Altro;

	/**
	 * @generated
	 */
	public void setL14Altro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l14Altro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL14Altro() {
		return l14Altro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15FlgGeneratore;

	/**
	 * @generated
	 */
	public void setL15FlgGeneratore(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15FlgGeneratore = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15FlgGeneratore() {
		return l15FlgGeneratore;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15FlgPompa;

	/**
	 * @generated
	 */
	public void setL15FlgPompa(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15FlgPompa = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15FlgPompa() {
		return l15FlgPompa;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15FlgFrigo;

	/**
	 * @generated
	 */
	public void setL15FlgFrigo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15FlgFrigo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15FlgFrigo() {
		return l15FlgFrigo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15FlgTelerisc;

	/**
	 * @generated
	 */
	public void setL15FlgTelerisc(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15FlgTelerisc = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15FlgTelerisc() {
		return l15FlgTelerisc;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15FlgTeleraffr;

	/**
	 * @generated
	 */
	public void setL15FlgTeleraffr(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15FlgTeleraffr = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15FlgTeleraffr() {
		return l15FlgTeleraffr;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15FlgCogeneratore;

	/**
	 * @generated
	 */
	public void setL15FlgCogeneratore(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15FlgCogeneratore = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15FlgCogeneratore() {
		return l15FlgCogeneratore;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15Altro;

	/**
	 * @generated
	 */
	public void setL15Altro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15Altro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15Altro() {
		return l15Altro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15SupPannelliSolM2;

	/**
	 * @generated
	 */
	public void setL15SupPannelliSolM2(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15SupPannelliSolM2 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15SupPannelliSolM2() {
		return l15SupPannelliSolM2;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15AltroIntegrazione;

	/**
	 * @generated
	 */
	public void setL15AltroIntegrazione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15AltroIntegrazione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15AltroIntegrazione() {
		return l15AltroIntegrazione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15AltroIntegrPotKw;

	/**
	 * @generated
	 */
	public void setL15AltroIntegrPotKw(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15AltroIntegrPotKw = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15AltroIntegrPotKw() {
		return l15AltroIntegrPotKw;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15FlgAltroClimaInv;

	/**
	 * @generated
	 */
	public void setL15FlgAltroClimaInv(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15FlgAltroClimaInv = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15FlgAltroClimaInv() {
		return l15FlgAltroClimaInv;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15FlgAltroClimaEstate;

	/**
	 * @generated
	 */
	public void setL15FlgAltroClimaEstate(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15FlgAltroClimaEstate = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15FlgAltroClimaEstate() {
		return l15FlgAltroClimaEstate;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15FlgAltroAcs;

	/**
	 * @generated
	 */
	public void setL15FlgAltroAcs(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15FlgAltroAcs = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15FlgAltroAcs() {
		return l15FlgAltroAcs;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l15AltroDesc;

	/**
	 * @generated
	 */
	public void setL15AltroDesc(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l15AltroDesc = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL15AltroDesc() {
		return l15AltroDesc;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk motivazione;

	/**
	 * @generated
	 */
	public void setMotivazione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		motivazione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getMotivazione() {
		return motivazione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk proprietario;

	/**
	 * @generated
	 */
	public void setProprietario(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		proprietario = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getProprietario() {
		return proprietario;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataInserimento;

	/**
	 * @generated
	 */
	public void setDataInserimento(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataInserimento = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataInserimento() {
		return dataInserimento;
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
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgTipoImpianto;

	/**
	 * @generated
	 */
	public void setFlgTipoImpianto(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgTipoImpianto = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgTipoImpianto() {
		return flgTipoImpianto;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgAppareccUiExt;

	/**
	 * @generated
	 */
	public void setFlgAppareccUiExt(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgAppareccUiExt = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgAppareccUiExt() {
		return flgAppareccUiExt;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgContabilizzazione;

	/**
	 * @generated
	 */
	public void setFlgContabilizzazione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgContabilizzazione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgContabilizzazione() {
		return flgContabilizzazione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataIntervento;

	/**
	 * @generated
	 */
	public void setDataIntervento(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataIntervento = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataIntervento() {
		return dataIntervento;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk fkTipoIntervento;

	/**
	 * @generated
	 */
	public void setFkTipoIntervento(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		fkTipoIntervento = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFkTipoIntervento() {
		return fkTipoIntervento;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l111FlgNormaUni103891;

	/**
	 * @generated
	 */
	public void setL111FlgNormaUni103891(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l111FlgNormaUni103891 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL111FlgNormaUni103891() {
		return l111FlgNormaUni103891;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l111AltraNorma;

	/**
	 * @generated
	 */
	public void setL111AltraNorma(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l111AltraNorma = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL111AltraNorma() {
		return l111AltraNorma;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgBloccoNomina3r;

	/**
	 * @generated
	 */
	public void setFlgBloccoNomina3r(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgBloccoNomina3r = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgBloccoNomina3r() {
		return flgBloccoNomina3r;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk flgVisuProprietario;

	/**
	 * @generated
	 */
	public void setFlgVisuProprietario(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		flgVisuProprietario = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getFlgVisuProprietario() {
		return flgVisuProprietario;
	}

}
