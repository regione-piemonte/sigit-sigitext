package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTCodiceBollMetadata extends DAOMetadata {

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
	 * DAO: [sigitTCodiceBoll]
	 * tabella: [SIGIT_T_CODICE_BOLL].
	 */
	public SigitTCodiceBollMetadata() {
		columnNames = new String[]{"SIGLA_BOLLINO", "NUMERO_BOLLINO", "FK_TRANSAZIONE_BOLL", "FK_POTENZA", "FK_PREZZO",
				"FK_DT_INIZIO_ACQUISTO", "FLG_PREGRESSO", "DT_INSERIMENTO"};
		propertyNames = new String[]{"siglaBollino", "numeroBollino", "fkTransazioneBoll", "fkPotenza", "fkPrezzo",
				"fkDtInizioAcquisto", "flgPregresso", "dtInserimento"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTCodiceBoll] fa riferimento
	 * (SIGIT_T_CODICE_BOLL).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_CODICE_BOLL";
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
