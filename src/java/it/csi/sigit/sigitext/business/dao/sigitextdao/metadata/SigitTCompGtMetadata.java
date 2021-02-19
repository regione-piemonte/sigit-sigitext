package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTCompGtMetadata extends DAOMetadata {

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
	 * DAO: [sigitTCompGt]
	 * tabella: [SIGIT_T_COMP_GT].
	 */
	public SigitTCompGtMetadata() {
		columnNames = new String[]{"ID_TIPO_COMPONENTE", "PROGRESSIVO", "DATA_INSTALL", "CODICE_IMPIANTO", "FK_FLUIDO",
				"FK_DETTAGLIO_GT", "RENDIMENTO_PERC", "N_MODULI", "DATA_DISMISS", "FLG_DISMISSIONE", "DATA_ULT_MOD",
				"UTENTE_ULT_MOD", "FK_MARCA", "FK_COMBUSTIBILE", "MATRICOLA", "MODELLO", "POTENZA_TERMICA_KW", "NOTE",
				"TEMPO_MANUT_ANNI"};
		propertyNames = new String[]{"idTipoComponente", "progressivo", "dataInstall", "codiceImpianto", "fkFluido",
				"fkDettaglioGt", "rendimentoPerc", "nModuli", "dataDismiss", "flgDismissione", "dataUltMod",
				"utenteUltMod", "fkMarca", "fkCombustibile", "matricola", "modello", "potenzaTermicaKw", "note",
				"tempoManutAnni"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTCompGt] fa riferimento
	 * (SIGIT_T_COMP_GT).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_COMP_GT";
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
