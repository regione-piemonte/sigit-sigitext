package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTElencoWsDao
 * @generated
 */
public class SigitTElencoWsDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTElencoWsDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTElencoWsDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTElencoWsDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTElencoWsDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTElencoWsDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTElencoWsDto) {
			return mapRow_internal((SigitTElencoWsDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTElencoWsDto mapRow_internal(SigitTElencoWsDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTElencoWsDto dto = objectToFill;

		// colonna [ID_ELENCO_WS]
		if (mapAllColumns || columnsToReadMap.get("ID_ELENCO_WS") != null)
			dto.setIdElencoWs((Integer) rs.getObject("ID_ELENCO_WS"));

		// colonna [DESCRIZIONE_WS]
		if (mapAllColumns || columnsToReadMap.get("DESCRIZIONE_WS") != null)
			dto.setDescrizioneWs(rs.getString("DESCRIZIONE_WS"));

		return dto;
	}

}
