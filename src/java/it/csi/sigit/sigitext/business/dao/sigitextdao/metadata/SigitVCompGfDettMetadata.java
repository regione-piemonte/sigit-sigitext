package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitVCompGfDettMetadata extends DAOMetadata {

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
	 * DAO: [sigitVCompGfDett]
	 * tabella: [VISTA_COMP_GF_DETT].
	 */
	public SigitVCompGfDettMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "FK_TIPO_COMPONENTE", "PROGRESSIVO", "DATA_INSTALL",
				"ID_DETT_TIPO2", "FK_ALLEGATO", "E_N_CIRCUITO", "E_FLG_MOD_PROVA", "E_FLG_PERDITA_GAS",
				"E_FLG_LEAK_DETECTOR", "E_FLG_PARAM_TERMODINAM", "E_FLG_INCROSTAZIONI", "E_T_SURRISC_C",
				"E_T_SOTTORAF_C", "E_T_CONDENSAZIONE_C", "E_T_EVAPORAZIONE_C", "E_T_IN_EXT_C", "E_T_OUT_EXT_C",
				"E_T_IN_UTENZE_C", "E_T_OUT_UTENZE_C", "DATA_ULT_MOD_DETT", "UTENTE_ULT_MOD_DETT", "DATA_CONTROLLO",
				"L11_2_TORRE_T_OUT_FLUIDO", "L11_2_TORRE_T_BULBO_UMIDO", "L11_2_SCAMBIATORE_T_IN_EXT",
				"L11_2_SCAMBIATORE_T_OUT_EXT", "L11_2_SCAMBIAT_T_IN_MACCHINA", "L11_2_SCAMBIAT_T_OUT_MACCHINA",
				"L11_2_POTENZA_ASSORBITA_KW", "L11_2_FLG_PULIZIA_FILTRI", "L11_2_FLG_VERIFICA_SUPERATA",
				"L11_2_DATA_RIPRISTINO", "SIGLA_REA", "NUMERO_REA", "ID_PERSONA_GIURIDICA", "FK_RUOLO",
				"FK_STATO_RAPP"};
		propertyNames = new String[]{"codiceImpianto", "fkTipoComponente", "progressivo", "dataInstall", "idDettTipo2",
				"fkAllegato", "eNCircuito", "eFlgModProva", "eFlgPerditaGas", "eFlgLeakDetector", "eFlgParamTermodinam",
				"eFlgIncrostazioni", "eTSurriscC", "eTSottorafC", "eTCondensazioneC", "eTEvaporazioneC", "eTInExtC",
				"eTOutExtC", "eTInUtenzeC", "eTOutUtenzeC", "dataUltModDett", "utenteUltModDett", "dataControllo",
				"l112TorreTOutFluido", "l112TorreTBulboUmido", "l112ScambiatoreTInExt", "l112ScambiatoreTOutExt",
				"l112ScambiatTInMacchina", "l112ScambiatTOutMacchina", "l112PotenzaAssorbitaKw", "l112FlgPuliziaFiltri",
				"l112FlgVerificaSuperata", "l112DataRipristino", "siglaRea", "numeroRea", "idPersonaGiuridica",
				"fkRuolo", "fkStatoRapp"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitVCompGfDett] fa riferimento
	 * (VISTA_COMP_GF_DETT).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_COMP_GF_DETT";
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
