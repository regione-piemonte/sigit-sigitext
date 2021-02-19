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

/*PROTECTED REGION ID(R858289019) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO Allegato.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - byCodiceImpianto (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class AllegatoDaoImpl extends AbstractDAO implements AllegatoDao {
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

	protected AllegatoDaoRowMapper byCodiceImpiantoRowMapper = new AllegatoDaoRowMapper(null,
			AllegatoByCodiceImpiantoDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_ALLEGATO";
	}

	/** 
		 * Implementazione del finder byCodiceImpianto con Qdef
		 * @generated
		 */

	public List<AllegatoByCodiceImpiantoDto> findByCodiceImpianto(java.lang.Integer input) throws AllegatoDaoException {
		LOG.debug("[AllegatoDaoImpl::findByCodiceImpianto] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT tipodoc.DES_TIPO_DOCUMENTO, allegato.FK_SIGLA_BOLLINO, allegato.FK_NUMERO_BOLLINO, allegato.DATA_CONTROLLO, allegato.ELENCO_APPARECCHIATURE, allegato.UID_INDEX");

		sql.append(" FROM SIGIT_T_ALLEGATO allegato, SIGIT_D_TIPO_DOCUMENTO tipodoc");

		sql.append(" WHERE ");

		sql.append("allegato.FK_TIPO_DOCUMENTO = tipodoc.ID_TIPO_DOCUMENTO");

		sql.append(" AND ");

		sql.append("impruolopfpg.CODICE_IMPIANTO = :codImpianto");
		/*PROTECTED REGION ID(R338224668) ENABLED START*///inserire qui i parametri indicati nella espressione di where, ad esempio:

		paramMap.addValue("codImpianto", input);

		/*PROTECTED REGION END*/

		List<AllegatoByCodiceImpiantoDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);

		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byCodiceImpiantoRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[AllegatoDaoImpl::findByCodiceImpianto] ERROR esecuzione query", ex);
			throw new AllegatoDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("AllegatoDaoImpl", "findByCodiceImpianto", "esecuzione query", sql.toString());
			LOG.debug("[AllegatoDaoImpl::findByCodiceImpianto] END");
		}
		return list;
	}

}
