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

/*PROTECTED REGION ID(R-1109577379) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitVCompScDett.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - byCodImpiantoOrdered (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitVCompScDettDaoImpl extends AbstractDAO implements SigitVCompScDettDao {
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

	protected SigitVCompScDettDaoRowMapper byCodImpiantoOrderedRowMapper = new SigitVCompScDettDaoRowMapper(null,
			SigitVCompScDettDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_COMP_SC_DETT";
	}

	/** 
	 * Implementazione del finder byCodImpiantoOrdered
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVCompScDettDto> findByCodImpiantoOrdered(java.lang.Integer input)
			throws SigitVCompScDettDaoException {
		LOG.debug("[SigitVCompScDettDaoImpl::findByCodImpiantoOrdered] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT CODICE_IMPIANTO,FK_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,FK_ALLEGATO,FK_FLUIDO,FK_FLUIDO_ALIMENTAZ,E_FLUIDO_ALTRO,E_ALIMENTAZIONE_ALTRO,E_FLG_CLIMA_INVERNO,E_FLG_PRODUZ_ACS,E_FLG_POTENZA_COMPATIBILE,E_FLG_COIB_IDONEA,E_FLG_DISP_FUNZIONANTI,E_TEMP_EXT_C,E_TEMP_MAND_PRIMARIO_C,E_TEMP_RITOR_PRIMARIO_C,E_TEMP_MAND_SECONDARIO_C,E_TEMP_RIT_SECONDARIO_C,E_POTENZA_TERM_KW,E_PORT_FLUIDO_M3_H,DATA_ULT_MOD_DETT,UTENTE_ULT_MOD_DETT,DATA_CONTROLLO,SIGLA_REA,NUMERO_REA,ID_PERSONA_GIURIDICA,FK_RUOLO,FK_STATO_RAPP ");
		sql.append(" FROM VISTA_COMP_SC_DETT");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-770426911) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append("CODICE_IMPIANTO = :codImpianto");
		sql.append(" AND FK_STATO_RAPP= " + Constants.ID_STATO_RAPPORTO_INVIATO);

		sql.append(" ORDER BY PROGRESSIVO ASC, DATA_CONTROLLO DESC, FK_ALLEGATO ASC");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R2011455785) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input, java.sql.Types.NUMERIC);

		/*PROTECTED REGION END*/
		List<SigitVCompScDettDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byCodImpiantoOrderedRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitVCompScDettDaoImpl::findByCodImpiantoOrdered] esecuzione query", ex);
			throw new SigitVCompScDettDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVCompScDettDaoImpl", "findByCodImpiantoOrdered", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitVCompScDettDaoImpl::findByCodImpiantoOrdered] END");
		}
		return list;
	}

}
