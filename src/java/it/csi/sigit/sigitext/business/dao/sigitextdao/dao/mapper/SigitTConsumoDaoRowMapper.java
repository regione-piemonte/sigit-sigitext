package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTConsumoDao
 * @generated
 */
public class SigitTConsumoDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTConsumoDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTConsumoDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTConsumoDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTConsumoDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTConsumoDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTConsumoDto) {
			return mapRow_internal((SigitTConsumoDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTConsumoDto mapRow_internal(SigitTConsumoDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTConsumoDto dto = objectToFill;

		// colonna [ID_CONSUMO]
		if (mapAllColumns || columnsToReadMap.get("ID_CONSUMO") != null)
			dto.setIdConsumo(rs.getBigDecimal("ID_CONSUMO"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [FK_TIPO_CONSUMO]
		if (mapAllColumns || columnsToReadMap.get("FK_TIPO_CONSUMO") != null)
			dto.setFkTipoConsumo(rs.getString("FK_TIPO_CONSUMO"));

		// colonna [FK_COMBUSTIBILE]
		if (mapAllColumns || columnsToReadMap.get("FK_COMBUSTIBILE") != null)
			dto.setFkCombustibile(rs.getBigDecimal("FK_COMBUSTIBILE"));

		// colonna [FK_UNITA_MISURA]
		if (mapAllColumns || columnsToReadMap.get("FK_UNITA_MISURA") != null)
			dto.setFkUnitaMisura(rs.getString("FK_UNITA_MISURA"));

		// colonna [ACQUISTI]
		if (mapAllColumns || columnsToReadMap.get("ACQUISTI") != null)
			dto.setAcquisti(rs.getString("ACQUISTI"));

		// colonna [LETTURA_INIZIALE]
		if (mapAllColumns || columnsToReadMap.get("LETTURA_INIZIALE") != null)
			dto.setLetturaIniziale(rs.getBigDecimal("LETTURA_INIZIALE"));

		// colonna [LETTURA_FINALE]
		if (mapAllColumns || columnsToReadMap.get("LETTURA_FINALE") != null)
			dto.setLetturaFinale(rs.getBigDecimal("LETTURA_FINALE"));

		// colonna [CONSUMO]
		if (mapAllColumns || columnsToReadMap.get("CONSUMO") != null)
			dto.setConsumo(rs.getBigDecimal("CONSUMO"));

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

		return dto;
	}

}
