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

/*PROTECTED REGION ID(R-328376909) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTUnitaImmobiliare.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - byCodiceImpianto (datagen::CustomFinder)
 *   - unitaPrincipaleImpianto (datagen::CustomFinder)
  * - UPDATERS:
 *   - update (datagen::UpdateRow)
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTUnitaImmobiliareDaoImpl extends AbstractDAO implements SigitTUnitaImmobiliareDao {
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
	 * Updates a single row in the SIGIT_T_UNITA_IMMOBILIARE table.
	 * @generated
	 */
	public void update(SigitTUnitaImmobiliareDto dto) throws SigitTUnitaImmobiliareDaoException {
		LOG.debug("[SigitTUnitaImmobiliareDaoImpl::update] START");
		final String sql = "UPDATE " + getTableName()
				+ " SET CODICE_IMPIANTO = :CODICE_IMPIANTO ,FK_L2 = :FK_L2 ,INDIRIZZO_SITAD = :INDIRIZZO_SITAD ,INDIRIZZO_NON_TROVATO = :INDIRIZZO_NON_TROVATO ,CIVICO = :CIVICO ,CAP = :CAP ,SCALA = :SCALA ,PALAZZO = :PALAZZO ,INTERNO = :INTERNO ,NOTE = :NOTE ,FLG_PRINCIPALE = :FLG_PRINCIPALE ,SEZIONE = :SEZIONE ,FOGLIO = :FOGLIO ,PARTICELLA = :PARTICELLA ,SUBALTERNO = :SUBALTERNO ,POD_ELETTRICO = :POD_ELETTRICO ,PDR_GAS = :PDR_GAS ,DATA_ULT_MOD = :DATA_ULT_MOD ,UTENTE_ULT_MOD = :UTENTE_ULT_MOD ,L1_2_FLG_SINGOLA_UNITA = :L1_2_FLG_SINGOLA_UNITA ,L1_2_FK_CATEGORIA = :L1_2_FK_CATEGORIA ,L1_2_VOL_RISC_M3 = :L1_2_VOL_RISC_M3 ,L1_2_VOL_RAFF_M3 = :L1_2_VOL_RAFF_M3 ,FLG_NOPDR = :FLG_NOPDR ,FLG_NOACCATASTATO = :FLG_NOACCATASTATO  WHERE ID_UNITA_IMM = :ID_UNITA_IMM ";

		if (dto.getIdUnitaImm() == null) {
			LOG.error("[SigitTUnitaImmobiliareDaoImpl::update] ERROR chiave primaria non impostata");
			throw new SigitTUnitaImmobiliareDaoException("Chiave primaria non impostata");
		}

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_UNITA_IMM]
		params.addValue("ID_UNITA_IMM", dto.getIdUnitaImm(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_L2]
		params.addValue("FK_L2", dto.getFkL2(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [INDIRIZZO_SITAD]
		params.addValue("INDIRIZZO_SITAD", dto.getIndirizzoSitad(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [INDIRIZZO_NON_TROVATO]
		params.addValue("INDIRIZZO_NON_TROVATO", dto.getIndirizzoNonTrovato(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [CIVICO]
		params.addValue("CIVICO", dto.getCivico(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [CAP]
		params.addValue("CAP", dto.getCap(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [SCALA]
		params.addValue("SCALA", dto.getScala(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PALAZZO]
		params.addValue("PALAZZO", dto.getPalazzo(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [INTERNO]
		params.addValue("INTERNO", dto.getInterno(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [NOTE]
		params.addValue("NOTE", dto.getNote(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FLG_PRINCIPALE]
		params.addValue("FLG_PRINCIPALE", dto.getFlgPrincipale(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [SEZIONE]
		params.addValue("SEZIONE", dto.getSezione(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FOGLIO]
		params.addValue("FOGLIO", dto.getFoglio(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PARTICELLA]
		params.addValue("PARTICELLA", dto.getParticella(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [SUBALTERNO]
		params.addValue("SUBALTERNO", dto.getSubalterno(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [POD_ELETTRICO]
		params.addValue("POD_ELETTRICO", dto.getPodElettrico(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PDR_GAS]
		params.addValue("PDR_GAS", dto.getPdrGas(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L1_2_FLG_SINGOLA_UNITA]
		params.addValue("L1_2_FLG_SINGOLA_UNITA", dto.getL12FlgSingolaUnita(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_2_FK_CATEGORIA]
		params.addValue("L1_2_FK_CATEGORIA", dto.getL12FkCategoria(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L1_2_VOL_RISC_M3]
		params.addValue("L1_2_VOL_RISC_M3", dto.getL12VolRiscM3(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_2_VOL_RAFF_M3]
		params.addValue("L1_2_VOL_RAFF_M3", dto.getL12VolRaffM3(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FLG_NOPDR]
		params.addValue("FLG_NOPDR", dto.getFlgNopdr(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FLG_NOACCATASTATO]
		params.addValue("FLG_NOACCATASTATO", dto.getFlgNoaccatastato(), java.sql.Types.NUMERIC);

		update(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTUnitaImmobiliareDaoImpl::update] END");
	}

	protected SigitTUnitaImmobiliareDaoRowMapper byCodiceImpiantoRowMapper = new SigitTUnitaImmobiliareDaoRowMapper(
			null, SigitTUnitaImmobiliareDto.class, this);

	protected SigitTUnitaImmobiliareDaoRowMapper unitaPrincipaleImpiantoRowMapper = new SigitTUnitaImmobiliareDaoRowMapper(
			null, SigitTUnitaImmobiliareDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_UNITA_IMMOBILIARE";
	}

	/** 
	 * Implementazione del finder byCodiceImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTUnitaImmobiliareDto> findByCodiceImpianto(java.lang.Integer input)
			throws SigitTUnitaImmobiliareDaoException {
		LOG.debug("[SigitTUnitaImmobiliareDaoImpl::findByCodiceImpianto] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_UNITA_IMM,CODICE_IMPIANTO,FK_L2,INDIRIZZO_SITAD,INDIRIZZO_NON_TROVATO,CIVICO,CAP,SCALA,PALAZZO,INTERNO,NOTE,FLG_PRINCIPALE,SEZIONE,FOGLIO,PARTICELLA,SUBALTERNO,POD_ELETTRICO,PDR_GAS,DATA_ULT_MOD,UTENTE_ULT_MOD,L1_2_FLG_SINGOLA_UNITA,L1_2_FK_CATEGORIA,L1_2_VOL_RISC_M3,L1_2_VOL_RAFF_M3,FLG_NOPDR,FLG_NOACCATASTATO ");
		sql.append(" FROM SIGIT_T_UNITA_IMMOBILIARE");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-744734130) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append(" CODICE_IMPIANTO = :codiceImpianto");

		sql.append(" ORDER BY ID_UNITA_IMM");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-1487035300) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codiceImpianto", input);

		/*PROTECTED REGION END*/
		List<SigitTUnitaImmobiliareDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byCodiceImpiantoRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitTUnitaImmobiliareDaoImpl::findByCodiceImpianto] esecuzione query", ex);
			throw new SigitTUnitaImmobiliareDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTUnitaImmobiliareDaoImpl", "findByCodiceImpianto", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitTUnitaImmobiliareDaoImpl::findByCodiceImpianto] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder unitaPrincipaleImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTUnitaImmobiliareDto> findUnitaPrincipaleImpianto(java.lang.Integer input)
			throws SigitTUnitaImmobiliareDaoException {
		LOG.debug("[SigitTUnitaImmobiliareDaoImpl::findUnitaPrincipaleImpianto] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_UNITA_IMM,CODICE_IMPIANTO,FK_L2,INDIRIZZO_SITAD,INDIRIZZO_NON_TROVATO,CIVICO,CAP,SCALA,PALAZZO,INTERNO,NOTE,FLG_PRINCIPALE,SEZIONE,FOGLIO,PARTICELLA,SUBALTERNO,POD_ELETTRICO,PDR_GAS,DATA_ULT_MOD,UTENTE_ULT_MOD,L1_2_FLG_SINGOLA_UNITA,L1_2_FK_CATEGORIA,L1_2_VOL_RISC_M3,L1_2_VOL_RAFF_M3,FLG_NOPDR,FLG_NOACCATASTATO ");
		sql.append(" FROM SIGIT_T_UNITA_IMMOBILIARE");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R616606682) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append(" CODICE_IMPIANTO = :codImpianto AND FLG_PRINCIPALE = 1");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R2059824208) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input);

		/*PROTECTED REGION END*/
		List<SigitTUnitaImmobiliareDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, unitaPrincipaleImpiantoRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitTUnitaImmobiliareDaoImpl::findUnitaPrincipaleImpianto] esecuzione query", ex);
			throw new SigitTUnitaImmobiliareDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTUnitaImmobiliareDaoImpl", "findUnitaPrincipaleImpianto", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitTUnitaImmobiliareDaoImpl::findUnitaPrincipaleImpianto] END");
		}
		return list;
	}

}
