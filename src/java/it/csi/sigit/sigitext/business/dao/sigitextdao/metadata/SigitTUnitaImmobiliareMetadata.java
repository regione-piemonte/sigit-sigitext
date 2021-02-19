package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTUnitaImmobiliareMetadata extends DAOMetadata {

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
	 * DAO: [sigitTUnitaImmobiliare]
	 * tabella: [SIGIT_T_UNITA_IMMOBILIARE].
	 */
	public SigitTUnitaImmobiliareMetadata() {
		columnNames = new String[]{"ID_UNITA_IMM", "CODICE_IMPIANTO", "FK_L2", "INDIRIZZO_SITAD",
				"INDIRIZZO_NON_TROVATO", "CIVICO", "CAP", "SCALA", "PALAZZO", "INTERNO", "NOTE", "FLG_PRINCIPALE",
				"SEZIONE", "FOGLIO", "PARTICELLA", "SUBALTERNO", "POD_ELETTRICO", "PDR_GAS", "DATA_ULT_MOD",
				"UTENTE_ULT_MOD", "L1_2_FLG_SINGOLA_UNITA", "L1_2_FK_CATEGORIA", "L1_2_VOL_RISC_M3", "L1_2_VOL_RAFF_M3",
				"FLG_NOPDR", "FLG_NOACCATASTATO"};
		propertyNames = new String[]{"idUnitaImm", "codiceImpianto", "fkL2", "indirizzoSitad", "indirizzoNonTrovato",
				"civico", "cap", "scala", "palazzo", "interno", "note", "flgPrincipale", "sezione", "foglio",
				"particella", "subalterno", "podElettrico", "pdrGas", "dataUltMod", "utenteUltMod",
				"l12FlgSingolaUnita", "l12FkCategoria", "l12VolRiscM3", "l12VolRaffM3", "flgNopdr", "flgNoaccatastato"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTUnitaImmobiliare] fa riferimento
	 * (SIGIT_T_UNITA_IMMOBILIARE).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_UNITA_IMMOBILIARE";
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
