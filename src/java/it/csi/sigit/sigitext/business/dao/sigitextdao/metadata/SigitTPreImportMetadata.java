package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTPreImportMetadata extends DAOMetadata {

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
	 * DAO: [sigitTPreImport]
	 * tabella: [SIGIT_T_PRE_IMPORT].
	 */
	public SigitTPreImportMetadata() {
		columnNames = new String[]{"ID_PRE_IMPORT", "N_FILE", "MSG", "DATA_ULT_MOD", "UTENTE_ULT_MOD",
				"ID_PERSONA_FISICA"};
		propertyNames = new String[]{"idPreImport", "nFile", "msg", "dataUltMod", "utenteUltMod", "idPersonaFisica"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTPreImport] fa riferimento
	 * (SIGIT_T_PRE_IMPORT).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_PRE_IMPORT";
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
