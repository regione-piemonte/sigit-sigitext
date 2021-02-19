package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTCompAgMetadata extends DAOMetadata {

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
	 * DAO: [sigitTCompAg]
	 * tabella: [SIGIT_T_COMP_AG].
	 */
	public SigitTCompAgMetadata() {
		columnNames = new String[]{"ID_TIPO_COMPONENTE", "PROGRESSIVO", "DATA_INSTALL", "CODICE_IMPIANTO", "TIPOLOGIA",
				"DATA_DISMISS", "FLG_DISMISSIONE", "DATA_ULT_MOD", "UTENTE_ULT_MOD", "FK_MARCA", "MATRICOLA", "MODELLO",
				"POTENZA_TERMICA_KW"};
		propertyNames = new String[]{"idTipoComponente", "progressivo", "dataInstall", "codiceImpianto", "tipologia",
				"dataDismiss", "flgDismissione", "dataUltMod", "utenteUltMod", "fkMarca", "matricola", "modello",
				"potenzaTermicaKw"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTCompAg] fa riferimento
	 * (SIGIT_T_COMP_AG).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_COMP_AG";
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
