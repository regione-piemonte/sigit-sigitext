package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTCompRcDao
 * @generated
 */
public class SigitTCompRcDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTCompRcDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTCompRcDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTCompRcDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTCompRcDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTCompRcDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTCompRcDto) {
			return mapRow_internal((SigitTCompRcDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTCompRcDto mapRow_internal(SigitTCompRcDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTCompRcDto dto = objectToFill;

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

		// colonna [TIPOLOGIA]
		if (mapAllColumns || columnsToReadMap.get("TIPOLOGIA") != null)
			dto.setTipologia(rs.getString("TIPOLOGIA"));

		// colonna [FLG_INSTALLATO]
		if (mapAllColumns || columnsToReadMap.get("FLG_INSTALLATO") != null)
			dto.setFlgInstallato(rs.getBigDecimal("FLG_INSTALLATO"));

		// colonna [FLG_INDIPENDENTE]
		if (mapAllColumns || columnsToReadMap.get("FLG_INDIPENDENTE") != null)
			dto.setFlgIndipendente(rs.getBigDecimal("FLG_INDIPENDENTE"));

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
