package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTCompTeDao
 * @generated
 */
public class SigitTCompTeDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTCompTeDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTCompTeDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTCompTeDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTCompTeDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTCompTeDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTCompTeDto) {
			return mapRow_internal((SigitTCompTeDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTCompTeDto mapRow_internal(SigitTCompTeDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTCompTeDto dto = objectToFill;

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [ID_TIPO_COMPONENTE]
		if (mapAllColumns || columnsToReadMap.get("ID_TIPO_COMPONENTE") != null)
			dto.setIdTipoComponente(rs.getString("ID_TIPO_COMPONENTE"));

		// colonna [PROGRESSIVO]
		if (mapAllColumns || columnsToReadMap.get("PROGRESSIVO") != null)
			dto.setProgressivo(rs.getBigDecimal("PROGRESSIVO"));

		// colonna [DATA_INSTALL]
		if (mapAllColumns || columnsToReadMap.get("DATA_INSTALL") != null)
			dto.setDataInstall(rs.getDate("DATA_INSTALL"));

		// colonna [CAPACITA_L]
		if (mapAllColumns || columnsToReadMap.get("CAPACITA_L") != null)
			dto.setCapacitaL(rs.getBigDecimal("CAPACITA_L"));

		// colonna [NUM_VENTILATORI]
		if (mapAllColumns || columnsToReadMap.get("NUM_VENTILATORI") != null)
			dto.setNumVentilatori(rs.getBigDecimal("NUM_VENTILATORI"));

		// colonna [TIPO_VENTILATORI]
		if (mapAllColumns || columnsToReadMap.get("TIPO_VENTILATORI") != null)
			dto.setTipoVentilatori(rs.getString("TIPO_VENTILATORI"));

		return dto;
	}

}
