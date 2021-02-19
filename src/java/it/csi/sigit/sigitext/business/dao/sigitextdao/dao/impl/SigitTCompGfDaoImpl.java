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

/*PROTECTED REGION ID(R1516194869) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTCompGf.
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
public class SigitTCompGfDaoImpl extends AbstractDAO implements SigitTCompGfDao {
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
	 * Metodo di inserimento del DAO sigitTCompGf. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTCompGfPk
	 * @generated
	 */

	public SigitTCompGfPk insert(SigitTCompGfDto dto)

	{
		LOG.debug("[SigitTCompGfDaoImpl::insert] START");
		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,CODICE_IMPIANTO,FK_DETTAGLIO_GF,FLG_SORGENTE_EXT,FLG_FLUIDO_UTENZE,FLUIDO_FRIGORIGENO,N_CIRCUITI,RAFFRESCAMENTO_EER,RAFF_POTENZA_KW,RAFF_POTENZA_ASS,RISCALDAMENTO_COP,RISC_POTENZA_KW,RISC_POTENZA_ASS_KW,DATA_DISMISS,FLG_DISMISSIONE,DATA_ULT_MOD,UTENTE_ULT_MOD,FK_MARCA,FK_COMBUSTIBILE,MATRICOLA,MODELLO,POTENZA_TERMICA_KW,NOTE,TEMPO_MANUT_ANNI ) VALUES (  :ID_TIPO_COMPONENTE , :PROGRESSIVO , :DATA_INSTALL , :CODICE_IMPIANTO , :FK_DETTAGLIO_GF , :FLG_SORGENTE_EXT , :FLG_FLUIDO_UTENZE , :FLUIDO_FRIGORIGENO , :N_CIRCUITI , :RAFFRESCAMENTO_EER , :RAFF_POTENZA_KW , :RAFF_POTENZA_ASS , :RISCALDAMENTO_COP , :RISC_POTENZA_KW , :RISC_POTENZA_ASS_KW , :DATA_DISMISS , :FLG_DISMISSIONE , :DATA_ULT_MOD , :UTENTE_ULT_MOD , :FK_MARCA , :FK_COMBUSTIBILE , :MATRICOLA , :MODELLO , :POTENZA_TERMICA_KW , :NOTE , :TEMPO_MANUT_ANNI  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_TIPO_COMPONENTE]
		params.addValue("ID_TIPO_COMPONENTE", dto.getIdTipoComponente(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PROGRESSIVO]
		params.addValue("PROGRESSIVO", dto.getProgressivo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INSTALL]
		params.addValue("DATA_INSTALL", dto.getDataInstall(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_DETTAGLIO_GF]
		params.addValue("FK_DETTAGLIO_GF", dto.getFkDettaglioGf(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FLG_SORGENTE_EXT]
		params.addValue("FLG_SORGENTE_EXT", dto.getFlgSorgenteExt(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FLG_FLUIDO_UTENZE]
		params.addValue("FLG_FLUIDO_UTENZE", dto.getFlgFluidoUtenze(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FLUIDO_FRIGORIGENO]
		params.addValue("FLUIDO_FRIGORIGENO", dto.getFluidoFrigorigeno(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [N_CIRCUITI]
		params.addValue("N_CIRCUITI", dto.getNCircuiti(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [RAFFRESCAMENTO_EER]
		params.addValue("RAFFRESCAMENTO_EER", dto.getRaffrescamentoEer(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [RAFF_POTENZA_KW]
		params.addValue("RAFF_POTENZA_KW", dto.getRaffPotenzaKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [RAFF_POTENZA_ASS]
		params.addValue("RAFF_POTENZA_ASS", dto.getRaffPotenzaAss(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [RISCALDAMENTO_COP]
		params.addValue("RISCALDAMENTO_COP", dto.getRiscaldamentoCop(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [RISC_POTENZA_KW]
		params.addValue("RISC_POTENZA_KW", dto.getRiscPotenzaKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [RISC_POTENZA_ASS_KW]
		params.addValue("RISC_POTENZA_ASS_KW", dto.getRiscPotenzaAssKw(), java.sql.Types.NUMERIC);

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

		// valorizzazione paametro relativo a colonna [NOTE]
		params.addValue("NOTE", dto.getNote(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [TEMPO_MANUT_ANNI]
		params.addValue("TEMPO_MANUT_ANNI", dto.getTempoManutAnni(), java.sql.Types.NUMERIC);

		insert(jdbcTemplate, sql.toString(), params);

		LOG.debug("[SigitTCompGfDaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Custom deleter in the SIGIT_T_COMP_GF table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(Integer filter) throws SigitTCompGfDaoException {
		LOG.debug("[SigitTCompGfDaoImpl::customDeleterByCodImpianto] START");
		/*PROTECTED REGION ID(R-128481738) ENABLED START*/
		//***scrivere la custom query
		final String sql = "DELETE FROM " + getTableName() + " WHERE CODICE_IMPIANTO = :codImpianto";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("codImpianto", filter, java.sql.Types.NUMERIC);
		/*PROTECTED REGION END*/

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTCompGfDaoImpl::customDeleterByCodImpianto] END");
	}

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_COMP_GF";
	}

}
