package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTRappTipo4Metadata extends DAOMetadata {

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
	 * DAO: [sigitTRappTipo4]
	 * tabella: [SIGIT_T_RAPP_TIPO4].
	 */
	public SigitTRappTipo4Metadata() {
		columnNames = new String[]{"ID_ALLEGATO", "D_FLG_LUOGO_IDONEO", "D_FLG_VENTILAZ_ADEG", "D_FLG_VENTILAZ_LIBERA",
				"D_FLG_LINEA_ELETT_IDONEA", "D_FLG_CAMINO_IDONEO", "D_FLG_CAPSULA_IDONEA", "D_FLG_CIRC_IDR_IDONEO",
				"D_FLG_CIRC_OLIO_IDONEO", "D_FLG_CIRC_COMB_IDONEO", "D_FLG_FUNZ_SCAMB_IDONEA", "F_FLG_ADOZIONE_VALVOLE",
				"F_FLG_ISOLAMENTO_RETE", "F_FLG_SISTEMA_TRATT_H2O", "F_FLG_SOST_SISTEMA_REGOLAZ",
				"C_FLG_TRATT_CLIMA_NON_RICHIEST"};
		propertyNames = new String[]{"idAllegato", "dFlgLuogoIdoneo", "dFlgVentilazAdeg", "dFlgVentilazLibera",
				"dFlgLineaElettIdonea", "dFlgCaminoIdoneo", "dFlgCapsulaIdonea", "dFlgCircIdrIdoneo",
				"dFlgCircOlioIdoneo", "dFlgCircCombIdoneo", "dFlgFunzScambIdonea", "fFlgAdozioneValvole",
				"fFlgIsolamentoRete", "fFlgSistemaTrattH2o", "fFlgSostSistemaRegolaz", "cFlgTrattClimaNonRichiest"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTRappTipo4] fa riferimento
	 * (SIGIT_T_RAPP_TIPO4).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_RAPP_TIPO4";
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
