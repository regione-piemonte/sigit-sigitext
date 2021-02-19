/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;


import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.SigitExtDao;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.SigitExtDaoImpl;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitExtContrattoImpDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitExtImpiantoDto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SigitExtImpiantiByFiltroRowMapper extends BaseDaoRowMapper
		implements RowMapper {

	SigitExtDaoImpl dao;

	@SuppressWarnings("rawtypes")
	public SigitExtImpiantiByFiltroRowMapper(String[] columnsToRead,
			Class dtoClass, SigitExtDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitExtDaoImpl) dao;
	}

	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dto = getNewDto();
		return mapRow_internal((SigitExtImpiantoDto)dto, rs, row);
	}

	private SigitExtImpiantoDto mapRow_internal(SigitExtImpiantoDto dto,
			ResultSet rs, int row) throws SQLException
	{
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		if (mapAllColumns || columnsToReadMap.get("ISTAT_COMUNE") != null)
			dto.setIstatComune(rs.getString("ISTAT_COMUNE"));

		if (mapAllColumns || columnsToReadMap.get("DENOMINAZIONE_COMUNE") != null)
			dto.setDenominazioneComune(rs.getString("DENOMINAZIONE_COMUNE"));

		if (mapAllColumns || columnsToReadMap.get("SIGLA_PROVINCIA") != null)
			dto.setSiglaProvincia(rs.getString("SIGLA_PROVINCIA"));

		if (mapAllColumns || columnsToReadMap.get("DENOMINAZIONE_PROVINCIA") != null)
			dto.setDenominazioneProvincia(rs.getString("DENOMINAZIONE_PROVINCIA"));

		if (mapAllColumns || columnsToReadMap.get("FK_STATO") != null)
			dto.setFkStato(rs.getBigDecimal("FK_STATO"));

		if (mapAllColumns || columnsToReadMap.get("L1_3_POT_H2O_KW") != null)
			dto.setL13PotH2oKw(rs.getInt("L1_3_POT_H2O_KW"));

		if (mapAllColumns || columnsToReadMap.get("L1_3_POT_CLIMA_INV_KW") != null)
			dto.setL13PotClimaInvKw(rs.getInt("L1_3_POT_CLIMA_INV_KW"));

		if (mapAllColumns || columnsToReadMap.get("L1_3_POT_CLIMA_EST_KW") != null)
			dto.setL13PotClimaEstKw(rs.getInt("L1_3_POT_CLIMA_EST_KW"));

		if (mapAllColumns || columnsToReadMap.get("FLG_NOPDR") != null)
			dto.setFlgNopdr(rs.getInt("FLG_NOPDR"));

		if (mapAllColumns || columnsToReadMap.get("indirizzo_unita_immob") != null)
			dto.setIndirizzoUnitaImmob(rs.getString("indirizzo_unita_immob"));

		if (mapAllColumns || columnsToReadMap.get("CIVICO") != null)
			dto.setCivico(rs.getString("CIVICO"));

		if (mapAllColumns || columnsToReadMap.get("SEZIONE") != null)
			dto.setSezione(rs.getString("SEZIONE"));

		if (mapAllColumns || columnsToReadMap.get("FOGLIO") != null)
			dto.setFoglio(rs.getString("FOGLIO"));

		if (mapAllColumns || columnsToReadMap.get("PARTICELLA") != null)
			dto.setParticella(rs.getString("PARTICELLA"));

		if (mapAllColumns || columnsToReadMap.get("SUBALTERNO") != null)
			dto.setSubalterno(rs.getString("SUBALTERNO"));

		if (mapAllColumns || columnsToReadMap.get("POD_ELETTRICO") != null)
			dto.setPodElettrico(rs.getString("POD_ELETTRICO"));

		if (mapAllColumns || columnsToReadMap.get("PDR_GAS") != null)
			dto.setPdrGas(rs.getString("PDR_GAS"));

		if (mapAllColumns || columnsToReadMap.get("DES_STATO") != null)
			dto.setDesStato(rs.getString("DES_STATO"));

		if (mapAllColumns || columnsToReadMap.get("FLG_VISU_PROPRIETARIO") != null)
			dto.setFlgVisuProprietario(rs.getInt("FLG_VISU_PROPRIETARIO"));

		if (mapAllColumns || columnsToReadMap.get("codice_fiscale_responsabile") != null)
			dto.setCodiceFiscaleResponsabile(rs.getString("codice_fiscale_responsabile"));

		if (mapAllColumns || columnsToReadMap.get("denominazione_responsabile") != null)
			dto.setDenominazioneResponsabile(rs.getString("denominazione_responsabile"));

		if (mapAllColumns || columnsToReadMap.get("ruolo_responsabile") != null)
			dto.setRuoloResponsabile(rs.getBigDecimal("ruolo_responsabile"));

		if (mapAllColumns || columnsToReadMap.get("data_fine_pfpg_responsabile") != null)
			dto.setDataFinePfpgResponsabile(rs.getDate("data_fine_pfpg_responsabile"));

		if (mapAllColumns || columnsToReadMap.get("ruolo_funz") != null)
			dto.setRuoloFunz(rs.getString("ruolo_funz"));

		if (mapAllColumns || columnsToReadMap.get("des_ruolo_funz") != null)
			dto.setDesRuoloFunz(rs.getString("des_ruolo_funz"));

		if (mapAllColumns || columnsToReadMap.get("codice_fiscale_proprietario") != null)
			dto.setCodiceFiscaleProprietario(rs.getString("codice_fiscale_proprietario"));

		if (mapAllColumns || columnsToReadMap.get("denominazione_proprietario") != null)
			dto.setDenominazioneProprietario(rs.getString("denominazione_proprietario"));
		
		
		return dto;
	}
}
