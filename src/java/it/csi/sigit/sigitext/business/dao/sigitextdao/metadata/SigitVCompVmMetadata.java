package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitVCompVmMetadata extends DAOMetadata {

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
	 * DAO: [sigitVCompVm]
	 * tabella: [VISTA_COMP_VM].
	 */
	public SigitVCompVmMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "ID_TIPO_COMPONENTE", "DATA_INSTALL", "PROGRESSIVO",
				"DATA_DISMISS", "MATRICOLA", "FK_MARCA", "DES_MARCA", "MODELLO", "FK_DETTAGLIO_VM", "DES_DETTAGLIO_VM",
				"ALTRO_TIPOLOGIA", "PORTATA_MAX_ARIA_M3H", "RENDIMENTO_COP", "FLG_DISMISSIONE"};
		propertyNames = new String[]{"codiceImpianto", "idTipoComponente", "dataInstall", "progressivo", "dataDismiss",
				"matricola", "fkMarca", "desMarca", "modello", "fkDettaglioVm", "desDettaglioVm", "altroTipologia",
				"portataMaxAriaM3h", "rendimentoCop", "flgDismissione"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitVCompVm] fa riferimento
	 * (VISTA_COMP_VM).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_COMP_VM";
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
