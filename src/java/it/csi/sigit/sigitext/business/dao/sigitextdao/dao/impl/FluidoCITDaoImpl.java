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

/*PROTECTED REGION ID(R1728431299) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO FluidoCIT.
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
public class FluidoCITDaoImpl extends AbstractDAO implements FluidoCITDao {
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

	protected FluidoCITDaoRowMapper findAllRowMapper = new FluidoCITDaoRowMapper(
			new String[]{"ID_FLUIDO", "DES_FLUIDO"}, FluidoCITDto.class, this);

	protected FluidoCITDaoRowMapper findByPrimaryKeyRowMapper = new FluidoCITDaoRowMapper(null, FluidoCITDto.class,
			this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_D_FLUIDO";
	}

	/** 
	 * Restituisce tutte le righe della tabella SIGIT_D_FLUIDO.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<FluidoCITDto> findAll() throws FluidoCITDaoException {
		LOG.debug("[FluidoCITDaoImpl::findAll] START");
		final StringBuilder sql = new StringBuilder("SELECT DISTINCT ID_FLUIDO,DES_FLUIDO FROM " + getTableName());

		sql.append(" ORDER BY ID_FLUIDO ASC");
		MapSqlParameterSource params = new MapSqlParameterSource();

		List<FluidoCITDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findAllRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[FluidoCITDaoImpl::findAll] ERROR esecuzione query", ex);
			throw new FluidoCITDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("FluidoCITDaoImpl", "findAll", "esecuzione query", sql.toString());
			LOG.debug("[FluidoCITDaoImpl::findAll] END");
		}
		return list;
	}

	/** 
	 * Returns all rows from the SIGIT_D_FLUIDO table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public FluidoCITDto findByPrimaryKey(FluidoCITPk pk) throws FluidoCITDaoException {
		LOG.debug("[FluidoCITDaoImpl::findByPrimaryKey] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT ID_FLUIDO,DES_FLUIDO FROM " + getTableName() + " WHERE ID_FLUIDO = :ID_FLUIDO ");

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_FLUIDO]
		params.addValue("ID_FLUIDO", pk.getIdFluido(), java.sql.Types.NUMERIC);

		List<FluidoCITDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findByPrimaryKeyRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[FluidoCITDaoImpl::findByPrimaryKey] ERROR esecuzione query", ex);
			throw new FluidoCITDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("FluidoCITDaoImpl", "findByPrimaryKey", "esecuzione query", sql.toString());
			LOG.debug("[FluidoCITDaoImpl::findByPrimaryKey] END");
		}
		return list.isEmpty() ? null : list.get(0);
	}

}
