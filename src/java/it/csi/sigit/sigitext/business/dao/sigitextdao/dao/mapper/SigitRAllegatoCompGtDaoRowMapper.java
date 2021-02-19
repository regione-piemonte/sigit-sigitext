package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitRAllegatoCompGtDao
 * @generated
 */
public class SigitRAllegatoCompGtDaoRowMapper extends BaseDaoRowMapper
		implements
			org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitRAllegatoCompGtDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitRAllegatoCompGtDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitRAllegatoCompGtDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitRAllegatoCompGtDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitRAllegatoCompGtDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitRAllegatoCompGtDto) {
			return mapRow_internal((SigitRAllegatoCompGtDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitRAllegatoCompGtDto mapRow_internal(SigitRAllegatoCompGtDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitRAllegatoCompGtDto dto = objectToFill;

		// colonna [ID_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("ID_ALLEGATO") != null)
			dto.setIdAllegato(rs.getBigDecimal("ID_ALLEGATO"));

		// colonna [ID_TIPO_COMPONENTE]
		if (mapAllColumns || columnsToReadMap.get("ID_TIPO_COMPONENTE") != null)
			dto.setIdTipoComponente(rs.getString("ID_TIPO_COMPONENTE"));

		// colonna [PROGRESSIVO]
		if (mapAllColumns || columnsToReadMap.get("PROGRESSIVO") != null)
			dto.setProgressivo(rs.getBigDecimal("PROGRESSIVO"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [DATA_INSTALL]
		if (mapAllColumns || columnsToReadMap.get("DATA_INSTALL") != null)
			dto.setDataInstall(rs.getDate("DATA_INSTALL"));

		// colonna [FK_IMP_RUOLO_PFPG]
		if (mapAllColumns || columnsToReadMap.get("FK_IMP_RUOLO_PFPG") != null)
			dto.setFkImpRuoloPfpg(rs.getBigDecimal("FK_IMP_RUOLO_PFPG"));

		// colonna [FK_CONTRATTO]
		if (mapAllColumns || columnsToReadMap.get("FK_CONTRATTO") != null)
			dto.setFkContratto(rs.getBigDecimal("FK_CONTRATTO"));

		return dto;
	}

}
