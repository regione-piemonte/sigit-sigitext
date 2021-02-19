package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTRappTipo1Dao
 * @generated
 */
public class SigitTRappTipo1DaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTRappTipo1DaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTRappTipo1DaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTRappTipo1Dao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTRappTipo1DaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTRappTipo1Dto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTRappTipo1Dto) {
			return mapRow_internal((SigitTRappTipo1Dto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTRappTipo1Dto mapRow_internal(SigitTRappTipo1Dto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTRappTipo1Dto dto = objectToFill;

		// colonna [ID_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("ID_ALLEGATO") != null)
			dto.setIdAllegato(rs.getBigDecimal("ID_ALLEGATO"));

		// colonna [D_FLG_LOCALE_INT_IDONEO]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_LOCALE_INT_IDONEO") != null)
			dto.setDFlgLocaleIntIdoneo(rs.getBigDecimal("D_FLG_LOCALE_INT_IDONEO"));

		// colonna [D_FLG_GEN_EXT_IDONEO]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_GEN_EXT_IDONEO") != null)
			dto.setDFlgGenExtIdoneo(rs.getBigDecimal("D_FLG_GEN_EXT_IDONEO"));

		// colonna [D_FLG_APERTURE_LIBERE]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_APERTURE_LIBERE") != null)
			dto.setDFlgApertureLibere(rs.getBigDecimal("D_FLG_APERTURE_LIBERE"));

		// colonna [D_FLG_APERTURE_ADEG]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_APERTURE_ADEG") != null)
			dto.setDFlgApertureAdeg(rs.getBigDecimal("D_FLG_APERTURE_ADEG"));

		// colonna [D_FLG_SCARICO_IDONEO]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_SCARICO_IDONEO") != null)
			dto.setDFlgScaricoIdoneo(rs.getBigDecimal("D_FLG_SCARICO_IDONEO"));

		// colonna [D_FLG_TEMP_AMB_FUNZ]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_TEMP_AMB_FUNZ") != null)
			dto.setDFlgTempAmbFunz(rs.getBigDecimal("D_FLG_TEMP_AMB_FUNZ"));

		// colonna [D_FLG_ASSENZA_PERD_COMB]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_ASSENZA_PERD_COMB") != null)
			dto.setDFlgAssenzaPerdComb(rs.getBigDecimal("D_FLG_ASSENZA_PERD_COMB"));

		// colonna [D_FLG_IDO_TEN_IMP_INT]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_IDO_TEN_IMP_INT") != null)
			dto.setDFlgIdoTenImpInt(rs.getBigDecimal("D_FLG_IDO_TEN_IMP_INT"));

		// colonna [F_FLG_ADOZIONE_VALVOLE_TERM]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_ADOZIONE_VALVOLE_TERM") != null)
			dto.setFFlgAdozioneValvoleTerm(rs.getBigDecimal("F_FLG_ADOZIONE_VALVOLE_TERM"));

		// colonna [F_FLG_ISOLAMENTE_RETE]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_ISOLAMENTE_RETE") != null)
			dto.setFFlgIsolamenteRete(rs.getBigDecimal("F_FLG_ISOLAMENTE_RETE"));

		// colonna [F_FLG_ADOZ_SIST_TRATTAM_H2O]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_ADOZ_SIST_TRATTAM_H2O") != null)
			dto.setFFlgAdozSistTrattamH2o(rs.getBigDecimal("F_FLG_ADOZ_SIST_TRATTAM_H2O"));

		// colonna [F_FLG_SOSTITUZ_SIST_REGOLAZ]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_SOSTITUZ_SIST_REGOLAZ") != null)
			dto.setFFlgSostituzSistRegolaz(rs.getBigDecimal("F_FLG_SOSTITUZ_SIST_REGOLAZ"));

		// colonna [C_FLG_TRATT_CLIMA_NON_RICH]
		if (mapAllColumns || columnsToReadMap.get("C_FLG_TRATT_CLIMA_NON_RICH") != null)
			dto.setCFlgTrattClimaNonRich(rs.getBigDecimal("C_FLG_TRATT_CLIMA_NON_RICH"));

		// colonna [C_FLG_TRATT_ACS_NON_RICHIESTO]
		if (mapAllColumns || columnsToReadMap.get("C_FLG_TRATT_ACS_NON_RICHIESTO") != null)
			dto.setCFlgTrattAcsNonRichiesto(rs.getBigDecimal("C_FLG_TRATT_ACS_NON_RICHIESTO"));

		return dto;
	}

}
