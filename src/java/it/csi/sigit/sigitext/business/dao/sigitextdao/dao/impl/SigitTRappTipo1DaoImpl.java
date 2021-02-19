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

/*PROTECTED REGION ID(R-387027325) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTRappTipo1.
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
public class SigitTRappTipo1DaoImpl extends AbstractDAO implements SigitTRappTipo1Dao {
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
	 * Metodo di inserimento del DAO sigitTRappTipo1. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTRappTipo1Pk
	 * @generated
	 */

	public SigitTRappTipo1Pk insert(SigitTRappTipo1Dto dto)

	{
		LOG.debug("[SigitTRappTipo1DaoImpl::insert] START");
		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_ALLEGATO,D_FLG_LOCALE_INT_IDONEO,D_FLG_GEN_EXT_IDONEO,D_FLG_APERTURE_LIBERE,D_FLG_APERTURE_ADEG,D_FLG_SCARICO_IDONEO,D_FLG_TEMP_AMB_FUNZ,D_FLG_ASSENZA_PERD_COMB,D_FLG_IDO_TEN_IMP_INT,F_FLG_ADOZIONE_VALVOLE_TERM,F_FLG_ISOLAMENTE_RETE,F_FLG_ADOZ_SIST_TRATTAM_H2O,F_FLG_SOSTITUZ_SIST_REGOLAZ,C_FLG_TRATT_CLIMA_NON_RICH,C_FLG_TRATT_ACS_NON_RICHIESTO ) VALUES (  :ID_ALLEGATO , :D_FLG_LOCALE_INT_IDONEO , :D_FLG_GEN_EXT_IDONEO , :D_FLG_APERTURE_LIBERE , :D_FLG_APERTURE_ADEG , :D_FLG_SCARICO_IDONEO , :D_FLG_TEMP_AMB_FUNZ , :D_FLG_ASSENZA_PERD_COMB , :D_FLG_IDO_TEN_IMP_INT , :F_FLG_ADOZIONE_VALVOLE_TERM , :F_FLG_ISOLAMENTE_RETE , :F_FLG_ADOZ_SIST_TRATTAM_H2O , :F_FLG_SOSTITUZ_SIST_REGOLAZ , :C_FLG_TRATT_CLIMA_NON_RICH , :C_FLG_TRATT_ACS_NON_RICHIESTO  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_ALLEGATO]
		params.addValue("ID_ALLEGATO", dto.getIdAllegato(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_LOCALE_INT_IDONEO]
		params.addValue("D_FLG_LOCALE_INT_IDONEO", dto.getDFlgLocaleIntIdoneo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_GEN_EXT_IDONEO]
		params.addValue("D_FLG_GEN_EXT_IDONEO", dto.getDFlgGenExtIdoneo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_APERTURE_LIBERE]
		params.addValue("D_FLG_APERTURE_LIBERE", dto.getDFlgApertureLibere(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_APERTURE_ADEG]
		params.addValue("D_FLG_APERTURE_ADEG", dto.getDFlgApertureAdeg(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_SCARICO_IDONEO]
		params.addValue("D_FLG_SCARICO_IDONEO", dto.getDFlgScaricoIdoneo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_TEMP_AMB_FUNZ]
		params.addValue("D_FLG_TEMP_AMB_FUNZ", dto.getDFlgTempAmbFunz(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_ASSENZA_PERD_COMB]
		params.addValue("D_FLG_ASSENZA_PERD_COMB", dto.getDFlgAssenzaPerdComb(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_IDO_TEN_IMP_INT]
		params.addValue("D_FLG_IDO_TEN_IMP_INT", dto.getDFlgIdoTenImpInt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_ADOZIONE_VALVOLE_TERM]
		params.addValue("F_FLG_ADOZIONE_VALVOLE_TERM", dto.getFFlgAdozioneValvoleTerm(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_ISOLAMENTE_RETE]
		params.addValue("F_FLG_ISOLAMENTE_RETE", dto.getFFlgIsolamenteRete(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_ADOZ_SIST_TRATTAM_H2O]
		params.addValue("F_FLG_ADOZ_SIST_TRATTAM_H2O", dto.getFFlgAdozSistTrattamH2o(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_SOSTITUZ_SIST_REGOLAZ]
		params.addValue("F_FLG_SOSTITUZ_SIST_REGOLAZ", dto.getFFlgSostituzSistRegolaz(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [C_FLG_TRATT_CLIMA_NON_RICH]
		params.addValue("C_FLG_TRATT_CLIMA_NON_RICH", dto.getCFlgTrattClimaNonRich(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [C_FLG_TRATT_ACS_NON_RICHIESTO]
		params.addValue("C_FLG_TRATT_ACS_NON_RICHIESTO", dto.getCFlgTrattAcsNonRichiesto(), java.sql.Types.NUMERIC);

		insert(jdbcTemplate, sql.toString(), params);

		LOG.debug("[SigitTRappTipo1DaoImpl::insert] END");
		return dto.createPk();

	}

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_RAPP_TIPO1";
	}

}
