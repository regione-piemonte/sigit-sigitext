package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTCompXSempliceDao
 * @generated
 */
public class SigitTCompXSempliceDaoRowMapper extends BaseDaoRowMapper
		implements
			org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTCompXSempliceDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTCompXSempliceDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTCompXSempliceDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTCompXSempliceDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTCompXSempliceDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTCompXSempliceDto) {
			return mapRow_internal((SigitTCompXSempliceDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTCompXSempliceDto mapRow_internal(SigitTCompXSempliceDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTCompXSempliceDto dto = objectToFill;

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [L5_1_FLG_SR_ONOFF]
		if (mapAllColumns || columnsToReadMap.get("L5_1_FLG_SR_ONOFF") != null)
			dto.setL51FlgSrOnoff(rs.getBigDecimal("L5_1_FLG_SR_ONOFF"));

		// colonna [L5_1_FLG_SR_GENERATORE]
		if (mapAllColumns || columnsToReadMap.get("L5_1_FLG_SR_GENERATORE") != null)
			dto.setL51FlgSrGeneratore(rs.getBigDecimal("L5_1_FLG_SR_GENERATORE"));

		// colonna [L5_1_FLG_SR_INDIPENDENTE]
		if (mapAllColumns || columnsToReadMap.get("L5_1_FLG_SR_INDIPENDENTE") != null)
			dto.setL51FlgSrIndipendente(rs.getBigDecimal("L5_1_FLG_SR_INDIPENDENTE"));

		// colonna [L5_1_FLG_VALVOLE_REGOLAZIONE]
		if (mapAllColumns || columnsToReadMap.get("L5_1_FLG_VALVOLE_REGOLAZIONE") != null)
			dto.setL51FlgValvoleRegolazione(rs.getBigDecimal("L5_1_FLG_VALVOLE_REGOLAZIONE"));

		// colonna [L5_1_FLG_SR_MULTIGRADINO]
		if (mapAllColumns || columnsToReadMap.get("L5_1_FLG_SR_MULTIGRADINO") != null)
			dto.setL51FlgSrMultigradino(rs.getBigDecimal("L5_1_FLG_SR_MULTIGRADINO"));

		// colonna [L5_1_FLG_SR_INVERTER]
		if (mapAllColumns || columnsToReadMap.get("L5_1_FLG_SR_INVERTER") != null)
			dto.setL51FlgSrInverter(rs.getBigDecimal("L5_1_FLG_SR_INVERTER"));

		// colonna [L5_1_FLG_SR_ALTRI]
		if (mapAllColumns || columnsToReadMap.get("L5_1_FLG_SR_ALTRI") != null)
			dto.setL51FlgSrAltri(rs.getBigDecimal("L5_1_FLG_SR_ALTRI"));

		// colonna [L5_1_SR_DESCRIZIONE]
		if (mapAllColumns || columnsToReadMap.get("L5_1_SR_DESCRIZIONE") != null)
			dto.setL51SrDescrizione(rs.getString("L5_1_SR_DESCRIZIONE"));

		// colonna [L5_2_FLG_TERMO_ONOFF]
		if (mapAllColumns || columnsToReadMap.get("L5_2_FLG_TERMO_ONOFF") != null)
			dto.setL52FlgTermoOnoff(rs.getBigDecimal("L5_2_FLG_TERMO_ONOFF"));

		// colonna [L5_2_FLG_TERMO_PROPORZIONALE]
		if (mapAllColumns || columnsToReadMap.get("L5_2_FLG_TERMO_PROPORZIONALE") != null)
			dto.setL52FlgTermoProporzionale(rs.getBigDecimal("L5_2_FLG_TERMO_PROPORZIONALE"));

		// colonna [L5_2_FLG_CONTR_ENTALPICO]
		if (mapAllColumns || columnsToReadMap.get("L5_2_FLG_CONTR_ENTALPICO") != null)
			dto.setL52FlgContrEntalpico(rs.getBigDecimal("L5_2_FLG_CONTR_ENTALPICO"));

		// colonna [L5_2_FLG_CONTR_PORTATA]
		if (mapAllColumns || columnsToReadMap.get("L5_2_FLG_CONTR_PORTATA") != null)
			dto.setL52FlgContrPortata(rs.getBigDecimal("L5_2_FLG_CONTR_PORTATA"));

		// colonna [L5_2_FLG_VALVOLE_TERMO]
		if (mapAllColumns || columnsToReadMap.get("L5_2_FLG_VALVOLE_TERMO") != null)
			dto.setL52FlgValvoleTermo(rs.getString("L5_2_FLG_VALVOLE_TERMO"));

		// colonna [L5_2_FLG_VALVOLE_2]
		if (mapAllColumns || columnsToReadMap.get("L5_2_FLG_VALVOLE_2") != null)
			dto.setL52FlgValvole2(rs.getString("L5_2_FLG_VALVOLE_2"));

		// colonna [L5_2_FLG_VALVOLE_3]
		if (mapAllColumns || columnsToReadMap.get("L5_2_FLG_VALVOLE_3") != null)
			dto.setL52FlgValvole3(rs.getString("L5_2_FLG_VALVOLE_3"));

		// colonna [L5_2_NOTE]
		if (mapAllColumns || columnsToReadMap.get("L5_2_NOTE") != null)
			dto.setL52Note(rs.getString("L5_2_NOTE"));

		// colonna [L5_3_FLG_TELELETTURA]
		if (mapAllColumns || columnsToReadMap.get("L5_3_FLG_TELELETTURA") != null)
			dto.setL53FlgTelelettura(rs.getString("L5_3_FLG_TELELETTURA"));

		// colonna [L5_3_FLG_TELEGESTIONE]
		if (mapAllColumns || columnsToReadMap.get("L5_3_FLG_TELEGESTIONE") != null)
			dto.setL53FlgTelegestione(rs.getString("L5_3_FLG_TELEGESTIONE"));

		// colonna [L5_3_DES_SISTEMA_INSTALLAZ]
		if (mapAllColumns || columnsToReadMap.get("L5_3_DES_SISTEMA_INSTALLAZ") != null)
			dto.setL53DesSistemaInstallaz(rs.getString("L5_3_DES_SISTEMA_INSTALLAZ"));

		// colonna [L5_3_DATA_SOSTITUZ]
		if (mapAllColumns || columnsToReadMap.get("L5_3_DATA_SOSTITUZ") != null)
			dto.setL53DataSostituz(rs.getDate("L5_3_DATA_SOSTITUZ"));

		// colonna [L5_3_DES_SISTEMA_SOSTITUZ]
		if (mapAllColumns || columnsToReadMap.get("L5_3_DES_SISTEMA_SOSTITUZ") != null)
			dto.setL53DesSistemaSostituz(rs.getString("L5_3_DES_SISTEMA_SOSTITUZ"));

		// colonna [L5_4_FLG_UIC]
		if (mapAllColumns || columnsToReadMap.get("L5_4_FLG_UIC") != null)
			dto.setL54FlgUic(rs.getBigDecimal("L5_4_FLG_UIC"));

		// colonna [L5_4_FLG_RISC]
		if (mapAllColumns || columnsToReadMap.get("L5_4_FLG_RISC") != null)
			dto.setL54FlgRisc(rs.getBigDecimal("L5_4_FLG_RISC"));

		// colonna [L5_4_FLG_RAFF]
		if (mapAllColumns || columnsToReadMap.get("L5_4_FLG_RAFF") != null)
			dto.setL54FlgRaff(rs.getBigDecimal("L5_4_FLG_RAFF"));

		// colonna [L5_4_FLG_ACS]
		if (mapAllColumns || columnsToReadMap.get("L5_4_FLG_ACS") != null)
			dto.setL54FlgAcs(rs.getBigDecimal("L5_4_FLG_ACS"));

		// colonna [L5_4_FLG_TIPOLOGIA]
		if (mapAllColumns || columnsToReadMap.get("L5_4_FLG_TIPOLOGIA") != null)
			dto.setL54FlgTipologia(rs.getString("L5_4_FLG_TIPOLOGIA"));

		// colonna [L5_4_DES_SISTEMA_INSTALLAZ]
		if (mapAllColumns || columnsToReadMap.get("L5_4_DES_SISTEMA_INSTALLAZ") != null)
			dto.setL54DesSistemaInstallaz(rs.getString("L5_4_DES_SISTEMA_INSTALLAZ"));

		// colonna [L5_4_DATA_SOSTITUZ]
		if (mapAllColumns || columnsToReadMap.get("L5_4_DATA_SOSTITUZ") != null)
			dto.setL54DataSostituz(rs.getDate("L5_4_DATA_SOSTITUZ"));

		// colonna [L5_4_DES_SISTEMA_SOSTITUZ]
		if (mapAllColumns || columnsToReadMap.get("L5_4_DES_SISTEMA_SOSTITUZ") != null)
			dto.setL54DesSistemaSostituz(rs.getString("L5_4_DES_SISTEMA_SOSTITUZ"));

		// colonna [L6_1_FLG_VERTICALE]
		if (mapAllColumns || columnsToReadMap.get("L6_1_FLG_VERTICALE") != null)
			dto.setL61FlgVerticale(rs.getBigDecimal("L6_1_FLG_VERTICALE"));

		// colonna [L6_1_FLG_ORIZZONTALE]
		if (mapAllColumns || columnsToReadMap.get("L6_1_FLG_ORIZZONTALE") != null)
			dto.setL61FlgOrizzontale(rs.getBigDecimal("L6_1_FLG_ORIZZONTALE"));

		// colonna [L6_1_FLG_CAN]
		if (mapAllColumns || columnsToReadMap.get("L6_1_FLG_CAN") != null)
			dto.setL61FlgCan(rs.getBigDecimal("L6_1_FLG_CAN"));

		// colonna [L6_1_ALTRO]
		if (mapAllColumns || columnsToReadMap.get("L6_1_ALTRO") != null)
			dto.setL61Altro(rs.getString("L6_1_ALTRO"));

		// colonna [L6_2_FLG_COIBENT]
		if (mapAllColumns || columnsToReadMap.get("L6_2_FLG_COIBENT") != null)
			dto.setL62FlgCoibent(rs.getString("L6_2_FLG_COIBENT"));

		// colonna [L6_2_NOTE]
		if (mapAllColumns || columnsToReadMap.get("L6_2_NOTE") != null)
			dto.setL62Note(rs.getString("L6_2_NOTE"));

		// colonna [L7_0_FLG_RADIATORI]
		if (mapAllColumns || columnsToReadMap.get("L7_0_FLG_RADIATORI") != null)
			dto.setL70FlgRadiatori(rs.getBigDecimal("L7_0_FLG_RADIATORI"));

		// colonna [L7_0_FLG_TERMOCONVETTORI]
		if (mapAllColumns || columnsToReadMap.get("L7_0_FLG_TERMOCONVETTORI") != null)
			dto.setL70FlgTermoconvettori(rs.getBigDecimal("L7_0_FLG_TERMOCONVETTORI"));

		// colonna [L7_0_FLG_VENTILCONVETTORI]
		if (mapAllColumns || columnsToReadMap.get("L7_0_FLG_VENTILCONVETTORI") != null)
			dto.setL70FlgVentilconvettori(rs.getBigDecimal("L7_0_FLG_VENTILCONVETTORI"));

		// colonna [L7_0_FLG_PANNELLI]
		if (mapAllColumns || columnsToReadMap.get("L7_0_FLG_PANNELLI") != null)
			dto.setL70FlgPannelli(rs.getBigDecimal("L7_0_FLG_PANNELLI"));

		// colonna [L7_0_FLG_BOCCHETTE]
		if (mapAllColumns || columnsToReadMap.get("L7_0_FLG_BOCCHETTE") != null)
			dto.setL70FlgBocchette(rs.getBigDecimal("L7_0_FLG_BOCCHETTE"));

		// colonna [L7_0_FLG_STRISCE]
		if (mapAllColumns || columnsToReadMap.get("L7_0_FLG_STRISCE") != null)
			dto.setL70FlgStrisce(rs.getBigDecimal("L7_0_FLG_STRISCE"));

		// colonna [L7_0_FLG_TRAVI]
		if (mapAllColumns || columnsToReadMap.get("L7_0_FLG_TRAVI") != null)
			dto.setL70FlgTravi(rs.getBigDecimal("L7_0_FLG_TRAVI"));

		// colonna [L7_0_ALTRO]
		if (mapAllColumns || columnsToReadMap.get("L7_0_ALTRO") != null)
			dto.setL70Altro(rs.getString("L7_0_ALTRO"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		return dto;
	}

}
