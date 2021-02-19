package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitRImpRuoloPfpgMetadata extends DAOMetadata {

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
	 * DAO: [sigitRImpRuoloPfpg]
	 * tabella: [SIGIT_R_IMP_RUOLO_PFPG].
	 */
	public SigitRImpRuoloPfpgMetadata() {
		columnNames = new String[]{"ID_IMP_RUOLO_PFPG", "FK_RUOLO", "CODICE_IMPIANTO", "DATA_INIZIO", "DATA_FINE",
				"FK_PERSONA_FISICA", "FK_PERSONA_GIURIDICA", "DATA_ULT_MOD", "UTENTE_ULT_MOD", "FLG_PRIMO_CARICATORE"};
		propertyNames = new String[]{"idImpRuoloPfpg", "fkRuolo", "codiceImpianto", "dataInizio", "dataFine",
				"fkPersonaFisica", "fkPersonaGiuridica", "dataUltMod", "utenteUltMod", "flgPrimoCaricatore"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitRImpRuoloPfpg] fa riferimento
	 * (SIGIT_R_IMP_RUOLO_PFPG).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_R_IMP_RUOLO_PFPG";
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
