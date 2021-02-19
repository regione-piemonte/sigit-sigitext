package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTPersonaFisicaMetadata extends DAOMetadata {

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
	 * DAO: [sigitTPersonaFisica]
	 * tabella: [SIGIT_T_PERSONA_FISICA].
	 */
	public SigitTPersonaFisicaMetadata() {
		columnNames = new String[]{"ID_PERSONA_FISICA", "NOME", "COGNOME", "CODICE_FISCALE", "FK_L2", "INDIRIZZO_SITAD",
				"INDIRIZZO_NON_TROVATO", "ISTAT_COMUNE", "SIGLA_PROV", "COMUNE", "PROVINCIA", "CIVICO", "CAP", "EMAIL",
				"FLG_ACCREDITATO", "DATA_ULT_MOD", "UTENTE_ULT_MOD", "FLG_INDIRIZZO_ESTERO", "STATO_ESTERO",
				"CITTA_ESTERO", "INDIRIZZO_ESTERO", "CAP_ESTERO", "FLG_NEWSLETTER", "FLG_GDPR"};
		propertyNames = new String[]{"idPersonaFisica", "nome", "cognome", "codiceFiscale", "fkL2", "indirizzoSitad",
				"indirizzoNonTrovato", "istatComune", "siglaProv", "comune", "provincia", "civico", "cap", "email",
				"flgAccreditato", "dataUltMod", "utenteUltMod", "flgIndirizzoEstero", "statoEstero", "cittaEstero",
				"indirizzoEstero", "capEstero", "flgNewsletter", "flgGdpr"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTPersonaFisica] fa riferimento
	 * (SIGIT_T_PERSONA_FISICA).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_PERSONA_FISICA";
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
