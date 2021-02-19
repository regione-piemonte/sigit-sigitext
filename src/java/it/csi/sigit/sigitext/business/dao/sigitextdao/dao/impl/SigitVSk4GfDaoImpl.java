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

/*PROTECTED REGION ID(R-1180366877) ENABLED START*/
// aggiungere qui eventuali import custom. 
import it.csi.sigit.sigitext.business.util.GenericUtil;
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitVSk4Gf.
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
public class SigitVSk4GfDaoImpl extends AbstractDAO implements SigitVSk4GfDao {
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

	protected SigitVSk4GfDaoRowMapper byCodImpiantoOrderedRowMapper = new SigitVSk4GfDaoRowMapper(null,
			SigitVSk4GfDto.class, this);

	protected SigitVSk4GfDaoRowMapper attiviByCodImpiantoFkPgRowMapper = new SigitVSk4GfDaoRowMapper(null,
			SigitVSk4GfDto.class, this);

	protected SigitVSk4GfDaoRowMapper attiviByCodImpiantoProgressiviRowMapper = new SigitVSk4GfDaoRowMapper(
			new String[]{"CODICE_IMPIANTO", "ID_TIPO_COMPONENTE", "PROGRESSIVO", "DATA_INSTALL", "MATRICOLA",
					"FK_MARCA", "DES_MARCA", "ID_COMBUSTIBILE", "DES_COMBUSTIBILE", "FK_DETTAGLIO_GF",
					"DES_DETTAGLIO_GF", "MODELLO", "FLG_SORGENTE_EXT", "FLG_FLUIDO_UTENZE", "FLUIDO_FRIGORIGENO",
					"N_CIRCUITI", "RAFFRESCAMENTO_EER", "RAFF_POTENZA_KW", "RAFF_POTENZA_ASS", "RISCALDAMENTO_COP",
					"RISC_POTENZA_KW", "RISC_POTENZA_ASS_KW", "UTENTE_ULT_MOD", "POTENZA_TERMICA_KW",
					"TEMPO_MANUT_ANNI"},
			SigitVSk4GfDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_SK4_GF";
	}

	/** 
	 * Implementazione del finder byCodImpiantoOrdered
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVSk4GfDto> findByCodImpiantoOrdered(java.lang.Integer input) throws SigitVSk4GfDaoException {
		LOG.debug("[SigitVSk4GfDaoImpl::findByCodImpiantoOrdered] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT CODICE_IMPIANTO,ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,MATRICOLA,FK_MARCA,DES_MARCA,ID_COMBUSTIBILE,DES_COMBUSTIBILE,FK_DETTAGLIO_GF,DES_DETTAGLIO_GF,MODELLO,FLG_SORGENTE_EXT,FLG_FLUIDO_UTENZE,FLUIDO_FRIGORIGENO,N_CIRCUITI,RAFFRESCAMENTO_EER,RAFF_POTENZA_KW,RAFF_POTENZA_ASS,RISCALDAMENTO_COP,RISC_POTENZA_KW,RISC_POTENZA_ASS_KW,FLG_DISMISSIONE,DATA_DISMISS,DATA_ULT_MOD,UTENTE_ULT_MOD,POTENZA_TERMICA_KW,DATA_CONTROLLO,TEMPO_MANUT_ANNI,ID_ALLEGATO,FK_TIPO_DOCUMENTO,DES_TIPO_DOCUMENTO ");
		sql.append(" FROM VISTA_SK4_GF");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-1428564742) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append("CODICE_IMPIANTO = :codImpianto");
		sql.append(" ORDER BY PROGRESSIVO ASC, DATA_INSTALL DESC");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-1210947792) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input, java.sql.Types.NUMERIC);

		/*PROTECTED REGION END*/
		List<SigitVSk4GfDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byCodImpiantoOrderedRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitVSk4GfDaoImpl::findByCodImpiantoOrdered] esecuzione query", ex);
			throw new SigitVSk4GfDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVSk4GfDaoImpl", "findByCodImpiantoOrdered", "esecuzione query", sql.toString());
			LOG.debug("[SigitVSk4GfDaoImpl::findByCodImpiantoOrdered] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder attiviByCodImpiantoFkPg
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVSk4GfDto> findAttiviByCodImpiantoFkPg(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.AllegatiCompFilter input)
			throws SigitVSk4GfDaoException {
		LOG.debug("[SigitVSk4GfDaoImpl::findAttiviByCodImpiantoFkPg] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
		/*PROTECTED REGION ID(R1652333052) ENABLED START*/
		// la clausola select e'customizzabile poiche' il finder ha l'attributo customSelect == true
		sql.append(
				"SELECT c.CODICE_IMPIANTO,c.ID_TIPO_COMPONENTE,c.PROGRESSIVO,DATA_INSTALL,MATRICOLA,FK_MARCA,DES_MARCA,ID_COMBUSTIBILE,DES_COMBUSTIBILE,FK_DETTAGLIO_GF,DES_DETTAGLIO_GF,MODELLO,FLG_SORGENTE_EXT,FLG_FLUIDO_UTENZE,FLUIDO_FRIGORIGENO,N_CIRCUITI,RAFFRESCAMENTO_EER,RAFF_POTENZA_KW,RAFF_POTENZA_ASS,RISCALDAMENTO_COP,RISC_POTENZA_KW,RISC_POTENZA_ASS_KW,FLG_DISMISSIONE,DATA_DISMISS,c.DATA_ULT_MOD,c.UTENTE_ULT_MOD,POTENZA_TERMICA_KW,DATA_CONTROLLO,TEMPO_MANUT_ANNI,ID_ALLEGATO,FK_TIPO_DOCUMENTO,DES_TIPO_DOCUMENTO ");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-222118742) ENABLED START*/
		// la clausola from e'customizzabile poiche' il finder ha l'attributo customFrom==true
		sql.append(" FROM VISTA_SK4_GF c, SIGIT_R_COMP4_MANUT cm");
		/*PROTECTED REGION END*/
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R1714492360) ENABLED START*/
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
		/*PROTECTED REGION ID(R1734541858) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input.getCodImpianto(), java.sql.Types.NUMERIC);
		paramMap.addValue("dataControllo", input.getDataControllo(), java.sql.Types.DATE);
		paramMap.addValue("fkPg", input.getIdImpRuoloPfPg(), java.sql.Types.NUMERIC);

		/*PROTECTED REGION END*/
		List<SigitVSk4GfDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, attiviByCodImpiantoFkPgRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitVSk4GfDaoImpl::findAttiviByCodImpiantoFkPg] esecuzione query", ex);
			throw new SigitVSk4GfDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVSk4GfDaoImpl", "findAttiviByCodImpiantoFkPg", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitVSk4GfDaoImpl::findAttiviByCodImpiantoFkPg] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder attiviByCodImpiantoProgressivi
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVSk4GfDto> findAttiviByCodImpiantoProgressivi(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.CompFilter input) throws SigitVSk4GfDaoException {
		LOG.debug("[SigitVSk4GfDaoImpl::findAttiviByCodImpiantoProgressivi] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT DISTINCT CODICE_IMPIANTO,ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,MATRICOLA,FK_MARCA,DES_MARCA,ID_COMBUSTIBILE,DES_COMBUSTIBILE,FK_DETTAGLIO_GF,DES_DETTAGLIO_GF,MODELLO,FLG_SORGENTE_EXT,FLG_FLUIDO_UTENZE,FLUIDO_FRIGORIGENO,N_CIRCUITI,RAFFRESCAMENTO_EER,RAFF_POTENZA_KW,RAFF_POTENZA_ASS,RISCALDAMENTO_COP,RISC_POTENZA_KW,RISC_POTENZA_ASS_KW,UTENTE_ULT_MOD,POTENZA_TERMICA_KW,TEMPO_MANUT_ANNI ");
		sql.append(" FROM VISTA_SK4_GF");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R886318077) ENABLED START*/
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
		/*PROTECTED REGION ID(R1830942861) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input.getCodImpianto(), java.sql.Types.NUMERIC);

		paramMap.addValue("dataRapporto", input.getDataInstallazione(), java.sql.Types.DATE);

		/*PROTECTED REGION END*/
		List<SigitVSk4GfDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, attiviByCodImpiantoProgressiviRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitVSk4GfDaoImpl::findAttiviByCodImpiantoProgressivi] esecuzione query", ex);
			throw new SigitVSk4GfDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVSk4GfDaoImpl", "findAttiviByCodImpiantoProgressivi", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitVSk4GfDaoImpl::findAttiviByCodImpiantoProgressivi] END");
		}
		return list;
	}

}
