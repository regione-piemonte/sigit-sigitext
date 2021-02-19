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

/*PROTECTED REGION ID(R-2015968519) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTCompBrRc.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 *   - byTipoAndCodImpiantoOrdered (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 *   - ByCodImpianto (datagen::CustomDeleter)
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTCompBrRcDaoImpl extends AbstractDAO implements SigitTCompBrRcDao {
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
	 * Metodo di inserimento del DAO sigitTCompBrRc. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTCompBrRcPk
	 * @generated
	 */

	public SigitTCompBrRcPk insert(SigitTCompBrRcDto dto)

	{
		LOG.debug("[SigitTCompBrRcDaoImpl::insert] START");
		java.math.BigDecimal newKey = java.math.BigDecimal.valueOf(incrementer.nextLongValue());

		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_COMP_BR_RC,TIPOLOGIA_BR_RC,PROGRESSIVO_BR_RC,FK_TIPO_COMPONENTE,FK_PROGRESSIVO,FK_DATA_INSTALL,CODICE_IMPIANTO,TIPOLOGIA,POT_TERM_MAX_KW,POT_TERM_MIN_KW,DATA_INSTALL,DATA_DISMISS,FK_MARCA,MODELLO,MATRICOLA,FK_COMBUSTIBILE,FLG_DISMISSIONE ) VALUES (  :ID_COMP_BR_RC , :TIPOLOGIA_BR_RC , :PROGRESSIVO_BR_RC , :FK_TIPO_COMPONENTE , :FK_PROGRESSIVO , :FK_DATA_INSTALL , :CODICE_IMPIANTO , :TIPOLOGIA , :POT_TERM_MAX_KW , :POT_TERM_MIN_KW , :DATA_INSTALL , :DATA_DISMISS , :FK_MARCA , :MODELLO , :MATRICOLA , :FK_COMBUSTIBILE , :FLG_DISMISSIONE  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_COMP_BR_RC]
		params.addValue("ID_COMP_BR_RC", newKey, java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TIPOLOGIA_BR_RC]
		params.addValue("TIPOLOGIA_BR_RC", dto.getTipologiaBrRc(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PROGRESSIVO_BR_RC]
		params.addValue("PROGRESSIVO_BR_RC", dto.getProgressivoBrRc(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_TIPO_COMPONENTE]
		params.addValue("FK_TIPO_COMPONENTE", dto.getFkTipoComponente(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FK_PROGRESSIVO]
		params.addValue("FK_PROGRESSIVO", dto.getFkProgressivo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_DATA_INSTALL]
		params.addValue("FK_DATA_INSTALL", dto.getFkDataInstall(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TIPOLOGIA]
		params.addValue("TIPOLOGIA", dto.getTipologia(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [POT_TERM_MAX_KW]
		params.addValue("POT_TERM_MAX_KW", dto.getPotTermMaxKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [POT_TERM_MIN_KW]
		params.addValue("POT_TERM_MIN_KW", dto.getPotTermMinKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INSTALL]
		params.addValue("DATA_INSTALL", dto.getDataInstall(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [DATA_DISMISS]
		params.addValue("DATA_DISMISS", dto.getDataDismiss(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [FK_MARCA]
		params.addValue("FK_MARCA", dto.getFkMarca(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [MODELLO]
		params.addValue("MODELLO", dto.getModello(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [MATRICOLA]
		params.addValue("MATRICOLA", dto.getMatricola(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FK_COMBUSTIBILE]
		params.addValue("FK_COMBUSTIBILE", dto.getFkCombustibile(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FLG_DISMISSIONE]
		params.addValue("FLG_DISMISSIONE", dto.getFlgDismissione(), java.sql.Types.NUMERIC);

		insert(jdbcTemplate, sql.toString(), params);

		dto.setIdCompBrRc(newKey);
		LOG.debug("[SigitTCompBrRcDaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Custom deleter in the SIGIT_T_COMP_BR_RC table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(Integer filter) throws SigitTCompBrRcDaoException {
		LOG.debug("[SigitTCompBrRcDaoImpl::customDeleterByCodImpianto] START");
		/*PROTECTED REGION ID(R-1280075788) ENABLED START*/
		//***scrivere la custom query
		final String sql = "DELETE FROM " + getTableName() + " WHERE CODICE_IMPIANTO = :codImpianto";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("codImpianto", filter, java.sql.Types.NUMERIC);
		/*PROTECTED REGION END*/

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTCompBrRcDaoImpl::customDeleterByCodImpianto] END");
	}

	protected SigitTCompBrRcDaoRowMapper byTipoAndCodImpiantoOrderedRowMapper = new SigitTCompBrRcDaoRowMapper(null,
			SigitTCompBrRcDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_COMP_BR_RC";
	}

	/** 
	 * Implementazione del finder byTipoAndCodImpiantoOrdered
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTCompBrRcDto> findByTipoAndCodImpiantoOrdered(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompBrRcDto input)
			throws SigitTCompBrRcDaoException {
		LOG.debug("[SigitTCompBrRcDaoImpl::findByTipoAndCodImpiantoOrdered] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_COMP_BR_RC,TIPOLOGIA_BR_RC,PROGRESSIVO_BR_RC,FK_TIPO_COMPONENTE,FK_PROGRESSIVO,FK_DATA_INSTALL,CODICE_IMPIANTO,TIPOLOGIA,POT_TERM_MAX_KW,POT_TERM_MIN_KW,DATA_INSTALL,DATA_DISMISS,FK_MARCA,MODELLO,MATRICOLA,FK_COMBUSTIBILE,FLG_DISMISSIONE ");
		sql.append(" FROM SIGIT_T_COMP_BR_RC");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-114684646) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append(" 1 = 1 ");
		if (input.getTipologiaBrRc() != null)
			sql.append(" AND TIPOLOGIA_BR_RC = :tipoBrRc");
		sql.append(" AND CODICE_IMPIANTO = :codImpianto");
		sql.append(" ORDER BY PROGRESSIVO_BR_RC ASC, DATA_INSTALL DESC");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R864629520) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("tipoBrRc", input.getTipologiaBrRc(), java.sql.Types.VARCHAR);
		paramMap.addValue("codImpianto", input.getCodiceImpianto(), java.sql.Types.NUMERIC);

		/*PROTECTED REGION END*/
		List<SigitTCompBrRcDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byTipoAndCodImpiantoOrderedRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitTCompBrRcDaoImpl::findByTipoAndCodImpiantoOrdered] esecuzione query", ex);
			throw new SigitTCompBrRcDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTCompBrRcDaoImpl", "findByTipoAndCodImpiantoOrdered", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitTCompBrRcDaoImpl::findByTipoAndCodImpiantoOrdered] END");
		}
		return list;
	}

}
