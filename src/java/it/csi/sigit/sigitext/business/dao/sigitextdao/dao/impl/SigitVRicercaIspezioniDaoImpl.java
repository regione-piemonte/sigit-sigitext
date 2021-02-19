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

/*PROTECTED REGION ID(R1898605927) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitVRicercaIspezioni.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - byIspezioneFilter (datagen::CustomFinder)
 *   - consByCodiceImpianto (datagen::CustomFinder)
 *   - consDettRappProvaByFilter (datagen::CustomFinder)
 *   - byIdIspezIspet (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitVRicercaIspezioniDaoImpl extends AbstractDAO implements SigitVRicercaIspezioniDao {
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

	protected SigitVRicercaIspezioniDaoRowMapper byIspezioneFilterRowMapper = new SigitVRicercaIspezioniDaoRowMapper(
			null, SigitVRicercaIspezioniDto.class, this);

	protected SigitVRicercaIspezioniDaoRowMapper consByCodiceImpiantoRowMapper = new SigitVRicercaIspezioniDaoRowMapper(
			null, SigitVRicercaIspezioniConsByCodiceImpiantoDto.class, this);

	protected SigitVRicercaIspezioniDaoRowMapper consDettRappProvaByFilterRowMapper = new SigitVRicercaIspezioniDaoRowMapper(
			null, SigitVRicercaIspezioniDto.class, this);

	protected SigitVRicercaIspezioniDaoRowMapper byIdIspezIspetRowMapper = new SigitVRicercaIspezioniDaoRowMapper(null,
			SigitVRicercaIspezioniDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_RICERCA_ISPEZIONI";
	}

	/** 
	 * Implementazione del finder byIspezioneFilter
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVRicercaIspezioniDto> findByIspezioneFilter(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.IspezioneFilter input)
			throws SigitVRicercaIspezioniDaoException {
		LOG.debug("[SigitVRicercaIspezioniDaoImpl::findByIspezioneFilter] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_ISPEZIONE_2018,CODICE_IMPIANTO,ID_ISPEZ_ISPET,FK_STATO_ISPEZIONE,DES_STATO_ISPEZIONE,ENTE_COMPETENTE,DT_CREAZIONE,DT_CONCLUSIONE,FLG_ESITO,NOTE,ID_ALLEGATO,FK_STATO_RAPP,DES_STATO_RAPP,FK_TIPO_DOCUMENTO,DES_TIPO_DOCUMENTO,FK_SIGLA_BOLLINO,FK_NUMERO_BOLLINO,DATA_CONTROLLO,B_FLG_LIBRETTO_USO,B_FLG_DICHIAR_CONFORM,B_FLG_LIB_IMP,B_FLG_LIB_COMPL,F_OSSERVAZIONI,F_RACCOMANDAZIONI,F_PRESCRIZIONI,F_FLG_PUO_FUNZIONARE,F_INTERVENTO_ENTRO,F_ORA_ARRIVO,F_ORA_PARTENZA,F_DENOMINAZ_TECNICO,F_FLG_FIRMA_TECNICO,F_FLG_FIRMA_RESPONSABILE,DATA_INVIO,NOME_ALLEGATO,DATA_ULT_MOD_ALLEGATO,UTENTE_ULT_MOD_ALLEGATO,CF_REDATTORE,UID_INDEX,F_FIRMA_TECNICO,F_FIRMA_RESPONSABILE,FLG_CONTROLLO_BOZZA,A_POTENZA_TERMICA_NOMINALE_MAX,ELENCO_COMBUSTIBILI,ELENCO_APPARECCHIATURE,ID_PERSONA_FISICA,NOME,COGNOME,CODICE_FISCALE,ISTAT_PROV_COMPETENZA,FLG_ACC_SOSTITUTIVO,CF_ISPETTORE_SECONDARIO,FLG_ISP_PAGAMENTO ");
		sql.append(" FROM VISTA_RICERCA_ISPEZIONI");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R560295540) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append(" CODICE_IMPIANTO = :codiceImpianto");
		sql.append(" AND FK_STATO_ISPEZIONE = :idStatoIsp");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R314178806) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codiceImpianto", input.getCodiceImpianto());
		paramMap.addValue("idStatoIsp", input.getIdStatoIspezione());

		/*PROTECTED REGION END*/
		List<SigitVRicercaIspezioniDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byIspezioneFilterRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitVRicercaIspezioniDaoImpl::findByIspezioneFilter] esecuzione query", ex);
			throw new SigitVRicercaIspezioniDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVRicercaIspezioniDaoImpl", "findByIspezioneFilter", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitVRicercaIspezioniDaoImpl::findByIspezioneFilter] END");
		}
		return list;
	}

	/** 
		 * Implementazione del finder consByCodiceImpianto con Qdef
		 * @generated
		 */

	public List<SigitVRicercaIspezioniConsByCodiceImpiantoDto> findConsByCodiceImpianto(Integer input)
			throws SigitVRicercaIspezioniDaoException {
		LOG.debug("[SigitVRicercaIspezioniDaoImpl::findConsByCodiceImpianto] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT MAX (ID_ISPEZ_ISPET) AS max_id_ispez_ispet, ID_ISPEZIONE_2018, DT_CREAZIONE, ENTE_COMPETENTE, NOTE, FLG_ESITO");

		sql.append(" FROM VISTA_RICERCA_ISPEZIONI");

		sql.append(" WHERE ");

		sql.append("CODICE_IMPIANTO = :codiceImpianto");
		/*PROTECTED REGION ID(R1691282385) ENABLED START*/ //inserire qui i parametri indicati nella espressione di where, ad esempio:

		sql.append(" AND FK_STATO_ISPEZIONE = 2 ");
		sql.append(" GROUP BY ID_ISPEZIONE_2018, DT_CREAZIONE, ENTE_COMPETENTE, NOTE, FLG_ESITO");

		sql.append(" ORDER BY DT_CREAZIONE DESC ");

		paramMap.addValue("codiceImpianto", input);

		/*PROTECTED REGION END*/

		List<SigitVRicercaIspezioniConsByCodiceImpiantoDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);

		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, consByCodiceImpiantoRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitVRicercaIspezioniDaoImpl::findConsByCodiceImpianto] ERROR esecuzione query", ex);
			throw new SigitVRicercaIspezioniDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVRicercaIspezioniDaoImpl", "findConsByCodiceImpianto", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitVRicercaIspezioniDaoImpl::findConsByCodiceImpianto] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder consDettRappProvaByFilter
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVRicercaIspezioniDto> findConsDettRappProvaByFilter(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.IspezioneFilter input)
			throws SigitVRicercaIspezioniDaoException {
		LOG.debug("[SigitVRicercaIspezioniDaoImpl::findConsDettRappProvaByFilter] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_ISPEZIONE_2018,CODICE_IMPIANTO,ID_ISPEZ_ISPET,FK_STATO_ISPEZIONE,DES_STATO_ISPEZIONE,ENTE_COMPETENTE,DT_CREAZIONE,DT_CONCLUSIONE,FLG_ESITO,NOTE,ID_ALLEGATO,FK_STATO_RAPP,DES_STATO_RAPP,FK_TIPO_DOCUMENTO,DES_TIPO_DOCUMENTO,FK_SIGLA_BOLLINO,FK_NUMERO_BOLLINO,DATA_CONTROLLO,B_FLG_LIBRETTO_USO,B_FLG_DICHIAR_CONFORM,B_FLG_LIB_IMP,B_FLG_LIB_COMPL,F_OSSERVAZIONI,F_RACCOMANDAZIONI,F_PRESCRIZIONI,F_FLG_PUO_FUNZIONARE,F_INTERVENTO_ENTRO,F_ORA_ARRIVO,F_ORA_PARTENZA,F_DENOMINAZ_TECNICO,F_FLG_FIRMA_TECNICO,F_FLG_FIRMA_RESPONSABILE,DATA_INVIO,NOME_ALLEGATO,DATA_ULT_MOD_ALLEGATO,UTENTE_ULT_MOD_ALLEGATO,CF_REDATTORE,UID_INDEX,F_FIRMA_TECNICO,F_FIRMA_RESPONSABILE,FLG_CONTROLLO_BOZZA,A_POTENZA_TERMICA_NOMINALE_MAX,ELENCO_COMBUSTIBILI,ELENCO_APPARECCHIATURE,ID_PERSONA_FISICA,NOME,COGNOME,CODICE_FISCALE,ISTAT_PROV_COMPETENZA,FLG_ACC_SOSTITUTIVO,CF_ISPETTORE_SECONDARIO,FLG_ISP_PAGAMENTO ");
		sql.append(" FROM VISTA_RICERCA_ISPEZIONI");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-1491010521) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append(" CODICE_IMPIANTO = :codiceImpianto");
		sql.append(" AND FK_STATO_ISPEZIONE = :fkStatoISpez");
		sql.append(" AND ID_ISPEZIONE_2018 IN (" + input.getElencoIdIspezione2018() + ")");
		sql.append(" AND DATA_CONTROLLO IS NOT NULL");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R1148200355) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codiceImpianto", input.getCodiceImpianto());
		paramMap.addValue("fkStatoISpez", input.getIdStatoIspezione());

		/*PROTECTED REGION END*/
		List<SigitVRicercaIspezioniDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, consDettRappProvaByFilterRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitVRicercaIspezioniDaoImpl::findConsDettRappProvaByFilter] esecuzione query", ex);
			throw new SigitVRicercaIspezioniDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVRicercaIspezioniDaoImpl", "findConsDettRappProvaByFilter", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitVRicercaIspezioniDaoImpl::findConsDettRappProvaByFilter] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder byIdIspezIspet
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVRicercaIspezioniDto> findByIdIspezIspet(Integer input) throws SigitVRicercaIspezioniDaoException {
		LOG.debug("[SigitVRicercaIspezioniDaoImpl::findByIdIspezIspet] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_ISPEZIONE_2018,CODICE_IMPIANTO,ID_ISPEZ_ISPET,FK_STATO_ISPEZIONE,DES_STATO_ISPEZIONE,ENTE_COMPETENTE,DT_CREAZIONE,DT_CONCLUSIONE,FLG_ESITO,NOTE,ID_ALLEGATO,FK_STATO_RAPP,DES_STATO_RAPP,FK_TIPO_DOCUMENTO,DES_TIPO_DOCUMENTO,FK_SIGLA_BOLLINO,FK_NUMERO_BOLLINO,DATA_CONTROLLO,B_FLG_LIBRETTO_USO,B_FLG_DICHIAR_CONFORM,B_FLG_LIB_IMP,B_FLG_LIB_COMPL,F_OSSERVAZIONI,F_RACCOMANDAZIONI,F_PRESCRIZIONI,F_FLG_PUO_FUNZIONARE,F_INTERVENTO_ENTRO,F_ORA_ARRIVO,F_ORA_PARTENZA,F_DENOMINAZ_TECNICO,F_FLG_FIRMA_TECNICO,F_FLG_FIRMA_RESPONSABILE,DATA_INVIO,NOME_ALLEGATO,DATA_ULT_MOD_ALLEGATO,UTENTE_ULT_MOD_ALLEGATO,CF_REDATTORE,UID_INDEX,F_FIRMA_TECNICO,F_FIRMA_RESPONSABILE,FLG_CONTROLLO_BOZZA,A_POTENZA_TERMICA_NOMINALE_MAX,ELENCO_COMBUSTIBILI,ELENCO_APPARECCHIATURE,ID_PERSONA_FISICA,NOME,COGNOME,CODICE_FISCALE,ISTAT_PROV_COMPETENZA,FLG_ACC_SOSTITUTIVO,CF_ISPETTORE_SECONDARIO,FLG_ISP_PAGAMENTO ");
		sql.append(" FROM VISTA_RICERCA_ISPEZIONI");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-182918569) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append("ID_ISPEZ_ISPET = :idIspezIspet");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-1250622093) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("idIspezIspet", input);

		/*PROTECTED REGION END*/
		List<SigitVRicercaIspezioniDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byIdIspezIspetRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitVRicercaIspezioniDaoImpl::findByIdIspezIspet] esecuzione query", ex);
			throw new SigitVRicercaIspezioniDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVRicercaIspezioniDaoImpl", "findByIdIspezIspet", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitVRicercaIspezioniDaoImpl::findByIdIspezIspet] END");
		}
		return list;
	}

}
