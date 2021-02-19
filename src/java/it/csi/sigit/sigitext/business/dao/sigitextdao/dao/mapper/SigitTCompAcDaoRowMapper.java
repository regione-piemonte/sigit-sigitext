package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTCompAcDao
 * @generated
 */
public class SigitTCompAcDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTCompAcDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTCompAcDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTCompAcDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTCompAcDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTCompAcDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTCompAcDto) {
			return mapRow_internal((SigitTCompAcDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTCompAcDto mapRow_internal(SigitTCompAcDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTCompAcDto dto = objectToFill;

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

		// colonna [CAPACITA]
		if (mapAllColumns || columnsToReadMap.get("CAPACITA") != null)
			dto.setCapacita(rs.getBigDecimal("CAPACITA"));

		// colonna [FLG_ACS]
		if (mapAllColumns || columnsToReadMap.get("FLG_ACS") != null)
			dto.setFlgAcs(rs.getBigDecimal("FLG_ACS"));

		// colonna [FLG_RISC]
		if (mapAllColumns || columnsToReadMap.get("FLG_RISC") != null)
			dto.setFlgRisc(rs.getBigDecimal("FLG_RISC"));

		// colonna [FLG_RAFF]
		if (mapAllColumns || columnsToReadMap.get("FLG_RAFF") != null)
			dto.setFlgRaff(rs.getBigDecimal("FLG_RAFF"));

		// colonna [FLG_COIB]
		if (mapAllColumns || columnsToReadMap.get("FLG_COIB") != null)
			dto.setFlgCoib(rs.getString("FLG_COIB"));

		return dto;
	}

}
