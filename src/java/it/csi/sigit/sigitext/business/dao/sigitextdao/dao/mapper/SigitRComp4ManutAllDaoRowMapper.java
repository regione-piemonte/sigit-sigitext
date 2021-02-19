package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitRComp4ManutAllDao
 * @generated
 */
public class SigitRComp4ManutAllDaoRowMapper extends BaseDaoRowMapper
		implements
			org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitRComp4ManutAllDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitRComp4ManutAllDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitRComp4ManutAllDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitRComp4ManutAllDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitRComp4ManutAllDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitRComp4ManutAllDto) {
			return mapRow_internal((SigitRComp4ManutAllDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitRComp4ManutAllDto mapRow_internal(SigitRComp4ManutAllDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitRComp4ManutAllDto dto = objectToFill;

		// colonna [ID_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("ID_ALLEGATO") != null)
			dto.setIdAllegato(rs.getBigDecimal("ID_ALLEGATO"));

		// colonna [ID_R_COMP4_MANUT]
		if (mapAllColumns || columnsToReadMap.get("ID_R_COMP4_MANUT") != null)
			dto.setIdRComp4Manut((Integer) rs.getObject("ID_R_COMP4_MANUT"));

		return dto;
	}

}
