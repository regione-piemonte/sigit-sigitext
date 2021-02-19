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

/*PROTECTED REGION ID(R-393828817) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTLibTxt.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 *   - findByPrimaryKey (datagen::FindByPK)
  * - UPDATERS:
 *   - update (datagen::UpdateRow)
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTLibTxtDaoImpl extends AbstractDAO implements SigitTLibTxtDao {
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

	/**
	 * Metodo di inserimento del DAO sigitTLibTxt. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTLibTxtPk
	 * @generated
	 */

	public SigitTLibTxtPk insert(SigitTLibTxtDto dto)

	{
		LOG.debug("[SigitTLibTxtDaoImpl::insert] START");
		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_LIBRETTO,XML_LIBRETTO ) VALUES (  :ID_LIBRETTO , :XML_LIBRETTO  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_LIBRETTO]
		params.addValue("ID_LIBRETTO", dto.getIdLibretto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [XML_LIBRETTO]
		params.addValue("XML_LIBRETTO", dto.getXmlLibretto(), java.sql.Types.VARCHAR);

		insert(jdbcTemplate, sql.toString(), params);

		LOG.debug("[SigitTLibTxtDaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Updates a single row in the SIGIT_T_LIB_TXT table.
	 * @generated
	 */
	public void update(SigitTLibTxtDto dto) throws SigitTLibTxtDaoException {
		LOG.debug("[SigitTLibTxtDaoImpl::update] START");
		final String sql = "UPDATE " + getTableName()
				+ " SET XML_LIBRETTO = :XML_LIBRETTO  WHERE ID_LIBRETTO = :ID_LIBRETTO ";

		if (dto.getIdLibretto() == null) {
			LOG.error("[SigitTLibTxtDaoImpl::update] ERROR chiave primaria non impostata");
			throw new SigitTLibTxtDaoException("Chiave primaria non impostata");
		}

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_LIBRETTO]
		params.addValue("ID_LIBRETTO", dto.getIdLibretto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [XML_LIBRETTO]
		params.addValue("XML_LIBRETTO", dto.getXmlLibretto(), java.sql.Types.VARCHAR);

		update(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTLibTxtDaoImpl::update] END");
	}

	protected SigitTLibTxtDaoRowMapper findByPrimaryKeyRowMapper = new SigitTLibTxtDaoRowMapper(null,
			SigitTLibTxtDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_LIB_TXT";
	}

	/** 
	 * Returns all rows from the SIGIT_T_LIB_TXT table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitTLibTxtDto findByPrimaryKey(SigitTLibTxtPk pk) throws SigitTLibTxtDaoException {
		LOG.debug("[SigitTLibTxtDaoImpl::findByPrimaryKey] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT ID_LIBRETTO,XML_LIBRETTO FROM " + getTableName() + " WHERE ID_LIBRETTO = :ID_LIBRETTO ");

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_LIBRETTO]
		params.addValue("ID_LIBRETTO", pk.getIdLibretto(), java.sql.Types.NUMERIC);

		List<SigitTLibTxtDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findByPrimaryKeyRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitTLibTxtDaoImpl::findByPrimaryKey] ERROR esecuzione query", ex);
			throw new SigitTLibTxtDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTLibTxtDaoImpl", "findByPrimaryKey", "esecuzione query", sql.toString());
			LOG.debug("[SigitTLibTxtDaoImpl::findByPrimaryKey] END");
		}
		return list.isEmpty() ? null : list.get(0);
	}

}
