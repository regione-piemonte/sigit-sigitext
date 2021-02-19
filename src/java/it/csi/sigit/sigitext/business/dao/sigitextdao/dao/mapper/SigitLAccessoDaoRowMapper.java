package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitLAccessoDao
 * @generated
 */
public class SigitLAccessoDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitLAccessoDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitLAccessoDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitLAccessoDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitLAccessoDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitLAccessoDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitLAccessoDto) {
			return mapRow_internal((SigitLAccessoDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitLAccessoDto mapRow_internal(SigitLAccessoDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitLAccessoDto dto = objectToFill;

		// colonna [DT_ACCESSO]
		if (mapAllColumns || columnsToReadMap.get("DT_ACCESSO") != null)
			dto.setDtAccesso(rs.getTimestamp("DT_ACCESSO"));

		// colonna [CODICE_FISCALE]
		if (mapAllColumns || columnsToReadMap.get("CODICE_FISCALE") != null)
			dto.setCodiceFiscale(rs.getString("CODICE_FISCALE"));

		// colonna [NOME]
		if (mapAllColumns || columnsToReadMap.get("NOME") != null)
			dto.setNome(rs.getString("NOME"));

		// colonna [COGNOME]
		if (mapAllColumns || columnsToReadMap.get("COGNOME") != null)
			dto.setCognome(rs.getString("COGNOME"));

		// colonna [RUOLO]
		if (mapAllColumns || columnsToReadMap.get("RUOLO") != null)
			dto.setRuolo(rs.getString("RUOLO"));

		return dto;
	}

}
