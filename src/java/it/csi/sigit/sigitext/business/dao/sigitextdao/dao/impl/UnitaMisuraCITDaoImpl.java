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

/*PROTECTED REGION ID(R-1368458223) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO UnitaMisuraCIT.
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
public class UnitaMisuraCITDaoImpl extends AbstractDAO implements UnitaMisuraCITDao {
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

	protected UnitaMisuraCITDaoRowMapper findAllRowMapper = new UnitaMisuraCITDaoRowMapper(
			new String[]{"ID_UNITA_MISURA", "DES_UNITA_MISURA"}, UnitaMisuraCITDto.class, this);

	protected UnitaMisuraCITDaoRowMapper findByPrimaryKeyRowMapper = new UnitaMisuraCITDaoRowMapper(null,
			UnitaMisuraCITDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_D_UNITA_MISURA";
	}

	/** 
	 * Restituisce tutte le righe della tabella SIGIT_D_UNITA_MISURA.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<UnitaMisuraCITDto> findAll() throws UnitaMisuraCITDaoException {
		LOG.debug("[UnitaMisuraCITDaoImpl::findAll] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT DISTINCT ID_UNITA_MISURA,DES_UNITA_MISURA FROM " + getTableName());

		sql.append(" ORDER BY ID_UNITA_MISURA ASC");
		MapSqlParameterSource params = new MapSqlParameterSource();

		List<UnitaMisuraCITDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findAllRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[UnitaMisuraCITDaoImpl::findAll] ERROR esecuzione query", ex);
			throw new UnitaMisuraCITDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("UnitaMisuraCITDaoImpl", "findAll", "esecuzione query", sql.toString());
			LOG.debug("[UnitaMisuraCITDaoImpl::findAll] END");
		}
		return list;
	}

	/** 
	 * Returns all rows from the SIGIT_D_UNITA_MISURA table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public UnitaMisuraCITDto findByPrimaryKey(UnitaMisuraCITPk pk) throws UnitaMisuraCITDaoException {
		LOG.debug("[UnitaMisuraCITDaoImpl::findByPrimaryKey] START");
		final StringBuilder sql = new StringBuilder("SELECT ID_UNITA_MISURA,DES_UNITA_MISURA FROM " + getTableName()
				+ " WHERE ID_UNITA_MISURA = :ID_UNITA_MISURA ");

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_UNITA_MISURA]
		params.addValue("ID_UNITA_MISURA", pk.getIdUnitaMisura(), java.sql.Types.VARCHAR);

		List<UnitaMisuraCITDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findByPrimaryKeyRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[UnitaMisuraCITDaoImpl::findByPrimaryKey] ERROR esecuzione query", ex);
			throw new UnitaMisuraCITDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("UnitaMisuraCITDaoImpl", "findByPrimaryKey", "esecuzione query", sql.toString());
			LOG.debug("[UnitaMisuraCITDaoImpl::findByPrimaryKey] END");
		}
		return list.isEmpty() ? null : list.get(0);
	}

}
