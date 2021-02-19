package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTImportMetadata extends DAOMetadata {

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
	 * DAO: [sigitTImport]
	 * tabella: [SIGIT_T_IMPORT].
	 */
	public SigitTImportMetadata() {
		columnNames = new String[]{"ID_IMPORT", "DATA_INIZIO", "DATA_FINE", "NOME_FILE_IMPORT", "FLG_ESITO",
				"CODICE_IMPIANTO", "FK_PRE_IMPORT", "FK_ALLEGATO", "MSG_ERRORE", "FK_PERSONA_GIURIDICA",
				"DATA_INVIO_MAIL_MANUT", "DATA_INVIO_MAIL_ASSISTENZA", "FK_PG_CAT"};
		propertyNames = new String[]{"idImport", "dataInizio", "dataFine", "nomeFileImport", "flgEsito",
				"codiceImpianto", "fkPreImport", "fkAllegato", "msgErrore", "fkPersonaGiuridica", "dataInvioMailManut",
				"dataInvioMailAssistenza", "fkPgCat"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTImport] fa riferimento
	 * (SIGIT_T_IMPORT).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_IMPORT";
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
