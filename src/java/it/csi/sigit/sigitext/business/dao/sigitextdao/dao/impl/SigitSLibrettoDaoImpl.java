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

/*PROTECTED REGION ID(R-950806715) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitSLibretto.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 
 *    --
  * - UPDATERS:
 *   - storicizzaByCodImpianto (datagen::CustomUpdater)
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitSLibrettoDaoImpl extends AbstractDAO implements SigitSLibrettoDao {
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
	 * Custom updater in the SIGIT_S_LIBRETTO table.
	 * @generated
	 */
	public void customUpdaterStoricizzaByCodImpianto(SigitSLibrettoDto filter, java.lang.Object value)
			throws SigitSLibrettoDaoException {
		LOG.debug("[SigitSLibrettoDaoImpl::customUpdaterStoricizzaByCodImpianto] START");
		/*PROTECTED REGION ID(R1416535062) ENABLED START*/
		//***scrivere la custom query
		final String sql = "UPDATE " + getTableName()
				+ " SET FK_STATO = 3 ,  data_ult_mod = :dataUltMod, utente_ult_mod =  :utenteUltMod"
				+ " WHERE CODICE_IMPIANTO = :codImpianto AND FK_STATO = 2";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("codImpianto", filter.getCodiceImpianto(), java.sql.Types.NUMERIC);
		params.addValue("dataUltMod", filter.getDataUltMod(), java.sql.Types.TIMESTAMP);
		params.addValue("utenteUltMod", filter.getUtenteUltMod(), java.sql.Types.VARCHAR);
		/*PROTECTED REGION END*/

		update(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitSLibrettoDaoImpl::customUpdaterStoricizzaByCodImpianto] END");
	}

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_S_LIBRETTO";
	}

}
