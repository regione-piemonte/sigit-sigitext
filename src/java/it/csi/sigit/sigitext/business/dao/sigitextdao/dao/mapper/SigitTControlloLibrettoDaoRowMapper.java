package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTControlloLibrettoDao
 * @generated
 */
public class SigitTControlloLibrettoDaoRowMapper extends BaseDaoRowMapper
		implements
			org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTControlloLibrettoDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTControlloLibrettoDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTControlloLibrettoDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTControlloLibrettoDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTControlloLibrettoDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTControlloLibrettoDto) {
			return mapRow_internal((SigitTControlloLibrettoDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTControlloLibrettoDto mapRow_internal(SigitTControlloLibrettoDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTControlloLibrettoDto dto = objectToFill;

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [FLG_L1_CONTROLLOWEB]
		if (mapAllColumns || columnsToReadMap.get("FLG_L1_CONTROLLOWEB") != null)
			dto.setFlgL1Controlloweb(rs.getBigDecimal("FLG_L1_CONTROLLOWEB"));

		// colonna [FLG_L5_CONTROLLOWEB]
		if (mapAllColumns || columnsToReadMap.get("FLG_L5_CONTROLLOWEB") != null)
			dto.setFlgL5Controlloweb(rs.getBigDecimal("FLG_L5_CONTROLLOWEB"));

		// colonna [FLG_L6_CONTROLLOWEB]
		if (mapAllColumns || columnsToReadMap.get("FLG_L6_CONTROLLOWEB") != null)
			dto.setFlgL6Controlloweb(rs.getBigDecimal("FLG_L6_CONTROLLOWEB"));

		// colonna [FLG_L7_CONTROLLOWEB]
		if (mapAllColumns || columnsToReadMap.get("FLG_L7_CONTROLLOWEB") != null)
			dto.setFlgL7Controlloweb(rs.getBigDecimal("FLG_L7_CONTROLLOWEB"));

		// colonna [DT_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DT_ULT_MOD") != null)
			dto.setDtUltMod(rs.getTimestamp("DT_ULT_MOD"));

		// colonna [UTENTE_ULT_AGG]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_AGG") != null)
			dto.setUtenteUltAgg(rs.getString("UTENTE_ULT_AGG"));

		return dto;
	}

}
