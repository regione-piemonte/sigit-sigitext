package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTImpiantoMetadata extends DAOMetadata {

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
	 * DAO: [sigitTImpianto]
	 * tabella: [SIGIT_T_IMPIANTO].
	 */
	public SigitTImpiantoMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "ISTAT_COMUNE", "FK_STATO", "DATA_ASSEGNAZIONE",
				"DATA_DISMISSIONE", "DENOMINAZIONE_COMUNE", "SIGLA_PROVINCIA", "DENOMINAZIONE_PROVINCIA",
				"L1_3_POT_H2O_KW", "L1_3_POT_CLIMA_INV_KW", "L1_3_POT_CLIMA_EST_KW", "L1_3_ALTRO", "L1_4_FLG_H2O",
				"L1_4_FLG_ARIA", "L1_4_ALTRO", "L1_5_FLG_GENERATORE", "L1_5_FLG_POMPA", "L1_5_FLG_FRIGO",
				"L1_5_FLG_TELERISC", "L1_5_FLG_TELERAFFR", "L1_5_FLG_COGENERATORE", "L1_5_ALTRO",
				"L1_5_SUP_PANNELLI_SOL_M2", "L1_5_ALTRO_INTEGRAZIONE", "L1_5_ALTRO_INTEGR_POT_KW",
				"L1_5_FLG_ALTRO_CLIMA_INV", "L1_5_FLG_ALTRO_CLIMA_ESTATE", "L1_5_FLG_ALTRO_ACS", "L1_5_ALTRO_DESC",
				"DATA_ULT_MOD", "UTENTE_ULT_MOD", "MOTIVAZIONE", "PROPRIETARIO", "DATA_INSERIMENTO", "NOTE",
				"FLG_TIPO_IMPIANTO", "FLG_APPARECC_UI_EXT", "FLG_CONTABILIZZAZIONE", "DATA_INTERVENTO",
				"FK_TIPO_INTERVENTO", "L11_1_FLG_NORMA_UNI_10389_1", "L11_1_ALTRA_NORMA", "FLG_BLOCCO_NOMINA_3R",
				"FLG_VISU_PROPRIETARIO"};
		propertyNames = new String[]{"codiceImpianto", "istatComune", "fkStato", "dataAssegnazione", "dataDismissione",
				"denominazioneComune", "siglaProvincia", "denominazioneProvincia", "l13PotH2oKw", "l13PotClimaInvKw",
				"l13PotClimaEstKw", "l13Altro", "l14FlgH2o", "l14FlgAria", "l14Altro", "l15FlgGeneratore",
				"l15FlgPompa", "l15FlgFrigo", "l15FlgTelerisc", "l15FlgTeleraffr", "l15FlgCogeneratore", "l15Altro",
				"l15SupPannelliSolM2", "l15AltroIntegrazione", "l15AltroIntegrPotKw", "l15FlgAltroClimaInv",
				"l15FlgAltroClimaEstate", "l15FlgAltroAcs", "l15AltroDesc", "dataUltMod", "utenteUltMod", "motivazione",
				"proprietario", "dataInserimento", "note", "flgTipoImpianto", "flgAppareccUiExt",
				"flgContabilizzazione", "dataIntervento", "fkTipoIntervento", "l111FlgNormaUni103891", "l111AltraNorma",
				"flgBloccoNomina3r", "flgVisuProprietario"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTImpianto] fa riferimento
	 * (SIGIT_T_IMPIANTO).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_IMPIANTO";
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
