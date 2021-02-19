package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTPersonaGiuridicaDao
 * @generated
 */
public class SigitTPersonaGiuridicaDaoRowMapper extends BaseDaoRowMapper
		implements
			org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTPersonaGiuridicaDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTPersonaGiuridicaDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTPersonaGiuridicaDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTPersonaGiuridicaDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTPersonaGiuridicaDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTPersonaGiuridicaDto) {
			return mapRow_internal((SigitTPersonaGiuridicaDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTPersonaGiuridicaDto mapRow_internal(SigitTPersonaGiuridicaDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTPersonaGiuridicaDto dto = objectToFill;

		// colonna [ID_PERSONA_GIURIDICA]
		if (mapAllColumns || columnsToReadMap.get("ID_PERSONA_GIURIDICA") != null)
			dto.setIdPersonaGiuridica(rs.getBigDecimal("ID_PERSONA_GIURIDICA"));

		// colonna [DENOMINAZIONE]
		if (mapAllColumns || columnsToReadMap.get("DENOMINAZIONE") != null)
			dto.setDenominazione(rs.getString("DENOMINAZIONE"));

		// colonna [CODICE_FISCALE]
		if (mapAllColumns || columnsToReadMap.get("CODICE_FISCALE") != null)
			dto.setCodiceFiscale(rs.getString("CODICE_FISCALE"));

		// colonna [FK_L2]
		if (mapAllColumns || columnsToReadMap.get("FK_L2") != null)
			dto.setFkL2(rs.getBigDecimal("FK_L2"));

		// colonna [INDIRIZZO_SITAD]
		if (mapAllColumns || columnsToReadMap.get("INDIRIZZO_SITAD") != null)
			dto.setIndirizzoSitad(rs.getString("INDIRIZZO_SITAD"));

		// colonna [INDIRIZZO_NON_TROVATO]
		if (mapAllColumns || columnsToReadMap.get("INDIRIZZO_NON_TROVATO") != null)
			dto.setIndirizzoNonTrovato(rs.getString("INDIRIZZO_NON_TROVATO"));

		// colonna [SIGLA_PROV]
		if (mapAllColumns || columnsToReadMap.get("SIGLA_PROV") != null)
			dto.setSiglaProv(rs.getString("SIGLA_PROV"));

		// colonna [ISTAT_COMUNE]
		if (mapAllColumns || columnsToReadMap.get("ISTAT_COMUNE") != null)
			dto.setIstatComune(rs.getString("ISTAT_COMUNE"));

		// colonna [COMUNE]
		if (mapAllColumns || columnsToReadMap.get("COMUNE") != null)
			dto.setComune(rs.getString("COMUNE"));

		// colonna [PROVINCIA]
		if (mapAllColumns || columnsToReadMap.get("PROVINCIA") != null)
			dto.setProvincia(rs.getString("PROVINCIA"));

		// colonna [CIVICO]
		if (mapAllColumns || columnsToReadMap.get("CIVICO") != null)
			dto.setCivico(rs.getString("CIVICO"));

		// colonna [CAP]
		if (mapAllColumns || columnsToReadMap.get("CAP") != null)
			dto.setCap(rs.getString("CAP"));

		// colonna [EMAIL]
		if (mapAllColumns || columnsToReadMap.get("EMAIL") != null)
			dto.setEmail(rs.getString("EMAIL"));

		// colonna [DATA_INIZIO_ATTIVITA]
		if (mapAllColumns || columnsToReadMap.get("DATA_INIZIO_ATTIVITA") != null)
			dto.setDataInizioAttivita(rs.getDate("DATA_INIZIO_ATTIVITA"));

		// colonna [DATA_CESSAZIONE]
		if (mapAllColumns || columnsToReadMap.get("DATA_CESSAZIONE") != null)
			dto.setDataCessazione(rs.getDate("DATA_CESSAZIONE"));

		// colonna [SIGLA_REA]
		if (mapAllColumns || columnsToReadMap.get("SIGLA_REA") != null)
			dto.setSiglaRea(rs.getString("SIGLA_REA"));

		// colonna [NUMERO_REA]
		if (mapAllColumns || columnsToReadMap.get("NUMERO_REA") != null)
			dto.setNumeroRea(rs.getBigDecimal("NUMERO_REA"));

		// colonna [FLG_AMMINISTRATORE]
		if (mapAllColumns || columnsToReadMap.get("FLG_AMMINISTRATORE") != null)
			dto.setFlgAmministratore(rs.getBigDecimal("FLG_AMMINISTRATORE"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [FLG_TERZO_RESPONSABILE]
		if (mapAllColumns || columnsToReadMap.get("FLG_TERZO_RESPONSABILE") != null)
			dto.setFlgTerzoResponsabile(rs.getBigDecimal("FLG_TERZO_RESPONSABILE"));

		// colonna [FLG_DISTRIBUTORE]
		if (mapAllColumns || columnsToReadMap.get("FLG_DISTRIBUTORE") != null)
			dto.setFlgDistributore(rs.getBigDecimal("FLG_DISTRIBUTORE"));

		// colonna [FLG_CAT]
		if (mapAllColumns || columnsToReadMap.get("FLG_CAT") != null)
			dto.setFlgCat(rs.getBigDecimal("FLG_CAT"));

		// colonna [FLG_INDIRIZZO_ESTERO]
		if (mapAllColumns || columnsToReadMap.get("FLG_INDIRIZZO_ESTERO") != null)
			dto.setFlgIndirizzoEstero(rs.getBigDecimal("FLG_INDIRIZZO_ESTERO"));

		// colonna [STATO_ESTERO]
		if (mapAllColumns || columnsToReadMap.get("STATO_ESTERO") != null)
			dto.setStatoEstero(rs.getString("STATO_ESTERO"));

		// colonna [CITTA_ESTERO]
		if (mapAllColumns || columnsToReadMap.get("CITTA_ESTERO") != null)
			dto.setCittaEstero(rs.getString("CITTA_ESTERO"));

		// colonna [INDIRIZZO_ESTERO]
		if (mapAllColumns || columnsToReadMap.get("INDIRIZZO_ESTERO") != null)
			dto.setIndirizzoEstero(rs.getString("INDIRIZZO_ESTERO"));

		// colonna [CAP_ESTERO]
		if (mapAllColumns || columnsToReadMap.get("CAP_ESTERO") != null)
			dto.setCapEstero(rs.getString("CAP_ESTERO"));

		// colonna [FK_STATO_PG]
		if (mapAllColumns || columnsToReadMap.get("FK_STATO_PG") != null)
			dto.setFkStatoPg((Integer) rs.getObject("FK_STATO_PG"));

		// colonna [DT_AGG_DICHIARAZIONE]
		if (mapAllColumns || columnsToReadMap.get("DT_AGG_DICHIARAZIONE") != null)
			dto.setDtAggDichiarazione(rs.getTimestamp("DT_AGG_DICHIARAZIONE"));

		// colonna [FLG_DM37_LETTERAC]
		if (mapAllColumns || columnsToReadMap.get("FLG_DM37_LETTERAC") != null)
			dto.setFlgDm37Letterac(rs.getBigDecimal("FLG_DM37_LETTERAC"));

		// colonna [FLG_DM37_LETTERAD]
		if (mapAllColumns || columnsToReadMap.get("FLG_DM37_LETTERAD") != null)
			dto.setFlgDm37Letterad(rs.getBigDecimal("FLG_DM37_LETTERAD"));

		// colonna [FLG_DM37_LETTERAE]
		if (mapAllColumns || columnsToReadMap.get("FLG_DM37_LETTERAE") != null)
			dto.setFlgDm37Letterae(rs.getBigDecimal("FLG_DM37_LETTERAE"));

		// colonna [FLG_FGAS]
		if (mapAllColumns || columnsToReadMap.get("FLG_FGAS") != null)
			dto.setFlgFgas(rs.getBigDecimal("FLG_FGAS"));

		// colonna [FLG_CONDUTTORE]
		if (mapAllColumns || columnsToReadMap.get("FLG_CONDUTTORE") != null)
			dto.setFlgConduttore(rs.getBigDecimal("FLG_CONDUTTORE"));

		// colonna [FLG_SOGG_INCARICATO]
		if (mapAllColumns || columnsToReadMap.get("FLG_SOGG_INCARICATO") != null)
			dto.setFlgSoggIncaricato(rs.getBigDecimal("FLG_SOGG_INCARICATO"));

		// colonna [DELEGA_SOGG_INCARICATO]
		if (mapAllColumns || columnsToReadMap.get("DELEGA_SOGG_INCARICATO") != null)
			dto.setDelegaSoggIncaricato(rs.getString("DELEGA_SOGG_INCARICATO"));

		// colonna [DT_CREAZIONE_TOKEN]
		if (mapAllColumns || columnsToReadMap.get("DT_CREAZIONE_TOKEN") != null)
			dto.setDtCreazioneToken(rs.getDate("DT_CREAZIONE_TOKEN"));

		// colonna [DT_SCADENZA_TOKEN]
		if (mapAllColumns || columnsToReadMap.get("DT_SCADENZA_TOKEN") != null)
			dto.setDtScadenzaToken(rs.getDate("DT_SCADENZA_TOKEN"));

		// colonna [TOKEN]
		if (mapAllColumns || columnsToReadMap.get("TOKEN") != null)
			dto.setToken(rs.getString("TOKEN"));

		return dto;
	}

}
