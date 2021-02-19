package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitTImportDao
 * @generated
 */
public class SigitTImportDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitTImportDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitTImportDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitTImportDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitTImportDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitTImportDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitTImportDto) {
			return mapRow_internal((SigitTImportDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitTImportDto mapRow_internal(SigitTImportDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitTImportDto dto = objectToFill;

		// colonna [ID_IMPORT]
		if (mapAllColumns || columnsToReadMap.get("ID_IMPORT") != null)
			dto.setIdImport((Integer) rs.getObject("ID_IMPORT"));

		// colonna [DATA_INIZIO]
		if (mapAllColumns || columnsToReadMap.get("DATA_INIZIO") != null)
			dto.setDataInizio(rs.getTimestamp("DATA_INIZIO"));

		// colonna [DATA_FINE]
		if (mapAllColumns || columnsToReadMap.get("DATA_FINE") != null)
			dto.setDataFine(rs.getTimestamp("DATA_FINE"));

		// colonna [NOME_FILE_IMPORT]
		if (mapAllColumns || columnsToReadMap.get("NOME_FILE_IMPORT") != null)
			dto.setNomeFileImport(rs.getString("NOME_FILE_IMPORT"));

		// colonna [FLG_ESITO]
		if (mapAllColumns || columnsToReadMap.get("FLG_ESITO") != null)
			dto.setFlgEsito(rs.getBigDecimal("FLG_ESITO"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [FK_PRE_IMPORT]
		if (mapAllColumns || columnsToReadMap.get("FK_PRE_IMPORT") != null)
			dto.setFkPreImport((Integer) rs.getObject("FK_PRE_IMPORT"));

		// colonna [FK_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("FK_ALLEGATO") != null)
			dto.setFkAllegato(rs.getBigDecimal("FK_ALLEGATO"));

		// colonna [MSG_ERRORE]
		if (mapAllColumns || columnsToReadMap.get("MSG_ERRORE") != null)
			dto.setMsgErrore(rs.getString("MSG_ERRORE"));

		// colonna [FK_PERSONA_GIURIDICA]
		if (mapAllColumns || columnsToReadMap.get("FK_PERSONA_GIURIDICA") != null)
			dto.setFkPersonaGiuridica(rs.getBigDecimal("FK_PERSONA_GIURIDICA"));

		// colonna [DATA_INVIO_MAIL_MANUT]
		if (mapAllColumns || columnsToReadMap.get("DATA_INVIO_MAIL_MANUT") != null)
			dto.setDataInvioMailManut(rs.getTimestamp("DATA_INVIO_MAIL_MANUT"));

		// colonna [DATA_INVIO_MAIL_ASSISTENZA]
		if (mapAllColumns || columnsToReadMap.get("DATA_INVIO_MAIL_ASSISTENZA") != null)
			dto.setDataInvioMailAssistenza(rs.getTimestamp("DATA_INVIO_MAIL_ASSISTENZA"));

		// colonna [FK_PG_CAT]
		if (mapAllColumns || columnsToReadMap.get("FK_PG_CAT") != null)
			dto.setFkPgCat(rs.getBigDecimal("FK_PG_CAT"));

		return dto;
	}

}
