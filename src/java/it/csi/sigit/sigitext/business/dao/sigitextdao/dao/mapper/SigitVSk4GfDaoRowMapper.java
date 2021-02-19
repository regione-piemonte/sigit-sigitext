package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitVSk4GfDao
 * @generated
 */
public class SigitVSk4GfDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitVSk4GfDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitVSk4GfDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitVSk4GfDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitVSk4GfDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitVSk4GfDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitVSk4GfDto) {
			return mapRow_internal((SigitVSk4GfDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitVSk4GfDto mapRow_internal(SigitVSk4GfDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitVSk4GfDto dto = objectToFill;

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [ID_TIPO_COMPONENTE]
		if (mapAllColumns || columnsToReadMap.get("ID_TIPO_COMPONENTE") != null)
			dto.setIdTipoComponente(rs.getString("ID_TIPO_COMPONENTE"));

		// colonna [PROGRESSIVO]
		if (mapAllColumns || columnsToReadMap.get("PROGRESSIVO") != null)
			dto.setProgressivo(rs.getBigDecimal("PROGRESSIVO"));

		// colonna [DATA_INSTALL]
		if (mapAllColumns || columnsToReadMap.get("DATA_INSTALL") != null)
			dto.setDataInstall(rs.getDate("DATA_INSTALL"));

		// colonna [MATRICOLA]
		if (mapAllColumns || columnsToReadMap.get("MATRICOLA") != null)
			dto.setMatricola(rs.getString("MATRICOLA"));

		// colonna [FK_MARCA]
		if (mapAllColumns || columnsToReadMap.get("FK_MARCA") != null)
			dto.setFkMarca(rs.getBigDecimal("FK_MARCA"));

		// colonna [DES_MARCA]
		if (mapAllColumns || columnsToReadMap.get("DES_MARCA") != null)
			dto.setDesMarca(rs.getString("DES_MARCA"));

		// colonna [ID_COMBUSTIBILE]
		if (mapAllColumns || columnsToReadMap.get("ID_COMBUSTIBILE") != null)
			dto.setIdCombustibile(rs.getBigDecimal("ID_COMBUSTIBILE"));

		// colonna [DES_COMBUSTIBILE]
		if (mapAllColumns || columnsToReadMap.get("DES_COMBUSTIBILE") != null)
			dto.setDesCombustibile(rs.getString("DES_COMBUSTIBILE"));

		// colonna [FK_DETTAGLIO_GF]
		if (mapAllColumns || columnsToReadMap.get("FK_DETTAGLIO_GF") != null)
			dto.setFkDettaglioGf(rs.getBigDecimal("FK_DETTAGLIO_GF"));

		// colonna [DES_DETTAGLIO_GF]
		if (mapAllColumns || columnsToReadMap.get("DES_DETTAGLIO_GF") != null)
			dto.setDesDettaglioGf(rs.getString("DES_DETTAGLIO_GF"));

		// colonna [MODELLO]
		if (mapAllColumns || columnsToReadMap.get("MODELLO") != null)
			dto.setModello(rs.getString("MODELLO"));

		// colonna [FLG_SORGENTE_EXT]
		if (mapAllColumns || columnsToReadMap.get("FLG_SORGENTE_EXT") != null)
			dto.setFlgSorgenteExt(rs.getString("FLG_SORGENTE_EXT"));

		// colonna [FLG_FLUIDO_UTENZE]
		if (mapAllColumns || columnsToReadMap.get("FLG_FLUIDO_UTENZE") != null)
			dto.setFlgFluidoUtenze(rs.getString("FLG_FLUIDO_UTENZE"));

		// colonna [FLUIDO_FRIGORIGENO]
		if (mapAllColumns || columnsToReadMap.get("FLUIDO_FRIGORIGENO") != null)
			dto.setFluidoFrigorigeno(rs.getString("FLUIDO_FRIGORIGENO"));

		// colonna [N_CIRCUITI]
		if (mapAllColumns || columnsToReadMap.get("N_CIRCUITI") != null)
			dto.setNCircuiti(rs.getBigDecimal("N_CIRCUITI"));

		// colonna [RAFFRESCAMENTO_EER]
		if (mapAllColumns || columnsToReadMap.get("RAFFRESCAMENTO_EER") != null)
			dto.setRaffrescamentoEer(rs.getString("RAFFRESCAMENTO_EER"));

		// colonna [RAFF_POTENZA_KW]
		if (mapAllColumns || columnsToReadMap.get("RAFF_POTENZA_KW") != null)
			dto.setRaffPotenzaKw(rs.getBigDecimal("RAFF_POTENZA_KW"));

		// colonna [RAFF_POTENZA_ASS]
		if (mapAllColumns || columnsToReadMap.get("RAFF_POTENZA_ASS") != null)
			dto.setRaffPotenzaAss(rs.getBigDecimal("RAFF_POTENZA_ASS"));

		// colonna [RISCALDAMENTO_COP]
		if (mapAllColumns || columnsToReadMap.get("RISCALDAMENTO_COP") != null)
			dto.setRiscaldamentoCop(rs.getString("RISCALDAMENTO_COP"));

		// colonna [RISC_POTENZA_KW]
		if (mapAllColumns || columnsToReadMap.get("RISC_POTENZA_KW") != null)
			dto.setRiscPotenzaKw(rs.getBigDecimal("RISC_POTENZA_KW"));

		// colonna [RISC_POTENZA_ASS_KW]
		if (mapAllColumns || columnsToReadMap.get("RISC_POTENZA_ASS_KW") != null)
			dto.setRiscPotenzaAssKw(rs.getBigDecimal("RISC_POTENZA_ASS_KW"));

		// colonna [FLG_DISMISSIONE]
		if (mapAllColumns || columnsToReadMap.get("FLG_DISMISSIONE") != null)
			dto.setFlgDismissione(rs.getBigDecimal("FLG_DISMISSIONE"));

		// colonna [DATA_DISMISS]
		if (mapAllColumns || columnsToReadMap.get("DATA_DISMISS") != null)
			dto.setDataDismiss(rs.getDate("DATA_DISMISS"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [POTENZA_TERMICA_KW]
		if (mapAllColumns || columnsToReadMap.get("POTENZA_TERMICA_KW") != null)
			dto.setPotenzaTermicaKw(rs.getBigDecimal("POTENZA_TERMICA_KW"));

		// colonna [DATA_CONTROLLO]
		if (mapAllColumns || columnsToReadMap.get("DATA_CONTROLLO") != null)
			dto.setDataControllo(rs.getDate("DATA_CONTROLLO"));

		// colonna [TEMPO_MANUT_ANNI]
		if (mapAllColumns || columnsToReadMap.get("TEMPO_MANUT_ANNI") != null)
			dto.setTempoManutAnni(rs.getBigDecimal("TEMPO_MANUT_ANNI"));

		// colonna [ID_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("ID_ALLEGATO") != null)
			dto.setIdAllegato(rs.getBigDecimal("ID_ALLEGATO"));

		// colonna [FK_TIPO_DOCUMENTO]
		if (mapAllColumns || columnsToReadMap.get("FK_TIPO_DOCUMENTO") != null)
			dto.setFkTipoDocumento(rs.getBigDecimal("FK_TIPO_DOCUMENTO"));

		// colonna [DES_TIPO_DOCUMENTO]
		if (mapAllColumns || columnsToReadMap.get("DES_TIPO_DOCUMENTO") != null)
			dto.setDesTipoDocumento(rs.getString("DES_TIPO_DOCUMENTO"));

		return dto;
	}

}
