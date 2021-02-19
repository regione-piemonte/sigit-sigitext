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

/*PROTECTED REGION ID(R-1928114109) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTConsumo.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 *   - ByCodImpiantoAndTipo (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 *   - ByCodImpianto (datagen::CustomDeleter)
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTConsumoDaoImpl extends AbstractDAO implements SigitTConsumoDao {
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
	 * Metodo di inserimento del DAO sigitTConsumo. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTConsumoPk
	 * @generated
	 */

	public SigitTConsumoPk insert(SigitTConsumoDto dto)

	{
		LOG.debug("[SigitTConsumoDaoImpl::insert] START");
		java.math.BigDecimal newKey = java.math.BigDecimal.valueOf(incrementer.nextLongValue());

		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_CONSUMO,CODICE_IMPIANTO,FK_TIPO_CONSUMO,FK_COMBUSTIBILE,FK_UNITA_MISURA,ACQUISTI,LETTURA_INIZIALE,LETTURA_FINALE,CONSUMO,ESERCIZIO_DA,ESERCIZIO_A,DATA_ULT_MOD,UTENTE_ULT_MOD ) VALUES (  :ID_CONSUMO , :CODICE_IMPIANTO , :FK_TIPO_CONSUMO , :FK_COMBUSTIBILE , :FK_UNITA_MISURA , :ACQUISTI , :LETTURA_INIZIALE , :LETTURA_FINALE , :CONSUMO , :ESERCIZIO_DA , :ESERCIZIO_A , :DATA_ULT_MOD , :UTENTE_ULT_MOD  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_CONSUMO]
		params.addValue("ID_CONSUMO", newKey, java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_TIPO_CONSUMO]
		params.addValue("FK_TIPO_CONSUMO", dto.getFkTipoConsumo(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FK_COMBUSTIBILE]
		params.addValue("FK_COMBUSTIBILE", dto.getFkCombustibile(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_UNITA_MISURA]
		params.addValue("FK_UNITA_MISURA", dto.getFkUnitaMisura(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [ACQUISTI]
		params.addValue("ACQUISTI", dto.getAcquisti(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [LETTURA_INIZIALE]
		params.addValue("LETTURA_INIZIALE", dto.getLetturaIniziale(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [LETTURA_FINALE]
		params.addValue("LETTURA_FINALE", dto.getLetturaFinale(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CONSUMO]
		params.addValue("CONSUMO", dto.getConsumo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [ESERCIZIO_DA]
		params.addValue("ESERCIZIO_DA", dto.getEsercizioDa(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [ESERCIZIO_A]
		params.addValue("ESERCIZIO_A", dto.getEsercizioA(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		insert(jdbcTemplate, sql.toString(), params);

		dto.setIdConsumo(newKey);
		LOG.debug("[SigitTConsumoDaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Custom deleter in the SIGIT_T_CONSUMO table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(Integer filter) throws SigitTConsumoDaoException {
		LOG.debug("[SigitTConsumoDaoImpl::customDeleterByCodImpianto] START");
		/*PROTECTED REGION ID(R-1721714566) ENABLED START*/
		//***scrivere la custom query
		final String sql = "DELETE FROM " + getTableName() + " WHERE CODICE_IMPIANTO = :codImpianto";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("codImpianto", filter, java.sql.Types.NUMERIC);
		/*PROTECTED REGION END*/

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTConsumoDaoImpl::customDeleterByCodImpianto] END");
	}

	protected SigitTConsumoDaoRowMapper ByCodImpiantoAndTipoRowMapper = new SigitTConsumoDaoRowMapper(null,
			SigitTConsumoDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_CONSUMO";
	}

	/** 
	 * Implementazione del finder ByCodImpiantoAndTipo
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTConsumoDto> findByCodImpiantoAndTipo(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTConsumoDto input)
			throws SigitTConsumoDaoException {
		LOG.debug("[SigitTConsumoDaoImpl::findByCodImpiantoAndTipo] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_CONSUMO,CODICE_IMPIANTO,FK_TIPO_CONSUMO,FK_COMBUSTIBILE,FK_UNITA_MISURA,ACQUISTI,LETTURA_INIZIALE,LETTURA_FINALE,CONSUMO,ESERCIZIO_DA,ESERCIZIO_A,DATA_ULT_MOD,UTENTE_ULT_MOD ");
		sql.append(" FROM SIGIT_T_CONSUMO");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R776212175) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append("CODICE_IMPIANTO = :codImpianto");
		sql.append(" AND FK_TIPO_CONSUMO = :tipoConsumo");
		sql.append(" ORDER BY FK_COMBUSTIBILE ASC, FK_UNITA_MISURA ASC, ESERCIZIO_DA ASC, ESERCIZIO_A ASC");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-1582340101) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input.getCodiceImpianto(), java.sql.Types.NUMERIC);
		paramMap.addValue("tipoConsumo", input.getFkTipoConsumo(), java.sql.Types.VARCHAR);

		/*PROTECTED REGION END*/
		List<SigitTConsumoDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, ByCodImpiantoAndTipoRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitTConsumoDaoImpl::findByCodImpiantoAndTipo] esecuzione query", ex);
			throw new SigitTConsumoDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTConsumoDaoImpl", "findByCodImpiantoAndTipo", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitTConsumoDaoImpl::findByCodImpiantoAndTipo] END");
		}
		return list;
	}

}
