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

/*PROTECTED REGION ID(R923267869) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTTrattH2O.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 *   - findByPrimaryKey (datagen::FindByPK)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 *   - ByCodImpianto (datagen::CustomDeleter)
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTTrattH2ODaoImpl extends AbstractDAO implements SigitTTrattH2ODao {
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
	 * Metodo di inserimento del DAO sigitTTrattH2O. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTTrattH2OPk
	 * @generated
	 */

	public SigitTTrattH2OPk insert(SigitTTrattH2ODto dto)

	{
		LOG.debug("[SigitTTrattH2ODaoImpl::insert] START");
		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	CODICE_IMPIANTO,L2_1_H2O_CLIMA_M3,L2_2_DUREZZA_H2O_FR,L2_3_FLG_TRATT_RISC_NON_RICH,L2_3_FLG_TRATT_CLIMA_ASSENTE,L2_3_DUREZZA_TOT_H2O_FR,L2_3_FLG_TRATT_CLIMA_FILTR,L2_3_FLG_TRATT_CLIMA_ADDOLC,L2_3_FLG_TRATT_CLIMA_CHIMICO,L2_3_FLG_TRATT_GELO_ASSENTE,L2_3_FLG_TRATT_GELO_GLI_ETIL,L2_3_PERC_GLI_ETIL,L2_3_PH_GLI_ETIL,L2_3_FLG_TRATT_GELO_GLI_PROP,L2_3_PERC_GLI_PROP,L2_3_PH_GLI_PROP,L2_4_FLG_TRATT_ACS_NON_RICH,L2_4_FLG_TRATT_ACS_ASSENTE,L2_4_FLG_TRATT_ACS_FILTR,L2_4_FLG_TRATT_ACS_ADDOLC,L2_4_DUREZZA_ADDOLC_FR,L2_4_FLG_TRATT_ACS_CHIMICO,L2_5_FLG_TRATT_RAFF_ASSENTE,L2_5_FLG_TRATT_RAFF_NO_RT,L2_5_FLG_TRATT_RAFF_RTP,L2_5_FLG_TRATT_RAFF_RTT,L2_5_FLG_TRATT_RAFF_ACQ,L2_5_FLG_TRATT_RAFF_PZZ,L2_5_FLG_TRATT_RAFF_H2O_SUP,L2_5_FLG_TRATT_F_FILT_SIC,L2_5_FLG_TRATT_F_FILT_MAS,L2_5_FLG_TRATT_F_NO_TRATT,L2_5_TRATT_F_ALTRO,L2_5_FLG_TRATT_T_ADDOLC,L2_5_FLG_TRATT_T_OSMOSI,L2_5_FLG_TRATT_T_DEMIN,L2_5_FLG_TRATT_T_NO_TRATT,L2_5_TRATT_T_ALTRO,L2_5_FLG_TRATT_C_PAANTINCRO,L2_5_FLG_TRATT_C_PAANTICORR,L2_5_FLG_TRATT_C_AAA,L2_5_FLG_TRATT_C_BIOCIDA,L2_5_FLG_TRATT_C_NO_TRATT,L2_5_TRATT_C_ALTRO,L2_5_FLG_SPURGO_AUTOM,L2_5_CONDUC_H2O_ING,L2_5_TARATURA ) VALUES (  :CODICE_IMPIANTO , :L2_1_H2O_CLIMA_M3 , :L2_2_DUREZZA_H2O_FR , :L2_3_FLG_TRATT_RISC_NON_RICH , :L2_3_FLG_TRATT_CLIMA_ASSENTE , :L2_3_DUREZZA_TOT_H2O_FR , :L2_3_FLG_TRATT_CLIMA_FILTR , :L2_3_FLG_TRATT_CLIMA_ADDOLC , :L2_3_FLG_TRATT_CLIMA_CHIMICO , :L2_3_FLG_TRATT_GELO_ASSENTE , :L2_3_FLG_TRATT_GELO_GLI_ETIL , :L2_3_PERC_GLI_ETIL , :L2_3_PH_GLI_ETIL , :L2_3_FLG_TRATT_GELO_GLI_PROP , :L2_3_PERC_GLI_PROP , :L2_3_PH_GLI_PROP , :L2_4_FLG_TRATT_ACS_NON_RICH , :L2_4_FLG_TRATT_ACS_ASSENTE , :L2_4_FLG_TRATT_ACS_FILTR , :L2_4_FLG_TRATT_ACS_ADDOLC , :L2_4_DUREZZA_ADDOLC_FR , :L2_4_FLG_TRATT_ACS_CHIMICO , :L2_5_FLG_TRATT_RAFF_ASSENTE , :L2_5_FLG_TRATT_RAFF_NO_RT , :L2_5_FLG_TRATT_RAFF_RTP , :L2_5_FLG_TRATT_RAFF_RTT , :L2_5_FLG_TRATT_RAFF_ACQ , :L2_5_FLG_TRATT_RAFF_PZZ , :L2_5_FLG_TRATT_RAFF_H2O_SUP , :L2_5_FLG_TRATT_F_FILT_SIC , :L2_5_FLG_TRATT_F_FILT_MAS , :L2_5_FLG_TRATT_F_NO_TRATT , :L2_5_TRATT_F_ALTRO , :L2_5_FLG_TRATT_T_ADDOLC , :L2_5_FLG_TRATT_T_OSMOSI , :L2_5_FLG_TRATT_T_DEMIN , :L2_5_FLG_TRATT_T_NO_TRATT , :L2_5_TRATT_T_ALTRO , :L2_5_FLG_TRATT_C_PAANTINCRO , :L2_5_FLG_TRATT_C_PAANTICORR , :L2_5_FLG_TRATT_C_AAA , :L2_5_FLG_TRATT_C_BIOCIDA , :L2_5_FLG_TRATT_C_NO_TRATT , :L2_5_TRATT_C_ALTRO , :L2_5_FLG_SPURGO_AUTOM , :L2_5_CONDUC_H2O_ING , :L2_5_TARATURA  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_1_H2O_CLIMA_M3]
		params.addValue("L2_1_H2O_CLIMA_M3", dto.getL21H2oClimaM3(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_2_DUREZZA_H2O_FR]
		params.addValue("L2_2_DUREZZA_H2O_FR", dto.getL22DurezzaH2oFr(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_FLG_TRATT_RISC_NON_RICH]
		params.addValue("L2_3_FLG_TRATT_RISC_NON_RICH", dto.getL23FlgTrattRiscNonRich(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_FLG_TRATT_CLIMA_ASSENTE]
		params.addValue("L2_3_FLG_TRATT_CLIMA_ASSENTE", dto.getL23FlgTrattClimaAssente(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_DUREZZA_TOT_H2O_FR]
		params.addValue("L2_3_DUREZZA_TOT_H2O_FR", dto.getL23DurezzaTotH2oFr(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_FLG_TRATT_CLIMA_FILTR]
		params.addValue("L2_3_FLG_TRATT_CLIMA_FILTR", dto.getL23FlgTrattClimaFiltr(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_FLG_TRATT_CLIMA_ADDOLC]
		params.addValue("L2_3_FLG_TRATT_CLIMA_ADDOLC", dto.getL23FlgTrattClimaAddolc(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_FLG_TRATT_CLIMA_CHIMICO]
		params.addValue("L2_3_FLG_TRATT_CLIMA_CHIMICO", dto.getL23FlgTrattClimaChimico(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_FLG_TRATT_GELO_ASSENTE]
		params.addValue("L2_3_FLG_TRATT_GELO_ASSENTE", dto.getL23FlgTrattGeloAssente(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_FLG_TRATT_GELO_GLI_ETIL]
		params.addValue("L2_3_FLG_TRATT_GELO_GLI_ETIL", dto.getL23FlgTrattGeloGliEtil(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_PERC_GLI_ETIL]
		params.addValue("L2_3_PERC_GLI_ETIL", dto.getL23PercGliEtil(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_PH_GLI_ETIL]
		params.addValue("L2_3_PH_GLI_ETIL", dto.getL23PhGliEtil(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_FLG_TRATT_GELO_GLI_PROP]
		params.addValue("L2_3_FLG_TRATT_GELO_GLI_PROP", dto.getL23FlgTrattGeloGliProp(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_PERC_GLI_PROP]
		params.addValue("L2_3_PERC_GLI_PROP", dto.getL23PercGliProp(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_3_PH_GLI_PROP]
		params.addValue("L2_3_PH_GLI_PROP", dto.getL23PhGliProp(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_4_FLG_TRATT_ACS_NON_RICH]
		params.addValue("L2_4_FLG_TRATT_ACS_NON_RICH", dto.getL24FlgTrattAcsNonRich(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_4_FLG_TRATT_ACS_ASSENTE]
		params.addValue("L2_4_FLG_TRATT_ACS_ASSENTE", dto.getL24FlgTrattAcsAssente(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_4_FLG_TRATT_ACS_FILTR]
		params.addValue("L2_4_FLG_TRATT_ACS_FILTR", dto.getL24FlgTrattAcsFiltr(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_4_FLG_TRATT_ACS_ADDOLC]
		params.addValue("L2_4_FLG_TRATT_ACS_ADDOLC", dto.getL24FlgTrattAcsAddolc(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_4_DUREZZA_ADDOLC_FR]
		params.addValue("L2_4_DUREZZA_ADDOLC_FR", dto.getL24DurezzaAddolcFr(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_4_FLG_TRATT_ACS_CHIMICO]
		params.addValue("L2_4_FLG_TRATT_ACS_CHIMICO", dto.getL24FlgTrattAcsChimico(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_RAFF_ASSENTE]
		params.addValue("L2_5_FLG_TRATT_RAFF_ASSENTE", dto.getL25FlgTrattRaffAssente(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_RAFF_NO_RT]
		params.addValue("L2_5_FLG_TRATT_RAFF_NO_RT", dto.getL25FlgTrattRaffNoRt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_RAFF_RTP]
		params.addValue("L2_5_FLG_TRATT_RAFF_RTP", dto.getL25FlgTrattRaffRtp(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_RAFF_RTT]
		params.addValue("L2_5_FLG_TRATT_RAFF_RTT", dto.getL25FlgTrattRaffRtt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_RAFF_ACQ]
		params.addValue("L2_5_FLG_TRATT_RAFF_ACQ", dto.getL25FlgTrattRaffAcq(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_RAFF_PZZ]
		params.addValue("L2_5_FLG_TRATT_RAFF_PZZ", dto.getL25FlgTrattRaffPzz(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_RAFF_H2O_SUP]
		params.addValue("L2_5_FLG_TRATT_RAFF_H2O_SUP", dto.getL25FlgTrattRaffH2oSup(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_F_FILT_SIC]
		params.addValue("L2_5_FLG_TRATT_F_FILT_SIC", dto.getL25FlgTrattFFiltSic(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_F_FILT_MAS]
		params.addValue("L2_5_FLG_TRATT_F_FILT_MAS", dto.getL25FlgTrattFFiltMas(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_F_NO_TRATT]
		params.addValue("L2_5_FLG_TRATT_F_NO_TRATT", dto.getL25FlgTrattFNoTratt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_TRATT_F_ALTRO]
		params.addValue("L2_5_TRATT_F_ALTRO", dto.getL25TrattFAltro(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_T_ADDOLC]
		params.addValue("L2_5_FLG_TRATT_T_ADDOLC", dto.getL25FlgTrattTAddolc(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_T_OSMOSI]
		params.addValue("L2_5_FLG_TRATT_T_OSMOSI", dto.getL25FlgTrattTOsmosi(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_T_DEMIN]
		params.addValue("L2_5_FLG_TRATT_T_DEMIN", dto.getL25FlgTrattTDemin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_T_NO_TRATT]
		params.addValue("L2_5_FLG_TRATT_T_NO_TRATT", dto.getL25FlgTrattTNoTratt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_TRATT_T_ALTRO]
		params.addValue("L2_5_TRATT_T_ALTRO", dto.getL25TrattTAltro(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_C_PAANTINCRO]
		params.addValue("L2_5_FLG_TRATT_C_PAANTINCRO", dto.getL25FlgTrattCPaantincro(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_C_PAANTICORR]
		params.addValue("L2_5_FLG_TRATT_C_PAANTICORR", dto.getL25FlgTrattCPaanticorr(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_C_AAA]
		params.addValue("L2_5_FLG_TRATT_C_AAA", dto.getL25FlgTrattCAaa(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_C_BIOCIDA]
		params.addValue("L2_5_FLG_TRATT_C_BIOCIDA", dto.getL25FlgTrattCBiocida(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_TRATT_C_NO_TRATT]
		params.addValue("L2_5_FLG_TRATT_C_NO_TRATT", dto.getL25FlgTrattCNoTratt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_TRATT_C_ALTRO]
		params.addValue("L2_5_TRATT_C_ALTRO", dto.getL25TrattCAltro(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L2_5_FLG_SPURGO_AUTOM]
		params.addValue("L2_5_FLG_SPURGO_AUTOM", dto.getL25FlgSpurgoAutom(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_CONDUC_H2O_ING]
		params.addValue("L2_5_CONDUC_H2O_ING", dto.getL25ConducH2oIng(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L2_5_TARATURA]
		params.addValue("L2_5_TARATURA", dto.getL25Taratura(), java.sql.Types.NUMERIC);

		insert(jdbcTemplate, sql.toString(), params);

		LOG.debug("[SigitTTrattH2ODaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Custom deleter in the SIGIT_T_TRATT_H2O table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(Integer filter) throws SigitTTrattH2ODaoException {
		LOG.debug("[SigitTTrattH2ODaoImpl::customDeleterByCodImpianto] START");
		/*PROTECTED REGION ID(R1271129634) ENABLED START*/
		//***scrivere la custom query
		final String sql = "DELETE FROM " + getTableName() + " WHERE CODICE_IMPIANTO = :codImpianto";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("codImpianto", filter, java.sql.Types.NUMERIC);
		/*PROTECTED REGION END*/

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTTrattH2ODaoImpl::customDeleterByCodImpianto] END");
	}

	protected SigitTTrattH2ODaoRowMapper findByPrimaryKeyRowMapper = new SigitTTrattH2ODaoRowMapper(null,
			SigitTTrattH2ODto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_TRATT_H2O";
	}

	/** 
	 * Returns all rows from the SIGIT_T_TRATT_H2O table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitTTrattH2ODto findByPrimaryKey(SigitTTrattH2OPk pk) throws SigitTTrattH2ODaoException {
		LOG.debug("[SigitTTrattH2ODaoImpl::findByPrimaryKey] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT CODICE_IMPIANTO,L2_1_H2O_CLIMA_M3,L2_2_DUREZZA_H2O_FR,L2_3_FLG_TRATT_RISC_NON_RICH,L2_3_FLG_TRATT_CLIMA_ASSENTE,L2_3_DUREZZA_TOT_H2O_FR,L2_3_FLG_TRATT_CLIMA_FILTR,L2_3_FLG_TRATT_CLIMA_ADDOLC,L2_3_FLG_TRATT_CLIMA_CHIMICO,L2_3_FLG_TRATT_GELO_ASSENTE,L2_3_FLG_TRATT_GELO_GLI_ETIL,L2_3_PERC_GLI_ETIL,L2_3_PH_GLI_ETIL,L2_3_FLG_TRATT_GELO_GLI_PROP,L2_3_PERC_GLI_PROP,L2_3_PH_GLI_PROP,L2_4_FLG_TRATT_ACS_NON_RICH,L2_4_FLG_TRATT_ACS_ASSENTE,L2_4_FLG_TRATT_ACS_FILTR,L2_4_FLG_TRATT_ACS_ADDOLC,L2_4_DUREZZA_ADDOLC_FR,L2_4_FLG_TRATT_ACS_CHIMICO,L2_5_FLG_TRATT_RAFF_ASSENTE,L2_5_FLG_TRATT_RAFF_NO_RT,L2_5_FLG_TRATT_RAFF_RTP,L2_5_FLG_TRATT_RAFF_RTT,L2_5_FLG_TRATT_RAFF_ACQ,L2_5_FLG_TRATT_RAFF_PZZ,L2_5_FLG_TRATT_RAFF_H2O_SUP,L2_5_FLG_TRATT_F_FILT_SIC,L2_5_FLG_TRATT_F_FILT_MAS,L2_5_FLG_TRATT_F_NO_TRATT,L2_5_TRATT_F_ALTRO,L2_5_FLG_TRATT_T_ADDOLC,L2_5_FLG_TRATT_T_OSMOSI,L2_5_FLG_TRATT_T_DEMIN,L2_5_FLG_TRATT_T_NO_TRATT,L2_5_TRATT_T_ALTRO,L2_5_FLG_TRATT_C_PAANTINCRO,L2_5_FLG_TRATT_C_PAANTICORR,L2_5_FLG_TRATT_C_AAA,L2_5_FLG_TRATT_C_BIOCIDA,L2_5_FLG_TRATT_C_NO_TRATT,L2_5_TRATT_C_ALTRO,L2_5_FLG_SPURGO_AUTOM,L2_5_CONDUC_H2O_ING,L2_5_TARATURA FROM "
						+ getTableName() + " WHERE CODICE_IMPIANTO = :CODICE_IMPIANTO ");

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", pk.getCodiceImpianto(), java.sql.Types.NUMERIC);

		List<SigitTTrattH2ODto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findByPrimaryKeyRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitTTrattH2ODaoImpl::findByPrimaryKey] ERROR esecuzione query", ex);
			throw new SigitTTrattH2ODaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTTrattH2ODaoImpl", "findByPrimaryKey", "esecuzione query", sql.toString());
			LOG.debug("[SigitTTrattH2ODaoImpl::findByPrimaryKey] END");
		}
		return list.isEmpty() ? null : list.get(0);
	}

}
