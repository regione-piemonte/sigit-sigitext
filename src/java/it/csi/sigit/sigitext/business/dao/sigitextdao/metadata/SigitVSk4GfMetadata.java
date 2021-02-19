package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitVSk4GfMetadata extends DAOMetadata {

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
	 * DAO: [sigitVSk4Gf]
	 * tabella: [VISTA_SK4_GF].
	 */
	public SigitVSk4GfMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "ID_TIPO_COMPONENTE", "PROGRESSIVO", "DATA_INSTALL", "MATRICOLA",
				"FK_MARCA", "DES_MARCA", "ID_COMBUSTIBILE", "DES_COMBUSTIBILE", "FK_DETTAGLIO_GF", "DES_DETTAGLIO_GF",
				"MODELLO", "FLG_SORGENTE_EXT", "FLG_FLUIDO_UTENZE", "FLUIDO_FRIGORIGENO", "N_CIRCUITI",
				"RAFFRESCAMENTO_EER", "RAFF_POTENZA_KW", "RAFF_POTENZA_ASS", "RISCALDAMENTO_COP", "RISC_POTENZA_KW",
				"RISC_POTENZA_ASS_KW", "FLG_DISMISSIONE", "DATA_DISMISS", "DATA_ULT_MOD", "UTENTE_ULT_MOD",
				"POTENZA_TERMICA_KW", "DATA_CONTROLLO", "TEMPO_MANUT_ANNI", "ID_ALLEGATO", "FK_TIPO_DOCUMENTO",
				"DES_TIPO_DOCUMENTO"};
		propertyNames = new String[]{"codiceImpianto", "idTipoComponente", "progressivo", "dataInstall", "matricola",
				"fkMarca", "desMarca", "idCombustibile", "desCombustibile", "fkDettaglioGf", "desDettaglioGf",
				"modello", "flgSorgenteExt", "flgFluidoUtenze", "fluidoFrigorigeno", "nCircuiti", "raffrescamentoEer",
				"raffPotenzaKw", "raffPotenzaAss", "riscaldamentoCop", "riscPotenzaKw", "riscPotenzaAssKw",
				"flgDismissione", "dataDismiss", "dataUltMod", "utenteUltMod", "potenzaTermicaKw", "dataControllo",
				"tempoManutAnni", "idAllegato", "fkTipoDocumento", "desTipoDocumento"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitVSk4Gf] fa riferimento
	 * (VISTA_SK4_GF).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_SK4_GF";
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
