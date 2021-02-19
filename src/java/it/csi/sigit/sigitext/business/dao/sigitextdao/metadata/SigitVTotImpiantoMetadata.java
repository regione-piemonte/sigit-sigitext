package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitVTotImpiantoMetadata extends DAOMetadata {

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
	 * DAO: [sigitVTotImpianto]
	 * tabella: [VISTA_TOT_IMPIANTO].
	 */
	public SigitVTotImpiantoMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "DENOMINAZIONE_PROVINCIA", "SIGLA_PROVINCIA", "ISTAT_COMUNE",
				"DENOMINAZIONE_COMUNE", "INDIRIZZO_SITAD", "CIVICO", "FLG_PRINCIPALE", "PF_PG", "ID_PERSONA_FISICA",
				"NOME", "DENOMINAZIONE", "ID_RUOLO", "DES_RUOLO", "RUOLO_FUNZ", "CODICE_FISCALE", "SIGLA_REA",
				"NUMERO_REA", "ID_IMP_RUOLO_PFPG", "DATA_INIZIO_PFPG", "DATA_FINE_PFPG", "FLG_VISU_PROPRIETARIO"};
		propertyNames = new String[]{"codiceImpianto", "denominazioneProvincia", "siglaProvincia", "istatComune",
				"denominazioneComune", "indirizzoSitad", "civico", "flgPrincipale", "pfPg", "idPersonaFisica", "nome",
				"denominazione", "idRuolo", "desRuolo", "ruoloFunz", "codiceFiscale", "siglaRea", "numeroRea",
				"idImpRuoloPfpg", "dataInizioPfpg", "dataFinePfpg", "flgVisuProprietario"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitVTotImpianto] fa riferimento
	 * (VISTA_TOT_IMPIANTO).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_TOT_IMPIANTO";
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
