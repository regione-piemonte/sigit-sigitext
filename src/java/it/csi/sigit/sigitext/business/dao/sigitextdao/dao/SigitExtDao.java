/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dao;


import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.ContrattoFilter;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.ExtImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitExtContrattoImpDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitExtImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.ExtDaoException;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.SigitExtDaoException;
import it.csi.sigit.sigitext.dto.sigitext.ImpiantoFiltro;

import java.math.BigDecimal;
import java.util.*;

/**
 * Interfaccia pubblica del DAO non rpesente sul DB.
 * @generated
 */
public interface SigitExtDao {


	public List<SigitExtContrattoImpDto> findStoriaContrattiImpiantoNew(ContrattoFilter input) throws SigitExtDaoException;
	
	public List<ExtImpiantoDto> findImpiantiByCodice(Integer input)	throws ExtDaoException;
	
	public BigDecimal getSeqTNumeroBollino() throws SigitExtDaoException;
	
	public List<SigitExtImpiantoDto> findImpiantiByFiltro(ImpiantoFiltro input) throws SigitExtDaoException;
}
