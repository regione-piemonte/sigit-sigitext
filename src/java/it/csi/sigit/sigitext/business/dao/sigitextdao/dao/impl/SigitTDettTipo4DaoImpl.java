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

/*PROTECTED REGION ID(R1240731811) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTDettTipo4.
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
public class SigitTDettTipo4DaoImpl extends AbstractDAO implements SigitTDettTipo4Dao {
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
	 * Metodo di inserimento del DAO sigitTDettTipo4. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTDettTipo4Pk
	 * @generated
	 */

	public SigitTDettTipo4Pk insert(SigitTDettTipo4Dto dto)

	{
		LOG.debug("[SigitTDettTipo4DaoImpl::insert] START");
		java.math.BigDecimal newKey = java.math.BigDecimal.valueOf(incrementer.nextLongValue());

		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_DETT_TIPO4,FK_ALLEGATO,CODICE_IMPIANTO,FK_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,FK_FLUIDO,E_POTENZA_ASSORB_COMB_KW,E_POTENZA_TERM_BYPASS_KW,E_TEMP_ARIA_C,E_TEMP_H2O_OUT_C,E_TEMP_H2O_IN_C,E_POTENZA_MORSETTI_KW,E_TEMP_H2O_MOTORE_C,E_TEMP_FUMI_VALLE_C,E_TEMP_FUMI_MONTE_C,DATA_ULT_MOD,UTENTE_ULT_MOD,L11_4_SOVRAFREQ_SOGLIA_HZ_MIN,L11_4_SOVRAFREQ_SOGLIA_HZ_MED,L11_4_SOVRAFREQ_SOGLIA_HZ_MAX,L11_4_SOVRAFREQ_TEMPO_S_MIN,L11_4_SOVRAFREQ_TEMPO_S_MED,L11_4_SOVRAFREQ_TEMPO_S_MAX,L11_4_SOTTOFREQ_SOGLIA_HZ_MIN,L11_4_SOTTOFREQ_SOGLIA_HZ_MED,L11_4_SOTTOFREQ_SOGLIA_HZ_MAX,L11_4_SOTTOFREQ_TEMPO_S_MIN,L11_4_SOTTOFREQ_TEMPO_S_MED,L11_4_SOTTOFREQ_TEMPO_S_MAX,L11_4_SOVRATENS_SOGLIA_V_MIN,L11_4_SOVRATENS_SOGLIA_V_MED,L11_4_SOVRATENS_SOGLIA_V_MAX,L11_4_SOVRATENS_TEMPO_S_MIN,L11_4_SOVRATENS_TEMPO_S_MED,L11_4_SOVRATENS_TEMPO_S_MAX,L11_4_SOTTOTENS_SOGLIA_V_MIN,L11_4_SOTTOTENS_SOGLIA_V_MED,L11_4_SOTTOTENS_SOGLIA_V_MAX,L11_4_SOTTOTENS_TEMPO_S_MIN,L11_4_SOTTOTENS_TEMPO_S_MED,L11_4_SOTTOTENS_TEMPO_S_MAX,E_CONTROLLOWEB ) VALUES (  :ID_DETT_TIPO4 , :FK_ALLEGATO , :CODICE_IMPIANTO , :FK_TIPO_COMPONENTE , :PROGRESSIVO , :DATA_INSTALL , :FK_FLUIDO , :E_POTENZA_ASSORB_COMB_KW , :E_POTENZA_TERM_BYPASS_KW , :E_TEMP_ARIA_C , :E_TEMP_H2O_OUT_C , :E_TEMP_H2O_IN_C , :E_POTENZA_MORSETTI_KW , :E_TEMP_H2O_MOTORE_C , :E_TEMP_FUMI_VALLE_C , :E_TEMP_FUMI_MONTE_C , :DATA_ULT_MOD , :UTENTE_ULT_MOD , :L11_4_SOVRAFREQ_SOGLIA_HZ_MIN , :L11_4_SOVRAFREQ_SOGLIA_HZ_MED , :L11_4_SOVRAFREQ_SOGLIA_HZ_MAX , :L11_4_SOVRAFREQ_TEMPO_S_MIN , :L11_4_SOVRAFREQ_TEMPO_S_MED , :L11_4_SOVRAFREQ_TEMPO_S_MAX , :L11_4_SOTTOFREQ_SOGLIA_HZ_MIN , :L11_4_SOTTOFREQ_SOGLIA_HZ_MED , :L11_4_SOTTOFREQ_SOGLIA_HZ_MAX , :L11_4_SOTTOFREQ_TEMPO_S_MIN , :L11_4_SOTTOFREQ_TEMPO_S_MED , :L11_4_SOTTOFREQ_TEMPO_S_MAX , :L11_4_SOVRATENS_SOGLIA_V_MIN , :L11_4_SOVRATENS_SOGLIA_V_MED , :L11_4_SOVRATENS_SOGLIA_V_MAX , :L11_4_SOVRATENS_TEMPO_S_MIN , :L11_4_SOVRATENS_TEMPO_S_MED , :L11_4_SOVRATENS_TEMPO_S_MAX , :L11_4_SOTTOTENS_SOGLIA_V_MIN , :L11_4_SOTTOTENS_SOGLIA_V_MED , :L11_4_SOTTOTENS_SOGLIA_V_MAX , :L11_4_SOTTOTENS_TEMPO_S_MIN , :L11_4_SOTTOTENS_TEMPO_S_MED , :L11_4_SOTTOTENS_TEMPO_S_MAX , :E_CONTROLLOWEB  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_DETT_TIPO4]
		params.addValue("ID_DETT_TIPO4", newKey, java.sql.Types.NUMERIC);

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

		// valorizzazione paametro relativo a colonna [E_POTENZA_ASSORB_COMB_KW]
		params.addValue("E_POTENZA_ASSORB_COMB_KW", dto.getEPotenzaAssorbCombKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_POTENZA_TERM_BYPASS_KW]
		params.addValue("E_POTENZA_TERM_BYPASS_KW", dto.getEPotenzaTermBypassKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_ARIA_C]
		params.addValue("E_TEMP_ARIA_C", dto.getETempAriaC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_H2O_OUT_C]
		params.addValue("E_TEMP_H2O_OUT_C", dto.getETempH2oOutC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_H2O_IN_C]
		params.addValue("E_TEMP_H2O_IN_C", dto.getETempH2oInC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_POTENZA_MORSETTI_KW]
		params.addValue("E_POTENZA_MORSETTI_KW", dto.getEPotenzaMorsettiKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_H2O_MOTORE_C]
		params.addValue("E_TEMP_H2O_MOTORE_C", dto.getETempH2oMotoreC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_FUMI_VALLE_C]
		params.addValue("E_TEMP_FUMI_VALLE_C", dto.getETempFumiValleC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_FUMI_MONTE_C]
		params.addValue("E_TEMP_FUMI_MONTE_C", dto.getETempFumiMonteC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L11_4_SOVRAFREQ_SOGLIA_HZ_MIN]
		params.addValue("L11_4_SOVRAFREQ_SOGLIA_HZ_MIN", dto.getL114SovrafreqSogliaHzMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOVRAFREQ_SOGLIA_HZ_MED]
		params.addValue("L11_4_SOVRAFREQ_SOGLIA_HZ_MED", dto.getL114SovrafreqSogliaHzMed(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOVRAFREQ_SOGLIA_HZ_MAX]
		params.addValue("L11_4_SOVRAFREQ_SOGLIA_HZ_MAX", dto.getL114SovrafreqSogliaHzMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOVRAFREQ_TEMPO_S_MIN]
		params.addValue("L11_4_SOVRAFREQ_TEMPO_S_MIN", dto.getL114SovrafreqTempoSMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOVRAFREQ_TEMPO_S_MED]
		params.addValue("L11_4_SOVRAFREQ_TEMPO_S_MED", dto.getL114SovrafreqTempoSMed(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOVRAFREQ_TEMPO_S_MAX]
		params.addValue("L11_4_SOVRAFREQ_TEMPO_S_MAX", dto.getL114SovrafreqTempoSMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOTTOFREQ_SOGLIA_HZ_MIN]
		params.addValue("L11_4_SOTTOFREQ_SOGLIA_HZ_MIN", dto.getL114SottofreqSogliaHzMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOTTOFREQ_SOGLIA_HZ_MED]
		params.addValue("L11_4_SOTTOFREQ_SOGLIA_HZ_MED", dto.getL114SottofreqSogliaHzMed(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOTTOFREQ_SOGLIA_HZ_MAX]
		params.addValue("L11_4_SOTTOFREQ_SOGLIA_HZ_MAX", dto.getL114SottofreqSogliaHzMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOTTOFREQ_TEMPO_S_MIN]
		params.addValue("L11_4_SOTTOFREQ_TEMPO_S_MIN", dto.getL114SottofreqTempoSMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOTTOFREQ_TEMPO_S_MED]
		params.addValue("L11_4_SOTTOFREQ_TEMPO_S_MED", dto.getL114SottofreqTempoSMed(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOTTOFREQ_TEMPO_S_MAX]
		params.addValue("L11_4_SOTTOFREQ_TEMPO_S_MAX", dto.getL114SottofreqTempoSMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOVRATENS_SOGLIA_V_MIN]
		params.addValue("L11_4_SOVRATENS_SOGLIA_V_MIN", dto.getL114SovratensSogliaVMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOVRATENS_SOGLIA_V_MED]
		params.addValue("L11_4_SOVRATENS_SOGLIA_V_MED", dto.getL114SovratensSogliaVMed(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOVRATENS_SOGLIA_V_MAX]
		params.addValue("L11_4_SOVRATENS_SOGLIA_V_MAX", dto.getL114SovratensSogliaVMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOVRATENS_TEMPO_S_MIN]
		params.addValue("L11_4_SOVRATENS_TEMPO_S_MIN", dto.getL114SovratensTempoSMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOVRATENS_TEMPO_S_MED]
		params.addValue("L11_4_SOVRATENS_TEMPO_S_MED", dto.getL114SovratensTempoSMed(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOVRATENS_TEMPO_S_MAX]
		params.addValue("L11_4_SOVRATENS_TEMPO_S_MAX", dto.getL114SovratensTempoSMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOTTOTENS_SOGLIA_V_MIN]
		params.addValue("L11_4_SOTTOTENS_SOGLIA_V_MIN", dto.getL114SottotensSogliaVMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOTTOTENS_SOGLIA_V_MED]
		params.addValue("L11_4_SOTTOTENS_SOGLIA_V_MED", dto.getL114SottotensSogliaVMed(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOTTOTENS_SOGLIA_V_MAX]
		params.addValue("L11_4_SOTTOTENS_SOGLIA_V_MAX", dto.getL114SottotensSogliaVMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOTTOTENS_TEMPO_S_MIN]
		params.addValue("L11_4_SOTTOTENS_TEMPO_S_MIN", dto.getL114SottotensTempoSMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOTTOTENS_TEMPO_S_MED]
		params.addValue("L11_4_SOTTOTENS_TEMPO_S_MED", dto.getL114SottotensTempoSMed(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_4_SOTTOTENS_TEMPO_S_MAX]
		params.addValue("L11_4_SOTTOTENS_TEMPO_S_MAX", dto.getL114SottotensTempoSMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_CONTROLLOWEB]
		params.addValue("E_CONTROLLOWEB", dto.getEControlloweb(), java.sql.Types.TIMESTAMP);

		insert(jdbcTemplate, sql.toString(), params);

		dto.setIdDettTipo4(newKey);
		LOG.debug("[SigitTDettTipo4DaoImpl::insert] END");
		return dto.createPk();

	}

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_DETT_TIPO4";
	}

}
