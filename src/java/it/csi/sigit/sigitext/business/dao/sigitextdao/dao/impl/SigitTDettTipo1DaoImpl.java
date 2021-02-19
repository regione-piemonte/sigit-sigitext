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

/*PROTECTED REGION ID(R-1835744189) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTDettTipo1.
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
public class SigitTDettTipo1DaoImpl extends AbstractDAO implements SigitTDettTipo1Dao {
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
	 * Metodo di inserimento del DAO sigitTDettTipo1. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTDettTipo1Pk
	 * @generated
	 */

	public SigitTDettTipo1Pk insert(SigitTDettTipo1Dto dto)

	{
		LOG.debug("[SigitTDettTipo1DaoImpl::insert] START");
		java.math.BigDecimal newKey = java.math.BigDecimal.valueOf(incrementer.nextLongValue());

		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_DETT_TIPO1,FK_ALLEGATO,CODICE_IMPIANTO,FK_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,E_N_MODULO_TERMICO,E_POT_TERM_FOCOL_KW,E_FLG_CLIMA_INVERNO,E_FLG_PRODUZ_ACS,E_FLG_DISPOS_COMANDO,E_FLG_DISPOS_SICUREZZA,E_FLG_VALVOLA_SICUREZZA,E_FLG_SCAMBIATORE_FUMI,E_FLG_RIFLUSSO,E_FLG_UNI_10389_1,E_FLG_EVACU_FUMI,E_DEPR_CANALE_FUMO_PA,E_TEMP_FUMI_C,E_TEMP_ARIA_C,E_O2_PERC,E_CO2_PERC,E_CO_CORRETTO_PPM,E_REND_COMB_PERC,E_REND_MIN_LEGGE_PERC,E_NOX_PPM,DATA_ULT_MOD,UTENTE_ULT_MOD,L11_1_PORTATA_COMBUSTIBILE,L11_1_CO_NO_ARIA_PPM,L11_1_FLG_RISPETTA_BACHARACH,L11_1_FLG_CO_MIN_1000,L11_1_FLG_REND_MAG_REND_MIN,L11_1_PORTATA_COMBUSTIBILE_UM,L11_1_ALTRO_RIFERIMENTO,E_BACHARACH_MIN,E_BACHARACH_MED,E_BACHARACH_MAX,E_CONTROLLOWEB,E_NOX_MG_KWH ) VALUES (  :ID_DETT_TIPO1 , :FK_ALLEGATO , :CODICE_IMPIANTO , :FK_TIPO_COMPONENTE , :PROGRESSIVO , :DATA_INSTALL , :E_N_MODULO_TERMICO , :E_POT_TERM_FOCOL_KW , :E_FLG_CLIMA_INVERNO , :E_FLG_PRODUZ_ACS , :E_FLG_DISPOS_COMANDO , :E_FLG_DISPOS_SICUREZZA , :E_FLG_VALVOLA_SICUREZZA , :E_FLG_SCAMBIATORE_FUMI , :E_FLG_RIFLUSSO , :E_FLG_UNI_10389_1 , :E_FLG_EVACU_FUMI , :E_DEPR_CANALE_FUMO_PA , :E_TEMP_FUMI_C , :E_TEMP_ARIA_C , :E_O2_PERC , :E_CO2_PERC , :E_CO_CORRETTO_PPM , :E_REND_COMB_PERC , :E_REND_MIN_LEGGE_PERC , :E_NOX_PPM , :DATA_ULT_MOD , :UTENTE_ULT_MOD , :L11_1_PORTATA_COMBUSTIBILE , :L11_1_CO_NO_ARIA_PPM , :L11_1_FLG_RISPETTA_BACHARACH , :L11_1_FLG_CO_MIN_1000 , :L11_1_FLG_REND_MAG_REND_MIN , :L11_1_PORTATA_COMBUSTIBILE_UM , :L11_1_ALTRO_RIFERIMENTO , :E_BACHARACH_MIN , :E_BACHARACH_MED , :E_BACHARACH_MAX , :E_CONTROLLOWEB , :E_NOX_MG_KWH  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_DETT_TIPO1]
		params.addValue("ID_DETT_TIPO1", newKey, java.sql.Types.NUMERIC);

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

		// valorizzazione paametro relativo a colonna [E_N_MODULO_TERMICO]
		params.addValue("E_N_MODULO_TERMICO", dto.getENModuloTermico(), java.sql.Types.INTEGER);

		// valorizzazione paametro relativo a colonna [E_POT_TERM_FOCOL_KW]
		params.addValue("E_POT_TERM_FOCOL_KW", dto.getEPotTermFocolKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_CLIMA_INVERNO]
		params.addValue("E_FLG_CLIMA_INVERNO", dto.getEFlgClimaInverno(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_PRODUZ_ACS]
		params.addValue("E_FLG_PRODUZ_ACS", dto.getEFlgProduzAcs(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_DISPOS_COMANDO]
		params.addValue("E_FLG_DISPOS_COMANDO", dto.getEFlgDisposComando(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_DISPOS_SICUREZZA]
		params.addValue("E_FLG_DISPOS_SICUREZZA", dto.getEFlgDisposSicurezza(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_VALVOLA_SICUREZZA]
		params.addValue("E_FLG_VALVOLA_SICUREZZA", dto.getEFlgValvolaSicurezza(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_SCAMBIATORE_FUMI]
		params.addValue("E_FLG_SCAMBIATORE_FUMI", dto.getEFlgScambiatoreFumi(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_RIFLUSSO]
		params.addValue("E_FLG_RIFLUSSO", dto.getEFlgRiflusso(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_UNI_10389_1]
		params.addValue("E_FLG_UNI_10389_1", dto.getEFlgUni103891(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_FLG_EVACU_FUMI]
		params.addValue("E_FLG_EVACU_FUMI", dto.getEFlgEvacuFumi(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [E_DEPR_CANALE_FUMO_PA]
		params.addValue("E_DEPR_CANALE_FUMO_PA", dto.getEDeprCanaleFumoPa(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_FUMI_C]
		params.addValue("E_TEMP_FUMI_C", dto.getETempFumiC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_TEMP_ARIA_C]
		params.addValue("E_TEMP_ARIA_C", dto.getETempAriaC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_O2_PERC]
		params.addValue("E_O2_PERC", dto.getEO2Perc(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_CO2_PERC]
		params.addValue("E_CO2_PERC", dto.getECo2Perc(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_CO_CORRETTO_PPM]
		params.addValue("E_CO_CORRETTO_PPM", dto.getECoCorrettoPpm(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_REND_COMB_PERC]
		params.addValue("E_REND_COMB_PERC", dto.getERendCombPerc(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_REND_MIN_LEGGE_PERC]
		params.addValue("E_REND_MIN_LEGGE_PERC", dto.getERendMinLeggePerc(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_NOX_PPM]
		params.addValue("E_NOX_PPM", dto.getENoxPpm(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L11_1_PORTATA_COMBUSTIBILE]
		params.addValue("L11_1_PORTATA_COMBUSTIBILE", dto.getL111PortataCombustibile(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_1_CO_NO_ARIA_PPM]
		params.addValue("L11_1_CO_NO_ARIA_PPM", dto.getL111CoNoAriaPpm(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_1_FLG_RISPETTA_BACHARACH]
		params.addValue("L11_1_FLG_RISPETTA_BACHARACH", dto.getL111FlgRispettaBacharach(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_1_FLG_CO_MIN_1000]
		params.addValue("L11_1_FLG_CO_MIN_1000", dto.getL111FlgCoMin1000(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_1_FLG_REND_MAG_REND_MIN]
		params.addValue("L11_1_FLG_REND_MAG_REND_MIN", dto.getL111FlgRendMagRendMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_1_PORTATA_COMBUSTIBILE_UM]
		params.addValue("L11_1_PORTATA_COMBUSTIBILE_UM", dto.getL111PortataCombustibileUm(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L11_1_ALTRO_RIFERIMENTO]
		params.addValue("L11_1_ALTRO_RIFERIMENTO", dto.getL111AltroRiferimento(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [E_BACHARACH_MIN]
		params.addValue("E_BACHARACH_MIN", dto.getEBacharachMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_BACHARACH_MED]
		params.addValue("E_BACHARACH_MED", dto.getEBacharachMed(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_BACHARACH_MAX]
		params.addValue("E_BACHARACH_MAX", dto.getEBacharachMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [E_CONTROLLOWEB]
		params.addValue("E_CONTROLLOWEB", dto.getEControlloweb(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [E_NOX_MG_KWH]
		params.addValue("E_NOX_MG_KWH", dto.getENoxMgKwh(), java.sql.Types.NUMERIC);

		insert(jdbcTemplate, sql.toString(), params);

		dto.setIdDettTipo1(newKey);
		LOG.debug("[SigitTDettTipo1DaoImpl::insert] END");
		return dto.createPk();

	}

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_DETT_TIPO1";
	}

}
