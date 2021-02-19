/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.util;

/**
 * <p>Classe delle costanti applicative.</p>
 *
 * @author GuiGen
 */
public final class Constants {
	/**
	 * identificativo dell'applicativo.
	 */
	public static final String APPLICATION_CODE = "sigitext";

	public final static String UTF_8_ENCODING = "UTF-8";
	public final static String MIME_TYPE_PDF = "application/pdf";
	public final static String MIME_TYPE_XML = "application/x-download";
	public final static String MIME_TYPE_APPLICATION_XML = "application/xml";
	
	public static final String FILE_PREFIX_TRACCIATO = "Tracciato";
	public static final String FILE_PREFIX_LIBRETTO = "Libretto";

	public static final String CODICE_APPLICAZIONE_MODOL = "SIGIT";
	public static final String CODICE_MODULO_MODOL_LIBRETTO = "MODULOsigit-v2.1.0";

	public static final String INTERVAL_BLANK = " ";

	public static final String INTERVAL_SEP = "-";

	public static final String INTERVAL_SEP_HASH = "#";

	public static final String INTERVAL_SEP_CHIAVI = "_";

	public static final String INTERVAL_SEP_SLASH = "/";

	public static final String INTERVAL_SEP_VIRCOLA = ",";


	public static final String UID_FITTIZIO_PREFIX = "codiceimpianto_";

	public static final int ID_FUNZ_CERCA_IMPIANTO_BY_CODICE = 1;
	public static final int ID_FUNZ_CERCA_IMPIANTO_BY_POD = 2;
	public static final int ID_FUNZ_CERCA_IMPIANTO_BY_PDR = 3;
	public static final int ID_FUNZ_CERCA_LIBRETTO_BY_UID = 4;
	public static final int ID_FUNZ_GET_LIBRETTO_NOW = 5;
	public static final int ID_FUNZ_GET_XML_LIBRETTO_NOW = 6;
	public static final int ID_FUNZ_GET_XML_LIBRETTO_CONSOLIDATO = 7;
	public static final int ID_FUNZ_UPLOAD_XML_LIBRETTO = 8;
	public static final int ID_FUNZ_UPLOAD_XML_CONTROLLO = 9;
	public static final int ID_FUNZ_GET_IMPIANTI_BY_FILTRO = 10;
	
	public static final String INDEX_USERNAME_READ = "admin@sigit";
	public static final String INDEX_PSW = "sigit";
	public static final String INDEX_UTENTE = "Utente Sigit";
	public static final String INDEX_FRUITORE = "sigit";
	public static final String INDEX_REPOSITORY = "primary";
	public static final String INDEX_PREFIX = "sigit:";
	public static final String INDEX_PREFIX_NAME = "cm:content";
	public static final String INDEX_PREFIX_CONTAINS = "cm:contains";
	public static final String INDEX_ALLEGATO_NAME = "sigit:rapporto";
	public static final String INDEX_ENCODING = "UTF-8";
	public static final String INDEX_FOLDER_LIBRETTI = "libretti";
	public static final String INDEX_ROOT = "/app:company_home";
	public static final String INDEX_ROOT_SIGIT = "/app:company_home/cm:sigit";
	public static final String INDEX_FOLDER_SUFFIX = "/cm:";
	public static final String INDEX_METADATO_SUFFIX = "@cm\\:";
	public static final String INDEX_DEFAULT_PREFIX = "cm:";
	public static final String INDEX_PREFIX_NAME_SHORT = "cm:name";
	public static final String INDEX_PREFIX_MODEL = "cm:contentmodel";
	public static final String INDEX_PREFIX_FOLDER = "cm:folder";
	public static final String INDEX_SIGIT_PREFIX_MODEL = "sigit:sigitContent";
	public static final String INDEX_TYPE_TEXT = "d:text";
	
	public static final String MAX_RISULTATI_WS = "MAX_RISULTATI_WS";
	public static final String MAX_BYTE_TOPDFA = "MAX_BYTE_TOPDFA";
	
	/**
	 * Espressione regolare per la data
	 */
	public static final String DATA = "^(((0[1-9]|[12]\\d|3[01])\\/(0[13578]|1[02])\\/((1[6-9]|[2-9]\\d)\\d{2}))|((0[1-9]|[12]\\d|30)\\/(0[13456789]|1[012])\\/((1[6-9]|[2-9]\\d)\\d{2}))|((0[1-9]|1\\d|2[0-8])\\/02\\/((1[6-9]|[2-9]\\d)\\d{2}))|(29\\/02\\/((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$";

	// FLAG SI
	public static String SI = "S";

	// FLAG NO
	public static String NO = "N";
	
	// FLAG SI
	public static int SI_1 = 1;

	// FLAG NO
	public static int NO_0 = 0;

	// FLAG NC
	public static int NC_2 = 2;

	public static final String STATO_MODULO_BOZZA = "BOZZA";
	public static final String STATO_MODULO_DEFINITIVO = "DEFINITIVO";

	// RUOLO RESPONSABILE
	public static final String RUOLO_RESPONSABILE = "RESPONSABILE";
	
	// RUOLO PROPRIETARIO
	public static final String RUOLO_PROPRIETARIO = "PROPRIETARIO";

	// RUOLO RESPONSABILE IMPRESA
	public static final String RUOLO_RESPONSABILE_IMPRESA = "RESPONSABILE IMPRESA/ENTE";

	// RUOLO PROPRIETARIO IMPRESA
	public static final String RUOLO_PROPRIETARIO_IMPRESA = "PROPRIETARIO IMPRESA/ENTE";
	
	// RUOLO ISPETTORE
	public static final String RUOLO_ISPETTORE = "ISPETTORE";

	//RUOLO CARICATORE (ex INSTALLATORE)
	public static final String RUOLO_CARICATORE = "CARICATORE";

	// RUOLO IMPRESA (ex MANUTENTORE)
	public static final String RUOLO_IMPRESA = "IMPRESA";
	
	// ID RUOLO ISPETTORE
	public final static int ID_RUOLO_ISPETTORE = 2;

	// ID RUOLO PROPRIETARIO
	public final static int ID_RUOLO_PROPRIETARIO = 4;

	// ID RUOLO PROPRIETARIO
	public final static int ID_RUOLO_OCCUPANTE = 5;
	
	// ID RUOLO RESPONSABILE IMPRESA PROPRIETARIO
	public final static int ID_RUOLO_RESPONSABILE_IMPRESA_PROPRIETARIO = 10;
	// ID RUOLO RESPONSABILE IMPRESA OCCUPANTE
	public final static int ID_RUOLO_RESPONSABILE_IMPRESA_OCCUPANTE = 11;
	// ID RUOLO RESPONSABILE IMPRESA AMMINISTRATORE
	public final static int ID_RUOLO_RESPONSABILE_IMPRESA_AMMINISTRATORE = 12;
	// ID RUOLO AMMINISTRATORE
	public final static int ID_RUOLO_AMMINISTRATORE = 13;

	
	public final static String DESC_PG_RUOLO_ISPETTORE = "ENTE ISPETTORE";

	public static final int ID_STATO_ISPEZIONE_BOZZA = 1;
	public static final int ID_STATO_ISPEZIONE_CONSOLIDATO = 2;
	public static final int ID_STATO_ISPEZIONE_ANNULLATO = 3;

	public static final int ID_TIPO_INT_NUOVA_INSTALZ = 1;
	public static final int ID_TIPO_INT_RISTRUTTURAZ = 2;
	public static final int ID_TIPO_INT_SOSTITUZIONE = 3;
	public static final int ID_TIPO_INT_COMPILAZIONE = 4;

	public static final String ID_UNITA_IMMOB_CATEGORIA_E1 = "E.1";
	public static final String ID_UNITA_IMMOB_CATEGORIA_E2 = "E.2";
	public static final String ID_UNITA_IMMOB_CATEGORIA_E3 = "E.3";
	public static final String ID_UNITA_IMMOB_CATEGORIA_E4 = "E.4";
	public static final String ID_UNITA_IMMOB_CATEGORIA_E5 = "E.5";
	public static final String ID_UNITA_IMMOB_CATEGORIA_E6 = "E.6";
	public static final String ID_UNITA_IMMOB_CATEGORIA_E7 = "E.7";
	public static final String ID_UNITA_IMMOB_CATEGORIA_E8 = "E.8";
	
	public static final String ID_DETT_GT_GRUPPO_TERM_SING = "1";
	public static final String ID_DETT_GT_GRUPPO_TERM_MOD = "2";
	public static final String ID_DETT_GT_TUBO_RADIANTE = "3";
	public static final String ID_DETT_GT_GEN_ARIA_CALDA = "4";

	public static final String FLG_ACQUA = "ACQUA";
	public static final String FLG_ARIA = "ARIA";

	public static final String FLG_RISCALDAMENTO = "RIS";
	public static final String FLG_RAFFREDDAMENTO = "RAF";

	public static final String ID_DETT_GF_ASS_REC_CALORE = "1";
	public static final String ID_DETT_GF_ASS_FIAMM_COMB = "2";
	public static final String ID_DETT_GF_CICLO_COMPRESS = "3";
	
	public static final String FLAG_ASSENTE = "A";
	public static final String FLAG_PRESENTE = "P";

	public static final String FLG_5_4_TIPOLOGIA_DIRETTO = "D";
	public static final String FLG_5_4_TIPOLOGIA_INDIRETTO = "I";

	public static final String FLAG_VASO_APERTO = "A";
	public static final String FLAG_VASO_CHIUSO = "C";
	
	public static final String TIPO_COMPONENTE_GT = "GT";
	public static final String TIPO_COMPONENTE_GF = "GF";
	public static final String TIPO_COMPONENTE_SC = "SC";
	public static final String TIPO_COMPONENTE_CS = "CS";
	public static final String TIPO_COMPONENTE_CG = "CG";
	public static final String TIPO_COMPONENTE_AG = "AG";
	public static final String TIPO_COMPONENTE_BR = "BR";
	public static final String TIPO_COMPONENTE_RC = "RC";
	public static final String TIPO_COMPONENTE_SR = "SR";
	public static final String TIPO_COMPONENTE_VR = "VR";
	public static final String TIPO_COMPONENTE_PO = "PO";
	public static final String TIPO_COMPONENTE_AC = "AC";
	public static final String TIPO_COMPONENTE_TE = "TE";
	public static final String TIPO_COMPONENTE_RV = "RV";
	public static final String TIPO_COMPONENTE_SCX = "SCX";
	public static final String TIPO_COMPONENTE_CI = "CI";
	public static final String TIPO_COMPONENTE_UT = "UT";
	public static final String TIPO_COMPONENTE_RCX = "RCX";
	public static final String TIPO_COMPONENTE_VM = "VM";
	public static final String TIPO_COMPONENTE_VX = "VX";

	public final static String DESC_ISPEZIONE = "ISPEZIONE";

	public static final String TIPO_CONSUMO_CB = "14.1";
	public static final String TIPO_CONSUMO_EE = "14.2";
	public static final String TIPO_CONSUMO_H2O = "14.3";

	public static final String NOX_PPM = "(ppm)";
	public static final String NOX_MG_KWH = "(mg/kWh)";

	public static final String ALLEGATO_TIPO_1 = "3";
	public static final String ALLEGATO_TIPO_2 = "4";
	public static final String ALLEGATO_TIPO_3 = "5";
	public static final String ALLEGATO_TIPO_4 = "6";
	public static final String RAPP_PROVA_ALLEGATO_TIPO_1 = "21";
	public static final String RAPP_PROVA_ALLEGATO_TIPO_2 = "22";
	public static final String MANUTENZIONE_GT = "10";
	public static final String MANUTENZIONE_GF = "11";
	public static final String MANUTENZIONE_SC = "12";
	public static final String MANUTENZIONE_CG = "13";

	public final static int MAX_2030_LEN = 2030;

	public static final int ID_STATO_LIBRETTO_BOZZA = 1;
	public static final int ID_STATO_LIBRETTO_CONSOLIDATO = 2;
	public static final int ID_STATO_LIBRETTO_STORICIZZATO = 3;

	public static final String ESTENSIONE_XML = "XML";
	
	public static final String VALUE_PLACEHOLDER = "##value##";
	public static final String VALUE_PLACEHOLDER1 = "##value1##";
	public static final String VALUE_PLACEHOLDER2 = "##value2##";
	public static final String VALUE_PLACEHOLDER3 = "##value3##";
	public static final String VALUE_PLACEHOLDER4 = "##value4##";

	public static final String DESC_TABELLA_COMBUSTIBILE = "Combustibile";
	public static final String DESC_TABELLA_UNITA_MISURA = "Unita di Misura";
	public static final String DESC_TABELLA_MARCA = "Marca";
	public static final String DESC_TABELLA_FLUIDO = "Fluido";
	
	// ID RUOLO MANUTENTORE
	public final static int ID_RUOLO_MANUTENTORE_ALL_1 = 6;
	public final static int ID_RUOLO_MANUTENTORE_ALL_2 = 7;
	public final static int ID_RUOLO_MANUTENTORE_ALL_3 = 8;
	public final static int ID_RUOLO_MANUTENTORE_ALL_4 = 9;
	
	public static final String TIPO_OPERAZIONE_DB_DELETE = "DELETE";
	
	public static final String XML_IMPORT_SCHEMA_DIR = "schemaorg_apache_xmlbeans/src/src/adobe/schemas/";
	public static final String FILE_IMPORT_LIBRETTO = "Import-Libretto-1.0.0.xsd";
	public static final String FILE_IMPORT_ALLEGATO_II = "Import-AllegatoII-1.0.3.xsd";
	public static final String FILE_IMPORT_ALLEGATO_III = "Import-AllegatoIII-1.0.3.xsd";
	public static final String FILE_IMPORT_ALLEGATO_IV = "Import-AllegatoIV-1.0.2.xsd";
	public static final String FILE_IMPORT_ALLEGATO_V = "Import-AllegatoV-1.0.2.xsd";
	public static final String FILE_IMPORT_MANUT_GT = "Import-ManutenzioneGT-1.0.0.xsd";
	public static final String FILE_IMPORT_MANUT_GF = "Import-ManutenzioneGF-1.0.0.xsd";
	public static final String FILE_IMPORT_MANUT_SC = "Import-ManutenzioneSC-1.0.0.xsd";
	public static final String FILE_IMPORT_MANUT_CG = "Import-ManutenzioneCG-1.0.0.xsd";
	public static final String XML_IMPORT_ALLEGATO_II_SCHEMA_DIR = XML_IMPORT_SCHEMA_DIR + FILE_IMPORT_ALLEGATO_II;
	public static final String XML_IMPORT_ALLEGATO_III_SCHEMA_DIR = XML_IMPORT_SCHEMA_DIR + FILE_IMPORT_ALLEGATO_III;
	public static final String XML_IMPORT_ALLEGATO_IV_SCHEMA_DIR = XML_IMPORT_SCHEMA_DIR + FILE_IMPORT_ALLEGATO_IV;
	public static final String XML_IMPORT_ALLEGATO_V_SCHEMA_DIR = XML_IMPORT_SCHEMA_DIR + FILE_IMPORT_ALLEGATO_V;
	public static final String XML_IMPORT_MANUT_GT_SCHEMA_DIR = XML_IMPORT_SCHEMA_DIR + FILE_IMPORT_MANUT_GT;
	public static final String XML_IMPORT_MANUT_GF_SCHEMA_DIR = XML_IMPORT_SCHEMA_DIR + FILE_IMPORT_MANUT_GF;
	public static final String XML_IMPORT_MANUT_SC_SCHEMA_DIR = XML_IMPORT_SCHEMA_DIR + FILE_IMPORT_MANUT_SC;
	public static final String XML_IMPORT_MANUT_CG_SCHEMA_DIR = XML_IMPORT_SCHEMA_DIR + FILE_IMPORT_MANUT_CG;

	public static final int ID_STATO_IMPRESA_ATTIVA = 1;
	public static final int ID_STATO_IMPRESA_CESSATA = 2;
	public static final int ID_STATO_IMPRESA_SOSPESA = 3;
	public static final int ID_STATO_IMPRESA_RADIATA = 4;
	
	public static final String MISURA_METRI_CUBI_ORARI = "m3/h"; 
	public static final String MISURA_KILOGRAMMI_ORARI = "Kg/h";
	
	public final static int MAX_1000_LEN = 1000;
	
	public static final String SIGLA_BOLLINO_RP = "RP";
	
	public static final int ID_TIPO_MANUTENZIONE_PULIZIA = 1;
	public static final int ID_TIPO_MANUTENZIONE_CONTROLLO = 2;
	public static final int ID_TIPO_MANUTENZIONE_ALTRO = 3;
	public static final int ID_TIPO_MANUTENZIONE_REE = 99;
	public static final int ID_TIPO_MANUTENZIONE_NESSUNA = 0;
	
	public static final int ID_STATO_RAPPORTO_BOZZA = 0;
	public static final int ID_STATO_RAPPORTO_INVIATO = 1;
	public static final int ID_STATO_RAPPORTO_RESPINTO = 2;

	public static final int MOTIVO_CONSOLIDAMENTO_NUOVA_MANUTENZIONE = 11;	
	
	public static final String SUBJECT_JWT_FRUITORE = "INTERNO";

	public static final String CODICE_FRUITORE_SIGIT = "SIGIT";
	
	public static final int ID_USER_WS_FRUITORI_ESTERNI = 0;
	
	// STATO IMPIANTO DEFAULT ATTIVO
	public final static String STATO_IMPIANTO_DEFAULT = "Attivo";

	
}
