package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitSLibrettoMetadata extends DAOMetadata {

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
	 * DAO: [sigitSLibretto]
	 * tabella: [SIGIT_S_LIBRETTO].
	 */
	public SigitSLibrettoMetadata() {
		columnNames = new String[]{"ID_LIBRETTO", "FK_STATO", "FK_MOTIVO_CONSOLID", "FK_TIPO_DOCUMENTO",
				"DATA_CONSOLIDAMENTO", "FILE_INDEX", "UID_INDEX", "CF_REDATTORE", "FLG_CONTROLLO_BOZZA", "DATA_ULT_MOD",
				"UTENTE_ULT_MOD", "CODICE_IMPIANTO"};
		propertyNames = new String[]{"idLibretto", "fkStato", "fkMotivoConsolid", "fkTipoDocumento",
				"dataConsolidamento", "fileIndex", "uidIndex", "cfRedattore", "flgControlloBozza", "dataUltMod",
				"utenteUltMod", "codiceImpianto"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitSLibretto] fa riferimento
	 * (SIGIT_S_LIBRETTO).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_S_LIBRETTO";
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
