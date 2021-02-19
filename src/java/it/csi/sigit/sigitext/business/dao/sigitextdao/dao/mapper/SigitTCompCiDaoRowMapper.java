package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTCompCiDao
 * @generated
 */
public class SigitTCompCiDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTCompCiDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTCompCiDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTCompCiDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTCompCiDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTCompCiDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTCompCiDto) {
			return mapRow_internal((SigitTCompCiDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTCompCiDto mapRow_internal(SigitTCompCiDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTCompCiDto dto = objectToFill;

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

		// colonna [LUNGHEZZA_CIRC_M]
		if (mapAllColumns || columnsToReadMap.get("LUNGHEZZA_CIRC_M") != null)
			dto.setLunghezzaCircM(rs.getBigDecimal("LUNGHEZZA_CIRC_M"));

		// colonna [SUPERF_SCAMB_M2]
		if (mapAllColumns || columnsToReadMap.get("SUPERF_SCAMB_M2") != null)
			dto.setSuperfScambM2(rs.getBigDecimal("SUPERF_SCAMB_M2"));

		// colonna [PROF_INSTALL_M]
		if (mapAllColumns || columnsToReadMap.get("PROF_INSTALL_M") != null)
			dto.setProfInstallM(rs.getBigDecimal("PROF_INSTALL_M"));

		return dto;
	}

}
