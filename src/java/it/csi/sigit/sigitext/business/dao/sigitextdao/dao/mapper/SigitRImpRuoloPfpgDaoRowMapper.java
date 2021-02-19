package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitRImpRuoloPfpgDao
 * @generated
 */
public class SigitRImpRuoloPfpgDaoRowMapper extends BaseDaoRowMapper
		implements
			org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitRImpRuoloPfpgDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitRImpRuoloPfpgDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitRImpRuoloPfpgDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitRImpRuoloPfpgDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitRImpRuoloPfpgDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitRImpRuoloPfpgDto) {
			return mapRow_internal((SigitRImpRuoloPfpgDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitRImpRuoloPfpgDto mapRow_internal(SigitRImpRuoloPfpgDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitRImpRuoloPfpgDto dto = objectToFill;

		// colonna [ID_IMP_RUOLO_PFPG]
		if (mapAllColumns || columnsToReadMap.get("ID_IMP_RUOLO_PFPG") != null)
			dto.setIdImpRuoloPfpg(rs.getBigDecimal("ID_IMP_RUOLO_PFPG"));

		// colonna [FK_RUOLO]
		if (mapAllColumns || columnsToReadMap.get("FK_RUOLO") != null)
			dto.setFkRuolo(rs.getBigDecimal("FK_RUOLO"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [DATA_INIZIO]
		if (mapAllColumns || columnsToReadMap.get("DATA_INIZIO") != null)
			dto.setDataInizio(rs.getDate("DATA_INIZIO"));

		// colonna [DATA_FINE]
		if (mapAllColumns || columnsToReadMap.get("DATA_FINE") != null)
			dto.setDataFine(rs.getDate("DATA_FINE"));

		// colonna [FK_PERSONA_FISICA]
		if (mapAllColumns || columnsToReadMap.get("FK_PERSONA_FISICA") != null)
			dto.setFkPersonaFisica(rs.getBigDecimal("FK_PERSONA_FISICA"));

		// colonna [FK_PERSONA_GIURIDICA]
		if (mapAllColumns || columnsToReadMap.get("FK_PERSONA_GIURIDICA") != null)
			dto.setFkPersonaGiuridica(rs.getBigDecimal("FK_PERSONA_GIURIDICA"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [FLG_PRIMO_CARICATORE]
		if (mapAllColumns || columnsToReadMap.get("FLG_PRIMO_CARICATORE") != null)
			dto.setFlgPrimoCaricatore(rs.getBigDecimal("FLG_PRIMO_CARICATORE"));

		return dto;
	}

}
