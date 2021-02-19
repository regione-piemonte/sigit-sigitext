package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO UnitaImmobiliareDao
 * @generated
 */
public class UnitaImmobiliareDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	UnitaImmobiliareDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public UnitaImmobiliareDaoRowMapper(String[] columnsToRead, Class dtoClass, UnitaImmobiliareDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (UnitaImmobiliareDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return UnitaImmobiliareDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof UnitaImmobiliareDto) {
			return mapRow_internal((UnitaImmobiliareDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public UnitaImmobiliareDto mapRow_internal(UnitaImmobiliareDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		UnitaImmobiliareDto dto = objectToFill;

		// colonna [ID_UNITA_IMM]
		if (mapAllColumns || columnsToReadMap.get("ID_UNITA_IMM") != null)
			dto.setIdUnitaImm(rs.getBigDecimal("ID_UNITA_IMM"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [FK_L2]
		if (mapAllColumns || columnsToReadMap.get("FK_L2") != null)
			dto.setFkL2(rs.getBigDecimal("FK_L2"));

		// colonna [INDIRIZZO_SITAD]
		if (mapAllColumns || columnsToReadMap.get("INDIRIZZO_SITAD") != null)
			dto.setIndirizzoSitad(rs.getString("INDIRIZZO_SITAD"));

		// colonna [INDIRIZZO_NON_TROVATO]
		if (mapAllColumns || columnsToReadMap.get("INDIRIZZO_NON_TROVATO") != null)
			dto.setIndirizzoNonTrovato(rs.getString("INDIRIZZO_NON_TROVATO"));

		// colonna [CIVICO]
		if (mapAllColumns || columnsToReadMap.get("CIVICO") != null)
			dto.setCivico(rs.getString("CIVICO"));

		// colonna [CAP]
		if (mapAllColumns || columnsToReadMap.get("CAP") != null)
			dto.setCap(rs.getString("CAP"));

		// colonna [SCALA]
		if (mapAllColumns || columnsToReadMap.get("SCALA") != null)
			dto.setScala(rs.getString("SCALA"));

		// colonna [PALAZZO]
		if (mapAllColumns || columnsToReadMap.get("PALAZZO") != null)
			dto.setPalazzo(rs.getString("PALAZZO"));

		// colonna [INTERNO]
		if (mapAllColumns || columnsToReadMap.get("INTERNO") != null)
			dto.setInterno(rs.getString("INTERNO"));

		// colonna [NOTE]
		if (mapAllColumns || columnsToReadMap.get("NOTE") != null)
			dto.setNote(rs.getString("NOTE"));

		// colonna [FLG_PRINCIPALE]
		if (mapAllColumns || columnsToReadMap.get("FLG_PRINCIPALE") != null)
			dto.setFlgPrincipale(rs.getBigDecimal("FLG_PRINCIPALE"));

		// colonna [SEZIONE]
		if (mapAllColumns || columnsToReadMap.get("SEZIONE") != null)
			dto.setSezione(rs.getString("SEZIONE"));

		// colonna [FOGLIO]
		if (mapAllColumns || columnsToReadMap.get("FOGLIO") != null)
			dto.setFoglio(rs.getString("FOGLIO"));

		// colonna [PARTICELLA]
		if (mapAllColumns || columnsToReadMap.get("PARTICELLA") != null)
			dto.setParticella(rs.getString("PARTICELLA"));

		// colonna [SUBALTERNO]
		if (mapAllColumns || columnsToReadMap.get("SUBALTERNO") != null)
			dto.setSubalterno(rs.getString("SUBALTERNO"));

		// colonna [POD_ELETTRICO]
		if (mapAllColumns || columnsToReadMap.get("POD_ELETTRICO") != null)
			dto.setPodElettrico(rs.getString("POD_ELETTRICO"));

		// colonna [PDR_GAS]
		if (mapAllColumns || columnsToReadMap.get("PDR_GAS") != null)
			dto.setPdrGas(rs.getString("PDR_GAS"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [L1_2_FLG_SINGOLA_UNITA]
		if (mapAllColumns || columnsToReadMap.get("L1_2_FLG_SINGOLA_UNITA") != null)
			dto.setL12FlgSingolaUnita(rs.getBigDecimal("L1_2_FLG_SINGOLA_UNITA"));

		// colonna [L1_2_FK_CATEGORIA]
		if (mapAllColumns || columnsToReadMap.get("L1_2_FK_CATEGORIA") != null)
			dto.setL12FkCategoria(rs.getString("L1_2_FK_CATEGORIA"));

		// colonna [L1_2_VOL_RISC_M3]
		if (mapAllColumns || columnsToReadMap.get("L1_2_VOL_RISC_M3") != null)
			dto.setL12VolRiscM3(rs.getBigDecimal("L1_2_VOL_RISC_M3"));

		// colonna [L1_2_VOL_RAFF_M3]
		if (mapAllColumns || columnsToReadMap.get("L1_2_VOL_RAFF_M3") != null)
			dto.setL12VolRaffM3(rs.getBigDecimal("L1_2_VOL_RAFF_M3"));

		// colonna [FLG_NOPDR]
		if (mapAllColumns || columnsToReadMap.get("FLG_NOPDR") != null)
			dto.setFlgNopdr(rs.getBigDecimal("FLG_NOPDR"));

		// colonna [FLG_NOACCATASTATO]
		if (mapAllColumns || columnsToReadMap.get("FLG_NOACCATASTATO") != null)
			dto.setFlgNoaccatastato(rs.getBigDecimal("FLG_NOACCATASTATO"));

		return dto;
	}

}
