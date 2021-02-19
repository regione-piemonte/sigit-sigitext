package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO WrkConfigDao
 * @generated
 */
public class WrkConfigDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	WrkConfigDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public WrkConfigDaoRowMapper(String[] columnsToRead, Class dtoClass, WrkConfigDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (WrkConfigDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return WrkConfigDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof WrkConfigDto) {
			return mapRow_internal((WrkConfigDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public WrkConfigDto mapRow_internal(WrkConfigDto objectToFill, ResultSet rs, int row) throws SQLException {
		WrkConfigDto dto = objectToFill;

		// colonna [ID_CONFIG]
		if (mapAllColumns || columnsToReadMap.get("ID_CONFIG") != null)
			dto.setIdConfig(rs.getBigDecimal("ID_CONFIG"));

		// colonna [CHIAVE_CONFIG]
		if (mapAllColumns || columnsToReadMap.get("CHIAVE_CONFIG") != null)
			dto.setChiaveConfig(rs.getString("CHIAVE_CONFIG"));

		// colonna [VALORE_CONFIG_NUM]
		if (mapAllColumns || columnsToReadMap.get("VALORE_CONFIG_NUM") != null)
			dto.setValoreConfigNum(rs.getBigDecimal("VALORE_CONFIG_NUM"));

		// colonna [VALORE_CONFIG_CHAR]
		if (mapAllColumns || columnsToReadMap.get("VALORE_CONFIG_CHAR") != null)
			dto.setValoreConfigChar(rs.getString("VALORE_CONFIG_CHAR"));

		// colonna [VALORE_FLAG]
		if (mapAllColumns || columnsToReadMap.get("VALORE_FLAG") != null)
			dto.setValoreFlag(rs.getString("VALORE_FLAG"));

		return dto;
	}

}
