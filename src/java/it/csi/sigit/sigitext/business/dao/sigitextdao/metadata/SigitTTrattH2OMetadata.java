package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTTrattH2OMetadata extends DAOMetadata {

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
	 * DAO: [sigitTTrattH2O]
	 * tabella: [SIGIT_T_TRATT_H2O].
	 */
	public SigitTTrattH2OMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "L2_1_H2O_CLIMA_M3", "L2_2_DUREZZA_H2O_FR",
				"L2_3_FLG_TRATT_RISC_NON_RICH", "L2_3_FLG_TRATT_CLIMA_ASSENTE", "L2_3_DUREZZA_TOT_H2O_FR",
				"L2_3_FLG_TRATT_CLIMA_FILTR", "L2_3_FLG_TRATT_CLIMA_ADDOLC", "L2_3_FLG_TRATT_CLIMA_CHIMICO",
				"L2_3_FLG_TRATT_GELO_ASSENTE", "L2_3_FLG_TRATT_GELO_GLI_ETIL", "L2_3_PERC_GLI_ETIL", "L2_3_PH_GLI_ETIL",
				"L2_3_FLG_TRATT_GELO_GLI_PROP", "L2_3_PERC_GLI_PROP", "L2_3_PH_GLI_PROP", "L2_4_FLG_TRATT_ACS_NON_RICH",
				"L2_4_FLG_TRATT_ACS_ASSENTE", "L2_4_FLG_TRATT_ACS_FILTR", "L2_4_FLG_TRATT_ACS_ADDOLC",
				"L2_4_DUREZZA_ADDOLC_FR", "L2_4_FLG_TRATT_ACS_CHIMICO", "L2_5_FLG_TRATT_RAFF_ASSENTE",
				"L2_5_FLG_TRATT_RAFF_NO_RT", "L2_5_FLG_TRATT_RAFF_RTP", "L2_5_FLG_TRATT_RAFF_RTT",
				"L2_5_FLG_TRATT_RAFF_ACQ", "L2_5_FLG_TRATT_RAFF_PZZ", "L2_5_FLG_TRATT_RAFF_H2O_SUP",
				"L2_5_FLG_TRATT_F_FILT_SIC", "L2_5_FLG_TRATT_F_FILT_MAS", "L2_5_FLG_TRATT_F_NO_TRATT",
				"L2_5_TRATT_F_ALTRO", "L2_5_FLG_TRATT_T_ADDOLC", "L2_5_FLG_TRATT_T_OSMOSI", "L2_5_FLG_TRATT_T_DEMIN",
				"L2_5_FLG_TRATT_T_NO_TRATT", "L2_5_TRATT_T_ALTRO", "L2_5_FLG_TRATT_C_PAANTINCRO",
				"L2_5_FLG_TRATT_C_PAANTICORR", "L2_5_FLG_TRATT_C_AAA", "L2_5_FLG_TRATT_C_BIOCIDA",
				"L2_5_FLG_TRATT_C_NO_TRATT", "L2_5_TRATT_C_ALTRO", "L2_5_FLG_SPURGO_AUTOM", "L2_5_CONDUC_H2O_ING",
				"L2_5_TARATURA"};
		propertyNames = new String[]{"codiceImpianto", "l21H2oClimaM3", "l22DurezzaH2oFr", "l23FlgTrattRiscNonRich",
				"l23FlgTrattClimaAssente", "l23DurezzaTotH2oFr", "l23FlgTrattClimaFiltr", "l23FlgTrattClimaAddolc",
				"l23FlgTrattClimaChimico", "l23FlgTrattGeloAssente", "l23FlgTrattGeloGliEtil", "l23PercGliEtil",
				"l23PhGliEtil", "l23FlgTrattGeloGliProp", "l23PercGliProp", "l23PhGliProp", "l24FlgTrattAcsNonRich",
				"l24FlgTrattAcsAssente", "l24FlgTrattAcsFiltr", "l24FlgTrattAcsAddolc", "l24DurezzaAddolcFr",
				"l24FlgTrattAcsChimico", "l25FlgTrattRaffAssente", "l25FlgTrattRaffNoRt", "l25FlgTrattRaffRtp",
				"l25FlgTrattRaffRtt", "l25FlgTrattRaffAcq", "l25FlgTrattRaffPzz", "l25FlgTrattRaffH2oSup",
				"l25FlgTrattFFiltSic", "l25FlgTrattFFiltMas", "l25FlgTrattFNoTratt", "l25TrattFAltro",
				"l25FlgTrattTAddolc", "l25FlgTrattTOsmosi", "l25FlgTrattTDemin", "l25FlgTrattTNoTratt",
				"l25TrattTAltro", "l25FlgTrattCPaantincro", "l25FlgTrattCPaanticorr", "l25FlgTrattCAaa",
				"l25FlgTrattCBiocida", "l25FlgTrattCNoTratt", "l25TrattCAltro", "l25FlgSpurgoAutom", "l25ConducH2oIng",
				"l25Taratura"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTTrattH2O] fa riferimento
	 * (SIGIT_T_TRATT_H2O).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_TRATT_H2O";
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
