package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTCompBrRcDao
 * @generated
 */
public class SigitTCompBrRcDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTCompBrRcDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTCompBrRcDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTCompBrRcDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTCompBrRcDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTCompBrRcDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTCompBrRcDto) {
			return mapRow_internal((SigitTCompBrRcDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTCompBrRcDto mapRow_internal(SigitTCompBrRcDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTCompBrRcDto dto = objectToFill;

		// colonna [ID_COMP_BR_RC]
		if (mapAllColumns || columnsToReadMap.get("ID_COMP_BR_RC") != null)
			dto.setIdCompBrRc(rs.getBigDecimal("ID_COMP_BR_RC"));

		// colonna [TIPOLOGIA_BR_RC]
		if (mapAllColumns || columnsToReadMap.get("TIPOLOGIA_BR_RC") != null)
			dto.setTipologiaBrRc(rs.getString("TIPOLOGIA_BR_RC"));

		// colonna [PROGRESSIVO_BR_RC]
		if (mapAllColumns || columnsToReadMap.get("PROGRESSIVO_BR_RC") != null)
			dto.setProgressivoBrRc(rs.getBigDecimal("PROGRESSIVO_BR_RC"));

		// colonna [FK_TIPO_COMPONENTE]
		if (mapAllColumns || columnsToReadMap.get("FK_TIPO_COMPONENTE") != null)
			dto.setFkTipoComponente(rs.getString("FK_TIPO_COMPONENTE"));

		// colonna [FK_PROGRESSIVO]
		if (mapAllColumns || columnsToReadMap.get("FK_PROGRESSIVO") != null)
			dto.setFkProgressivo(rs.getBigDecimal("FK_PROGRESSIVO"));

		// colonna [FK_DATA_INSTALL]
		if (mapAllColumns || columnsToReadMap.get("FK_DATA_INSTALL") != null)
			dto.setFkDataInstall(rs.getDate("FK_DATA_INSTALL"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [TIPOLOGIA]
		if (mapAllColumns || columnsToReadMap.get("TIPOLOGIA") != null)
			dto.setTipologia(rs.getString("TIPOLOGIA"));

		// colonna [POT_TERM_MAX_KW]
		if (mapAllColumns || columnsToReadMap.get("POT_TERM_MAX_KW") != null)
			dto.setPotTermMaxKw(rs.getBigDecimal("POT_TERM_MAX_KW"));

		// colonna [POT_TERM_MIN_KW]
		if (mapAllColumns || columnsToReadMap.get("POT_TERM_MIN_KW") != null)
			dto.setPotTermMinKw(rs.getBigDecimal("POT_TERM_MIN_KW"));

		// colonna [DATA_INSTALL]
		if (mapAllColumns || columnsToReadMap.get("DATA_INSTALL") != null)
			dto.setDataInstall(rs.getDate("DATA_INSTALL"));

		// colonna [DATA_DISMISS]
		if (mapAllColumns || columnsToReadMap.get("DATA_DISMISS") != null)
			dto.setDataDismiss(rs.getDate("DATA_DISMISS"));

		// colonna [FK_MARCA]
		if (mapAllColumns || columnsToReadMap.get("FK_MARCA") != null)
			dto.setFkMarca(rs.getBigDecimal("FK_MARCA"));

		// colonna [MODELLO]
		if (mapAllColumns || columnsToReadMap.get("MODELLO") != null)
			dto.setModello(rs.getString("MODELLO"));

		// colonna [MATRICOLA]
		if (mapAllColumns || columnsToReadMap.get("MATRICOLA") != null)
			dto.setMatricola(rs.getString("MATRICOLA"));

		// colonna [FK_COMBUSTIBILE]
		if (mapAllColumns || columnsToReadMap.get("FK_COMBUSTIBILE") != null)
			dto.setFkCombustibile(rs.getBigDecimal("FK_COMBUSTIBILE"));

		// colonna [FLG_DISMISSIONE]
		if (mapAllColumns || columnsToReadMap.get("FLG_DISMISSIONE") != null)
			dto.setFlgDismissione(rs.getBigDecimal("FLG_DISMISSIONE"));

		return dto;
	}

}
