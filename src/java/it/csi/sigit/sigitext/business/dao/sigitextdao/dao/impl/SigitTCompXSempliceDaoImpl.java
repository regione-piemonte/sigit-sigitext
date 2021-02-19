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

/*PROTECTED REGION ID(R-151901597) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTCompXSemplice.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 *   - findByPrimaryKey (datagen::FindByPK)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 *   - byCodImpianto (datagen::CustomDeleter)
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTCompXSempliceDaoImpl extends AbstractDAO implements SigitTCompXSempliceDao {
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
	 * Metodo di inserimento del DAO sigitTCompXSemplice. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTCompXSemplicePk
	 * @generated
	 */

	public SigitTCompXSemplicePk insert(SigitTCompXSempliceDto dto)

	{
		LOG.debug("[SigitTCompXSempliceDaoImpl::insert] START");
		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	CODICE_IMPIANTO,L5_1_FLG_SR_ONOFF,L5_1_FLG_SR_GENERATORE,L5_1_FLG_SR_INDIPENDENTE,L5_1_FLG_VALVOLE_REGOLAZIONE,L5_1_FLG_SR_MULTIGRADINO,L5_1_FLG_SR_INVERTER,L5_1_FLG_SR_ALTRI,L5_1_SR_DESCRIZIONE,L5_2_FLG_TERMO_ONOFF,L5_2_FLG_TERMO_PROPORZIONALE,L5_2_FLG_CONTR_ENTALPICO,L5_2_FLG_CONTR_PORTATA,L5_2_FLG_VALVOLE_TERMO,L5_2_FLG_VALVOLE_2,L5_2_FLG_VALVOLE_3,L5_2_NOTE,L5_3_FLG_TELELETTURA,L5_3_FLG_TELEGESTIONE,L5_3_DES_SISTEMA_INSTALLAZ,L5_3_DATA_SOSTITUZ,L5_3_DES_SISTEMA_SOSTITUZ,L5_4_FLG_UIC,L5_4_FLG_RISC,L5_4_FLG_RAFF,L5_4_FLG_ACS,L5_4_FLG_TIPOLOGIA,L5_4_DES_SISTEMA_INSTALLAZ,L5_4_DATA_SOSTITUZ,L5_4_DES_SISTEMA_SOSTITUZ,L6_1_FLG_VERTICALE,L6_1_FLG_ORIZZONTALE,L6_1_FLG_CAN,L6_1_ALTRO,L6_2_FLG_COIBENT,L6_2_NOTE,L7_0_FLG_RADIATORI,L7_0_FLG_TERMOCONVETTORI,L7_0_FLG_VENTILCONVETTORI,L7_0_FLG_PANNELLI,L7_0_FLG_BOCCHETTE,L7_0_FLG_STRISCE,L7_0_FLG_TRAVI,L7_0_ALTRO,DATA_ULT_MOD,UTENTE_ULT_MOD ) VALUES (  :CODICE_IMPIANTO , :L5_1_FLG_SR_ONOFF , :L5_1_FLG_SR_GENERATORE , :L5_1_FLG_SR_INDIPENDENTE , :L5_1_FLG_VALVOLE_REGOLAZIONE , :L5_1_FLG_SR_MULTIGRADINO , :L5_1_FLG_SR_INVERTER , :L5_1_FLG_SR_ALTRI , :L5_1_SR_DESCRIZIONE , :L5_2_FLG_TERMO_ONOFF , :L5_2_FLG_TERMO_PROPORZIONALE , :L5_2_FLG_CONTR_ENTALPICO , :L5_2_FLG_CONTR_PORTATA , :L5_2_FLG_VALVOLE_TERMO , :L5_2_FLG_VALVOLE_2 , :L5_2_FLG_VALVOLE_3 , :L5_2_NOTE , :L5_3_FLG_TELELETTURA , :L5_3_FLG_TELEGESTIONE , :L5_3_DES_SISTEMA_INSTALLAZ , :L5_3_DATA_SOSTITUZ , :L5_3_DES_SISTEMA_SOSTITUZ , :L5_4_FLG_UIC , :L5_4_FLG_RISC , :L5_4_FLG_RAFF , :L5_4_FLG_ACS , :L5_4_FLG_TIPOLOGIA , :L5_4_DES_SISTEMA_INSTALLAZ , :L5_4_DATA_SOSTITUZ , :L5_4_DES_SISTEMA_SOSTITUZ , :L6_1_FLG_VERTICALE , :L6_1_FLG_ORIZZONTALE , :L6_1_FLG_CAN , :L6_1_ALTRO , :L6_2_FLG_COIBENT , :L6_2_NOTE , :L7_0_FLG_RADIATORI , :L7_0_FLG_TERMOCONVETTORI , :L7_0_FLG_VENTILCONVETTORI , :L7_0_FLG_PANNELLI , :L7_0_FLG_BOCCHETTE , :L7_0_FLG_STRISCE , :L7_0_FLG_TRAVI , :L7_0_ALTRO , :DATA_ULT_MOD , :UTENTE_ULT_MOD  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_1_FLG_SR_ONOFF]
		params.addValue("L5_1_FLG_SR_ONOFF", dto.getL51FlgSrOnoff(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_1_FLG_SR_GENERATORE]
		params.addValue("L5_1_FLG_SR_GENERATORE", dto.getL51FlgSrGeneratore(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_1_FLG_SR_INDIPENDENTE]
		params.addValue("L5_1_FLG_SR_INDIPENDENTE", dto.getL51FlgSrIndipendente(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_1_FLG_VALVOLE_REGOLAZIONE]
		params.addValue("L5_1_FLG_VALVOLE_REGOLAZIONE", dto.getL51FlgValvoleRegolazione(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_1_FLG_SR_MULTIGRADINO]
		params.addValue("L5_1_FLG_SR_MULTIGRADINO", dto.getL51FlgSrMultigradino(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_1_FLG_SR_INVERTER]
		params.addValue("L5_1_FLG_SR_INVERTER", dto.getL51FlgSrInverter(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_1_FLG_SR_ALTRI]
		params.addValue("L5_1_FLG_SR_ALTRI", dto.getL51FlgSrAltri(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_1_SR_DESCRIZIONE]
		params.addValue("L5_1_SR_DESCRIZIONE", dto.getL51SrDescrizione(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L5_2_FLG_TERMO_ONOFF]
		params.addValue("L5_2_FLG_TERMO_ONOFF", dto.getL52FlgTermoOnoff(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_2_FLG_TERMO_PROPORZIONALE]
		params.addValue("L5_2_FLG_TERMO_PROPORZIONALE", dto.getL52FlgTermoProporzionale(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_2_FLG_CONTR_ENTALPICO]
		params.addValue("L5_2_FLG_CONTR_ENTALPICO", dto.getL52FlgContrEntalpico(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_2_FLG_CONTR_PORTATA]
		params.addValue("L5_2_FLG_CONTR_PORTATA", dto.getL52FlgContrPortata(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_2_FLG_VALVOLE_TERMO]
		params.addValue("L5_2_FLG_VALVOLE_TERMO", dto.getL52FlgValvoleTermo(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L5_2_FLG_VALVOLE_2]
		params.addValue("L5_2_FLG_VALVOLE_2", dto.getL52FlgValvole2(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L5_2_FLG_VALVOLE_3]
		params.addValue("L5_2_FLG_VALVOLE_3", dto.getL52FlgValvole3(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L5_2_NOTE]
		params.addValue("L5_2_NOTE", dto.getL52Note(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L5_3_FLG_TELELETTURA]
		params.addValue("L5_3_FLG_TELELETTURA", dto.getL53FlgTelelettura(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L5_3_FLG_TELEGESTIONE]
		params.addValue("L5_3_FLG_TELEGESTIONE", dto.getL53FlgTelegestione(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L5_3_DES_SISTEMA_INSTALLAZ]
		params.addValue("L5_3_DES_SISTEMA_INSTALLAZ", dto.getL53DesSistemaInstallaz(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L5_3_DATA_SOSTITUZ]
		params.addValue("L5_3_DATA_SOSTITUZ", dto.getL53DataSostituz(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [L5_3_DES_SISTEMA_SOSTITUZ]
		params.addValue("L5_3_DES_SISTEMA_SOSTITUZ", dto.getL53DesSistemaSostituz(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L5_4_FLG_UIC]
		params.addValue("L5_4_FLG_UIC", dto.getL54FlgUic(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_4_FLG_RISC]
		params.addValue("L5_4_FLG_RISC", dto.getL54FlgRisc(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_4_FLG_RAFF]
		params.addValue("L5_4_FLG_RAFF", dto.getL54FlgRaff(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_4_FLG_ACS]
		params.addValue("L5_4_FLG_ACS", dto.getL54FlgAcs(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L5_4_FLG_TIPOLOGIA]
		params.addValue("L5_4_FLG_TIPOLOGIA", dto.getL54FlgTipologia(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L5_4_DES_SISTEMA_INSTALLAZ]
		params.addValue("L5_4_DES_SISTEMA_INSTALLAZ", dto.getL54DesSistemaInstallaz(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L5_4_DATA_SOSTITUZ]
		params.addValue("L5_4_DATA_SOSTITUZ", dto.getL54DataSostituz(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [L5_4_DES_SISTEMA_SOSTITUZ]
		params.addValue("L5_4_DES_SISTEMA_SOSTITUZ", dto.getL54DesSistemaSostituz(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L6_1_FLG_VERTICALE]
		params.addValue("L6_1_FLG_VERTICALE", dto.getL61FlgVerticale(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L6_1_FLG_ORIZZONTALE]
		params.addValue("L6_1_FLG_ORIZZONTALE", dto.getL61FlgOrizzontale(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L6_1_FLG_CAN]
		params.addValue("L6_1_FLG_CAN", dto.getL61FlgCan(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L6_1_ALTRO]
		params.addValue("L6_1_ALTRO", dto.getL61Altro(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L6_2_FLG_COIBENT]
		params.addValue("L6_2_FLG_COIBENT", dto.getL62FlgCoibent(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L6_2_NOTE]
		params.addValue("L6_2_NOTE", dto.getL62Note(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L7_0_FLG_RADIATORI]
		params.addValue("L7_0_FLG_RADIATORI", dto.getL70FlgRadiatori(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L7_0_FLG_TERMOCONVETTORI]
		params.addValue("L7_0_FLG_TERMOCONVETTORI", dto.getL70FlgTermoconvettori(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L7_0_FLG_VENTILCONVETTORI]
		params.addValue("L7_0_FLG_VENTILCONVETTORI", dto.getL70FlgVentilconvettori(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L7_0_FLG_PANNELLI]
		params.addValue("L7_0_FLG_PANNELLI", dto.getL70FlgPannelli(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L7_0_FLG_BOCCHETTE]
		params.addValue("L7_0_FLG_BOCCHETTE", dto.getL70FlgBocchette(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L7_0_FLG_STRISCE]
		params.addValue("L7_0_FLG_STRISCE", dto.getL70FlgStrisce(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L7_0_FLG_TRAVI]
		params.addValue("L7_0_FLG_TRAVI", dto.getL70FlgTravi(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L7_0_ALTRO]
		params.addValue("L7_0_ALTRO", dto.getL70Altro(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		insert(jdbcTemplate, sql.toString(), params);

		LOG.debug("[SigitTCompXSempliceDaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Custom deleter in the SIGIT_T_COMPX_SEMPLICE table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(Integer filter) throws SigitTCompXSempliceDaoException {
		LOG.debug("[SigitTCompXSempliceDaoImpl::customDeleterByCodImpianto] START");
		/*PROTECTED REGION ID(R-742014205) ENABLED START*/
		//***scrivere la custom query
		final String sql = "DELETE FROM " + getTableName() + " WHERE CODICE_IMPIANTO = :codImpianto";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("codImpianto", filter, java.sql.Types.NUMERIC);
		/*PROTECTED REGION END*/

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTCompXSempliceDaoImpl::customDeleterByCodImpianto] END");
	}

	protected SigitTCompXSempliceDaoRowMapper findByPrimaryKeyRowMapper = new SigitTCompXSempliceDaoRowMapper(null,
			SigitTCompXSempliceDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_COMPX_SEMPLICE";
	}

	/** 
	 * Returns all rows from the SIGIT_T_COMPX_SEMPLICE table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitTCompXSempliceDto findByPrimaryKey(SigitTCompXSemplicePk pk) throws SigitTCompXSempliceDaoException {
		LOG.debug("[SigitTCompXSempliceDaoImpl::findByPrimaryKey] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT CODICE_IMPIANTO,L5_1_FLG_SR_ONOFF,L5_1_FLG_SR_GENERATORE,L5_1_FLG_SR_INDIPENDENTE,L5_1_FLG_VALVOLE_REGOLAZIONE,L5_1_FLG_SR_MULTIGRADINO,L5_1_FLG_SR_INVERTER,L5_1_FLG_SR_ALTRI,L5_1_SR_DESCRIZIONE,L5_2_FLG_TERMO_ONOFF,L5_2_FLG_TERMO_PROPORZIONALE,L5_2_FLG_CONTR_ENTALPICO,L5_2_FLG_CONTR_PORTATA,L5_2_FLG_VALVOLE_TERMO,L5_2_FLG_VALVOLE_2,L5_2_FLG_VALVOLE_3,L5_2_NOTE,L5_3_FLG_TELELETTURA,L5_3_FLG_TELEGESTIONE,L5_3_DES_SISTEMA_INSTALLAZ,L5_3_DATA_SOSTITUZ,L5_3_DES_SISTEMA_SOSTITUZ,L5_4_FLG_UIC,L5_4_FLG_RISC,L5_4_FLG_RAFF,L5_4_FLG_ACS,L5_4_FLG_TIPOLOGIA,L5_4_DES_SISTEMA_INSTALLAZ,L5_4_DATA_SOSTITUZ,L5_4_DES_SISTEMA_SOSTITUZ,L6_1_FLG_VERTICALE,L6_1_FLG_ORIZZONTALE,L6_1_FLG_CAN,L6_1_ALTRO,L6_2_FLG_COIBENT,L6_2_NOTE,L7_0_FLG_RADIATORI,L7_0_FLG_TERMOCONVETTORI,L7_0_FLG_VENTILCONVETTORI,L7_0_FLG_PANNELLI,L7_0_FLG_BOCCHETTE,L7_0_FLG_STRISCE,L7_0_FLG_TRAVI,L7_0_ALTRO,DATA_ULT_MOD,UTENTE_ULT_MOD FROM "
						+ getTableName() + " WHERE CODICE_IMPIANTO = :CODICE_IMPIANTO ");

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", pk.getCodiceImpianto(), java.sql.Types.NUMERIC);

		List<SigitTCompXSempliceDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findByPrimaryKeyRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitTCompXSempliceDaoImpl::findByPrimaryKey] ERROR esecuzione query", ex);
			throw new SigitTCompXSempliceDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTCompXSempliceDaoImpl", "findByPrimaryKey", "esecuzione query", sql.toString());
			LOG.debug("[SigitTCompXSempliceDaoImpl::findByPrimaryKey] END");
		}
		return list.isEmpty() ? null : list.get(0);
	}

}
