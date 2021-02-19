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

/*PROTECTED REGION ID(R1234090407) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTUserWS.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - byUserWS (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTUserWSDaoImpl extends AbstractDAO implements SigitTUserWSDao {
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

	protected SigitTUserWSDaoRowMapper byUserWSRowMapper = new SigitTUserWSDaoRowMapper(null, SigitTUserWSDto.class,
			this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_USER_WS";
	}

	/** 
	 * Implementazione del finder byUserWS
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTUserWSDto> findByUserWS(String input) throws SigitTUserWSDaoException {
		LOG.debug("[SigitTUserWSDaoImpl::findByUserWS] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append("SELECT ID_USER_WS,USER_WS,PWD_WS,DT_CREAZIONE_TOKEN,DT_SCADENZA_TOKEN,TOKEN ");
		sql.append(" FROM SIGIT_T_USER_WS");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R424080261) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append("USER_WS = :user_ws");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R386472453) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("user_ws", input);

		/*PROTECTED REGION END*/
		List<SigitTUserWSDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byUserWSRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitTUserWSDaoImpl::findByUserWS] esecuzione query", ex);
			throw new SigitTUserWSDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTUserWSDaoImpl", "findByUserWS", "esecuzione query", sql.toString());
			LOG.debug("[SigitTUserWSDaoImpl::findByUserWS] END");
		}
		return list;
	}

}
