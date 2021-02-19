package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTConsumoMetadata extends DAOMetadata {

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
	 * DAO: [sigitTConsumo]
	 * tabella: [SIGIT_T_CONSUMO].
	 */
	public SigitTConsumoMetadata() {
		columnNames = new String[]{"ID_CONSUMO", "CODICE_IMPIANTO", "FK_TIPO_CONSUMO", "FK_COMBUSTIBILE",
				"FK_UNITA_MISURA", "ACQUISTI", "LETTURA_INIZIALE", "LETTURA_FINALE", "CONSUMO", "ESERCIZIO_DA",
				"ESERCIZIO_A", "DATA_ULT_MOD", "UTENTE_ULT_MOD"};
		propertyNames = new String[]{"idConsumo", "codiceImpianto", "fkTipoConsumo", "fkCombustibile", "fkUnitaMisura",
				"acquisti", "letturaIniziale", "letturaFinale", "consumo", "esercizioDa", "esercizioA", "dataUltMod",
				"utenteUltMod"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTConsumo] fa riferimento
	 * (SIGIT_T_CONSUMO).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_CONSUMO";
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
