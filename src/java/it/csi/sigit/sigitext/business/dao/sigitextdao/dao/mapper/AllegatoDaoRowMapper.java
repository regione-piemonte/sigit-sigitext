package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO AllegatoDao
 * @generated
 */
public class AllegatoDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	AllegatoDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public AllegatoDaoRowMapper(String[] columnsToRead, Class dtoClass, AllegatoDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (AllegatoDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return AllegatoDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof AllegatoDto) {
			return mapRow_internal((AllegatoDto) dtoInstance, rs, row);
		}

		if (dtoInstance instanceof AllegatoByCodiceImpiantoDto) {
			return mapRow_internal((AllegatoByCodiceImpiantoDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public AllegatoDto mapRow_internal(AllegatoDto objectToFill, ResultSet rs, int row) throws SQLException {
		AllegatoDto dto = objectToFill;

		// colonna [ID_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("ID_ALLEGATO") != null)
			dto.setIdAllegato(rs.getBigDecimal("ID_ALLEGATO"));

		// colonna [FK_STATO_RAPP]
		if (mapAllColumns || columnsToReadMap.get("FK_STATO_RAPP") != null)
			dto.setFkStatoRapp(rs.getBigDecimal("FK_STATO_RAPP"));

		// colonna [FK_TIPO_DOCUMENTO]
		if (mapAllColumns || columnsToReadMap.get("FK_TIPO_DOCUMENTO") != null)
			dto.setFkTipoDocumento(rs.getBigDecimal("FK_TIPO_DOCUMENTO"));

		// colonna [FK_SIGLA_BOLLINO]
		if (mapAllColumns || columnsToReadMap.get("FK_SIGLA_BOLLINO") != null)
			dto.setFkSiglaBollino(rs.getString("FK_SIGLA_BOLLINO"));

		// colonna [FK_NUMERO_BOLLINO]
		if (mapAllColumns || columnsToReadMap.get("FK_NUMERO_BOLLINO") != null)
			dto.setFkNumeroBollino(rs.getBigDecimal("FK_NUMERO_BOLLINO"));

		// colonna [DATA_CONTROLLO]
		if (mapAllColumns || columnsToReadMap.get("DATA_CONTROLLO") != null)
			dto.setDataControllo(rs.getDate("DATA_CONTROLLO"));

		// colonna [B_FLG_LIBRETTO_USO]
		if (mapAllColumns || columnsToReadMap.get("B_FLG_LIBRETTO_USO") != null)
			dto.setBFlgLibrettoUso(rs.getBigDecimal("B_FLG_LIBRETTO_USO"));

		// colonna [B_FLG_DICHIAR_CONFORM]
		if (mapAllColumns || columnsToReadMap.get("B_FLG_DICHIAR_CONFORM") != null)
			dto.setBFlgDichiarConform(rs.getBigDecimal("B_FLG_DICHIAR_CONFORM"));

		// colonna [B_FLG_LIB_IMP]
		if (mapAllColumns || columnsToReadMap.get("B_FLG_LIB_IMP") != null)
			dto.setBFlgLibImp(rs.getBigDecimal("B_FLG_LIB_IMP"));

		// colonna [B_FLG_LIB_COMPL]
		if (mapAllColumns || columnsToReadMap.get("B_FLG_LIB_COMPL") != null)
			dto.setBFlgLibCompl(rs.getBigDecimal("B_FLG_LIB_COMPL"));

		// colonna [F_OSSERVAZIONI]
		if (mapAllColumns || columnsToReadMap.get("F_OSSERVAZIONI") != null)
			dto.setFOsservazioni(rs.getString("F_OSSERVAZIONI"));

		// colonna [F_RACCOMANDAZIONI]
		if (mapAllColumns || columnsToReadMap.get("F_RACCOMANDAZIONI") != null)
			dto.setFRaccomandazioni(rs.getString("F_RACCOMANDAZIONI"));

		// colonna [F_PRESCRIZIONI]
		if (mapAllColumns || columnsToReadMap.get("F_PRESCRIZIONI") != null)
			dto.setFPrescrizioni(rs.getString("F_PRESCRIZIONI"));

		// colonna [F_FLG_PUO_FUNZIONARE]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_PUO_FUNZIONARE") != null)
			dto.setFFlgPuoFunzionare(rs.getBigDecimal("F_FLG_PUO_FUNZIONARE"));

		// colonna [F_INTERVENTO_ENTRO]
		if (mapAllColumns || columnsToReadMap.get("F_INTERVENTO_ENTRO") != null)
			dto.setFInterventoEntro(rs.getDate("F_INTERVENTO_ENTRO"));

		// colonna [F_ORA_ARRIVO]
		if (mapAllColumns || columnsToReadMap.get("F_ORA_ARRIVO") != null)
			dto.setFOraArrivo(rs.getString("F_ORA_ARRIVO"));

		// colonna [F_ORA_PARTENZA]
		if (mapAllColumns || columnsToReadMap.get("F_ORA_PARTENZA") != null)
			dto.setFOraPartenza(rs.getString("F_ORA_PARTENZA"));

		// colonna [F_DENOMINAZ_TECNICO]
		if (mapAllColumns || columnsToReadMap.get("F_DENOMINAZ_TECNICO") != null)
			dto.setFDenominazTecnico(rs.getString("F_DENOMINAZ_TECNICO"));

		// colonna [F_FLG_FIRMA_TECNICO]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_FIRMA_TECNICO") != null)
			dto.setFFlgFirmaTecnico(rs.getBigDecimal("F_FLG_FIRMA_TECNICO"));

		// colonna [F_FLG_FIRMA_RESPONSABILE]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_FIRMA_RESPONSABILE") != null)
			dto.setFFlgFirmaResponsabile(rs.getBigDecimal("F_FLG_FIRMA_RESPONSABILE"));

		// colonna [DATA_INVIO]
		if (mapAllColumns || columnsToReadMap.get("DATA_INVIO") != null)
			dto.setDataInvio(rs.getDate("DATA_INVIO"));

		// colonna [NOME_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("NOME_ALLEGATO") != null)
			dto.setNomeAllegato(rs.getString("NOME_ALLEGATO"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [CF_REDATTORE]
		if (mapAllColumns || columnsToReadMap.get("CF_REDATTORE") != null)
			dto.setCfRedattore(rs.getString("CF_REDATTORE"));

		// colonna [UID_INDEX]
		if (mapAllColumns || columnsToReadMap.get("UID_INDEX") != null)
			dto.setUidIndex(rs.getString("UID_INDEX"));

		// colonna [F_FIRMA_TECNICO]
		if (mapAllColumns || columnsToReadMap.get("F_FIRMA_TECNICO") != null)
			dto.setFFirmaTecnico(rs.getString("F_FIRMA_TECNICO"));

		// colonna [F_FIRMA_RESPONSABILE]
		if (mapAllColumns || columnsToReadMap.get("F_FIRMA_RESPONSABILE") != null)
			dto.setFFirmaResponsabile(rs.getString("F_FIRMA_RESPONSABILE"));

		// colonna [FLG_CONTROLLO_BOZZA]
		if (mapAllColumns || columnsToReadMap.get("FLG_CONTROLLO_BOZZA") != null)
			dto.setFlgControlloBozza(rs.getBigDecimal("FLG_CONTROLLO_BOZZA"));

		// colonna [A_POTENZA_TERMICA_NOMINALE_MAX]
		if (mapAllColumns || columnsToReadMap.get("A_POTENZA_TERMICA_NOMINALE_MAX") != null)
			dto.setAPotenzaTermicaNominaleMax(rs.getBigDecimal("A_POTENZA_TERMICA_NOMINALE_MAX"));

		// colonna [ELENCO_COMBUSTIBILI]
		if (mapAllColumns || columnsToReadMap.get("ELENCO_COMBUSTIBILI") != null)
			dto.setElencoCombustibili(rs.getString("ELENCO_COMBUSTIBILI"));

		// colonna [ELENCO_APPARECCHIATURE]
		if (mapAllColumns || columnsToReadMap.get("ELENCO_APPARECCHIATURE") != null)
			dto.setElencoApparecchiature(rs.getString("ELENCO_APPARECCHIATURE"));

		// colonna [DATA_RESPINTA]
		if (mapAllColumns || columnsToReadMap.get("DATA_RESPINTA") != null)
			dto.setDataRespinta(rs.getDate("DATA_RESPINTA"));

		// colonna [MOTIVO_RESPINTA]
		if (mapAllColumns || columnsToReadMap.get("MOTIVO_RESPINTA") != null)
			dto.setMotivoRespinta(rs.getString("MOTIVO_RESPINTA"));

		// colonna [FK_PG_CAT]
		if (mapAllColumns || columnsToReadMap.get("FK_PG_CAT") != null)
			dto.setFkPgCat(rs.getBigDecimal("FK_PG_CAT"));

		// colonna [ABCDF_CONTROLLOWEB]
		if (mapAllColumns || columnsToReadMap.get("ABCDF_CONTROLLOWEB") != null)
			dto.setAbcdfControlloweb(rs.getTimestamp("ABCDF_CONTROLLOWEB"));

		// colonna [FK_TIPO_MANUTENZIONE]
		if (mapAllColumns || columnsToReadMap.get("FK_TIPO_MANUTENZIONE") != null)
			dto.setFkTipoManutenzione((Integer) rs.getObject("FK_TIPO_MANUTENZIONE"));

		// colonna [ALTRO_DESCR]
		if (mapAllColumns || columnsToReadMap.get("ALTRO_DESCR") != null)
			dto.setAltroDescr(rs.getString("ALTRO_DESCR"));

		// colonna [FK_ISPEZ_ISPET]
		if (mapAllColumns || columnsToReadMap.get("FK_ISPEZ_ISPET") != null)
			dto.setFkIspezIspet(rs.getBigDecimal("FK_ISPEZ_ISPET"));

		// colonna [DT_INVIO_MEMO]
		if (mapAllColumns || columnsToReadMap.get("DT_INVIO_MEMO") != null)
			dto.setDtInvioMemo(rs.getTimestamp("DT_INVIO_MEMO"));

		// colonna [MAIL_INVIO_MEMO]
		if (mapAllColumns || columnsToReadMap.get("MAIL_INVIO_MEMO") != null)
			dto.setMailInvioMemo(rs.getString("MAIL_INVIO_MEMO"));

		return dto;
	}

	/**
	 * Metodo specifico di mapping relativo al DTO custom AllegatoByCodiceImpiantoDto.
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return AllegatoByCodiceImpiantoDto
	 * @generated
	 */

	public AllegatoByCodiceImpiantoDto mapRow_internal(AllegatoByCodiceImpiantoDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		AllegatoByCodiceImpiantoDto dto = objectToFill;

		if (mapAllColumns || columnsToReadMap.get("DES_TIPO_DOCUMENTO") != null)
			dto.setTipodocDesTipoDocumento(rs.getString("DES_TIPO_DOCUMENTO"));

		if (mapAllColumns || columnsToReadMap.get("FK_SIGLA_BOLLINO") != null)
			dto.setAllegatoFkSiglaBollino(rs.getString("FK_SIGLA_BOLLINO"));

		if (mapAllColumns || columnsToReadMap.get("FK_NUMERO_BOLLINO") != null)
			dto.setAllegatoFkNumeroBollino(rs.getBigDecimal("FK_NUMERO_BOLLINO"));

		if (mapAllColumns || columnsToReadMap.get("DATA_CONTROLLO") != null)
			dto.setAllegatoDataControllo(rs.getDate("DATA_CONTROLLO"));

		if (mapAllColumns || columnsToReadMap.get("ELENCO_APPARECCHIATURE") != null)
			dto.setAllegatoElencoApparecchiature(rs.getString("ELENCO_APPARECCHIATURE"));

		if (mapAllColumns || columnsToReadMap.get("UID_INDEX") != null)
			dto.setAllegatoUidIndex(rs.getString("UID_INDEX"));

		return dto;
	}

}
