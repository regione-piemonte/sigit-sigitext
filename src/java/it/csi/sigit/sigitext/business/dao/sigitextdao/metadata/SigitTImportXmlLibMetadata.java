package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTImportXmlLibMetadata extends DAOMetadata {

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
	 * DAO: [sigitTImportXmlLib]
	 * tabella: [SIGIT_T_IMPORT_XML_LIB].
	 */
	public SigitTImportXmlLibMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "XML_LIBRETTO", "DATA_ULT_MOD", "UTENTE_ULT_MOD"};
		propertyNames = new String[]{"codiceImpianto", "xmlLibretto", "dataUltMod", "utenteUltMod"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTImportXmlLib] fa riferimento
	 * (SIGIT_T_IMPORT_XML_LIB).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_IMPORT_XML_LIB";
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
