package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTPreImportDao
 * @generated
 */
public class SigitTPreImportDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTPreImportDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTPreImportDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTPreImportDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTPreImportDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTPreImportDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTPreImportDto) {
			return mapRow_internal((SigitTPreImportDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTPreImportDto mapRow_internal(SigitTPreImportDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTPreImportDto dto = objectToFill;

		// colonna [ID_PRE_IMPORT]
		if (mapAllColumns || columnsToReadMap.get("ID_PRE_IMPORT") != null)
			dto.setIdPreImport((Integer) rs.getObject("ID_PRE_IMPORT"));

		// colonna [N_FILE]
		if (mapAllColumns || columnsToReadMap.get("N_FILE") != null)
			dto.setNFile((Integer) rs.getObject("N_FILE"));

		// colonna [MSG]
		if (mapAllColumns || columnsToReadMap.get("MSG") != null)
			dto.setMsg(rs.getString("MSG"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [ID_PERSONA_FISICA]
		if (mapAllColumns || columnsToReadMap.get("ID_PERSONA_FISICA") != null)
			dto.setIdPersonaFisica(rs.getBigDecimal("ID_PERSONA_FISICA"));

		return dto;
	}

}
