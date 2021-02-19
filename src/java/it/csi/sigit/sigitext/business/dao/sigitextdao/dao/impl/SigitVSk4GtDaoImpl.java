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

/*PROTECTED REGION ID(R-1021941085) ENABLED START*/
// aggiungere qui eventuali import custom. 
import it.csi.sigit.sigitext.business.util.GenericUtil;
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitVSk4Gt.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - byCodImpiantoOrdered (datagen::CustomFinder)
 *   - attiviByCodImpiantoFkPg (datagen::CustomFinder)
 *   - attiviByCodImpiantoProgressivi (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitVSk4GtDaoImpl extends AbstractDAO implements SigitVSk4GtDao {
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

	protected SigitVSk4GtDaoRowMapper byCodImpiantoOrderedRowMapper = new SigitVSk4GtDaoRowMapper(null,
			SigitVSk4GtDto.class, this);

	protected SigitVSk4GtDaoRowMapper attiviByCodImpiantoFkPgRowMapper = new SigitVSk4GtDaoRowMapper(null,
			SigitVSk4GtDto.class, this);

	protected SigitVSk4GtDaoRowMapper attiviByCodImpiantoProgressiviRowMapper = new SigitVSk4GtDaoRowMapper(
			new String[]{"CODICE_IMPIANTO", "ID_TIPO_COMPONENTE", "PROGRESSIVO", "DATA_INSTALL", "DATA_DISMISS",
					"MATRICOLA", "FK_MARCA", "DES_MARCA", "ID_COMBUSTIBILE", "DES_COMBUSTIBILE", "FK_FLUIDO",
					"DES_FLUIDO", "FK_DETTAGLIO_GT", "DES_DETTAGLIO_GT", "MODELLO", "POTENZA_TERMICA_KW",
					"RENDIMENTO_PERC", "N_MODULI", "FLG_DISMISSIONE", "TEMPO_MANUT_ANNI"},
			SigitVSk4GtDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_SK4_GT";
	}

	/** 
	 * Implementazione del finder byCodImpiantoOrdered
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVSk4GtDto> findByCodImpiantoOrdered(java.lang.Integer input) throws SigitVSk4GtDaoException {
		LOG.debug("[SigitVSk4GtDaoImpl::findByCodImpiantoOrdered] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT CODICE_IMPIANTO,ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,DATA_DISMISS,MATRICOLA,FK_MARCA,DES_MARCA,ID_COMBUSTIBILE,DES_COMBUSTIBILE,FK_FLUIDO,DES_FLUIDO,FK_DETTAGLIO_GT,DES_DETTAGLIO_GT,MODELLO,POTENZA_TERMICA_KW,DATA_ULT_MOD,UTENTE_ULT_MOD,RENDIMENTO_PERC,N_MODULI,FLG_DISMISSIONE,DATA_CONTROLLO,TEMPO_MANUT_ANNI,ID_ALLEGATO,FK_TIPO_DOCUMENTO,DES_TIPO_DOCUMENTO ");
		sql.append(" FROM VISTA_SK4_GT");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R494752556) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append("CODICE_IMPIANTO = :codImpianto");
		sql.append(" ORDER BY PROGRESSIVO ASC, DATA_INSTALL DESC, DATA_CONTROLLO DESC");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-1717653698) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input, java.sql.Types.NUMERIC);

		/*PROTECTED REGION END*/
		List<SigitVSk4GtDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byCodImpiantoOrderedRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitVSk4GtDaoImpl::findByCodImpiantoOrdered] esecuzione query", ex);
			throw new SigitVSk4GtDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVSk4GtDaoImpl", "findByCodImpiantoOrdered", "esecuzione query", sql.toString());
			LOG.debug("[SigitVSk4GtDaoImpl::findByCodImpiantoOrdered] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder attiviByCodImpiantoFkPg
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVSk4GtDto> findAttiviByCodImpiantoFkPg(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.AllegatiCompFilter input)
			throws SigitVSk4GtDaoException {
		LOG.debug("[SigitVSk4GtDaoImpl::findAttiviByCodImpiantoFkPg] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
		/*PROTECTED REGION ID(R-1108234450) ENABLED START*/
		// la clausola select e'customizzabile poiche' il finder ha l'attributo customSelect == true
		sql.append(
				"SELECT c.CODICE_IMPIANTO,c.ID_TIPO_COMPONENTE,c.PROGRESSIVO,DATA_INSTALL,DATA_DISMISS,MATRICOLA,FK_MARCA,DES_MARCA,ID_COMBUSTIBILE,DES_COMBUSTIBILE,FK_FLUIDO,DES_FLUIDO,FK_DETTAGLIO_GT,DES_DETTAGLIO_GT,MODELLO,POTENZA_TERMICA_KW,c.DATA_ULT_MOD,c.UTENTE_ULT_MOD,RENDIMENTO_PERC,N_MODULI,FLG_DISMISSIONE,DATA_CONTROLLO,TEMPO_MANUT_ANNI,ID_ALLEGATO,FK_TIPO_DOCUMENTO,DES_TIPO_DOCUMENTO ");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R1249867356) ENABLED START*/
		// la clausola from e'customizzabile poiche' il finder ha l'attributo customFrom==true
		sql.append(" FROM VISTA_SK4_GT c, SIGIT_R_COMP4_MANUT cm");
		/*PROTECTED REGION END*/
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R101421142) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append(" c.CODICE_IMPIANTO = cm.CODICE_IMPIANTO ");
		sql.append(" AND c.ID_TIPO_COMPONENTE = cm.ID_TIPO_COMPONENTE ");
		sql.append(" AND c.PROGRESSIVO = cm.PROGRESSIVO ");

		sql.append(" AND c.CODICE_IMPIANTO = :codImpianto");

		if (GenericUtil.isNotNullOrEmpty(input.getDataControllo())) {
			sql.append(" AND DATA_INSTALL <= :dataControllo");
			sql.append(" AND (DATA_DISMISS >= :dataControllo OR DATA_DISMISS IS NULL)");
		} else {
			sql.append(" AND DATA_INSTALL <= current_timestamp");
			sql.append(" AND (DATA_DISMISS >= current_timestamp OR DATA_DISMISS IS NULL)");
		}

		sql.append(" AND cm.FK_PERSONA_GIURIDICA = :fkPg");

		sql.append(" ORDER BY c.PROGRESSIVO, DATA_INSTALL ASC ");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-1026025644) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input.getCodImpianto(), java.sql.Types.NUMERIC);
		paramMap.addValue("dataControllo", input.getDataControllo(), java.sql.Types.DATE);
		paramMap.addValue("fkPg", input.getIdImpRuoloPfPg(), java.sql.Types.NUMERIC);

		/*PROTECTED REGION END*/
		List<SigitVSk4GtDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, attiviByCodImpiantoFkPgRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitVSk4GtDaoImpl::findAttiviByCodImpiantoFkPg] esecuzione query", ex);
			throw new SigitVSk4GtDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVSk4GtDaoImpl", "findAttiviByCodImpiantoFkPg", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitVSk4GtDaoImpl::findAttiviByCodImpiantoFkPg] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder attiviByCodImpiantoProgressivi
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVSk4GtDto> findAttiviByCodImpiantoProgressivi(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.CompFilter input) throws SigitVSk4GtDaoException {
		LOG.debug("[SigitVSk4GtDaoImpl::findAttiviByCodImpiantoProgressivi] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT DISTINCT CODICE_IMPIANTO,ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,DATA_DISMISS,MATRICOLA,FK_MARCA,DES_MARCA,ID_COMBUSTIBILE,DES_COMBUSTIBILE,FK_FLUIDO,DES_FLUIDO,FK_DETTAGLIO_GT,DES_DETTAGLIO_GT,MODELLO,POTENZA_TERMICA_KW,RENDIMENTO_PERC,N_MODULI,FLG_DISMISSIONE,TEMPO_MANUT_ANNI ");
		sql.append(" FROM VISTA_SK4_GT");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-1671623761) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append("CODICE_IMPIANTO = :codImpianto");

		sql.append(" AND :dataRapporto BETWEEN DATA_INSTALL AND COALESCE(DATA_DISMISS, :dataRapporto) ");

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

		sql.append(" ORDER BY PROGRESSIVO,  DATA_INSTALL ASC ");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-155842789) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input.getCodImpianto(), java.sql.Types.NUMERIC);

		paramMap.addValue("dataRapporto", input.getDataInstallazione(), java.sql.Types.DATE);

		/*PROTECTED REGION END*/
		List<SigitVSk4GtDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, attiviByCodImpiantoProgressiviRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitVSk4GtDaoImpl::findAttiviByCodImpiantoProgressivi] esecuzione query", ex);
			throw new SigitVSk4GtDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVSk4GtDaoImpl", "findAttiviByCodImpiantoProgressivi", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitVSk4GtDaoImpl::findAttiviByCodImpiantoProgressivi] END");
		}
		return list;
	}

}
