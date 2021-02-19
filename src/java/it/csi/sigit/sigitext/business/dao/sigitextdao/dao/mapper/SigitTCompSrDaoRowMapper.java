package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTCompSrDao
 * @generated
 */
public class SigitTCompSrDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTCompSrDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTCompSrDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTCompSrDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTCompSrDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTCompSrDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTCompSrDto) {
			return mapRow_internal((SigitTCompSrDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTCompSrDto mapRow_internal(SigitTCompSrDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTCompSrDto dto = objectToFill;

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

		// colonna [NUM_PTI_REGOLAZIONE]
		if (mapAllColumns || columnsToReadMap.get("NUM_PTI_REGOLAZIONE") != null)
			dto.setNumPtiRegolazione(rs.getBigDecimal("NUM_PTI_REGOLAZIONE"));

		// colonna [NUM_LIV_TEMP]
		if (mapAllColumns || columnsToReadMap.get("NUM_LIV_TEMP") != null)
			dto.setNumLivTemp(rs.getBigDecimal("NUM_LIV_TEMP"));

		return dto;
	}

}
