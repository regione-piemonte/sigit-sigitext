package it.csi.sigit.sigitext.business.dao.metadata;

import java.io.*;
import java.sql.*;

/**
 * Classe astratta per i DAO Metadata.
 * Per ogni DAO deve essere definita una sottoclasse di questa classe astratta
 * che conterra' i metadati relativi alla tabella gestita dal DAO. 
 * @generated
 */
public abstract class DAOMetadata {
	public java.util.Map<String, String> columnsNamesMap = new java.util.HashMap<String, String>();

	public DAOMetadata() {
		// costruttore intenzionalmente vuoto
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui fanno riferimento i metadati.
	 * Questo metodo astratto deve essere definito nelle sottoclassi e restituire
	 * il nome della tabella gestita dallo specifico DAO.
	 * @return String
	 * @generated
	 */
	public abstract String getTableName();

	/**
	 * Method 'getColumnName'
	 * 
	 * @param prefixPropName prefisso (opzionale) da apporre al nome della property
	 *        nei casi in cui si debba scendere ricorsivamente in esempi annidati 
	 * @param propName nome della property
	 * @return String il nome di colonna associata alla property <prefixPropName>.<propName>
	 *                o <propName> se <prefixPropName> e' nullo
	 * @generated
	 */

	public String getColumnName(String prefixPropName, String propName) {
		if (prefixPropName != null && prefixPropName.length() > 0)
			return getColumnName(prefixPropName + "." + propName);
		else
			return getColumnName(propName);
	}

	/**
	 * Method 'getColumnName'
	 * 
	 * @param propName nel formato <prefixPropName>.<propName> oppure <propName>
	 * @return String il nome di colonna associata alla property <prefixPropName>.<propName>
	 *                o <propName> se <prefixPropName> e' nullo
	 * @generated
	 */
	public String getColumnName(String propName) {
		if (columnsNamesMap.containsKey(propName)) {
			return columnsNamesMap.get(propName);
		}

		/// se non trovato
		throw new IllegalArgumentException("proprieta' " + propName + " non trovata per il DTO RuoloProfiloLowDto");
	}

	/**
	 * Method 'getColumnNames'
	 * Restituisce l'elenco dei nomi di tutte le colonne gestite dal DAO 
	 * (ovvero l'elenco di tutte le colonne della tabella).
	 * Deve essere sovrascritto nelle sottoclassi specifiche in modo da restituire
	 * i nomi effettivi.
	 * @return String[]
	 * @generated
	 */
	public abstract String[] getColumnNames();

}
