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

/*PROTECTED REGION ID(R579102717) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitRComp4Manut.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 *   - attiviByFilter (datagen::CustomFinder)
 *   - byPersonaGiuridicaCodImpianto (datagen::CustomFinder)
 *   - byRuoloFunzPersonaGiuridicaCodImpianto (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 *   - ByCodImpianto (datagen::CustomDeleter)
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitRComp4ManutDaoImpl extends AbstractDAO implements SigitRComp4ManutDao {
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
	 * Metodo di inserimento del DAO sigitRComp4Manut. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitRComp4ManutPk
	 * @generated
	 */

	public SigitRComp4ManutPk insert(SigitRComp4ManutDto dto)

	{
		LOG.debug("[SigitRComp4ManutDaoImpl::insert] START");
		Integer newKey = Integer.valueOf(incrementer.nextIntValue());

		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_R_COMP4_MANUT,FK_PERSONA_GIURIDICA,CODICE_IMPIANTO,ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INIZIO,DATA_FINE,DATA_ULT_MOD,UTENTE_ULT_MOD,FK_RUOLO ) VALUES (  :ID_R_COMP4_MANUT , :FK_PERSONA_GIURIDICA , :CODICE_IMPIANTO , :ID_TIPO_COMPONENTE , :PROGRESSIVO , :DATA_INIZIO , :DATA_FINE , :DATA_ULT_MOD , :UTENTE_ULT_MOD , :FK_RUOLO  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_R_COMP4_MANUT]
		params.addValue("ID_R_COMP4_MANUT", newKey, java.sql.Types.INTEGER);

		// valorizzazione paametro relativo a colonna [FK_PERSONA_GIURIDICA]
		params.addValue("FK_PERSONA_GIURIDICA", dto.getFkPersonaGiuridica(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [ID_TIPO_COMPONENTE]
		params.addValue("ID_TIPO_COMPONENTE", dto.getIdTipoComponente(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PROGRESSIVO]
		params.addValue("PROGRESSIVO", dto.getProgressivo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INIZIO]
		params.addValue("DATA_INIZIO", dto.getDataInizio(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [DATA_FINE]
		params.addValue("DATA_FINE", dto.getDataFine(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FK_RUOLO]
		params.addValue("FK_RUOLO", dto.getFkRuolo(), java.sql.Types.NUMERIC);

		insert(jdbcTemplate, sql.toString(), params);

		dto.setIdRComp4Manut(newKey);
		LOG.debug("[SigitRComp4ManutDaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Custom deleter in the SIGIT_R_COMP4_MANUT table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(Integer filter) throws SigitRComp4ManutDaoException {
		LOG.debug("[SigitRComp4ManutDaoImpl::customDeleterByCodImpianto] START");
		/*PROTECTED REGION ID(R-1491680750) ENABLED START*/
		//***scrivere la custom query
		final String sql = "DELETE FROM " + getTableName() + " WHERE CODICE_IMPIANTO = :codImpianto";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("codImpianto", filter, java.sql.Types.NUMERIC);
		/*PROTECTED REGION END*/

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitRComp4ManutDaoImpl::customDeleterByCodImpianto] END");
	}

	protected SigitRComp4ManutDaoRowMapper attiviByFilterRowMapper = new SigitRComp4ManutDaoRowMapper(null,
			SigitRComp4ManutDto.class, this);

	protected SigitRComp4ManutDaoRowMapper byPersonaGiuridicaCodImpiantoRowMapper = new SigitRComp4ManutDaoRowMapper(
			null, SigitRComp4ManutDto.class, this);

	protected SigitRComp4ManutDaoRowMapper byRuoloFunzPersonaGiuridicaCodImpiantoRowMapper = new SigitRComp4ManutDaoRowMapper(
			null, SigitRComp4ManutDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_R_COMP4_MANUT";
	}

	/** 
	 * Implementazione del finder attiviByFilter
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitRComp4ManutDto> findAttiviByFilter(SigitRComp4ManutDto input) throws SigitRComp4ManutDaoException {
		LOG.debug("[SigitRComp4ManutDaoImpl::findAttiviByFilter] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_R_COMP4_MANUT,FK_PERSONA_GIURIDICA,CODICE_IMPIANTO,ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INIZIO,DATA_FINE,DATA_ULT_MOD,UTENTE_ULT_MOD,FK_RUOLO ");
		sql.append(" FROM SIGIT_R_COMP4_MANUT");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R211723726) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append(" DATA_FINE IS NULL");

		if (input.getCodiceImpianto() != null)
			sql.append(" AND CODICE_IMPIANTO = :codImpianto");

		if (input.getFkRuolo() != null)
			sql.append(" AND FK_RUOLO = :ruolo");

		if (input.getIdTipoComponente() != null)
			sql.append(" AND ID_TIPO_COMPONENTE = :idTipoComp");

		if (input.getProgressivo() != null)
			sql.append(" AND PROGRESSIVO = :progressivo");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-1901612836) ENABLED START*/
		//***aggiungere tutte le condizioni

		if (input.getCodiceImpianto() != null)
			paramMap.addValue("codImpianto", input.getCodiceImpianto(), java.sql.Types.NUMERIC);

		if (input.getFkRuolo() != null)
			paramMap.addValue("ruolo", input.getFkRuolo(), java.sql.Types.NUMERIC);

		if (input.getIdTipoComponente() != null)
			paramMap.addValue("idTipoComp", input.getIdTipoComponente(), java.sql.Types.VARCHAR);

		if (input.getProgressivo() != null)
			paramMap.addValue("progressivo", input.getProgressivo(), java.sql.Types.NUMERIC);

		/*PROTECTED REGION END*/
		List<SigitRComp4ManutDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, attiviByFilterRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitRComp4ManutDaoImpl::findAttiviByFilter] esecuzione query", ex);
			throw new SigitRComp4ManutDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitRComp4ManutDaoImpl", "findAttiviByFilter", "esecuzione query", sql.toString());
			LOG.debug("[SigitRComp4ManutDaoImpl::findAttiviByFilter] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder byPersonaGiuridicaCodImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitRComp4ManutDto> findByPersonaGiuridicaCodImpianto(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.CompFilter input)
			throws SigitRComp4ManutDaoException {
		LOG.debug("[SigitRComp4ManutDaoImpl::findByPersonaGiuridicaCodImpianto] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_R_COMP4_MANUT,FK_PERSONA_GIURIDICA,CODICE_IMPIANTO,ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INIZIO,DATA_FINE,DATA_ULT_MOD,UTENTE_ULT_MOD,FK_RUOLO ");
		sql.append(" FROM SIGIT_R_COMP4_MANUT");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R1981733715) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append("  DATA_FINE IS NULL");
		if (input.getIdPG() != null)
			sql.append(" AND FK_PERSONA_GIURIDICA = :idPersonaGiuridica");
		if (input.getCodImpianto() != null)
			sql.append(" AND CODICE_IMPIANTO = :codiceImpianto");
		if (input.getIdRuolo() != null)
			sql.append(" AND FK_RUOLO = :idRuolo");

		if (input.getListProgressivi() != null && !input.getListProgressivi().isEmpty()) {
			sql.append(" AND PROGRESSIVO IN  (");
			boolean aggVirg = false;
			for (String progr : input.getListProgressivi()) {
				if (aggVirg)
					sql.append(", ");
				sql.append(progr);
				aggVirg = true;
			}
			sql.append(") ");
		}
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R1429089271) ENABLED START*/
		//***aggiungere tutte le condizioni

		if (input.getIdPG() != null)
			paramMap.addValue("idPersonaGiuridica", input.getIdPG(), java.sql.Types.NUMERIC);
		if (input.getCodImpianto() != null)
			paramMap.addValue("codiceImpianto", input.getCodImpianto(), java.sql.Types.NUMERIC);
		if (input.getIdRuolo() != null)
			paramMap.addValue("idRuolo", input.getIdRuolo(), java.sql.Types.NUMERIC);

		/*PROTECTED REGION END*/
		List<SigitRComp4ManutDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byPersonaGiuridicaCodImpiantoRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitRComp4ManutDaoImpl::findByPersonaGiuridicaCodImpianto] esecuzione query", ex);
			throw new SigitRComp4ManutDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitRComp4ManutDaoImpl", "findByPersonaGiuridicaCodImpianto", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitRComp4ManutDaoImpl::findByPersonaGiuridicaCodImpianto] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder byRuoloFunzPersonaGiuridicaCodImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitRComp4ManutDto> findByRuoloFunzPersonaGiuridicaCodImpianto(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.CompFilter input)
			throws SigitRComp4ManutDaoException {
		LOG.debug("[SigitRComp4ManutDaoImpl::findByRuoloFunzPersonaGiuridicaCodImpianto] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_R_COMP4_MANUT,FK_PERSONA_GIURIDICA,CODICE_IMPIANTO,ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INIZIO,DATA_FINE,DATA_ULT_MOD,UTENTE_ULT_MOD,FK_RUOLO ");
		/*PROTECTED REGION ID(R1271990851) ENABLED START*/
		// la clausola from e'customizzabile poiche' il finder ha l'attributo customFrom==true
		sql.append(" FROM SIGIT_R_COMP4_MANUT as comp4Manut, SIGIT_D_RUOLO as ruolo");
		/*PROTECTED REGION END*/
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R787249487) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append("comp4Manut.FK_RUOLO = ruolo.ID_RUOLO");
		sql.append(" AND comp4Manut.DATA_FINE IS NULL");
		sql.append(" AND comp4Manut.FK_PERSONA_GIURIDICA = :idPersonaGiuridica");
		sql.append(" AND comp4Manut.CODICE_IMPIANTO = :codiceImpianto");
		sql.append(" AND ruolo.RUOLO_FUNZ = :ruoloFunz");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-1240183429) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("idPersonaGiuridica", input.getIdPG());
		paramMap.addValue("codiceImpianto", input.getCodImpianto());
		paramMap.addValue("ruoloFunz", input.getRuoloFunz());

		/*PROTECTED REGION END*/
		List<SigitRComp4ManutDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byRuoloFunzPersonaGiuridicaCodImpiantoRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitRComp4ManutDaoImpl::findByRuoloFunzPersonaGiuridicaCodImpianto] esecuzione query", ex);
			throw new SigitRComp4ManutDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitRComp4ManutDaoImpl", "findByRuoloFunzPersonaGiuridicaCodImpianto",
					"esecuzione query", sql.toString());
			LOG.debug("[SigitRComp4ManutDaoImpl::findByRuoloFunzPersonaGiuridicaCodImpianto] END");
		}
		return list;
	}

}
