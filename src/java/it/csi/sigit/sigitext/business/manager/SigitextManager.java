/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
/**
 * 
 */
package it.csi.sigit.sigitext.business.manager;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.URLConnection;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jboss.util.collection.CollectionsUtil;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import bsh.StringUtil;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.ImportFilter;
//import it.csi.csi.porte.InfoPortaDelegata;
//import it.csi.csi.porte.proxy.PDProxy;
//import it.csi.csi.util.xml.PDConfigReader;
//import it.csi.modolxp.modolxppdfgensrv.business.session.facade.ModolPdfGeneratorSrvFacade;
//import it.csi.modolxp.modolxppdfgensrv.dto.pdfa.PdfAInputRequest;
//import it.csi.modolxp.modolxppdfgensrv.dto.pdfstatic.PdfStaticInputRequest;
//import it.csi.modolxp.modolxpsrv.business.session.facade.ModolSrvFacade;
//import it.csi.modolxp.modolxpsrv.client.ModolxpsrvServiceClient;
//import it.csi.modolxp.modolxppdfgensrv.interfacecsi.ModolPdfGeneratorSrvITF;
//import it.csi.modolxp.modolxpsrv.dto.Applicazione;
//import it.csi.modolxp.modolxpsrv.dto.Modulo;
//import it.csi.modolxp.modolxpsrv.dto.XmlModel;
//import it.csi.modolxp.modolxpsrv.dto.criteri.CriterioRicercaModulo;
//import it.csi.modolxp.modolxpsrv.dto.utility.RendererModalityExpert;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.UtenteFunzionalitaFilter;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.CombustibileCITDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.ExtImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.FluidoCITDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.MarcaCITDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.PotenzaImpDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.RicercaAllegatiDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitExtImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitLAccessoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRComp4ManutDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRImpRuoloPfpgDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTControlloLibrettoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTElencoWsDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTImportDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTImportXmlLibDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTLibTxtDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTLibrettoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTPersonaFisicaDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTPersonaGiuridicaDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTPreImportDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTUnitaImmobiliareDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTUserWSDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVTotImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.UnitaImmobiliareDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.UnitaMisuraCITDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.UserElencoWsByUtenteFunzionalitaDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.UserElencoWsDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.WrkConfigDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.WrkConfigDaoException;
import it.csi.sigit.sigitext.business.pdf.DatiLibretto;
import it.csi.sigit.sigitext.business.pdf.LibrettoBuilder;
import it.csi.sigit.sigitext.business.util.Constants;
import it.csi.sigit.sigitext.business.util.ConvertUtil;
import it.csi.sigit.sigitext.business.util.DateUtil;
import it.csi.sigit.sigitext.business.util.GenericUtil;
import it.csi.sigit.sigitext.business.util.MapDto;
import it.csi.sigit.sigitext.business.util.Messages;
import it.csi.sigit.sigitext.business.util.XmlBeanUtils;
import it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione;
import it.csi.sigit.sigitext.dto.sigitext.DettaglioAllegato;
import it.csi.sigit.sigitext.dto.sigitext.Documento;
import it.csi.sigit.sigitext.dto.sigitext.Impianto;
import it.csi.sigit.sigitext.dto.sigitext.ImpiantoFiltro;
import it.csi.sigit.sigitext.dto.sigitext.Libretto;
import it.csi.sigit.sigitext.dto.sigitext.Metadati;
import it.csi.sigit.sigitext.dto.sigitext.RappControllo;
import it.csi.sigit.sigitext.dto.sigitext.RifCatastale;
import it.csi.sigit.sigitext.dto.sigitext.Utente;
import it.csi.sigit.sigitext.dto.sigitext.UtenteJWT;
import it.csi.sigit.sigitext.exception.sigitext.SigitExcessiveResultsException;
import it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException;
import it.csi.sigit.sigitext.exception.sigitext.SigitextException;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.LibrettoDocument;
import it.csi.sigit.sigitwebn.xml.libretto.data.MODDocument;
import it.doqui.index.ecmengine.client.webservices.dto.Node;
import it.doqui.index.ecmengine.client.webservices.dto.OperationContext;
import it.doqui.index.ecmengine.client.webservices.dto.engine.management.Content;
import it.doqui.index.ecmengine.client.webservices.dto.engine.management.Mimetype;
import it.doqui.index.ecmengine.client.webservices.dto.engine.management.Property;
import it.doqui.index.ecmengine.client.webservices.dto.engine.search.NodeResponse;
import it.doqui.index.ecmengine.client.webservices.dto.engine.search.ResultContent;
//import it.doqui.index.ecmengine.dto.Node;
//import it.doqui.index.ecmengine.dto.OperationContext;
//import it.doqui.index.ecmengine.dto.engine.management.Content;
//import it.doqui.index.ecmengine.dto.engine.search.ResultContent;
//import it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface;
import it.doqui.index.ecmengine.client.webservices.dto.engine.search.SearchParams;
import net.sf.cglib.core.CollectionUtils;

/**
 * @author 1456
 *
 */
public class SigitextManager implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2327466097627228908L;
	/**
	 * 
	 */
	

	protected static final Logger log = Logger
	.getLogger(Constants.APPLICATION_CODE + ".SigitextManager==>");
	
	private final String INDEX_MNG_RESOURCE = "/META-INF/defpd_indexmngmt.xml";
//	private final String MODOL_RESOURCE = "/META-INF/defpd_modolsrv.xml";
//	private final String MODOL_PDF_RESOURCE = "/META-INF/defpd_modolpdfgeneratorsrv.xml";
	
	public SigitextManager() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	private CombustibileCITDao combustibileCITDao = null;
	private FluidoCITDao  fluidoCITDao = null;
	private MarcaCITDao  marcaCITDao = null;
	private UnitaMisuraCITDao  unitaMisuraCITDao = null;
	
	private CombustibileDao combustibileDao = null;
	private DestinazioneDao destinazioneDao = null;
	private EvacuazioneDao evacuazioneDao = null;
	private FluidoDao  fluidoDao = null;
	private LocaleInstallDao  localeInstallDao = null;
	private LuogoDao  luogoDao = null;
	private MarcaAppareccDao  marcaAppareccDao = null;
	private MarcaEnergiaDao marcaEnergiaDao = null;
	private PotenzaImpDao  potenzaImpDao = null;
	private StatoImpDao  statoImpDao = null;
	private StatoRappDao  statoRappDao = null;
	private TipoAppareccDao  tipoAppareccDao = null;
	private TipoBruciatoreDao  tipoBruciatoreDao = null;
	private TipoDao  tipoDao = null;
	private TipoInstallDao  tipoInstallDao = null;
	private TipologiaImpDao  tipologiaImpDao = null;
	private TiraggioDao  tiraggioDao = null;
	private TitoloRespDao  titoloRespDao = null;
	private ExtDao extDao = null;
	private AllegatoDao allegatoDao = null;
	private UnitaImmobiliareDao unitaImmobiliareDao = null;
	private UserElencoWsDao userElencoWsDao = null;
	private RicercaAllegatiDao ricercaAllegatiDao = null;
	private WrkConfigDao wrkConfigDao = null;
	*/
	
	private IndexServiceImp serviceIndex;
	
	public IndexServiceImp getServiceIndex() {
		return serviceIndex;
	}

	public void setServiceIndex(IndexServiceImp serviceIndex) {
		this.serviceIndex = serviceIndex;
	}

	
//	private ModolXPServiceImp serviceModolXP;
//	
//	public ModolXPServiceImp getServiceModolXP() {
//		return serviceModolXP;
//	}
//
//	public void setServiceModolXP(ModolXPServiceImp serviceModolXP) {
//		this.serviceModolXP = serviceModolXP;
//	}
	
//	private ModolXPPdfServiceImp serviceModolXPPdf;
//	
//	public ModolXPPdfServiceImp getServiceModolXPPdf() {
//		return serviceModolXPPdf;
//	}
//
//	public void setServiceModolXPPdf(ModolXPPdfServiceImp serviceModolXPPdf) {
//		this.serviceModolXPPdf = serviceModolXPPdf;
//	}
	
	private DbServiceImp serviceDb;
	
	public DbServiceImp getDbServiceImp() {
		return serviceDb;
	}

	public void setDbServiceImp(DbServiceImp serviceDb) {
		this.serviceDb = serviceDb;
	}
	
	private LibrettoBuilder librettoBuilderService;

	public LibrettoBuilder getLibrettoBuilderService() {
		return librettoBuilderService;
	}

	public void setLibrettoBuilderService(LibrettoBuilder librettoBuilderService) {
		this.librettoBuilderService = librettoBuilderService;
	}
	
	private ValidationManager validationManager;
	
	public ValidationManager getValidationManager() {
		return validationManager;
	}

	public void setValidationManager(ValidationManager validationManager) {
		this.validationManager = validationManager;
	}
	
	private ConnectorManager connectorManager;
	
	public ConnectorManager getConnectorManager() {
		return connectorManager;
	}

	public void setConnectorManager(ConnectorManager connectorManager) {
		this.connectorManager = connectorManager;
	}
	
	/*
	protected EcmEngineManagementInterface getIndexManagement() {
		log.debug("[SigitextManager::getIndexManagement] START");
		InputStream is = getClass().getResourceAsStream(INDEX_MNG_RESOURCE);
		if (is != null) {
			try {
				InfoPortaDelegata info = PDConfigReader.read(is);
				return (EcmEngineManagementInterface) PDProxy.newInstance(info);
			} catch (Exception e) {
				log.error("[SigitextManager::getIndexManagement] errore nella parsificazione della configurazione di INDEX MANAGEMENT:"+ e, e);
				throw new IllegalArgumentException("errore nella parsificazione della configurazione di INDEX MANAGEMENT");
			}
		} else {
			log	.error("[SigitextManager::getIndexManagement] configurazione di INDEX MANAGEMENT non trovata");
		}
		throw new IllegalArgumentException(	"configurazione di INDEX MANAGEMENT non trovata");
	}
	*/
	
	public CodiceDescrizione[] getListaCombustibileCIT ()throws Exception
	{
		String header = "!!!!getListaCombustibileCIT==>.";
		log.debug(header+"inizio!!");
		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
		
		try{
			
			
			List<CombustibileCITDto> lista =	getDbServiceImp().getCombustibileCITDao().findAll();
			if(lista==null)
			{
				log.debug(header+"lista =  null!!");
					
			}
			else{
				log.debug(header+"lista not  null!!");
				
				listone = new CodiceDescrizione[lista.size()];
				
				//log.debug(header+"listaPro not null");
				for (int i = 0; i < lista.size(); i++) {
					
					CombustibileCITDto dto = new CombustibileCITDto();
					dto = lista.get(i);
					if(dto!=null)
					{
						
						CodiceDescrizione cod = new CodiceDescrizione();
						cod.setCodice(String.valueOf(dto.getIdCombustibile()));
						cod.setDescrizione(dto.getDesCombustibile());
						log.debug(header+"cod.getCodice() = "+cod.getCodice());
						log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
					   listone[i]=cod;
					}
					
				}
			}
				                                                    
			log.debug(header+"fine");
		}	
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return listone;
		
		
	}
	
	public CodiceDescrizione[] getListaFluidoCIT ()throws Exception
	{
		String header = "!!!!getListaFluidoCIT==>.";
		log.debug(header+"inizio!!");
		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
		
		try{
			
			
			List<FluidoCITDto> lista =	getDbServiceImp().getFluidoCITDao().findAll();
			if(lista==null)
			{
				log.debug(header+"lista =  null!!");
					
			}
			else{
				log.debug(header+"lista not  null!!");
				
				listone = new CodiceDescrizione[lista.size()];
				
				//log.debug(header+"listaPro not null");
				for (int i = 0; i < lista.size(); i++) {
					
					FluidoCITDto dto = new FluidoCITDto();
					dto = lista.get(i);
					if(dto!=null)
					{
						
						CodiceDescrizione cod = new CodiceDescrizione();
						cod.setCodice(String.valueOf(dto.getIdFluido()));
						cod.setDescrizione(dto.getDesFluido());
						if (log.isDebugEnabled())
						{
							log.debug(header+"cod.getCodice() = "+cod.getCodice());
							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
						}
					   listone[i]=cod;
					}
					
				}
			}
				                                                    
			log.debug(header+"fine");
		}	
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return listone;
		
		
	}
	
	
	public CodiceDescrizione[] getListaMarcaCIT ()throws Exception
	{
		String header = "!!!!getListaMarcaCIT==>.";
		log.debug(header+"inizio!!");
		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
		
		try{
			
			
			List<MarcaCITDto> lista =	getDbServiceImp().getMarcaCITDao().findAll();
			if(lista==null)
			{
				log.debug(header+"lista =  null!!");
					
			}
			else{
				log.debug(header+"lista not  null!!");
				
				listone = new CodiceDescrizione[lista.size()];
				
				//log.debug(header+"listaPro not null");
				for (int i = 0; i < lista.size(); i++) {
					
					MarcaCITDto dto = new MarcaCITDto();
					dto = lista.get(i);
					if(dto!=null)
					{
						
						CodiceDescrizione cod = new CodiceDescrizione();
						cod.setCodice(String.valueOf(dto.getIdMarca()));
						cod.setDescrizione(dto.getDesMarca());
						if (log.isDebugEnabled())
						{	
							log.debug(header+"cod.getCodice() = "+cod.getCodice());
							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
						}
					   listone[i]=cod;
					}
					
				}
			}
				                                                    
			log.debug(header+"fine");
		}	
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return listone;
		
		
	}
	

	public CodiceDescrizione[] getListaUnitaMisuraCIT ()throws Exception
	{
		String header = "!!!!getListaUnitaMisuraCIT==>.";
		log.debug(header+"inizio!!");
		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
		
		try{
			
			
			List<UnitaMisuraCITDto> lista =	getDbServiceImp().getUnitaMisuraCITDao().findAll();
			if(lista==null)
			{
				log.debug(header+"lista =  null!!");
					
			}
			else{
				log.debug(header+"lista not  null!!");
				
				listone = new CodiceDescrizione[lista.size()];
				
				//log.debug(header+"listaPro not null");
				for (int i = 0; i < lista.size(); i++) {
					
					UnitaMisuraCITDto dto = new UnitaMisuraCITDto();
					dto = lista.get(i);
					if(dto!=null)
					{
						
						CodiceDescrizione cod = new CodiceDescrizione();
						cod.setCodice(String.valueOf(dto.getIdUnitaMisura()));
						cod.setDescrizione(dto.getDesUnitaMisura());
						if (log.isDebugEnabled())
						{
							log.debug(header+"cod.getCodice() = "+cod.getCodice());
							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
						}
					   listone[i]=cod;
					}
					
				}
			}
				                                                    
			log.debug(header+"fine");
		}	
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return listone;
	}
	
	
//	public CodiceDescrizione[] getListaCombustibile ()throws Exception
//	{
//		String header = "!!!!getListaCombustibile==>.";
//		log.debug(header+"inizio!!");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			//log.debug(header+"vado sul getProvinciaDao()");
//			
//			List<CombustibileDto> lista =	getDbServiceImp().getCombustibileDao().findAll();
//			if(lista==null)
//			{
//				log.debug(header+"lista =  null!!");
//					
//			}
//			else{
//				log.debug(header+"lista not  null!!");
//				
//				listone = new CodiceDescrizione[lista.size()];
//				
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					CombustibileDto dto = new CombustibileDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdCombustibile()));
//						cod.setDescrizione(dto.getDesCombustibile());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//					   listone[i]=cod;
//					}
//					
//				}
//			}
//				                                                    
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}

//	public CodiceDescrizione[] getListaDestinazione()throws Exception
//	{
//		String header = "getListaDestinazione==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getDestinazioneDao()");
//			List<DestinazioneDto> lista =	getDbServiceImp().getDestinazioneDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					DestinazioneDto dto = new DestinazioneDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdDestinazione()));
//						cod.setDescrizione(dto.getDesDestinazione());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}

	
	
//	public CodiceDescrizione[] getListaEvacuazione()throws Exception
//	{
//		String header = "getListaEvacuazione==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getEvacuazioneDao()");
//			List<EvacuazioneDto> lista =	getDbServiceImp().getEvacuazioneDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					EvacuazioneDto dto = new EvacuazioneDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdEvacuazione()));
//						cod.setDescrizione(dto.getDesEvacuazione());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}
	
//	public CodiceDescrizione[] getListalocaleInstall()throws Exception
//	{
//		String header = "getListalocaleInstall==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getEvacuazioneDao()");
//			List<LocaleInstallDto> lista =	getDbServiceImp().getLocaleInstallDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					LocaleInstallDto dto = new LocaleInstallDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdLocaleInstall()));
//						cod.setDescrizione(dto.getDesLocaleInstall());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}
	
//	public CodiceDescrizione[] getListaFluido()throws Exception
//	{
//		String header = "getListaFluido==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getEvacuazioneDao()");
//			List<FluidoDto> lista =	getDbServiceImp().getFluidoDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					FluidoDto dto = new FluidoDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdFluido()));
//						cod.setDescrizione(dto.getDesFluido());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}

//	public CodiceDescrizione[] getListaLuogo()throws Exception
//	{
//		String header = "getListaLuogo==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getLuogoDao()");
//			List<LuogoDto> lista =	getDbServiceImp().getLuogoDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					LuogoDto dto = new LuogoDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdLuogo()));
//						cod.setDescrizione(dto.getDesLuogo());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}

	//marcaAppareccDao
	
//	public CodiceDescrizione[] getListaMarcaApparecc()throws Exception
//	{
//		String header = "getListaMarcaApparecc==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getMarcaAppareccDao()");
//			List<MarcaAppareccDto> lista = getDbServiceImp().getMarcaAppareccDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					MarcaAppareccDto dto = new MarcaAppareccDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdMarca()));
//						cod.setDescrizione(dto.getDesMarca());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}
	
	
//	public CodiceDescrizione[] getListaMarcaEnergia()throws Exception
//	{
//		String header = "getListaMarcaEnergia==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getMarcaEnergiaDao()");
//			List<MarcaEnergiaDto> lista = getDbServiceImp().getMarcaEnergiaDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					MarcaEnergiaDto dto = new MarcaEnergiaDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdMarcaEnergetica()));
//						cod.setDescrizione(dto.getDesMarcaEnergetica());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}

	
	public CodiceDescrizione[] getListaPotenzaImp()throws Exception
	{
		String header = "getListaPotenzaImp==>.";
		log.debug(header+"inizio ");
		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
		
		try{
			
			log.debug(header+"vado sul getPotenzaImpDao()");
			List<PotenzaImpDto> lista =	getDbServiceImp().getPotenzaImpDao().findAll();
			listone = new CodiceDescrizione[lista.size()];
				//log.debug(header+"listaPro not null");
				for (int i = 0; i < lista.size(); i++) {
					
					PotenzaImpDto dto = new PotenzaImpDto();
					dto = lista.get(i);
					if(dto!=null)
					{
						
						CodiceDescrizione cod = new CodiceDescrizione();
						cod.setCodice(String.valueOf(dto.getIdPotenza()));
						cod.setDescrizione(dto.getDesPotenza());
						if (log.isDebugEnabled())
						{
							log.debug(header+"cod.getCodice() = "+cod.getCodice());
							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
						}
						listone[i]=cod;
						
					}
					
				}
				
			log.debug(header+"fine");
		}	
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return listone;
		
		
	}	
	
//	public CodiceDescrizione[] getListaStatoImp()throws Exception
//	{
//		String header = "getListaPotenzaImp==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getStatoImpDao()");
//			List<StatoImpDto> lista =	getDbServiceImp().getStatoImpDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					StatoImpDto dto = new StatoImpDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdStato()));
//						cod.setDescrizione(dto.getDesStato());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}
	
	
//	public CodiceDescrizione[] getListaStatoRapp()throws Exception
//	{
//		String header = " getListaStatoRapp==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getStatoImpDao()");
//			List<StatoRappDto> lista = getDbServiceImp().getStatoRappDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					StatoRappDto dto = new StatoRappDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdStatoRapp()));
//						cod.setDescrizione(dto.getDesStatoRapp());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}
	
	
//	public CodiceDescrizione[] getListaTipoApparecc()throws Exception
//	{
//		String header = " getListaTipoApparecc==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getTipoAppareccDao()");
//			List<TipoAppareccDto> lista = getDbServiceImp().getTipoAppareccDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					TipoAppareccDto dto = new TipoAppareccDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdTipoApparecchiatura()));
//						cod.setDescrizione(dto.getDesTipoApparecchiatura());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}
	
	
//	public CodiceDescrizione[] getListaTipoBruciatore()throws Exception
//	{
//		String header = " getListaTipoBruciatore==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getTipoBruciatoreDao()");
//			List<TipoBruciatoreDto> lista =	getDbServiceImp().getTipoBruciatoreDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					TipoBruciatoreDto dto = new TipoBruciatoreDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdTipoBruciatore()));
//						cod.setDescrizione(dto.getDesTipoBruciatore());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}

	
//	public CodiceDescrizione[] getListaTipo()throws Exception
//	{
//		String header = " getListaTipo==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getTipoDao()");
//			List<TipoDto> lista = getDbServiceImp().getTipoDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					TipoDto dto = new TipoDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdTipo()));
//						cod.setDescrizione(dto.getDesTipo());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}

//	public CodiceDescrizione[] getListaTipoInstall()throws Exception
//	{
//		String header = " getListaTipoInstall==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getTipoInstallDao()");
//			List<TipoInstallDto> lista = getDbServiceImp().getTipoInstallDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					TipoInstallDto dto = new TipoInstallDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdTipoInstall()));
//						cod.setDescrizione(dto.getDesTipoInstall());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}

	//tipologiaImpDao
	
	
//	public CodiceDescrizione[] getListaTipologiaImp()throws Exception
//	{
//		String header = " getListaTipologiaImp==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getTipologiaImpDao()");
//			List<TipologiaImpDto> lista = getDbServiceImp().getTipologiaImpDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					TipologiaImpDto dto = new TipologiaImpDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdTipologia()));
//						cod.setDescrizione(dto.getDesTipologia());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}
	
	
//	public CodiceDescrizione[] getListaTiraggio()throws Exception
//	{
//		String header = " getListaTiraggio==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getTipoInstallDao()");
//			List<TiraggioDto> lista = getDbServiceImp().getTiraggioDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					TiraggioDto dto = new TiraggioDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdTiraggio()));
//						cod.setDescrizione(dto.getDesTiraggio());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}
	//getListaTitoloRespDao
	
//	public CodiceDescrizione[] getListaTitoloResp()throws Exception
//	{
//		String header = " getListaTitoloRespDao==>.";
//		log.debug(header+"inizio ");
//		CodiceDescrizione[] listone = new CodiceDescrizione[]{};
//		
//		try{
//			
//			log.debug(header+"vado sul getTitoloRespDao()");
//			List<TitoloRespDto> lista = getDbServiceImp().getTitoloRespDao().findAll();
//			listone = new CodiceDescrizione[lista.size()];
//				//log.debug(header+"listaPro not null");
//				for (int i = 0; i < lista.size(); i++) {
//					
//					TitoloRespDto dto = new TitoloRespDto();
//					dto = lista.get(i);
//					if(dto!=null)
//					{
//						
//						CodiceDescrizione cod = new CodiceDescrizione();
//						cod.setCodice(String.valueOf(dto.getIdTitolo()));
//						cod.setDescrizione(dto.getDesTitolo());
//						if (log.isDebugEnabled())
//						{
//							log.debug(header+"cod.getCodice() = "+cod.getCodice());
//							log.debug(header+"cod.getDescrizione() = "+cod.getDescrizione());
//						}
//						listone[i]=cod;
//						
//					}
//					
//				}
//				
//			log.debug(header+"fine");
//		}	
//		catch (Exception ex)
//		{
//			log.error(header+"errore= ", ex);
//		}
//		return listone;
//		
//		
//	}
	
	public boolean isUtenteAutorizzato(Utente utente, Integer idFunzionalita) throws Exception
	{
		String header = "!!!!isUtenteAutorizzato==>.";
		log.debug(header+"inizio!!");
		
		boolean isAuth = false;
		
		try{
			
			
			// DEVO RICERCARE L'UTENTE
			List<UserElencoWsByUtenteFunzionalitaDto> list = getDbServiceImp().getUserElencoWsDao().findByUtenteFunzionalita(new UtenteFunzionalitaFilter(utente.getUtente(), utente.getPassword(), idFunzionalita));
			
			if (list != null && list.size() > 0)
			{			
				isAuth = true;
			}
				      
			log.debug("L'utente e' autorizzato: "+isAuth);
			
			log.debug(header+"fine");
		}	
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return isAuth;
		
		
	}
	
	public UtenteJWT isUtenteAutorizzato(String tokenJWT, Integer idFunzionalita) throws Exception
	{
		String header = "!!!!isUtenteAutorizzato==>.";
		log.debug(header+"inizio!!");
		
		UtenteJWT utenteJWT = null;
		
		try{
			log.debug("isUtenteAutorizzato - verifyToken - START");
			utenteJWT = GenericUtil.verifyToken(tokenJWT);
			log.debug("isUtenteAutorizzato - verifyToken - END");
			String subjectJWT = utenteJWT.getSubject();
			log.debug("subjectJWT: "+ utenteJWT.getSubject());
			
			String idPersonaGiuridica = utenteJWT.getIdPersonaGiuridica();
			log.debug("IdPersonaGiuridica: "+ utenteJWT.getIdPersonaGiuridica());
			
			Integer idUtenteWS = null;
			
			if (subjectJWT.equals(Constants.SUBJECT_JWT_FRUITORE)) {
				
				log.debug("codiceFruitore: "+ utenteJWT.getCodiceFruitore());
				String codiceFruitore = utenteJWT.getCodiceFruitore();
				
				List<SigitTUserWSDto> utentiWS = getDbServiceImp().cercaUtenteWSByUserWS(codiceFruitore);
				log.debug("utentiWS list: "+ utentiWS.size());
				
				if (utentiWS == null || utentiWS.size() == 0) {
					throw new SigitextException(Messages.ERROR_TOKEN_NON_VALIDO);
				}
				
				SigitTUserWSDto utenteWS = utentiWS.get(0);
				
				idUtenteWS = utenteWS.getIdUserWs();
				
				if (!codiceFruitore.equals(Constants.CODICE_FRUITORE_SIGIT)) {

					if (!utenteWS.getToken().equals(tokenJWT)
							|| utenteWS.getDtScadenzaToken() == null 
							|| utenteWS.getDtScadenzaToken().compareTo(utenteJWT.getExpiration()) != 0) {
						throw new SigitextException(Messages.ERROR_TOKEN_NON_VALIDO);
					}
				}
				else {
					log.debug("codiceFiscalePF: "+ utenteJWT.getCodiceFiscalePersonaFisica());
					String codiceFiscalePF = utenteJWT.getCodiceFiscalePersonaFisica();
					
					List<SigitTPersonaFisicaDto> personeFisiche = getDbServiceImp().cercaPersonaFisicaByCodiceFiscale(codiceFiscalePF);
					log.debug("personeFisiche: "+ personeFisiche.size());
					SigitTPersonaGiuridicaDto personaGiuridica = null;
	
					if (idPersonaGiuridica != null) {
						
						personaGiuridica = getDbServiceImp().cercaPersonaGiuridicaById(ConvertUtil.convertToBigDecimal(idPersonaGiuridica));
					}
					
					if ((idPersonaGiuridica != null && personaGiuridica == null) || personeFisiche == null || personeFisiche.size() == 0) {
						log.debug("ECCEZIONE GESTITA START(isUtenteAutorizzato) risultato condizione in if");
						throw new SigitextException(Messages.ERROR_TOKEN_NON_VALIDO);
					}
					
				}
				
			} else {
				
				idUtenteWS = Constants.ID_USER_WS_FRUITORI_ESTERNI;
				
				SigitTPersonaGiuridicaDto personaGiuridica = getDbServiceImp().cercaPersonaGiuridicaById(ConvertUtil.convertToBigDecimal(idPersonaGiuridica));

				String codiceRea = MapDto.getCodiceRea(personaGiuridica.getSiglaRea(), ConvertUtil.convertToString(personaGiuridica.getNumeroRea()));
				
				if (!personaGiuridica.getToken().equals(tokenJWT) 
						|| !subjectJWT.equals(codiceRea) 
						|| personaGiuridica.getDtScadenzaToken() == null 
						|| personaGiuridica.getDtScadenzaToken().compareTo(utenteJWT.getExpiration()) != 0) {
					throw new SigitextException(Messages.ERROR_TOKEN_NON_VALIDO);
				}
				
				Integer statoPg = personaGiuridica.getFkStatoPg();
				
				if (statoPg == Constants.ID_STATO_IMPRESA_CESSATA || 
					statoPg == Constants.ID_STATO_IMPRESA_SOSPESA ||
					statoPg == Constants.ID_STATO_IMPRESA_RADIATA) {
					throw new SigitextException(Messages.ERROR_IMPRESA_CESSATA);
				}
			}
			log.debug("idUtenteWS: "+ idUtenteWS);
			log.debug("idFunzionalita: "+ idFunzionalita);
			List<UserElencoWsDto> elencoWS = getDbServiceImp().getUserElencoWsDao().findByIdUtenteAndIdFunzionalita(new UtenteFunzionalitaFilter(idUtenteWS, idFunzionalita));
			log.debug("elencoWS: "+ elencoWS.size());
			if (elencoWS == null || elencoWS.size() == 0)
			{			
				throw new SigitUserNotAuthorizedException("Utente non autorizzato all'utilizzo del servizio");
			}
			
			log.debug("L'utente e' autorizzato");
			
			log.debug(header+"fine");
		}	
		catch (SigitextException ex) {
			throw ex;
		}
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
			return null;
		}
		return utenteJWT;
	}
	
	public Impianto[] getImpiantoByCodImpianto(Integer codImpianto)throws Exception
	{
		String header = "!!!!getImpiantoByCodImpianto==>.";
		log.debug(header+"inizio!!");

		Impianto[] result = null;
		
		try{
			

			ArrayList<Impianto> listaImpiantiParz = getListImpiantoByCodImpianto(codImpianto);

			if (listaImpiantiParz != null && listaImpiantiParz.size() > 0)
			{
				result = listaImpiantiParz.toArray(new Impianto[listaImpiantiParz.size()]);
			}


				                                                    
			log.debug(header+"fine");
		}	
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return result;
		
		
	}
	
	/**
	 * Legge un valore dalla configurazione
	 * 
	 * @param chiave Chiave del valore
	 * @return Valore associato alla chiave
	 * @throws Exception Errore durante la lettura della configurazione
	 */
	private WrkConfigDto cercaConfigValue(String chiave) throws Exception {
		
		String header = "!!!!cercaConfigValue==>.";
		log.debug(header+"inizio!!");
		
		List<WrkConfigDto> dtoList = null;
		WrkConfigDto dto = null;

		log.debug("[DbMgr::getConfigValue] BEGIN");
		try {
			dtoList = getDbServiceImp().getWrkConfigDao().findByChiaveConfig(chiave);

			if((dtoList != null) && (dtoList.size() > 0)) {
				dto = dtoList.get(0);
				log.debug("[DbMgr::getConfigValue] Trovato il DTO " + dto);
			}
			else
			{
				log.debug("[DbMgr::getConfigValue] Nessun DTO trovato");
			}
			
			log.debug(header+"fine");

		}
		catch(WrkConfigDaoException ex) {
			log.error(header+"errore= ", ex);
		}
		
		return dto;
	}
	
	/**
	 * Legge un valore dalla configurazione e ritorna il campo valore_config_char
	 * 
	 * @param chiave Chiave del valore
	 * @return ValoreConfigChar associato alla chiave
	 * @throws Exception Errore durante la lettura della configurazione
	 */
	private String cercaConfigValueCarattere(String chiave) throws Exception {
		WrkConfigDto dto = null;

		String header = "!!!!cercaConfigValueCarattere==>.";
		log.debug(header+"inizio!!");
		
		dto = cercaConfigValue(chiave);

		log.debug(header+"fine");

		return dto.getValoreConfigChar();
	}

	/**
	 * Legge un valore dalla configurazione e ritorna il campo valore_config_num
	 * 
	 * @param chiave Chiave del valore
	 * @return ValoreConfigNum associato alla chiave
	 * @throws Exception Errore durante la lettura della configurazione
	 */
	private Integer cercaConfigValueNumerico(String chiave) throws Exception {
		WrkConfigDto dto = null;

		String header = "!!!!cercaConfigValueNumerico==>.";
		log.debug(header+"inizio!!");
		
		dto = cercaConfigValue(chiave);

		log.debug(header+"fine");

		return ConvertUtil.convertToInteger(dto.getValoreConfigNum());
	}
	
	/**
	 * Legge un valore dalla configurazione e ritorna il campo valore_config_flag
	 * 
	 * @param chiave Chiave del valore
	 * @return ValoreConfigFlg associato alla chiave
	 * @throws Exception Errore durante la lettura della configurazione
	 */
	private Boolean cercaConfigValueFlg(String chiave) throws Exception {
		WrkConfigDto dto = null;

		String header = "!!!!cercaConfigValueNumerico==>.";
		log.debug(header+"inizio!!");
		
		dto = cercaConfigValue(chiave);

		log.debug(header+"fine");

		return ConvertUtil.convertToBoolean(dto.getValoreFlag());
	}

	
	public Impianto[] getImpiantoByPod(String pod) throws Exception, SigitExcessiveResultsException
	{
		String header = "!!!!getImpiantoByPod==>.";
		log.debug(header+"inizio!!");

		Impianto[] result = null;

		try{
			
			int maxResult = cercaConfigValueNumerico(Constants.MAX_RISULTATI_WS);

			log.debug("STAMPO IL MAX DI RISULTATI: "+maxResult);
			
			ArrayList<Impianto> listaImpianti = new ArrayList<Impianto>();
			
			List<UnitaImmobiliareDto> listaUnitaImmDto = getDbServiceImp().getUnitaImmobiliareDao().findByPod(pod);
			
			if (log.isDebugEnabled())
				log.debug("STAMPO IL numero di unita immobiliari: "+listaUnitaImmDto);

			
			if (listaUnitaImmDto != null && listaUnitaImmDto.size() > 0)
			{
				if (listaUnitaImmDto.size() < maxResult)
				{
					for (UnitaImmobiliareDto unitaImmobiliareDto : listaUnitaImmDto) {
						
						ArrayList<Impianto> listaImpiantiParz = getListImpiantoByCodImpianto(ConvertUtil.convertToInteger(unitaImmobiliareDto.getCodiceImpianto()));
						
						if (listaImpiantiParz != null && listaImpiantiParz.size() > 0)
						{
							listaImpianti.addAll(listaImpiantiParz);
						}
						
					}
					
					result = listaImpianti.toArray(new Impianto[listaImpianti.size()]);
				}
				else
				{
					throw new SigitExcessiveResultsException("Sono stati estratti troppi risultati");
				}
			}
			
				                                                    
			log.debug(header+"fine");
		}
		catch (SigitExcessiveResultsException ex)
		{
			throw ex;
		}
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return result;
		
		
	}
	
	public Impianto[] getImpiantoByPdr(String pdr)throws Exception, SigitExcessiveResultsException
	{
		String header = "!!!!getImpiantoByPdr==>.";
		log.debug(header+"inizio!!");
		Impianto[] result = null;


		try{
			
			int maxResult = cercaConfigValueNumerico(Constants.MAX_RISULTATI_WS);

			log.debug("STAMPO IL MAX DI RISULTATI: "+maxResult);
			
			ArrayList<Impianto> listaImpianti = new ArrayList<Impianto>();

			List<UnitaImmobiliareDto> listaUnitaImmDto = getDbServiceImp().getUnitaImmobiliareDao().findByPdr(pdr);
			
			
			if (listaUnitaImmDto != null && listaUnitaImmDto.size() > 0)
			{
				if (listaUnitaImmDto.size() < maxResult)
				{
					for (UnitaImmobiliareDto unitaImmobiliareDto : listaUnitaImmDto) {
						
						ArrayList<Impianto> listaImpiantiParz = getListImpiantoByCodImpianto(ConvertUtil.convertToInteger(unitaImmobiliareDto.getCodiceImpianto()));
						
						if (listaImpiantiParz != null && listaImpiantiParz.size() > 0)
						{
							listaImpianti.addAll(listaImpiantiParz);
						}
						
					}
					
					result = listaImpianti.toArray(new Impianto[listaImpianti.size()]);
				}
				else
				{
					throw new SigitExcessiveResultsException("Sono stati estratti troppi risultati");
				}
			}
			
				                                                    
			log.debug(header+"fine");
		}	
		catch (SigitExcessiveResultsException ex)
		{
			throw ex;
		}
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return result;
		
		
	}
	
	
	public ArrayList<Impianto> getListImpiantoByCodImpianto(Integer codiceImp)throws Exception
	{
		String header = "!!!!getImpiantoByCodice==>.";
		log.debug(header+"inizio!!");
		ArrayList<Impianto>  listaImpianti = new ArrayList();
		RifCatastale[] listaUi = new RifCatastale[]{};
		RappControllo[] listaRapp = new RappControllo[]{};

		try{
			
			//log.debug(header+"vado sul getProvinciaDao()");
			
			List<ExtImpiantoDto> listaImpiantiDto = getDbServiceImp().getSigitExtDao().findImpiantiByCodice(codiceImp);
			if(listaImpiantiDto==null)
			{
				log.debug(header+"lista =  null!!");
					
			}
			else{
				log.debug(header+"lista not  null!!");
				
				// Non e' piu' prevista la gestione fittizia dell'UID, e' sempre quello di INDEX
				//boolean isGestioneUidFittizio = isGestioneUidFittizio(codiceImp);
				//log.debug(header+"isGestioneUidFittizio: "+isGestioneUidFittizio);
				
				//listaImpianti = new Impianto[listaImpiantiDto.size()];
				
				//log.debug(header+"listaPro not null");
				for (int i = 0; i < listaImpiantiDto.size(); i++) {
					
					ExtImpiantoDto dto = new ExtImpiantoDto();
					dto = listaImpiantiDto.get(i);
					if(dto!=null)
					{
						
						Impianto imp = new Impianto();
						
						imp.setCodiceImpianto(ConvertUtil.convertToInteger(dto.getCodiceImpianto()));
						imp.setStato(dto.getDesStato());
						imp.setDtAssegnazione(ConvertUtil.convertToString(dto.getDataAssegnazione()));
						imp.setDtDismissione(ConvertUtil.convertToString(dto.getDataDismissione()));
						imp.setMotivoDisimissione(dto.getMotivazione());
						
						imp.setIndirizzo(dto.getIndirizzo());
						imp.setCivico(dto.getCivico());
						imp.setDescComune(dto.getDenominazioneComune());
						imp.setSiglaProv(dto.getSiglaProvincia());
						
						imp.setCfResponsabile(dto.getCfResponsabile());
						imp.setDenomResponsabile(dto.getDenominazioneResponsabile());
						
						imp.setCf3Responsabile(dto.getCf3Responsabile());
						imp.setDenom3Responsabile(dto.getDenominazione3Responsabile());
						
						
						// Non e' piu' prevista la gestione fittizia dell'UID, e' sempre quello di INDEX
						/*
						if (isGestioneUidFittizio)
						{
							// Se sono nella nuova gestione, ritorno il libretto come fotografia attuale, quindi mi creo un uid fittizio
							imp.setDtUltAggLibretto(new Date());
							imp.setUidIndexLibretto(MapDto.costruisciUidIndexLibrettoFittizio(codiceImp));
						}
						else
						{
							imp.setDtUltAggLibretto(dto.getDataConsolidamento());
							imp.setUidIndexLibretto(dto.getUidIndex());
						}
						*/

						imp.setDtUltAggLibretto(ConvertUtil.convertToString(dto.getDataConsolidamento()));
						imp.setUidIndexLibretto(dto.getUidIndex());


						List<UnitaImmobiliareDto> listaUiDto = getDbServiceImp().getUnitaImmobiliareDao().findByCodiceImpianto(ConvertUtil.convertToInteger(dto.getCodiceImpianto()));
						
						RifCatastale rifC = null;
						listaUi = new RifCatastale[listaUiDto.size()];

						UnitaImmobiliareDto uiDto = null;
						for (int j = 0; j < listaUiDto.size(); j++) {
							
							uiDto = listaUiDto.get(j);
							
							rifC = new RifCatastale();
							
							rifC.setSezione(uiDto.getSezione());
							rifC.setFoglio(uiDto.getFoglio());
							rifC.setParticella(uiDto.getParticella());
							rifC.setSubalterno(uiDto.getSubalterno());
							rifC.setPod(uiDto.getPodElettrico());
							rifC.setPdr(uiDto.getPdrGas());
							
							listaUi[j] = rifC;
						}

						

						List<RicercaAllegatiDto> listaAllegatoDto = getDbServiceImp().getRicercaAllegatiDao().findInviatiByCodiceImpianto(ConvertUtil.convertToString(dto.getCodiceImpianto()));

						RappControllo rappC = null;
						listaRapp = new RappControllo[listaAllegatoDto.size()];

						RicercaAllegatiDto allegatoDto = null;
						for (int j = 0; j < listaAllegatoDto.size(); j++) {
							
							allegatoDto = listaAllegatoDto.get(j);
							
							rappC = new RappControllo();
							
							rappC.setDescTipoDoc(allegatoDto.getDesTipoDocumento());
							
							rappC.setSiglaBollino(allegatoDto.getFkSiglaBollino());
							rappC.setNumBollino(ConvertUtil.convertToString(allegatoDto.getFkNumeroBollino()));
							rappC.setDtControllo(ConvertUtil.convertToString(allegatoDto.getDataControllo()));
							rappC.setApparecchiature(allegatoDto.getElencoApparecchiature());
							rappC.setUidIndexLibretto(allegatoDto.getUidIndex());
							
							listaRapp[j] = rappC;
						}

						
						imp.setRifCatastali(listaUi);
						imp.setRappControllo(listaRapp);

						listaImpianti.add(imp);
					}
					
				}
			}
				                                                    
			log.debug(header+"fine");
		}	
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return listaImpianti;
		
		
	}
	
	private boolean isGestioneUidFittizio(Integer codiceImpianto)
	{
		String header = "!!!!isGestioneUidFittizio==>.";
		log.debug(header+"inizio!!");
		boolean isGestioneLibrettoNow = false;

		try{

			SigitTControlloLibrettoDto controlloLibretto = getDbServiceImp().getControlloLibretto(codiceImpianto);

			if (log.isDebugEnabled())
			{
				GenericUtil.stampa(controlloLibretto, true, 3);
			}	
			
			if (controlloLibretto != null &&
					ConvertUtil.convertToBooleanAllways(controlloLibretto.getFlgL1Controlloweb()) && 
					ConvertUtil.convertToBooleanAllways(controlloLibretto.getFlgL5Controlloweb()) && 
					ConvertUtil.convertToBooleanAllways(controlloLibretto.getFlgL6Controlloweb()) && 
					ConvertUtil.convertToBooleanAllways(controlloLibretto.getFlgL7Controlloweb()))
			{
				
				log.debug(header+" Controllo libretto WEB OK");

				
				List<SigitRImpRuoloPfpgDto> responsabiliImpiantoAttivi = getDbServiceImp().getResponsabiliImpiantoAttivi(codiceImpianto);

				GenericUtil.stampa(responsabiliImpiantoAttivi, true, 3);

				if (responsabiliImpiantoAttivi != null && responsabiliImpiantoAttivi.size() > 0)
				{
					log.debug(header+" Controllo responsabile attivo OK");

					isGestioneLibrettoNow = true;
				}
			}
			
			log.debug(header+"fine");
		}	
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return isGestioneLibrettoNow;
		
	}
	
	public Documento getLibrettoByUid(String uid)throws Exception
	{
		String header = "!!!!getLibrettoByUid==>.";
		log.debug(header+"inizio!!");
		Documento result = null;

		try{
			
			OperationContext oc = indexGetOperationContext(Constants.INDEX_USERNAME_READ);
			
			result = new Documento();
			byte[] docByte = null;

			// Non e' piu' prevista la gestione fittizia dell'UID, e' sempre quello di INDEX
//			if (isGestioneLibrettoNow(uid))
//			{
//				String codImpianto = uid.substring(Constants.UID_FITTIZIO_PREFIX.length(), uid.length());
//				
//				result = getLibretto(ConvertUtil.convertToInteger(codImpianto));
//			}
//			else
//			{
			ResultContent metaDati = indexMetadatiByUid(uid, oc);
			
			String nomeFile = metaDati.getPrefixedName().substring(6);
			
			docByte = indexFileByUid(uid, nomeFile, oc);

			result.setDoc(docByte);
			
			result.setUid(metaDati.getUid());
			
			result.setNome(nomeFile);
			result.setMimeType(metaDati.getMimeType());
			result.setEncoding(metaDati.getEncoding());
//			}

			
			
			log.debug(header+"fine");
		}	
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return result;
		
		
	}
	
	private boolean isGestioneLibrettoNow(String uid)
	{
		String header = "!!!!getImpiantoByPdr==>.";
		log.debug(header+"inizio!!");
		boolean isGestioneLibrettoNow = false;

		try{

			isGestioneLibrettoNow = uid.startsWith(Constants.UID_FITTIZIO_PREFIX);
			
			log.debug(header+"fine");
		}	
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return isGestioneLibrettoNow;
		
	}
	
	public Documento getLibrettoNew(String uid)throws Exception
	{
		String header = "!!!!getLibrettoNew==>.";
		log.debug(header+"inizio!!");
		Documento result = null;

		try{
			
			OperationContext oc = indexGetOperationContext(Constants.INDEX_USERNAME_READ);
			
			result = new Documento();
			
			
			byte[] docByte = indexFileByUid(uid, "", oc);
			result.setDoc(docByte);
			
			ResultContent metaDati = indexMetadatiByUid(uid, oc);
			
			result.setUid(metaDati.getUid());
			
			result.setNome(metaDati.getPrefixedName().substring(6));
			result.setMimeType(metaDati.getMimeType());
			result.setEncoding(metaDati.getEncoding());
			
			log.debug(header+"fine");
		}	
		catch (Exception ex)
		{
			log.error(header+"errore= ", ex);
		}
		return result;
	}

	public Libretto getLibretto(Integer idImpianto, Boolean isConsolidato){
		log.debug("[ModuloBuilder::showLibretto] START");
//		Applicazione app;
//		it.csi.modolxp.modolxpsrv.dto.Utente utente;
		Libretto result;
		try {
			
			result = new Libretto();
			
//			app = new Applicazione();
//			app.setCodiceApplicazione(Constants.CODICE_APPLICAZIONE_MODOL);
//			utente = null;
//			XmlModel model = getXmlModelLibretto(idImpianto, isConsolidato);

			byte[] docByte = getXmlModelLibrettoByte(idImpianto, isConsolidato);

			// Modificato per problema su modol, mi serve capire se e' statico o dinamico, per differenziare il nome del doc
			/*
			Documento doc = new Documento();

			byte[] docByte = showModuloLibretto(app,utente,model);
			doc.setDoc(docByte);
			doc.setNome(getNomeFileLibretto(idImpianto));
			doc.setMimeType(Constants.MIME_TYPE_PDF);
			doc.setEncoding(Constants.UTF_8_ENCODING);
			*/
			
//			Documento doc = showModuloLibretto(idImpianto, app,utente,model);
			DatiLibretto datiLibretto = getDbServiceImp().getDatiLibretto(idImpianto, isConsolidato);
			Documento doc = getLibrettoBuilderService().generaLibretto(datiLibretto, false, !isConsolidato);
			
			if (docByte != null) {				
				result.setLibrettoXml(docByte);
			}
			
			result.setLibrettoPdf(doc);
			
			return result;
		
		}catch(Exception e){
			log.error("Errore apertura file",e);
			return null;
		}finally{
			log.debug("[ModuloBuilder::showLibretto] END");
		}
	}
	
	public Documento getXMLLibretto(Integer idImpianto, Boolean isConsolidato){
		log.debug("[ModuloBuilder::getXMLLibretto] START");
//		Applicazione app;
//		it.csi.modolxp.modolxpsrv.dto.Utente utente;
		Documento result;
		try {
//			app = new Applicazione();
//			app.setCodiceApplicazione(Constants.CODICE_APPLICAZIONE_MODOL);
//			utente = null;
//			XmlModel model = getXmlModelLibretto(idImpianto, isConsolidato);
//
			result = new Documento();

			byte[] docByte = getXmlModelLibrettoByte(idImpianto, isConsolidato);
			result.setDoc(docByte);
			result.setNome(getNomeFileXMLLibretto(idImpianto));
			result.setMimeType(Constants.MIME_TYPE_XML);
			result.setEncoding(Constants.UTF_8_ENCODING);
			
			return result;
		
		}catch(Exception e){
			log.error("Errore apertura file",e);
			return null;
		}finally{
			log.debug("[ModuloBuilder::getXMLLibretto] END");
		}
	}
	
	public Documento getXMLLibrettoConsolidato(Integer codiceImpianto) throws SigitextException, IOException {
		
		Documento xmlLibrettoConsolidato = new Documento();
		
		List<SigitTLibrettoDto> librettoList = getDbServiceImp().cercaLibrettoByStato(codiceImpianto,  Constants.ID_STATO_LIBRETTO_CONSOLIDATO);
		
		if (librettoList == null || librettoList.size() == 0 || librettoList.get(0) == null)
		{
			// Non esiste un libretto consolidato
			throw new SigitextException(Messages.ERROR_NESSUN_LIBRETTO_CONSOLIDATO_TROVATO);
		}
		
		SigitTLibrettoDto libretto = librettoList.get(0);
		SigitTLibTxtDto libTxt = getDbServiceImp().getTxtLibretto(libretto.getIdLibretto());
		byte[] fileXml = XmlBeanUtils.readString(libTxt.getXmlLibretto());

		xmlLibrettoConsolidato.setDoc(fileXml);
		xmlLibrettoConsolidato.setNome(libretto.getFileIndex()+".xml");
		xmlLibrettoConsolidato.setMimeType(Constants.MIME_TYPE_XML);
		xmlLibrettoConsolidato.setEncoding(Constants.UTF_8_ENCODING);
		
		return xmlLibrettoConsolidato;
	}
	

	public void uploadXMLLibretto(Integer codiceImpianto, byte[] xml, UtenteJWT utenteJWT) throws SigitextException {
		
		if (codiceImpianto == null) {
			throw new SigitextException(Messages.ERROR_CODICE_IMPIANTO_NON_VALIDO);
		}
		
		SigitTImpiantoDto impianto = getDbServiceImp().getImpiantoByCod(ConvertUtil.convertToBigDecimal(codiceImpianto));
		List<SigitTUnitaImmobiliareDto> unitaImmobiliariImpianto = getDbServiceImp().getUnitaImmobiliariImpianto(codiceImpianto);
		
		if (impianto == null || unitaImmobiliariImpianto == null || unitaImmobiliariImpianto.size() == 0) {
			throw new SigitextException(Messages.ERROR_IMPIANTO_NON_CENSITO);
		}
		
		SigitTControlloLibrettoDto controlloLibrettoImpianto = getDbServiceImp().getControlloLibretto(codiceImpianto);
		List<SigitTLibrettoDto> librettoImpianto = getDbServiceImp().getLibrettoByCodImpianto(codiceImpianto);
		SigitTImportXmlLibDto importXmlLibretto = getDbServiceImp().getImportXmlLibrettoByCodImpianto(ConvertUtil.convertToBigDecimal(codiceImpianto));
		
		if ((controlloLibrettoImpianto != null && ConvertUtil.convertToBooleanAllways(controlloLibrettoImpianto.getFlgL1Controlloweb())) || 
				(librettoImpianto != null && librettoImpianto.size() != 0) || importXmlLibretto != null) {
			throw new SigitextException(Messages.ERROR_LIBRETTO_IMPIANTO_PRESENTE);
		}
		
		LibrettoDocument document = getValidationManager().validazioneXmlImportLibretto(xml);
				
		String idPersonaGiuridica = utenteJWT.getIdPersonaGiuridica();
		if (idPersonaGiuridica == null) {			
			throw new SigitextException(Messages.ERROR_RUOLO_UTENTE_LOGGATO);
		}
		
		SigitTPersonaGiuridicaDto personaGiuridica = getDbServiceImp().cercaPersonaGiuridicaById(ConvertUtil.convertToBigDecimal(idPersonaGiuridica));
		
		String cfUtente = utenteJWT.getCodiceFiscalePersonaFisica() != null ? utenteJWT.getCodiceFiscalePersonaFisica() : personaGiuridica.getCodiceFiscale();
		
		getDbServiceImp().insertImportLibretto(ConvertUtil.convertToBigDecimal(codiceImpianto), xml, cfUtente);

		getDbServiceImp().generaLibrettoImportNew(document, ConvertUtil.convertToString(codiceImpianto), ConvertUtil.convertToInteger(idPersonaGiuridica), cfUtente);
	}

	public Integer uploadXMLControllo(Integer codiceImpianto, String tipoControllo, byte[] xml, UtenteJWT utenteJWT) throws SigitextException {
		
		if (codiceImpianto == null) {
			throw new SigitextException(Messages.ERROR_CODICE_IMPIANTO_NON_VALIDO);
		}
		
		SigitTImpiantoDto impianto = getDbServiceImp().getImpiantoByCod(ConvertUtil.convertToBigDecimal(codiceImpianto));

		if (impianto == null || GenericUtil.isNullOrEmpty(impianto.getFlgTipoImpianto()))
		{
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S157, codiceImpianto));
		}
		
		List<SigitTLibrettoDto> librettoList = getDbServiceImp().cercaLibrettoByStato(codiceImpianto,  Constants.ID_STATO_LIBRETTO_CONSOLIDATO);
		
		if (librettoList == null || librettoList.size() == 0 || librettoList.get(0) == null)
		{
			// Non esiste un libretto consolidato
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S099, codiceImpianto));
		}
		
		String idPersonaGiuridica = utenteJWT.getIdPersonaGiuridica();
	
		SigitTPersonaGiuridicaDto personaGiuridica = getDbServiceImp().cercaPersonaGiuridicaById(ConvertUtil.convertToBigDecimal(idPersonaGiuridica));
		
		String cfUtente = utenteJWT.getCodiceFiscalePersonaFisica() != null ? utenteJWT.getCodiceFiscalePersonaFisica() : personaGiuridica.getCodiceFiscale();
		
		SigitTPreImportDto dtoPreImport = inserisciPreImport(cfUtente);
		
		ImportFilter importData;
		
		try {
			importData = getValidationManager().validazionePreImportXmlControllo(codiceImpianto, tipoControllo, personaGiuridica, xml);
		} catch (SigitextException e) {
			dtoPreImport.setMsg(e.getMessage());
			getDbServiceImp().aggiornaPreImport(dtoPreImport);
			throw e;
		}
		
		importData.setIdPreImport(dtoPreImport.getIdPreImport());
		
		SigitTImportDto dtoImport = getDbServiceImp().insertImport(importData);
		
		DettaglioAllegato dettaglioAllegato = importData.getDettaglioAllegato();
				
		dettaglioAllegato.setCodFiscaleUtenteLoggato(cfUtente);
		
		try {
			 getValidationManager().validazioneImportXmlControllo(importData, tipoControllo);
			 
			 getConnectorManager().salvaAllegatoImportTrans(dettaglioAllegato, xml, tipoControllo, librettoList.get(0), cfUtente);
			 
		} catch (SigitextException e) {
			getDbServiceImp().aggiornaImport(dtoImport, e.getMessage(), dettaglioAllegato.getIdAllegato());
			throw e;
		}
		
		getDbServiceImp().aggiornaImport(dtoImport, null, dettaglioAllegato.getIdAllegato());
		
		return dettaglioAllegato.getIdAllegato();
	}
	
	private byte[] getXmlModelLibrettoByte(Integer idImpianto, Boolean isConsolidato){
		log.debug("[ModuloBuilder::getXmlModelLibrettoByte] START");

		//recupero il modello xml dal documento
		byte[] xmlByteArray = null;
		try {
			xmlByteArray = XmlBeanUtils.extractByteArray(getLibrettoDocument(idImpianto, isConsolidato));
			
			//log.debug(new String(xmlByteArray,"UTF-8"));
			
			return xmlByteArray;
		}catch(Exception e){
			log.error("Errore", e);
			return null;
		} finally{
			log.debug("[ModuloBuilder::getXmlModelLibrettoByte] END");
		}
	}

	private MODDocument getLibrettoDocument(Integer idImpianto, Boolean isConsolidato) throws Exception {
		log.debug("[SigitextManager::getLibrettoDocument] BEGIN");
		try {
		
			
			log.debug("Creiamo il libretto con i dati del DB");
			//	il libretto e' nullo, prendere i dati dal db anche quando NON ci sono libretti consolidati
			return getDbServiceImp().getModuloLibretto(idImpianto, ConvertUtil.convertToBooleanAllways(isConsolidato));
			//					modDoc = MODDocument.Factory.newInstance();
			//					modDoc.addNewMOD().addNewRichiesta().addNewDatiPrecompilati().addNewSezCatasto();

			
			
		}catch (Exception e) {
				log.error("Errore getLibrettoDocument",e);
				throw new Exception(e);
		}finally{
			log.debug("[SigitextManager::getLibrettoDocument] END");
		}
	}

	/*
	private Documento showModuloLibretto(Integer idImpianto, Applicazione app, it.csi.modolxp.modolxpsrv.dto.Utente utente, XmlModel xmlModel) throws SigitextException {
		log.debug("[SigitextManager::showModuloLibretto] BEGIN");
		
		Documento doc = new Documento();
		
		//byte[] thePdfStatico = null;
		try
		{
			Modulo modulo = cercaModulo(app, Constants.CODICE_MODULO_MODOL_LIBRETTO);
			int maxByteToPdfA = cercaConfigValueNumerico(Constants.MAX_BYTE_TOPDFA);

			log.debug("CODICE MODOL LIBRETTO: "  + Constants.CODICE_MODULO_MODOL_LIBRETTO);
			if(modulo!=null)
			{
				//modulo.getModello().getRendererModality()[0].setSelezionataPerRendering(true);
				
				RendererModalityExpert.attivaRenderingReaderExtensions(modulo.getModello().getRendererModality());
				
				if (log.isDebugEnabled())
				{
					log.debug("########################################");
					log.debug("faccio il merge");
					log.debug("xmlModel: "+xmlModel.toString());
					log.debug("modulo: "+modulo);
					log.debug("########################################");
				}
				
				log.debug("showModuloLibretto - PROVA MODOL");
				
				log.debug("mergeModulo codice impianto "+idImpianto+" - PRIMA: "+System.currentTimeMillis());
				byte[] docByte = getModol().mergeModulo(app, utente, modulo, xmlModel).getDataContent();
				log.debug("mergeModulo codice impianto "+idImpianto+" - DOPO: "+System.currentTimeMillis());
				

				it.csi.modolxp.modolxppdfgensrv.dto.Applicazione appPdfStatico = new it.csi.modolxp.modolxppdfgensrv.dto.Applicazione();
				appPdfStatico.setCodiceApplicazione(Constants.CODICE_APPLICAZIONE_MODOL);

				//byte[] thePdfStaticoNew = null;
				
				
				// Forse non serve piu'
				
//				PdfStaticInputRequest pdfStaticInputRequest = new PdfStaticInputRequest();
//				pdfStaticInputRequest.setPdfInput(docByte);
//
//				log.debug("toStaticPdf - PRIMA: "+System.currentTimeMillis());
//				thePdfStaticoNew = getModolPdf().toStaticPdf(appPdfStatico, null, pdfStaticInputRequest);			
//				log.debug("toStaticPdf - DOPO: "+System.currentTimeMillis());
				
				
				// Se il metodo toStaticPdf non serve piu'
				//thePdfStaticoNew = docByte;
				
				log.debug("PRIMA DELLA CREAZIONE DEL PDF STATICO");
				
				
				byte[] thePdfStatico = null;
				boolean isPdfStatic = false;
				
				try
				{
					log.info("[SigitextManager::showModuloLibretto] impianto: "+idImpianto);
					log.info("[SigitextManager::showModuloLibretto] docByte.length: "+(docByte.length));
					
					log.debug("maxMBToPdfA: "+maxByteToPdfA);
					
					if (docByte.length < maxByteToPdfA)
					{
						PdfAInputRequest pdfAInputRequest = new PdfAInputRequest();

						pdfAInputRequest.setPdfInput(docByte);
						log.debug("toPdfA codice impianto "+idImpianto+" - PRIMA: "+System.currentTimeMillis());
						thePdfStatico = getModolPdf().toPdfA(appPdfStatico, null, pdfAInputRequest);
						isPdfStatic = true;
						log.debug("toPdfA codice impianto "+idImpianto+" - DOPO: "+System.currentTimeMillis());
						log.info("[SigitextManager::showModuloLibretto] trasformato in toPdfA impianto: "+idImpianto);

					}
					else
					{
						log.error("[SigitextManager::showModuloLibretto] - Il libretto del codice impianto "+idImpianto+" e' troppo grande, non lo trasformo in toPdfA");

						thePdfStatico = docByte;
						isPdfStatic = false;
					}
				}
				catch (Exception e)
				{
					log.error("[SigitextManager::showModuloLibretto] - Ho ricevuto l'eccezione su toPdfA, quindi ritorno il doc 'compilabile': "+idImpianto, e);

					// Se ricevo un'eccezione su toPdfA, allora lascio il documento "compilabile" e non statico
					thePdfStatico = docByte;
					isPdfStatic = false;

				}
				finally 
				{
					doc.setDoc(thePdfStatico);
					doc.setNome(getNomeFileLibretto(idImpianto, isPdfStatic));
					doc.setIsPdfStatico(isPdfStatic);
					doc.setMimeType(Constants.MIME_TYPE_PDF);
					doc.setEncoding(Constants.UTF_8_ENCODING);
				}
				
				
				log.debug("DOPO DELLA CREAZIONE DEL PDF STATICO");
				
			}
			
		}
		catch (Exception e) {
			log.error("Errore nella generazione del modulo", e);
			throw new SigitextException(Messages.ERROR_GENERAZIONE_MODULO, e);
		}finally{
			log.debug("[SigitextManager::showModuloLibretto] END");
		}
		
		return doc;
	}
	*/
	/*
	private Modulo cercaModulo(Applicazione applicazione, String codiceModulo) throws SigitextException {
		log.debug("[SigitextManager::cercaModulo] BEGIN");
		log.debug("CODICE MODOL: ["  + codiceModulo+"]");
		CriterioRicercaModulo criterio;
		try {
			criterio = new CriterioRicercaModulo();
			criterio.setCodiceModulo(codiceModulo);
			Modulo[] moduli = getModol().ricercaModuli(applicazione, null , criterio);
			if(moduli!=null && moduli.length>0)
			{
				return moduli[0];
			}
			else
			{
				log.error("Non ho trovato il modulo su MODOL");
				throw new SigitextException(Messages.ERROR_RECUPERO_SERVIZIO);
			}
		}catch (Exception e) {
				log.error("Errore recupero modulo: ", e);
				throw new SigitextException(Messages.ERROR_RECUPERO_SERVIZIO, e);
		}finally{
			log.debug("[SigitextManager::cercaModulo] END");
		}
	}
	*/
	/*
	private ModolSrvFacade getModol()
	{
		log.debug("[SigitextManager::getModol] BEGIN");
		ModolSrvFacade modol = null;
		try {
			modol = getServiceModolXP().getModolXPServiceImp();
		}
		catch (Exception e) {
			log.error("[SigitextManager::getModol] errore nella parsificazione della configurazione di MODOLXP:"+ e, e);
			throw new IllegalArgumentException("errore nella parsificazione della configurazione di MODOLXP");
		}
		return modol;
	}
	*/
	/*
	private ModolPdfGeneratorSrvFacade getModolPdf()
	{
		log.debug("[SigitextManager::getModolPdf] BEGIN");
		ModolPdfGeneratorSrvFacade modol = null;
		try {
			modol = getServiceModolXPPdf().getModolXPPdfServiceImp();
		}
		catch (Exception e) {
			log.error("[SigitextManager::getModolPdf] errore nella parsificazione della configurazione di MODOLXP:"+ e, e);
			throw new IllegalArgumentException("errore nella parsificazione della configurazione di MODOLXP");
		}
		return modol;
	}
	*/
	
	/*
	private ModolSrvITF getModol() {
		log.debug("[SigitextManager::getModol] BEGIN");
		InputStream is = getClass().getResourceAsStream(MODOL_RESOURCE);
		if (is != null) {
			try {
				InfoPortaDelegata info = PDConfigReader.read(is);
				log.debug("[SigitextManager::getModol] END");
				return (ModolSrvITF) PDProxy.newInstance(info);
			} 
			catch (Exception e) {
				log.error("[SigitextManager::getModol] errore nella parsificazione della configurazione di MODOL:"+ e, e);
				throw new IllegalArgumentException("errore nella parsificazione della configurazione di MODOL");
			}
		} else{
			log.error("[SigitextManager::getModol] configurazione di MODOL non trovata");
		}
		throw new IllegalArgumentException("configurazione di MODOL non trovata");
	}
	*/
	/*
	public ModolPdfGeneratorSrvITF getModolPdf() {
		log.debug("[SigitextManager::getModolPdf] BEGIN");
		InputStream is = getClass().getResourceAsStream(MODOL_PDF_RESOURCE);
		if (is != null) {
			try {
				InfoPortaDelegata info = PDConfigReader.read(is);
				log.debug("[SigitextManager::getModolPdf] END");
				return (ModolPdfGeneratorSrvITF) PDProxy.newInstance(info);
			} 
			catch (Exception e) {
				log.error("[SigitextManager::getModolPdf] errore nella parsificazione della configurazione di MODOL:"+ e, e);
				throw new IllegalArgumentException("errore nella parsificazione della configurazione di MODOL");
			}
		} else{
			log.error("[SigitextManager::getModolPdf] configurazione di MODOL non trovata");
		}
		throw new IllegalArgumentException("configurazione di MODOL PDF non trovata");
	}
	*/
	
	private byte[] indexFileByUid(String uid, String fileName, OperationContext oc)  {
		String header = "!!!!indexFileByUid==>.";
		log.debug(header+"inizio!!");
		
		byte[] result = null;
		try{

			result = getServiceIndex().getEcmengineDelegate().retrieveContentData(new Node(uid), indexGetContent(fileName), oc);	
			
		}
		catch (Exception e) {

			log.error(header+"errore= ", e);
		}
		
		log.debug(header+"fine");
		return result;
	}
	
	private ResultContent indexMetadatiByUid(String uid, OperationContext oc)  {
		String header = "!!!!indexFileByUid==>.";
		log.debug(header+"inizio!!");
		
		ResultContent result = null;
		try{
			result = getServiceIndex().getEcmengineDelegate().getContentMetadata(new Node(uid), oc);
			
//			if (log.isDebugEnabled())
//			{
//				GenericUtil.stampa(result, true, 3); // commentato dopo il rilascio
//			}			
		}
		catch (Exception e) {

			log.error(header+"errore= ", e);
		}
		
		log.debug(header+"fine");
		return result;
	}
	
	protected OperationContext indexGetOperationContext(String user) {
		String header = "!!!!indexGetOperationContext==>.";
		log.debug(header+"inizio!!");

		OperationContext ctx = new OperationContext();
		ctx.setUsername(user);
		ctx.setPassword(Constants.INDEX_PSW);
		ctx.setNomeFisico(Constants.INDEX_UTENTE);
		ctx.setFruitore(Constants.INDEX_FRUITORE);
		ctx.setRepository(Constants.INDEX_REPOSITORY);
		log.debug(header+"fine");

		return ctx;
	}
	
	private Content indexGetContent(String fileName) throws SigitextException  {
		String header = "!!!!indexGetContent==>.";
		log.debug(header+"inizio!!");
		Content myFile = new Content();
		myFile.setContentPropertyPrefixedName(Constants.INDEX_PREFIX_NAME);
		myFile.setPrefixedName(Constants.INDEX_PREFIX+fileName);
		myFile.setParentAssocTypePrefixedName(Constants.INDEX_PREFIX_CONTAINS);
		myFile.setTypePrefixedName(Constants.INDEX_ALLEGATO_NAME);
		myFile.setMimeType(indexGetMimeType(fileName));
		myFile.setEncoding(Constants.INDEX_ENCODING);
		log.debug(header+"fine");
		return myFile;
	}
	
	private String indexGetMimeType(String fileName) throws SigitextException {
		log.debug("[SigitextManager::indexGetMimeType] BEGIN");
		String estensione = StringUtils.substringAfterLast(fileName, ".");
	    Mimetype mt = new Mimetype();
		log.debug("[SigitextManager::indexGetMimeType] Estensione " + estensione);
		mt.setFileExtension(estensione);
		Mimetype[] mime = null;
		try{
			mime = getServiceIndex().getEcmengineDelegate().getMimetype(mt);
		}
		catch (RemoteException e) {
			throw new SigitextException("", e);
		}
		log.debug("[SigitextManager::indexGetMimeType] Mime Type " + mime[0].getMimetype());
		log.debug("[SigitextManager::indexGetMimeType] END");
		return mime[0].getMimetype();
	}

	private Content indexGetContent(Metadati metadati, String fileName, byte[] file) throws SigitextException {
		log.debug("[SigitextManager::indexGetContent] BEGIN");
		Content c = indexGetContent(fileName);
		c.setModelPrefixedName(Constants.INDEX_SIGIT_PREFIX_MODEL);
		c.setProperties(indexSetMetadati(metadati));
		c.setContent(file);
		log.debug("[SigitextManager::indexGetContent] END");
		return c;
	}
	
	public String indexUploadFileNew(String fileName, byte[]file, Metadati metadati, String cartella, boolean isSovrascrivibile) throws SigitextException {
		log.debug("[SigitextManager::indexUploadFileNew] BEGIN");
		String uidFile = null;
		Node n = null;
		Content c = null;
		Node nodoFile = null;
		OperationContext oc = null;
		try{
			
			oc = indexGetOperationContext(Constants.INDEX_USERNAME_READ);
			log.debug("------- OPERATION CONTEXT --- "+oc);
			
			
			n = indexSearchFolder(getQueryLuceneSearchCartella(metadati, cartella), oc);

			// Ho cercato la cartella passata come parametro
			if (n == null)
			{
				// Recupero il nodo del cod impianto
				n = new Node(indexGetFolder(metadati, oc));
				
				log.debug("STAMPO IL NODO CODICE_IMPIANTO: "+n.getUid());
				
				c = indexGetContentFolder(null);

				// creo la cartella passata come parametro
				n = indexCreateFolder(cartella, c, n, oc);

			}

			// Cerco il file
			Node nodeFile = indexSearchFolder(getQueryLuceneSearchFile(fileName, metadati, cartella), oc);

			c = indexGetContent(metadati, fileName, file);

			if (nodeFile != null && isSovrascrivibile)
			{
				// Il file esiste gia', faccio l'update
				getServiceIndex().getEcmengineDelegate().updateContentData(nodeFile, c, oc); 
				log.debug("------- UPDARE NODO --- "+nodoFile);
			}
			else
			{
				// Il file non esiste (oppure non e' previsto l'update), faccio l'insert
				nodeFile = getServiceIndex().getEcmengineDelegate().createContent(n, c, oc);
				log.debug("------- NUOVO NODO --- "+nodoFile);

				if (nodeFile != null)
				{
					uidFile = nodeFile.getUid();
				}

			}

		}
		catch (Exception e) {
			
			log.error("Errore index: ",e);
			
			throw new SigitextException(Messages.ERROR_RECUPERO_SERVIZIO, e);
			
		}
		
		log.debug("[SigitextManager::indexUploadFileNew] END");
		return uidFile;
	}
	
	private SearchParams getQueryLuceneSearchCartella(Metadati metadati, String cartella)
	{
		SearchParams searchParams = new SearchParams();
		searchParams.setLimit(1);
		
		StringBuilder luceneQuery = new StringBuilder();

		luceneQuery.append("PATH:\"");
		luceneQuery.append(Constants.INDEX_ROOT_SIGIT);
		luceneQuery.append(Constants.INDEX_FOLDER_SUFFIX);
		luceneQuery.append(metadati.getCodIstatProvincia());
		luceneQuery.append(Constants.INDEX_FOLDER_SUFFIX);
		luceneQuery.append(metadati.getCodIstatComune());
		luceneQuery.append(Constants.INDEX_FOLDER_SUFFIX);
		luceneQuery.append(metadati.getCodiceImpianto());
		luceneQuery.append("/*");
		luceneQuery.append("\"");
		luceneQuery.append(" AND ");
		luceneQuery.append(Constants.INDEX_METADATO_SUFFIX);
		luceneQuery.append("name:\"");
		luceneQuery.append(cartella+"\"");
		
		log.debug("getQueryLuceneSearchCartella: "+luceneQuery.toString());
		
		searchParams.setLuceneQuery(luceneQuery.toString());
		
		return searchParams;
	}
	
	public Node indexSearchFolder(SearchParams params, OperationContext op) throws SigitextException {
		log.debug("[SigitextManager::indexSearchFolder] BEGIN");
		Node node = null;
		try{
			
			log.debug("Stampo la query lucene: "+params.getLuceneQuery());
			//GenericUtil.stampa(params, true, 3);
			
			NodeResponse nodeResponse = getServiceIndex().getEcmengineDelegate().luceneSearchNoMetadata(params, op);

			//GenericUtil.stampa(nodeResponse, true, 3);
			
			if (nodeResponse != null && nodeResponse.getNodeArray() != null && nodeResponse.getNodeArray().length > 0)
			{
				node = nodeResponse.getNodeArray()[0];
			}
			
			
		}
		catch(Exception e){
			throw new SigitextException(Messages.ERROR_RECUPERO_SERVIZIO, e);
		}
		log.debug("[SigitextManager::indexSearchFolder] END");
		return node;
	}
	
	private String indexGetFolder(Metadati metadati, OperationContext op) throws SigitextException {
		log.debug("[SigitextManager::indexGetFolder] BEGIN");
		try{
			
			Content content = indexGetContentFolder(null);
			
			
			Node nodeCodImp = indexSearchFolder(getQueryLuceneSearchCodImp(metadati), op);
			
			log.debug("Ho cercato il codice impianto: "+nodeCodImp);
			
			if (nodeCodImp == null)
			{
				log.debug("Non esiste il nodo codice impianto");
				
				Node nodeComune = indexSearchFolder(getQueryLuceneSearchComune(metadati), op);
				
				log.debug("Ho cercato il comune: "+nodeComune);
				
				if (nodeComune == null)
				{
					log.debug("Non esiste il nodo comune");
					
					Node nodeProvincia = indexSearchFolder(getQueryLuceneSearchProvincia(metadati), op); 
					
					log.debug("Ho cercato la provincia: "+nodeProvincia);
					
					if (nodeProvincia == null)
					{
						log.debug("Non esiste il nodo provincia");
						
						Node nodeApplicativo = indexSearchFolder(getQueryLuceneSearchApplicativo(), op); 

						log.debug("Ho cercato l'applicativo: "+nodeApplicativo);
						
						if (nodeApplicativo == null)
						{
							log.debug("Se non esiste neanche l'applicativo rilancio l'eccezione!!!");
							throw new SigitextException("Su INDEX non e' configurato l'applicativo");
						}
						
						
						log.debug("creo il nodo provincia");
						
						nodeProvincia = indexCreateFolder(metadati.getCodIstatProvincia(), content, nodeApplicativo, op);
						
						log.debug("ho creato il nodo provincia: "+nodeProvincia.getUid());
					}
					
					log.debug("creo il nodo comune");

					nodeComune = indexCreateFolder(metadati.getCodIstatComune(), content, nodeProvincia, op);

					log.debug("ho creato il nodo comune: "+nodeComune.getUid());

				}

				log.debug("creo il nodo codice impianto");

				nodeCodImp = indexCreateFolder(metadati.getCodiceImpianto(), content, nodeComune, op);
				
				log.debug("ho creato il nodo codice impianto: "+nodeCodImp.getUid());
				
			}
			
			return nodeCodImp.getUid();
		}
		catch (SigitextException e) {
			throw e;
		}
		catch (Exception e) {
			throw new SigitextException(Messages.ERROR_RECUPERO_SERVIZIO, e);
		}
		finally{
			log.debug("[SigitextManager::indexGetFolder] END");
		}
	}
	
	protected Node indexCreateFolder(String folderName, Content content, Node nodeParent, OperationContext op) throws SigitextException {
		log.debug("[SigitextManager::indexCreateFolder] BEGIN");
		Node folder = null;
		try{
			content.setPrefixedName(Constants.INDEX_DEFAULT_PREFIX+folderName);
			
			Property p = new Property();
			p.setPrefixedName(Constants.INDEX_PREFIX_NAME_SHORT);
			p.setDataType("text");
			p.setValues(new String [] {folderName });
			content.setProperties(new Property[]{p});
			
			
			folder = getServiceIndex().getEcmengineDelegate().createContent(nodeParent, content, op);
		}
		catch (Exception e) {
			throw new SigitextException(Messages.ERROR_RECUPERO_SERVIZIO, e);
		}
		log.debug("[SigitextManager::indexCreateFolder] END");
		return folder;
	}
	
	private Content indexGetContentFolder(String folderName) {
		log.debug("[SigitextManager::indexGetContentFolder] BEGIN");
		Content myFolder = new Content();
	    myFolder.setPrefixedName(Constants.INDEX_DEFAULT_PREFIX+folderName);
	    myFolder.setParentAssocTypePrefixedName(Constants.INDEX_PREFIX_CONTAINS);
	    myFolder.setModelPrefixedName(Constants.INDEX_PREFIX_MODEL);
	    myFolder.setTypePrefixedName(Constants.INDEX_PREFIX_FOLDER);
	    Property p = new Property();
		p.setPrefixedName(Constants.INDEX_PREFIX_NAME_SHORT);
		p.setDataType("text");
		p.setValues(new String [] {folderName });
		myFolder.setProperties(new Property[]{p});
		log.debug("[SigitextManager::indexGetContentFolder] END");
	    return myFolder;
	}
	
	private SearchParams getQueryLuceneSearchFile(String nomeFile, Metadati metadati, String cartella)
	{
		SearchParams searchParams = new SearchParams();
		searchParams.setLimit(1);

		StringBuilder luceneQuery = new StringBuilder();

		luceneQuery.append("PATH:\"");
		luceneQuery.append(Constants.INDEX_ROOT_SIGIT);
		luceneQuery.append(Constants.INDEX_FOLDER_SUFFIX);
		luceneQuery.append(metadati.getCodIstatProvincia());
		luceneQuery.append(Constants.INDEX_FOLDER_SUFFIX);
		luceneQuery.append(metadati.getCodIstatComune());
		luceneQuery.append(Constants.INDEX_FOLDER_SUFFIX);
		luceneQuery.append(metadati.getCodiceImpianto());
		luceneQuery.append(Constants.INDEX_FOLDER_SUFFIX);
		luceneQuery.append(cartella);
		luceneQuery.append("/*");
		luceneQuery.append("\"");
		luceneQuery.append(" AND ");
		luceneQuery.append(Constants.INDEX_METADATO_SUFFIX);
		luceneQuery.append("name:\"");
		luceneQuery.append(nomeFile+"\"");
		
		log.debug("getQueryLuceneSearchFile: "+luceneQuery.toString());
		
		searchParams.setLuceneQuery(luceneQuery.toString());
		
		return searchParams;
	}
	
	private Property[] indexSetMetadati(Metadati metadati) {
		log.debug("[SigitextManager::indexSetMetadati] BEGIN");
		Property[] result = new Property[6];
		result[0] = new Property();
		result[0].setDataType(Constants.INDEX_TYPE_TEXT);
		result[0].setPrefixedName(Metadati.META_BOLLINO_VERDE);
		result[0].setValues(new String[]{metadati.getBollinoVerde()});
		
		result[1] = new Property();
		result[1].setDataType(Constants.INDEX_TYPE_TEXT);
		result[1].setPrefixedName(Metadati.META_COD_ISTAT_COMUNE);
		result[1].setValues(new String[]{metadati.getCodIstatComune()});
		
		result[2] = new Property();
		result[2].setDataType(Constants.INDEX_TYPE_TEXT);
		result[2].setPrefixedName(Metadati.META_COD_ISTAT_PROVINCIA);
		result[2].setValues(new String[]{metadati.getCodIstatProvincia()});
		
		result[3] = new Property();
		result[3].setDataType(Constants.INDEX_TYPE_TEXT);
		result[3].setPrefixedName(Metadati.META_CODICE_REA);
		result[3].setValues(new String[]{metadati.getCodiceRea()});
		
		result[4] = new Property();
		result[4].setDataType(Constants.INDEX_TYPE_TEXT);
		result[4].setPrefixedName(Metadati.META_DATA_RAPPORTO);
		result[4].setValues(new String[]{metadati.getDataRapporto()});
		
		result[5] = new Property();
		result[5].setDataType(Constants.INDEX_TYPE_TEXT);
		result[5].setPrefixedName(Metadati.META_ID_RAPPORTO);
		result[5].setValues(new String[]{metadati.getIdRapporto()});
		log.debug("[SigitextManager::indexSetMetadati] END");
		return result;
	}
	
	private SearchParams getQueryLuceneSearchCodImp(Metadati metadati)
	{
		SearchParams searchParams = new SearchParams();
		searchParams.setLimit(1);
		
		StringBuilder luceneQuery = new StringBuilder();

		luceneQuery.append("PATH:\"");
		luceneQuery.append(Constants.INDEX_ROOT_SIGIT);
		luceneQuery.append(Constants.INDEX_FOLDER_SUFFIX);
		luceneQuery.append(metadati.getCodIstatProvincia());
		luceneQuery.append(Constants.INDEX_FOLDER_SUFFIX);
		luceneQuery.append(metadati.getCodIstatComune());
		luceneQuery.append("/*");
		luceneQuery.append("\"");
		luceneQuery.append(" AND ");
		luceneQuery.append(Constants.INDEX_METADATO_SUFFIX);
		luceneQuery.append("name:\"");
		luceneQuery.append(metadati.getCodiceImpianto()+"\"");
		
		log.debug("getQueryLuceneSearchCodImp: "+luceneQuery.toString());
		
		searchParams.setLuceneQuery(luceneQuery.toString());
		
		return searchParams;
	}
	
	private SearchParams getQueryLuceneSearchComune(Metadati metadati)
	{
		SearchParams searchParams = new SearchParams();
		searchParams.setLimit(1);

		StringBuilder luceneQuery = new StringBuilder();

		luceneQuery.append("PATH:\"");
		luceneQuery.append(Constants.INDEX_ROOT_SIGIT);
		luceneQuery.append(Constants.INDEX_FOLDER_SUFFIX);
		luceneQuery.append(metadati.getCodIstatProvincia());
		luceneQuery.append("/*");
		luceneQuery.append("\"");
		luceneQuery.append(" AND ");
		luceneQuery.append(Constants.INDEX_METADATO_SUFFIX);
		luceneQuery.append("name:\"");
		luceneQuery.append(metadati.getCodIstatComune()+"\"");
		
		log.debug("getQueryLuceneSearchComune: "+luceneQuery.toString());
		
		searchParams.setLuceneQuery(luceneQuery.toString());
		
		return searchParams;
	}
	
	private SearchParams getQueryLuceneSearchProvincia(Metadati metadati)
	{
		SearchParams searchParams = new SearchParams();
		searchParams.setLimit(1);
		
		StringBuilder luceneQuery = new StringBuilder();

		luceneQuery.append("PATH:\"");
		luceneQuery.append(Constants.INDEX_ROOT_SIGIT);
		luceneQuery.append("/*");
		luceneQuery.append("\"");
		luceneQuery.append(" AND ");
		luceneQuery.append(Constants.INDEX_METADATO_SUFFIX);
		luceneQuery.append("name:\"");
		luceneQuery.append(metadati.getCodIstatProvincia()+"\"");
		
		log.debug("getQueryLuceneSearchProvincia: "+luceneQuery.toString());
		
		searchParams.setLuceneQuery(luceneQuery.toString());
		
		return searchParams;
	}
	
	private SearchParams getQueryLuceneSearchApplicativo()
	{
		SearchParams searchParams = new SearchParams();
		searchParams.setLimit(1);
		
		StringBuilder luceneQuery = new StringBuilder();

		luceneQuery.append("PATH:\"");
		luceneQuery.append(Constants.INDEX_ROOT);
		luceneQuery.append("/*");
		luceneQuery.append("\"");
		luceneQuery.append(" AND ");
		luceneQuery.append(Constants.INDEX_METADATO_SUFFIX);
		luceneQuery.append("name:\"");
		luceneQuery.append(Constants.INDEX_FRUITORE + "\"");
		
		log.debug("getQueryLuceneSearchApplicativo: "+luceneQuery.toString());
		
		searchParams.setLuceneQuery(luceneQuery.toString());
		
		return searchParams;
	}

	private String getNomeFileLibretto(Integer codiceImpianto)
	{
		StringBuilder nome = new StringBuilder();
		nome.append(Constants.FILE_PREFIX_LIBRETTO);
		nome.append("_");
		nome.append(codiceImpianto);
		nome.append("_");
		nome.append(ConvertUtil.convertToString(new Date(), ConvertUtil.FORMAT_DATE_UNDERSCORE));
		
//		if (!isStatico)
//		{
//			nome.append("_nopdfa");
//		}
		
		nome.append(".pdf");
		return nome.toString();
	}

	private String getNomeFileLibretto(Integer codiceImpianto, Date dataIntervento, BigDecimal idLibretto)
	{
		StringBuilder nome = new StringBuilder();
		nome.append(Constants.FILE_PREFIX_LIBRETTO);
		nome.append("_");
		nome.append(codiceImpianto);
		nome.append("_");
		nome.append(ConvertUtil.convertToString(dataIntervento, ConvertUtil.FORMAT_DATE_UNDERSCORE));
		nome.append("_");
		nome.append(ConvertUtil.convertToString(idLibretto));
//		if (!isStatico)
//		{
//			nome.append("_nopdfa");
//		}
		nome.append(".pdf");
		return nome.toString();
	}
	
	private String getNomeFileXMLLibretto(Integer codiceImpianto)
	{
		StringBuilder nome = new StringBuilder();
		nome.append(Constants.FILE_PREFIX_TRACCIATO);
		nome.append("_");
		nome.append(Constants.FILE_PREFIX_LIBRETTO);
		nome.append("_");
		nome.append(codiceImpianto);
		nome.append("_");
		nome.append(ConvertUtil.convertToString(new Date(), ConvertUtil.FORMAT_DATE_UNDERSCORE));
		nome.append(".xml");
		return nome.toString();
	}

	public SigitTPreImportDto inserisciPreImport(String cfUtente) throws SigitextException
	{
		log.debug("inserisciPreImport START");
		SigitTPreImportDto dto = new SigitTPreImportDto();
		try {
			dto.setDataUltMod(DateUtil.getSqlDataCorrente());
			dto.setIdPersonaFisica(ConvertUtil.convertToBigDecimal(-1));
			dto.setUtenteUltMod(cfUtente);
			getDbServiceImp().inserisciPreImport(dto);
			return dto;
		} catch (SigitextException e) {
			log.error("Errore",e);
			throw new SigitextException(Messages.ERROR_INSERT_DB, e);
		}
		finally{
			log.debug("inserisciPreImport END");
		}
	}
	
	@Transactional
	public void consolidaLibrettoTrans(String cfUtente, SigitTLibrettoDto librettoDto, String codiceRea, int motivoConsolidamento) throws SigitextException
	{
		boolean isRespAssente = false;
		try
		{
			BigDecimal codiceImpianto = librettoDto.getCodiceImpianto();
			
			SigitTImpiantoDto impianto = getDbServiceImp().getImpiantoByCod(codiceImpianto);
			
			librettoDto.setDataConsolidamento(DateUtil.getSqlCurrentDate());
			librettoDto.setCfRedattore(cfUtente);
			librettoDto.setUtenteUltMod(cfUtente);
			librettoDto.setDataUltMod(DateUtil.getSqlDataCorrente());

			getDbServiceImp().inserisciLibretto(librettoDto);
			
			BigDecimal idLibretto = librettoDto.getIdLibretto();
	
			// Controllo il responsabile
			SigitVTotImpiantoDto respAttivo = getDbServiceImp().cercaResponsabileAttivoByCodImpianto(ConvertUtil.convertToInteger(codiceImpianto));
			if(respAttivo==null)
			{
				isRespAssente = true;
				throw new SigitextException(Messages.ERROR_RESPONSABILE_ASSENTE);

			}
			
			Libretto libretto = getLibretto(ConvertUtil.convertToInteger(codiceImpianto), true);
			byte[] thePdf = libretto.getLibrettoPdf().getDoc();
			
			if (log.isDebugEnabled())
			{
				log.debug("##################");
				log.debug("##################");
				log.debug("Cod impianto: "+ codiceImpianto);
				log.debug("##################");
				log.debug("##################");
			}
			
			String nome = getNomeFileLibretto(ConvertUtil.convertToInteger(codiceImpianto), impianto.getDataIntervento(), idLibretto);
	
			log.debug("nome file libretto: " + nome);
			Metadati metadati = MapDto.mapMetadati(impianto, librettoDto, codiceRea);
			String uidIndex = indexUploadFileNew(nome.toString(), thePdf, metadati, Constants.INDEX_FOLDER_LIBRETTI, true);
			log.debug("UID index: " + uidIndex);
			//storicizzare altri libretti consolidati
			librettoDto.setUtenteUltMod(cfUtente);
			
			getDbServiceImp().storicizzaLibretti(librettoDto);
			log.debug("libretti storicizzati");
			//consolidare libretto in bozza
			librettoDto.setFkMotivoConsolid(new BigDecimal(motivoConsolidamento));
			librettoDto.setFileIndex(nome);
			librettoDto.setUidIndex(uidIndex);
			getDbServiceImp().consolidaLibretto(librettoDto);
			log.debug("Aggiornamento xml su DB");
			
			if (log.isDebugEnabled())
			{
				log.debug("librettoDto.getIdLibretto(): "+librettoDto.getIdLibretto());
				log.debug("libretto: "+libretto);
				log.debug("libretto.getLibrettoXml(): "+libretto.getLibrettoXml());
			}
			
			getDbServiceImp().updateTxtLibretto(librettoDto.getIdLibretto(), XmlBeanUtils.readByteArray(libretto.getLibrettoXml()));
			log.debug("libretto consolidato");
		}
		catch (Exception e) {
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			
			log.error("Errore in consolidamento:", e);
			
			if (isRespAssente)
			{
				throw new SigitextException(Messages.ERROR_IMPOSSIBILE_CONSOLIDARE, e);
			}
			else
			{
				throw new SigitextException(Messages.ERROR_IMPOSSIBILE_CONSOLIDARE + ": contattare l'amministrattore del sistema", e);
			}
		}
	}
	
	public boolean isAbilitatoSuImpianto(Integer codImpianto, UtenteJWT utenteJWT) throws SigitextException {
		
		if (utenteJWT.getSubject().equals(Constants.SUBJECT_JWT_FRUITORE)) {
			return true;
		}
		
		Integer idPersonaGiuridica = ConvertUtil.convertToInteger(utenteJWT.getIdPersonaGiuridica());
		
		if (idPersonaGiuridica == null || idPersonaGiuridica == 0) {
			return true;
		}
		
		List<SigitRComp4ManutDto> manutentori = getDbServiceImp().cercaManutentoriByPersonaGiuridicaCodiceImpiantoRuoloFunz(idPersonaGiuridica, codImpianto, Constants.RUOLO_IMPRESA);
		
		List<SigitRImpRuoloPfpgDto> assImpresaImpianto = getDbServiceImp().cercaAssociazioneImpresaImpiantoByPersonaGiuridicaCodiceImpiantoRuoloFunz(idPersonaGiuridica, codImpianto, Constants.RUOLO_CARICATORE);

		if ((manutentori == null || manutentori.size() == 0) && (assImpresaImpianto == null || assImpresaImpianto.size() == 0)) {
			return false;
		}
			
		return true;	
		
	}
	
	public Impianto[] ricercaImpiantoByFiltro(ImpiantoFiltro impiantoFiltro) throws SigitextException {
		
		String header = "!!!!ricercaImpiantoByFiltro==>.";
		log.debug(header+"inizio!!");
		
		List<Impianto> impiantiListToMap = new LinkedList<Impianto>();
		
		try {
			List<SigitExtImpiantoDto> impiantiList = getDbServiceImp().ricercaImpiantoByFiltro(impiantoFiltro);
			
			if(impiantiList == null)
			{
				log.debug(header+"lista =  null!!");
					
			}
			else {
				log.debug(header+"lista not  null!!");
				for (SigitExtImpiantoDto dto : impiantiList) {
					Impianto impianto = MapDto.mapSigitExtImpiantoDtoToImpianto(dto);					
					impiantiListToMap.add(impianto);
				}
			}
			
			log.debug(header+"fine");
			
		} catch (Exception e) {
			log.error(header+"errore= ", e);
			throw e;
		}
		return impiantiListToMap.toArray(new Impianto[0]);
	}
	
	
	public boolean isAbilitatoSuLibretto(String uid, UtenteJWT utenteJWT) throws SigitextException {
		
		List<SigitTLibrettoDto> libretti = getDbServiceImp().cercaLibrettoByUid(uid);
		
		if (libretti == null || libretti.size() == 0) {
			throw new SigitextException(Messages.ERROR_LIBRETTO_NON_TROVATO);
		}

		BigDecimal codiceImpianto = libretti.get(0).getCodiceImpianto();
		
		return isAbilitatoSuImpianto(ConvertUtil.convertToInteger(codiceImpianto), utenteJWT);
				
	}
	
	public void salvaAccesso(UtenteJWT utenteJWT, Integer idWebService) throws SigitextException {
		
		String subjectJWT = utenteJWT.getSubject();
		
		String codiceFruitore = utenteJWT.getCodiceFruitore();
		
		SigitTElencoWsDto webService = getDbServiceImp().cercaWsByidWs(idWebService);
		
		SigitLAccessoDto accessoDto = new SigitLAccessoDto();
		
		accessoDto.setDtAccesso(ConvertUtil.getSqlDataCorrente());
		
		//TODO salvare nella colonna "servizio" quando sara' disponibile
		accessoDto.setRuolo(webService.getDescrizioneWs());
		
		if (!subjectJWT.equals(Constants.SUBJECT_JWT_FRUITORE)) {
			String idPersonaGiuridica = utenteJWT.getIdPersonaGiuridica();
			
			SigitTPersonaGiuridicaDto personaGiuridicaDto = getDbServiceImp().cercaPersonaGiuridicaById(ConvertUtil.convertToBigDecimal(idPersonaGiuridica));
			log.debug("[TEST UPPER CASE START] denominazione persona giuridica: " + personaGiuridicaDto.getDenominazione());
			accessoDto.setCodiceFiscale(personaGiuridicaDto.getCodiceFiscale());
			accessoDto.setCognome(personaGiuridicaDto.getDenominazione().toUpperCase());
			log.debug("[TEST UPPER CASE END] cognome dto di accesso: " + accessoDto.getCognome());
		} else if (!codiceFruitore.equals(Constants.CODICE_FRUITORE_SIGIT)){
			accessoDto.setCodiceFiscale(utenteJWT.getCodiceFruitore());
		}
		else {
			return;
		}
		
		getDbServiceImp().inserisciAccesso(accessoDto);
	}
}
