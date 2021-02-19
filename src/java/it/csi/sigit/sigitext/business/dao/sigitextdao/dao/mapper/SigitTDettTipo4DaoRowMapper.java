package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTDettTipo4Dao
 * @generated
 */
public class SigitTDettTipo4DaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTDettTipo4DaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTDettTipo4DaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTDettTipo4Dao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTDettTipo4DaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTDettTipo4Dto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTDettTipo4Dto) {
			return mapRow_internal((SigitTDettTipo4Dto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTDettTipo4Dto mapRow_internal(SigitTDettTipo4Dto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTDettTipo4Dto dto = objectToFill;

		// colonna [ID_DETT_TIPO4]
		if (mapAllColumns || columnsToReadMap.get("ID_DETT_TIPO4") != null)
			dto.setIdDettTipo4(rs.getBigDecimal("ID_DETT_TIPO4"));

		// colonna [FK_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("FK_ALLEGATO") != null)
			dto.setFkAllegato(rs.getBigDecimal("FK_ALLEGATO"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [FK_TIPO_COMPONENTE]
		if (mapAllColumns || columnsToReadMap.get("FK_TIPO_COMPONENTE") != null)
			dto.setFkTipoComponente(rs.getString("FK_TIPO_COMPONENTE"));

		// colonna [PROGRESSIVO]
		if (mapAllColumns || columnsToReadMap.get("PROGRESSIVO") != null)
			dto.setProgressivo(rs.getBigDecimal("PROGRESSIVO"));

		// colonna [DATA_INSTALL]
		if (mapAllColumns || columnsToReadMap.get("DATA_INSTALL") != null)
			dto.setDataInstall(rs.getDate("DATA_INSTALL"));

		// colonna [FK_FLUIDO]
		if (mapAllColumns || columnsToReadMap.get("FK_FLUIDO") != null)
			dto.setFkFluido(rs.getBigDecimal("FK_FLUIDO"));

		// colonna [E_POTENZA_ASSORB_COMB_KW]
		if (mapAllColumns || columnsToReadMap.get("E_POTENZA_ASSORB_COMB_KW") != null)
			dto.setEPotenzaAssorbCombKw(rs.getBigDecimal("E_POTENZA_ASSORB_COMB_KW"));

		// colonna [E_POTENZA_TERM_BYPASS_KW]
		if (mapAllColumns || columnsToReadMap.get("E_POTENZA_TERM_BYPASS_KW") != null)
			dto.setEPotenzaTermBypassKw(rs.getBigDecimal("E_POTENZA_TERM_BYPASS_KW"));

		// colonna [E_TEMP_ARIA_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_ARIA_C") != null)
			dto.setETempAriaC(rs.getBigDecimal("E_TEMP_ARIA_C"));

		// colonna [E_TEMP_H2O_OUT_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_H2O_OUT_C") != null)
			dto.setETempH2oOutC(rs.getBigDecimal("E_TEMP_H2O_OUT_C"));

		// colonna [E_TEMP_H2O_IN_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_H2O_IN_C") != null)
			dto.setETempH2oInC(rs.getBigDecimal("E_TEMP_H2O_IN_C"));

		// colonna [E_POTENZA_MORSETTI_KW]
		if (mapAllColumns || columnsToReadMap.get("E_POTENZA_MORSETTI_KW") != null)
			dto.setEPotenzaMorsettiKw(rs.getBigDecimal("E_POTENZA_MORSETTI_KW"));

		// colonna [E_TEMP_H2O_MOTORE_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_H2O_MOTORE_C") != null)
			dto.setETempH2oMotoreC(rs.getBigDecimal("E_TEMP_H2O_MOTORE_C"));

		// colonna [E_TEMP_FUMI_VALLE_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_FUMI_VALLE_C") != null)
			dto.setETempFumiValleC(rs.getBigDecimal("E_TEMP_FUMI_VALLE_C"));

		// colonna [E_TEMP_FUMI_MONTE_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_FUMI_MONTE_C") != null)
			dto.setETempFumiMonteC(rs.getBigDecimal("E_TEMP_FUMI_MONTE_C"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [L11_4_SOVRAFREQ_SOGLIA_HZ_MIN]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOVRAFREQ_SOGLIA_HZ_MIN") != null)
			dto.setL114SovrafreqSogliaHzMin(rs.getBigDecimal("L11_4_SOVRAFREQ_SOGLIA_HZ_MIN"));

		// colonna [L11_4_SOVRAFREQ_SOGLIA_HZ_MED]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOVRAFREQ_SOGLIA_HZ_MED") != null)
			dto.setL114SovrafreqSogliaHzMed(rs.getBigDecimal("L11_4_SOVRAFREQ_SOGLIA_HZ_MED"));

		// colonna [L11_4_SOVRAFREQ_SOGLIA_HZ_MAX]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOVRAFREQ_SOGLIA_HZ_MAX") != null)
			dto.setL114SovrafreqSogliaHzMax(rs.getBigDecimal("L11_4_SOVRAFREQ_SOGLIA_HZ_MAX"));

		// colonna [L11_4_SOVRAFREQ_TEMPO_S_MIN]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOVRAFREQ_TEMPO_S_MIN") != null)
			dto.setL114SovrafreqTempoSMin(rs.getBigDecimal("L11_4_SOVRAFREQ_TEMPO_S_MIN"));

		// colonna [L11_4_SOVRAFREQ_TEMPO_S_MED]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOVRAFREQ_TEMPO_S_MED") != null)
			dto.setL114SovrafreqTempoSMed(rs.getBigDecimal("L11_4_SOVRAFREQ_TEMPO_S_MED"));

		// colonna [L11_4_SOVRAFREQ_TEMPO_S_MAX]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOVRAFREQ_TEMPO_S_MAX") != null)
			dto.setL114SovrafreqTempoSMax(rs.getBigDecimal("L11_4_SOVRAFREQ_TEMPO_S_MAX"));

		// colonna [L11_4_SOTTOFREQ_SOGLIA_HZ_MIN]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOTTOFREQ_SOGLIA_HZ_MIN") != null)
			dto.setL114SottofreqSogliaHzMin(rs.getBigDecimal("L11_4_SOTTOFREQ_SOGLIA_HZ_MIN"));

		// colonna [L11_4_SOTTOFREQ_SOGLIA_HZ_MED]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOTTOFREQ_SOGLIA_HZ_MED") != null)
			dto.setL114SottofreqSogliaHzMed(rs.getBigDecimal("L11_4_SOTTOFREQ_SOGLIA_HZ_MED"));

		// colonna [L11_4_SOTTOFREQ_SOGLIA_HZ_MAX]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOTTOFREQ_SOGLIA_HZ_MAX") != null)
			dto.setL114SottofreqSogliaHzMax(rs.getBigDecimal("L11_4_SOTTOFREQ_SOGLIA_HZ_MAX"));

		// colonna [L11_4_SOTTOFREQ_TEMPO_S_MIN]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOTTOFREQ_TEMPO_S_MIN") != null)
			dto.setL114SottofreqTempoSMin(rs.getBigDecimal("L11_4_SOTTOFREQ_TEMPO_S_MIN"));

		// colonna [L11_4_SOTTOFREQ_TEMPO_S_MED]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOTTOFREQ_TEMPO_S_MED") != null)
			dto.setL114SottofreqTempoSMed(rs.getBigDecimal("L11_4_SOTTOFREQ_TEMPO_S_MED"));

		// colonna [L11_4_SOTTOFREQ_TEMPO_S_MAX]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOTTOFREQ_TEMPO_S_MAX") != null)
			dto.setL114SottofreqTempoSMax(rs.getBigDecimal("L11_4_SOTTOFREQ_TEMPO_S_MAX"));

		// colonna [L11_4_SOVRATENS_SOGLIA_V_MIN]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOVRATENS_SOGLIA_V_MIN") != null)
			dto.setL114SovratensSogliaVMin(rs.getBigDecimal("L11_4_SOVRATENS_SOGLIA_V_MIN"));

		// colonna [L11_4_SOVRATENS_SOGLIA_V_MED]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOVRATENS_SOGLIA_V_MED") != null)
			dto.setL114SovratensSogliaVMed(rs.getBigDecimal("L11_4_SOVRATENS_SOGLIA_V_MED"));

		// colonna [L11_4_SOVRATENS_SOGLIA_V_MAX]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOVRATENS_SOGLIA_V_MAX") != null)
			dto.setL114SovratensSogliaVMax(rs.getBigDecimal("L11_4_SOVRATENS_SOGLIA_V_MAX"));

		// colonna [L11_4_SOVRATENS_TEMPO_S_MIN]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOVRATENS_TEMPO_S_MIN") != null)
			dto.setL114SovratensTempoSMin(rs.getBigDecimal("L11_4_SOVRATENS_TEMPO_S_MIN"));

		// colonna [L11_4_SOVRATENS_TEMPO_S_MED]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOVRATENS_TEMPO_S_MED") != null)
			dto.setL114SovratensTempoSMed(rs.getBigDecimal("L11_4_SOVRATENS_TEMPO_S_MED"));

		// colonna [L11_4_SOVRATENS_TEMPO_S_MAX]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOVRATENS_TEMPO_S_MAX") != null)
			dto.setL114SovratensTempoSMax(rs.getBigDecimal("L11_4_SOVRATENS_TEMPO_S_MAX"));

		// colonna [L11_4_SOTTOTENS_SOGLIA_V_MIN]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOTTOTENS_SOGLIA_V_MIN") != null)
			dto.setL114SottotensSogliaVMin(rs.getBigDecimal("L11_4_SOTTOTENS_SOGLIA_V_MIN"));

		// colonna [L11_4_SOTTOTENS_SOGLIA_V_MED]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOTTOTENS_SOGLIA_V_MED") != null)
			dto.setL114SottotensSogliaVMed(rs.getBigDecimal("L11_4_SOTTOTENS_SOGLIA_V_MED"));

		// colonna [L11_4_SOTTOTENS_SOGLIA_V_MAX]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOTTOTENS_SOGLIA_V_MAX") != null)
			dto.setL114SottotensSogliaVMax(rs.getBigDecimal("L11_4_SOTTOTENS_SOGLIA_V_MAX"));

		// colonna [L11_4_SOTTOTENS_TEMPO_S_MIN]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOTTOTENS_TEMPO_S_MIN") != null)
			dto.setL114SottotensTempoSMin(rs.getBigDecimal("L11_4_SOTTOTENS_TEMPO_S_MIN"));

		// colonna [L11_4_SOTTOTENS_TEMPO_S_MED]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOTTOTENS_TEMPO_S_MED") != null)
			dto.setL114SottotensTempoSMed(rs.getBigDecimal("L11_4_SOTTOTENS_TEMPO_S_MED"));

		// colonna [L11_4_SOTTOTENS_TEMPO_S_MAX]
		if (mapAllColumns || columnsToReadMap.get("L11_4_SOTTOTENS_TEMPO_S_MAX") != null)
			dto.setL114SottotensTempoSMax(rs.getBigDecimal("L11_4_SOTTOTENS_TEMPO_S_MAX"));

		// colonna [E_CONTROLLOWEB]
		if (mapAllColumns || columnsToReadMap.get("E_CONTROLLOWEB") != null)
			dto.setEControlloweb(rs.getTimestamp("E_CONTROLLOWEB"));

		return dto;
	}

}
