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

/*PROTECTED REGION ID(R1931428633) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTCodiceBoll.
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
public class SigitTCodiceBollDaoImpl extends AbstractDAO implements SigitTCodiceBollDao {
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
	 * Metodo di inserimento del DAO sigitTCodiceBoll. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTCodiceBollPk
	 * @generated
	 */

	public SigitTCodiceBollPk insert(SigitTCodiceBollDto dto)

	{
		LOG.debug("[SigitTCodiceBollDaoImpl::insert] START");
		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	SIGLA_BOLLINO,NUMERO_BOLLINO,FK_TRANSAZIONE_BOLL,FK_POTENZA,FK_PREZZO,FK_DT_INIZIO_ACQUISTO,FLG_PREGRESSO,DT_INSERIMENTO ) VALUES (  :SIGLA_BOLLINO , :NUMERO_BOLLINO , :FK_TRANSAZIONE_BOLL , :FK_POTENZA , :FK_PREZZO , :FK_DT_INIZIO_ACQUISTO , :FLG_PREGRESSO , :DT_INSERIMENTO  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [SIGLA_BOLLINO]
		params.addValue("SIGLA_BOLLINO", dto.getSiglaBollino(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [NUMERO_BOLLINO]
		params.addValue("NUMERO_BOLLINO", dto.getNumeroBollino(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_TRANSAZIONE_BOLL]
		params.addValue("FK_TRANSAZIONE_BOLL", dto.getFkTransazioneBoll(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_POTENZA]
		params.addValue("FK_POTENZA", dto.getFkPotenza(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_PREZZO]
		params.addValue("FK_PREZZO", dto.getFkPrezzo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_DT_INIZIO_ACQUISTO]
		params.addValue("FK_DT_INIZIO_ACQUISTO", dto.getFkDtInizioAcquisto(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [FLG_PREGRESSO]
		params.addValue("FLG_PREGRESSO", dto.getFlgPregresso(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DT_INSERIMENTO]
		params.addValue("DT_INSERIMENTO", dto.getDtInserimento(), java.sql.Types.TIMESTAMP);

		insert(jdbcTemplate, sql.toString(), params);

		LOG.debug("[SigitTCodiceBollDaoImpl::insert] END");
		return dto.createPk();

	}

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_CODICE_BOLL";
	}

}
