package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitWrkLogDao
 * @generated
 */
public class SigitWrkLogDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitWrkLogDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitWrkLogDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitWrkLogDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitWrkLogDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitWrkLogDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitWrkLogDto) {
			return mapRow_internal((SigitWrkLogDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitWrkLogDto mapRow_internal(SigitWrkLogDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitWrkLogDto dto = objectToFill;

		// colonna [CODICE_FISCALE]
		if (mapAllColumns || columnsToReadMap.get("CODICE_FISCALE") != null)
			dto.setCodiceFiscale(rs.getString("CODICE_FISCALE"));

		// colonna [DATA_OPERAZIONE]
		if (mapAllColumns || columnsToReadMap.get("DATA_OPERAZIONE") != null)
			dto.setDataOperazione(rs.getTimestamp("DATA_OPERAZIONE"));

		// colonna [TBL_IMPATTATA]
		if (mapAllColumns || columnsToReadMap.get("TBL_IMPATTATA") != null)
			dto.setTblImpattata(rs.getString("TBL_IMPATTATA"));

		// colonna [ID_RECORD]
		if (mapAllColumns || columnsToReadMap.get("ID_RECORD") != null)
			dto.setIdRecord(rs.getString("ID_RECORD"));

		// colonna [TIPO_OPERAZIONE]
		if (mapAllColumns || columnsToReadMap.get("TIPO_OPERAZIONE") != null)
			dto.setTipoOperazione(rs.getString("TIPO_OPERAZIONE"));

		// colonna [ID_LOG]
		if (mapAllColumns || columnsToReadMap.get("ID_LOG") != null)
			dto.setIdLog((Integer) rs.getObject("ID_LOG"));

		return dto;
	}

}
