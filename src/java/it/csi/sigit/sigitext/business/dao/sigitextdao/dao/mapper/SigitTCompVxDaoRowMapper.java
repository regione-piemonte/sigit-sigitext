package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTCompVxDao
 * @generated
 */
public class SigitTCompVxDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTCompVxDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTCompVxDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTCompVxDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTCompVxDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTCompVxDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTCompVxDto) {
			return mapRow_internal((SigitTCompVxDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTCompVxDto mapRow_internal(SigitTCompVxDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTCompVxDto dto = objectToFill;

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

		// colonna [FLG_VASO]
		if (mapAllColumns || columnsToReadMap.get("FLG_VASO") != null)
			dto.setFlgVaso(rs.getString("FLG_VASO"));

		// colonna [PRESSIONE_BAR]
		if (mapAllColumns || columnsToReadMap.get("PRESSIONE_BAR") != null)
			dto.setPressioneBar(rs.getBigDecimal("PRESSIONE_BAR"));

		return dto;
	}

}
