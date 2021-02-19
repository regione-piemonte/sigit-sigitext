package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class RicercaAllegatiMetadata extends DAOMetadata {

	/**
	 * contiene l'elenco dei nomi delle property del DTO associato al DAO a cui
	 * questi metadati fanno riferimento
	 */
	private final String[] propertyNames;

	/**
	 * contiene l'elenco dei nomi delle colonne della tabella associata al DAO a cui
	 * questi metadati fanno riferimento
	 */
	private final String[] columnNames;

	/**
	 * Contiene i metadati relativi a:
	 * DAO: [RicercaAllegati]
	 * tabella: [VISTA_RICERCA_ALLEGATI].
	 */
	public RicercaAllegatiMetadata() {
		columnNames = new String[]{"ID_ALLEGATO", "FK_STATO_RAPP", "FK_ISPEZ_ISPET", "FK_TIPO_DOCUMENTO",
				"FK_SIGLA_BOLLINO", "FK_NUMERO_BOLLINO", "DATA_CONTROLLO", "B_FLG_LIBRETTO_USO",
				"B_FLG_DICHIAR_CONFORM", "B_FLG_LIB_IMP", "B_FLG_LIB_COMPL", "F_OSSERVAZIONI", "F_RACCOMANDAZIONI",
				"F_PRESCRIZIONI", "F_FLG_PUO_FUNZIONARE", "F_INTERVENTO_ENTRO", "F_ORA_ARRIVO", "F_ORA_PARTENZA",
				"F_DENOMINAZ_TECNICO", "F_FLG_FIRMA_TECNICO", "F_FLG_FIRMA_RESPONSABILE", "DATA_INVIO", "DATA_RESPINTA",
				"NOME_ALLEGATO", "DATA_ULT_MOD", "UTENTE_ULT_MOD", "DES_RUOLO", "RUOLO_FUNZ", "ID_PERSONA_GIURIDICA",
				"PG_DENOMINAZIONE", "PG_CODICE_FISCALE", "PG_SIGLA_REA", "PG_NUMERO_REA", "CODICE_IMPIANTO",
				"COMUNE_IMPIANTO", "SIGLA_PROV_IMPIANTO", "INDIRIZZO_UNITA_IMMOB", "CIVICO_UNITA_IMMOB",
				"DES_TIPO_DOCUMENTO", "DES_STATO_RAPP", "FLG_CONTROLLO_BOZZA", "UID_INDEX", "ELENCO_COMBUSTIBILI",
				"ELENCO_APPARECCHIATURE", "FK_PG_CAT", "PG_FK_STATO_PG", "ID_TIPO_MANUTENZIONE",
				"DES_TIPO_MANUTENZIONE", "ALTRO_DESCR"};
		propertyNames = new String[]{"idAllegato", "fkStatoRapp", "fkIspezIspet", "fkTipoDocumento", "fkSiglaBollino",
				"fkNumeroBollino", "dataControllo", "bFlgLibrettoUso", "bFlgDichiarConform", "bFlgLibImp",
				"bFlgLibCompl", "fOsservazioni", "fRaccomandazioni", "fPrescrizioni", "fFlgPuoFunzionare",
				"fInterventoEntro", "fOraArrivo", "fOraPartenza", "fDenominazTecnico", "fFlgFirmaTecnico",
				"fFlgFirmaResponsabile", "dataInvio", "dataRespinta", "nomeAllegato", "dataUltMod", "utenteUltMod",
				"desRuolo", "ruoloFunz", "idPersonaGiuridica", "pgDenominazione", "pgCodiceFiscale", "pgSiglaRea",
				"pgNumeroRea", "codiceImpianto", "comuneImpianto", "siglaProvImpianto", "indirizzoUnitaImmob",
				"civicoUnitaImmob", "desTipoDocumento", "desStatoRapp", "flgControlloBozza", "uidIndex",
				"elencoCombustibili", "elencoApparecchiature", "fkPgCat", "pgFkStatoPg", "idTipoManutenzione",
				"desTipoManutenzione", "altroDescr"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [RicercaAllegati] fa riferimento
	 * (VISTA_RICERCA_ALLEGATI).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_RICERCA_ALLEGATI";
	}

	/**
	 * Method 'getColumnNames'
	 * Restutuisce l'insieme dei nomi delle colonne gestite dal DAO.
	 * @return String[]
	 * @generated
	 */
	public String[] getColumnNames() {
		String ris[] = new String[columnNames.length];
		System.arraycopy(columnNames, 0, ris, 0, columnNames.length);
		return ris;
	}

}
