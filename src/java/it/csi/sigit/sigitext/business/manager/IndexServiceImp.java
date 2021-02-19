/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.manager;

import it.doqui.index.ecmengine.client.webservices.engine.EcmEngineWebServiceDelegate;
import it.doqui.index.ecmengine.client.webservices.engine.EcmEngineWebServiceDelegateServiceLocator;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.rpc.ServiceException;

public class IndexServiceImp {

	EcmEngineWebServiceDelegate ecmengineDelegate;
	
	
	
	public EcmEngineWebServiceDelegate getEcmengineDelegate() {
		return ecmengineDelegate;
	}



	public void setEcmengineDelegate(EcmEngineWebServiceDelegate ecmengineDelegate) {
		this.ecmengineDelegate = ecmengineDelegate;
	}



	public IndexServiceImp(String url)
	{
		EcmEngineWebServiceDelegateServiceLocator ecmengineLocator =
				new EcmEngineWebServiceDelegateServiceLocator();

		try {


			ecmengineDelegate = ecmengineLocator.getEcmEngineManagement(new URL(url));
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
