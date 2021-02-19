package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTCompVmDao
 * @generated
 */
public class SigitTCompVmDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTCompVmDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTCompVmDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTCompVmDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTCompVmDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTCompVmDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTCompVmDto) {
			return mapRow_internal((SigitTCompVmDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTCompVmDto mapRow_internal(SigitTCompVmDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTCompVmDto dto = objectToFill;

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

		// colonna [FK_DETTAGLIO_VM]
		if (mapAllColumns || columnsToReadMap.get("FK_DETTAGLIO_VM") != null)
			dto.setFkDettaglioVm(rs.getBigDecimal("FK_DETTAGLIO_VM"));

		// colonna [ALTRO_TIPOLOGIA]
		if (mapAllColumns || columnsToReadMap.get("ALTRO_TIPOLOGIA") != null)
			dto.setAltroTipologia(rs.getString("ALTRO_TIPOLOGIA"));

		// colonna [PORTATA_MAX_ARIA_M3H]
		if (mapAllColumns || columnsToReadMap.get("PORTATA_MAX_ARIA_M3H") != null)
			dto.setPortataMaxAriaM3h(rs.getBigDecimal("PORTATA_MAX_ARIA_M3H"));

		// colonna [RENDIMENTO_COP]
		if (mapAllColumns || columnsToReadMap.get("RENDIMENTO_COP") != null)
			dto.setRendimentoCop(rs.getString("RENDIMENTO_COP"));

		return dto;
	}

}
