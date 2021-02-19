/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.manager;

import org.apache.log4j.Logger;

//import it.csi.modolxp.modolxppdfgensrv.business.session.facade.ModolPdfGeneratorSrvFacade;
//import it.csi.modolxp.modolxppdfgensrv.client.ModolxppdfgensrvServiceClient;
//import it.csi.modolxp.modolxppdfgensrv.dto.publish.ModolxppdfgensrvServiceDto;
//import it.csi.modolxp.modolxppdfgensrv.exception.ModolPdfGeneratorSrvException;
import it.csi.sigit.sigitext.business.util.Constants;

public class ModolXPPdfServiceImp {

	protected static final Logger log = Logger
	.getLogger(Constants.APPLICATION_CODE + ".ModolXPServiceImp==>");
	
//	ModolPdfGeneratorSrvFacade modolXpPdfsrv;
//	
//	public ModolPdfGeneratorSrvFacade getModolXPPdfServiceImp() {
//		System.out.println("modolXpPdfsrv: "+modolXpPdfsrv);
//		return modolXpPdfsrv;
//	}
//
//	public void setModolXPPdfServiceImp(ModolPdfGeneratorSrvFacade modolXpPdfsrv) {
//		this.modolXpPdfsrv = modolXpPdfsrv;
//	}

//	public ModolXPPdfServiceImp(String url, String context, String port)
//	{
//		if (log.isDebugEnabled())
//		{
//			log.debug("ModolXPPdfServiceImp - Stampo param ricevuto [url]: "+url);
//			log.debug("ModolXPPdfServiceImp - Stampo param ricevuto [context]: "+context);
//			log.debug("ModolXPPdfServiceImp - Stampo param ricevuto [port]: "+port);
//		}
//		
//		ModolxppdfgensrvServiceDto modolxppdfgensrvService = new ModolxppdfgensrvServiceDto();
//		modolxppdfgensrvService.setServer(url);
//		modolxppdfgensrvService.setContext(context);
//		modolxppdfgensrvService.setPort(new Integer(port));
//
//		try {
//			modolXpPdfsrv = ModolxppdfgensrvServiceClient.getModolxppdfgensrvService(modolxppdfgensrvService);
//
//			if (log.isDebugEnabled())
//				log.debug("modolXpPdfsrv - creazione: "+modolXpPdfsrv);
//			
//		} catch (ModolPdfGeneratorSrvException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
	
}
