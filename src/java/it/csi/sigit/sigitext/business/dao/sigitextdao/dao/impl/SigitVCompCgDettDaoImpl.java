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

/*PROTECTED REGION ID(R1424807045) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitVCompCgDett.
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
public class SigitVCompCgDettDaoImpl extends AbstractDAO implements SigitVCompCgDettDao {
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

	protected SigitVCompCgDettDaoRowMapper byCodImpiantoOrderedRowMapper = new SigitVCompCgDettDaoRowMapper(null,
			SigitVCompCgDettDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_COMP_CG_DETT";
	}

	/** 
	 * Implementazione del finder byCodImpiantoOrdered
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVCompCgDettDto> findByCodImpiantoOrdered(java.lang.Integer input)
			throws SigitVCompCgDettDaoException {
		LOG.debug("[SigitVCompCgDettDaoImpl::findByCodImpiantoOrdered] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT CODICE_IMPIANTO,FK_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,FK_ALLEGATO,FK_FLUIDO,E_POTENZA_ASSORB_COMB_KW,E_POTENZA_TERM_BYPASS_KW,E_TEMP_ARIA_C,E_TEMP_H2O_OUT_C,E_TEMP_H2O_IN_C,E_POTENZA_MORSETTI_KW,E_TEMP_H2O_MOTORE_C,E_TEMP_FUMI_VALLE_C,E_TEMP_FUMI_MONTE_C,DATA_ULT_MOD_DETT,UTENTE_ULT_MOD_DETT,DATA_CONTROLLO,L11_4_SOVRAFREQ_SOGLIA_HZ_MIN,L11_4_SOVRAFREQ_SOGLIA_HZ_MED,L11_4_SOVRAFREQ_SOGLIA_HZ_MAX,L11_4_SOVRAFREQ_TEMPO_S_MIN,L11_4_SOVRAFREQ_TEMPO_S_MED,L11_4_SOVRAFREQ_TEMPO_S_MAX,L11_4_SOTTOFREQ_SOGLIA_HZ_MIN,L11_4_SOTTOFREQ_SOGLIA_HZ_MED,L11_4_SOTTOFREQ_SOGLIA_HZ_MAX,L11_4_SOTTOFREQ_TEMPO_S_MIN,L11_4_SOTTOFREQ_TEMPO_S_MED,L11_4_SOTTOFREQ_TEMPO_S_MAX,L11_4_SOVRATENS_SOGLIA_V_MIN,L11_4_SOVRATENS_SOGLIA_V_MED,L11_4_SOVRATENS_SOGLIA_V_MAX,L11_4_SOVRATENS_TEMPO_S_MIN,L11_4_SOVRATENS_TEMPO_S_MED,L11_4_SOVRATENS_TEMPO_S_MAX,L11_4_SOTTOTENS_SOGLIA_V_MIN,L11_4_SOTTOTENS_SOGLIA_V_MED,L11_4_SOTTOTENS_SOGLIA_V_MAX,L11_4_SOTTOTENS_TEMPO_S_MIN,L11_4_SOTTOTENS_TEMPO_S_MED,L11_4_SOTTOTENS_TEMPO_S_MAX,CO_MIN,CO_MAX,SIGLA_REA,NUMERO_REA,ID_PERSONA_GIURIDICA,FK_RUOLO,FK_STATO_RAPP ");
		sql.append(" FROM VISTA_COMP_CG_DETT");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R1754521933) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append("CODICE_IMPIANTO = :codImpianto");
		sql.append(" AND FK_STATO_RAPP= " + Constants.ID_STATO_RAPPORTO_INVIATO);
		sql.append(" ORDER BY PROGRESSIVO ASC, DATA_CONTROLLO DESC, FK_ALLEGATO ASC");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-1319508675) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input, java.sql.Types.NUMERIC);

		/*PROTECTED REGION END*/
		List<SigitVCompCgDettDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byCodImpiantoOrderedRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitVCompCgDettDaoImpl::findByCodImpiantoOrdered] esecuzione query", ex);
			throw new SigitVCompCgDettDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVCompCgDettDaoImpl", "findByCodImpiantoOrdered", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitVCompCgDettDaoImpl::findByCodImpiantoOrdered] END");
		}
		return list;
	}

}
