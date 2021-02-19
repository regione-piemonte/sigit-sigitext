package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitVCompGfDettDao
 * @generated
 */
public class SigitVCompGfDettDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitVCompGfDettDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitVCompGfDettDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitVCompGfDettDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitVCompGfDettDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitVCompGfDettDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitVCompGfDettDto) {
			return mapRow_internal((SigitVCompGfDettDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitVCompGfDettDto mapRow_internal(SigitVCompGfDettDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitVCompGfDettDto dto = objectToFill;

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

		// colonna [ID_DETT_TIPO2]
		if (mapAllColumns || columnsToReadMap.get("ID_DETT_TIPO2") != null)
			dto.setIdDettTipo2(rs.getBigDecimal("ID_DETT_TIPO2"));

		// colonna [FK_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("FK_ALLEGATO") != null)
			dto.setFkAllegato(rs.getBigDecimal("FK_ALLEGATO"));

		// colonna [E_N_CIRCUITO]
		if (mapAllColumns || columnsToReadMap.get("E_N_CIRCUITO") != null)
			dto.setENCircuito(rs.getString("E_N_CIRCUITO"));

		// colonna [E_FLG_MOD_PROVA]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_MOD_PROVA") != null)
			dto.setEFlgModProva(rs.getString("E_FLG_MOD_PROVA"));

		// colonna [E_FLG_PERDITA_GAS]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_PERDITA_GAS") != null)
			dto.setEFlgPerditaGas(rs.getBigDecimal("E_FLG_PERDITA_GAS"));

		// colonna [E_FLG_LEAK_DETECTOR]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_LEAK_DETECTOR") != null)
			dto.setEFlgLeakDetector(rs.getBigDecimal("E_FLG_LEAK_DETECTOR"));

		// colonna [E_FLG_PARAM_TERMODINAM]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_PARAM_TERMODINAM") != null)
			dto.setEFlgParamTermodinam(rs.getBigDecimal("E_FLG_PARAM_TERMODINAM"));

		// colonna [E_FLG_INCROSTAZIONI]
		if (mapAllColumns || columnsToReadMap.get("E_FLG_INCROSTAZIONI") != null)
			dto.setEFlgIncrostazioni(rs.getBigDecimal("E_FLG_INCROSTAZIONI"));

		// colonna [E_T_SURRISC_C]
		if (mapAllColumns || columnsToReadMap.get("E_T_SURRISC_C") != null)
			dto.setETSurriscC(rs.getBigDecimal("E_T_SURRISC_C"));

		// colonna [E_T_SOTTORAF_C]
		if (mapAllColumns || columnsToReadMap.get("E_T_SOTTORAF_C") != null)
			dto.setETSottorafC(rs.getBigDecimal("E_T_SOTTORAF_C"));

		// colonna [E_T_CONDENSAZIONE_C]
		if (mapAllColumns || columnsToReadMap.get("E_T_CONDENSAZIONE_C") != null)
			dto.setETCondensazioneC(rs.getBigDecimal("E_T_CONDENSAZIONE_C"));

		// colonna [E_T_EVAPORAZIONE_C]
		if (mapAllColumns || columnsToReadMap.get("E_T_EVAPORAZIONE_C") != null)
			dto.setETEvaporazioneC(rs.getBigDecimal("E_T_EVAPORAZIONE_C"));

		// colonna [E_T_IN_EXT_C]
		if (mapAllColumns || columnsToReadMap.get("E_T_IN_EXT_C") != null)
			dto.setETInExtC(rs.getBigDecimal("E_T_IN_EXT_C"));

		// colonna [E_T_OUT_EXT_C]
		if (mapAllColumns || columnsToReadMap.get("E_T_OUT_EXT_C") != null)
			dto.setETOutExtC(rs.getBigDecimal("E_T_OUT_EXT_C"));

		// colonna [E_T_IN_UTENZE_C]
		if (mapAllColumns || columnsToReadMap.get("E_T_IN_UTENZE_C") != null)
			dto.setETInUtenzeC(rs.getBigDecimal("E_T_IN_UTENZE_C"));

		// colonna [E_T_OUT_UTENZE_C]
		if (mapAllColumns || columnsToReadMap.get("E_T_OUT_UTENZE_C") != null)
			dto.setETOutUtenzeC(rs.getBigDecimal("E_T_OUT_UTENZE_C"));

		// colonna [DATA_ULT_MOD_DETT]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD_DETT") != null)
			dto.setDataUltModDett(rs.getTimestamp("DATA_ULT_MOD_DETT"));

		// colonna [UTENTE_ULT_MOD_DETT]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD_DETT") != null)
			dto.setUtenteUltModDett(rs.getString("UTENTE_ULT_MOD_DETT"));

		// colonna [DATA_CONTROLLO]
		if (mapAllColumns || columnsToReadMap.get("DATA_CONTROLLO") != null)
			dto.setDataControllo(rs.getDate("DATA_CONTROLLO"));

		// colonna [L11_2_TORRE_T_OUT_FLUIDO]
		if (mapAllColumns || columnsToReadMap.get("L11_2_TORRE_T_OUT_FLUIDO") != null)
			dto.setL112TorreTOutFluido(rs.getBigDecimal("L11_2_TORRE_T_OUT_FLUIDO"));

		// colonna [L11_2_TORRE_T_BULBO_UMIDO]
		if (mapAllColumns || columnsToReadMap.get("L11_2_TORRE_T_BULBO_UMIDO") != null)
			dto.setL112TorreTBulboUmido(rs.getBigDecimal("L11_2_TORRE_T_BULBO_UMIDO"));

		// colonna [L11_2_SCAMBIATORE_T_IN_EXT]
		if (mapAllColumns || columnsToReadMap.get("L11_2_SCAMBIATORE_T_IN_EXT") != null)
			dto.setL112ScambiatoreTInExt(rs.getBigDecimal("L11_2_SCAMBIATORE_T_IN_EXT"));

		// colonna [L11_2_SCAMBIATORE_T_OUT_EXT]
		if (mapAllColumns || columnsToReadMap.get("L11_2_SCAMBIATORE_T_OUT_EXT") != null)
			dto.setL112ScambiatoreTOutExt(rs.getBigDecimal("L11_2_SCAMBIATORE_T_OUT_EXT"));

		// colonna [L11_2_SCAMBIAT_T_IN_MACCHINA]
		if (mapAllColumns || columnsToReadMap.get("L11_2_SCAMBIAT_T_IN_MACCHINA") != null)
			dto.setL112ScambiatTInMacchina(rs.getBigDecimal("L11_2_SCAMBIAT_T_IN_MACCHINA"));

		// colonna [L11_2_SCAMBIAT_T_OUT_MACCHINA]
		if (mapAllColumns || columnsToReadMap.get("L11_2_SCAMBIAT_T_OUT_MACCHINA") != null)
			dto.setL112ScambiatTOutMacchina(rs.getBigDecimal("L11_2_SCAMBIAT_T_OUT_MACCHINA"));

		// colonna [L11_2_POTENZA_ASSORBITA_KW]
		if (mapAllColumns || columnsToReadMap.get("L11_2_POTENZA_ASSORBITA_KW") != null)
			dto.setL112PotenzaAssorbitaKw(rs.getBigDecimal("L11_2_POTENZA_ASSORBITA_KW"));

		// colonna [L11_2_FLG_PULIZIA_FILTRI]
		if (mapAllColumns || columnsToReadMap.get("L11_2_FLG_PULIZIA_FILTRI") != null)
			dto.setL112FlgPuliziaFiltri(rs.getBigDecimal("L11_2_FLG_PULIZIA_FILTRI"));

		// colonna [L11_2_FLG_VERIFICA_SUPERATA]
		if (mapAllColumns || columnsToReadMap.get("L11_2_FLG_VERIFICA_SUPERATA") != null)
			dto.setL112FlgVerificaSuperata(rs.getBigDecimal("L11_2_FLG_VERIFICA_SUPERATA"));

		// colonna [L11_2_DATA_RIPRISTINO]
		if (mapAllColumns || columnsToReadMap.get("L11_2_DATA_RIPRISTINO") != null)
			dto.setL112DataRipristino(rs.getDate("L11_2_DATA_RIPRISTINO"));

		// colonna [SIGLA_REA]
		if (mapAllColumns || columnsToReadMap.get("SIGLA_REA") != null)
			dto.setSiglaRea(rs.getString("SIGLA_REA"));

		// colonna [NUMERO_REA]
		if (mapAllColumns || columnsToReadMap.get("NUMERO_REA") != null)
			dto.setNumeroRea(rs.getBigDecimal("NUMERO_REA"));

		// colonna [ID_PERSONA_GIURIDICA]
		if (mapAllColumns || columnsToReadMap.get("ID_PERSONA_GIURIDICA") != null)
			dto.setIdPersonaGiuridica(rs.getBigDecimal("ID_PERSONA_GIURIDICA"));

		// colonna [FK_RUOLO]
		if (mapAllColumns || columnsToReadMap.get("FK_RUOLO") != null)
			dto.setFkRuolo(rs.getBigDecimal("FK_RUOLO"));

		// colonna [FK_STATO_RAPP]
		if (mapAllColumns || columnsToReadMap.get("FK_STATO_RAPP") != null)
			dto.setFkStatoRapp(rs.getBigDecimal("FK_STATO_RAPP"));

		return dto;
	}

}
