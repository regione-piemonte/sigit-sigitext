package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO CombustibileCITDao
 * @generated
 */
public class CombustibileCITDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	CombustibileCITDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public CombustibileCITDaoRowMapper(String[] columnsToRead, Class dtoClass, CombustibileCITDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (CombustibileCITDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return CombustibileCITDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof CombustibileCITDto) {
			return mapRow_internal((CombustibileCITDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public CombustibileCITDto mapRow_internal(CombustibileCITDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		CombustibileCITDto dto = objectToFill;

		// colonna [ID_COMBUSTIBILE]
		if (mapAllColumns || columnsToReadMap.get("ID_COMBUSTIBILE") != null)
			dto.setIdCombustibile(rs.getBigDecimal("ID_COMBUSTIBILE"));

		// colonna [DES_COMBUSTIBILE]
		if (mapAllColumns || columnsToReadMap.get("DES_COMBUSTIBILE") != null)
			dto.setDesCombustibile(rs.getString("DES_COMBUSTIBILE"));

		return dto;
	}

}
