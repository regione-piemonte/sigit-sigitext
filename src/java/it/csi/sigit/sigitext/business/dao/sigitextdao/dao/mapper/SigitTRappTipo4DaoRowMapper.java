package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTRappTipo4Dao
 * @generated
 */
public class SigitTRappTipo4DaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTRappTipo4DaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTRappTipo4DaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTRappTipo4Dao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTRappTipo4DaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTRappTipo4Dto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTRappTipo4Dto) {
			return mapRow_internal((SigitTRappTipo4Dto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTRappTipo4Dto mapRow_internal(SigitTRappTipo4Dto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTRappTipo4Dto dto = objectToFill;

		// colonna [ID_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("ID_ALLEGATO") != null)
			dto.setIdAllegato(rs.getBigDecimal("ID_ALLEGATO"));

		// colonna [D_FLG_LUOGO_IDONEO]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_LUOGO_IDONEO") != null)
			dto.setDFlgLuogoIdoneo(rs.getBigDecimal("D_FLG_LUOGO_IDONEO"));

		// colonna [D_FLG_VENTILAZ_ADEG]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_VENTILAZ_ADEG") != null)
			dto.setDFlgVentilazAdeg(rs.getBigDecimal("D_FLG_VENTILAZ_ADEG"));

		// colonna [D_FLG_VENTILAZ_LIBERA]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_VENTILAZ_LIBERA") != null)
			dto.setDFlgVentilazLibera(rs.getBigDecimal("D_FLG_VENTILAZ_LIBERA"));

		// colonna [D_FLG_LINEA_ELETT_IDONEA]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_LINEA_ELETT_IDONEA") != null)
			dto.setDFlgLineaElettIdonea(rs.getBigDecimal("D_FLG_LINEA_ELETT_IDONEA"));

		// colonna [D_FLG_CAMINO_IDONEO]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_CAMINO_IDONEO") != null)
			dto.setDFlgCaminoIdoneo(rs.getBigDecimal("D_FLG_CAMINO_IDONEO"));

		// colonna [D_FLG_CAPSULA_IDONEA]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_CAPSULA_IDONEA") != null)
			dto.setDFlgCapsulaIdonea(rs.getBigDecimal("D_FLG_CAPSULA_IDONEA"));

		// colonna [D_FLG_CIRC_IDR_IDONEO]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_CIRC_IDR_IDONEO") != null)
			dto.setDFlgCircIdrIdoneo(rs.getBigDecimal("D_FLG_CIRC_IDR_IDONEO"));

		// colonna [D_FLG_CIRC_OLIO_IDONEO]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_CIRC_OLIO_IDONEO") != null)
			dto.setDFlgCircOlioIdoneo(rs.getBigDecimal("D_FLG_CIRC_OLIO_IDONEO"));

		// colonna [D_FLG_CIRC_COMB_IDONEO]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_CIRC_COMB_IDONEO") != null)
			dto.setDFlgCircCombIdoneo(rs.getBigDecimal("D_FLG_CIRC_COMB_IDONEO"));

		// colonna [D_FLG_FUNZ_SCAMB_IDONEA]
		if (mapAllColumns || columnsToReadMap.get("D_FLG_FUNZ_SCAMB_IDONEA") != null)
			dto.setDFlgFunzScambIdonea(rs.getBigDecimal("D_FLG_FUNZ_SCAMB_IDONEA"));

		// colonna [F_FLG_ADOZIONE_VALVOLE]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_ADOZIONE_VALVOLE") != null)
			dto.setFFlgAdozioneValvole(rs.getBigDecimal("F_FLG_ADOZIONE_VALVOLE"));

		// colonna [F_FLG_ISOLAMENTO_RETE]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_ISOLAMENTO_RETE") != null)
			dto.setFFlgIsolamentoRete(rs.getBigDecimal("F_FLG_ISOLAMENTO_RETE"));

		// colonna [F_FLG_SISTEMA_TRATT_H2O]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_SISTEMA_TRATT_H2O") != null)
			dto.setFFlgSistemaTrattH2o(rs.getBigDecimal("F_FLG_SISTEMA_TRATT_H2O"));

		// colonna [F_FLG_SOST_SISTEMA_REGOLAZ]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_SOST_SISTEMA_REGOLAZ") != null)
			dto.setFFlgSostSistemaRegolaz(rs.getBigDecimal("F_FLG_SOST_SISTEMA_REGOLAZ"));

		// colonna [C_FLG_TRATT_CLIMA_NON_RICHIEST]
		if (mapAllColumns || columnsToReadMap.get("C_FLG_TRATT_CLIMA_NON_RICHIEST") != null)
			dto.setCFlgTrattClimaNonRichiest(rs.getBigDecimal("C_FLG_TRATT_CLIMA_NON_RICHIEST"));

		return dto;
	}

}
