package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class PotenzaImpMetadata extends DAOMetadata {

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
	 * DAO: [PotenzaImp]
	 * tabella: [OLD_SIGIT_D_POTENZA_IMP].
	 */
	public PotenzaImpMetadata() {
		columnNames = new String[]{"ID_POTENZA", "DES_POTENZA", "LIMITE_INFERIORE", "LIMITE_SUPERIORE"};
		propertyNames = new String[]{"idPotenza", "desPotenza", "limiteInferiore", "limiteSuperiore"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [PotenzaImp] fa riferimento
	 * (OLD_SIGIT_D_POTENZA_IMP).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "OLD_SIGIT_D_POTENZA_IMP";
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
