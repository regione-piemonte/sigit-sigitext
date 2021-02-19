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

/*PROTECTED REGION ID(R-681761483) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitRImpRuoloPfpg.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - respImpAttivoByCodImpianto (datagen::CustomFinder)
 *   - byRuoloFunzPersonaGiuridicaCodImpianto (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitRImpRuoloPfpgDaoImpl extends AbstractDAO implements SigitRImpRuoloPfpgDao {
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

	protected SigitRImpRuoloPfpgDaoRowMapper respImpAttivoByCodImpiantoRowMapper = new SigitRImpRuoloPfpgDaoRowMapper(
			null, SigitRImpRuoloPfpgDto.class, this);

	protected SigitRImpRuoloPfpgDaoRowMapper byRuoloFunzPersonaGiuridicaCodImpiantoRowMapper = new SigitRImpRuoloPfpgDaoRowMapper(
			null, SigitRImpRuoloPfpgDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_R_IMP_RUOLO_PFPG";
	}

	/** 
	 * Implementazione del finder respImpAttivoByCodImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitRImpRuoloPfpgDto> findRespImpAttivoByCodImpianto(java.lang.Integer input)
			throws SigitRImpRuoloPfpgDaoException {
		LOG.debug("[SigitRImpRuoloPfpgDaoImpl::findRespImpAttivoByCodImpianto] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_IMP_RUOLO_PFPG,FK_RUOLO,CODICE_IMPIANTO,DATA_INIZIO,DATA_FINE,FK_PERSONA_FISICA,FK_PERSONA_GIURIDICA,DATA_ULT_MOD,UTENTE_ULT_MOD,FLG_PRIMO_CARICATORE ");
		sql.append(" FROM SIGIT_R_IMP_RUOLO_PFPG");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R1136823091) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append(" CODICE_IMPIANTO = :codImpianto");

		sql.append(" AND FK_RUOLO IN (" + Constants.ID_RUOLO_PROPRIETARIO + "," + Constants.ID_RUOLO_OCCUPANTE + ","
				+ Constants.ID_RUOLO_RESPONSABILE_IMPRESA_PROPRIETARIO + ","
				+ Constants.ID_RUOLO_RESPONSABILE_IMPRESA_OCCUPANTE + ","
				+ Constants.ID_RUOLO_RESPONSABILE_IMPRESA_AMMINISTRATORE + "," + Constants.ID_RUOLO_AMMINISTRATORE
				+ ")");

		sql.append(" AND DATA_INIZIO <= CURRENT_DATE");
		sql.append(" AND COALESCE(DATA_FINE,CURRENT_DATE) >= CURRENT_DATE");

		LOG.debug("[SigitRImpRuoloPfpgDaoImpl::findRespImpAttivoByCodImpianto] query: " + sql);

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R1006663703) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input);

		/*PROTECTED REGION END*/
		List<SigitRImpRuoloPfpgDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, respImpAttivoByCodImpiantoRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitRImpRuoloPfpgDaoImpl::findRespImpAttivoByCodImpianto] esecuzione query", ex);
			throw new SigitRImpRuoloPfpgDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitRImpRuoloPfpgDaoImpl", "findRespImpAttivoByCodImpianto", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitRImpRuoloPfpgDaoImpl::findRespImpAttivoByCodImpianto] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder byRuoloFunzPersonaGiuridicaCodImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitRImpRuoloPfpgDto> findByRuoloFunzPersonaGiuridicaCodImpianto(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.CompFilter input)
			throws SigitRImpRuoloPfpgDaoException {
		LOG.debug("[SigitRImpRuoloPfpgDaoImpl::findByRuoloFunzPersonaGiuridicaCodImpianto] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_IMP_RUOLO_PFPG,FK_RUOLO,CODICE_IMPIANTO,DATA_INIZIO,DATA_FINE,FK_PERSONA_FISICA,FK_PERSONA_GIURIDICA,DATA_ULT_MOD,UTENTE_ULT_MOD,FLG_PRIMO_CARICATORE ");
		/*PROTECTED REGION ID(R2136489215) ENABLED START*/
		// la clausola from e'customizzabile poiche' il finder ha l'attributo customFrom==true
		sql.append(" FROM SIGIT_R_IMP_RUOLO_PFPG as impRuoloPfPg, SIGIT_D_RUOLO as ruolo");
		/*PROTECTED REGION END*/
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R1816894995) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append("impRuoloPfPg.FK_RUOLO = ruolo.ID_RUOLO");
		sql.append(" AND impRuoloPfPg.DATA_FINE IS NULL");
		sql.append(" AND impRuoloPfPg.FK_PERSONA_GIURIDICA = :idPersonaGiuridica");
		sql.append(" AND impRuoloPfPg.CODICE_IMPIANTO = :codiceImpianto");
		sql.append(" AND ruolo.RUOLO_FUNZ = :ruoloFunz");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R614056247) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("idPersonaGiuridica", input.getIdPG());
		paramMap.addValue("codiceImpianto", input.getCodImpianto());
		paramMap.addValue("ruoloFunz", input.getRuoloFunz());

		/*PROTECTED REGION END*/
		List<SigitRImpRuoloPfpgDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byRuoloFunzPersonaGiuridicaCodImpiantoRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitRImpRuoloPfpgDaoImpl::findByRuoloFunzPersonaGiuridicaCodImpianto] esecuzione query", ex);
			throw new SigitRImpRuoloPfpgDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitRImpRuoloPfpgDaoImpl", "findByRuoloFunzPersonaGiuridicaCodImpianto",
					"esecuzione query", sql.toString());
			LOG.debug("[SigitRImpRuoloPfpgDaoImpl::findByRuoloFunzPersonaGiuridicaCodImpianto] END");
		}
		return list;
	}

}
