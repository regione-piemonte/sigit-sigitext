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

/*PROTECTED REGION ID(R-810252189) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTDettTipo2.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 
 *    --
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTDettTipo2DaoImpl extends AbstractDAO implements SigitTDettTipo2Dao {
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
	 * Metodo di inserimento del DAO sigitTDettTipo2. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTDettTipo2Pk
	 * @generated
	 */

	public SigitTDettTipo2Pk insert(SigitTDettTipo2Dto dto)

	{
		LOG.debug("[SigitTDettTipo2DaoImpl::insert] START");
		java.math.BigDecimal newKey = java.math.BigDecimal.valueOf(incrementer.nextLongValue());

		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_DETT_TIPO2,FK_ALLEGATO,CODICE_IMPIANTO,FK_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,E_N_CIRCUITO,E_FLG_MOD_PROVA,E_FLG_PERDITA_GAS,E_FLG_LEAK_DETECTOR,E_FLG_PARAM_TERMODINAM,E_FLG_INCROSTAZIONI,E_T_SURRISC_C,E_T_SOTTORAF_C,E_T_CONDENSAZIONE_C,E_T_EVAPORAZIONE_C,E_T_IN_EXT_C,E_T_OUT_EXT_C,E_T_IN_UTENZE_C,E_T_OUT_UTENZE_C,DATA_ULT_MOD,UTENTE_ULT_MOD,L11_2_TORRE_T_OUT_FLUIDO,L11_2_TORRE_T_BULBO_UMIDO,L11_2_SCAMBIATORE_T_IN_EXT,L11_2_SCAMBIATORE_T_OUT_EXT,L11_2_SCAMBIAT_T_IN_MACCHINA,L11_2_SCAMBIAT_T_OUT_MACCHINA,L11_2_POTENZA_ASSORBITA_KW,L11_2_FLG_PULIZIA_FILTRI,L11_2_FLG_VERIFICA_SUPERATA,L11_2_DATA_RIPRISTINO,E_CONTROLLOWEB ) VALUES (  :ID_DETT_TIPO2 , :FK_ALLEGATO , :CODICE_IMPIANTO , :FK_TIPO_COMPONENTE , :PROGRESSIVO , :DATA_INSTALL , :E_N_CIRCUITO , :E_FLG_MOD_PROVA , :E_FLG_PERDITA_GAS , :E_FLG_LEAK_DETECTOR , :E_FLG_PARAM_TERMODINAM , :E_FLG_INCROSTAZIONI , :E_T_SURRISC_C , :E_T_SOTTORAF_C , :E_T_CONDENSAZIONE_C , :E_T_EVAPORAZIONE_C , :E_T_IN_EXT_C , :E_T_OUT_EXT_C , :E_T_IN_UTENZE_C , :E_T_OUT_UTENZE_C , :DATA_ULT_MOD , :UTENTE_ULT_MOD , :L11_2_TORRE_T_OUT_FLUIDO , :L11_2_TORRE_T_BULBO_UMIDO , :L11_2_SCAMBIATORE_T_IN_EXT , :L11_2_SCAMBIATORE_T_OUT_EXT , :L11_2_SCAMBIAT_T_IN_MACCHINA , :L11_2_SCAMBIAT_T_OUT_MACCHINA , :L11_2_POTENZA_ASSORBITA_KW , :L11_2_FLG_PULIZIA_FILTRI , :L11_2_FLG_VERIFICA_SUPERATA , :L11_2_DATA_RIPRISTINO , :E_CONTROLLOWEB  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_DETT_TIPO2]
		params.addValue("ID_DETT_TIPO2", newKey, java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_ALLEGATO]
		params.addValue("FK_ALLEGATO", dto.getFkAllegato(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_TIPO_COMPONENTE]
		params.addValue("FK_TIPO_COMPONENTE", dto.getFkTipoComponente(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PROGRESSIVO]
		params.addValue("PROGRESSIVO", dto.getProgressivo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INSTALL]
		params.addValue("DATA_INSTALL", dto.getDataInstall(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [E_N_CIRCUITO]
		params.addValue("E_N_CIRCUITO", dto.getENCircuito(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [E_FLG_MOD_PROVA]
		params.addValue("E_FLG_MOD_PROVA", dto.getEFlgModProva(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [E_FLG_PERDITA_GAS]
		params.addValue("E_FLG_PERDITA_GAS", dto.getEFlgPerditaGas(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_LEAK_DETECTOR]
		params.addValue("E_FLG_LEAK_DETECTOR", dto.getEFlgLeakDetector(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_PARAM_TERMODINAM]
		params.addValue("E_FLG_PARAM_TERMODINAM", dto.getEFlgParamTermodinam(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_INCROSTAZIONI]
		params.addValue("E_FLG_INCROSTAZIONI", dto.getEFlgIncrostazioni(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_T_SURRISC_C]
		params.addValue("E_T_SURRISC_C", dto.getETSurriscC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_T_SOTTORAF_C]
		params.addValue("E_T_SOTTORAF_C", dto.getETSottorafC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_T_CONDENSAZIONE_C]
		params.addValue("E_T_CONDENSAZIONE_C", dto.getETCondensazioneC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_T_EVAPORAZIONE_C]
		params.addValue("E_T_EVAPORAZIONE_C", dto.getETEvaporazioneC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_T_IN_EXT_C]
		params.addValue("E_T_IN_EXT_C", dto.getETInExtC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_T_OUT_EXT_C]
		params.addValue("E_T_OUT_EXT_C", dto.getETOutExtC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_T_IN_UTENZE_C]
		params.addValue("E_T_IN_UTENZE_C", dto.getETInUtenzeC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_T_OUT_UTENZE_C]
		params.addValue("E_T_OUT_UTENZE_C", dto.getETOutUtenzeC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L11_2_TORRE_T_OUT_FLUIDO]
		params.addValue("L11_2_TORRE_T_OUT_FLUIDO", dto.getL112TorreTOutFluido(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_2_TORRE_T_BULBO_UMIDO]
		params.addValue("L11_2_TORRE_T_BULBO_UMIDO", dto.getL112TorreTBulboUmido(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_2_SCAMBIATORE_T_IN_EXT]
		params.addValue("L11_2_SCAMBIATORE_T_IN_EXT", dto.getL112ScambiatoreTInExt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_2_SCAMBIATORE_T_OUT_EXT]
		params.addValue("L11_2_SCAMBIATORE_T_OUT_EXT", dto.getL112ScambiatoreTOutExt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_2_SCAMBIAT_T_IN_MACCHINA]
		params.addValue("L11_2_SCAMBIAT_T_IN_MACCHINA", dto.getL112ScambiatTInMacchina(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_2_SCAMBIAT_T_OUT_MACCHINA]
		params.addValue("L11_2_SCAMBIAT_T_OUT_MACCHINA", dto.getL112ScambiatTOutMacchina(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_2_POTENZA_ASSORBITA_KW]
		params.addValue("L11_2_POTENZA_ASSORBITA_KW", dto.getL112PotenzaAssorbitaKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_2_FLG_PULIZIA_FILTRI]
		params.addValue("L11_2_FLG_PULIZIA_FILTRI", dto.getL112FlgPuliziaFiltri(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_2_FLG_VERIFICA_SUPERATA]
		params.addValue("L11_2_FLG_VERIFICA_SUPERATA", dto.getL112FlgVerificaSuperata(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_2_DATA_RIPRISTINO]
		params.addValue("L11_2_DATA_RIPRISTINO", dto.getL112DataRipristino(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [E_CONTROLLOWEB]
		params.addValue("E_CONTROLLOWEB", dto.getEControlloweb(), java.sql.Types.TIMESTAMP);

		insert(jdbcTemplate, sql.toString(), params);

		dto.setIdDettTipo2(newKey);
		LOG.debug("[SigitTDettTipo2DaoImpl::insert] END");
		return dto.createPk();

	}

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_DETT_TIPO2";
	}

}
