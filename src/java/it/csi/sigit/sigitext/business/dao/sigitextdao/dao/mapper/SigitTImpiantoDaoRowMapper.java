package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTImpiantoDao
 * @generated
 */
public class SigitTImpiantoDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTImpiantoDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTImpiantoDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTImpiantoDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTImpiantoDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTImpiantoDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTImpiantoDto) {
			return mapRow_internal((SigitTImpiantoDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTImpiantoDto mapRow_internal(SigitTImpiantoDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitTImpiantoDto dto = objectToFill;

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [ISTAT_COMUNE]
		if (mapAllColumns || columnsToReadMap.get("ISTAT_COMUNE") != null)
			dto.setIstatComune(rs.getString("ISTAT_COMUNE"));

		// colonna [FK_STATO]
		if (mapAllColumns || columnsToReadMap.get("FK_STATO") != null)
			dto.setFkStato(rs.getBigDecimal("FK_STATO"));

		// colonna [DATA_ASSEGNAZIONE]
		if (mapAllColumns || columnsToReadMap.get("DATA_ASSEGNAZIONE") != null)
			dto.setDataAssegnazione(rs.getDate("DATA_ASSEGNAZIONE"));

		// colonna [DATA_DISMISSIONE]
		if (mapAllColumns || columnsToReadMap.get("DATA_DISMISSIONE") != null)
			dto.setDataDismissione(rs.getDate("DATA_DISMISSIONE"));

		// colonna [DENOMINAZIONE_COMUNE]
		if (mapAllColumns || columnsToReadMap.get("DENOMINAZIONE_COMUNE") != null)
			dto.setDenominazioneComune(rs.getString("DENOMINAZIONE_COMUNE"));

		// colonna [SIGLA_PROVINCIA]
		if (mapAllColumns || columnsToReadMap.get("SIGLA_PROVINCIA") != null)
			dto.setSiglaProvincia(rs.getString("SIGLA_PROVINCIA"));

		// colonna [DENOMINAZIONE_PROVINCIA]
		if (mapAllColumns || columnsToReadMap.get("DENOMINAZIONE_PROVINCIA") != null)
			dto.setDenominazioneProvincia(rs.getString("DENOMINAZIONE_PROVINCIA"));

		// colonna [L1_3_POT_H2O_KW]
		if (mapAllColumns || columnsToReadMap.get("L1_3_POT_H2O_KW") != null)
			dto.setL13PotH2oKw(rs.getBigDecimal("L1_3_POT_H2O_KW"));

		// colonna [L1_3_POT_CLIMA_INV_KW]
		if (mapAllColumns || columnsToReadMap.get("L1_3_POT_CLIMA_INV_KW") != null)
			dto.setL13PotClimaInvKw(rs.getBigDecimal("L1_3_POT_CLIMA_INV_KW"));

		// colonna [L1_3_POT_CLIMA_EST_KW]
		if (mapAllColumns || columnsToReadMap.get("L1_3_POT_CLIMA_EST_KW") != null)
			dto.setL13PotClimaEstKw(rs.getBigDecimal("L1_3_POT_CLIMA_EST_KW"));

		// colonna [L1_3_ALTRO]
		if (mapAllColumns || columnsToReadMap.get("L1_3_ALTRO") != null)
			dto.setL13Altro(rs.getString("L1_3_ALTRO"));

		// colonna [L1_4_FLG_H2O]
		if (mapAllColumns || columnsToReadMap.get("L1_4_FLG_H2O") != null)
			dto.setL14FlgH2o(rs.getBigDecimal("L1_4_FLG_H2O"));

		// colonna [L1_4_FLG_ARIA]
		if (mapAllColumns || columnsToReadMap.get("L1_4_FLG_ARIA") != null)
			dto.setL14FlgAria(rs.getBigDecimal("L1_4_FLG_ARIA"));

		// colonna [L1_4_ALTRO]
		if (mapAllColumns || columnsToReadMap.get("L1_4_ALTRO") != null)
			dto.setL14Altro(rs.getString("L1_4_ALTRO"));

		// colonna [L1_5_FLG_GENERATORE]
		if (mapAllColumns || columnsToReadMap.get("L1_5_FLG_GENERATORE") != null)
			dto.setL15FlgGeneratore(rs.getBigDecimal("L1_5_FLG_GENERATORE"));

		// colonna [L1_5_FLG_POMPA]
		if (mapAllColumns || columnsToReadMap.get("L1_5_FLG_POMPA") != null)
			dto.setL15FlgPompa(rs.getBigDecimal("L1_5_FLG_POMPA"));

		// colonna [L1_5_FLG_FRIGO]
		if (mapAllColumns || columnsToReadMap.get("L1_5_FLG_FRIGO") != null)
			dto.setL15FlgFrigo(rs.getBigDecimal("L1_5_FLG_FRIGO"));

		// colonna [L1_5_FLG_TELERISC]
		if (mapAllColumns || columnsToReadMap.get("L1_5_FLG_TELERISC") != null)
			dto.setL15FlgTelerisc(rs.getBigDecimal("L1_5_FLG_TELERISC"));

		// colonna [L1_5_FLG_TELERAFFR]
		if (mapAllColumns || columnsToReadMap.get("L1_5_FLG_TELERAFFR") != null)
			dto.setL15FlgTeleraffr(rs.getBigDecimal("L1_5_FLG_TELERAFFR"));

		// colonna [L1_5_FLG_COGENERATORE]
		if (mapAllColumns || columnsToReadMap.get("L1_5_FLG_COGENERATORE") != null)
			dto.setL15FlgCogeneratore(rs.getBigDecimal("L1_5_FLG_COGENERATORE"));

		// colonna [L1_5_ALTRO]
		if (mapAllColumns || columnsToReadMap.get("L1_5_ALTRO") != null)
			dto.setL15Altro(rs.getString("L1_5_ALTRO"));

		// colonna [L1_5_SUP_PANNELLI_SOL_M2]
		if (mapAllColumns || columnsToReadMap.get("L1_5_SUP_PANNELLI_SOL_M2") != null)
			dto.setL15SupPannelliSolM2(rs.getBigDecimal("L1_5_SUP_PANNELLI_SOL_M2"));

		// colonna [L1_5_ALTRO_INTEGRAZIONE]
		if (mapAllColumns || columnsToReadMap.get("L1_5_ALTRO_INTEGRAZIONE") != null)
			dto.setL15AltroIntegrazione(rs.getString("L1_5_ALTRO_INTEGRAZIONE"));

		// colonna [L1_5_ALTRO_INTEGR_POT_KW]
		if (mapAllColumns || columnsToReadMap.get("L1_5_ALTRO_INTEGR_POT_KW") != null)
			dto.setL15AltroIntegrPotKw(rs.getBigDecimal("L1_5_ALTRO_INTEGR_POT_KW"));

		// colonna [L1_5_FLG_ALTRO_CLIMA_INV]
		if (mapAllColumns || columnsToReadMap.get("L1_5_FLG_ALTRO_CLIMA_INV") != null)
			dto.setL15FlgAltroClimaInv(rs.getBigDecimal("L1_5_FLG_ALTRO_CLIMA_INV"));

		// colonna [L1_5_FLG_ALTRO_CLIMA_ESTATE]
		if (mapAllColumns || columnsToReadMap.get("L1_5_FLG_ALTRO_CLIMA_ESTATE") != null)
			dto.setL15FlgAltroClimaEstate(rs.getBigDecimal("L1_5_FLG_ALTRO_CLIMA_ESTATE"));

		// colonna [L1_5_FLG_ALTRO_ACS]
		if (mapAllColumns || columnsToReadMap.get("L1_5_FLG_ALTRO_ACS") != null)
			dto.setL15FlgAltroAcs(rs.getBigDecimal("L1_5_FLG_ALTRO_ACS"));

		// colonna [L1_5_ALTRO_DESC]
		if (mapAllColumns || columnsToReadMap.get("L1_5_ALTRO_DESC") != null)
			dto.setL15AltroDesc(rs.getString("L1_5_ALTRO_DESC"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [MOTIVAZIONE]
		if (mapAllColumns || columnsToReadMap.get("MOTIVAZIONE") != null)
			dto.setMotivazione(rs.getString("MOTIVAZIONE"));

		// colonna [PROPRIETARIO]
		if (mapAllColumns || columnsToReadMap.get("PROPRIETARIO") != null)
			dto.setProprietario(rs.getString("PROPRIETARIO"));

		// colonna [DATA_INSERIMENTO]
		if (mapAllColumns || columnsToReadMap.get("DATA_INSERIMENTO") != null)
			dto.setDataInserimento(rs.getTimestamp("DATA_INSERIMENTO"));

		// colonna [NOTE]
		if (mapAllColumns || columnsToReadMap.get("NOTE") != null)
			dto.setNote(rs.getString("NOTE"));

		// colonna [FLG_TIPO_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("FLG_TIPO_IMPIANTO") != null)
			dto.setFlgTipoImpianto(rs.getString("FLG_TIPO_IMPIANTO"));

		// colonna [FLG_APPARECC_UI_EXT]
		if (mapAllColumns || columnsToReadMap.get("FLG_APPARECC_UI_EXT") != null)
			dto.setFlgAppareccUiExt(rs.getBigDecimal("FLG_APPARECC_UI_EXT"));

		// colonna [FLG_CONTABILIZZAZIONE]
		if (mapAllColumns || columnsToReadMap.get("FLG_CONTABILIZZAZIONE") != null)
			dto.setFlgContabilizzazione(rs.getBigDecimal("FLG_CONTABILIZZAZIONE"));

		// colonna [DATA_INTERVENTO]
		if (mapAllColumns || columnsToReadMap.get("DATA_INTERVENTO") != null)
			dto.setDataIntervento(rs.getDate("DATA_INTERVENTO"));

		// colonna [FK_TIPO_INTERVENTO]
		if (mapAllColumns || columnsToReadMap.get("FK_TIPO_INTERVENTO") != null)
			dto.setFkTipoIntervento(rs.getBigDecimal("FK_TIPO_INTERVENTO"));

		// colonna [L11_1_FLG_NORMA_UNI_10389_1]
		if (mapAllColumns || columnsToReadMap.get("L11_1_FLG_NORMA_UNI_10389_1") != null)
			dto.setL111FlgNormaUni103891(rs.getBigDecimal("L11_1_FLG_NORMA_UNI_10389_1"));

		// colonna [L11_1_ALTRA_NORMA]
		if (mapAllColumns || columnsToReadMap.get("L11_1_ALTRA_NORMA") != null)
			dto.setL111AltraNorma(rs.getString("L11_1_ALTRA_NORMA"));

		// colonna [FLG_BLOCCO_NOMINA_3R]
		if (mapAllColumns || columnsToReadMap.get("FLG_BLOCCO_NOMINA_3R") != null)
			dto.setFlgBloccoNomina3r(rs.getBigDecimal("FLG_BLOCCO_NOMINA_3R"));

		// colonna [FLG_VISU_PROPRIETARIO]
		if (mapAllColumns || columnsToReadMap.get("FLG_VISU_PROPRIETARIO") != null)
			dto.setFlgVisuProprietario(rs.getBigDecimal("FLG_VISU_PROPRIETARIO"));

		return dto;
	}

}
