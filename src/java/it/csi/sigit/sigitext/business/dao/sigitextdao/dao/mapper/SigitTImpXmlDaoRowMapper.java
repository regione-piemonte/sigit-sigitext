package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTImpXmlDao
 * @generated
 */
public class SigitTImpXmlDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTImpXmlDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTImpXmlDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTImpXmlDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTImpXmlDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTImpXmlDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTImpXmlDto) {
			return mapRow_internal((SigitTImpXmlDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTImpXmlDto mapRow_internal(SigitTImpXmlDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTImpXmlDto dto = objectToFill;

		// colonna [ID_IMPORT]
		if (mapAllColumns || columnsToReadMap.get("ID_IMPORT") != null)
			dto.setIdImport((Integer) rs.getObject("ID_IMPORT"));

		// colonna [FILE_IMPORT]
		if (mapAllColumns || columnsToReadMap.get("FILE_IMPORT") != null)
			dto.setFileImport(rs.getString("FILE_IMPORT"));

		return dto;
	}

}
