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

/*PROTECTED REGION ID(R-1901551453) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTImport.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 *   - findByPrimaryKey (datagen::FindByPK)
  * - UPDATERS:
 *   - update (datagen::UpdateRow)
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTImportDaoImpl extends AbstractDAO implements SigitTImportDao {
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
	 * Metodo di inserimento del DAO sigitTImport. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTImportPk
	 * @generated
	 */

	public SigitTImportPk insert(SigitTImportDto dto)

	{
		LOG.debug("[SigitTImportDaoImpl::insert] START");
		Integer newKey = Integer.valueOf(incrementer.nextIntValue());

		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_IMPORT,DATA_INIZIO,DATA_FINE,NOME_FILE_IMPORT,FLG_ESITO,CODICE_IMPIANTO,FK_PRE_IMPORT,FK_ALLEGATO,MSG_ERRORE,FK_PERSONA_GIURIDICA,DATA_INVIO_MAIL_MANUT,DATA_INVIO_MAIL_ASSISTENZA,FK_PG_CAT ) VALUES (  :ID_IMPORT , :DATA_INIZIO , :DATA_FINE , :NOME_FILE_IMPORT , :FLG_ESITO , :CODICE_IMPIANTO , :FK_PRE_IMPORT , :FK_ALLEGATO , :MSG_ERRORE , :FK_PERSONA_GIURIDICA , :DATA_INVIO_MAIL_MANUT , :DATA_INVIO_MAIL_ASSISTENZA , :FK_PG_CAT  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_IMPORT]
		params.addValue("ID_IMPORT", newKey, java.sql.Types.INTEGER);

		// valorizzazione paametro relativo a colonna [DATA_INIZIO]
		params.addValue("DATA_INIZIO", dto.getDataInizio(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [DATA_FINE]
		params.addValue("DATA_FINE", dto.getDataFine(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [NOME_FILE_IMPORT]
		params.addValue("NOME_FILE_IMPORT", dto.getNomeFileImport(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FLG_ESITO]
		params.addValue("FLG_ESITO", dto.getFlgEsito(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_PRE_IMPORT]
		params.addValue("FK_PRE_IMPORT", dto.getFkPreImport(), java.sql.Types.INTEGER);

		// valorizzazione paametro relativo a colonna [FK_ALLEGATO]
		params.addValue("FK_ALLEGATO", dto.getFkAllegato(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [MSG_ERRORE]
		params.addValue("MSG_ERRORE", dto.getMsgErrore(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FK_PERSONA_GIURIDICA]
		params.addValue("FK_PERSONA_GIURIDICA", dto.getFkPersonaGiuridica(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INVIO_MAIL_MANUT]
		params.addValue("DATA_INVIO_MAIL_MANUT", dto.getDataInvioMailManut(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [DATA_INVIO_MAIL_ASSISTENZA]
		params.addValue("DATA_INVIO_MAIL_ASSISTENZA", dto.getDataInvioMailAssistenza(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [FK_PG_CAT]
		params.addValue("FK_PG_CAT", dto.getFkPgCat(), java.sql.Types.NUMERIC);

		insert(jdbcTemplate, sql.toString(), params);

		dto.setIdImport(newKey);
		LOG.debug("[SigitTImportDaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Updates a single row in the SIGIT_T_IMPORT table.
	 * @generated
	 */
	public void update(SigitTImportDto dto) throws SigitTImportDaoException {
		LOG.debug("[SigitTImportDaoImpl::update] START");
		final String sql = "UPDATE " + getTableName()
				+ " SET DATA_INIZIO = :DATA_INIZIO ,DATA_FINE = :DATA_FINE ,NOME_FILE_IMPORT = :NOME_FILE_IMPORT ,FLG_ESITO = :FLG_ESITO ,CODICE_IMPIANTO = :CODICE_IMPIANTO ,FK_PRE_IMPORT = :FK_PRE_IMPORT ,FK_ALLEGATO = :FK_ALLEGATO ,MSG_ERRORE = :MSG_ERRORE ,FK_PERSONA_GIURIDICA = :FK_PERSONA_GIURIDICA ,DATA_INVIO_MAIL_MANUT = :DATA_INVIO_MAIL_MANUT ,DATA_INVIO_MAIL_ASSISTENZA = :DATA_INVIO_MAIL_ASSISTENZA ,FK_PG_CAT = :FK_PG_CAT  WHERE ID_IMPORT = :ID_IMPORT ";

		if (dto.getIdImport() == null) {
			LOG.error("[SigitTImportDaoImpl::update] ERROR chiave primaria non impostata");
			throw new SigitTImportDaoException("Chiave primaria non impostata");
		}

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_IMPORT]
		params.addValue("ID_IMPORT", dto.getIdImport(), java.sql.Types.INTEGER);

		// valorizzazione paametro relativo a colonna [DATA_INIZIO]
		params.addValue("DATA_INIZIO", dto.getDataInizio(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [DATA_FINE]
		params.addValue("DATA_FINE", dto.getDataFine(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [NOME_FILE_IMPORT]
		params.addValue("NOME_FILE_IMPORT", dto.getNomeFileImport(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FLG_ESITO]
		params.addValue("FLG_ESITO", dto.getFlgEsito(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_PRE_IMPORT]
		params.addValue("FK_PRE_IMPORT", dto.getFkPreImport(), java.sql.Types.INTEGER);

		// valorizzazione paametro relativo a colonna [FK_ALLEGATO]
		params.addValue("FK_ALLEGATO", dto.getFkAllegato(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [MSG_ERRORE]
		params.addValue("MSG_ERRORE", dto.getMsgErrore(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FK_PERSONA_GIURIDICA]
		params.addValue("FK_PERSONA_GIURIDICA", dto.getFkPersonaGiuridica(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INVIO_MAIL_MANUT]
		params.addValue("DATA_INVIO_MAIL_MANUT", dto.getDataInvioMailManut(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [DATA_INVIO_MAIL_ASSISTENZA]
		params.addValue("DATA_INVIO_MAIL_ASSISTENZA", dto.getDataInvioMailAssistenza(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [FK_PG_CAT]
		params.addValue("FK_PG_CAT", dto.getFkPgCat(), java.sql.Types.NUMERIC);

		update(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTImportDaoImpl::update] END");
	}

	protected SigitTImportDaoRowMapper findByPrimaryKeyRowMapper = new SigitTImportDaoRowMapper(null,
			SigitTImportDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_IMPORT";
	}

	/** 
	 * Returns all rows from the SIGIT_T_IMPORT table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitTImportDto findByPrimaryKey(SigitTImportPk pk) throws SigitTImportDaoException {
		LOG.debug("[SigitTImportDaoImpl::findByPrimaryKey] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT ID_IMPORT,DATA_INIZIO,DATA_FINE,NOME_FILE_IMPORT,FLG_ESITO,CODICE_IMPIANTO,FK_PRE_IMPORT,FK_ALLEGATO,MSG_ERRORE,FK_PERSONA_GIURIDICA,DATA_INVIO_MAIL_MANUT,DATA_INVIO_MAIL_ASSISTENZA,FK_PG_CAT FROM "
						+ getTableName() + " WHERE ID_IMPORT = :ID_IMPORT ");

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_IMPORT]
		params.addValue("ID_IMPORT", pk.getIdImport(), java.sql.Types.INTEGER);

		List<SigitTImportDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findByPrimaryKeyRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitTImportDaoImpl::findByPrimaryKey] ERROR esecuzione query", ex);
			throw new SigitTImportDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTImportDaoImpl", "findByPrimaryKey", "esecuzione query", sql.toString());
			LOG.debug("[SigitTImportDaoImpl::findByPrimaryKey] END");
		}
		return list.isEmpty() ? null : list.get(0);
	}

}
