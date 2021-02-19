package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTUserWSMetadata extends DAOMetadata {

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
	 * DAO: [sigitTUserWS]
	 * tabella: [SIGIT_T_USER_WS].
	 */
	public SigitTUserWSMetadata() {
		columnNames = new String[]{"ID_USER_WS", "USER_WS", "PWD_WS", "DT_CREAZIONE_TOKEN", "DT_SCADENZA_TOKEN",
				"TOKEN"};
		propertyNames = new String[]{"idUserWs", "userWs", "pwdWs", "dtCreazioneToken", "dtScadenzaToken", "token"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTUserWS] fa riferimento
	 * (SIGIT_T_USER_WS).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_USER_WS";
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
