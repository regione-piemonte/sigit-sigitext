package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTCompPoDao
 * @generated
 */
public class SigitTCompPoDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTCompPoDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTCompPoDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTCompPoDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTCompPoDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTCompPoDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTCompPoDto) {
			return mapRow_internal((SigitTCompPoDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTCompPoDto mapRow_internal(SigitTCompPoDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTCompPoDto dto = objectToFill;

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

		// colonna [FLG_GIRI_VARIABILI]
		if (mapAllColumns || columnsToReadMap.get("FLG_GIRI_VARIABILI") != null)
			dto.setFlgGiriVariabili(rs.getBigDecimal("FLG_GIRI_VARIABILI"));

		// colonna [POT_NOMINALE_KW]
		if (mapAllColumns || columnsToReadMap.get("POT_NOMINALE_KW") != null)
			dto.setPotNominaleKw(rs.getBigDecimal("POT_NOMINALE_KW"));

		return dto;
	}

}
