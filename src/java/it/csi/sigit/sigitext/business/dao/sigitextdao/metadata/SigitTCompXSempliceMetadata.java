package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTCompXSempliceMetadata extends DAOMetadata {

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
	 * DAO: [sigitTCompXSemplice]
	 * tabella: [SIGIT_T_COMPX_SEMPLICE].
	 */
	public SigitTCompXSempliceMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "L5_1_FLG_SR_ONOFF", "L5_1_FLG_SR_GENERATORE",
				"L5_1_FLG_SR_INDIPENDENTE", "L5_1_FLG_VALVOLE_REGOLAZIONE", "L5_1_FLG_SR_MULTIGRADINO",
				"L5_1_FLG_SR_INVERTER", "L5_1_FLG_SR_ALTRI", "L5_1_SR_DESCRIZIONE", "L5_2_FLG_TERMO_ONOFF",
				"L5_2_FLG_TERMO_PROPORZIONALE", "L5_2_FLG_CONTR_ENTALPICO", "L5_2_FLG_CONTR_PORTATA",
				"L5_2_FLG_VALVOLE_TERMO", "L5_2_FLG_VALVOLE_2", "L5_2_FLG_VALVOLE_3", "L5_2_NOTE",
				"L5_3_FLG_TELELETTURA", "L5_3_FLG_TELEGESTIONE", "L5_3_DES_SISTEMA_INSTALLAZ", "L5_3_DATA_SOSTITUZ",
				"L5_3_DES_SISTEMA_SOSTITUZ", "L5_4_FLG_UIC", "L5_4_FLG_RISC", "L5_4_FLG_RAFF", "L5_4_FLG_ACS",
				"L5_4_FLG_TIPOLOGIA", "L5_4_DES_SISTEMA_INSTALLAZ", "L5_4_DATA_SOSTITUZ", "L5_4_DES_SISTEMA_SOSTITUZ",
				"L6_1_FLG_VERTICALE", "L6_1_FLG_ORIZZONTALE", "L6_1_FLG_CAN", "L6_1_ALTRO", "L6_2_FLG_COIBENT",
				"L6_2_NOTE", "L7_0_FLG_RADIATORI", "L7_0_FLG_TERMOCONVETTORI", "L7_0_FLG_VENTILCONVETTORI",
				"L7_0_FLG_PANNELLI", "L7_0_FLG_BOCCHETTE", "L7_0_FLG_STRISCE", "L7_0_FLG_TRAVI", "L7_0_ALTRO",
				"DATA_ULT_MOD", "UTENTE_ULT_MOD"};
		propertyNames = new String[]{"codiceImpianto", "l51FlgSrOnoff", "l51FlgSrGeneratore", "l51FlgSrIndipendente",
				"l51FlgValvoleRegolazione", "l51FlgSrMultigradino", "l51FlgSrInverter", "l51FlgSrAltri",
				"l51SrDescrizione", "l52FlgTermoOnoff", "l52FlgTermoProporzionale", "l52FlgContrEntalpico",
				"l52FlgContrPortata", "l52FlgValvoleTermo", "l52FlgValvole2", "l52FlgValvole3", "l52Note",
				"l53FlgTelelettura", "l53FlgTelegestione", "l53DesSistemaInstallaz", "l53DataSostituz",
				"l53DesSistemaSostituz", "l54FlgUic", "l54FlgRisc", "l54FlgRaff", "l54FlgAcs", "l54FlgTipologia",
				"l54DesSistemaInstallaz", "l54DataSostituz", "l54DesSistemaSostituz", "l61FlgVerticale",
				"l61FlgOrizzontale", "l61FlgCan", "l61Altro", "l62FlgCoibent", "l62Note", "l70FlgRadiatori",
				"l70FlgTermoconvettori", "l70FlgVentilconvettori", "l70FlgPannelli", "l70FlgBocchette", "l70FlgStrisce",
				"l70FlgTravi", "l70Altro", "dataUltMod", "utenteUltMod"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTCompXSemplice] fa riferimento
	 * (SIGIT_T_COMPX_SEMPLICE).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_COMPX_SEMPLICE";
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
