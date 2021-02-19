package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTRappTipo2Metadata extends DAOMetadata {

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
	 * DAO: [sigitTRappTipo2]
	 * tabella: [SIGIT_T_RAPP_TIPO2].
	 */
	public SigitTRappTipo2Metadata() {
		columnNames = new String[]{"ID_ALLEGATO", "D_FLG_LOCALE_IDONEO", "D_FLG_APERTURE_LIBERE", "D_FLG_APERTURE_ADEG",
				"D_FLG_LINEA_ELETT_IDONEA", "F_FLG_SOSTITUZ_GENERATORI", "F_FLG_SOSTITUZ_SISTEMI_REG",
				"F_FLG_ISOL_DISTRIBUZ_H2O", "F_FLG_ISOL_DISTRIBUZ_ARIA", "C_FLG_TRATT_CLIMA_NON_RICHIEST",
				"D_FLG_COIB_IDONEA"};
		propertyNames = new String[]{"idAllegato", "dFlgLocaleIdoneo", "dFlgApertureLibere", "dFlgApertureAdeg",
				"dFlgLineaElettIdonea", "fFlgSostituzGeneratori", "fFlgSostituzSistemiReg", "fFlgIsolDistribuzH2o",
				"fFlgIsolDistribuzAria", "cFlgTrattClimaNonRichiest", "dFlgCoibIdonea"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTRappTipo2] fa riferimento
	 * (SIGIT_T_RAPP_TIPO2).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_RAPP_TIPO2";
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
