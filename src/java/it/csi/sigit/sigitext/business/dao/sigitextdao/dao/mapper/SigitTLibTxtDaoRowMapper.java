package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTLibTxtDao
 * @generated
 */
public class SigitTLibTxtDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTLibTxtDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTLibTxtDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTLibTxtDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTLibTxtDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTLibTxtDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTLibTxtDto) {
			return mapRow_internal((SigitTLibTxtDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTLibTxtDto mapRow_internal(SigitTLibTxtDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTLibTxtDto dto = objectToFill;

		// colonna [ID_LIBRETTO]
		if (mapAllColumns || columnsToReadMap.get("ID_LIBRETTO") != null)
			dto.setIdLibretto(rs.getBigDecimal("ID_LIBRETTO"));

		// colonna [XML_LIBRETTO]
		if (mapAllColumns || columnsToReadMap.get("XML_LIBRETTO") != null)
			dto.setXmlLibretto(rs.getString("XML_LIBRETTO"));

		return dto;
	}

}
