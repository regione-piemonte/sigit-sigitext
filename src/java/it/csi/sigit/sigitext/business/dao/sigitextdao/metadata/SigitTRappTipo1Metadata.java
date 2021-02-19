package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTRappTipo1Metadata extends DAOMetadata {

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
	 * DAO: [sigitTRappTipo1]
	 * tabella: [SIGIT_T_RAPP_TIPO1].
	 */
	public SigitTRappTipo1Metadata() {
		columnNames = new String[]{"ID_ALLEGATO", "D_FLG_LOCALE_INT_IDONEO", "D_FLG_GEN_EXT_IDONEO",
				"D_FLG_APERTURE_LIBERE", "D_FLG_APERTURE_ADEG", "D_FLG_SCARICO_IDONEO", "D_FLG_TEMP_AMB_FUNZ",
				"D_FLG_ASSENZA_PERD_COMB", "D_FLG_IDO_TEN_IMP_INT", "F_FLG_ADOZIONE_VALVOLE_TERM",
				"F_FLG_ISOLAMENTE_RETE", "F_FLG_ADOZ_SIST_TRATTAM_H2O", "F_FLG_SOSTITUZ_SIST_REGOLAZ",
				"C_FLG_TRATT_CLIMA_NON_RICH", "C_FLG_TRATT_ACS_NON_RICHIESTO"};
		propertyNames = new String[]{"idAllegato", "dFlgLocaleIntIdoneo", "dFlgGenExtIdoneo", "dFlgApertureLibere",
				"dFlgApertureAdeg", "dFlgScaricoIdoneo", "dFlgTempAmbFunz", "dFlgAssenzaPerdComb", "dFlgIdoTenImpInt",
				"fFlgAdozioneValvoleTerm", "fFlgIsolamenteRete", "fFlgAdozSistTrattamH2o", "fFlgSostituzSistRegolaz",
				"cFlgTrattClimaNonRich", "cFlgTrattAcsNonRichiesto"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTRappTipo1] fa riferimento
	 * (SIGIT_T_RAPP_TIPO1).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_RAPP_TIPO1";
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
