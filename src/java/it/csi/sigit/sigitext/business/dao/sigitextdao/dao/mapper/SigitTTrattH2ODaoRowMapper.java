package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTTrattH2ODao
 * @generated
 */
public class SigitTTrattH2ODaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTTrattH2ODaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTTrattH2ODaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTTrattH2ODao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTTrattH2ODaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTTrattH2ODto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTTrattH2ODto) {
			return mapRow_internal((SigitTTrattH2ODto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTTrattH2ODto mapRow_internal(SigitTTrattH2ODto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTTrattH2ODto dto = objectToFill;

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [L2_1_H2O_CLIMA_M3]
		if (mapAllColumns || columnsToReadMap.get("L2_1_H2O_CLIMA_M3") != null)
			dto.setL21H2oClimaM3(rs.getBigDecimal("L2_1_H2O_CLIMA_M3"));

		// colonna [L2_2_DUREZZA_H2O_FR]
		if (mapAllColumns || columnsToReadMap.get("L2_2_DUREZZA_H2O_FR") != null)
			dto.setL22DurezzaH2oFr(rs.getBigDecimal("L2_2_DUREZZA_H2O_FR"));

		// colonna [L2_3_FLG_TRATT_RISC_NON_RICH]
		if (mapAllColumns || columnsToReadMap.get("L2_3_FLG_TRATT_RISC_NON_RICH") != null)
			dto.setL23FlgTrattRiscNonRich(rs.getBigDecimal("L2_3_FLG_TRATT_RISC_NON_RICH"));

		// colonna [L2_3_FLG_TRATT_CLIMA_ASSENTE]
		if (mapAllColumns || columnsToReadMap.get("L2_3_FLG_TRATT_CLIMA_ASSENTE") != null)
			dto.setL23FlgTrattClimaAssente(rs.getBigDecimal("L2_3_FLG_TRATT_CLIMA_ASSENTE"));

		// colonna [L2_3_DUREZZA_TOT_H2O_FR]
		if (mapAllColumns || columnsToReadMap.get("L2_3_DUREZZA_TOT_H2O_FR") != null)
			dto.setL23DurezzaTotH2oFr(rs.getBigDecimal("L2_3_DUREZZA_TOT_H2O_FR"));

		// colonna [L2_3_FLG_TRATT_CLIMA_FILTR]
		if (mapAllColumns || columnsToReadMap.get("L2_3_FLG_TRATT_CLIMA_FILTR") != null)
			dto.setL23FlgTrattClimaFiltr(rs.getBigDecimal("L2_3_FLG_TRATT_CLIMA_FILTR"));

		// colonna [L2_3_FLG_TRATT_CLIMA_ADDOLC]
		if (mapAllColumns || columnsToReadMap.get("L2_3_FLG_TRATT_CLIMA_ADDOLC") != null)
			dto.setL23FlgTrattClimaAddolc(rs.getBigDecimal("L2_3_FLG_TRATT_CLIMA_ADDOLC"));

		// colonna [L2_3_FLG_TRATT_CLIMA_CHIMICO]
		if (mapAllColumns || columnsToReadMap.get("L2_3_FLG_TRATT_CLIMA_CHIMICO") != null)
			dto.setL23FlgTrattClimaChimico(rs.getBigDecimal("L2_3_FLG_TRATT_CLIMA_CHIMICO"));

		// colonna [L2_3_FLG_TRATT_GELO_ASSENTE]
		if (mapAllColumns || columnsToReadMap.get("L2_3_FLG_TRATT_GELO_ASSENTE") != null)
			dto.setL23FlgTrattGeloAssente(rs.getBigDecimal("L2_3_FLG_TRATT_GELO_ASSENTE"));

		// colonna [L2_3_FLG_TRATT_GELO_GLI_ETIL]
		if (mapAllColumns || columnsToReadMap.get("L2_3_FLG_TRATT_GELO_GLI_ETIL") != null)
			dto.setL23FlgTrattGeloGliEtil(rs.getBigDecimal("L2_3_FLG_TRATT_GELO_GLI_ETIL"));

		// colonna [L2_3_PERC_GLI_ETIL]
		if (mapAllColumns || columnsToReadMap.get("L2_3_PERC_GLI_ETIL") != null)
			dto.setL23PercGliEtil(rs.getBigDecimal("L2_3_PERC_GLI_ETIL"));

		// colonna [L2_3_PH_GLI_ETIL]
		if (mapAllColumns || columnsToReadMap.get("L2_3_PH_GLI_ETIL") != null)
			dto.setL23PhGliEtil(rs.getBigDecimal("L2_3_PH_GLI_ETIL"));

		// colonna [L2_3_FLG_TRATT_GELO_GLI_PROP]
		if (mapAllColumns || columnsToReadMap.get("L2_3_FLG_TRATT_GELO_GLI_PROP") != null)
			dto.setL23FlgTrattGeloGliProp(rs.getBigDecimal("L2_3_FLG_TRATT_GELO_GLI_PROP"));

		// colonna [L2_3_PERC_GLI_PROP]
		if (mapAllColumns || columnsToReadMap.get("L2_3_PERC_GLI_PROP") != null)
			dto.setL23PercGliProp(rs.getBigDecimal("L2_3_PERC_GLI_PROP"));

		// colonna [L2_3_PH_GLI_PROP]
		if (mapAllColumns || columnsToReadMap.get("L2_3_PH_GLI_PROP") != null)
			dto.setL23PhGliProp(rs.getBigDecimal("L2_3_PH_GLI_PROP"));

		// colonna [L2_4_FLG_TRATT_ACS_NON_RICH]
		if (mapAllColumns || columnsToReadMap.get("L2_4_FLG_TRATT_ACS_NON_RICH") != null)
			dto.setL24FlgTrattAcsNonRich(rs.getBigDecimal("L2_4_FLG_TRATT_ACS_NON_RICH"));

		// colonna [L2_4_FLG_TRATT_ACS_ASSENTE]
		if (mapAllColumns || columnsToReadMap.get("L2_4_FLG_TRATT_ACS_ASSENTE") != null)
			dto.setL24FlgTrattAcsAssente(rs.getBigDecimal("L2_4_FLG_TRATT_ACS_ASSENTE"));

		// colonna [L2_4_FLG_TRATT_ACS_FILTR]
		if (mapAllColumns || columnsToReadMap.get("L2_4_FLG_TRATT_ACS_FILTR") != null)
			dto.setL24FlgTrattAcsFiltr(rs.getBigDecimal("L2_4_FLG_TRATT_ACS_FILTR"));

		// colonna [L2_4_FLG_TRATT_ACS_ADDOLC]
		if (mapAllColumns || columnsToReadMap.get("L2_4_FLG_TRATT_ACS_ADDOLC") != null)
			dto.setL24FlgTrattAcsAddolc(rs.getBigDecimal("L2_4_FLG_TRATT_ACS_ADDOLC"));

		// colonna [L2_4_DUREZZA_ADDOLC_FR]
		if (mapAllColumns || columnsToReadMap.get("L2_4_DUREZZA_ADDOLC_FR") != null)
			dto.setL24DurezzaAddolcFr(rs.getBigDecimal("L2_4_DUREZZA_ADDOLC_FR"));

		// colonna [L2_4_FLG_TRATT_ACS_CHIMICO]
		if (mapAllColumns || columnsToReadMap.get("L2_4_FLG_TRATT_ACS_CHIMICO") != null)
			dto.setL24FlgTrattAcsChimico(rs.getBigDecimal("L2_4_FLG_TRATT_ACS_CHIMICO"));

		// colonna [L2_5_FLG_TRATT_RAFF_ASSENTE]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_RAFF_ASSENTE") != null)
			dto.setL25FlgTrattRaffAssente(rs.getBigDecimal("L2_5_FLG_TRATT_RAFF_ASSENTE"));

		// colonna [L2_5_FLG_TRATT_RAFF_NO_RT]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_RAFF_NO_RT") != null)
			dto.setL25FlgTrattRaffNoRt(rs.getBigDecimal("L2_5_FLG_TRATT_RAFF_NO_RT"));

		// colonna [L2_5_FLG_TRATT_RAFF_RTP]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_RAFF_RTP") != null)
			dto.setL25FlgTrattRaffRtp(rs.getBigDecimal("L2_5_FLG_TRATT_RAFF_RTP"));

		// colonna [L2_5_FLG_TRATT_RAFF_RTT]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_RAFF_RTT") != null)
			dto.setL25FlgTrattRaffRtt(rs.getBigDecimal("L2_5_FLG_TRATT_RAFF_RTT"));

		// colonna [L2_5_FLG_TRATT_RAFF_ACQ]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_RAFF_ACQ") != null)
			dto.setL25FlgTrattRaffAcq(rs.getBigDecimal("L2_5_FLG_TRATT_RAFF_ACQ"));

		// colonna [L2_5_FLG_TRATT_RAFF_PZZ]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_RAFF_PZZ") != null)
			dto.setL25FlgTrattRaffPzz(rs.getBigDecimal("L2_5_FLG_TRATT_RAFF_PZZ"));

		// colonna [L2_5_FLG_TRATT_RAFF_H2O_SUP]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_RAFF_H2O_SUP") != null)
			dto.setL25FlgTrattRaffH2oSup(rs.getBigDecimal("L2_5_FLG_TRATT_RAFF_H2O_SUP"));

		// colonna [L2_5_FLG_TRATT_F_FILT_SIC]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_F_FILT_SIC") != null)
			dto.setL25FlgTrattFFiltSic(rs.getBigDecimal("L2_5_FLG_TRATT_F_FILT_SIC"));

		// colonna [L2_5_FLG_TRATT_F_FILT_MAS]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_F_FILT_MAS") != null)
			dto.setL25FlgTrattFFiltMas(rs.getBigDecimal("L2_5_FLG_TRATT_F_FILT_MAS"));

		// colonna [L2_5_FLG_TRATT_F_NO_TRATT]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_F_NO_TRATT") != null)
			dto.setL25FlgTrattFNoTratt(rs.getBigDecimal("L2_5_FLG_TRATT_F_NO_TRATT"));

		// colonna [L2_5_TRATT_F_ALTRO]
		if (mapAllColumns || columnsToReadMap.get("L2_5_TRATT_F_ALTRO") != null)
			dto.setL25TrattFAltro(rs.getString("L2_5_TRATT_F_ALTRO"));

		// colonna [L2_5_FLG_TRATT_T_ADDOLC]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_T_ADDOLC") != null)
			dto.setL25FlgTrattTAddolc(rs.getBigDecimal("L2_5_FLG_TRATT_T_ADDOLC"));

		// colonna [L2_5_FLG_TRATT_T_OSMOSI]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_T_OSMOSI") != null)
			dto.setL25FlgTrattTOsmosi(rs.getBigDecimal("L2_5_FLG_TRATT_T_OSMOSI"));

		// colonna [L2_5_FLG_TRATT_T_DEMIN]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_T_DEMIN") != null)
			dto.setL25FlgTrattTDemin(rs.getBigDecimal("L2_5_FLG_TRATT_T_DEMIN"));

		// colonna [L2_5_FLG_TRATT_T_NO_TRATT]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_T_NO_TRATT") != null)
			dto.setL25FlgTrattTNoTratt(rs.getBigDecimal("L2_5_FLG_TRATT_T_NO_TRATT"));

		// colonna [L2_5_TRATT_T_ALTRO]
		if (mapAllColumns || columnsToReadMap.get("L2_5_TRATT_T_ALTRO") != null)
			dto.setL25TrattTAltro(rs.getString("L2_5_TRATT_T_ALTRO"));

		// colonna [L2_5_FLG_TRATT_C_PAANTINCRO]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_C_PAANTINCRO") != null)
			dto.setL25FlgTrattCPaantincro(rs.getBigDecimal("L2_5_FLG_TRATT_C_PAANTINCRO"));

		// colonna [L2_5_FLG_TRATT_C_PAANTICORR]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_C_PAANTICORR") != null)
			dto.setL25FlgTrattCPaanticorr(rs.getBigDecimal("L2_5_FLG_TRATT_C_PAANTICORR"));

		// colonna [L2_5_FLG_TRATT_C_AAA]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_C_AAA") != null)
			dto.setL25FlgTrattCAaa(rs.getBigDecimal("L2_5_FLG_TRATT_C_AAA"));

		// colonna [L2_5_FLG_TRATT_C_BIOCIDA]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_C_BIOCIDA") != null)
			dto.setL25FlgTrattCBiocida(rs.getBigDecimal("L2_5_FLG_TRATT_C_BIOCIDA"));

		// colonna [L2_5_FLG_TRATT_C_NO_TRATT]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_TRATT_C_NO_TRATT") != null)
			dto.setL25FlgTrattCNoTratt(rs.getBigDecimal("L2_5_FLG_TRATT_C_NO_TRATT"));

		// colonna [L2_5_TRATT_C_ALTRO]
		if (mapAllColumns || columnsToReadMap.get("L2_5_TRATT_C_ALTRO") != null)
			dto.setL25TrattCAltro(rs.getString("L2_5_TRATT_C_ALTRO"));

		// colonna [L2_5_FLG_SPURGO_AUTOM]
		if (mapAllColumns || columnsToReadMap.get("L2_5_FLG_SPURGO_AUTOM") != null)
			dto.setL25FlgSpurgoAutom(rs.getBigDecimal("L2_5_FLG_SPURGO_AUTOM"));

		// colonna [L2_5_CONDUC_H2O_ING]
		if (mapAllColumns || columnsToReadMap.get("L2_5_CONDUC_H2O_ING") != null)
			dto.setL25ConducH2oIng(rs.getBigDecimal("L2_5_CONDUC_H2O_ING"));

		// colonna [L2_5_TARATURA]
		if (mapAllColumns || columnsToReadMap.get("L2_5_TARATURA") != null)
			dto.setL25Taratura(rs.getBigDecimal("L2_5_TARATURA"));

		return dto;
	}

}
