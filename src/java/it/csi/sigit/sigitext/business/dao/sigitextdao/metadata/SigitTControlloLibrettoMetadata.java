package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTControlloLibrettoMetadata extends DAOMetadata {

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
	 * DAO: [sigitTControlloLibretto]
	 * tabella: [SIGIT_T_CONTROLLO_LIBRETTO].
	 */
	public SigitTControlloLibrettoMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "FLG_L1_CONTROLLOWEB", "FLG_L5_CONTROLLOWEB",
				"FLG_L6_CONTROLLOWEB", "FLG_L7_CONTROLLOWEB", "DT_ULT_MOD", "UTENTE_ULT_AGG"};
		propertyNames = new String[]{"codiceImpianto", "flgL1Controlloweb", "flgL5Controlloweb", "flgL6Controlloweb",
				"flgL7Controlloweb", "dtUltMod", "utenteUltAgg"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTControlloLibretto] fa riferimento
	 * (SIGIT_T_CONTROLLO_LIBRETTO).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_CONTROLLO_LIBRETTO";
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
