package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTCompBrRcMetadata extends DAOMetadata {

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
	 * DAO: [sigitTCompBrRc]
	 * tabella: [SIGIT_T_COMP_BR_RC].
	 */
	public SigitTCompBrRcMetadata() {
		columnNames = new String[]{"ID_COMP_BR_RC", "TIPOLOGIA_BR_RC", "PROGRESSIVO_BR_RC", "FK_TIPO_COMPONENTE",
				"FK_PROGRESSIVO", "FK_DATA_INSTALL", "CODICE_IMPIANTO", "TIPOLOGIA", "POT_TERM_MAX_KW",
				"POT_TERM_MIN_KW", "DATA_INSTALL", "DATA_DISMISS", "FK_MARCA", "MODELLO", "MATRICOLA",
				"FK_COMBUSTIBILE", "FLG_DISMISSIONE"};
		propertyNames = new String[]{"idCompBrRc", "tipologiaBrRc", "progressivoBrRc", "fkTipoComponente",
				"fkProgressivo", "fkDataInstall", "codiceImpianto", "tipologia", "potTermMaxKw", "potTermMinKw",
				"dataInstall", "dataDismiss", "fkMarca", "modello", "matricola", "fkCombustibile", "flgDismissione"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTCompBrRc] fa riferimento
	 * (SIGIT_T_COMP_BR_RC).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_COMP_BR_RC";
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
