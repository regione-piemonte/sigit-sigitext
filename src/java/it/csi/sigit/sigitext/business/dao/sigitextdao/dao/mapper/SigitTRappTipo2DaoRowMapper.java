package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTRappTipo2Dao
 * @generated
 */
public class SigitTRappTipo2DaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTRappTipo2DaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTRappTipo2DaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTRappTipo2Dao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTRappTipo2DaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTRappTipo2Dto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTRappTipo2Dto) {
			return mapRow_internal((SigitTRappTipo2Dto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTRappTipo2Dto mapRow_internal(SigitTRappTipo2Dto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTRappTipo2Dto dto = objectToFill;

		// colonna [ID_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("ID_ALLEGATO") != null)
			dto.setIdAllegato(rs.getBigDecimal("ID_ALLEGATO"));

		// colonna [D_FLG_LOCALE_IDONEO]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_LOCALE_IDONEO") != null)
			dto.setDFlgLocaleIdoneo(rs.getBigDecimal("D_FLG_LOCALE_IDONEO"));

		// colonna [D_FLG_APERTURE_LIBERE]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_APERTURE_LIBERE") != null)
			dto.setDFlgApertureLibere(rs.getBigDecimal("D_FLG_APERTURE_LIBERE"));

		// colonna [D_FLG_APERTURE_ADEG]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_APERTURE_ADEG") != null)
			dto.setDFlgApertureAdeg(rs.getBigDecimal("D_FLG_APERTURE_ADEG"));

		// colonna [D_FLG_LINEA_ELETT_IDONEA]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_LINEA_ELETT_IDONEA") != null)
			dto.setDFlgLineaElettIdonea(rs.getBigDecimal("D_FLG_LINEA_ELETT_IDONEA"));

		// colonna [F_FLG_SOSTITUZ_GENERATORI]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_SOSTITUZ_GENERATORI") != null)
			dto.setFFlgSostituzGeneratori(rs.getBigDecimal("F_FLG_SOSTITUZ_GENERATORI"));

		// colonna [F_FLG_SOSTITUZ_SISTEMI_REG]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_SOSTITUZ_SISTEMI_REG") != null)
			dto.setFFlgSostituzSistemiReg(rs.getBigDecimal("F_FLG_SOSTITUZ_SISTEMI_REG"));

		// colonna [F_FLG_ISOL_DISTRIBUZ_H2O]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_ISOL_DISTRIBUZ_H2O") != null)
			dto.setFFlgIsolDistribuzH2o(rs.getBigDecimal("F_FLG_ISOL_DISTRIBUZ_H2O"));

		// colonna [F_FLG_ISOL_DISTRIBUZ_ARIA]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_ISOL_DISTRIBUZ_ARIA") != null)
			dto.setFFlgIsolDistribuzAria(rs.getBigDecimal("F_FLG_ISOL_DISTRIBUZ_ARIA"));

		// colonna [C_FLG_TRATT_CLIMA_NON_RICHIEST]
		if (mapAllColumns || columnsToReadMap.get("C_FLG_TRATT_CLIMA_NON_RICHIEST") != null)
			dto.setCFlgTrattClimaNonRichiest(rs.getBigDecimal("C_FLG_TRATT_CLIMA_NON_RICHIEST"));

		// colonna [D_FLG_COIB_IDONEA]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_COIB_IDONEA") != null)
			dto.setDFlgCoibIdonea(rs.getBigDecimal("D_FLG_COIB_IDONEA"));

		return dto;
	}

}
