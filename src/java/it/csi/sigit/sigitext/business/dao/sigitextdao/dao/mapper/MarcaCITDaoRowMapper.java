package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO MarcaCITDao
 * @generated
 */
public class MarcaCITDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	MarcaCITDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public MarcaCITDaoRowMapper(String[] columnsToRead, Class dtoClass, MarcaCITDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (MarcaCITDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return MarcaCITDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof MarcaCITDto) {
			return mapRow_internal((MarcaCITDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public MarcaCITDto mapRow_internal(MarcaCITDto objectToFill, ResultSet rs, int row) throws SQLException {
		MarcaCITDto dto = objectToFill;

		// colonna [ID_MARCA]
		if (mapAllColumns || columnsToReadMap.get("ID_MARCA") != null)
			dto.setIdMarca(rs.getBigDecimal("ID_MARCA"));

		// colonna [DES_MARCA]
		if (mapAllColumns || columnsToReadMap.get("DES_MARCA") != null)
			dto.setDesMarca(rs.getString("DES_MARCA"));

		return dto;
	}

}
