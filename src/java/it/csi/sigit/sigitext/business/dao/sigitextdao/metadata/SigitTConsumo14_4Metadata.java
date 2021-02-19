package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTConsumo14_4Metadata extends DAOMetadata {

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
	 * DAO: [sigitTConsumo14_4]
	 * tabella: [SIGIT_T_CONSUMO_14_4].
	 */
	public SigitTConsumo14_4Metadata() {
		columnNames = new String[]{"ID_CONSUMO_H2O", "CODICE_IMPIANTO", "FLG_CIRCUITO_IT", "FLG_CIRCUITO_ACS",
				"FLG_ACA", "NOME_PRODOTTO", "QTA_CONSUMATA", "FK_UNITA_MISURA", "ESERCIZIO_DA", "ESERCIZIO_A",
				"DATA_ULT_MOD", "UTENTE_ULT_MOD", "ESERCIZIO"};
		propertyNames = new String[]{"idConsumoH2o", "codiceImpianto", "flgCircuitoIt", "flgCircuitoAcs", "flgAca",
				"nomeProdotto", "qtaConsumata", "fkUnitaMisura", "esercizioDa", "esercizioA", "dataUltMod",
				"utenteUltMod", "esercizio"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTConsumo14_4] fa riferimento
	 * (SIGIT_T_CONSUMO_14_4).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_CONSUMO_14_4";
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
