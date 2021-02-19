package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitVRicercaIspezioniDao
 * @generated
 */
public class SigitVRicercaIspezioniDaoRowMapper extends BaseDaoRowMapper
		implements
			org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitVRicercaIspezioniDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitVRicercaIspezioniDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitVRicercaIspezioniDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitVRicercaIspezioniDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitVRicercaIspezioniDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitVRicercaIspezioniDto) {
			return mapRow_internal((SigitVRicercaIspezioniDto) dtoInstance, rs, row);
		}

		if (dtoInstance instanceof SigitVRicercaIspezioniConsByCodiceImpiantoDto) {
			return mapRow_internal((SigitVRicercaIspezioniConsByCodiceImpiantoDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitVRicercaIspezioniDto mapRow_internal(SigitVRicercaIspezioniDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitVRicercaIspezioniDto dto = objectToFill;

		// colonna [ID_ISPEZIONE_2018]
		if (mapAllColumns || columnsToReadMap.get("ID_ISPEZIONE_2018") != null)
			dto.setIdIspezione2018(rs.getBigDecimal("ID_ISPEZIONE_2018"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [ID_ISPEZ_ISPET]
		if (mapAllColumns || columnsToReadMap.get("ID_ISPEZ_ISPET") != null)
			dto.setIdIspezIspet(rs.getBigDecimal("ID_ISPEZ_ISPET"));

		// colonna [FK_STATO_ISPEZIONE]
		if (mapAllColumns || columnsToReadMap.get("FK_STATO_ISPEZIONE") != null)
			dto.setFkStatoIspezione(rs.getBigDecimal("FK_STATO_ISPEZIONE"));

		// colonna [DES_STATO_ISPEZIONE]
		if (mapAllColumns || columnsToReadMap.get("DES_STATO_ISPEZIONE") != null)
			dto.setDesStatoIspezione(rs.getString("DES_STATO_ISPEZIONE"));

		// colonna [ENTE_COMPETENTE]
		if (mapAllColumns || columnsToReadMap.get("ENTE_COMPETENTE") != null)
			dto.setEnteCompetente(rs.getString("ENTE_COMPETENTE"));

		// colonna [DT_CREAZIONE]
		if (mapAllColumns || columnsToReadMap.get("DT_CREAZIONE") != null)
			dto.setDtCreazione(rs.getTimestamp("DT_CREAZIONE"));

		// colonna [DT_CONCLUSIONE]
		if (mapAllColumns || columnsToReadMap.get("DT_CONCLUSIONE") != null)
			dto.setDtConclusione(rs.getTimestamp("DT_CONCLUSIONE"));

		// colonna [FLG_ESITO]
		if (mapAllColumns || columnsToReadMap.get("FLG_ESITO") != null)
			dto.setFlgEsito(rs.getBigDecimal("FLG_ESITO"));

		// colonna [NOTE]
		if (mapAllColumns || columnsToReadMap.get("NOTE") != null)
			dto.setNote(rs.getString("NOTE"));

		// colonna [ID_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("ID_ALLEGATO") != null)
			dto.setIdAllegato(rs.getBigDecimal("ID_ALLEGATO"));

		// colonna [FK_STATO_RAPP]
		if (mapAllColumns || columnsToReadMap.get("FK_STATO_RAPP") != null)
			dto.setFkStatoRapp(rs.getBigDecimal("FK_STATO_RAPP"));

		// colonna [DES_STATO_RAPP]
		if (mapAllColumns || columnsToReadMap.get("DES_STATO_RAPP") != null)
			dto.setDesStatoRapp(rs.getString("DES_STATO_RAPP"));

		// colonna [FK_TIPO_DOCUMENTO]
		if (mapAllColumns || columnsToReadMap.get("FK_TIPO_DOCUMENTO") != null)
			dto.setFkTipoDocumento(rs.getBigDecimal("FK_TIPO_DOCUMENTO"));

		// colonna [DES_TIPO_DOCUMENTO]
		if (mapAllColumns || columnsToReadMap.get("DES_TIPO_DOCUMENTO") != null)
			dto.setDesTipoDocumento(rs.getString("DES_TIPO_DOCUMENTO"));

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

		// colonna [DATA_ULT_MOD_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD_ALLEGATO") != null)
			dto.setDataUltModAllegato(rs.getTimestamp("DATA_ULT_MOD_ALLEGATO"));

		// colonna [UTENTE_ULT_MOD_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD_ALLEGATO") != null)
			dto.setUtenteUltModAllegato(rs.getString("UTENTE_ULT_MOD_ALLEGATO"));

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

		// colonna [ID_PERSONA_FISICA]
		if (mapAllColumns || columnsToReadMap.get("ID_PERSONA_FISICA") != null)
			dto.setIdPersonaFisica(rs.getBigDecimal("ID_PERSONA_FISICA"));

		// colonna [NOME]
		if (mapAllColumns || columnsToReadMap.get("NOME") != null)
			dto.setNome(rs.getString("NOME"));

		// colonna [COGNOME]
		if (mapAllColumns || columnsToReadMap.get("COGNOME") != null)
			dto.setCognome(rs.getString("COGNOME"));

		// colonna [CODICE_FISCALE]
		if (mapAllColumns || columnsToReadMap.get("CODICE_FISCALE") != null)
			dto.setCodiceFiscale(rs.getString("CODICE_FISCALE"));

		// colonna [ISTAT_PROV_COMPETENZA]
		if (mapAllColumns || columnsToReadMap.get("ISTAT_PROV_COMPETENZA") != null)
			dto.setIstatProvCompetenza(rs.getString("ISTAT_PROV_COMPETENZA"));

		// colonna [FLG_ACC_SOSTITUTIVO]
		if (mapAllColumns || columnsToReadMap.get("FLG_ACC_SOSTITUTIVO") != null)
			dto.setFlgAccSostitutivo(rs.getBigDecimal("FLG_ACC_SOSTITUTIVO"));

		// colonna [CF_ISPETTORE_SECONDARIO]
		if (mapAllColumns || columnsToReadMap.get("CF_ISPETTORE_SECONDARIO") != null)
			dto.setCfIspettoreSecondario(rs.getString("CF_ISPETTORE_SECONDARIO"));

		// colonna [FLG_ISP_PAGAMENTO]
		if (mapAllColumns || columnsToReadMap.get("FLG_ISP_PAGAMENTO") != null)
			dto.setFlgIspPagamento(rs.getBigDecimal("FLG_ISP_PAGAMENTO"));

		return dto;
	}

	/**
	 * Metodo specifico di mapping relativo al DTO custom SigitVRicercaIspezioniConsByCodiceImpiantoDto.
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitVRicercaIspezioniConsByCodiceImpiantoDto
	 * @generated
	 */

	public SigitVRicercaIspezioniConsByCodiceImpiantoDto mapRow_internal(
			SigitVRicercaIspezioniConsByCodiceImpiantoDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitVRicercaIspezioniConsByCodiceImpiantoDto dto = objectToFill;

		// lettura colonna [ID_ISPEZIONE_2018]
		if (mapAllColumns || columnsToReadMap.get("ID_ISPEZIONE_2018") != null)
			dto.setIdIspezione2018(rs.getBigDecimal("ID_ISPEZIONE_2018"));

		// lettura colonna [DT_CREAZIONE]
		if (mapAllColumns || columnsToReadMap.get("DT_CREAZIONE") != null)
			dto.setDtCreazione(rs.getTimestamp("DT_CREAZIONE"));

		// lettura colonna [ENTE_COMPETENTE]
		if (mapAllColumns || columnsToReadMap.get("ENTE_COMPETENTE") != null)
			dto.setEnteCompetente(rs.getString("ENTE_COMPETENTE"));

		// lettura colonna [NOTE]
		if (mapAllColumns || columnsToReadMap.get("NOTE") != null)
			dto.setNote(rs.getString("NOTE"));

		// lettura colonna [FLG_ESITO]
		if (mapAllColumns || columnsToReadMap.get("FLG_ESITO") != null)
			dto.setFlgEsito(rs.getBigDecimal("FLG_ESITO"));

		if (mapAllColumns || columnsToReadMap.get("MAX_ID_ISPEZ_ISPET") != null)
			dto.setMax_id_ispez_ispet(rs.getBigDecimal("max_id_ispez_ispet"));

		return dto;
	}

}
