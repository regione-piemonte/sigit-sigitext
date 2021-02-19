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

/*PROTECTED REGION ID(R-1487326685) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTPersonaFisica.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - byCodiceFiscale (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTPersonaFisicaDaoImpl extends AbstractDAO implements SigitTPersonaFisicaDao {
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

	protected SigitTPersonaFisicaDaoRowMapper byCodiceFiscaleRowMapper = new SigitTPersonaFisicaDaoRowMapper(null,
			SigitTPersonaFisicaDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_PERSONA_FISICA";
	}

	/** 
	 * Implementazione del finder byCodiceFiscale
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTPersonaFisicaDto> findByCodiceFiscale(String input) throws SigitTPersonaFisicaDaoException {
		LOG.debug("[SigitTPersonaFisicaDaoImpl::findByCodiceFiscale] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_PERSONA_FISICA,NOME,COGNOME,CODICE_FISCALE,FK_L2,INDIRIZZO_SITAD,INDIRIZZO_NON_TROVATO,ISTAT_COMUNE,SIGLA_PROV,COMUNE,PROVINCIA,CIVICO,CAP,EMAIL,FLG_ACCREDITATO,DATA_ULT_MOD,UTENTE_ULT_MOD,FLG_INDIRIZZO_ESTERO,STATO_ESTERO,CITTA_ESTERO,INDIRIZZO_ESTERO,CAP_ESTERO,FLG_NEWSLETTER,FLG_GDPR ");
		sql.append(" FROM SIGIT_T_PERSONA_FISICA");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-561673572) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append("CODICE_FISCALE = :codiceFiscale");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-107125298) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codiceFiscale", input);

		/*PROTECTED REGION END*/
		List<SigitTPersonaFisicaDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byCodiceFiscaleRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitTPersonaFisicaDaoImpl::findByCodiceFiscale] esecuzione query", ex);
			throw new SigitTPersonaFisicaDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTPersonaFisicaDaoImpl", "findByCodiceFiscale", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitTPersonaFisicaDaoImpl::findByCodiceFiscale] END");
		}
		return list;
	}

}
