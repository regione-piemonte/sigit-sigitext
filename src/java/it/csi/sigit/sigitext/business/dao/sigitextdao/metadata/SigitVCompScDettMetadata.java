package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitVCompScDettMetadata extends DAOMetadata {

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
	 * DAO: [sigitVCompScDett]
	 * tabella: [VISTA_COMP_SC_DETT].
	 */
	public SigitVCompScDettMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "FK_TIPO_COMPONENTE", "PROGRESSIVO", "DATA_INSTALL",
				"FK_ALLEGATO", "FK_FLUIDO", "FK_FLUIDO_ALIMENTAZ", "E_FLUIDO_ALTRO", "E_ALIMENTAZIONE_ALTRO",
				"E_FLG_CLIMA_INVERNO", "E_FLG_PRODUZ_ACS", "E_FLG_POTENZA_COMPATIBILE", "E_FLG_COIB_IDONEA",
				"E_FLG_DISP_FUNZIONANTI", "E_TEMP_EXT_C", "E_TEMP_MAND_PRIMARIO_C", "E_TEMP_RITOR_PRIMARIO_C",
				"E_TEMP_MAND_SECONDARIO_C", "E_TEMP_RIT_SECONDARIO_C", "E_POTENZA_TERM_KW", "E_PORT_FLUIDO_M3_H",
				"DATA_ULT_MOD_DETT", "UTENTE_ULT_MOD_DETT", "DATA_CONTROLLO", "SIGLA_REA", "NUMERO_REA",
				"ID_PERSONA_GIURIDICA", "FK_RUOLO", "FK_STATO_RAPP"};
		propertyNames = new String[]{"codiceImpianto", "fkTipoComponente", "progressivo", "dataInstall", "fkAllegato",
				"fkFluido", "fkFluidoAlimentaz", "eFluidoAltro", "eAlimentazioneAltro", "eFlgClimaInverno",
				"eFlgProduzAcs", "eFlgPotenzaCompatibile", "eFlgCoibIdonea", "eFlgDispFunzionanti", "eTempExtC",
				"eTempMandPrimarioC", "eTempRitorPrimarioC", "eTempMandSecondarioC", "eTempRitSecondarioC",
				"ePotenzaTermKw", "ePortFluidoM3H", "dataUltModDett", "utenteUltModDett", "dataControllo", "siglaRea",
				"numeroRea", "idPersonaGiuridica", "fkRuolo", "fkStatoRapp"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitVCompScDett] fa riferimento
	 * (VISTA_COMP_SC_DETT).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_COMP_SC_DETT";
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
