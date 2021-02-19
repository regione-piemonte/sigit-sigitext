package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitVCompPoMetadata extends DAOMetadata {

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
	 * DAO: [sigitVCompPo]
	 * tabella: [VISTA_COMP_PO].
	 */
	public SigitVCompPoMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "ID_TIPO_COMPONENTE", "DATA_INSTALL", "PROGRESSIVO",
				"DATA_DISMISS", "MATRICOLA", "FK_MARCA", "DES_MARCA", "MODELLO", "FLG_GIRI_VARIABILI",
				"POT_NOMINALE_KW", "FLG_DISMISSIONE"};
		propertyNames = new String[]{"codiceImpianto", "idTipoComponente", "dataInstall", "progressivo", "dataDismiss",
				"matricola", "fkMarca", "desMarca", "modello", "flgGiriVariabili", "potNominaleKw", "flgDismissione"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitVCompPo] fa riferimento
	 * (VISTA_COMP_PO).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_COMP_PO";
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
