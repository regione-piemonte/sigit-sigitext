/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.SigitExtDao;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.ContrattoFilter;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper.ExtImpiantoDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper.SigitExtContrattoImpDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper.SigitExtImpiantiByFiltroRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.ExtImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitExtContrattoImpDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitExtImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.ExtDaoException;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.SigitExtDaoException;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.SigitTImpiantoDaoException;
import it.csi.sigit.sigitext.business.dao.util.Constants;
import it.csi.sigit.sigitext.business.util.ConvertUtil;
import it.csi.sigit.sigitext.business.util.GenericUtil;
import it.csi.sigit.sigitext.dto.sigitext.ImpiantoFiltro;
import it.csi.util.performance.StopWatch;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;

/**
 * Implemenrazione del DAO sigitExt
 * @generated
 */
public class SigitExtDaoImpl extends AbstractDAO implements SigitExtDao {

	protected static final Logger LOG = Logger
			.getLogger(Constants.APPLICATION_CODE);

	/**
	 * Il DAO utilizza JDBC template per l'implementazione delle query.
	 * @generated
	 */
	protected NamedParameterJdbcTemplate jdbcTemplate;

	/**
	 * @generated
	 */
	protected DataFieldMaxValueIncrementer incrementerImportDistrib;

	/**
	 * @generated
	 */
	public void setIncrementerImportDistrib(DataFieldMaxValueIncrementer incrementerImportDistrib) {
		this.incrementerImportDistrib = incrementerImportDistrib;
	}
	
	/**
	 * Imposta il JDBC template utilizato per l'implementazione delle query
	 * @generated
	 */
	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	protected ExtImpiantoDaoRowMapper impiantiByCodiceRowMapper = new ExtImpiantoDaoRowMapper(
			null, ExtImpiantoDto.class, this);

	protected SigitExtContrattoImpDaoRowMapper contrattiImpiantoRowMapper = new SigitExtContrattoImpDaoRowMapper(
			null, SigitExtContrattoImpDto.class, this);

	protected SigitExtImpiantiByFiltroRowMapper impiantiByFiltroRowMapper = new SigitExtImpiantiByFiltroRowMapper(
			null, SigitExtImpiantoDto.class, this);
	
	
	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "EXT";
	}

	/** 
	 * Implementazione del finder findImpiantiByFilter
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<ExtImpiantoDto> findImpiantiByCodice(
			Integer input)
			throws ExtDaoException {
		log.debug("[SigitExtDaoImpl::findImpiantiByCodice] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
		
		sql.append("SELECT ricImp.CODICE_IMPIANTO, dStato.DES_STATO, imp.DATA_ASSEGNAZIONE, imp.DATA_DISMISSIONE, imp.MOTIVAZIONE, ");
		sql.append("ricImp.INDIRIZZO_UNITA_IMMOB, ricImp.CIVICO, ricImp.DENOMINAZIONE_COMUNE, ricImp.SIGLA_PROVINCIA, ");
		sql.append("ricImp.DENOMINAZIONE_RESPONSABILE, ricImp.CODICE_FISCALE, ricImp.DENOMINAZIONE_3_RESPONSABILE, ricImp.CODICE_FISCALE_3R, lib.DATA_CONSOLIDAMENTO, ");
		sql.append("lib.UID_INDEX ");
		sql.append("FROM VISTA_RICERCA_IMPIANTI ricImp ");
		sql.append("LEFT JOIN SIGIT_T_LIBRETTO lib ON lib.CODICE_IMPIANTO = ricImp.CODICE_IMPIANTO AND lib.FK_STATO = 2 , ");
		
		sql.append("SIGIT_T_IMPIANTO imp, ");
		//sql.append("SIGIT_T_LIBRETTO lib, ");
		sql.append("SIGIT_D_STATO_IMP dStato ");
		sql.append("WHERE ricImp.CODICE_IMPIANTO = imp.CODICE_IMPIANTO ");
		//sql.append("AND ricImp.CODICE_IMPIANTO = lib.CODICE_IMPIANTO ");
		sql.append("AND ricImp.FK_STATO = dStato.ID_STATO ");
		//sql.append("AND lib.FK_STATO = 2 ");

		
		if (input != null) {
			sql.append(" AND ricImp.CODICE_IMPIANTO = :codiceImp");
			paramMap.addValue("codiceImp", input);
		}
		

//		if (GenericUtil.isNotNullOrEmpty(input.getMatricola())) {
//			sql.append(" AND UPPER(MATRICOLA) = UPPER(:matricola)");
//			paramMap.addValue("matricola", input.getMatricola());
//		}

		
		log.debug("STAMPO LA QUERY: " + sql.toString());
		
		List<ExtImpiantoDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap,
					impiantiByCodiceRowMapper);

		} catch (RuntimeException ex) {
			log.error(
					"[SigitExtDaoImpl::findImpiantiByCodice] esecuzione query",
					ex);
			throw new ExtDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitExtDaoImpl", "findImpiantiByCodice",
					"esecuzione query", sql.toString());
			log.debug("[SigitExtDaoImpl::findImpiantiByCodice] END");
		}
		return list;
	}
	
	/** 
	 * Implementazione del finder byCodiceImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitExtContrattoImpDto> findStoriaContrattiImpiantoNew(ContrattoFilter input) throws SigitExtDaoException {
		log.debug("[SigitExtDaoImpl::findStoriaContrattiImpianto] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
		
		/*String query = "SELECT A.CODICE_IMPIANTO, "
				+ "	A.FK_RUOLO, "
				+ "	DR.DES_RUOLO, "
				+ "	IC.ID_CONTRATTO, "
				+ " IC.ID_TIPO_COMPONENTE, "
				+ " IC.PROGRESSIVO, "
				+ " IC.DATA_CARICAMENTO, "
				+ " IC.DATA_REVOCA, "
				+ " IC.DATA_INSERIMENTO_REVOCA, "
				+ " C.FK_PG_3_RESP, "
				+ "	FK_PG_RESPONSABILE, "
				+ " FK_PF_RESPONSABILE, "
				+ " C.DATA_INIZIO AS DATA_INIZIO_CONTRATTO, "
				+ " C.DATA_FINE AS DATA_FINE_CONTRATTO, "
				+ " FLG_TACITO_RINNOVO,"
				+ "	COALESCE(PG.CODICE_FISCALE, PF.CODICE_FISCALE) AS RESP_CODICE_FISCALE,"
				+ "	COALESCE(PG.DENOMINAZIONE,  PF.COGNOME) AS RESP_DENOMINAZIONE,"
				+ "	PF.NOME AS RESP_NOME,"
				+ "	PG3R.DENOMINAZIONE AS TERZO_RESP_DENOMINAZIONE, "
				+ " PG3R.SIGLA_REA AS TERZO_RESP_SIGLA_REA,"
				+ "	PG3R.NUMERO_REA AS TERZO_RESP_NUMERO_REA, "
				+ " PG3R.CODICE_FISCALE AS CODICE_FISCALE_3_RESP,"
				+ "	PG3R.COMUNE AS DENOM_COMUNE_3_RESP, "
				+ " PG3R.SIGLA_PROV AS SIGLA_PROV_3_RESP, "
				+ " PG3R.PROVINCIA AS DENOM_PROVINCIA_3_RESP, "
				+ "	IMP.DENOMINAZIONE_COMUNE as DENOM_COMUNE_IMPIANTO,	"
				+ " IMP.DENOMINAZIONE_PROVINCIA AS DENOM_PROV_IMPIANTO,	"
				+ " IMP.SIGLA_PROVINCIA AS SIGLA_PROV_IMPIANTO "
				+ " FROM SIGIT_R_IMP_RUOLO_PFPG A "
				+ " JOIN SIGIT_T_IMPIANTO IMP ON IMP.CODICE_IMPIANTO = A.CODICE_IMPIANTO "
				+ "	JOIN SIGIT_R_COMP4_CONTRATTO IC ON A.CODICE_IMPIANTO = IC.CODICE_IMPIANTO"
				+ "	JOIN SIGIT_T_CONTRATTO C ON IC.ID_CONTRATTO = C.ID_CONTRATTO"
				+ "	JOIN SIGIT_D_RUOLO DR ON DR.ID_RUOLO = A.FK_RUOLO"
				+ " LEFT JOIN SIGIT_T_PERSONA_GIURIDICA PG ON PG.ID_PERSONA_GIURIDICA = C.FK_PG_RESPONSABILE"
				+ "	LEFT JOIN SIGIT_T_PERSONA_FISICA PF ON PF.ID_PERSONA_FISICA = C.FK_PF_RESPONSABILE"
				+ "	JOIN SIGIT_T_PERSONA_GIURIDICA PG3R ON PG3R.ID_PERSONA_GIURIDICA = C.FK_PG_3_RESP "
				+ " WHERE A.CODICE_IMPIANTO = :codiceImpianto";
		
		
		if (GenericUtil.isNotNullOrEmpty(input.getIdTipoComponente()))
		{
			sql.append(" AND IC.ID_TIPO_COMPONENTE = :idTipoComp");
		}
		
		if (GenericUtil.isNotNullOrEmpty(input.getComponente()))
		{
			sql.append(" AND IC.PROGRESSIVO = :progressivo");
		}
		
		sql.append("	AND (A.FK_PERSONA_FISICA = C.FK_PF_RESPONSABILE");
		sql.append("	OR A.FK_PERSONA_GIURIDICA = C.FK_PG_RESPONSABILE)");
		sql.append("	AND C.DATA_INIZIO BETWEEN A.DATA_INIZIO AND COALESCE(A.DATA_FINE,CURRENT_DATE)");
		
		if(input.getDataDal()!=null)
		{
			
			sql.append(" AND C.DATA_INIZIO <= :dataControllo ");
			sql.append(" AND ( ");
			sql.append(" (FLG_TACITO_RINNOVO = 1  AND (IC.DATA_REVOCA IS NULL OR IC.DATA_REVOCA >= :dataControllo)) ");
			sql.append(" OR    (FLG_TACITO_RINNOVO = 0 AND ((IC.DATA_REVOCA IS NULL AND C.DATA_FINE >= :dataControllo) ");
			sql.append(" OR ( ((IC.DATA_REVOCA >= :dataControllo AND IC.DATA_REVOCA <= C.DATA_FINE) ");
			sql.append(" OR (C.DATA_FINE >= :dataControllo AND C.DATA_FINE <= IC.DATA_REVOCA)) ");
			sql.append(" AND IC.DATA_REVOCA IS NOT NULL)))) ");
					        
			
		}
		
		sql.append(" ORDER BY C.DATA_INIZIO ASC, IC.DATA_REVOCA ASC, C.DATA_FINE ASC, IC.ID_CONTRATTO DESC, IC.ID_TIPO_COMPONENTE ASC, IC.PROGRESSIVO ASC ");
		
		paramMap.addValue("codiceImpianto", input.getCodiceImpianto(), java.sql.Types.NUMERIC);

		if (GenericUtil.isNotNullOrEmpty(input.getIdTipoComponente()))
		{
			paramMap.addValue("idTipoComp", input.getIdTipoComponente(), java.sql.Types.VARCHAR);
		}

		if (GenericUtil.isNotNullOrEmpty(input.getComponente()))
		{
			paramMap.addValue("progressivo", input.getComponente(), java.sql.Types.NUMERIC);
		}
		
		paramMap.addValue("dataControllo", input.getDataDal(), java.sql.Types.DATE);
		*/
		
		String query = "SELECT IMP.CODICE_IMPIANTO,"
				+ "	DR.ID_RUOLO, "
				+ " DR.DES_RUOLO, "
				+ " C.ID_CONTRATTO, "
				+ " C.DATA_CARICAMENTO,"
				+ " C.DATA_CESSAZIONE,"
				+ " C.DATA_INSERIMENTO_CESSAZIONE,"
				+ " C.FK_PG_3_RESP,"
				+ " C_RESP.FK_PERSONA_GIURIDICA,"
				+ " C_RESP.FK_PERSONA_FISICA,"
				+ " C.DATA_INIZIO AS DATA_INIZIO_CONTRATTO,"
				+ " C.DATA_FINE AS DATA_FINE_CONTRATTO,"
				+ " C.FLG_TACITO_RINNOVO,"
				+ " CESS.ID_TIPO_CESSAZIONE,"
				+ " CESS.DES_TIPO_CESSAZIONE,"
				+ " C.MOTIVO_CESSAZIONE,"
				+ " COALESCE(PG_RESP.CODICE_FISCALE, PF_RESP.CODICE_FISCALE) AS RESP_CODICE_FISCALE,"
				+ " COALESCE(PG_RESP.DENOMINAZIONE,  PF_RESP.COGNOME) AS RESP_DENOMINAZIONE,"
				+ " PF_RESP.NOME AS RESP_NOME,"
				+ " PG3R.DENOMINAZIONE AS TERZO_RESP_DENOMINAZIONE,"
				+ " PG3R.SIGLA_REA AS TERZO_RESP_SIGLA_REA,"
				+ " PG3R.NUMERO_REA AS TERZO_RESP_NUMERO_REA,"
				+ " PG3R.CODICE_FISCALE AS CODICE_FISCALE_3_RESP,"
				+ " PG3R.COMUNE AS DENOM_COMUNE_3_RESP,"
				+ " PG3R.SIGLA_PROV AS SIGLA_PROV_3_RESP,"
				+ " PG3R.PROVINCIA AS DENOM_PROVINCIA_3_RESP,"
				+ " IMP.DENOMINAZIONE_COMUNE AS DENOM_COMUNE_IMPIANTO,"
				+ " IMP.DENOMINAZIONE_PROVINCIA AS DENOM_PROV_IMPIANTO,"
				+ " IMP.SIGLA_PROVINCIA AS SIGLA_PROV_IMPIANTO"
				+ " FROM SIGIT_T_CONTRATTO_2019 C"
				+ " JOIN SIGIT_T_IMPIANTO IMP ON C.CODICE_IMPIANTO = IMP.CODICE_IMPIANTO"
				+ " JOIN SIGIT_R_IMP_RUOLO_PFPG C_RESP ON C_RESP.ID_IMP_RUOLO_PFPG = C.FK_IMP_RUOLO_PFPG_RESP AND C_RESP.CODICE_IMPIANTO = C.CODICE_IMPIANTO"
				+ " JOIN SIGIT_D_RUOLO DR ON DR.ID_RUOLO = C_RESP.FK_RUOLO"
				+ " JOIN SIGIT_T_PERSONA_GIURIDICA PG3R ON PG3R.ID_PERSONA_GIURIDICA = C.FK_PG_3_RESP"
				+ " JOIN SIGIT_D_TIPO_CESSAZIONE CESS ON CESS.ID_TIPO_CESSAZIONE = C.FK_TIPO_CESSAZIONE"
				+ " LEFT JOIN SIGIT_T_PERSONA_GIURIDICA PG_RESP ON C_RESP.FK_PERSONA_GIURIDICA = PG_RESP.ID_PERSONA_GIURIDICA"
				+ " LEFT JOIN SIGIT_T_PERSONA_FISICA PF_RESP ON C_RESP.FK_PERSONA_FISICA = PF_RESP.ID_PERSONA_FISICA";
		sql.append(query);
		sql.append(" WHERE IMP.CODICE_IMPIANTO = :codiceImpianto");
		
		if(input.getDataDal()!=null)
		{
			
			sql.append(" AND C.DATA_INIZIO <= :dataControllo ");
			sql.append(" AND ( ");
			sql.append(" (C.FLG_TACITO_RINNOVO = 1  AND (C.DATA_CESSAZIONE IS NULL OR C.DATA_CESSAZIONE >= :dataControllo)) ");
			sql.append(" OR    (C.FLG_TACITO_RINNOVO = 0 AND ((C.DATA_CESSAZIONE IS NULL AND C.DATA_FINE >= :dataControllo) ");
			sql.append(" OR ( ((C.DATA_CESSAZIONE >= :dataControllo AND C.DATA_CESSAZIONE <= C.DATA_FINE) ");
			sql.append(" OR (C.DATA_FINE >= :dataControllo AND C.DATA_FINE <= C.DATA_CESSAZIONE)) ");
			sql.append(" AND C.DATA_CESSAZIONE IS NOT NULL)))) ");
					        
		}
		
		sql.append(" ORDER BY C.DATA_INIZIO ASC, C.DATA_CESSAZIONE ASC, C.DATA_FINE ASC, C.ID_CONTRATTO DESC");
		
		paramMap.addValue("codiceImpianto", input.getCodiceImpianto(), java.sql.Types.NUMERIC);
		paramMap.addValue("dataControllo", input.getDataDal(), java.sql.Types.DATE);
		
		
		List<SigitExtContrattoImpDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap,
					contrattiImpiantoRowMapper);
			
		} catch (RuntimeException ex) {
			log.error(
					"[SigitExtDaoImpl::findStoriaContrattiImpianto] esecuzione query",
					ex);
			throw new SigitExtDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitExtDaoImpl", "findStoriaContrattiImpianto",
					"esecuzione query", sql.toString());
			log.debug("[SigitExtDaoImpl::findStoriaContrattiImpianto] END");
		}
		return list;
	}
	
	public BigDecimal getSeqTNumeroBollino() throws SigitExtDaoException
	{
		log.debug("[SigitExtDaoImpl::getSeqTNumeroBollino] START");
		java.math.BigDecimal newKey = null;
		try {
			newKey = java.math.BigDecimal.valueOf(incrementer
					.nextLongValue());

		} catch (RuntimeException ex) {
			log.error(
					"[SigitExtDaoImpl::getSeqTNumeroBollino] esecuzione query",
					ex);
			throw new SigitExtDaoException("Query failed", ex);
		} finally {
			log.debug("[SigitExtDaoImpl::getSeqTNumeroBollino] END");
		}
		
		return newKey;
	}
	
	@Override
	public List<SigitExtImpiantoDto> findImpiantiByFiltro(ImpiantoFiltro input) throws SigitExtDaoException
	{
		LOG.debug("[SigitExtDaoImpl::findImpiantiByFiltro] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();		
		
		boolean hasFiltroResponsabile = GenericUtil.isNotNullOrEmpty(input.getCfResponsabile());
		
		boolean hasFiltro3Responsabile = GenericUtil.isNotNullOrEmpty(input.getCf3Responsabile());
		
		boolean hasFiltroProprietario = GenericUtil.isNotNullOrEmpty(input.getCfProprietario());

		boolean hasFiltroManutentore = GenericUtil.isNotNullOrEmpty(input.getSiglaRea()) 
				|| GenericUtil.isNotNullOrEmpty(input.getNumeroRea()) 
				|| GenericUtil.isNotNullOrEmpty(input.getCfImpresa());
		
		sql.append("SELECT DISTINCT imp.CODICE_IMPIANTO,ISTAT_COMUNE,DENOMINAZIONE_COMUNE,SIGLA_PROVINCIA,DENOMINAZIONE_PROVINCIA,FK_STATO,");
		sql.append("L1_3_POT_H2O_KW,L1_3_POT_CLIMA_INV_KW,L1_3_POT_CLIMA_EST_KW,FLG_NOPDR,");
		sql.append("COALESCE(sigit_t_unita_immobiliare.indirizzo_sitad, sigit_t_unita_immobiliare.indirizzo_non_trovato) AS indirizzo_unita_immob,");
		sql.append("CIVICO,SEZIONE,FOGLIO,PARTICELLA,SUBALTERNO,POD_ELETTRICO,PDR_GAS,DES_STATO,FLG_VISU_PROPRIETARIO,");
		
		if (hasFiltroResponsabile) {
			sql.append("q_ruolo.codice_fisc AS codice_fiscale_responsabile,");
			sql.append("q_ruolo.denominazione_resp AS denominazione_responsabile,");
			sql.append("q_ruolo.ruolo_resp AS ruolo_responsabile,");
			sql.append("q_ruolo.data_fine_pfpg AS data_fine_pfpg_responsabile,");
			sql.append("q_ruolo.ruolo_funz1 AS ruolo_funz,");
			sql.append("q_ruolo.des_ruolo1 AS des_ruolo_funz,");
		} else {
			sql.append("COALESCE(q_pf_ruolo.codice_fisc, q_pg_ruolo.codice_fisc) AS codice_fiscale_responsabile,");
			sql.append("COALESCE(q_pf_ruolo.denominazione_resp, q_pg_ruolo.denominazione_resp) AS denominazione_responsabile,");
			sql.append("COALESCE(q_pf_ruolo.ruolo_resp, q_pg_ruolo.ruolo_resp) AS ruolo_responsabile,");
			sql.append("COALESCE(q_pf_ruolo.data_fine_pfpg, q_pg_ruolo.data_fine_pfpg) AS data_fine_pfpg_responsabile,");
			sql.append("COALESCE(q_pf_ruolo.ruolo_funz1, q_pg_ruolo.ruolo_funz1) AS ruolo_funz,");
			sql.append("COALESCE(q_pf_ruolo.des_ruolo1, q_pg_ruolo.des_ruolo1) AS des_ruolo_funz,");
		}
		
		if (hasFiltroProprietario) {
			sql.append("q_prop.codice_fisc AS codice_fiscale_proprietario,");
			sql.append("q_prop.denominazione_resp AS denominazione_proprietario");
		} else {
			sql.append("COALESCE(q_pf_prop.codice_fisc, q_pg_prop.codice_fisc) AS codice_fiscale_proprietario,");
			sql.append("COALESCE(q_pf_prop.denominazione_resp, q_pg_prop.denominazione_resp) AS denominazione_proprietario");
		}
		
		sql.append(" FROM sigit_t_impianto imp");
		sql.append(" JOIN sigit_d_stato_imp ON imp.fk_stato = sigit_d_stato_imp.id_stato");
		sql.append(" JOIN sigit_t_unita_immobiliare ON imp.codice_impianto = sigit_t_unita_immobiliare.codice_impianto");
		
		//! IMPORTANTE: bisogna mettere in JOIN prima i filtri con dati che scremano (quelli not null) o poi quelli che non scremano (quelli null)
			
		if (hasFiltroResponsabile) {
			sql.append(" JOIN ( (SELECT sigit_r_imp_ruolo_pfpg_1.id_imp_ruolo_pfpg,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.codice_impianto,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.data_fine AS data_fine_pfpg,");
				sql.append("sigit_t_persona_fisica.id_persona_fisica AS id_pf_responsabile,");
				sql.append("sigit_t_persona_fisica.codice_fiscale AS codice_fisc,");
				sql.append("(COALESCE(sigit_t_persona_fisica.cognome, ' '::character varying)::text || ' '::text) || COALESCE(sigit_t_persona_fisica.nome, ' '::character varying)::text AS denominazione_resp,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.fk_ruolo AS ruolo_resp,");
				sql.append("sigit_d_ruolo.ruolo_funz AS ruolo_funz1,");
				sql.append("sigit_d_ruolo.des_ruolo AS des_ruolo1,");
				sql.append("now() AS data_validita,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.data_inizio,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.data_fine");
				sql.append(" FROM sigit_d_ruolo");
				sql.append(" JOIN sigit_r_imp_ruolo_pfpg sigit_r_imp_ruolo_pfpg_1 ON sigit_d_ruolo.id_ruolo = sigit_r_imp_ruolo_pfpg_1.fk_ruolo");
				sql.append(" JOIN sigit_t_persona_fisica ON sigit_r_imp_ruolo_pfpg_1.fk_persona_fisica = sigit_t_persona_fisica.id_persona_fisica");
				sql.append(" WHERE (sigit_r_imp_ruolo_pfpg_1.fk_ruolo = ANY (ARRAY[4::numeric, 5::numeric, 10::numeric, 11::numeric, 12::numeric, 13::numeric]))");
				sql.append(" AND sigit_r_imp_ruolo_pfpg_1.data_inizio <= now()");
				sql.append(" AND now() <= COALESCE(sigit_r_imp_ruolo_pfpg_1.data_fine::timestamp with time zone, now(), sigit_r_imp_ruolo_pfpg_1.data_fine::timestamp with time zone)");
				sql.append(" AND UPPER(CODICE_FISCALE) = UPPER(:cf_responsabile) )");
				sql.append(" UNION (SELECT sigit_r_imp_ruolo_pfpg.id_imp_ruolo_pfpg,");
				sql.append("sigit_r_imp_ruolo_pfpg.codice_impianto,");
				sql.append("sigit_r_imp_ruolo_pfpg.data_fine AS data_fine_pfpg,");
				sql.append("sigit_t_persona_giuridica.id_persona_giuridica AS id_pg_responsabile,");
				sql.append("sigit_t_persona_giuridica.codice_fiscale AS codice_fisc,");
				sql.append("sigit_t_persona_giuridica.denominazione AS denominazione_resp,");
				sql.append("sigit_r_imp_ruolo_pfpg.fk_ruolo AS ruolo_resp,");
				sql.append("sigit_d_ruolo.ruolo_funz AS ruolo_funz1,");
				sql.append("sigit_d_ruolo.des_ruolo AS des_ruolo1,");
				sql.append("now() AS data_validita,");
				sql.append("sigit_r_imp_ruolo_pfpg.data_inizio,");
				sql.append("sigit_r_imp_ruolo_pfpg.data_fine");
				sql.append(" FROM sigit_d_ruolo");
				sql.append(" JOIN sigit_r_imp_ruolo_pfpg ON sigit_d_ruolo.id_ruolo = sigit_r_imp_ruolo_pfpg.fk_ruolo");
				sql.append(" JOIN sigit_t_persona_giuridica ON sigit_r_imp_ruolo_pfpg.fk_persona_giuridica = sigit_t_persona_giuridica.id_persona_giuridica");
				sql.append(" WHERE (sigit_r_imp_ruolo_pfpg.fk_ruolo = ANY (ARRAY[4::numeric, 5::numeric, 10::numeric, 11::numeric, 12::numeric, 13::numeric])) AND sigit_r_imp_ruolo_pfpg.data_inizio <= now() AND now() <= COALESCE(sigit_r_imp_ruolo_pfpg.data_fine::timestamp with time zone, now(), sigit_r_imp_ruolo_pfpg.data_fine::timestamp with time zone)");
				sql.append(" AND UPPER(CODICE_FISCALE) = UPPER(:cf_responsabile)");
				sql.append(" ) ) q_ruolo ON imp.codice_impianto = q_ruolo.codice_impianto");
		}
		
		if (hasFiltroProprietario) {
			sql.append(" JOIN ( (SELECT sigit_r_imp_ruolo_pfpg_1.id_imp_ruolo_pfpg,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.codice_impianto,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.data_fine AS data_fine_pfpg,");
				sql.append("sigit_t_persona_fisica.id_persona_fisica AS id_pf_responsabile,");
				sql.append("sigit_t_persona_fisica.codice_fiscale AS codice_fisc,");
				sql.append("(COALESCE(sigit_t_persona_fisica.cognome, ' '::character varying)::text || ' '::text) || COALESCE(sigit_t_persona_fisica.nome, ' '::character varying)::text AS denominazione_resp,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.fk_ruolo AS ruolo_resp,");
				sql.append("sigit_d_ruolo.ruolo_funz AS ruolo_funz1");
				sql.append(" FROM sigit_d_ruolo");
				sql.append(" JOIN (sigit_r_imp_ruolo_pfpg sigit_r_imp_ruolo_pfpg_1");
				sql.append(" JOIN sigit_t_persona_fisica ON sigit_r_imp_ruolo_pfpg_1.fk_persona_fisica = sigit_t_persona_fisica.id_persona_fisica) ON sigit_d_ruolo.id_ruolo = sigit_r_imp_ruolo_pfpg_1.fk_ruolo");
				sql.append(" WHERE (sigit_r_imp_ruolo_pfpg_1.fk_ruolo = ANY (ARRAY[15::numeric, 16::numeric]))");
				sql.append(" AND sigit_r_imp_ruolo_pfpg_1.data_inizio <= now()"); 
				sql.append(" AND now() <= COALESCE(sigit_r_imp_ruolo_pfpg_1.data_fine::timestamp with time zone, now(), sigit_r_imp_ruolo_pfpg_1.data_fine::timestamp with time zone)");
				sql.append(" AND UPPER(CODICE_FISCALE) = UPPER(:cf_proprietario) )");
				sql.append(" UNION (SELECT sigit_r_imp_ruolo_pfpg.id_imp_ruolo_pfpg,");
				sql.append("sigit_r_imp_ruolo_pfpg.codice_impianto,");
				sql.append("sigit_r_imp_ruolo_pfpg.data_fine AS data_fine_pfpg,");
				sql.append("sigit_t_persona_giuridica.id_persona_giuridica AS id_pg_responsabile,");
				sql.append("sigit_t_persona_giuridica.codice_fiscale AS codice_fisc,");
				sql.append("sigit_t_persona_giuridica.denominazione AS denominazione_resp,");
				sql.append("sigit_r_imp_ruolo_pfpg.fk_ruolo AS ruolo_resp,");
				sql.append("sigit_d_ruolo.ruolo_funz AS ruolo_funz1");
				sql.append(" FROM sigit_d_ruolo");
				sql.append(" JOIN sigit_r_imp_ruolo_pfpg ON sigit_d_ruolo.id_ruolo = sigit_r_imp_ruolo_pfpg.fk_ruolo");
				sql.append(" JOIN sigit_t_persona_giuridica ON sigit_r_imp_ruolo_pfpg.fk_persona_giuridica = sigit_t_persona_giuridica.id_persona_giuridica");
				sql.append(" WHERE (sigit_r_imp_ruolo_pfpg.fk_ruolo = ANY (ARRAY[15::numeric, 15::numeric]))");
				sql.append(" AND sigit_r_imp_ruolo_pfpg.data_inizio <= now() AND"); 
				sql.append(" now() <= COALESCE(sigit_r_imp_ruolo_pfpg.data_fine::timestamp with time zone, now(), sigit_r_imp_ruolo_pfpg.data_fine::timestamp with time zone)");
				sql.append(" AND UPPER(CODICE_FISCALE) = UPPER(:cf_proprietario) )"); 
				sql.append(" ) q_prop ON imp.codice_impianto = q_prop.codice_impianto");
		}
		
		if (hasFiltroManutentore) {
			sql.append(" JOIN ((SELECT sigit_r_imp_ruolo_pfpg.id_imp_ruolo_pfpg,");
				sql.append("sigit_r_imp_ruolo_pfpg.codice_impianto,");
				sql.append("sigit_t_persona_giuridica.sigla_rea,");
				sql.append("sigit_t_persona_giuridica.numero_rea,");
				sql.append("sigit_t_persona_giuridica.codice_fiscale AS codice_fisc,");
				sql.append("sigit_t_persona_giuridica.denominazione AS denominazione_resp");
				sql.append(" FROM sigit_d_ruolo");
				sql.append(" JOIN sigit_r_imp_ruolo_pfpg ON sigit_d_ruolo.id_ruolo = sigit_r_imp_ruolo_pfpg.fk_ruolo");
				sql.append(" JOIN sigit_t_persona_giuridica ON sigit_r_imp_ruolo_pfpg.fk_persona_giuridica = sigit_t_persona_giuridica.id_persona_giuridica");
				sql.append(" WHERE (sigit_r_imp_ruolo_pfpg.fk_ruolo = 3::numeric)");
				sql.append(" AND sigit_r_imp_ruolo_pfpg.data_inizio <= now() AND");
				sql.append(" now() <= COALESCE(sigit_r_imp_ruolo_pfpg.data_fine::timestamp with time zone, now(), sigit_r_imp_ruolo_pfpg.data_fine::timestamp with time zone)");
				if (GenericUtil.isNotNullOrEmpty(input.getSiglaRea())) {						
					sql.append(" AND SIGLA_REA = :sigla_rea ");
				}
				if (GenericUtil.isNotNullOrEmpty(input.getNumeroRea())) {						
					sql.append(" AND NUMERO_REA = :numero_rea ");
				}
				if (GenericUtil.isNotNullOrEmpty(input.getCfImpresa())) {						
					sql.append(" AND UPPER(CODICE_FISCALE) = UPPER(:cf_manutentore) ");
				}
				sql.append(")");
				sql.append(" UNION (SELECT sigit_r_comp4_manut.id_r_comp4_manut,");
				sql.append("sigit_r_comp4_manut.codice_impianto,");
				sql.append("sigit_t_persona_giuridica.sigla_rea,");
				sql.append("sigit_t_persona_giuridica.numero_rea,");
				sql.append("sigit_t_persona_giuridica.codice_fiscale AS codice_fisc,");
				sql.append("sigit_t_persona_giuridica.denominazione AS denominazione_resp");
				sql.append(" FROM sigit_t_persona_giuridica");
				sql.append(" JOIN sigit_r_comp4_manut ON sigit_r_comp4_manut.fk_persona_giuridica = sigit_t_persona_giuridica.id_persona_giuridica");
				sql.append(" WHERE sigit_r_comp4_manut.data_inizio <= now() AND");
				sql.append(" now() <= COALESCE(sigit_r_comp4_manut.data_fine::timestamp with time zone, now(), sigit_r_comp4_manut.data_fine::timestamp with time zone)");
				if (GenericUtil.isNotNullOrEmpty(input.getSiglaRea())) {						
					sql.append(" AND SIGLA_REA = :sigla_rea ");
				}
				if (GenericUtil.isNotNullOrEmpty(input.getNumeroRea())) {						
					sql.append(" AND NUMERO_REA = :numero_rea ");
				}
				if (GenericUtil.isNotNullOrEmpty(input.getCfImpresa())) {						
					sql.append(" AND UPPER(CODICE_FISCALE) = UPPER(:cf_manutentore) ");
				}
				sql.append(")");
				sql.append(" ) q_manut ON imp.codice_impianto = q_manut.codice_impianto");
		}
		
		if(hasFiltro3Responsabile) {
			sql.append(" JOIN ( SELECT sigit_t_contratto_2019.id_contratto,");
				sql.append(" sigit_t_contratto_2019.codice_impianto,");
				sql.append(" sigit_t_contratto_2019.data_cessazione,");
				sql.append(" sigit_t_contratto_2019.flg_tacito_rinnovo,");
				sql.append(" sigit_t_contratto_2019.data_inizio,");
				sql.append(" sigit_t_persona_giuridica_1.id_persona_giuridica AS id_pg_3r,");
				sql.append(" sigit_t_persona_giuridica_1.denominazione AS denominazione_3_responsabile,");
	            sql.append(" sigit_t_persona_giuridica_1.sigla_rea AS sigla_rea_3r,");
	    		sql.append(" sigit_t_persona_giuridica_1.numero_rea AS numero_rea_3r,");
				sql.append(" sigit_t_persona_giuridica_1.codice_fiscale AS codice_fiscale_3r");
				sql.append(" FROM sigit_t_contratto_2019");
				sql.append(" JOIN sigit_t_persona_giuridica sigit_t_persona_giuridica_1 ON sigit_t_contratto_2019.fk_pg_3_resp = sigit_t_persona_giuridica_1.id_persona_giuridica");
				sql.append(" WHERE sigit_t_contratto_2019.data_cessazione IS NULL AND (sigit_t_contratto_2019.flg_tacito_rinnovo = 1::numeric OR sigit_t_contratto_2019.flg_tacito_rinnovo = 0::numeric AND sigit_t_contratto_2019.data_fine >= now()::date)");
				sql.append("AND UPPER(codice_fiscale) = UPPER(:cf_3responsabile)");
				sql.append(") q_contratto ON imp.codice_impianto = q_contratto.codice_impianto");
		}
		
		if (!hasFiltroResponsabile) {
			sql.append(" LEFT JOIN (SELECT sigit_r_imp_ruolo_pfpg_1.id_imp_ruolo_pfpg,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.codice_impianto,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.data_fine AS data_fine_pfpg,");
				sql.append("sigit_t_persona_fisica.id_persona_fisica AS id_pf_responsabile,");
				sql.append("sigit_t_persona_fisica.codice_fiscale AS codice_fisc,");
				sql.append("(COALESCE(sigit_t_persona_fisica.cognome, ' '::character varying)::text || ' '::text) || COALESCE(sigit_t_persona_fisica.nome, ' '::character varying)::text AS denominazione_resp,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.fk_ruolo AS ruolo_resp,");
				sql.append("sigit_d_ruolo.ruolo_funz AS ruolo_funz1,");
				sql.append("sigit_d_ruolo.des_ruolo AS des_ruolo1,");
				sql.append("now() AS data_validita,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.data_inizio,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.data_fine");
				sql.append(" FROM sigit_d_ruolo");
				sql.append(" JOIN sigit_r_imp_ruolo_pfpg sigit_r_imp_ruolo_pfpg_1 ON sigit_d_ruolo.id_ruolo = sigit_r_imp_ruolo_pfpg_1.fk_ruolo");
				sql.append(" JOIN sigit_t_persona_fisica ON sigit_r_imp_ruolo_pfpg_1.fk_persona_fisica = sigit_t_persona_fisica.id_persona_fisica");
				sql.append(" WHERE (sigit_r_imp_ruolo_pfpg_1.fk_ruolo = ANY (ARRAY[4::numeric, 5::numeric, 10::numeric, 11::numeric, 12::numeric, 13::numeric]))");
				sql.append(" AND sigit_r_imp_ruolo_pfpg_1.data_inizio <= now()");
				sql.append(" AND now() <= COALESCE(sigit_r_imp_ruolo_pfpg_1.data_fine::timestamp with time zone, now(), sigit_r_imp_ruolo_pfpg_1.data_fine::timestamp with time zone)");
				sql.append(" ) q_pf_ruolo ON imp.codice_impianto = q_pf_ruolo.codice_impianto");
			sql.append(" LEFT JOIN ( SELECT sigit_r_imp_ruolo_pfpg.id_imp_ruolo_pfpg,");
				sql.append("sigit_r_imp_ruolo_pfpg.codice_impianto,");
				sql.append("sigit_r_imp_ruolo_pfpg.data_fine AS data_fine_pfpg,");
				sql.append("sigit_t_persona_giuridica.id_persona_giuridica AS id_pg_responsabile,");
				sql.append("sigit_t_persona_giuridica.codice_fiscale AS codice_fisc,");
				sql.append("sigit_t_persona_giuridica.denominazione AS denominazione_resp,");
				sql.append("sigit_r_imp_ruolo_pfpg.fk_ruolo AS ruolo_resp,");
				sql.append("sigit_d_ruolo.ruolo_funz AS ruolo_funz1,");
				sql.append("sigit_d_ruolo.des_ruolo AS des_ruolo1,");
				sql.append("now() AS data_validita,");
				sql.append("sigit_r_imp_ruolo_pfpg.data_inizio,");
				sql.append("sigit_r_imp_ruolo_pfpg.data_fine");
				sql.append(" FROM sigit_d_ruolo");
				sql.append(" JOIN sigit_r_imp_ruolo_pfpg ON sigit_d_ruolo.id_ruolo = sigit_r_imp_ruolo_pfpg.fk_ruolo");
				sql.append(" JOIN sigit_t_persona_giuridica ON sigit_r_imp_ruolo_pfpg.fk_persona_giuridica = sigit_t_persona_giuridica.id_persona_giuridica");
				sql.append(" WHERE (sigit_r_imp_ruolo_pfpg.fk_ruolo = ANY (ARRAY[4::numeric, 5::numeric, 10::numeric, 11::numeric, 12::numeric, 13::numeric])) AND sigit_r_imp_ruolo_pfpg.data_inizio <= now() AND now() <= COALESCE(sigit_r_imp_ruolo_pfpg.data_fine::timestamp with time zone, now(), sigit_r_imp_ruolo_pfpg.data_fine::timestamp with time zone)");
				sql.append(" ) q_pg_ruolo ON imp.codice_impianto = q_pg_ruolo.codice_impianto");
		}
		
		if (!hasFiltroProprietario) {
			sql.append(" LEFT JOIN ( SELECT sigit_r_imp_ruolo_pfpg_1.id_imp_ruolo_pfpg,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.codice_impianto,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.data_fine AS data_fine_pfpg,");
				sql.append("sigit_t_persona_fisica.id_persona_fisica AS id_pf_responsabile,");
				sql.append("sigit_t_persona_fisica.codice_fiscale AS codice_fisc,");
				sql.append("(COALESCE(sigit_t_persona_fisica.cognome, ' '::character varying)::text || ' '::text) || COALESCE(sigit_t_persona_fisica.nome, ' '::character varying)::text AS denominazione_resp,");
				sql.append("sigit_r_imp_ruolo_pfpg_1.fk_ruolo AS ruolo_resp,");
				sql.append("sigit_d_ruolo.ruolo_funz AS ruolo_funz1");
				sql.append(" FROM sigit_d_ruolo");
				sql.append(" JOIN (sigit_r_imp_ruolo_pfpg sigit_r_imp_ruolo_pfpg_1");
				sql.append(" JOIN sigit_t_persona_fisica ON sigit_r_imp_ruolo_pfpg_1.fk_persona_fisica = sigit_t_persona_fisica.id_persona_fisica) ON sigit_d_ruolo.id_ruolo = sigit_r_imp_ruolo_pfpg_1.fk_ruolo");
				sql.append(" WHERE (sigit_r_imp_ruolo_pfpg_1.fk_ruolo = ANY (ARRAY[15::numeric, 16::numeric]))");
				sql.append(" AND sigit_r_imp_ruolo_pfpg_1.data_inizio <= now()");
				sql.append(" AND now() <= COALESCE(sigit_r_imp_ruolo_pfpg_1.data_fine::timestamp with time zone, now(), sigit_r_imp_ruolo_pfpg_1.data_fine::timestamp with time zone)");
				sql.append(" ) q_pf_prop ON imp.codice_impianto = q_pf_prop.codice_impianto");
			sql.append(" LEFT JOIN (SELECT sigit_r_imp_ruolo_pfpg.id_imp_ruolo_pfpg,");
				sql.append("sigit_r_imp_ruolo_pfpg.codice_impianto,");
				sql.append("sigit_r_imp_ruolo_pfpg.data_fine AS data_fine_pfpg,");
				sql.append("sigit_t_persona_giuridica.id_persona_giuridica AS id_pg_responsabile,");
				sql.append("sigit_t_persona_giuridica.codice_fiscale AS codice_fisc,");
				sql.append("sigit_t_persona_giuridica.denominazione AS denominazione_resp,");
				sql.append("sigit_r_imp_ruolo_pfpg.fk_ruolo AS ruolo_resp,");
				sql.append("sigit_d_ruolo.ruolo_funz AS ruolo_funz1");
				sql.append(" FROM sigit_d_ruolo");
				sql.append(" JOIN sigit_r_imp_ruolo_pfpg ON sigit_d_ruolo.id_ruolo = sigit_r_imp_ruolo_pfpg.fk_ruolo");
				sql.append(" JOIN sigit_t_persona_giuridica ON sigit_r_imp_ruolo_pfpg.fk_persona_giuridica = sigit_t_persona_giuridica.id_persona_giuridica");
				sql.append(" WHERE (sigit_r_imp_ruolo_pfpg.fk_ruolo = ANY (ARRAY[15::numeric, 15::numeric]))");
				sql.append(" AND sigit_r_imp_ruolo_pfpg.data_inizio <= now() AND");
				sql.append(" now() <= COALESCE(sigit_r_imp_ruolo_pfpg.data_fine::timestamp with time zone, now(), sigit_r_imp_ruolo_pfpg.data_fine::timestamp with time zone)");
				sql.append(" ) q_pg_prop ON imp.codice_impianto = q_pg_prop.codice_impianto");
		}
		
		sql.append(" WHERE ");
		
		sql.append(" sigit_t_unita_immobiliare.flg_principale = 1::numeric");
		
		if (ConvertUtil.convertToBooleanAllways(input.getFlagVisuProprietario())) {
			sql.append(" AND FLG_VISU_PROPRIETARIO = 1");
		}
		
		if (GenericUtil.isNotNullOrEmpty(input.getFkStato())) {			
			sql.append(" AND imp.FK_STATO = :stato_impianto");
		}
		if (GenericUtil.isNotNullOrEmpty(input.getCodiceImpianto())) {			
			sql.append(" AND imp.CODICE_IMPIANTO = :codice_impianto");
		}
		if (GenericUtil.isNotNullOrEmpty(input.getSiglaProvincia())) {			
			sql.append(" AND SIGLA_PROVINCIA = :sigla_provincia");
		}
		if (GenericUtil.isNotNullOrEmpty(input.getIstatComune())) {			
			sql.append(" AND ISTAT_COMUNE = :istat_comune");
		}
		if (GenericUtil.isNotNullOrEmpty(input.getDescComune())) {				
			sql.append(" AND UPPER(DENOMINAZIONE_COMUNE) LIKE UPPER(:descr_comune)");
		}
		if (GenericUtil.isNotNullOrEmpty(input.getIndirizzo())) {			
			sql.append(" AND COALESCE(sigit_t_unita_immobiliare.indirizzo_sitad, sigit_t_unita_immobiliare.indirizzo_non_trovato) LIKE UPPER(:indirizzo)");
		}
		if (GenericUtil.isNotNullOrEmpty(input.getCivico())) {			
			sql.append(" AND UPPER(CIVICO) LIKE UPPER(':civico')");
		}
		if (GenericUtil.isNotNullOrEmpty(input.getPod())) {			
			sql.append(" AND UPPER(POD_ELETTRICO) = UPPER(:pod_elettrico)");
		}
		if (GenericUtil.isNotNullOrEmpty(input.getPdr())) {			
			sql.append(" AND UPPER(PDR_GAS) = UPPER(:pdr_gas)");
		}
		sql.append(" LIMIT (SELECT VALORE_CONFIG_NUM FROM SIGIT_WRK_CONFIG WHERE CHIAVE_CONFIG='MAX_RIGHE')");

		
		if (hasFiltroResponsabile) {
			paramMap.addValue("cf_responsabile", input.getCfResponsabile());
		}
		
		if (hasFiltroProprietario) {
			paramMap.addValue("cf_proprietario", input.getCfProprietario());
		}
		
		if (hasFiltro3Responsabile) {
			paramMap.addValue("cf_3responsabile", input.getCf3Responsabile());
		}
		
		if (GenericUtil.isNotNullOrEmpty(input.getSiglaRea())) {			
			paramMap.addValue("sigla_rea", input.getSiglaRea());
		}
		if (GenericUtil.isNotNullOrEmpty(input.getNumeroRea())) {						
			paramMap.addValue("numero_rea", input.getNumeroRea());
		}
		if (GenericUtil.isNotNullOrEmpty(input.getCfImpresa())) {						
			paramMap.addValue("cf_manutentore", input.getCfImpresa());
		}
		if (GenericUtil.isNotNullOrEmpty(input.getFkStato())) {					
			paramMap.addValue("stato_impianto", input.getFkStato());
		}
		if (GenericUtil.isNotNullOrEmpty(input.getCodiceImpianto())) {				
			paramMap.addValue("codice_impianto", input.getCodiceImpianto());
		}
		if (GenericUtil.isNotNullOrEmpty(input.getSiglaProvincia())) {					
			paramMap.addValue("sigla_provincia", input.getSiglaProvincia());
		}
		if (GenericUtil.isNotNullOrEmpty(input.getIstatComune())) {			
			paramMap.addValue("istat_comune", input.getIstatComune());
		}
		if (GenericUtil.isNotNullOrEmpty(input.getDescComune())) {			
			paramMap.addValue("descr_comune", input.getDescComune());
		}
		if (GenericUtil.isNotNullOrEmpty(input.getIndirizzo())) {			
			paramMap.addValue("indirizzo", input.getIndirizzo());
		}
		if (GenericUtil.isNotNullOrEmpty(input.getCivico())) {			
			paramMap.addValue("civico", input.getCivico());
		}
		if (GenericUtil.isNotNullOrEmpty(input.getPod())) {			
			paramMap.addValue("pod_elettrico", input.getPod());
		}
		if (GenericUtil.isNotNullOrEmpty(input.getPdr())) {			
			paramMap.addValue("pdr_gas", input.getPdr());
		}

		List<SigitExtImpiantoDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, impiantiByFiltroRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitExtDaoImpl::findImpiantiByFiltro] esecuzione query", ex);
			throw new SigitExtDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitExtDaoImpl", "findImpiantiByFiltro", "esecuzione query", sql.toString());
			LOG.debug("[SigitExtDaoImpl::findImpiantiByFiltro] END");
		}
		return list;
	}
}
