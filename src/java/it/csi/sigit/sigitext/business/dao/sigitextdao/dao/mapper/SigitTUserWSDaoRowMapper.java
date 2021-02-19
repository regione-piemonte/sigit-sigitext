package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTUserWSDao
 * @generated
 */
public class SigitTUserWSDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTUserWSDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTUserWSDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTUserWSDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTUserWSDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTUserWSDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTUserWSDto) {
			return mapRow_internal((SigitTUserWSDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTUserWSDto mapRow_internal(SigitTUserWSDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTUserWSDto dto = objectToFill;

		// colonna [ID_USER_WS]
		if (mapAllColumns || columnsToReadMap.get("ID_USER_WS") != null)
			dto.setIdUserWs((Integer) rs.getObject("ID_USER_WS"));

		// colonna [USER_WS]
		if (mapAllColumns || columnsToReadMap.get("USER_WS") != null)
			dto.setUserWs(rs.getString("USER_WS"));

		// colonna [PWD_WS]
		if (mapAllColumns || columnsToReadMap.get("PWD_WS") != null)
			dto.setPwdWs(rs.getString("PWD_WS"));

		// colonna [DT_CREAZIONE_TOKEN]
		if (mapAllColumns || columnsToReadMap.get("DT_CREAZIONE_TOKEN") != null)
			dto.setDtCreazioneToken(rs.getDate("DT_CREAZIONE_TOKEN"));

		// colonna [DT_SCADENZA_TOKEN]
		if (mapAllColumns || columnsToReadMap.get("DT_SCADENZA_TOKEN") != null)
			dto.setDtScadenzaToken(rs.getDate("DT_SCADENZA_TOKEN"));

		// colonna [TOKEN]
		if (mapAllColumns || columnsToReadMap.get("TOKEN") != null)
			dto.setToken(rs.getString("TOKEN"));

		return dto;
	}

}
