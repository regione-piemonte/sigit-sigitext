/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl;

import java.io.*;
import java.sql.*;

import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;

import it.csi.sigit.sigitext.business.dao.util.*;
import org.apache.log4j.Logger;
import it.csi.util.performance.StopWatch;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * Base class for Oracle DAO classes.
 *
 * @generated
 */
public abstract class AbstractDAO {
	protected static final Logger log = Logger
			.getLogger(Constants.APPLICATION_CODE);
	/**
	 * @generated
	 */
	protected DataFieldMaxValueIncrementer incrementer;

	/**
	 * @generated
	 */
	public void setIncrementer(DataFieldMaxValueIncrementer incrementer) {
		this.incrementer = incrementer;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 * @generated
	 */
	public abstract String getTableName();

	/**
	 * Metodo di generico di inserimento (opera su qualsiasi specifico DAO).
	 * @param jdbcTemplate
	 * @param sql
	 * @param params  
	 */
	public void insert(NamedParameterJdbcTemplate jdbcTemplate, String sql,
			MapSqlParameterSource params) {
		String actualDaoClassName = this.getClass().getSimpleName();
		log.debug("[AbstractDAO::insert] START (" + actualDaoClassName + ")");
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			jdbcTemplate.update(sql.toString(), params);
		} catch (RuntimeException ex) {
			log.error("[AbstractDAO::insert] ERROR (" + actualDaoClassName
					+ ") esecuzione query", ex);
			throw ex;
		} finally {
			stopWatch.dumpElapsed("AbstractDAO", "insert", "esecuzione query",
					sql);
			log.debug("[AbstractDAO::insert] END (" + actualDaoClassName + ")");
		}
	}

	/**
	 * Metodo di generico di aggiornamento dati (opera su qualsiasi specifico DAO).
	 * @param jdbcTemplate
	 * @param sql
	 * @param params  
	 */
	public void update(NamedParameterJdbcTemplate jdbcTemplate, String sql,
			MapSqlParameterSource params) {
		String actualDaoClassName = this.getClass().getSimpleName();
		log.debug("[AbstractDAO::update] START (" + actualDaoClassName + ")");
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			jdbcTemplate.update(sql.toString(), params);
		} catch (RuntimeException ex) {
			log.error("[AbstractDAO::update] ERROR (" + actualDaoClassName
					+ ") esecuzione query", ex);
			throw ex;
		} finally {
			stopWatch.dumpElapsed("AbstractDAO", "update", "esecuzione query",
					sql);
			log.debug("[AbstractDAO::update] END (" + actualDaoClassName + ")");
		}
	}

	/**
	 * Metodo di generico di cancellazione (opera su qualsiasi specifico DAO).
	 * @param jdbcTemplate
	 * @param sql
	 * @param params  
	 */
	public void delete(NamedParameterJdbcTemplate jdbcTemplate, String sql,
			MapSqlParameterSource params) {
		String actualDaoClassName = this.getClass().getSimpleName();
		log.debug("[AbstractDAO::delete] START (" + actualDaoClassName + ")");
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			jdbcTemplate.update(sql.toString(), params);
		} catch (RuntimeException ex) {
			log.error("[AbstractDAO::delete] ERROR (" + actualDaoClassName
					+ ") esecuzione query", ex);
			throw ex;
		} finally {
			stopWatch.dumpElapsed("AbstractDAO", "delete", "esecuzione query",
					sql);
			log.debug("[AbstractDAO::delete] END (" + actualDaoClassName + ")");
		}
	}

	// there is no specific code for POSGRESQL

}
