/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao.mapper;


import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.SigitExtDao;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.impl.SigitExtDaoImpl;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitExtContrattoImpDto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SigitExtContrattoImpDaoRowMapper extends BaseDaoRowMapper
		implements RowMapper {

	SigitExtDaoImpl dao;

	@SuppressWarnings("rawtypes")
	public SigitExtContrattoImpDaoRowMapper(String[] columnsToRead,
			Class dtoClass, SigitExtDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitExtDaoImpl) dao;
	}

	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dto = getNewDto();
		return mapRow_internal((SigitExtContrattoImpDto)dto, rs, row);
	}

	private SigitExtContrattoImpDto mapRow_internal(SigitExtContrattoImpDto dto,
			ResultSet rs, int row) throws SQLException
	{
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		if (mapAllColumns || columnsToReadMap.get("ID_RUOLO") != null)
			dto.setFkRuolo(rs.getBigDecimal("ID_RUOLO"));

		if (mapAllColumns || columnsToReadMap.get("DES_RUOLO") != null)
			dto.setDesRuolo(rs.getString("DES_RUOLO"));

		if (mapAllColumns || columnsToReadMap.get("ID_CONTRATTO") != null)
			dto.setIdContratto(rs.getBigDecimal("ID_CONTRATTO"));

		if (mapAllColumns || columnsToReadMap.get("DATA_CARICAMENTO") != null)
			dto.setDataCaricamento(rs.getDate("DATA_CARICAMENTO"));

		if (mapAllColumns || columnsToReadMap.get("DATA_CESSAZIONE") != null)
			dto.setDataCessazione(rs.getDate("DATA_CESSAZIONE"));
		
		if (mapAllColumns || columnsToReadMap.get("DATA_INSERIMENTO_CESSAZIONE") != null)
			dto.setDataInserimentoCessazione(rs.getDate("DATA_INSERIMENTO_CESSAZIONE"));
		
		if (mapAllColumns || columnsToReadMap.get("FK_PG_3_RESP") != null)
			dto.setFkPg3Resp(rs.getBigDecimal("FK_PG_3_RESP"));
		
		if (mapAllColumns || columnsToReadMap.get("FK_PERSONA_GIURIDICA") != null)
			dto.setFkPgResponsabile(rs.getBigDecimal("FK_PERSONA_GIURIDICA"));
		
		if (mapAllColumns || columnsToReadMap.get("FK_PERSONA_FISICA") != null)
			dto.setFkPfResponsabile(rs.getBigDecimal("FK_PERSONA_FISICA"));
		
		if (mapAllColumns || columnsToReadMap.get("DATA_INIZIO_CONTRATTO") != null)
			dto.setDataInizioContratto(rs.getDate("DATA_INIZIO_CONTRATTO"));
		
		if (mapAllColumns || columnsToReadMap.get("DATA_FINE_CONTRATTO") != null)
			dto.setDataFineContratto(rs.getDate("DATA_FINE_CONTRATTO"));
		
		if (mapAllColumns || columnsToReadMap.get("FLG_TACITO_RINNOVO") != null)
			dto.setFlagTacitoRinnovo(rs.getBigDecimal("FLG_TACITO_RINNOVO"));
		
		if (mapAllColumns || columnsToReadMap.get("RESP_CODICE_FISCALE") != null)
			dto.setRespCodiceFiscale(rs.getString("RESP_CODICE_FISCALE"));
		
		if (mapAllColumns || columnsToReadMap.get("RESP_DENOMINAZIONE") != null)
			dto.setRespDenominazione(rs.getString("RESP_DENOMINAZIONE"));

		if (mapAllColumns || columnsToReadMap.get("RESP_NOME") != null)
			dto.setRespNome(rs.getString("RESP_NOME"));
		
		if (mapAllColumns || columnsToReadMap.get("TERZO_RESP_DENOMINAZIONE") != null)
			dto.setTerzoRespDenominazione(rs.getString("TERZO_RESP_DENOMINAZIONE"));
		
		if (mapAllColumns || columnsToReadMap.get("TERZO_RESP_SIGLA_REA") != null)
			dto.setTerzoRespSiglaRea(rs.getString("TERZO_RESP_SIGLA_REA"));
		
		if (mapAllColumns || columnsToReadMap.get("TERZO_RESP_NUMERO_REA") != null)
			dto.setTerzoRespNumeroRea(rs.getBigDecimal("TERZO_RESP_NUMERO_REA"));
		
		if (mapAllColumns || columnsToReadMap.get("DENOM_PROVINCIA_3_RESP") != null)
			dto.setDenomProvincia3Resp(rs.getString("DENOM_PROVINCIA_3_RESP"));
		
		if (mapAllColumns || columnsToReadMap.get("DENOM_COMUNE_3_RESP") != null)
			dto.setDenomComune3Resp(rs.getString("DENOM_COMUNE_3_RESP"));
		
		if (mapAllColumns || columnsToReadMap.get("SIGLA_PROV_3_RESP") != null)
			dto.setSiglaProv3Resp(rs.getString("SIGLA_PROV_3_RESP"));

		if (mapAllColumns || columnsToReadMap.get("CODICE_FISCALE_3_RESP") != null)
			dto.setCodiceFiscale3Resp(rs.getString("CODICE_FISCALE_3_RESP"));

		if (mapAllColumns || columnsToReadMap.get("DENOM_COMUNE_IMPIANTO") != null)
			dto.setDenomComuneImpianto(rs.getString("DENOM_COMUNE_IMPIANTO"));
		
		if (mapAllColumns || columnsToReadMap.get("DENOM_PROV_IMPIANTO") != null)
			dto.setDenomProvImpianto(rs.getString("DENOM_PROV_IMPIANTO"));
		
		if (mapAllColumns || columnsToReadMap.get("SIGLA_PROV_IMPIANTO") != null)
			dto.setSiglaProvImpianto(rs.getString("SIGLA_PROV_IMPIANTO"));
		
		if (mapAllColumns || columnsToReadMap.get("ID_TIPO_CESSAZIONE") != null)
			dto.setIdTipoCessazione(rs.getBigDecimal("ID_TIPO_CESSAZIONE"));
		
		if (mapAllColumns || columnsToReadMap.get("DES_TIPO_CESSAZIONE") != null)
			dto.setDesTipoCessazione(rs.getString("DES_TIPO_CESSAZIONE"));
		
		if (mapAllColumns || columnsToReadMap.get("MOTIVO_CESSAZIONE") != null)
			dto.setMotivoCessazione(rs.getString("MOTIVO_CESSAZIONE"));
		
		
		return dto;
	}
}
