package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO PotenzaImpDao
 * @generated
 */
public class PotenzaImpDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	PotenzaImpDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public PotenzaImpDaoRowMapper(String[] columnsToRead, Class dtoClass, PotenzaImpDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (PotenzaImpDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return PotenzaImpDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof PotenzaImpDto) {
			return mapRow_internal((PotenzaImpDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public PotenzaImpDto mapRow_internal(PotenzaImpDto objectToFill, ResultSet rs, int row) throws SQLException {
		PotenzaImpDto dto = objectToFill;

		// colonna [ID_POTENZA]
		if (mapAllColumns || columnsToReadMap.get("ID_POTENZA") != null)
			dto.setIdPotenza(rs.getBigDecimal("ID_POTENZA"));

		// colonna [DES_POTENZA]
		if (mapAllColumns || columnsToReadMap.get("DES_POTENZA") != null)
			dto.setDesPotenza(rs.getString("DES_POTENZA"));

		// colonna [LIMITE_INFERIORE]
		if (mapAllColumns || columnsToReadMap.get("LIMITE_INFERIORE") != null)
			dto.setLimiteInferiore(rs.getBigDecimal("LIMITE_INFERIORE"));

		// colonna [LIMITE_SUPERIORE]
		if (mapAllColumns || columnsToReadMap.get("LIMITE_SUPERIORE") != null)
			dto.setLimiteSuperiore(rs.getBigDecimal("LIMITE_SUPERIORE"));

		return dto;
	}

}
