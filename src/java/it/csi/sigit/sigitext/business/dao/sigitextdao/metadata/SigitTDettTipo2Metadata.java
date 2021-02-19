package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTDettTipo2Metadata extends DAOMetadata {

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
	 * DAO: [sigitTDettTipo2]
	 * tabella: [SIGIT_T_DETT_TIPO2].
	 */
	public SigitTDettTipo2Metadata() {
		columnNames = new String[]{"ID_DETT_TIPO2", "FK_ALLEGATO", "CODICE_IMPIANTO", "FK_TIPO_COMPONENTE",
				"PROGRESSIVO", "DATA_INSTALL", "E_N_CIRCUITO", "E_FLG_MOD_PROVA", "E_FLG_PERDITA_GAS",
				"E_FLG_LEAK_DETECTOR", "E_FLG_PARAM_TERMODINAM", "E_FLG_INCROSTAZIONI", "E_T_SURRISC_C",
				"E_T_SOTTORAF_C", "E_T_CONDENSAZIONE_C", "E_T_EVAPORAZIONE_C", "E_T_IN_EXT_C", "E_T_OUT_EXT_C",
				"E_T_IN_UTENZE_C", "E_T_OUT_UTENZE_C", "DATA_ULT_MOD", "UTENTE_ULT_MOD", "L11_2_TORRE_T_OUT_FLUIDO",
				"L11_2_TORRE_T_BULBO_UMIDO", "L11_2_SCAMBIATORE_T_IN_EXT", "L11_2_SCAMBIATORE_T_OUT_EXT",
				"L11_2_SCAMBIAT_T_IN_MACCHINA", "L11_2_SCAMBIAT_T_OUT_MACCHINA", "L11_2_POTENZA_ASSORBITA_KW",
				"L11_2_FLG_PULIZIA_FILTRI", "L11_2_FLG_VERIFICA_SUPERATA", "L11_2_DATA_RIPRISTINO", "E_CONTROLLOWEB"};
		propertyNames = new String[]{"idDettTipo2", "fkAllegato", "codiceImpianto", "fkTipoComponente", "progressivo",
				"dataInstall", "eNCircuito", "eFlgModProva", "eFlgPerditaGas", "eFlgLeakDetector",
				"eFlgParamTermodinam", "eFlgIncrostazioni", "eTSurriscC", "eTSottorafC", "eTCondensazioneC",
				"eTEvaporazioneC", "eTInExtC", "eTOutExtC", "eTInUtenzeC", "eTOutUtenzeC", "dataUltMod", "utenteUltMod",
				"l112TorreTOutFluido", "l112TorreTBulboUmido", "l112ScambiatoreTInExt", "l112ScambiatoreTOutExt",
				"l112ScambiatTInMacchina", "l112ScambiatTOutMacchina", "l112PotenzaAssorbitaKw", "l112FlgPuliziaFiltri",
				"l112FlgVerificaSuperata", "l112DataRipristino", "eControlloweb"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTDettTipo2] fa riferimento
	 * (SIGIT_T_DETT_TIPO2).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_DETT_TIPO2";
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
