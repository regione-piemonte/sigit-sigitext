package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTRappTipo3Metadata extends DAOMetadata {

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
	 * DAO: [sigitTRappTipo3]
	 * tabella: [SIGIT_T_RAPP_TIPO3].
	 */
	public SigitTRappTipo3Metadata() {
		columnNames = new String[]{"ID_ALLEGATO", "D_FLG_LOCALE_IDONEO", "D_FLG_LINEA_ELETT_IDONEA",
				"D_FLG_COIB_IDONEA", "D_FLG_ASSENZA_PERDITE", "F_FLG_VALVOLE_TERMOST", "F_FLG_VERIFICA_PARAM",
				"F_FLG_PERDITE_H2O", "F_FLG_INSTALL_INVOLUCRO", "C_FLG_TRATT_CLIMA_NON_RICHIEST",
				"C_FLG_TRATT_ACS_NON_RICHIESTO"};
		propertyNames = new String[]{"idAllegato", "dFlgLocaleIdoneo", "dFlgLineaElettIdonea", "dFlgCoibIdonea",
				"dFlgAssenzaPerdite", "fFlgValvoleTermost", "fFlgVerificaParam", "fFlgPerditeH2o",
				"fFlgInstallInvolucro", "cFlgTrattClimaNonRichiest", "cFlgTrattAcsNonRichiesto"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTRappTipo3] fa riferimento
	 * (SIGIT_T_RAPP_TIPO3).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_RAPP_TIPO3";
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
