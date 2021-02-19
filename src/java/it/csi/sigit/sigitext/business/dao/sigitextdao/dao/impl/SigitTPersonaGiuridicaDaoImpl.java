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

/*PROTECTED REGION ID(R423269787) ENABLED START*/
// aggiungere qui eventuali import custom. 
import it.csi.sigit.sigitext.business.util.GenericUtil;
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTPersonaGiuridica.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - findByPrimaryKey (datagen::FindByPK)
 *   - byCodiceReaAndFiscale (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTPersonaGiuridicaDaoImpl extends AbstractDAO implements SigitTPersonaGiuridicaDao {
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

	protected SigitTPersonaGiuridicaDaoRowMapper findByPrimaryKeyRowMapper = new SigitTPersonaGiuridicaDaoRowMapper(
			null, SigitTPersonaGiuridicaDto.class, this);

	protected SigitTPersonaGiuridicaDaoRowMapper byCodiceReaAndFiscaleRowMapper = new SigitTPersonaGiuridicaDaoRowMapper(
			null, SigitTPersonaGiuridicaDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_PERSONA_GIURIDICA";
	}

	/** 
	 * Returns all rows from the SIGIT_T_PERSONA_GIURIDICA table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitTPersonaGiuridicaDto findByPrimaryKey(SigitTPersonaGiuridicaPk pk)
			throws SigitTPersonaGiuridicaDaoException {
		LOG.debug("[SigitTPersonaGiuridicaDaoImpl::findByPrimaryKey] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT ID_PERSONA_GIURIDICA,DENOMINAZIONE,CODICE_FISCALE,FK_L2,INDIRIZZO_SITAD,INDIRIZZO_NON_TROVATO,SIGLA_PROV,ISTAT_COMUNE,COMUNE,PROVINCIA,CIVICO,CAP,EMAIL,DATA_INIZIO_ATTIVITA,DATA_CESSAZIONE,SIGLA_REA,NUMERO_REA,FLG_AMMINISTRATORE,DATA_ULT_MOD,UTENTE_ULT_MOD,FLG_TERZO_RESPONSABILE,FLG_DISTRIBUTORE,FLG_CAT,FLG_INDIRIZZO_ESTERO,STATO_ESTERO,CITTA_ESTERO,INDIRIZZO_ESTERO,CAP_ESTERO,FK_STATO_PG,DT_AGG_DICHIARAZIONE,FLG_DM37_LETTERAC,FLG_DM37_LETTERAD,FLG_DM37_LETTERAE,FLG_FGAS,FLG_CONDUTTORE,FLG_SOGG_INCARICATO,DELEGA_SOGG_INCARICATO,DT_CREAZIONE_TOKEN,DT_SCADENZA_TOKEN,TOKEN FROM "
						+ getTableName() + " WHERE ID_PERSONA_GIURIDICA = :ID_PERSONA_GIURIDICA ");

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_PERSONA_GIURIDICA]
		params.addValue("ID_PERSONA_GIURIDICA", pk.getIdPersonaGiuridica(), java.sql.Types.NUMERIC);

		List<SigitTPersonaGiuridicaDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findByPrimaryKeyRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitTPersonaGiuridicaDaoImpl::findByPrimaryKey] ERROR esecuzione query", ex);
			throw new SigitTPersonaGiuridicaDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTPersonaGiuridicaDaoImpl", "findByPrimaryKey", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitTPersonaGiuridicaDaoImpl::findByPrimaryKey] END");
		}
		return list.isEmpty() ? null : list.get(0);
	}

	/** 
	 * Implementazione del finder byCodiceReaAndFiscale
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTPersonaGiuridicaDto> findByCodiceReaAndFiscale(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.CodiceReaAndFiscaleFilter input)
			throws SigitTPersonaGiuridicaDaoException {
		LOG.debug("[SigitTPersonaGiuridicaDaoImpl::findByCodiceReaAndFiscale] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_PERSONA_GIURIDICA,DENOMINAZIONE,CODICE_FISCALE,FK_L2,INDIRIZZO_SITAD,INDIRIZZO_NON_TROVATO,SIGLA_PROV,ISTAT_COMUNE,COMUNE,PROVINCIA,CIVICO,CAP,EMAIL,DATA_INIZIO_ATTIVITA,DATA_CESSAZIONE,SIGLA_REA,NUMERO_REA,FLG_AMMINISTRATORE,DATA_ULT_MOD,UTENTE_ULT_MOD,FLG_TERZO_RESPONSABILE,FLG_DISTRIBUTORE,FLG_CAT,FLG_INDIRIZZO_ESTERO,STATO_ESTERO,CITTA_ESTERO,INDIRIZZO_ESTERO,CAP_ESTERO,FK_STATO_PG,DT_AGG_DICHIARAZIONE,FLG_DM37_LETTERAC,FLG_DM37_LETTERAD,FLG_DM37_LETTERAE,FLG_FGAS,FLG_CONDUTTORE,FLG_SOGG_INCARICATO,DELEGA_SOGG_INCARICATO,DT_CREAZIONE_TOKEN,DT_SCADENZA_TOKEN,TOKEN ");
		sql.append(" FROM SIGIT_T_PERSONA_GIURIDICA");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-777620685) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append(" 1 = 1");

		if (GenericUtil.isNotNullOrEmpty(input.getSiglaRea())) {
			sql.append(" AND SIGLA_REA = :siglaRea");
		}

		if (GenericUtil.isNotNullOrEmpty(input.getNumeroRea())) {
			sql.append(" AND NUMERO_REA = :numeroRea");
		}

		if (GenericUtil.isNotNullOrEmpty(input.getCodiceFiscale())) {
			sql.append(" AND UPPER(CODICE_FISCALE) = UPPER(:codFiscale)");
		}
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R1788448791) ENABLED START*/
		//***aggiungere tutte le condizioni

		if (GenericUtil.isNotNullOrEmpty(input.getSiglaRea())) {
			paramMap.addValue("siglaRea", input.getSiglaRea());
		}
		if (GenericUtil.isNotNullOrEmpty(input.getNumeroRea())) {
			paramMap.addValue("numeroRea", input.getNumeroRea());
		}

		if (GenericUtil.isNotNullOrEmpty(input.getCodiceFiscale())) {
			paramMap.addValue("codFiscale", input.getCodiceFiscale());
		}

		/*PROTECTED REGION END*/
		List<SigitTPersonaGiuridicaDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byCodiceReaAndFiscaleRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitTPersonaGiuridicaDaoImpl::findByCodiceReaAndFiscale] esecuzione query", ex);
			throw new SigitTPersonaGiuridicaDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTPersonaGiuridicaDaoImpl", "findByCodiceReaAndFiscale", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitTPersonaGiuridicaDaoImpl::findByCodiceReaAndFiscale] END");
		}
		return list;
	}

}
