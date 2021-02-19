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

/*PROTECTED REGION ID(R566739043) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTImpianto.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - findByPrimaryKey (datagen::FindByPK)
  * - UPDATERS:
 *   - update (datagen::UpdateRow)
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTImpiantoDaoImpl extends AbstractDAO implements SigitTImpiantoDao {
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
	 * Updates a single row in the SIGIT_T_IMPIANTO table.
	 * @generated
	 */
	public void update(SigitTImpiantoDto dto) throws SigitTImpiantoDaoException {
		LOG.debug("[SigitTImpiantoDaoImpl::update] START");
		final String sql = "UPDATE " + getTableName()
				+ " SET ISTAT_COMUNE = :ISTAT_COMUNE ,FK_STATO = :FK_STATO ,DATA_ASSEGNAZIONE = :DATA_ASSEGNAZIONE ,DATA_DISMISSIONE = :DATA_DISMISSIONE ,DENOMINAZIONE_COMUNE = :DENOMINAZIONE_COMUNE ,SIGLA_PROVINCIA = :SIGLA_PROVINCIA ,DENOMINAZIONE_PROVINCIA = :DENOMINAZIONE_PROVINCIA ,L1_3_POT_H2O_KW = :L1_3_POT_H2O_KW ,L1_3_POT_CLIMA_INV_KW = :L1_3_POT_CLIMA_INV_KW ,L1_3_POT_CLIMA_EST_KW = :L1_3_POT_CLIMA_EST_KW ,L1_3_ALTRO = :L1_3_ALTRO ,L1_4_FLG_H2O = :L1_4_FLG_H2O ,L1_4_FLG_ARIA = :L1_4_FLG_ARIA ,L1_4_ALTRO = :L1_4_ALTRO ,L1_5_FLG_GENERATORE = :L1_5_FLG_GENERATORE ,L1_5_FLG_POMPA = :L1_5_FLG_POMPA ,L1_5_FLG_FRIGO = :L1_5_FLG_FRIGO ,L1_5_FLG_TELERISC = :L1_5_FLG_TELERISC ,L1_5_FLG_TELERAFFR = :L1_5_FLG_TELERAFFR ,L1_5_FLG_COGENERATORE = :L1_5_FLG_COGENERATORE ,L1_5_ALTRO = :L1_5_ALTRO ,L1_5_SUP_PANNELLI_SOL_M2 = :L1_5_SUP_PANNELLI_SOL_M2 ,L1_5_ALTRO_INTEGRAZIONE = :L1_5_ALTRO_INTEGRAZIONE ,L1_5_ALTRO_INTEGR_POT_KW = :L1_5_ALTRO_INTEGR_POT_KW ,L1_5_FLG_ALTRO_CLIMA_INV = :L1_5_FLG_ALTRO_CLIMA_INV ,L1_5_FLG_ALTRO_CLIMA_ESTATE = :L1_5_FLG_ALTRO_CLIMA_ESTATE ,L1_5_FLG_ALTRO_ACS = :L1_5_FLG_ALTRO_ACS ,L1_5_ALTRO_DESC = :L1_5_ALTRO_DESC ,DATA_ULT_MOD = :DATA_ULT_MOD ,UTENTE_ULT_MOD = :UTENTE_ULT_MOD ,MOTIVAZIONE = :MOTIVAZIONE ,PROPRIETARIO = :PROPRIETARIO ,DATA_INSERIMENTO = :DATA_INSERIMENTO ,NOTE = :NOTE ,FLG_TIPO_IMPIANTO = :FLG_TIPO_IMPIANTO ,FLG_APPARECC_UI_EXT = :FLG_APPARECC_UI_EXT ,FLG_CONTABILIZZAZIONE = :FLG_CONTABILIZZAZIONE ,DATA_INTERVENTO = :DATA_INTERVENTO ,FK_TIPO_INTERVENTO = :FK_TIPO_INTERVENTO ,L11_1_FLG_NORMA_UNI_10389_1 = :L11_1_FLG_NORMA_UNI_10389_1 ,L11_1_ALTRA_NORMA = :L11_1_ALTRA_NORMA ,FLG_BLOCCO_NOMINA_3R = :FLG_BLOCCO_NOMINA_3R ,FLG_VISU_PROPRIETARIO = :FLG_VISU_PROPRIETARIO  WHERE CODICE_IMPIANTO = :CODICE_IMPIANTO ";

		if (dto.getCodiceImpianto() == null) {
			LOG.error("[SigitTImpiantoDaoImpl::update] ERROR chiave primaria non impostata");
			throw new SigitTImpiantoDaoException("Chiave primaria non impostata");
		}

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [ISTAT_COMUNE]
		params.addValue("ISTAT_COMUNE", dto.getIstatComune(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FK_STATO]
		params.addValue("FK_STATO", dto.getFkStato(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_ASSEGNAZIONE]
		params.addValue("DATA_ASSEGNAZIONE", dto.getDataAssegnazione(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [DATA_DISMISSIONE]
		params.addValue("DATA_DISMISSIONE", dto.getDataDismissione(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [DENOMINAZIONE_COMUNE]
		params.addValue("DENOMINAZIONE_COMUNE", dto.getDenominazioneComune(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [SIGLA_PROVINCIA]
		params.addValue("SIGLA_PROVINCIA", dto.getSiglaProvincia(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [DENOMINAZIONE_PROVINCIA]
		params.addValue("DENOMINAZIONE_PROVINCIA", dto.getDenominazioneProvincia(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L1_3_POT_H2O_KW]
		params.addValue("L1_3_POT_H2O_KW", dto.getL13PotH2oKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_3_POT_CLIMA_INV_KW]
		params.addValue("L1_3_POT_CLIMA_INV_KW", dto.getL13PotClimaInvKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_3_POT_CLIMA_EST_KW]
		params.addValue("L1_3_POT_CLIMA_EST_KW", dto.getL13PotClimaEstKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_3_ALTRO]
		params.addValue("L1_3_ALTRO", dto.getL13Altro(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L1_4_FLG_H2O]
		params.addValue("L1_4_FLG_H2O", dto.getL14FlgH2o(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_4_FLG_ARIA]
		params.addValue("L1_4_FLG_ARIA", dto.getL14FlgAria(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_4_ALTRO]
		params.addValue("L1_4_ALTRO", dto.getL14Altro(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L1_5_FLG_GENERATORE]
		params.addValue("L1_5_FLG_GENERATORE", dto.getL15FlgGeneratore(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_5_FLG_POMPA]
		params.addValue("L1_5_FLG_POMPA", dto.getL15FlgPompa(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_5_FLG_FRIGO]
		params.addValue("L1_5_FLG_FRIGO", dto.getL15FlgFrigo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_5_FLG_TELERISC]
		params.addValue("L1_5_FLG_TELERISC", dto.getL15FlgTelerisc(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_5_FLG_TELERAFFR]
		params.addValue("L1_5_FLG_TELERAFFR", dto.getL15FlgTeleraffr(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_5_FLG_COGENERATORE]
		params.addValue("L1_5_FLG_COGENERATORE", dto.getL15FlgCogeneratore(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_5_ALTRO]
		params.addValue("L1_5_ALTRO", dto.getL15Altro(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L1_5_SUP_PANNELLI_SOL_M2]
		params.addValue("L1_5_SUP_PANNELLI_SOL_M2", dto.getL15SupPannelliSolM2(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_5_ALTRO_INTEGRAZIONE]
		params.addValue("L1_5_ALTRO_INTEGRAZIONE", dto.getL15AltroIntegrazione(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [L1_5_ALTRO_INTEGR_POT_KW]
		params.addValue("L1_5_ALTRO_INTEGR_POT_KW", dto.getL15AltroIntegrPotKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_5_FLG_ALTRO_CLIMA_INV]
		params.addValue("L1_5_FLG_ALTRO_CLIMA_INV", dto.getL15FlgAltroClimaInv(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_5_FLG_ALTRO_CLIMA_ESTATE]
		params.addValue("L1_5_FLG_ALTRO_CLIMA_ESTATE", dto.getL15FlgAltroClimaEstate(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_5_FLG_ALTRO_ACS]
		params.addValue("L1_5_FLG_ALTRO_ACS", dto.getL15FlgAltroAcs(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L1_5_ALTRO_DESC]
		params.addValue("L1_5_ALTRO_DESC", dto.getL15AltroDesc(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [MOTIVAZIONE]
		params.addValue("MOTIVAZIONE", dto.getMotivazione(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PROPRIETARIO]
		params.addValue("PROPRIETARIO", dto.getProprietario(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [DATA_INSERIMENTO]
		params.addValue("DATA_INSERIMENTO", dto.getDataInserimento(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [NOTE]
		params.addValue("NOTE", dto.getNote(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FLG_TIPO_IMPIANTO]
		params.addValue("FLG_TIPO_IMPIANTO", dto.getFlgTipoImpianto(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FLG_APPARECC_UI_EXT]
		params.addValue("FLG_APPARECC_UI_EXT", dto.getFlgAppareccUiExt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FLG_CONTABILIZZAZIONE]
		params.addValue("FLG_CONTABILIZZAZIONE", dto.getFlgContabilizzazione(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INTERVENTO]
		params.addValue("DATA_INTERVENTO", dto.getDataIntervento(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [FK_TIPO_INTERVENTO]
		params.addValue("FK_TIPO_INTERVENTO", dto.getFkTipoIntervento(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_1_FLG_NORMA_UNI_10389_1]
		params.addValue("L11_1_FLG_NORMA_UNI_10389_1", dto.getL111FlgNormaUni103891(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [L11_1_ALTRA_NORMA]
		params.addValue("L11_1_ALTRA_NORMA", dto.getL111AltraNorma(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FLG_BLOCCO_NOMINA_3R]
		params.addValue("FLG_BLOCCO_NOMINA_3R", dto.getFlgBloccoNomina3r(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FLG_VISU_PROPRIETARIO]
		params.addValue("FLG_VISU_PROPRIETARIO", dto.getFlgVisuProprietario(), java.sql.Types.NUMERIC);

		update(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTImpiantoDaoImpl::update] END");
	}

	protected SigitTImpiantoDaoRowMapper findByPrimaryKeyRowMapper = new SigitTImpiantoDaoRowMapper(null,
			SigitTImpiantoDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_IMPIANTO";
	}

	/** 
	 * Returns all rows from the SIGIT_T_IMPIANTO table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitTImpiantoDto findByPrimaryKey(SigitTImpiantoPk pk) throws SigitTImpiantoDaoException {
		LOG.debug("[SigitTImpiantoDaoImpl::findByPrimaryKey] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT CODICE_IMPIANTO,ISTAT_COMUNE,FK_STATO,DATA_ASSEGNAZIONE,DATA_DISMISSIONE,DENOMINAZIONE_COMUNE,SIGLA_PROVINCIA,DENOMINAZIONE_PROVINCIA,L1_3_POT_H2O_KW,L1_3_POT_CLIMA_INV_KW,L1_3_POT_CLIMA_EST_KW,L1_3_ALTRO,L1_4_FLG_H2O,L1_4_FLG_ARIA,L1_4_ALTRO,L1_5_FLG_GENERATORE,L1_5_FLG_POMPA,L1_5_FLG_FRIGO,L1_5_FLG_TELERISC,L1_5_FLG_TELERAFFR,L1_5_FLG_COGENERATORE,L1_5_ALTRO,L1_5_SUP_PANNELLI_SOL_M2,L1_5_ALTRO_INTEGRAZIONE,L1_5_ALTRO_INTEGR_POT_KW,L1_5_FLG_ALTRO_CLIMA_INV,L1_5_FLG_ALTRO_CLIMA_ESTATE,L1_5_FLG_ALTRO_ACS,L1_5_ALTRO_DESC,DATA_ULT_MOD,UTENTE_ULT_MOD,MOTIVAZIONE,PROPRIETARIO,DATA_INSERIMENTO,NOTE,FLG_TIPO_IMPIANTO,FLG_APPARECC_UI_EXT,FLG_CONTABILIZZAZIONE,DATA_INTERVENTO,FK_TIPO_INTERVENTO,L11_1_FLG_NORMA_UNI_10389_1,L11_1_ALTRA_NORMA,FLG_BLOCCO_NOMINA_3R,FLG_VISU_PROPRIETARIO FROM "
						+ getTableName() + " WHERE CODICE_IMPIANTO = :CODICE_IMPIANTO ");

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", pk.getCodiceImpianto(), java.sql.Types.NUMERIC);

		List<SigitTImpiantoDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findByPrimaryKeyRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitTImpiantoDaoImpl::findByPrimaryKey] ERROR esecuzione query", ex);
			throw new SigitTImpiantoDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTImpiantoDaoImpl", "findByPrimaryKey", "esecuzione query", sql.toString());
			LOG.debug("[SigitTImpiantoDaoImpl::findByPrimaryKey] END");
		}
		return list.isEmpty() ? null : list.get(0);
	}

}
