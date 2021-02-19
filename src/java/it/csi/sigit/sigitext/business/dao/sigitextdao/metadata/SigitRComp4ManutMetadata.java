package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitRComp4ManutMetadata extends DAOMetadata {

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
	 * DAO: [sigitRComp4Manut]
	 * tabella: [SIGIT_R_COMP4_MANUT].
	 */
	public SigitRComp4ManutMetadata() {
		columnNames = new String[]{"ID_R_COMP4_MANUT", "FK_PERSONA_GIURIDICA", "CODICE_IMPIANTO", "ID_TIPO_COMPONENTE",
				"PROGRESSIVO", "DATA_INIZIO", "DATA_FINE", "DATA_ULT_MOD", "UTENTE_ULT_MOD", "FK_RUOLO"};
		propertyNames = new String[]{"idRComp4Manut", "fkPersonaGiuridica", "codiceImpianto", "idTipoComponente",
				"progressivo", "dataInizio", "dataFine", "dataUltMod", "utenteUltMod", "fkRuolo"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitRComp4Manut] fa riferimento
	 * (SIGIT_R_COMP4_MANUT).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_R_COMP4_MANUT";
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
