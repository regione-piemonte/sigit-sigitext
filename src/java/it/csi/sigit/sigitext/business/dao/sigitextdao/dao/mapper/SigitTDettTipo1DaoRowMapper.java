package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTDettTipo1Dao
 * @generated
 */
public class SigitTDettTipo1DaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTDettTipo1DaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTDettTipo1DaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTDettTipo1Dao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTDettTipo1DaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTDettTipo1Dto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTDettTipo1Dto) {
			return mapRow_internal((SigitTDettTipo1Dto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTDettTipo1Dto mapRow_internal(SigitTDettTipo1Dto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTDettTipo1Dto dto = objectToFill;

		// colonna [ID_DETT_TIPO1]
		if (mapAllColumns || columnsToReadMap.get("ID_DETT_TIPO1") != null)
			dto.setIdDettTipo1(rs.getBigDecimal("ID_DETT_TIPO1"));

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

		// colonna [E_N_MODULO_TERMICO]
		if (mapAllColumns || columnsToReadMap.get("E_N_MODULO_TERMICO") != null)
			dto.setENModuloTermico((Integer) rs.getObject("E_N_MODULO_TERMICO"));

		// colonna [E_POT_TERM_FOCOL_KW]
		if (mapAllColumns || columnsToReadMap.get("E_POT_TERM_FOCOL_KW") != null)
			dto.setEPotTermFocolKw(rs.getBigDecimal("E_POT_TERM_FOCOL_KW"));

		// colonna [E_FLG_CLIMA_INVERNO]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_CLIMA_INVERNO") != null)
			dto.setEFlgClimaInverno(rs.getBigDecimal("E_FLG_CLIMA_INVERNO"));

		// colonna [E_FLG_PRODUZ_ACS]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_PRODUZ_ACS") != null)
			dto.setEFlgProduzAcs(rs.getBigDecimal("E_FLG_PRODUZ_ACS"));

		// colonna [E_FLG_DISPOS_COMANDO]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_DISPOS_COMANDO") != null)
			dto.setEFlgDisposComando(rs.getBigDecimal("E_FLG_DISPOS_COMANDO"));

		// colonna [E_FLG_DISPOS_SICUREZZA]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_DISPOS_SICUREZZA") != null)
			dto.setEFlgDisposSicurezza(rs.getBigDecimal("E_FLG_DISPOS_SICUREZZA"));

		// colonna [E_FLG_VALVOLA_SICUREZZA]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_VALVOLA_SICUREZZA") != null)
			dto.setEFlgValvolaSicurezza(rs.getBigDecimal("E_FLG_VALVOLA_SICUREZZA"));

		// colonna [E_FLG_SCAMBIATORE_FUMI]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_SCAMBIATORE_FUMI") != null)
			dto.setEFlgScambiatoreFumi(rs.getBigDecimal("E_FLG_SCAMBIATORE_FUMI"));

		// colonna [E_FLG_RIFLUSSO]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_RIFLUSSO") != null)
			dto.setEFlgRiflusso(rs.getBigDecimal("E_FLG_RIFLUSSO"));

		// colonna [E_FLG_UNI_10389_1]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_UNI_10389_1") != null)
			dto.setEFlgUni103891(rs.getBigDecimal("E_FLG_UNI_10389_1"));

		// colonna [E_FLG_EVACU_FUMI]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_EVACU_FUMI") != null)
			dto.setEFlgEvacuFumi(rs.getString("E_FLG_EVACU_FUMI"));

		// colonna [E_DEPR_CANALE_FUMO_PA]
		if (mapAllColumns || columnsToReadMap.get("E_DEPR_CANALE_FUMO_PA") != null)
			dto.setEDeprCanaleFumoPa(rs.getBigDecimal("E_DEPR_CANALE_FUMO_PA"));

		// colonna [E_TEMP_FUMI_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_FUMI_C") != null)
			dto.setETempFumiC(rs.getBigDecimal("E_TEMP_FUMI_C"));

		// colonna [E_TEMP_ARIA_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_ARIA_C") != null)
			dto.setETempAriaC(rs.getBigDecimal("E_TEMP_ARIA_C"));

		// colonna [E_O2_PERC]
		if (mapAllColumns || columnsToReadMap.get("E_O2_PERC") != null)
			dto.setEO2Perc(rs.getBigDecimal("E_O2_PERC"));

		// colonna [E_CO2_PERC]
		if (mapAllColumns || columnsToReadMap.get("E_CO2_PERC") != null)
			dto.setECo2Perc(rs.getBigDecimal("E_CO2_PERC"));

		// colonna [E_CO_CORRETTO_PPM]
		if (mapAllColumns || columnsToReadMap.get("E_CO_CORRETTO_PPM") != null)
			dto.setECoCorrettoPpm(rs.getBigDecimal("E_CO_CORRETTO_PPM"));

		// colonna [E_REND_COMB_PERC]
		if (mapAllColumns || columnsToReadMap.get("E_REND_COMB_PERC") != null)
			dto.setERendCombPerc(rs.getBigDecimal("E_REND_COMB_PERC"));

		// colonna [E_REND_MIN_LEGGE_PERC]
		if (mapAllColumns || columnsToReadMap.get("E_REND_MIN_LEGGE_PERC") != null)
			dto.setERendMinLeggePerc(rs.getBigDecimal("E_REND_MIN_LEGGE_PERC"));

		// colonna [E_NOX_PPM]
		if (mapAllColumns || columnsToReadMap.get("E_NOX_PPM") != null)
			dto.setENoxPpm(rs.getBigDecimal("E_NOX_PPM"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [L11_1_PORTATA_COMBUSTIBILE]
		if (mapAllColumns || columnsToReadMap.get("L11_1_PORTATA_COMBUSTIBILE") != null)
			dto.setL111PortataCombustibile(rs.getBigDecimal("L11_1_PORTATA_COMBUSTIBILE"));

		// colonna [L11_1_CO_NO_ARIA_PPM]
		if (mapAllColumns || columnsToReadMap.get("L11_1_CO_NO_ARIA_PPM") != null)
			dto.setL111CoNoAriaPpm(rs.getBigDecimal("L11_1_CO_NO_ARIA_PPM"));

		// colonna [L11_1_FLG_RISPETTA_BACHARACH]
		if (mapAllColumns || columnsToReadMap.get("L11_1_FLG_RISPETTA_BACHARACH") != null)
			dto.setL111FlgRispettaBacharach(rs.getBigDecimal("L11_1_FLG_RISPETTA_BACHARACH"));

		// colonna [L11_1_FLG_CO_MIN_1000]
		if (mapAllColumns || columnsToReadMap.get("L11_1_FLG_CO_MIN_1000") != null)
			dto.setL111FlgCoMin1000(rs.getBigDecimal("L11_1_FLG_CO_MIN_1000"));

		// colonna [L11_1_FLG_REND_MAG_REND_MIN]
		if (mapAllColumns || columnsToReadMap.get("L11_1_FLG_REND_MAG_REND_MIN") != null)
			dto.setL111FlgRendMagRendMin(rs.getBigDecimal("L11_1_FLG_REND_MAG_REND_MIN"));

		// colonna [L11_1_PORTATA_COMBUSTIBILE_UM]
		if (mapAllColumns || columnsToReadMap.get("L11_1_PORTATA_COMBUSTIBILE_UM") != null)
			dto.setL111PortataCombustibileUm(rs.getString("L11_1_PORTATA_COMBUSTIBILE_UM"));

		// colonna [L11_1_ALTRO_RIFERIMENTO]
		if (mapAllColumns || columnsToReadMap.get("L11_1_ALTRO_RIFERIMENTO") != null)
			dto.setL111AltroRiferimento(rs.getString("L11_1_ALTRO_RIFERIMENTO"));

		// colonna [E_BACHARACH_MIN]
		if (mapAllColumns || columnsToReadMap.get("E_BACHARACH_MIN") != null)
			dto.setEBacharachMin(rs.getBigDecimal("E_BACHARACH_MIN"));

		// colonna [E_BACHARACH_MED]
		if (mapAllColumns || columnsToReadMap.get("E_BACHARACH_MED") != null)
			dto.setEBacharachMed(rs.getBigDecimal("E_BACHARACH_MED"));

		// colonna [E_BACHARACH_MAX]
		if (mapAllColumns || columnsToReadMap.get("E_BACHARACH_MAX") != null)
			dto.setEBacharachMax(rs.getBigDecimal("E_BACHARACH_MAX"));

		// colonna [E_CONTROLLOWEB]
		if (mapAllColumns || columnsToReadMap.get("E_CONTROLLOWEB") != null)
			dto.setEControlloweb(rs.getTimestamp("E_CONTROLLOWEB"));

		// colonna [E_NOX_MG_KWH]
		if (mapAllColumns || columnsToReadMap.get("E_NOX_MG_KWH") != null)
			dto.setENoxMgKwh(rs.getBigDecimal("E_NOX_MG_KWH"));

		return dto;
	}

}
