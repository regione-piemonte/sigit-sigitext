package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.metadata.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import it.csi.sigit.sigitext.business.dao.impl.*;
import it.csi.sigit.sigitext.business.dao.util.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import it.csi.util.performance.StopWatch;
import org.apache.log4j.Logger;
import java.util.Map;
import java.util.TreeMap;

/*PROTECTED REGION ID(R-127535955) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO MarcaCIT.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - findAll (datagen::FindAll)
 *   - findByPrimaryKey (datagen::FindByPK)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class MarcaCITDaoImpl extends AbstractDAO implements MarcaCITDao {
	protected static final Logger LOG = Logger.getLogger(Constants.APPLICATION_CODE);
	/**
	 * Il DAO utilizza JDBC template per l'implementazione delle query.
	 * @generated
	 */
	protected NamedParameterJdbcTemplate jdbcTemplate;

	/**
	 * Imposta il JDBC template utilizato per l'implementazione delle query
	 * @generated
	 */
	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	protected MarcaCITDaoRowMapper findAllRowMapper = new MarcaCITDaoRowMapper(new String[]{"ID_MARCA", "DES_MARCA"},
			MarcaCITDto.class, this);

	protected MarcaCITDaoRowMapper findByPrimaryKeyRowMapper = new MarcaCITDaoRowMapper(null, MarcaCITDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_D_MARCA";
	}

	/** 
	 * Restituisce tutte le righe della tabella SIGIT_D_MARCA.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<MarcaCITDto> findAll() throws MarcaCITDaoException {
		LOG.debug("[MarcaCITDaoImpl::findAll] START");
		final StringBuilder sql = new StringBuilder("SELECT DISTINCT ID_MARCA,DES_MARCA FROM " + getTableName());

		sql.append(" ORDER BY DES_MARCA ASC");
		MapSqlParameterSource params = new MapSqlParameterSource();

		List<MarcaCITDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findAllRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[MarcaCITDaoImpl::findAll] ERROR esecuzione query", ex);
			throw new MarcaCITDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("MarcaCITDaoImpl", "findAll", "esecuzione query", sql.toString());
			LOG.debug("[MarcaCITDaoImpl::findAll] END");
		}
		return list;
	}

	/** 
	 * Returns all rows from the SIGIT_D_MARCA table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public MarcaCITDto findByPrimaryKey(MarcaCITPk pk) throws MarcaCITDaoException {
		LOG.debug("[MarcaCITDaoImpl::findByPrimaryKey] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT ID_MARCA,DES_MARCA FROM " + getTableName() + " WHERE ID_MARCA = :ID_MARCA ");

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_MARCA]
		params.addValue("ID_MARCA", pk.getIdMarca(), java.sql.Types.NUMERIC);

		List<MarcaCITDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findByPrimaryKeyRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[MarcaCITDaoImpl::findByPrimaryKey] ERROR esecuzione query", ex);
			throw new MarcaCITDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("MarcaCITDaoImpl", "findByPrimaryKey", "esecuzione query", sql.toString());
			LOG.debug("[MarcaCITDaoImpl::findByPrimaryKey] END");
		}
		return list.isEmpty() ? null : list.get(0);
	}

}
