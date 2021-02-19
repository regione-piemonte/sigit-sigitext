package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTRappTipo3Dao
 * @generated
 */
public class SigitTRappTipo3DaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTRappTipo3DaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTRappTipo3DaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTRappTipo3Dao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTRappTipo3DaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTRappTipo3Dto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTRappTipo3Dto) {
			return mapRow_internal((SigitTRappTipo3Dto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTRappTipo3Dto mapRow_internal(SigitTRappTipo3Dto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTRappTipo3Dto dto = objectToFill;

		// colonna [ID_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("ID_ALLEGATO") != null)
			dto.setIdAllegato(rs.getBigDecimal("ID_ALLEGATO"));

		// colonna [D_FLG_LOCALE_IDONEO]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_LOCALE_IDONEO") != null)
			dto.setDFlgLocaleIdoneo(rs.getBigDecimal("D_FLG_LOCALE_IDONEO"));

		// colonna [D_FLG_LINEA_ELETT_IDONEA]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_LINEA_ELETT_IDONEA") != null)
			dto.setDFlgLineaElettIdonea(rs.getBigDecimal("D_FLG_LINEA_ELETT_IDONEA"));

		// colonna [D_FLG_COIB_IDONEA]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_COIB_IDONEA") != null)
			dto.setDFlgCoibIdonea(rs.getBigDecimal("D_FLG_COIB_IDONEA"));

		// colonna [D_FLG_ASSENZA_PERDITE]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_ASSENZA_PERDITE") != null)
			dto.setDFlgAssenzaPerdite(rs.getBigDecimal("D_FLG_ASSENZA_PERDITE"));

		// colonna [F_FLG_VALVOLE_TERMOST]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_VALVOLE_TERMOST") != null)
			dto.setFFlgValvoleTermost(rs.getBigDecimal("F_FLG_VALVOLE_TERMOST"));

		// colonna [F_FLG_VERIFICA_PARAM]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_VERIFICA_PARAM") != null)
			dto.setFFlgVerificaParam(rs.getBigDecimal("F_FLG_VERIFICA_PARAM"));

		// colonna [F_FLG_PERDITE_H2O]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_PERDITE_H2O") != null)
			dto.setFFlgPerditeH2o(rs.getBigDecimal("F_FLG_PERDITE_H2O"));

		// colonna [F_FLG_INSTALL_INVOLUCRO]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_INSTALL_INVOLUCRO") != null)
			dto.setFFlgInstallInvolucro(rs.getBigDecimal("F_FLG_INSTALL_INVOLUCRO"));

		// colonna [C_FLG_TRATT_CLIMA_NON_RICHIEST]
		if (mapAllColumns || columnsToReadMap.get("C_FLG_TRATT_CLIMA_NON_RICHIEST") != null)
			dto.setCFlgTrattClimaNonRichiest(rs.getBigDecimal("C_FLG_TRATT_CLIMA_NON_RICHIEST"));

		// colonna [C_FLG_TRATT_ACS_NON_RICHIESTO]
		if (mapAllColumns || columnsToReadMap.get("C_FLG_TRATT_ACS_NON_RICHIESTO") != null)
			dto.setCFlgTrattAcsNonRichiesto(rs.getBigDecimal("C_FLG_TRATT_ACS_NON_RICHIESTO"));

		return dto;
	}

}
