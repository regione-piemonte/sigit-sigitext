/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.manager;

import org.apache.log4j.Logger;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTLibrettoDto;
import it.csi.sigit.sigitext.business.sigitext.spring.SpringBeanLocator;
import it.csi.sigit.sigitext.business.util.Constants;
import it.csi.sigit.sigitext.dto.sigitext.DettaglioAllegato;
import it.csi.sigit.sigitext.dto.sigitext.TipoImportAllegatoEnum;
import it.csi.sigit.sigitext.exception.sigitext.SigitextException;

public class ConnectorManager {

	protected static final Logger log = Logger
			.getLogger(Constants.APPLICATION_CODE + ".SigitextManager==>");
	
	SigitextManager sigitextManager = new SigitextManager();

	public SigitextManager getSigitextManager() {
		return (SigitextManager) SpringBeanLocator.getBean("sigitextManager");

	}

	public void setSigitextManager(SigitextManager sigitextManager) {
		this.sigitextManager = sigitextManager;
	}
	
	private DbServiceImp serviceDb;
	
	public DbServiceImp getDbServiceImp() {
		return serviceDb;
	}

	public void setDbServiceImp(DbServiceImp serviceDb) {
		this.serviceDb = serviceDb;
	}
	
	public void salvaAllegatoImportTrans(DettaglioAllegato dettaglioAllegato, byte[] xml, String tipoControllo, SigitTLibrettoDto libretto, String cfUtente ) throws SigitextException {
		log.debug("ConnectorManager::salvaAllegatoImportTrans - START");
		try {
			 getDbServiceImp().salvaAllegatoImport(dettaglioAllegato, xml);
			 
			 TipoImportAllegatoEnum tipoImport = TipoImportAllegatoEnum.valueOfLabel(tipoControllo);
			 
			 if (tipoImport == TipoImportAllegatoEnum.MANUT_GT ||
				 tipoImport == TipoImportAllegatoEnum.MANUT_GF ||
				 tipoImport == TipoImportAllegatoEnum.MANUT_SC ||
				 tipoImport == TipoImportAllegatoEnum.MANUT_CG) {
				 
				 getSigitextManager().consolidaLibrettoTrans(cfUtente, libretto, dettaglioAllegato.getCodiceReaPg(), Constants.MOTIVO_CONSOLIDAMENTO_NUOVA_MANUTENZIONE);
			 }
		} catch (SigitextException e) {
			throw e;
		} finally {
			log.debug("ConnectorManager::salvaAllegatoImportTrans - END");
		}
	}
	
	
}
