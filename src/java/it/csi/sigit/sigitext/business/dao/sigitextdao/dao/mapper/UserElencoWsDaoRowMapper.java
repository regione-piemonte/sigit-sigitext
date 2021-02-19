package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO UserElencoWsDao
 * @generated
 */
public class UserElencoWsDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	UserElencoWsDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public UserElencoWsDaoRowMapper(String[] columnsToRead, Class dtoClass, UserElencoWsDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (UserElencoWsDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return UserElencoWsDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof UserElencoWsDto) {
			return mapRow_internal((UserElencoWsDto) dtoInstance, rs, row);
		}

		if (dtoInstance instanceof UserElencoWsByUtenteFunzionalitaDto) {
			return mapRow_internal((UserElencoWsByUtenteFunzionalitaDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public UserElencoWsDto mapRow_internal(UserElencoWsDto objectToFill, ResultSet rs, int row) throws SQLException {
		UserElencoWsDto dto = objectToFill;

		// colonna [ID_USER_WS]
		if (mapAllColumns || columnsToReadMap.get("ID_USER_WS") != null)
			dto.setIdUserWs((Integer) rs.getObject("ID_USER_WS"));

		// colonna [ID_ELENCO_WS]
		if (mapAllColumns || columnsToReadMap.get("ID_ELENCO_WS") != null)
			dto.setIdElencoWs((Integer) rs.getObject("ID_ELENCO_WS"));

		return dto;
	}

	/**
	 * Metodo specifico di mapping relativo al DTO custom UserElencoWsByUtenteFunzionalitaDto.
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return UserElencoWsByUtenteFunzionalitaDto
	 * @generated
	 */

	public UserElencoWsByUtenteFunzionalitaDto mapRow_internal(UserElencoWsByUtenteFunzionalitaDto objectToFill,
			ResultSet rs, int row) throws SQLException {
		UserElencoWsByUtenteFunzionalitaDto dto = objectToFill;

		if (mapAllColumns || columnsToReadMap.get("ID_USER_WS") != null)
			dto.setUtenteIdUserWs((Integer) rs.getObject("ID_USER_WS"));

		return dto;
	}

}
