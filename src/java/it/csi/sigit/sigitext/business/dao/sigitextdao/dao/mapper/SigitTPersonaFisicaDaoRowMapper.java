package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTPersonaFisicaDao
 * @generated
 */
public class SigitTPersonaFisicaDaoRowMapper extends BaseDaoRowMapper
		implements
			org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTPersonaFisicaDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTPersonaFisicaDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTPersonaFisicaDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTPersonaFisicaDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTPersonaFisicaDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTPersonaFisicaDto) {
			return mapRow_internal((SigitTPersonaFisicaDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTPersonaFisicaDto mapRow_internal(SigitTPersonaFisicaDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTPersonaFisicaDto dto = objectToFill;

		// colonna [ID_PERSONA_FISICA]
		if (mapAllColumns || columnsToReadMap.get("ID_PERSONA_FISICA") != null)
			dto.setIdPersonaFisica(rs.getBigDecimal("ID_PERSONA_FISICA"));

		// colonna [NOME]
		if (mapAllColumns || columnsToReadMap.get("NOME") != null)
			dto.setNome(rs.getString("NOME"));

		// colonna [COGNOME]
		if (mapAllColumns || columnsToReadMap.get("COGNOME") != null)
			dto.setCognome(rs.getString("COGNOME"));

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

		// colonna [ISTAT_COMUNE]
		if (mapAllColumns || columnsToReadMap.get("ISTAT_COMUNE") != null)
			dto.setIstatComune(rs.getString("ISTAT_COMUNE"));

		// colonna [SIGLA_PROV]
		if (mapAllColumns || columnsToReadMap.get("SIGLA_PROV") != null)
			dto.setSiglaProv(rs.getString("SIGLA_PROV"));

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

		// colonna [FLG_ACCREDITATO]
		if (mapAllColumns || columnsToReadMap.get("FLG_ACCREDITATO") != null)
			dto.setFlgAccreditato(rs.getString("FLG_ACCREDITATO"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

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

		// colonna [FLG_NEWSLETTER]
		if (mapAllColumns || columnsToReadMap.get("FLG_NEWSLETTER") != null)
			dto.setFlgNewsletter(rs.getBigDecimal("FLG_NEWSLETTER"));

		// colonna [FLG_GDPR]
		if (mapAllColumns || columnsToReadMap.get("FLG_GDPR") != null)
			dto.setFlgGdpr(rs.getBigDecimal("FLG_GDPR"));

		return dto;
	}

}
