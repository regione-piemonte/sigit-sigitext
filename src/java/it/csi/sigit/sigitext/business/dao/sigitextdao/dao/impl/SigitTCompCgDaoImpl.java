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

/*PROTECTED REGION ID(R1317475455) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTCompCg.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 
 *    --
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 *   - ByCodImpianto (datagen::CustomDeleter)
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTCompCgDaoImpl extends AbstractDAO implements SigitTCompCgDao {
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
	 * Metodo di inserimento del DAO sigitTCompCg. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTCompCgPk
	 * @generated
	 */

	public SigitTCompCgPk insert(SigitTCompCgDto dto)

	{
		LOG.debug("[SigitTCompCgDaoImpl::insert] START");
		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,CODICE_IMPIANTO,TIPOLOGIA,POTENZA_ELETTRICA_KW,TEMP_H2O_OUT_MIN,TEMP_H2O_OUT_MAX,TEMP_H2O_IN_MIN,TEMP_H2O_IN_MAX,TEMP_H2O_MOTORE_MIN,TEMP_H2O_MOTORE_MAX,TEMP_FUMI_VALLE_MIN,TEMP_FUMI_VALLE_MAX,TEMP_FUMI_MONTE_MIN,TEMP_FUMI_MONTE_MAX,CO_MIN,CO_MAX,DATA_DISMISS,FLG_DISMISSIONE,DATA_ULT_MOD,UTENTE_ULT_MOD,FK_MARCA,FK_COMBUSTIBILE,MATRICOLA,MODELLO,POTENZA_TERMICA_KW,ALIMENTAZIONE,NOTE,TEMPO_MANUT_ANNI ) VALUES (  :ID_TIPO_COMPONENTE , :PROGRESSIVO , :DATA_INSTALL , :CODICE_IMPIANTO , :TIPOLOGIA , :POTENZA_ELETTRICA_KW , :TEMP_H2O_OUT_MIN , :TEMP_H2O_OUT_MAX , :TEMP_H2O_IN_MIN , :TEMP_H2O_IN_MAX , :TEMP_H2O_MOTORE_MIN , :TEMP_H2O_MOTORE_MAX , :TEMP_FUMI_VALLE_MIN , :TEMP_FUMI_VALLE_MAX , :TEMP_FUMI_MONTE_MIN , :TEMP_FUMI_MONTE_MAX , :CO_MIN , :CO_MAX , :DATA_DISMISS , :FLG_DISMISSIONE , :DATA_ULT_MOD , :UTENTE_ULT_MOD , :FK_MARCA , :FK_COMBUSTIBILE , :MATRICOLA , :MODELLO , :POTENZA_TERMICA_KW , :ALIMENTAZIONE , :NOTE , :TEMPO_MANUT_ANNI  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_TIPO_COMPONENTE]
		params.addValue("ID_TIPO_COMPONENTE", dto.getIdTipoComponente(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PROGRESSIVO]
		params.addValue("PROGRESSIVO", dto.getProgressivo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INSTALL]
		params.addValue("DATA_INSTALL", dto.getDataInstall(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TIPOLOGIA]
		params.addValue("TIPOLOGIA", dto.getTipologia(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [POTENZA_ELETTRICA_KW]
		params.addValue("POTENZA_ELETTRICA_KW", dto.getPotenzaElettricaKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_OUT_MIN]
		params.addValue("TEMP_H2O_OUT_MIN", dto.getTempH2oOutMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_OUT_MAX]
		params.addValue("TEMP_H2O_OUT_MAX", dto.getTempH2oOutMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_IN_MIN]
		params.addValue("TEMP_H2O_IN_MIN", dto.getTempH2oInMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_IN_MAX]
		params.addValue("TEMP_H2O_IN_MAX", dto.getTempH2oInMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_MOTORE_MIN]
		params.addValue("TEMP_H2O_MOTORE_MIN", dto.getTempH2oMotoreMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_MOTORE_MAX]
		params.addValue("TEMP_H2O_MOTORE_MAX", dto.getTempH2oMotoreMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_FUMI_VALLE_MIN]
		params.addValue("TEMP_FUMI_VALLE_MIN", dto.getTempFumiValleMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_FUMI_VALLE_MAX]
		params.addValue("TEMP_FUMI_VALLE_MAX", dto.getTempFumiValleMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_FUMI_MONTE_MIN]
		params.addValue("TEMP_FUMI_MONTE_MIN", dto.getTempFumiMonteMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_FUMI_MONTE_MAX]
		params.addValue("TEMP_FUMI_MONTE_MAX", dto.getTempFumiMonteMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CO_MIN]
		params.addValue("CO_MIN", dto.getCoMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CO_MAX]
		params.addValue("CO_MAX", dto.getCoMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_DISMISS]
		params.addValue("DATA_DISMISS", dto.getDataDismiss(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [FLG_DISMISSIONE]
		params.addValue("FLG_DISMISSIONE", dto.getFlgDismissione(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FK_MARCA]
		params.addValue("FK_MARCA", dto.getFkMarca(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_COMBUSTIBILE]
		params.addValue("FK_COMBUSTIBILE", dto.getFkCombustibile(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [MATRICOLA]
		params.addValue("MATRICOLA", dto.getMatricola(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [MODELLO]
		params.addValue("MODELLO", dto.getModello(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [POTENZA_TERMICA_KW]
		params.addValue("POTENZA_TERMICA_KW", dto.getPotenzaTermicaKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [ALIMENTAZIONE]
		params.addValue("ALIMENTAZIONE", dto.getAlimentazione(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [NOTE]
		params.addValue("NOTE", dto.getNote(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [TEMPO_MANUT_ANNI]
		params.addValue("TEMPO_MANUT_ANNI", dto.getTempoManutAnni(), java.sql.Types.NUMERIC);

		insert(jdbcTemplate, sql.toString(), params);

		LOG.debug("[SigitTCompCgDaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Custom deleter in the SIGIT_T_COMP_CG table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(Integer filter) throws SigitTCompCgDaoException {
		LOG.debug("[SigitTCompCgDaoImpl::customDeleterByCodImpianto] START");
		/*PROTECTED REGION ID(R-1709946031) ENABLED START*/
		//***scrivere la custom query
		final String sql = "DELETE FROM " + getTableName() + " WHERE CODICE_IMPIANTO = :codImpianto";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("codImpianto", filter, java.sql.Types.NUMERIC);
		/*PROTECTED REGION END*/

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTCompCgDaoImpl::customDeleterByCodImpianto] END");
	}

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_COMP_CG";
	}

}
