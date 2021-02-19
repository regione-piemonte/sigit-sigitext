package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTCompCsMetadata extends DAOMetadata {

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
	 * DAO: [sigitTCompCs]
	 * tabella: [SIGIT_T_COMP_CS].
	 */
	public SigitTCompCsMetadata() {
		columnNames = new String[]{"ID_TIPO_COMPONENTE", "PROGRESSIVO", "DATA_INSTALL", "CODICE_IMPIANTO",
				"NUM_COLLETTORI", "SUP_APERTURA", "DATA_DISMISS", "FLG_DISMISSIONE", "DATA_ULT_MOD", "UTENTE_ULT_MOD",
				"FK_MARCA"};
		propertyNames = new String[]{"idTipoComponente", "progressivo", "dataInstall", "codiceImpianto",
				"numCollettori", "supApertura", "dataDismiss", "flgDismissione", "dataUltMod", "utenteUltMod",
				"fkMarca"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTCompCs] fa riferimento
	 * (SIGIT_T_COMP_CS).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_COMP_CS";
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
