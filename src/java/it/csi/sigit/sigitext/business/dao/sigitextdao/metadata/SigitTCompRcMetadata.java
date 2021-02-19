package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTCompRcMetadata extends DAOMetadata {

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
	 * DAO: [sigitTCompRc]
	 * tabella: [SIGIT_T_COMP_RC].
	 */
	public SigitTCompRcMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "ID_TIPO_COMPONENTE", "PROGRESSIVO", "DATA_INSTALL", "TIPOLOGIA",
				"FLG_INSTALLATO", "FLG_INDIPENDENTE", "PORTATA_MANDATA_LS", "PORTATA_RIPRESA_LS", "POTENZA_MANDATA_KW",
				"POTENZA_RIPRESA_KW"};
		propertyNames = new String[]{"codiceImpianto", "idTipoComponente", "progressivo", "dataInstall", "tipologia",
				"flgInstallato", "flgIndipendente", "portataMandataLs", "portataRipresaLs", "potenzaMandataKw",
				"potenzaRipresaKw"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTCompRc] fa riferimento
	 * (SIGIT_T_COMP_RC).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_COMP_RC";
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
