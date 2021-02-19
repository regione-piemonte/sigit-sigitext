package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO FluidoCITDao
 * @generated
 */
public class FluidoCITDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	FluidoCITDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public FluidoCITDaoRowMapper(String[] columnsToRead, Class dtoClass, FluidoCITDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (FluidoCITDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return FluidoCITDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof FluidoCITDto) {
			return mapRow_internal((FluidoCITDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public FluidoCITDto mapRow_internal(FluidoCITDto objectToFill, ResultSet rs, int row) throws SQLException {
		FluidoCITDto dto = objectToFill;

		// colonna [ID_FLUIDO]
		if (mapAllColumns || columnsToReadMap.get("ID_FLUIDO") != null)
			dto.setIdFluido(rs.getBigDecimal("ID_FLUIDO"));

		// colonna [DES_FLUIDO]
		if (mapAllColumns || columnsToReadMap.get("DES_FLUIDO") != null)
			dto.setDesFluido(rs.getString("DES_FLUIDO"));

		return dto;
	}

}
