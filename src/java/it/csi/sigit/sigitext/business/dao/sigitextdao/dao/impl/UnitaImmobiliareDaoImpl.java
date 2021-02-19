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

/*PROTECTED REGION ID(R-1606409629) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO UnitaImmobiliare.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - byCodiceImpianto (datagen::CustomFinder)
 *   - byPod (datagen::CustomFinder)
 *   - byPdr (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class UnitaImmobiliareDaoImpl extends AbstractDAO implements UnitaImmobiliareDao {
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

	protected UnitaImmobiliareDaoRowMapper byCodiceImpiantoRowMapper = new UnitaImmobiliareDaoRowMapper(null,
			UnitaImmobiliareDto.class, this);

	protected UnitaImmobiliareDaoRowMapper byPodRowMapper = new UnitaImmobiliareDaoRowMapper(
			new String[]{"CODICE_IMPIANTO"}, UnitaImmobiliareDto.class, this);

	protected UnitaImmobiliareDaoRowMapper byPdrRowMapper = new UnitaImmobiliareDaoRowMapper(
			new String[]{"CODICE_IMPIANTO"}, UnitaImmobiliareDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_UNITA_IMMOBILIARE";
	}

	/** 
	 * Implementazione del finder byCodiceImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<UnitaImmobiliareDto> findByCodiceImpianto(java.lang.Integer input) throws UnitaImmobiliareDaoException {
		LOG.debug("[UnitaImmobiliareDaoImpl::findByCodiceImpianto] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_UNITA_IMM,CODICE_IMPIANTO,FK_L2,INDIRIZZO_SITAD,INDIRIZZO_NON_TROVATO,CIVICO,CAP,SCALA,PALAZZO,INTERNO,NOTE,FLG_PRINCIPALE,SEZIONE,FOGLIO,PARTICELLA,SUBALTERNO,POD_ELETTRICO,PDR_GAS,DATA_ULT_MOD,UTENTE_ULT_MOD,L1_2_FLG_SINGOLA_UNITA,L1_2_FK_CATEGORIA,L1_2_VOL_RISC_M3,L1_2_VOL_RAFF_M3,FLG_NOPDR,FLG_NOACCATASTATO ");
		sql.append(" FROM SIGIT_T_UNITA_IMMOBILIARE");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-132743322) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append("CODICE_IMPIANTO = :codImpianto");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R304810564) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input);

		/*PROTECTED REGION END*/
		List<UnitaImmobiliareDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byCodiceImpiantoRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[UnitaImmobiliareDaoImpl::findByCodiceImpianto] esecuzione query", ex);
			throw new UnitaImmobiliareDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("UnitaImmobiliareDaoImpl", "findByCodiceImpianto", "esecuzione query",
					sql.toString());
			LOG.debug("[UnitaImmobiliareDaoImpl::findByCodiceImpianto] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder byPod
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<UnitaImmobiliareDto> findByPod(String input) throws UnitaImmobiliareDaoException {
		LOG.debug("[UnitaImmobiliareDaoImpl::findByPod] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append("SELECT DISTINCT CODICE_IMPIANTO ");
		sql.append(" FROM SIGIT_T_UNITA_IMMOBILIARE");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R1253252493) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append("POD_ELETTRICO = :pod");

		sql.append(
				" LIMIT (select valore_config_num from sigit_wrk_config where chiave_config = 'MAX_RISULTATI_WS')+1");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R321007869) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("pod", input);

		/*PROTECTED REGION END*/
		List<UnitaImmobiliareDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byPodRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[UnitaImmobiliareDaoImpl::findByPod] esecuzione query", ex);
			throw new UnitaImmobiliareDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("UnitaImmobiliareDaoImpl", "findByPod", "esecuzione query", sql.toString());
			LOG.debug("[UnitaImmobiliareDaoImpl::findByPod] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder byPdr
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<UnitaImmobiliareDto> findByPdr(String input) throws UnitaImmobiliareDaoException {
		LOG.debug("[UnitaImmobiliareDaoImpl::findByPdr] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append("SELECT DISTINCT CODICE_IMPIANTO ");
		sql.append(" FROM SIGIT_T_UNITA_IMMOBILIARE");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R481454708) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append("PDR_GAS = :pdr");
		sql.append(
				" LIMIT (select valore_config_num from sigit_wrk_config where chiave_config = 'MAX_RISULTATI_WS')+1");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-2129886986) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("pdr", input);

		/*PROTECTED REGION END*/
		List<UnitaImmobiliareDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byPdrRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[UnitaImmobiliareDaoImpl::findByPdr] esecuzione query", ex);
			throw new UnitaImmobiliareDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("UnitaImmobiliareDaoImpl", "findByPdr", "esecuzione query", sql.toString());
			LOG.debug("[UnitaImmobiliareDaoImpl::findByPdr] END");
		}
		return list;
	}

}
