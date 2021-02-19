package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTDettTipo3Dao
 * @generated
 */
public class SigitTDettTipo3DaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTDettTipo3DaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTDettTipo3DaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTDettTipo3Dao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTDettTipo3DaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTDettTipo3Dto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTDettTipo3Dto) {
			return mapRow_internal((SigitTDettTipo3Dto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTDettTipo3Dto mapRow_internal(SigitTDettTipo3Dto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTDettTipo3Dto dto = objectToFill;

		// colonna [ID_DETT_TIPO3]
		if (mapAllColumns || columnsToReadMap.get("ID_DETT_TIPO3") != null)
			dto.setIdDettTipo3(rs.getBigDecimal("ID_DETT_TIPO3"));

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

		// colonna [FK_FLUIDO_ALIMENTAZ]
		if (mapAllColumns || columnsToReadMap.get("FK_FLUIDO_ALIMENTAZ") != null)
			dto.setFkFluidoAlimentaz(rs.getBigDecimal("FK_FLUIDO_ALIMENTAZ"));

		// colonna [E_FLUIDO_ALTRO]
		if (mapAllColumns || columnsToReadMap.get("E_FLUIDO_ALTRO") != null)
			dto.setEFluidoAltro(rs.getString("E_FLUIDO_ALTRO"));

		// colonna [E_ALIMENTAZIONE_ALTRO]
		if (mapAllColumns || columnsToReadMap.get("E_ALIMENTAZIONE_ALTRO") != null)
			dto.setEAlimentazioneAltro(rs.getString("E_ALIMENTAZIONE_ALTRO"));

		// colonna [E_FLG_CLIMA_INVERNO]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_CLIMA_INVERNO") != null)
			dto.setEFlgClimaInverno(rs.getBigDecimal("E_FLG_CLIMA_INVERNO"));

		// colonna [E_FLG_PRODUZ_ACS]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_PRODUZ_ACS") != null)
			dto.setEFlgProduzAcs(rs.getBigDecimal("E_FLG_PRODUZ_ACS"));

		// colonna [E_FLG_POTENZA_COMPATIBILE]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_POTENZA_COMPATIBILE") != null)
			dto.setEFlgPotenzaCompatibile(rs.getBigDecimal("E_FLG_POTENZA_COMPATIBILE"));

		// colonna [E_FLG_COIB_IDONEA]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_COIB_IDONEA") != null)
			dto.setEFlgCoibIdonea(rs.getBigDecimal("E_FLG_COIB_IDONEA"));

		// colonna [E_FLG_DISP_FUNZIONANTI]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_DISP_FUNZIONANTI") != null)
			dto.setEFlgDispFunzionanti(rs.getBigDecimal("E_FLG_DISP_FUNZIONANTI"));

		// colonna [E_TEMP_EXT_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_EXT_C") != null)
			dto.setETempExtC(rs.getBigDecimal("E_TEMP_EXT_C"));

		// colonna [E_TEMP_MAND_PRIMARIO_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_MAND_PRIMARIO_C") != null)
			dto.setETempMandPrimarioC(rs.getBigDecimal("E_TEMP_MAND_PRIMARIO_C"));

		// colonna [E_TEMP_RITOR_PRIMARIO_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_RITOR_PRIMARIO_C") != null)
			dto.setETempRitorPrimarioC(rs.getBigDecimal("E_TEMP_RITOR_PRIMARIO_C"));

		// colonna [E_TEMP_MAND_SECONDARIO_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_MAND_SECONDARIO_C") != null)
			dto.setETempMandSecondarioC(rs.getBigDecimal("E_TEMP_MAND_SECONDARIO_C"));

		// colonna [E_TEMP_RIT_SECONDARIO_C]
		if (mapAllColumns || columnsToReadMap.get("E_TEMP_RIT_SECONDARIO_C") != null)
			dto.setETempRitSecondarioC(rs.getBigDecimal("E_TEMP_RIT_SECONDARIO_C"));

		// colonna [E_POTENZA_TERM_KW]
		if (mapAllColumns || columnsToReadMap.get("E_POTENZA_TERM_KW") != null)
			dto.setEPotenzaTermKw(rs.getBigDecimal("E_POTENZA_TERM_KW"));

		// colonna [E_PORT_FLUIDO_M3_H]
		if (mapAllColumns || columnsToReadMap.get("E_PORT_FLUIDO_M3_H") != null)
			dto.setEPortFluidoM3H(rs.getBigDecimal("E_PORT_FLUIDO_M3_H"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [E_CONTROLLOWEB]
		if (mapAllColumns || columnsToReadMap.get("E_CONTROLLOWEB") != null)
			dto.setEControlloweb(rs.getTimestamp("E_CONTROLLOWEB"));

		return dto;
	}

}
