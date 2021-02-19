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

/*PROTECTED REGION ID(R638464675) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTRappTipo2.
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
public class SigitTRappTipo2DaoImpl extends AbstractDAO implements SigitTRappTipo2Dao {
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
	 * Metodo di inserimento del DAO sigitTRappTipo2. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTRappTipo2Pk
	 * @generated
	 */

	public SigitTRappTipo2Pk insert(SigitTRappTipo2Dto dto)

	{
		LOG.debug("[SigitTRappTipo2DaoImpl::insert] START");
		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_ALLEGATO,D_FLG_LOCALE_IDONEO,D_FLG_APERTURE_LIBERE,D_FLG_APERTURE_ADEG,D_FLG_LINEA_ELETT_IDONEA,F_FLG_SOSTITUZ_GENERATORI,F_FLG_SOSTITUZ_SISTEMI_REG,F_FLG_ISOL_DISTRIBUZ_H2O,F_FLG_ISOL_DISTRIBUZ_ARIA,C_FLG_TRATT_CLIMA_NON_RICHIEST,D_FLG_COIB_IDONEA ) VALUES (  :ID_ALLEGATO , :D_FLG_LOCALE_IDONEO , :D_FLG_APERTURE_LIBERE , :D_FLG_APERTURE_ADEG , :D_FLG_LINEA_ELETT_IDONEA , :F_FLG_SOSTITUZ_GENERATORI , :F_FLG_SOSTITUZ_SISTEMI_REG , :F_FLG_ISOL_DISTRIBUZ_H2O , :F_FLG_ISOL_DISTRIBUZ_ARIA , :C_FLG_TRATT_CLIMA_NON_RICHIEST , :D_FLG_COIB_IDONEA  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_ALLEGATO]
		params.addValue("ID_ALLEGATO", dto.getIdAllegato(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_LOCALE_IDONEO]
		params.addValue("D_FLG_LOCALE_IDONEO", dto.getDFlgLocaleIdoneo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_APERTURE_LIBERE]
		params.addValue("D_FLG_APERTURE_LIBERE", dto.getDFlgApertureLibere(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_APERTURE_ADEG]
		params.addValue("D_FLG_APERTURE_ADEG", dto.getDFlgApertureAdeg(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_LINEA_ELETT_IDONEA]
		params.addValue("D_FLG_LINEA_ELETT_IDONEA", dto.getDFlgLineaElettIdonea(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_SOSTITUZ_GENERATORI]
		params.addValue("F_FLG_SOSTITUZ_GENERATORI", dto.getFFlgSostituzGeneratori(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_SOSTITUZ_SISTEMI_REG]
		params.addValue("F_FLG_SOSTITUZ_SISTEMI_REG", dto.getFFlgSostituzSistemiReg(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_ISOL_DISTRIBUZ_H2O]
		params.addValue("F_FLG_ISOL_DISTRIBUZ_H2O", dto.getFFlgIsolDistribuzH2o(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_ISOL_DISTRIBUZ_ARIA]
		params.addValue("F_FLG_ISOL_DISTRIBUZ_ARIA", dto.getFFlgIsolDistribuzAria(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [C_FLG_TRATT_CLIMA_NON_RICHIEST]
		params.addValue("C_FLG_TRATT_CLIMA_NON_RICHIEST", dto.getCFlgTrattClimaNonRichiest(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_COIB_IDONEA]
		params.addValue("D_FLG_COIB_IDONEA", dto.getDFlgCoibIdonea(), java.sql.Types.NUMERIC);

		insert(jdbcTemplate, sql.toString(), params);

		LOG.debug("[SigitTRappTipo2DaoImpl::insert] END");
		return dto.createPk();

	}

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_RAPP_TIPO2";
	}

}
