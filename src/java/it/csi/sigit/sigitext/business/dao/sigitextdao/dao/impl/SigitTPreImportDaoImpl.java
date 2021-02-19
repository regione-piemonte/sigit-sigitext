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

/*PROTECTED REGION ID(R-738700861) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTPreImport.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 
 *    --
  * - UPDATERS:
 *   - update (datagen::UpdateRow)
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTPreImportDaoImpl extends AbstractDAO implements SigitTPreImportDao {
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
	 * Metodo di inserimento del DAO sigitTPreImport. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTPreImportPk
	 * @generated
	 */

	public SigitTPreImportPk insert(SigitTPreImportDto dto)

	{
		LOG.debug("[SigitTPreImportDaoImpl::insert] START");
		Integer newKey = Integer.valueOf(incrementer.nextIntValue());

		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_PRE_IMPORT,N_FILE,MSG,DATA_ULT_MOD,UTENTE_ULT_MOD,ID_PERSONA_FISICA ) VALUES (  :ID_PRE_IMPORT , :N_FILE , :MSG , :DATA_ULT_MOD , :UTENTE_ULT_MOD , :ID_PERSONA_FISICA  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_PRE_IMPORT]
		params.addValue("ID_PRE_IMPORT", newKey, java.sql.Types.INTEGER);

		// valorizzazione paametro relativo a colonna [N_FILE]
		params.addValue("N_FILE", dto.getNFile(), java.sql.Types.INTEGER);

		// valorizzazione paametro relativo a colonna [MSG]
		params.addValue("MSG", dto.getMsg(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [ID_PERSONA_FISICA]
		params.addValue("ID_PERSONA_FISICA", dto.getIdPersonaFisica(), java.sql.Types.NUMERIC);

		insert(jdbcTemplate, sql.toString(), params);

		dto.setIdPreImport(newKey);
		LOG.debug("[SigitTPreImportDaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Updates a single row in the SIGIT_T_PRE_IMPORT table.
	 * @generated
	 */
	public void update(SigitTPreImportDto dto) throws SigitTPreImportDaoException {
		LOG.debug("[SigitTPreImportDaoImpl::update] START");
		final String sql = "UPDATE " + getTableName()
				+ " SET N_FILE = :N_FILE ,MSG = :MSG ,DATA_ULT_MOD = :DATA_ULT_MOD ,UTENTE_ULT_MOD = :UTENTE_ULT_MOD ,ID_PERSONA_FISICA = :ID_PERSONA_FISICA  WHERE ID_PRE_IMPORT = :ID_PRE_IMPORT ";

		if (dto.getIdPreImport() == null) {
			LOG.error("[SigitTPreImportDaoImpl::update] ERROR chiave primaria non impostata");
			throw new SigitTPreImportDaoException("Chiave primaria non impostata");
		}

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_PRE_IMPORT]
		params.addValue("ID_PRE_IMPORT", dto.getIdPreImport(), java.sql.Types.INTEGER);

		// valorizzazione paametro relativo a colonna [N_FILE]
		params.addValue("N_FILE", dto.getNFile(), java.sql.Types.INTEGER);

		// valorizzazione paametro relativo a colonna [MSG]
		params.addValue("MSG", dto.getMsg(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [ID_PERSONA_FISICA]
		params.addValue("ID_PERSONA_FISICA", dto.getIdPersonaFisica(), java.sql.Types.NUMERIC);

		update(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTPreImportDaoImpl::update] END");
	}

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_PRE_IMPORT";
	}

}
