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

/*PROTECTED REGION ID(R215239811) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTDettTipo3.
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
public class SigitTDettTipo3DaoImpl extends AbstractDAO implements SigitTDettTipo3Dao {
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
	 * Metodo di inserimento del DAO sigitTDettTipo3. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTDettTipo3Pk
	 * @generated
	 */

	public SigitTDettTipo3Pk insert(SigitTDettTipo3Dto dto)

	{
		LOG.debug("[SigitTDettTipo3DaoImpl::insert] START");
		java.math.BigDecimal newKey = java.math.BigDecimal.valueOf(incrementer.nextLongValue());

		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_DETT_TIPO3,FK_ALLEGATO,CODICE_IMPIANTO,FK_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,FK_FLUIDO,FK_FLUIDO_ALIMENTAZ,E_FLUIDO_ALTRO,E_ALIMENTAZIONE_ALTRO,E_FLG_CLIMA_INVERNO,E_FLG_PRODUZ_ACS,E_FLG_POTENZA_COMPATIBILE,E_FLG_COIB_IDONEA,E_FLG_DISP_FUNZIONANTI,E_TEMP_EXT_C,E_TEMP_MAND_PRIMARIO_C,E_TEMP_RITOR_PRIMARIO_C,E_TEMP_MAND_SECONDARIO_C,E_TEMP_RIT_SECONDARIO_C,E_POTENZA_TERM_KW,E_PORT_FLUIDO_M3_H,DATA_ULT_MOD,UTENTE_ULT_MOD,E_CONTROLLOWEB ) VALUES (  :ID_DETT_TIPO3 , :FK_ALLEGATO , :CODICE_IMPIANTO , :FK_TIPO_COMPONENTE , :PROGRESSIVO , :DATA_INSTALL , :FK_FLUIDO , :FK_FLUIDO_ALIMENTAZ , :E_FLUIDO_ALTRO , :E_ALIMENTAZIONE_ALTRO , :E_FLG_CLIMA_INVERNO , :E_FLG_PRODUZ_ACS , :E_FLG_POTENZA_COMPATIBILE , :E_FLG_COIB_IDONEA , :E_FLG_DISP_FUNZIONANTI , :E_TEMP_EXT_C , :E_TEMP_MAND_PRIMARIO_C , :E_TEMP_RITOR_PRIMARIO_C , :E_TEMP_MAND_SECONDARIO_C , :E_TEMP_RIT_SECONDARIO_C , :E_POTENZA_TERM_KW , :E_PORT_FLUIDO_M3_H , :DATA_ULT_MOD , :UTENTE_ULT_MOD , :E_CONTROLLOWEB  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_DETT_TIPO3]
		params.addValue("ID_DETT_TIPO3", newKey, java.sql.Types.NUMERIC);

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

		// valorizzazione paametro relativo a colonna [FK_FLUIDO]
		params.addValue("FK_FLUIDO", dto.getFkFluido(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_FLUIDO_ALIMENTAZ]
		params.addValue("FK_FLUIDO_ALIMENTAZ", dto.getFkFluidoAlimentaz(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLUIDO_ALTRO]
		params.addValue("E_FLUIDO_ALTRO", dto.getEFluidoAltro(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [E_ALIMENTAZIONE_ALTRO]
		params.addValue("E_ALIMENTAZIONE_ALTRO", dto.getEAlimentazioneAltro(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [E_FLG_CLIMA_INVERNO]
		params.addValue("E_FLG_CLIMA_INVERNO", dto.getEFlgClimaInverno(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_PRODUZ_ACS]
		params.addValue("E_FLG_PRODUZ_ACS", dto.getEFlgProduzAcs(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_POTENZA_COMPATIBILE]
		params.addValue("E_FLG_POTENZA_COMPATIBILE", dto.getEFlgPotenzaCompatibile(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_COIB_IDONEA]
		params.addValue("E_FLG_COIB_IDONEA", dto.getEFlgCoibIdonea(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_DISP_FUNZIONANTI]
		params.addValue("E_FLG_DISP_FUNZIONANTI", dto.getEFlgDispFunzionanti(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_EXT_C]
		params.addValue("E_TEMP_EXT_C", dto.getETempExtC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_MAND_PRIMARIO_C]
		params.addValue("E_TEMP_MAND_PRIMARIO_C", dto.getETempMandPrimarioC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_RITOR_PRIMARIO_C]
		params.addValue("E_TEMP_RITOR_PRIMARIO_C", dto.getETempRitorPrimarioC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_MAND_SECONDARIO_C]
		params.addValue("E_TEMP_MAND_SECONDARIO_C", dto.getETempMandSecondarioC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_RIT_SECONDARIO_C]
		params.addValue("E_TEMP_RIT_SECONDARIO_C", dto.getETempRitSecondarioC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_POTENZA_TERM_KW]
		params.addValue("E_POTENZA_TERM_KW", dto.getEPotenzaTermKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_PORT_FLUIDO_M3_H]
		params.addValue("E_PORT_FLUIDO_M3_H", dto.getEPortFluidoM3H(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [E_CONTROLLOWEB]
		params.addValue("E_CONTROLLOWEB", dto.getEControlloweb(), java.sql.Types.TIMESTAMP);

		insert(jdbcTemplate, sql.toString(), params);

		dto.setIdDettTipo3(newKey);
		LOG.debug("[SigitTDettTipo3DaoImpl::insert] END");
		return dto.createPk();

	}

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_DETT_TIPO3";
	}

}
