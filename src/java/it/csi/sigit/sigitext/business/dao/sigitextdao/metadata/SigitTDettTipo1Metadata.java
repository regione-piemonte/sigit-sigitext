package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTDettTipo1Metadata extends DAOMetadata {

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
	 * DAO: [sigitTDettTipo1]
	 * tabella: [SIGIT_T_DETT_TIPO1].
	 */
	public SigitTDettTipo1Metadata() {
		columnNames = new String[]{"ID_DETT_TIPO1", "FK_ALLEGATO", "CODICE_IMPIANTO", "FK_TIPO_COMPONENTE",
				"PROGRESSIVO", "DATA_INSTALL", "E_N_MODULO_TERMICO", "E_POT_TERM_FOCOL_KW", "E_FLG_CLIMA_INVERNO",
				"E_FLG_PRODUZ_ACS", "E_FLG_DISPOS_COMANDO", "E_FLG_DISPOS_SICUREZZA", "E_FLG_VALVOLA_SICUREZZA",
				"E_FLG_SCAMBIATORE_FUMI", "E_FLG_RIFLUSSO", "E_FLG_UNI_10389_1", "E_FLG_EVACU_FUMI",
				"E_DEPR_CANALE_FUMO_PA", "E_TEMP_FUMI_C", "E_TEMP_ARIA_C", "E_O2_PERC", "E_CO2_PERC",
				"E_CO_CORRETTO_PPM", "E_REND_COMB_PERC", "E_REND_MIN_LEGGE_PERC", "E_NOX_PPM", "DATA_ULT_MOD",
				"UTENTE_ULT_MOD", "L11_1_PORTATA_COMBUSTIBILE", "L11_1_CO_NO_ARIA_PPM", "L11_1_FLG_RISPETTA_BACHARACH",
				"L11_1_FLG_CO_MIN_1000", "L11_1_FLG_REND_MAG_REND_MIN", "L11_1_PORTATA_COMBUSTIBILE_UM",
				"L11_1_ALTRO_RIFERIMENTO", "E_BACHARACH_MIN", "E_BACHARACH_MED", "E_BACHARACH_MAX", "E_CONTROLLOWEB",
				"E_NOX_MG_KWH"};
		propertyNames = new String[]{"idDettTipo1", "fkAllegato", "codiceImpianto", "fkTipoComponente", "progressivo",
				"dataInstall", "eNModuloTermico", "ePotTermFocolKw", "eFlgClimaInverno", "eFlgProduzAcs",
				"eFlgDisposComando", "eFlgDisposSicurezza", "eFlgValvolaSicurezza", "eFlgScambiatoreFumi",
				"eFlgRiflusso", "eFlgUni103891", "eFlgEvacuFumi", "eDeprCanaleFumoPa", "eTempFumiC", "eTempAriaC",
				"eO2Perc", "eCo2Perc", "eCoCorrettoPpm", "eRendCombPerc", "eRendMinLeggePerc", "eNoxPpm", "dataUltMod",
				"utenteUltMod", "l111PortataCombustibile", "l111CoNoAriaPpm", "l111FlgRispettaBacharach",
				"l111FlgCoMin1000", "l111FlgRendMagRendMin", "l111PortataCombustibileUm", "l111AltroRiferimento",
				"eBacharachMin", "eBacharachMed", "eBacharachMax", "eControlloweb", "eNoxMgKwh"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTDettTipo1] fa riferimento
	 * (SIGIT_T_DETT_TIPO1).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_DETT_TIPO1";
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
