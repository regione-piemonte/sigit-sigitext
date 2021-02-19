package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTConsumo14_4Dao
 * @generated
 */
public class SigitTConsumo14_4DaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTConsumo14_4DaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTConsumo14_4DaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTConsumo14_4Dao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTConsumo14_4DaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTConsumo14_4Dto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTConsumo14_4Dto) {
			return mapRow_internal((SigitTConsumo14_4Dto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTConsumo14_4Dto mapRow_internal(SigitTConsumo14_4Dto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTConsumo14_4Dto dto = objectToFill;

		// colonna [ID_CONSUMO_H2O]
		if (mapAllColumns || columnsToReadMap.get("ID_CONSUMO_H2O") != null)
			dto.setIdConsumoH2o(rs.getBigDecimal("ID_CONSUMO_H2O"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [FLG_CIRCUITO_IT]
		if (mapAllColumns || columnsToReadMap.get("FLG_CIRCUITO_IT") != null)
			dto.setFlgCircuitoIt(rs.getBigDecimal("FLG_CIRCUITO_IT"));

		// colonna [FLG_CIRCUITO_ACS]
		if (mapAllColumns || columnsToReadMap.get("FLG_CIRCUITO_ACS") != null)
			dto.setFlgCircuitoAcs(rs.getBigDecimal("FLG_CIRCUITO_ACS"));

		// colonna [FLG_ACA]
		if (mapAllColumns || columnsToReadMap.get("FLG_ACA") != null)
			dto.setFlgAca(rs.getBigDecimal("FLG_ACA"));

		// colonna [NOME_PRODOTTO]
		if (mapAllColumns || columnsToReadMap.get("NOME_PRODOTTO") != null)
			dto.setNomeProdotto(rs.getString("NOME_PRODOTTO"));

		// colonna [QTA_CONSUMATA]
		if (mapAllColumns || columnsToReadMap.get("QTA_CONSUMATA") != null)
			dto.setQtaConsumata(rs.getBigDecimal("QTA_CONSUMATA"));

		// colonna [FK_UNITA_MISURA]
		if (mapAllColumns || columnsToReadMap.get("FK_UNITA_MISURA") != null)
			dto.setFkUnitaMisura(rs.getString("FK_UNITA_MISURA"));

		// colonna [ESERCIZIO_DA]
		if (mapAllColumns || columnsToReadMap.get("ESERCIZIO_DA") != null)
			dto.setEsercizioDa(rs.getBigDecimal("ESERCIZIO_DA"));

		// colonna [ESERCIZIO_A]
		if (mapAllColumns || columnsToReadMap.get("ESERCIZIO_A") != null)
			dto.setEsercizioA(rs.getBigDecimal("ESERCIZIO_A"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [ESERCIZIO]
		if (mapAllColumns || columnsToReadMap.get("ESERCIZIO") != null)
			dto.setEsercizio(rs.getString("ESERCIZIO"));

		return dto;
	}

}
