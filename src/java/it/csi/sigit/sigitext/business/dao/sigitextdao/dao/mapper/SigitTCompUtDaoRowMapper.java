package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTCompUtDao
 * @generated
 */
public class SigitTCompUtDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTCompUtDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTCompUtDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTCompUtDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTCompUtDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTCompUtDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTCompUtDto) {
			return mapRow_internal((SigitTCompUtDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTCompUtDto mapRow_internal(SigitTCompUtDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTCompUtDto dto = objectToFill;

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

		// colonna [PORTATA_MANDATA_LS]
		if (mapAllColumns || columnsToReadMap.get("PORTATA_MANDATA_LS") != null)
			dto.setPortataMandataLs(rs.getBigDecimal("PORTATA_MANDATA_LS"));

		// colonna [PORTATA_RIPRESA_LS]
		if (mapAllColumns || columnsToReadMap.get("PORTATA_RIPRESA_LS") != null)
			dto.setPortataRipresaLs(rs.getBigDecimal("PORTATA_RIPRESA_LS"));

		// colonna [POTENZA_MANDATA_KW]
		if (mapAllColumns || columnsToReadMap.get("POTENZA_MANDATA_KW") != null)
			dto.setPotenzaMandataKw(rs.getBigDecimal("POTENZA_MANDATA_KW"));

		// colonna [POTENZA_RIPRESA_KW]
		if (mapAllColumns || columnsToReadMap.get("POTENZA_RIPRESA_KW") != null)
			dto.setPotenzaRipresaKw(rs.getBigDecimal("POTENZA_RIPRESA_KW"));

		return dto;
	}

}
