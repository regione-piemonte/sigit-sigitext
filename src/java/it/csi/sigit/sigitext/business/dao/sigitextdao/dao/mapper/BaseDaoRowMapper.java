/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import java.io.*;
import java.sql.*;
import it.csi.sigit.sigitext.business.dao.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 * Classe base di tutti i row mapper utilizzati nello strato DAO.
 * @generated
 */
public class BaseDaoRowMapper {
	protected static final Logger log = Logger
			.getLogger(Constants.APPLICATION_CODE);
	/**
	 * @generated
	 */
	public final java.util.Map<String, String> columnsToReadMap = new java.util.HashMap<String, String>();
	/**
	 * @generated
	 */
	public boolean mapAllColumns = true;
	/**
	 * @generated
	 */
	public Class dtoClass;

	/**
	 * @generated
	 */
	/**
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...)
	 */
	public BaseDaoRowMapper(String[] columnsToRead, Class dtoClass) {
		if (columnsToRead != null) {
			mapAllColumns = false;
			for (int i = 0; i < columnsToRead.length; i++)
				columnsToReadMap.put(columnsToRead[i], columnsToRead[i]);
		}
		this.dtoClass = dtoClass;
	}
	/**
	 * @generated
	 */
	public Object getNewDto() {
		Object dtoInstance = null;

		try {
			dtoInstance = dtoClass.newInstance();
			return dtoInstance;
		} catch (InstantiationException e) {
			log.error(
					"Si e' verificato un errore nella chiamata al dao supplier: ",
					e);
			throw new RuntimeException("Impossibile istanziare la classe "
					+ dtoClass.getName() + " ," + e.getCause());
		} catch (IllegalAccessException e) {
			log.error(
					"Si e' verificato un errore nella chiamata al dao supplier: ",
					e);
			throw new RuntimeException("Impossibile accedere alla classe "
					+ dtoClass.getName() + " ," + e.getCause());
		}
	}

	// there is no specific code for POSGRESQL

}
