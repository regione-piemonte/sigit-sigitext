package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO UnitaMisuraCITDao
 * @generated
 */
public class UnitaMisuraCITDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	UnitaMisuraCITDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public UnitaMisuraCITDaoRowMapper(String[] columnsToRead, Class dtoClass, UnitaMisuraCITDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (UnitaMisuraCITDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return UnitaMisuraCITDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof UnitaMisuraCITDto) {
			return mapRow_internal((UnitaMisuraCITDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public UnitaMisuraCITDto mapRow_internal(UnitaMisuraCITDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		UnitaMisuraCITDto dto = objectToFill;

		// colonna [ID_UNITA_MISURA]
		if (mapAllColumns || columnsToReadMap.get("ID_UNITA_MISURA") != null)
			dto.setIdUnitaMisura(rs.getString("ID_UNITA_MISURA"));

		// colonna [DES_UNITA_MISURA]
		if (mapAllColumns || columnsToReadMap.get("DES_UNITA_MISURA") != null)
			dto.setDesUnitaMisura(rs.getString("DES_UNITA_MISURA"));

		return dto;
	}

}
