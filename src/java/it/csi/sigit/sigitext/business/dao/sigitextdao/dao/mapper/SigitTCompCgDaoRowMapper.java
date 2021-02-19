package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTCompCgDao
 * @generated
 */
public class SigitTCompCgDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTCompCgDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTCompCgDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTCompCgDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTCompCgDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTCompCgDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTCompCgDto) {
			return mapRow_internal((SigitTCompCgDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTCompCgDto mapRow_internal(SigitTCompCgDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTCompCgDto dto = objectToFill;

		// colonna [ID_TIPO_COMPONENTE]
		if (mapAllColumns || columnsToReadMap.get("ID_TIPO_COMPONENTE") != null)
			dto.setIdTipoComponente(rs.getString("ID_TIPO_COMPONENTE"));

		// colonna [PROGRESSIVO]
		if (mapAllColumns || columnsToReadMap.get("PROGRESSIVO") != null)
			dto.setProgressivo(rs.getBigDecimal("PROGRESSIVO"));

		// colonna [DATA_INSTALL]
		if (mapAllColumns || columnsToReadMap.get("DATA_INSTALL") != null)
			dto.setDataInstall(rs.getDate("DATA_INSTALL"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [TIPOLOGIA]
		if (mapAllColumns || columnsToReadMap.get("TIPOLOGIA") != null)
			dto.setTipologia(rs.getString("TIPOLOGIA"));

		// colonna [POTENZA_ELETTRICA_KW]
		if (mapAllColumns || columnsToReadMap.get("POTENZA_ELETTRICA_KW") != null)
			dto.setPotenzaElettricaKw(rs.getBigDecimal("POTENZA_ELETTRICA_KW"));

		// colonna [TEMP_H2O_OUT_MIN]
		if (mapAllColumns || columnsToReadMap.get("TEMP_H2O_OUT_MIN") != null)
			dto.setTempH2oOutMin(rs.getBigDecimal("TEMP_H2O_OUT_MIN"));

		// colonna [TEMP_H2O_OUT_MAX]
		if (mapAllColumns || columnsToReadMap.get("TEMP_H2O_OUT_MAX") != null)
			dto.setTempH2oOutMax(rs.getBigDecimal("TEMP_H2O_OUT_MAX"));

		// colonna [TEMP_H2O_IN_MIN]
		if (mapAllColumns || columnsToReadMap.get("TEMP_H2O_IN_MIN") != null)
			dto.setTempH2oInMin(rs.getBigDecimal("TEMP_H2O_IN_MIN"));

		// colonna [TEMP_H2O_IN_MAX]
		if (mapAllColumns || columnsToReadMap.get("TEMP_H2O_IN_MAX") != null)
			dto.setTempH2oInMax(rs.getBigDecimal("TEMP_H2O_IN_MAX"));

		// colonna [TEMP_H2O_MOTORE_MIN]
		if (mapAllColumns || columnsToReadMap.get("TEMP_H2O_MOTORE_MIN") != null)
			dto.setTempH2oMotoreMin(rs.getBigDecimal("TEMP_H2O_MOTORE_MIN"));

		// colonna [TEMP_H2O_MOTORE_MAX]
		if (mapAllColumns || columnsToReadMap.get("TEMP_H2O_MOTORE_MAX") != null)
			dto.setTempH2oMotoreMax(rs.getBigDecimal("TEMP_H2O_MOTORE_MAX"));

		// colonna [TEMP_FUMI_VALLE_MIN]
		if (mapAllColumns || columnsToReadMap.get("TEMP_FUMI_VALLE_MIN") != null)
			dto.setTempFumiValleMin(rs.getBigDecimal("TEMP_FUMI_VALLE_MIN"));

		// colonna [TEMP_FUMI_VALLE_MAX]
		if (mapAllColumns || columnsToReadMap.get("TEMP_FUMI_VALLE_MAX") != null)
			dto.setTempFumiValleMax(rs.getBigDecimal("TEMP_FUMI_VALLE_MAX"));

		// colonna [TEMP_FUMI_MONTE_MIN]
		if (mapAllColumns || columnsToReadMap.get("TEMP_FUMI_MONTE_MIN") != null)
			dto.setTempFumiMonteMin(rs.getBigDecimal("TEMP_FUMI_MONTE_MIN"));

		// colonna [TEMP_FUMI_MONTE_MAX]
		if (mapAllColumns || columnsToReadMap.get("TEMP_FUMI_MONTE_MAX") != null)
			dto.setTempFumiMonteMax(rs.getBigDecimal("TEMP_FUMI_MONTE_MAX"));

		// colonna [CO_MIN]
		if (mapAllColumns || columnsToReadMap.get("CO_MIN") != null)
			dto.setCoMin(rs.getBigDecimal("CO_MIN"));

		// colonna [CO_MAX]
		if (mapAllColumns || columnsToReadMap.get("CO_MAX") != null)
			dto.setCoMax(rs.getBigDecimal("CO_MAX"));

		// colonna [DATA_DISMISS]
		if (mapAllColumns || columnsToReadMap.get("DATA_DISMISS") != null)
			dto.setDataDismiss(rs.getDate("DATA_DISMISS"));

		// colonna [FLG_DISMISSIONE]
		if (mapAllColumns || columnsToReadMap.get("FLG_DISMISSIONE") != null)
			dto.setFlgDismissione(rs.getBigDecimal("FLG_DISMISSIONE"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [FK_MARCA]
		if (mapAllColumns || columnsToReadMap.get("FK_MARCA") != null)
			dto.setFkMarca(rs.getBigDecimal("FK_MARCA"));

		// colonna [FK_COMBUSTIBILE]
		if (mapAllColumns || columnsToReadMap.get("FK_COMBUSTIBILE") != null)
			dto.setFkCombustibile(rs.getBigDecimal("FK_COMBUSTIBILE"));

		// colonna [MATRICOLA]
		if (mapAllColumns || columnsToReadMap.get("MATRICOLA") != null)
			dto.setMatricola(rs.getString("MATRICOLA"));

		// colonna [MODELLO]
		if (mapAllColumns || columnsToReadMap.get("MODELLO") != null)
			dto.setModello(rs.getString("MODELLO"));

		// colonna [POTENZA_TERMICA_KW]
		if (mapAllColumns || columnsToReadMap.get("POTENZA_TERMICA_KW") != null)
			dto.setPotenzaTermicaKw(rs.getBigDecimal("POTENZA_TERMICA_KW"));

		// colonna [ALIMENTAZIONE]
		if (mapAllColumns || columnsToReadMap.get("ALIMENTAZIONE") != null)
			dto.setAlimentazione(rs.getString("ALIMENTAZIONE"));

		// colonna [NOTE]
		if (mapAllColumns || columnsToReadMap.get("NOTE") != null)
			dto.setNote(rs.getString("NOTE"));

		// colonna [TEMPO_MANUT_ANNI]
		if (mapAllColumns || columnsToReadMap.get("TEMPO_MANUT_ANNI") != null)
			dto.setTempoManutAnni(rs.getBigDecimal("TEMPO_MANUT_ANNI"));

		return dto;
	}

}
