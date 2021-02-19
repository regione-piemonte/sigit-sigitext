package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTPersonaGiuridicaMetadata extends DAOMetadata {

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
	 * DAO: [sigitTPersonaGiuridica]
	 * tabella: [SIGIT_T_PERSONA_GIURIDICA].
	 */
	public SigitTPersonaGiuridicaMetadata() {
		columnNames = new String[]{"ID_PERSONA_GIURIDICA", "DENOMINAZIONE", "CODICE_FISCALE", "FK_L2",
				"INDIRIZZO_SITAD", "INDIRIZZO_NON_TROVATO", "SIGLA_PROV", "ISTAT_COMUNE", "COMUNE", "PROVINCIA",
				"CIVICO", "CAP", "EMAIL", "DATA_INIZIO_ATTIVITA", "DATA_CESSAZIONE", "SIGLA_REA", "NUMERO_REA",
				"FLG_AMMINISTRATORE", "DATA_ULT_MOD", "UTENTE_ULT_MOD", "FLG_TERZO_RESPONSABILE", "FLG_DISTRIBUTORE",
				"FLG_CAT", "FLG_INDIRIZZO_ESTERO", "STATO_ESTERO", "CITTA_ESTERO", "INDIRIZZO_ESTERO", "CAP_ESTERO",
				"FK_STATO_PG", "DT_AGG_DICHIARAZIONE", "FLG_DM37_LETTERAC", "FLG_DM37_LETTERAD", "FLG_DM37_LETTERAE",
				"FLG_FGAS", "FLG_CONDUTTORE", "FLG_SOGG_INCARICATO", "DELEGA_SOGG_INCARICATO", "DT_CREAZIONE_TOKEN",
				"DT_SCADENZA_TOKEN", "TOKEN"};
		propertyNames = new String[]{"idPersonaGiuridica", "denominazione", "codiceFiscale", "fkL2", "indirizzoSitad",
				"indirizzoNonTrovato", "siglaProv", "istatComune", "comune", "provincia", "civico", "cap", "email",
				"dataInizioAttivita", "dataCessazione", "siglaRea", "numeroRea", "flgAmministratore", "dataUltMod",
				"utenteUltMod", "flgTerzoResponsabile", "flgDistributore", "flgCat", "flgIndirizzoEstero",
				"statoEstero", "cittaEstero", "indirizzoEstero", "capEstero", "fkStatoPg", "dtAggDichiarazione",
				"flgDm37Letterac", "flgDm37Letterad", "flgDm37Letterae", "flgFgas", "flgConduttore",
				"flgSoggIncaricato", "delegaSoggIncaricato", "dtCreazioneToken", "dtScadenzaToken", "token"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTPersonaGiuridica] fa riferimento
	 * (SIGIT_T_PERSONA_GIURIDICA).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_PERSONA_GIURIDICA";
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
