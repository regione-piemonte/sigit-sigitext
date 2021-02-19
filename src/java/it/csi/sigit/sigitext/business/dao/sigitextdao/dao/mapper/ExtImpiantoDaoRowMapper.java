/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.*;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitVTotImpiantoDao
 * @generated
 */
public class ExtImpiantoDaoRowMapper extends BaseDaoRowMapper
		implements
			org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitExtDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public ExtImpiantoDaoRowMapper(String[] columnsToRead, Class dtoClass,
			SigitExtDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitExtDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitVTotImpiantoDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof ExtImpiantoDto) {
			return mapRow_internal((ExtImpiantoDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public ExtImpiantoDto mapRow_internal(
			ExtImpiantoDto objectToFill, ResultSet rs, int row)
			throws SQLException

	{
		ExtImpiantoDto dto = objectToFill;

		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		if (mapAllColumns || columnsToReadMap.get("DES_STATO") != null)
			dto.setDesStato(rs.getString("DES_STATO"));
		
		if (mapAllColumns || columnsToReadMap.get("DATA_ASSEGNAZIONE") != null)
			dto.setDataAssegnazione(rs.getDate("DATA_ASSEGNAZIONE"));

		if (mapAllColumns || columnsToReadMap.get("DATA_DISMISSIONE") != null)
			dto.setDataDismissione(rs.getDate("DATA_DISMISSIONE"));

		if (mapAllColumns || columnsToReadMap.get("MOTIVAZIONE") != null)
			dto.setMotivazione(rs.getString("MOTIVAZIONE"));

		if (mapAllColumns || columnsToReadMap.get("INDIRIZZO_UNITA_IMMOB") != null)
			dto.setIndirizzo(rs.getString("INDIRIZZO_UNITA_IMMOB"));

		if (mapAllColumns || columnsToReadMap.get("CIVICO") != null)
			dto.setCivico(rs.getString("CIVICO"));

		if (mapAllColumns
				|| columnsToReadMap.get("DENOMINAZIONE_COMUNE") != null)
			dto.setDenominazioneComune(rs.getString("DENOMINAZIONE_COMUNE"));

		if (mapAllColumns || columnsToReadMap.get("SIGLA_PROVINCIA") != null)
			dto.setSiglaProvincia(rs.getString("SIGLA_PROVINCIA"));

		if (mapAllColumns || columnsToReadMap.get("CODICE_FISCALE") != null)
			dto.setCfResponsabile(rs.getString("CODICE_FISCALE"));

		if (mapAllColumns || columnsToReadMap.get("DENOMINAZIONE_RESPONSABILE") != null)
			dto.setDenominazioneResponsabile(rs.getString("DENOMINAZIONE_RESPONSABILE"));
		
		if (mapAllColumns || columnsToReadMap.get("CODICE_FISCALE_3R") != null)
			dto.setCf3Responsabile(rs.getString("CODICE_FISCALE_3R"));
		
		if (mapAllColumns || columnsToReadMap.get("DENOMINAZIONE_3_RESPONSABILE") != null)
			dto.setDenominazione3Responsabile(rs.getString("DENOMINAZIONE_3_RESPONSABILE"));

		if (mapAllColumns
				|| columnsToReadMap.get("DATA_CONSOLIDAMENTO") != null)
			dto.setDataConsolidamento(rs.getDate("DATA_CONSOLIDAMENTO"));

		if (mapAllColumns || columnsToReadMap.get("UID_INDEX") != null)
			dto.setUidIndex(rs.getString("UID_INDEX"));

		return dto;
	}

}
