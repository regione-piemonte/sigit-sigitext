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

/*PROTECTED REGION ID(R1248756783) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO userElencoWs.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - byUtenteFunzionalita (datagen::CustomFinder)
 *   - byIdUtenteAndIdFunzionalita (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class UserElencoWsDaoImpl extends AbstractDAO implements UserElencoWsDao {
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

	protected UserElencoWsDaoRowMapper byUtenteFunzionalitaRowMapper = new UserElencoWsDaoRowMapper(null,
			UserElencoWsByUtenteFunzionalitaDto.class, this);

	protected UserElencoWsDaoRowMapper byIdUtenteAndIdFunzionalitaRowMapper = new UserElencoWsDaoRowMapper(null,
			UserElencoWsDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_R_USER_ELENCO_WS";
	}

	/** 
		 * Implementazione del finder byUtenteFunzionalita con Qdef
		 * @generated
		 */

	public List<UserElencoWsByUtenteFunzionalitaDto> findByUtenteFunzionalita(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.UtenteFunzionalitaFilter input)
			throws UserElencoWsDaoException {
		LOG.debug("[UserElencoWsDaoImpl::findByUtenteFunzionalita] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append("SELECT utente.ID_USER_WS");

		sql.append(" FROM SIGIT_R_USER_ELENCO_WS userelenco, SIGIT_T_USER_WS utente");

		sql.append(" WHERE ");

		sql.append("userelenco.ID_USER_WS = utente.ID_USER_WS");

		sql.append(" AND ");

		sql.append("utente.USER_WS = :user AND utente.PWD_WS = :pwd AND userelenco.ID_ELENCO_WS = :idFunz");
		/*PROTECTED REGION ID(R-1443078201) ENABLED START*///inserire qui i parametri indicati nella espressione di where, ad esempio:

		paramMap.addValue("user", input.getUser());
		paramMap.addValue("pwd", input.getPwd());
		paramMap.addValue("idFunz", input.getIdFunzionalita());

		/*PROTECTED REGION END*/

		List<UserElencoWsByUtenteFunzionalitaDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);

		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byUtenteFunzionalitaRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[UserElencoWsDaoImpl::findByUtenteFunzionalita] ERROR esecuzione query", ex);
			throw new UserElencoWsDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("UserElencoWsDaoImpl", "findByUtenteFunzionalita", "esecuzione query",
					sql.toString());
			LOG.debug("[UserElencoWsDaoImpl::findByUtenteFunzionalita] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder byIdUtenteAndIdFunzionalita
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<UserElencoWsDto> findByIdUtenteAndIdFunzionalita(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.UtenteFunzionalitaFilter input)
			throws UserElencoWsDaoException {
		LOG.debug("[UserElencoWsDaoImpl::findByIdUtenteAndIdFunzionalita] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append("SELECT ID_USER_WS,ID_ELENCO_WS ");
		sql.append(" FROM SIGIT_R_USER_ELENCO_WS");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R2118600204) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append("ID_USER_WS = :idUtente");
		sql.append(" AND ID_ELENCO_WS = :idFunzionalita");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R1376983134) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("idUtente", input.getIdUtente());
		paramMap.addValue("idFunzionalita", input.getIdFunzionalita());

		/*PROTECTED REGION END*/
		List<UserElencoWsDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byIdUtenteAndIdFunzionalitaRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[UserElencoWsDaoImpl::findByIdUtenteAndIdFunzionalita] esecuzione query", ex);
			throw new UserElencoWsDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("UserElencoWsDaoImpl", "findByIdUtenteAndIdFunzionalita", "esecuzione query",
					sql.toString());
			LOG.debug("[UserElencoWsDaoImpl::findByIdUtenteAndIdFunzionalita] END");
		}
		return list;
	}

}
