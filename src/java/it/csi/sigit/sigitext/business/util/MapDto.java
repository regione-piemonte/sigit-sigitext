/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.parsers.ParserConfigurationException;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.ImportFilter;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.CombustibileCITDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.FluidoCITDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.MarcaCITDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitExtContrattoImpDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitExtImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitSLibrettoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTAllegatoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompBrRcDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompVxDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompXDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompXSempliceDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTConsumo14_4Dto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTConsumoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTDettTipo1Dto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTDettTipo2Dto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTDettTipo3Dto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTDettTipo4Dto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTImportDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTLibrettoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTTrattH2ODto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTUnitaImmobiliareDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompAcDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompAgDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompCgDettDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompCiDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompCsDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompGfDettDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompGtDettDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompPoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompRcDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompRvDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompScDettDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompSrDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompTeDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompUtDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompVmDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVCompVrDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVRicercaAllegatiDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVRicercaIspezioniConsByCodiceImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVRicercaIspezioniDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVSk4CgDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVSk4GfDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVSk4GtDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVSk4ScDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVTotImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.UnitaMisuraCITDto;
import it.csi.sigit.sigitext.dto.sigitext.DettaglioAllegato;
import it.csi.sigit.sigitext.dto.sigitext.Impianto;
import it.csi.sigit.sigitext.dto.sigitext.Metadati;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.LibrettoDocument;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiAltriComponentiCIDocument.DatiAltriComponentiCI.SezCI;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiAltriComponentiRVDocument.DatiAltriComponentiRV.SezRV;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiAltriComponentiTEDocument.DatiAltriComponentiTE.SezTE;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiAltriComponentiUTDocument.DatiAltriComponentiUT.SezUT;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiConsumoCombuDocument.DatiConsumoCombu.SezCombu;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiConsumoEEDocument.DatiConsumoEE.SezConsumo;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiConsumoH2ODocument.DatiConsumoH2O;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiInterventiControlloDocument.DatiInterventiControllo.SezInterventi;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.SezNomine;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiRisultatiCGDocument.DatiRisultatiCG.SezCogen;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiRisultatiGFDocument.DatiRisultatiGF.SezMacchineFrigo;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiRisultatiIspezDocument.DatiRisultatiIspez.SezRisultati;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiRisultatiSCDocument.DatiRisultatiSC.SezScambiatori;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaAGDocument.DatiSchedaAG;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaAGDocument.DatiSchedaAG.SezAG;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaBRDocument.DatiSchedaBR;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaBRDocument.DatiSchedaBR.SezBR;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaCGDocument.DatiSchedaCG;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaCGDocument.DatiSchedaCG.SezCG;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaCSDocument.DatiSchedaCS;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaCSDocument.DatiSchedaCS.SezCS;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaGFDocument.DatiSchedaGF;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaGFDocument.DatiSchedaGF.SezGF;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaGTDocument.DatiSchedaGT;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaGTDocument.DatiSchedaGT.SezGruppiTermici;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaIdentificativaImpDocument.DatiSchedaIdentificativaImp;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaRCDocument.DatiSchedaRC;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaRCDocument.DatiSchedaRC.SezRC;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaSCDocument.DatiSchedaSC;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaSCDocument.DatiSchedaSC.SezSC;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaSistemaACDocument.DatiSchedaSistemaAC.SezAC;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaSistemaEmissioneDocument.DatiSchedaSistemaEmissione;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaSistemiDistribDocument.DatiSchedaSistemiDistrib;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaSistemiDistribDocument.DatiSchedaSistemiDistrib.SezPO;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaSistemiDistribDocument.DatiSchedaSistemiDistrib.SezVasi;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiSchedaTrattH2ODocument.DatiSchedaTrattH2O;
import it.csi.sigit.sigitwebn.xml.libretto.data.DatiVentilazMeccanicaVMDocument.DatiVentilazMeccanicaVM.SezVM;
import it.csi.sigit.sigitwebn.xml.libretto.data.IntervControlloDocument.IntervControllo;
import it.csi.sigit.sigitwebn.xml.libretto.data.L111RowGTDocument.L111RowGT;
import it.csi.sigit.sigitwebn.xml.libretto.data.L112RowGFDocument.L112RowGF;
import it.csi.sigit.sigitwebn.xml.libretto.data.L113RowSCDocument.L113RowSC;
import it.csi.sigit.sigitwebn.xml.libretto.data.L114RowCGDocument.L114RowCG;
import it.csi.sigit.sigitwebn.xml.libretto.data.RegolazionePrimariaDocument.RegolazionePrimaria;
import it.csi.sigit.sigitwebn.xml.libretto.data.RegolazionePrimariaDocument.RegolazionePrimaria.SezSR;
import it.csi.sigit.sigitwebn.xml.libretto.data.RegolazionePrimariaDocument.RegolazionePrimaria.SezVR;
import it.csi.sigit.sigitwebn.xml.libretto.data.RegolazioneSingoloAmbDocument.RegolazioneSingoloAmb;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowACDocument.RowAC;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowACsostDocument.RowACsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowAGDocument.RowAG;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowAGsostDocument.RowAGsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowBRDocument.RowBR;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowBRsostDocument.RowBRsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowCGDocument.RowCG;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowCGsostDocument.RowCGsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowCIDocument.RowCI;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowCIsostDocument.RowCIsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowCSDocument.RowCS;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowCSvarDocument.RowCSvar;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowCatastoDocument.RowCatasto;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowCircuitiGFDocument.RowCircuitiGF;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowCombuDocument.RowCombu;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowConsumoDocument.RowConsumo;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowConsumoEEDocument.RowConsumoEE;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowConsumoH2ODocument.RowConsumoH2O;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowConsumoPRODDocument.RowConsumoPROD;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowDateCGDocument.RowDateCG;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowDateGFDocument.RowDateGF;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowDateGTDocument.RowDateGT;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowDateSCDocument.RowDateSC;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowGFDocument.RowGF;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowGFsostDocument.RowGFsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowGTDocument.RowGT;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowGTsostDocument.RowGTsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowInterventoDocument.RowIntervento;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowNomineDocument.RowNomine;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowNumModuliGTDocument.RowNumModuliGT;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowPODocument.RowPO;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowPOsostDocument.RowPOsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowRCDocument.RowRC;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowRCcalDocument.RowRCcal;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowRCcalsostDocument.RowRCcalsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowRCsostDocument.RowRCsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowRVDocument.RowRV;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowRVsostDocument.RowRVsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowRisultatiIspezDocument.RowRisultatiIspez;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowSCDocument.RowSC;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowSCcalDocument.RowSCcal;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowSCcalsostDocument.RowSCcalsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowSCsostDocument.RowSCsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowSRDocument.RowSR;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowSRsostDocument.RowSRsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowTEDocument.RowTE;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowTEsostDocument.RowTEsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowUTDocument.RowUT;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowUTsostDocument.RowUTsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowVMDocument.RowVM;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowVMsostDocument.RowVMsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowVRDocument.RowVR;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowVRsostDocument.RowVRsost;
import it.csi.sigit.sigitwebn.xml.libretto.data.RowVasiDocument.RowVasi;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.xml.sax.SAXException;

public class MapDto {

	protected static final Logger log = Logger
	.getLogger(Constants.APPLICATION_CODE + ".SigitextManager==>");

	public static XmlBoolean getXmlBoolean(boolean b)
	{
		XmlBoolean newInstance = XmlBoolean.Factory.newInstance();
		newInstance.setStringValue( b ? "1" : "0");
		return newInstance;
	}
	
	public static void mapToSchedaIdentificativaImpianto(DatiSchedaIdentificativaImp datiImpianto, 
			SigitTImpiantoDto impianto, SigitTUnitaImmobiliareDto unitaPrincipale)
	{
		datiImpianto.setL11DataIntervento(ConvertUtil.convertToXmlCalendar(impianto.getDataIntervento()));
		if(impianto.getFkTipoIntervento()!=null)
		{
			if(Constants.ID_TIPO_INT_NUOVA_INSTALZ == impianto.getFkTipoIntervento().intValue())
				datiImpianto.xsetL11FlagNuovaInst(getXmlBoolean(true));
			if(Constants.ID_TIPO_INT_RISTRUTTURAZ == impianto.getFkTipoIntervento().intValue())
				datiImpianto.xsetL11FlagRistrutt(getXmlBoolean(true));
			if(Constants.ID_TIPO_INT_SOSTITUZIONE == impianto.getFkTipoIntervento().intValue())
				datiImpianto.xsetL11FlagSostGenerat(getXmlBoolean(true));
			if(Constants.ID_TIPO_INT_COMPILAZIONE == impianto.getFkTipoIntervento().intValue())
				datiImpianto.xsetL11FlagCompilaLibretto(getXmlBoolean(true));
		}
		
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E1.equals(unitaPrincipale.getL12FkCategoria()))
			datiImpianto.xsetL12FlagE1(getXmlBoolean(true));
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E2.equals(unitaPrincipale.getL12FkCategoria()))
			datiImpianto.xsetL12FlagE2(getXmlBoolean(true));
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E3.equals(unitaPrincipale.getL12FkCategoria()))
			datiImpianto.xsetL12FlagE3(getXmlBoolean(true));
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E4.equals(unitaPrincipale.getL12FkCategoria()))
			datiImpianto.xsetL12FlagE4(getXmlBoolean(true));
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E5.equals(unitaPrincipale.getL12FkCategoria()))
			datiImpianto.xsetL12FlagE5(getXmlBoolean(true));
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E6.equals(unitaPrincipale.getL12FkCategoria()))
			datiImpianto.xsetL12FlagE6(getXmlBoolean(true));
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E7.equals(unitaPrincipale.getL12FkCategoria()))
			datiImpianto.xsetL12FlagE7(getXmlBoolean(true));
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E8.equals(unitaPrincipale.getL12FkCategoria()))
			datiImpianto.xsetL12FlagE8(getXmlBoolean(true));
		datiImpianto.xsetL12FlagUnitaImmSingle(getXmlBoolean(ConvertUtil.convertToBooleanAllways(unitaPrincipale.getL12FlgSingolaUnita())));
		datiImpianto.setL12VolLordoRaffr(unitaPrincipale.getL12VolRaffM3());
		datiImpianto.setL12VolLordoRisc(unitaPrincipale.getL12VolRiscM3());
		
		datiImpianto.setL13DescrAltro(impianto.getL13Altro());
		datiImpianto.xsetL13FlagAltro(getXmlBoolean(GenericUtil.isNotNullOrEmpty(impianto.getL13Altro())));
		datiImpianto.xsetL13FlagClimaEst(getXmlBoolean(GenericUtil.isNotNullOrEmpty(impianto.getL13PotClimaEstKw())));
		datiImpianto.setL13PotUtileClimaEst(impianto.getL13PotClimaEstKw());
		datiImpianto.xsetL13FlagClimaInv(getXmlBoolean(GenericUtil.isNotNullOrEmpty(impianto.getL13PotClimaInvKw())));
		datiImpianto.setL13PotUtileClimaInv(impianto.getL13PotClimaInvKw());
		datiImpianto.xsetL13FlagProdACS(getXmlBoolean(GenericUtil.isNotNullOrEmpty(impianto.getL13PotH2oKw())));
		datiImpianto.setL13PotUtileACS(impianto.getL13PotH2oKw());
		
		datiImpianto.setL14DescrAltro(impianto.getL14Altro());
		datiImpianto.xsetL14FlagAltro(getXmlBoolean(GenericUtil.isNotNullOrEmpty(impianto.getL14Altro())));
		datiImpianto.xsetL14FlagAria(getXmlBoolean(ConvertUtil.convertToBooleanAllways(impianto.getL14FlgAria())));
		datiImpianto.xsetL14FlagH2O(getXmlBoolean(ConvertUtil.convertToBooleanAllways(impianto.getL14FlgH2o())));

		datiImpianto.setL15DescrAltrIntegraz(impianto.getL15AltroIntegrazione());
		datiImpianto.setL15DescrAltro(impianto.getL15Altro());
		datiImpianto.setL15DescrAltroPer(impianto.getL15AltroDesc());
		datiImpianto.xsetL15FlagAltraIntegraz(getXmlBoolean(GenericUtil.isNotNullOrEmpty(impianto.getL15AltroIntegrPotKw())));
		datiImpianto.xsetL15FlagAltro(getXmlBoolean(GenericUtil.isNotNullOrEmpty(impianto.getL15Altro())));
		datiImpianto.xsetL15FlagAltroPer(getXmlBoolean(GenericUtil.isNotNullOrEmpty(impianto.getL15AltroDesc())));
		datiImpianto.xsetL15FlagClimaEst(getXmlBoolean(ConvertUtil.convertToBooleanAllways(impianto.getL15FlgAltroClimaEstate())));
		datiImpianto.xsetL15FlagClimaInv(getXmlBoolean(ConvertUtil.convertToBooleanAllways(impianto.getL15FlgAltroClimaInv())));
		datiImpianto.xsetL15FlagCogener(getXmlBoolean(ConvertUtil.convertToBooleanAllways(impianto.getL15FlgCogeneratore())));
		datiImpianto.xsetL15FlagGeneratCombu(getXmlBoolean(ConvertUtil.convertToBooleanAllways(impianto.getL15FlgGeneratore())));
		datiImpianto.xsetL15FlagMaccFrigo(getXmlBoolean(ConvertUtil.convertToBooleanAllways(impianto.getL15FlgFrigo())));
		datiImpianto.xsetL15FlagPannelliSol(getXmlBoolean(GenericUtil.isNotNullOrEmpty(impianto.getL15SupPannelliSolM2())));
		datiImpianto.xsetL15FlagPompaCal(getXmlBoolean(ConvertUtil.convertToBooleanAllways(impianto.getL15FlgPompa())));
		datiImpianto.xsetL15FlagProdACS(getXmlBoolean(ConvertUtil.convertToBooleanAllways(impianto.getL15FlgAltroAcs())));
		datiImpianto.xsetL15FlagTeleraffr(getXmlBoolean(ConvertUtil.convertToBooleanAllways(impianto.getL15FlgTeleraffr())));
		datiImpianto.xsetL15FlagTelerisc(getXmlBoolean(ConvertUtil.convertToBooleanAllways(impianto.getL15FlgTelerisc())));
		
		datiImpianto.setL15PotUtile(impianto.getL15AltroIntegrPotKw());
		datiImpianto.setL15SuperfLordaTot(impianto.getL15SupPannelliSolM2());
	}
	
	public static void mapToDatiPrecompilati(DatiPrecompilati datiPrecompilati, SigitTUnitaImmobiliareDto unitaImmobPrincipale, SigitTImpiantoDto impianto, List<SigitTUnitaImmobiliareDto> unitaImmobSecondarie)
	{
		if (GenericUtil.isNotNullOrEmpty(unitaImmobPrincipale.getIndirizzoSitad()))
		{
			datiPrecompilati.setL12Indirizzo(unitaImmobPrincipale.getIndirizzoSitad());
		}
		else
		{
			datiPrecompilati.setL12Indirizzo(unitaImmobPrincipale.getIndirizzoNonTrovato());
		}
		
		datiPrecompilati.setL12Civico(unitaImmobPrincipale.getCivico());
		datiPrecompilati.setL12Scala(unitaImmobPrincipale.getScala());
		datiPrecompilati.setL12Interno(unitaImmobPrincipale.getInterno());
		datiPrecompilati.setL12Comune(impianto.getDenominazioneComune());
		datiPrecompilati.setL12Prov(impianto.getSiglaProvincia());
		datiPrecompilati.setL12Palazzo(unitaImmobPrincipale.getPalazzo());

		datiPrecompilati.setCodiceCatasto(ConvertUtil.convertToString(impianto.getCodiceImpianto()));
		datiPrecompilati.setSezCatasto(it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.SezCatasto.Factory.newInstance());
		
		//dati sezione
		RowCatasto catastoPrincipale = RowCatasto.Factory.newInstance();
		catastoPrincipale.setL12Foglio(unitaImmobPrincipale.getFoglio());
		catastoPrincipale.setL12Particella(unitaImmobPrincipale.getParticella());
		catastoPrincipale.setL12Pdr(unitaImmobPrincipale.getPdrGas());
		catastoPrincipale.setL12Pod(unitaImmobPrincipale.getPodElettrico());
		catastoPrincipale.setL12Sezione(unitaImmobPrincipale.getSezione());
		catastoPrincipale.setL12Sub(unitaImmobPrincipale.getSubalterno());
		List<RowCatasto> rowCatastoList = datiPrecompilati.getSezCatasto().getRowCatastoList();
		rowCatastoList.add(catastoPrincipale);
		for (SigitTUnitaImmobiliareDto umSec : unitaImmobSecondarie) {
			RowCatasto catastoSec = RowCatasto.Factory.newInstance();
			catastoSec.setL12Foglio(umSec.getFoglio());
			catastoSec.setL12Particella(umSec.getParticella());
			catastoSec.setL12Pdr(umSec.getPdrGas());
			catastoSec.setL12Pod(umSec.getPodElettrico());
			catastoSec.setL12Sezione(umSec.getSezione());
			catastoSec.setL12Sub(umSec.getSubalterno());
			rowCatastoList.add(catastoSec);
		}
		
		datiPrecompilati.setDataAggiornamento(ConvertUtil.convertToStringCompleta(new Date()));
	}
	
	public static void mapToSchedaTrattH2O(SigitTTrattH2ODto dto, DatiSchedaTrattH2O datiH2O)
	{
		datiH2O.setL21ContenutoH2OimpClima(dto.getL21H2oClimaM3());
		datiH2O.setL22DurezzaTotaleH2O(dto.getL22DurezzaH2oFr());
		datiH2O.setL23DurezzaTotaleH2O(dto.getL23DurezzaTotH2oFr());
		datiH2O.xsetL23FlagAddolcimento(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL23FlgTrattClimaAddolc())));
		datiH2O.xsetL23FlagAssenteH2Oclima(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL23FlgTrattClimaAssente())));
		datiH2O.xsetL23FlagAssenteProtGelo(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL23FlgTrattGeloAssente())));
		datiH2O.xsetL23FlagCondizChimico(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL23FlgTrattClimaChimico())));
		datiH2O.xsetL23FlagFiltrazione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL23FlgTrattClimaFiltr())));
		datiH2O.xsetL23FlagGlicoleEtilenic(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL23FlgTrattGeloGliEtil())));
		datiH2O.xsetL23FlagGlicolePropLenic(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL23FlgTrattGeloGliProp())));
		datiH2O.setL23PercConcentrazEtilenic(dto.getL23PercGliEtil());
		datiH2O.setL23PercConcentrazPropLenic(dto.getL23PercGliProp());
		datiH2O.setL23PHconcentrazEtilenic(dto.getL23PhGliEtil());
		datiH2O.setL23PHconcentrazPropLenic(dto.getL23PhGliProp());
		
		datiH2O.setL24DurezzaTotaleAddolcit(dto.getL24DurezzaAddolcFr());
		datiH2O.xsetL24FlagAddolcimento(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL24FlgTrattAcsAddolc())));
		datiH2O.xsetL24FlagAssente(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL24FlgTrattAcsAssente())));
		datiH2O.xsetL24FlagCondizChimico(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL24FlgTrattAcsChimico())));
		datiH2O.xsetL24FlagFiltrazione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL24FlgTrattAcsFiltr())));
		
		datiH2O.setL25CondChimAltro(dto.getL25TrattCAltro());
		datiH2O.xsetL25FlagAcquaSuperficiale(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattRaffH2oSup())));
		datiH2O.xsetL25FlagAcquedotto(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattRaffAcq())));
		datiH2O.xsetL25FlagAssente(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattRaffAssente())));
		datiH2O.xsetL25FlagCondChimAltro(getXmlBoolean(GenericUtil.isNotNullOrEmpty(dto.getL25TrattCAltro())));
		datiH2O.xsetL25FlagCondChimAnticorr(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattCPaanticorr())));
		datiH2O.xsetL25FlagCondChimAnticrosta(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattCPaantincro())));
		datiH2O.xsetL25FlagCondChimAnticrostaAntiCorr(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattCAaa())));
		datiH2O.xsetL25FlagCondChimBiocida(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattCBiocida())));
		datiH2O.xsetL25FlagCondChimNoTrattam(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattCNoTratt())));
		datiH2O.xsetL25FlagCondizChimico(getXmlBoolean(datiH2O.getL25FlagCondChimAltro() || datiH2O.getL25FlagCondChimAnticorr() || datiH2O.getL25FlagCondChimAnticrosta()
				|| datiH2O.getL25FlagCondChimAnticrostaAntiCorr() || datiH2O.getL25FlagCondChimBiocida() || datiH2O.getL25FlagCondChimNoTrattam()));
		datiH2O.setL25FiltrazioneAltro(dto.getL25TrattFAltro());
		datiH2O.xsetL25FlagFiltrazAltro(getXmlBoolean(GenericUtil.isNotNullOrEmpty(dto.getL25TrattFAltro())));
		datiH2O.xsetL25FlagFiltrazMasse(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattFFiltMas())));
		datiH2O.xsetL25FlagFiltrazNoTrattam(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattFNoTratt())));
		datiH2O.xsetL25FlagFiltrazSicurezza(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattFFiltSic())));
		datiH2O.xsetL25FlagFiltrazione(getXmlBoolean(datiH2O.getL25FlagFiltrazAltro() || datiH2O.getL25FlagFiltrazMasse() ||
				datiH2O.getL25FlagFiltrazNoTrattam() || datiH2O.getL25FlagFiltrazSicurezza()));
		datiH2O.xsetL25FlagPozzo(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattRaffPzz())));
		datiH2O.xsetL25FlagPrefSpurgoAutom(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgSpurgoAutom())));
		datiH2O.xsetL25FlagRecupTermParz(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattRaffRtp())));
		datiH2O.xsetL25FlagRecupTermTot(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattRaffRtt())));
		datiH2O.xsetL25FlagSenzaRecupTerm(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattRaffNoRt())));
		datiH2O.xsetL25FlagTrattAddolcim(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattTAddolc())));
		datiH2O.setL25TrattamentoAltro(dto.getL25TrattTAltro());
		datiH2O.xsetL25FlagTrattAltro(getXmlBoolean(GenericUtil.isNotNullOrEmpty(dto.getL25TrattTAltro())));
		datiH2O.xsetL25FlagTrattDemineralizz(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattTDemin())));
		datiH2O.xsetL25FlagTrattNoTrattam(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattTNoTratt())));
		datiH2O.xsetL25FlagTrattOsmosi(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL25FlgTrattTOsmosi())));
		datiH2O.xsetL25FlagTrattamentoH2O(getXmlBoolean(datiH2O.getL25FlagTrattAddolcim() || datiH2O.getL25FlagTrattAltro() || datiH2O.getL25FlagTrattDemineralizz()
				|| datiH2O.getL25FlagTrattNoTrattam() || datiH2O.getL25FlagTrattOsmosi()));

		datiH2O.setL25ConducibH2Oingresso(dto.getL25ConducH2oIng());
		datiH2O.setL25TaraturaSpurgo(dto.getL25Taratura());
	}
	
	public static void mapToSchedaGT(List<SigitVSk4GtDto> compGtImpianto, DatiSchedaGT schedaGt)
	{
		if(compGtImpianto == null) return;
		log.debug("mapToSchedaGT: START");
		SezGruppiTermici sezGT = schedaGt.addNewSezGruppiTermici();
		BigDecimal progressivo = null;
		Date lastDataInstall = null;
		//Date maxDataControllo = null;
		List<RowGT> listGt = new ArrayList<RowGT>();
		RowGT gt = null;
		List<RowGTsost> listSost = new ArrayList<RowGTsost>();
		
		if(compGtImpianto.size()>0)
			progressivo = compGtImpianto.get(0).getProgressivo();
		
		log.debug("mapping scheda GT");
		int numInProgr = 1;
		for (int i=0; i<compGtImpianto.size();i++) {
			
			log.debug("i="+i +", posInProgr = " + numInProgr);
			
			SigitVSk4GtDto dto = compGtImpianto.get(i);
			
			log.debug("GT: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall() + ", data controllo: " + dto.getDataControllo());
			/*
			if(maxDataControllo==null)
				maxDataControllo = dto.getDataControllo();
			if(maxDataControllo!=null && dto.getDataControllo()!=null && dto.getDataControllo().after(maxDataControllo))
			{
				maxDataControllo = dto.getDataControllo();
			}
			*/
			
			if(progressivo.equals(dto.getProgressivo()) && lastDataInstall!=null && lastDataInstall.compareTo(dto.getDataInstall())==0)
			{
				log.debug("duplicato, scartato");
				continue;
			}
			
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo gt sostituite "+listSost.size());
					gt.addNewSezGTsostituite();
					gt.getSezGTsostituite().getRowGTsostList().addAll(listSost);
				}
				listGt.add(gt);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowGTsost>();
				numInProgr = 1;
			}

			if(numInProgr++ == 1)
			{
				log.debug("GT principale");
				gt = mapToRowGT(dto);
				
				/*
				if(dto.getDataControllo()!=null && dto.getDataDismiss()!=null && dto.getDataDismiss().before(dto.getDataControllo()))
				{
//					il flagAnnullaDismissione sara' uguale a 0 se non posso annullare la dismissione e 1 se invece posso annullarla
					gt.xsetFlagAnnullaDismissione(getXmlBoolean(true));
				}
				else
					gt.xsetFlagAnnullaDismissione(getXmlBoolean(false));
				
				// BEPPE - Questo controllo probabilmente non deve essere piu' fatto!!
				//il flagGiaPresenteDB indica se la componente puo' essere modificata (sono modificabili tutte le componenti non controllate)
				if(dto.getDataControllo()!=null && dto.getDataControllo().compareTo(dto.getDataInstall())>=0)
					gt.setFlagGiaPresenteDB(true);
				else
					gt.setFlagGiaPresenteDB(false);
				*/
			}
			else
			{
				log.debug("GT sost");
				//sost
				listSost.add(mapToRowGTSost(dto));
			}
			lastDataInstall = dto.getDataInstall();
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo gt sostituite "+listSost.size());
			gt.addNewSezGTsostituite();
			gt.getSezGTsostituite().getRowGTsostList().addAll(listSost);
		}
		//schedaGt.setL41DataControllo(ConvertUtil.convertDateToXmlCalendar(maxDataControllo));
		listGt.add(gt);
		sezGT.getRowGTList().addAll(listGt);
		log.debug("mapToSchedaGT: END");
	}
	
	public static RowGT mapToRowGT(SigitVSk4GtDto dto)
	{
		RowGT gt = RowGT.Factory.newInstance();
		gt.setL41NumGT(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		gt.setL41DataControllo(ConvertUtil.convertToXmlCalendar(dto.getDataControllo()));
		gt.setL41DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		gt.setL41DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		gt.setL41Matricola(dto.getMatricola());
		gt.setL41Combustibile(ConvertUtil.convertToString(dto.getIdCombustibile()));
		gt.setL41Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		gt.setL41PotTermUtileMax(dto.getPotenzaTermicaKw());
		gt.setL41Modello(dto.getModello());
		gt.setL41FluidoTermoVett(ConvertUtil.convertToString(dto.getFkFluido()));
		gt.setL41NumAnalisiFumi(ConvertUtil.convertToBigInteger(dto.getNModuli()));
		if(Constants.ID_DETT_GT_GRUPPO_TERM_SING.equals(ConvertUtil.convertToString(dto.getFkDettaglioGt())))
			gt.xsetL41GTsingolo(getXmlBoolean(true));
		if(Constants.ID_DETT_GT_GRUPPO_TERM_MOD.equals(ConvertUtil.convertToString(dto.getFkDettaglioGt())))
			gt.xsetL41GTModulare(getXmlBoolean(true));
		if(Constants.ID_DETT_GT_TUBO_RADIANTE.equals(ConvertUtil.convertToString(dto.getFkDettaglioGt())))
			gt.xsetL41TupoRadiante(getXmlBoolean(true));
		if(Constants.ID_DETT_GT_GEN_ARIA_CALDA.equals(ConvertUtil.convertToString(dto.getFkDettaglioGt())))
			gt.xsetL41GenAriaCalda(getXmlBoolean(true));
		if(!Constants.ID_DETT_GT_GRUPPO_TERM_MOD.equals(ConvertUtil.convertToString(dto.getFkDettaglioGt())))
			gt.setL41NumAnalisiFumi(null);
		gt.setL41PercRendimTermUtileMax(dto.getRendimentoPerc());
//		il flagDismissione sara' uguale ad 1 se il componente e' stato dismesso e uguale a 0 se non l'ho dismesso.
		gt.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		//segnalazione 131 libretto
		gt.setL41ManutenzioneAnni(dto.getTempoManutAnni());
		return gt;
	}

	public static RowGTsost mapToRowGTSost(SigitVSk4GtDto dto)
	{
		RowGTsost gt = RowGTsost.Factory.newInstance();
		gt.setL41DataControllo(ConvertUtil.convertToXmlCalendar(dto.getDataControllo()));
		gt.setL41DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		gt.setL41DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		gt.setL41Matricola(dto.getMatricola());
		gt.setL41Combustibile(ConvertUtil.convertToString(dto.getIdCombustibile()));
		gt.setL41Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		gt.setL41PotTermUtileMax(dto.getPotenzaTermicaKw());
		gt.setL41Modello(dto.getModello());
		gt.setL41FluidoTermoVett(ConvertUtil.convertToString(dto.getFkFluido()));
		gt.setL41NumAnalisiFumi(ConvertUtil.convertToBigInteger(dto.getNModuli()));
		if(Constants.ID_DETT_GT_GRUPPO_TERM_SING.equals(ConvertUtil.convertToString(dto.getFkDettaglioGt())))
			gt.xsetL41GTsingolo(getXmlBoolean(true));
		if(Constants.ID_DETT_GT_GRUPPO_TERM_MOD.equals(ConvertUtil.convertToString(dto.getFkDettaglioGt())))
			gt.xsetL41GTModulare(getXmlBoolean(true));
		if(Constants.ID_DETT_GT_TUBO_RADIANTE.equals(ConvertUtil.convertToString(dto.getFkDettaglioGt())))
			gt.xsetL41TupoRadiante(getXmlBoolean(true));
		if(Constants.ID_DETT_GT_GEN_ARIA_CALDA.equals(ConvertUtil.convertToString(dto.getFkDettaglioGt())))
			gt.xsetL41GenAriaCalda(getXmlBoolean(true));
		if(!Constants.ID_DETT_GT_GRUPPO_TERM_MOD.equals(ConvertUtil.convertToString(dto.getFkDettaglioGt())))
			gt.setL41NumAnalisiFumi(null);
		gt.setL41PercRendimTermUtileMax(dto.getRendimentoPerc());
		//il flagRollback deve essere a TRUE se non posso effettuare il rollback  e a FALSE se invece posso farlo.
		// Beppe - Questo campo nella nuova gestione non dovrebbe piu' servire
		gt.setFlagRollBack41(GenericUtil.isNotNullOrEmpty(dto.getDataControllo()));
		//segnalazione 131 libretto
		gt.setL41ManutenzioneAnni(dto.getTempoManutAnni());
		return gt;
	}

	public static void mapToSchedaBR(List<SigitTCompBrRcDto> listBr, DatiSchedaBR schedaBr, List<SigitVSk4GtDto> compGtImpiantoDett)
	{
		if(listBr == null) return;
		log.debug("mapToSchedaBR: START");
		SezBR sezBR = schedaBr.addNewSezBR();
		BigDecimal progressivo = null;
		List<RowBR> listGt = new ArrayList<RowBR>();
		RowBR br = null;
		List<RowBRsost> listSost = new ArrayList<RowBRsost>();
		if(listBr!=null && listBr.size()>0)
			progressivo = listBr.get(0).getProgressivoBrRc();
		log.debug("mapping scheda BR");
		int numInProgr = 1;
		for (int i=0; i<listBr.size();i++) {
			log.debug("i="+i+",progressivo: "+ progressivo +", inProgr: " + numInProgr);
			SigitTCompBrRcDto dto = listBr.get(i);
			log.debug("BR: progr:"+dto.getProgressivoBrRc() + ", data install: " + dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivoBrRc()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo br sostituite "+listSost.size());
					br.addNewSezBRsostituite();
					br.getSezBRsostituite().getRowBRsostList().addAll(listSost);
				}
				listGt.add(br);
				progressivo = dto.getProgressivoBrRc();
				listSost= new ArrayList<RowBRsost>();
				numInProgr = 1;//riparto dal primo
			}
//			boolean isGtControllato = isGtControllato(compGtImpiantoDett, ConvertUtil.convertToBigDecimal(br.getL42NumGT()));
			// Beppe
			boolean isGtControllato = false;
			if(numInProgr++ == 1)
			{
				log.debug("BR principale");
				br = mapToRowBR(dto);
				// Beppe
				isGtControllato = isGtControllato(compGtImpiantoDett, ConvertUtil.convertToBigDecimal(br.getL42NumGT()));
				
				br.xsetFlagAnnullaDismissione(getXmlBoolean(!isGtControllato));
			}
			else
			{
				log.debug("BR sost");
				//sost
				listSost.add(mapToRowBRSost(dto, isGtControllato));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo br sostituite "+listSost.size());
			br.addNewSezBRsostituite();
			br.getSezBRsostituite().getRowBRsostList().addAll(listSost);
		}
		listGt.add(br);
		sezBR.getRowBRList().addAll(listGt);
		log.debug("mapToSchedaBR: END");
	}
	
	public static RowBR mapToRowBR(SigitTCompBrRcDto dto)
	{
		RowBR br = RowBR.Factory.newInstance();
		br.setL42NumBR(ConvertUtil.convertToBigInteger(dto.getProgressivoBrRc()));
		br.setL42NumGT(ConvertUtil.convertToBigInteger(dto.getFkProgressivo()));
		br.setL42DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		br.setL42DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		br.setL42Matricola(dto.getMatricola());
		br.setL42Modello(dto.getModello());
		br.setL42Combustibile(ConvertUtil.convertToString(dto.getFkCombustibile()));
		br.setL42Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		br.setL42PortataTermMaxNom(dto.getPotTermMaxKw());
		br.setL42PortataTermMinNom(dto.getPotTermMinKw());
		br.setL42Tipologia(dto.getTipologia());
		br.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return br;
	}
	
	public static RowBRsost mapToRowBRSost(SigitTCompBrRcDto dto, boolean isGtControllato)
	{
		RowBRsost br = RowBRsost.Factory.newInstance();
		br.setL42NumGT(ConvertUtil.convertToBigInteger(dto.getFkProgressivo()));
		br.setL42DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		br.setL42DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		br.setL42Matricola(dto.getMatricola());
		br.setL42Modello(dto.getModello());
		br.setL42Combustibile(ConvertUtil.convertToString(dto.getFkCombustibile()));
		br.setL42Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		br.setL42PortataTermMaxNom(dto.getPotTermMaxKw());
		br.setL42PortataTermMinNom(dto.getPotTermMinKw());
		br.setL42Tipologia(dto.getTipologia());
		br.setFlagRollBack42(!isGtControllato);
		return br;
	}
	
	public static void mapToSchedaRC(List<SigitTCompBrRcDto> listRc, DatiSchedaRC schedaRc, List<SigitVSk4GtDto> compGtImpiantoDett)
	{
		if(listRc == null) return;
		log.debug("mapToSchedaRC: START");
		SezRC sezRC = schedaRc.addNewSezRC();
		BigDecimal progressivo = null;
		List<RowRC> listGt = new ArrayList<RowRC>();
		RowRC rc = null;
		List<RowRCsost> listSost = new ArrayList<RowRCsost>();
		if(listRc!=null && listRc.size()>0)
			progressivo = listRc.get(0).getProgressivoBrRc();
		log.debug("mapping scheda RC");
		int numInProgr = 1;
		for (int i=0; i<listRc.size();i++) {
			log.debug("i="+i);
			SigitTCompBrRcDto dto = listRc.get(i);
			log.debug("RC: progr:"+dto.getProgressivoBrRc() + ", data install: " + dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivoBrRc()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo br sostituite "+listSost.size());
					rc.addNewSezRCsostituite();
					rc.getSezRCsostituite().getRowRCsostList().addAll(listSost);
				}
				listGt.add(rc);
				progressivo = dto.getProgressivoBrRc();
				listSost= new ArrayList<RowRCsost>();
				numInProgr = 1;
			}
//			boolean isGtControllato = isGtControllato(compGtImpiantoDett, ConvertUtil.convertToBigDecimal(rc.getL43NumGT()));
			// Beppe
			boolean isGtControllato = false;
			if(numInProgr++ == 1)
			{
				log.debug("RC principale");
				rc = mapToRowRC(dto);
				// Beppe
				isGtControllato = isGtControllato(compGtImpiantoDett, ConvertUtil.convertToBigDecimal(rc.getL43NumGT()));
				rc.xsetFlagAnnullaDismissione(getXmlBoolean(!isGtControllato));
			}
			else
			{
				log.debug("RC sost");
				listSost.add(mapToRowRCSost(dto, isGtControllato));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo br sostituite "+listSost.size());
			rc.addNewSezRCsostituite();
			rc.getSezRCsostituite().getRowRCsostList().addAll(listSost);
		}
		listGt.add(rc);
		sezRC.getRowRCList().addAll(listGt);
		log.debug("mapToSchedaRC: END");
	}

	private static boolean isGtControllato(List<SigitVSk4GtDto> gtList, BigDecimal progressivo)
	{
		for (SigitVSk4GtDto gt : gtList) {
			if(gt.getProgressivo().equals(progressivo))
				return GenericUtil.isNotNullOrEmpty(gt.getDataControllo());
		}
		return false;
	}
	
	public static RowRC mapToRowRC(SigitTCompBrRcDto dto)
	{
		RowRC rc = RowRC.Factory.newInstance();
		rc.setL43NumRC(ConvertUtil.convertToBigInteger(dto.getProgressivoBrRc()));
		rc.setL43NumGT(ConvertUtil.convertToBigInteger(dto.getFkProgressivo()));
		rc.setL43DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		rc.setL43DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		rc.setL43Matricola(dto.getMatricola());
		rc.setL43Modello(dto.getModello());
		rc.setL43Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		rc.setL43PotTermNomTot(dto.getPotTermMaxKw());
		rc.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return rc;
	}
	
	public static RowRCsost mapToRowRCSost(SigitTCompBrRcDto dto, boolean isGtControllato)
	{
		RowRCsost rc = RowRCsost.Factory.newInstance();
		rc.setL43NumGT(ConvertUtil.convertToBigInteger(dto.getFkProgressivo()));
		rc.setL43DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		rc.setL43DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		rc.setL43Matricola(dto.getMatricola());
		rc.setL43Modello(dto.getModello());
		rc.setL43Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		rc.setL43PotTermNomTot(dto.getPotTermMaxKw());
//		gt.setFlagRollBack41(GenericUtil.isNotNullOrEmpty(dto.getIdDettTipo1()));
		rc.setFlagRollBack43(!isGtControllato);
		return rc;
	}
	
	public static void mapToSchedaGF(List<SigitVSk4GfDto> comp4, DatiSchedaGF schedaGf)
	{
		if(comp4 == null) return;
		log.debug("mapToSchedaGF: START");
		SezGF sezGF = schedaGf.addNewSezGF();
		BigDecimal progressivo = null;
		Date lastDataInstall = null;
		//Date maxDataControllo = null;
		List<RowGF> listGf = new ArrayList<RowGF>();
		RowGF gf = null;
		List<RowGFsost> listSost = new ArrayList<RowGFsost>();
		if(comp4.size()>0)
			progressivo = comp4.get(0).getProgressivo();
		log.debug("mapping scheda GF");
		int numInProgr = 1;
		for (int i=0; i<comp4.size();i++) {
			log.debug("i="+i);
			SigitVSk4GfDto dto = comp4.get(i);
			log.debug("GF: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			
			/*
			if(maxDataControllo==null)
				maxDataControllo = dto.getDataControllo();
			if(maxDataControllo!=null && dto.getDataControllo()!=null && dto.getDataControllo().after(maxDataControllo))
			{
				maxDataControllo = dto.getDataControllo();
			}
			*/
			
			if(progressivo.equals(dto.getProgressivo()) && lastDataInstall!=null && lastDataInstall.compareTo(dto.getDataInstall())==0)
			{
				log.debug("duplicato, scartato");
				continue;
			}
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo gf sostituite "+listSost.size());
					gf.addNewSezGFsostituite();
					gf.getSezGFsostituite().getRowGFsostList().addAll(listSost);
				}
				listGf.add(gf);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowGFsost>();
				numInProgr = 1;
			}
			
			if(numInProgr++ == 1)
			{
				log.debug("GF principale");
				gf = mapToRowGF(dto);
				
				/*
				//aggiungere flagAnnullaDismissione
				if(dto.getDataControllo()!=null && dto.getDataDismiss()!=null && dto.getDataDismiss().before(dto.getDataControllo()))
				{
//					il flagAnnullaDismissione sara' uguale a 0 se non posso annullare la dismissione e 1 se invece posso annullarla
					gf.xsetFlagAnnullaDismissione(getXmlBoolean(true));
				}
				else
					gf.xsetFlagAnnullaDismissione(getXmlBoolean(false));
				//il flagGiaPresenteDB indica se la componente puo' essere modificata (sono modificabili tutte le componenti non controllate)
				if(dto.getDataControllo()!=null && dto.getDataControllo().compareTo(dto.getDataInstall())>=0)
					gf.setFlagGiaPresenteDB(true);
				else
					gf.setFlagGiaPresenteDB(false);
				*/
			}
			else
			{
				log.debug("GF sost");
				listSost.add(mapToRowGFSost(dto));
			}
			lastDataInstall = dto.getDataInstall();
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo gf sostituite "+listSost.size());
			gf.addNewSezGFsostituite();
			gf.getSezGFsostituite().getRowGFsostList().addAll(listSost);
		}
		listGf.add(gf);
		//schedaGf.setL44DataControllo(ConvertUtil.convertDateToXmlCalendar(maxDataControllo));
		sezGF.getRowGFList().addAll(listGf);
		log.debug("mapToSchedaGF: END");
	}
	
	public static RowGF mapToRowGF(SigitVSk4GfDto dto)
	{
		RowGF gf = RowGF.Factory.newInstance();
		gf.setL44NumGF(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		gf.setL44DataControllo(ConvertUtil.convertToXmlCalendar(dto.getDataControllo()));
		gf.setL44DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		gf.setL44DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		gf.setL44Matricola(dto.getMatricola());
		gf.setL44Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		gf.setL44Modello(dto.getModello());
		gf.setL44TipoCombustibile(ConvertUtil.convertToString(dto.getIdCombustibile()));
		
		if(Constants.FLG_ACQUA.equals(dto.getFlgSorgenteExt()))
			gf.xsetL44FlagSorgACQUA(getXmlBoolean(true));
		if(Constants.FLG_ARIA.equals(dto.getFlgSorgenteExt()))
			gf.xsetL44FlagSorgARIA(getXmlBoolean(true));
		
		if(Constants.ID_DETT_GF_ASS_REC_CALORE.equals(ConvertUtil.convertToString(dto.getFkDettaglioGf())))
			gf.xsetL44FlagRecupCalore(getXmlBoolean(true));
		if(Constants.ID_DETT_GF_ASS_FIAMM_COMB.equals(ConvertUtil.convertToString(dto.getFkDettaglioGf())))
			gf.xsetL44FlagFiammaDiretta(getXmlBoolean(true));
		if(Constants.ID_DETT_GF_CICLO_COMPRESS.equals(ConvertUtil.convertToString(dto.getFkDettaglioGf())))
			gf.xsetL44FlagCicloCompress(getXmlBoolean(true));
		
		if(Constants.FLG_ACQUA.equals(dto.getFlgFluidoUtenze()))
			gf.xsetL44FlagFluidoACQUA(getXmlBoolean(true));
		if(Constants.FLG_ARIA.equals(dto.getFlgFluidoUtenze()))
			gf.xsetL44FlagFluidoARIA(getXmlBoolean(true));
		
		gf.setL44FluidoFrigo(dto.getFluidoFrigorigeno());
		gf.setL44NumCircuiti(ConvertUtil.convertToBigInteger(dto.getNCircuiti()));
		gf.setL44PotFrigoAssorb(dto.getRaffPotenzaAss());
		gf.setL44PotFrigoNom(dto.getRaffPotenzaKw());
		gf.setL44PotTermAssorb(dto.getRiscPotenzaAssKw());
		gf.setL44PotTermNom(dto.getRiscPotenzaKw());
		gf.setL44Raffrescam(ConvertUtil.convertToBigDecimal(dto.getRaffrescamentoEer()));
		gf.setL44Riscaldam(ConvertUtil.convertToBigDecimal(dto.getRiscaldamentoCop()));
		//aggiungere info allegato
		gf.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		//segnalazione 131 libretto
		gf.setL44ManutenzioneAnni(dto.getTempoManutAnni());
		return gf;
	}

	public static RowGFsost mapToRowGFSost(SigitVSk4GfDto dto)
	{
		RowGFsost gf = RowGFsost.Factory.newInstance();
		gf.setL44DataControllo(ConvertUtil.convertToXmlCalendar(dto.getDataControllo()));
		gf.setL44DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		gf.setL44DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		gf.setL44Matricola(dto.getMatricola());
		gf.setL44Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		gf.setL44Modello(dto.getModello());
		gf.setL44TipoCombustibile(ConvertUtil.convertToString(dto.getIdCombustibile()));
		
		if(Constants.FLG_ACQUA.equals(dto.getFlgSorgenteExt()))
			gf.xsetL44FlagSorgACQUA(getXmlBoolean(true));
		if(Constants.FLG_ARIA.equals(dto.getFlgSorgenteExt()))
			gf.xsetL44FlagSorgARIA(getXmlBoolean(true));
		
		if(Constants.ID_DETT_GF_ASS_REC_CALORE.equals(ConvertUtil.convertToString(dto.getFkDettaglioGf())))
			gf.xsetL44FlagRecupCalore(getXmlBoolean(true));
		if(Constants.ID_DETT_GF_ASS_FIAMM_COMB.equals(ConvertUtil.convertToString(dto.getFkDettaglioGf())))
			gf.xsetL44FlagFiammaDiretta(getXmlBoolean(true));
		if(Constants.ID_DETT_GF_CICLO_COMPRESS.equals(ConvertUtil.convertToString(dto.getFkDettaglioGf())))
			gf.xsetL44FlagCicloCompress(getXmlBoolean(true));
		
		if(Constants.FLG_ACQUA.equals(dto.getFlgFluidoUtenze()))
			gf.xsetL44FlagFluidoACQUA(getXmlBoolean(true));
		if(Constants.FLG_ARIA.equals(dto.getFlgFluidoUtenze()))
			gf.xsetL44FlagFluidoARIA(getXmlBoolean(true));
		
		gf.setL44FluidoFrigo(dto.getFluidoFrigorigeno());
		gf.setL44NumCircuiti(ConvertUtil.convertToBigInteger(dto.getNCircuiti()));
		gf.setL44PotFrigoAssorb(dto.getRaffPotenzaAss());
		gf.setL44PotFrigoNom(dto.getRaffPotenzaKw());
		gf.setL44PotTermAssorb(dto.getRiscPotenzaAssKw());
		gf.setL44PotTermNom(dto.getRiscPotenzaKw());
		gf.setL44Raffrescam(ConvertUtil.convertToBigDecimal(dto.getRaffrescamentoEer()));
		gf.setL44Riscaldam(ConvertUtil.convertToBigDecimal(dto.getRiscaldamentoCop()));
		//aggiungere info allegato
		gf.setFlagRollBack44(GenericUtil.isNullOrEmpty(dto.getDataControllo()));
		//segnalazione 131 libretto
		gf.setL44ManutenzioneAnni(dto.getTempoManutAnni());
		return gf;
	}

	
	public static void mapToSchedaSC(List<SigitVSk4ScDto> compScImpianto, DatiSchedaSC schedaSc)
	{
		if(compScImpianto == null) return;
		log.debug("mapToSchedaSC: START");
		SezSC sezSC = schedaSc.addNewSezSC();
		
		BigDecimal progressivo = null;
		Date lastDataInstall = null;
		//Date maxDataControllo = null;
		List<RowSC> listSc = new ArrayList<RowSC>();
		RowSC sc = null;
		List<RowSCsost> listSost = new ArrayList<RowSCsost>();
		if(compScImpianto.size()>0)
			progressivo = compScImpianto.get(0).getProgressivo();
		log.debug("mapping scheda SC");
		int numInProgr = 1;
		for (int i=0; i<compScImpianto.size();i++) {
			log.debug("i="+i+", inProgor="+numInProgr);
			SigitVSk4ScDto dto = compScImpianto.get(i);
			log.debug("SC: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			
			/*
			if(maxDataControllo==null)
				maxDataControllo = dto.getDataControllo();
			if(maxDataControllo!=null && dto.getDataControllo()!=null && dto.getDataControllo().after(maxDataControllo))
			{
				maxDataControllo = dto.getDataControllo();
			}
			*/
			
			if(progressivo.equals(dto.getProgressivo()) && lastDataInstall!=null && lastDataInstall.compareTo(dto.getDataInstall())==0)
			{
				log.debug("duplicato, scartato");
				continue;
			}
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo sc sostituite "+listSost.size());
					sc.addNewSezSCsostituite();
					sc.getSezSCsostituite().getRowSCsostList().addAll(listSost);
				}
				listSc.add(sc);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowSCsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("SC principale");
				sc = mapToRowSC(dto);
				
				/*
				//aggiungere flagAnnullaDismissione
				if(dto.getDataControllo()!=null && dto.getDataDismiss()!=null && dto.getDataDismiss().before(dto.getDataControllo()))
				{
//					il flagAnnullaDismissione sara' uguale a 0 se non posso annullare la dismissione e 1 se invece posso annullarla
					sc.xsetFlagAnnullaDismissione(getXmlBoolean(true));
				}
				else
					sc.xsetFlagAnnullaDismissione(getXmlBoolean(false));
				//il flagGiaPresenteDB indica se la componente puo' essere modificata (sono modificabili tutte le componenti non controllate)
				if(dto.getDataControllo()!=null && dto.getDataControllo().compareTo(dto.getDataInstall())>=0)
					sc.setFlagGiaPresenteDB(true);
				else
					sc.setFlagGiaPresenteDB(false);
				*/
			}
			else
			{
				log.debug("SC sost");
				//sost
				listSost.add(mapToRowSCSost(dto));
			}
			lastDataInstall = dto.getDataInstall();
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo sc sostituite "+listSost.size());
			sc.addNewSezSCsostituite();
			sc.getSezSCsostituite().getRowSCsostList().addAll(listSost);
		}
		listSc.add(sc);
		//schedaSc.setL45DataControllo(ConvertUtil.convertDateToXmlCalendar(maxDataControllo));
		sezSC.getRowSCList().addAll(listSc);
		log.debug("mapToSchedaSC: END");
	}
	
	public static RowSC mapToRowSC(SigitVSk4ScDto dto)
	{
		RowSC sc = RowSC.Factory.newInstance();
		sc.setL45NumSC(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		sc.setL45DataControllo(ConvertUtil.convertToXmlCalendar(dto.getDataControllo()));
		sc.setL45DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		sc.setL45DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		sc.setL45Matricola(dto.getMatricola());
		sc.setL45Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		sc.setL45Modello(dto.getModello());
		sc.setL45PotTermNomTot(dto.getPotenzaTermicaKw());
		//info allegato
		sc.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		//segnalazione 131 libretto
		sc.setL45ManutenzioneAnni(dto.getTempoManutAnni());
		return sc;
	}
	
	public static RowSCsost mapToRowSCSost(SigitVSk4ScDto dto)
	{
		RowSCsost sc = RowSCsost.Factory.newInstance();
		sc.setL45DataControllo(ConvertUtil.convertToXmlCalendar(dto.getDataControllo()));
		sc.setL45DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		sc.setL45DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		sc.setL45Matricola(dto.getMatricola());
		sc.setL45Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		sc.setL45Modello(dto.getModello());
		sc.setL45PotTermNomTot(dto.getPotenzaTermicaKw());
		//info allegato
		sc.setFlagRollBack45(GenericUtil.isNullOrEmpty(dto.getDataControllo()));
		//segnalazione 131 libretto
		sc.setL45ManutenzioneAnni(dto.getTempoManutAnni());
		return sc;
	}
	
	public static void mapToSchedaCG(List<SigitVSk4CgDto> compCgImpianto, DatiSchedaCG schedaCg)
	{
		if(compCgImpianto == null) return;
		log.debug("mapToSchedaCG: START");
		SezCG sezCg = schedaCg.addNewSezCG();
		BigDecimal progressivo = null;
		Date lastDataInstall = null;
		//Date maxDataControllo = null;
		List<RowCG> listSc = new ArrayList<RowCG>();
		RowCG cg = null;
		List<RowCGsost> listSost = new ArrayList<RowCGsost>();
		if(compCgImpianto.size()>0)
			progressivo = compCgImpianto.get(0).getProgressivo();
		log.debug("mapping scheda CG");
		int numInProgr = 1;
		for (int i=0; i<compCgImpianto.size();i++) {
			log.debug("i="+i+", inProgr="+numInProgr);
			SigitVSk4CgDto dto = compCgImpianto.get(i);
			log.debug("CG: progr:" + dto.getProgressivo() + ", data install: " + dto.getDataInstall());
			
			/*
			if(maxDataControllo==null)
				maxDataControllo = dto.getDataControllo();
			if(maxDataControllo!=null && dto.getDataControllo()!=null && dto.getDataControllo().after(maxDataControllo))
			{
				maxDataControllo = dto.getDataControllo();
			}
			*/

			if(progressivo.equals(dto.getProgressivo()) && lastDataInstall!=null && lastDataInstall.compareTo(dto.getDataInstall())==0)
			{
				log.debug("duplicato, scartato");
				continue;
			}
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo cg sostituite "+listSost.size());
					cg.addNewSezCGsostituite();
					cg.getSezCGsostituite().getRowCGsostList().addAll(listSost);
				}
				listSc.add(cg);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowCGsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("CG principale");
				cg = mapToRowCG(dto);
				
				/*
				//aggiungere flagAnnullaDismissione
				if(dto.getDataControllo()!=null && dto.getDataDismiss()!=null && dto.getDataDismiss().before(dto.getDataControllo()))
				{
//					il flagAnnullaDismissione sara' uguale a 0 se non posso annullare la dismissione e 1 se invece posso annullarla
					cg.xsetFlagAnnullaDismissione(getXmlBoolean(true));
				}
				else
					cg.xsetFlagAnnullaDismissione(getXmlBoolean(false));

				//il flagGiaPresenteDB indica se la componente puo' essere modificata (sono modificabili tutte le componenti non controllate)
				if(dto.getDataControllo()!=null && dto.getDataControllo().compareTo(dto.getDataInstall())>=0)
					cg.setFlagGiaPresenteDB(true);
				else
					cg.setFlagGiaPresenteDB(false);
				*/
			}
			else
			{
				log.debug("CG sost");
				//sost
				listSost.add(mapToRowCGSost(dto));
			}
			lastDataInstall = dto.getDataInstall();
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo cg sostituite "+listSost.size());
			cg.addNewSezCGsostituite();
			cg.getSezCGsostituite().getRowCGsostList().addAll(listSost);
		}
		listSc.add(cg);
		//schedaCg.setL46DataControllo(ConvertUtil.convertDateToXmlCalendar(maxDataControllo));
		sezCg.getRowCGList().addAll(listSc);
		log.debug("mapToSchedaCG: END");
	}
	
	public static RowCG mapToRowCG(SigitVSk4CgDto dto)
	{
		RowCG cg = RowCG.Factory.newInstance();
		cg.setL46NumCG(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		cg.setL46DataControllo(ConvertUtil.convertToXmlCalendar(dto.getDataControllo()));
		cg.setL46DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		cg.setL46DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		cg.setL46Matricola(dto.getMatricola());
		cg.setL46Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		cg.setL46Modello(dto.getModello());
		cg.setL46PotTermNom(dto.getPotenzaTermicaKw());
		cg.setL46Combustibile(ConvertUtil.convertToString(dto.getIdCombustibile()));
		cg.setL46Tipologia(dto.getTipologia());
		cg.setL46PotElettrNom(dto.getPotenzaElettricaKw());
//		cg.setL46EmissioniMonossidoMAX(ConvertUtil.convertToBigInteger(dto.getCoMax()));
//		cg.setL46EmissioniMonossidoMIN(ConvertUtil.convertToBigInteger(dto.getCoMin()));
//		cg.setL46TempAcquaIngressoMAX(ConvertUtil.convertToBigInteger(dto.getTempH2oInMax()));
//		cg.setL46TempAcquaIngressoMIN(ConvertUtil.convertToBigInteger(dto.getTempH2oInMin()));
//		cg.setL46TempAcquaMotoreMAX(ConvertUtil.convertToBigInteger(dto.getTempH2oMotoreMax()));
//		cg.setL46TempAcquaMotoreMIN(ConvertUtil.convertToBigInteger(dto.getTempH2oMotoreMin()));
//		cg.setL46TempAcquaUscitaMAX(ConvertUtil.convertToBigInteger(dto.getTempH2oOutMax()));
//		cg.setL46TempAcquaUscitaMIN(ConvertUtil.convertToBigInteger(dto.getTempH2oOutMin()));
//		cg.setL46TempFumiMonteMAX(ConvertUtil.convertToBigInteger(dto.getTempFumiMonteMax()));
//		cg.setL46TempFumiMonteMIN(ConvertUtil.convertToBigInteger(dto.getTempFumiMonteMin()));
//		cg.setL46TempFumiValleMAX(ConvertUtil.convertToBigInteger(dto.getTempFumiValleMax()));
//		cg.setL46TempFumiValleMIN(ConvertUtil.convertToBigInteger(dto.getTempFumiValleMin()));
		// BEPPE
		cg.setL46EmissioniMonossidoMAX(dto.getCoMax());
		cg.setL46EmissioniMonossidoMIN(dto.getCoMin());
		cg.setL46TempAcquaIngressoMAX(dto.getTempH2oInMax());
		cg.setL46TempAcquaIngressoMIN(dto.getTempH2oInMin());
		cg.setL46TempAcquaMotoreMAX(dto.getTempH2oMotoreMax());
		cg.setL46TempAcquaMotoreMIN(dto.getTempH2oMotoreMin());
		cg.setL46TempAcquaUscitaMAX(dto.getTempH2oOutMax());
		cg.setL46TempAcquaUscitaMIN(dto.getTempH2oOutMin());
		cg.setL46TempFumiMonteMAX(dto.getTempFumiMonteMax());
		cg.setL46TempFumiMonteMIN(dto.getTempFumiMonteMin());
		cg.setL46TempFumiValleMAX(dto.getTempFumiValleMax());
		cg.setL46TempFumiValleMIN(dto.getTempFumiValleMin());

		//info allegato
		cg.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		//segnalazione 131 libretto
		cg.setL46ManutenzioneAnni(dto.getTempoManutAnni());
		return cg;
	}
	
	public static RowCGsost mapToRowCGSost(SigitVSk4CgDto dto)
	{
		RowCGsost cg = RowCGsost.Factory.newInstance();
		cg.setL46DataControllo(ConvertUtil.convertToXmlCalendar(dto.getDataControllo()));
		cg.setL46DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		cg.setL46DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		cg.setL46Matricola(dto.getMatricola());
		cg.setL46Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		cg.setL46Modello(dto.getModello());
		cg.setL46PotTermNom(dto.getPotenzaTermicaKw());
		cg.setL46Combustibile(ConvertUtil.convertToString(dto.getIdCombustibile()));
		cg.setL46Tipologia(dto.getTipologia());
		cg.setL46PotElettrNom(dto.getPotenzaElettricaKw());
//		cg.setL46EmissioniMonossidoMAX(ConvertUtil.convertToBigInteger(dto.getCoMax()));
//		cg.setL46EmissioniMonossidoMIN(ConvertUtil.convertToBigInteger(dto.getCoMin()));
//		cg.setL46TempAcquaIngressoMAX(ConvertUtil.convertToBigInteger(dto.getTempH2oInMax()));
//		cg.setL46TempAcquaIngressoMIN(ConvertUtil.convertToBigInteger(dto.getTempH2oInMin()));
//		cg.setL46TempAcquaMotoreMAX(ConvertUtil.convertToBigInteger(dto.getTempH2oMotoreMax()));
//		cg.setL46TempAcquaMotoreMIN(ConvertUtil.convertToBigInteger(dto.getTempH2oMotoreMin()));
//		cg.setL46TempAcquaUscitaMAX(ConvertUtil.convertToBigInteger(dto.getTempH2oOutMax()));
//		cg.setL46TempAcquaUscitaMIN(ConvertUtil.convertToBigInteger(dto.getTempH2oOutMin()));
//		cg.setL46TempFumiMonteMAX(ConvertUtil.convertToBigInteger(dto.getTempFumiMonteMax()));
//		cg.setL46TempFumiMonteMIN(ConvertUtil.convertToBigInteger(dto.getTempFumiMonteMin()));
//		cg.setL46TempFumiValleMAX(ConvertUtil.convertToBigInteger(dto.getTempFumiValleMax()));
//		cg.setL46TempFumiValleMIN(ConvertUtil.convertToBigInteger(dto.getTempFumiValleMin()));
		// BEPPE
		cg.setL46EmissioniMonossidoMAX(dto.getCoMax());
		cg.setL46EmissioniMonossidoMIN(dto.getCoMin());
		cg.setL46TempAcquaIngressoMAX(dto.getTempH2oInMax());
		cg.setL46TempAcquaIngressoMIN(dto.getTempH2oInMin());
		cg.setL46TempAcquaMotoreMAX(dto.getTempH2oMotoreMax());
		cg.setL46TempAcquaMotoreMIN(dto.getTempH2oMotoreMin());
		cg.setL46TempAcquaUscitaMAX(dto.getTempH2oOutMax());
		cg.setL46TempAcquaUscitaMIN(dto.getTempH2oOutMin());
		cg.setL46TempFumiMonteMAX(dto.getTempFumiMonteMax());
		cg.setL46TempFumiMonteMIN(dto.getTempFumiMonteMin());
		cg.setL46TempFumiValleMAX(dto.getTempFumiValleMax());
		cg.setL46TempFumiValleMIN(dto.getTempFumiValleMin());

		//info allegato
		cg.setFlagRollBack46(GenericUtil.isNullOrEmpty(dto.getDataControllo()));
		//segnalazione 131 libretto
		cg.setL46ManutenzioneAnni(dto.getTempoManutAnni());
		return cg;
	}
	
	public static void mapToSchedaCS(List<SigitVCompCsDto> compCsImpianto, DatiSchedaCS schedaCs)
	{
		if(compCsImpianto == null) return;
		log.debug("mapToSchedaCS: START");
		SezCS sezCs = schedaCs.addNewSezCS();
		BigDecimal progressivo = null;
		List<RowCS> listSc = new ArrayList<RowCS>();
		RowCS sc = null;
		List<RowCSvar> listVar = new ArrayList<RowCSvar>();
		if(compCsImpianto.size()>0)
			progressivo = compCsImpianto.get(0).getProgressivo();
		log.debug("mapping scheda CS");
		int numInProgr = 1;
		for (int i=0; i<compCsImpianto.size();i++) {
			log.debug("i="+i+", inProgr="+numInProgr);
			SigitVCompCsDto dto = compCsImpianto.get(i);
			log.debug("CS: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listVar.isEmpty())
				{
					log.debug("aggiungo cs sostituite "+listVar.size());
					sc.addNewSezCSvariate();
					sc.getSezCSvariate().getRowCSvarList().addAll(listVar);
				}
				listSc.add(sc);
				progressivo = dto.getProgressivo();
				listVar= new ArrayList<RowCSvar>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("CS principale");
				sc = mapToRowCS(dto);
			}
			else
			{
				log.debug("CS sost");
				//sost
				listVar.add(mapToRowCSVar(dto));
			}
		}
		if(!listVar.isEmpty())
		{
			log.debug("aggiungo cs sostituite "+listVar.size());
			sc.addNewSezCSvariate();
			sc.getSezCSvariate().getRowCSvarList().addAll(listVar);
		}
		listSc.add(sc);
		sezCs.getRowCSList().addAll(listSc);
		log.debug("mapToSchedaCS: END");
	}

	public static RowCS mapToRowCS(SigitVCompCsDto dto)
	{
		RowCS cs = RowCS.Factory.newInstance();
		cs.setL47NumCS(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		cs.setL47DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		cs.setL47DataDismissione(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		cs.setL47Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		cs.setL47Collettori(ConvertUtil.convertToString(dto.getNumCollettori()));
		cs.setL47SuperfTotApertura(dto.getSupApertura());
		cs.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return cs;
	}

	public static RowCSvar mapToRowCSVar(SigitVCompCsDto dto)
	{
		RowCSvar cs = RowCSvar.Factory.newInstance();
		cs.setL47DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		cs.setL47DataDismissione(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		cs.setL47Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		cs.setL47Collettori(ConvertUtil.convertToString(dto.getNumCollettori()));
		cs.setL47SuperfTotApertura(dto.getSupApertura());
//		cs.setFlagRollBack47(GenericUtil.isNotNullOrEmpty(dto.getIdDettTipo1()));
		return cs;
	}
	
	public static void mapToSchedaAG(List<SigitVCompAgDto> compAgImpianto, DatiSchedaAG schedaAg)
	{
		if(compAgImpianto == null) return;
		log.debug("mapToSchedaAG: START");
		SezAG sezCs = schedaAg.addNewSezAG();
		BigDecimal progressivo = null;
		List<RowAG> listAg = new ArrayList<RowAG>();
		RowAG ag = null;
		List<RowAGsost> listSost = new ArrayList<RowAGsost>();
		if(compAgImpianto.size()>0)
			progressivo = compAgImpianto.get(0).getProgressivo();
		log.debug("mapping scheda AG");
		int numInProgr = 1;
		for (int i=0; i<compAgImpianto.size();i++) {
			log.debug("i="+i+", inProgr="+numInProgr);
			SigitVCompAgDto dto = compAgImpianto.get(i);
			log.debug("AG: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo AG sostituite "+listSost.size());
					ag.addNewSezAGsostituite();
					ag.getSezAGsostituite().getRowAGsostList().addAll(listSost);
				}
				listAg.add(ag);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowAGsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("AG principale");
				ag = mapToRowAG(dto);
			}
			else
			{
				log.debug("AG sost");
				//sost
				listSost.add(mapToRowAGSost(dto));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo cAGs sostituite "+listSost.size());
			ag.addNewSezAGsostituite();
			ag.getSezAGsostituite().getRowAGsostList().addAll(listSost);
		}
		listAg.add(ag);
		sezCs.getRowAGList().addAll(listAg);
		log.debug("mapToSchedaAG: END");
	}
	
	public static RowAG mapToRowAG(SigitVCompAgDto dto)
	{
		RowAG ag = RowAG.Factory.newInstance();
		ag.setL48NumAG(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		ag.setL48DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		ag.setL48DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		ag.setL48Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		ag.setL48Modello(dto.getModello());
		ag.setL48Matricola(dto.getMatricola());
		ag.setL48PotUtile(dto.getPotenzaTermicaKw());
		ag.setL48Tipologia(dto.getTipologia());
		ag.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return ag;
	}

	public static RowAGsost mapToRowAGSost(SigitVCompAgDto dto)
	{
		RowAGsost ag = RowAGsost.Factory.newInstance();
		ag.setL48DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		ag.setL48DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		ag.setL48Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		ag.setL48Modello(dto.getModello());
		ag.setL48Matricola(dto.getMatricola());
		ag.setL48PotUtile(dto.getPotenzaTermicaKw());
		ag.setL48Tipologia(dto.getTipologia());
		return ag;
	}
	
	public static void mapToSchedaSistemiRegolarizzazionePrimaria(RegolazionePrimaria regolazionePrimaria, SigitTCompXSempliceDto compXSemplice) {
		if(compXSemplice!=null)
		{
			regolazionePrimaria.setL51DescrSistema(compXSemplice.getL51SrDescrizione());
			regolazionePrimaria.xsetL51FlagAltriSistRegPrim(getXmlBoolean(ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgSrAltri())));
			regolazionePrimaria.xsetL51FlagRegInverter(getXmlBoolean(ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgSrInverter())));
			regolazionePrimaria.xsetL51FlagRegMultiGrad(getXmlBoolean(ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgSrMultigradino())));
			regolazionePrimaria.xsetL51FlagRegolazCurvaIndipen(getXmlBoolean(ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgSrIndipendente())));
			regolazionePrimaria.xsetL51FlagRegolazCurvaIntegr(getXmlBoolean(ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgSrGeneratore())));
			regolazionePrimaria.xsetL51FlagRegolazOnOff(getXmlBoolean(ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgSrOnoff())));
			regolazionePrimaria.xsetL51FlagValvoleReg(getXmlBoolean(ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgValvoleRegolazione())));
		}
	}
	
	public static void mapToSchedaSistemiRegolarizzazioneSingoloAmbiente(RegolazioneSingoloAmb singAmb, SigitTCompXSempliceDto dto) {
		singAmb.xsetL52FlagControlEntalpico(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL52FlgContrEntalpico())));
		singAmb.xsetL52FlagControlPortata(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL52FlgContrPortata())));
		singAmb.xsetL52FlagTermostatoOnOff(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL52FlgTermoOnoff())));
		singAmb.xsetL52FlagTermostatoProporz(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL52FlgTermoProporzionale())));
		singAmb.xsetL52FlagValvDueVieNO(getXmlBoolean(Constants.FLAG_ASSENTE.equals(dto.getL52FlgValvole2())));
		singAmb.xsetL52FlagValvDueVieSI(getXmlBoolean(Constants.FLAG_PRESENTE.equals(dto.getL52FlgValvole2())));
		singAmb.xsetL52FlagValvTermostNO(getXmlBoolean(Constants.FLAG_ASSENTE.equals(dto.getL52FlgValvoleTermo())));
		singAmb.xsetL52FlagValvTermostSI(getXmlBoolean(Constants.FLAG_PRESENTE.equals(dto.getL52FlgValvoleTermo())));
		singAmb.xsetL52FlagValvTreVieNO(getXmlBoolean(Constants.FLAG_ASSENTE.equals(dto.getL52FlgValvole3())));
		singAmb.xsetL52FlagValvTreVieSI(getXmlBoolean(Constants.FLAG_PRESENTE.equals(dto.getL52FlgValvole3())));
		singAmb.setL52Note(dto.getL52Note());
		try{singAmb.setL53DataSostituzione(ConvertUtil.convertToXmlCalendar(dto.getL53DataSostituz()));}catch(Exception e){singAmb.setL53DataSostituzione(null);}
		singAmb.setL53DescrSistema(dto.getL53DesSistemaInstallaz());
		singAmb.setL53DescrSistemaSost(dto.getL53DesSistemaSostituz());
		singAmb.xsetL53FlagTeleGestioneNO(getXmlBoolean(Constants.FLAG_ASSENTE.equals(dto.getL53FlgTelegestione())));
		singAmb.xsetL53FlagTeleGestioneSI(getXmlBoolean(Constants.FLAG_PRESENTE.equals(dto.getL53FlgTelegestione())));
		singAmb.xsetL53FlagTeleLetturaNO(getXmlBoolean(Constants.FLAG_ASSENTE.equals(dto.getL53FlgTelelettura())));
		singAmb.xsetL53FlagTeleLetturaSI(getXmlBoolean(Constants.FLAG_PRESENTE.equals(dto.getL53FlgTelelettura())));
		try{singAmb.setL54DataSostituzione(ConvertUtil.convertToXmlCalendar(dto.getL54DataSostituz()));}catch(Exception e){singAmb.setL54DataSostituzione(null);}
		singAmb.setL54DescrSistema(dto.getL54DesSistemaInstallaz());
		singAmb.setL54DescrSistemaSost(dto.getL54DesSistemaSostituz());
		singAmb.xsetL54FlagACS(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL54FlgAcs())));
		singAmb.xsetL54FlagRaffresc(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL54FlgRaff())));
		singAmb.xsetL54FlagRiscald(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL54FlgRisc())));
		singAmb.xsetL54FlagSistemaDiretto(getXmlBoolean(Constants.FLG_5_4_TIPOLOGIA_DIRETTO.equals(dto.getL54FlgTipologia())));
		singAmb.xsetL54FlagSistemaIndiretto(getXmlBoolean(Constants.FLG_5_4_TIPOLOGIA_INDIRETTO.equals(dto.getL54FlgTipologia())));
		
		if (GenericUtil.isNotNullOrEmpty(dto.getL54FlgUic()))
		{
			singAmb.xsetL54FlagUIcontabilizzNO(getXmlBoolean(!ConvertUtil.convertToBooleanAllways(dto.getL54FlgUic())));
			singAmb.xsetL54FlagUIcontabilizzSI(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL54FlgUic())));
		}
	}
	
	public static void mapToSchedaSR(SezSR sezSR, List<SigitVCompSrDto> srList) {
		log.debug("mapToSchedaSR: START");
		BigDecimal progressivo = null;
		List<RowSR> listSr = new ArrayList<RowSR>();
		RowSR sr = null;
		List<RowSRsost> listSost = new ArrayList<RowSRsost>();
		if(srList.size()>0)
			progressivo = srList.get(0).getProgressivo();
		log.debug("mapping scheda SR");
		int numInProgr = 1;
		for (int i=0; i<srList.size();i++) {
			log.debug("i="+i +", posInProgr = " + numInProgr);
			SigitVCompSrDto dto = srList.get(i);
			log.debug("SR: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo sr sostituite "+listSost.size());
					sr.addNewSezSRsostituite();
					sr.getSezSRsostituite().getRowSRsostList().addAll(listSost);
				}
				listSr.add(sr);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowSRsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("SR principale");
				sr = mapToRowSR(dto);
			}
			else
			{
				log.debug("SR sost");
				//sost
				listSost.add(mapToRowSRSost(dto));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo SR sostituite "+listSost.size());
			sr.addNewSezSRsostituite();
			sr.getSezSRsostituite().getRowSRsostList().addAll(listSost);
		}
		listSr.add(sr);
		sezSR.getRowSRList().addAll(listSr);
		log.debug("mapToSchedaSR: END");
	}
	
	private static RowSR mapToRowSR(SigitVCompSrDto dto) {
		RowSR row = RowSR.Factory.newInstance();
		row.setL51DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		row.setL51DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		row.setL51Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		row.setL51Modello(dto.getModello());
		row.setL51NumLivTemp(ConvertUtil.convertToBigInteger(dto.getNumLivTemp()));
		row.setL51NumPuntiReg(ConvertUtil.convertToBigInteger(dto.getNumPtiRegolazione()));
		row.setL51NumSR(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		row.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return row;
	}

	private static RowSRsost mapToRowSRSost(SigitVCompSrDto dto) {
		RowSRsost row = RowSRsost.Factory.newInstance();
		row.setL51DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		row.setL51DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		row.setL51Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		row.setL51Modello(dto.getModello());
		row.setL51NumLivTemp(ConvertUtil.convertToBigInteger(dto.getNumLivTemp()));
		row.setL51NumPuntiReg(ConvertUtil.convertToBigInteger(dto.getNumPtiRegolazione()));
		return row;
	}
	
	public static void mapToSchedaSistemiDistribuiti(DatiSchedaSistemiDistrib dist, SigitTCompXSempliceDto dto) {
		dist.setL61DescrAltro(dto.getL61Altro());
		dist.xsetL61FlagAltro(getXmlBoolean(GenericUtil.isNotNullOrEmpty(dto.getL61Altro())));
		dist.xsetL61FlagCanaliAria(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL61FlgCan())));
		dist.xsetL61FlagOrizzontale(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL61FlgOrizzontale())));
		dist.xsetL61FlagVerticale(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL61FlgVerticale())));
		dist.xsetL62FlagCoibentSI(getXmlBoolean(Constants.FLAG_PRESENTE.equals(dto.getL62FlgCoibent())));
		dist.xsetL62FlagCoibentNO(getXmlBoolean(Constants.FLAG_ASSENTE.equals(dto.getL62FlgCoibent())));
		dist.setL62Note(dto.getL62Note());
	}

	public static void mapToSchedaVR(SezVR sezVR, List<SigitVCompVrDto> vrList) {
		log.debug("mapToSchedaVR: START");
		BigDecimal progressivo = null;
		List<RowVR> listVr = new ArrayList<RowVR>();
		RowVR vr = null;
		List<RowVRsost> listSost = new ArrayList<RowVRsost>();
		if(vrList.size()>0)
			progressivo = vrList.get(0).getProgressivo();
		log.debug("mapping scheda VR");
		int numInProgr = 1;
		for (int i=0; i<vrList.size();i++) {
			log.debug("i="+i +", posInProgr = " + numInProgr);
			SigitVCompVrDto dto = vrList.get(i);
			log.debug("VR: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo sr sostituite "+listSost.size());
					vr.addNewSezVRsostituite();
					vr.getSezVRsostituite().getRowVRsostList().addAll(listSost);
				}
				listVr.add(vr);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowVRsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("VR principale");
				vr = mapToRowVR(dto);
			}
			else
			{
				log.debug("VR sost");
				//sost
				listSost.add(mapToRowVRSost(dto));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo VR sostituite "+listSost.size());
			vr.addNewSezVRsostituite();
			vr.getSezVRsostituite().getRowVRsostList().addAll(listSost);
		}
		listVr.add(vr);
		sezVR.getRowVRList().addAll(listVr);
		log.debug("mapToSchedaVR: END");
	}
	
	public static RowVR mapToRowVR(SigitVCompVrDto dto){
		RowVR row = RowVR.Factory.newInstance();
		row.setL51DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		row.setL51DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		row.setL51Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		row.setL51Modello(dto.getModello());
		row.setL51NumVie(ConvertUtil.convertToBigInteger(dto.getNumVie()));
		row.setL51Servomotore(dto.getServomotore());
		row.setL51NumVR(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		row.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return row;
	}

	public static RowVRsost mapToRowVRSost(SigitVCompVrDto dto){
		RowVRsost row = RowVRsost.Factory.newInstance();
		row.setL51DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		row.setL51DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		row.setL51Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		row.setL51Modello(dto.getModello());
		row.setL51NumVie(ConvertUtil.convertToBigInteger(dto.getNumVie()));
		row.setL51Servomotore(dto.getServomotore());
		return row;
	}
	
	public static void mapToSchedaVX(SezVasi sezVX, List<SigitTCompVxDto> vxList) {
		List<RowVasi> listVx = new ArrayList<RowVasi>();
		for (SigitTCompVxDto dto : vxList) {
			RowVasi rv = RowVasi.Factory.newInstance();
			rv.setL63Capacita(dto.getCapacitaL());
			rv.setL63Codice(ConvertUtil.convertToBigDecimal(dto.getProgressivo()));
			rv.setL63Pressione(ConvertUtil.convertToBigDecimal(dto.getPressioneBar()));
			rv.xsetL63VasoAperto(getXmlBoolean(Constants.FLAG_VASO_APERTO.equals(dto.getFlgVaso())));
			rv.xsetL63VasoChiuso(getXmlBoolean(Constants.FLAG_VASO_CHIUSO.equals(dto.getFlgVaso())));
			listVx.add(rv);
		}
		sezVX.setRowVasiArray(listVx.toArray(new RowVasi[] {}));
	}
	
	public static void mapToSchedaPO(SezPO sezPO, List<SigitVCompPoDto> poList) {
		log.debug("mapToSchedaPO: START");
		BigDecimal progressivo = null;
		List<RowPO> listPo = new ArrayList<RowPO>();
		RowPO po = null;
		List<RowPOsost> listSost = new ArrayList<RowPOsost>();
		if(poList.size()>0)
			progressivo = poList.get(0).getProgressivo();
		log.debug("mapping scheda PO");
		int numInProgr = 1;
		for (int i=0; i<poList.size();i++) {
			log.debug("i="+i +", posInProgr = " + numInProgr);
			SigitVCompPoDto dto = poList.get(i);
			log.debug("PO: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo PO sostituite "+listSost.size());
					po.addNewSezPOsostituite().getRowPOsostList().addAll(listSost);
				}
				listPo.add(po);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowPOsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("PO principale");
				po = mapToRowPO(dto);
			}
			else
			{
				log.debug("PO sost");
				//sost
				listSost.add(mapToRowPOSost(dto));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo PO sostituite "+listSost.size());
			po.addNewSezPOsostituite();
			po.getSezPOsostituite().getRowPOsostList().addAll(listSost);
		}
		listPo.add(po);
		sezPO.getRowPOList().addAll(listPo);
		log.debug("mapToSchedaPO: END");
	}
	
	private static RowPO mapToRowPO(SigitVCompPoDto dto) {
		RowPO po = RowPO.Factory.newInstance();
		po.setL64DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		po.setL64DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		po.setL64Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		po.xsetL64GiriVarNO(getXmlBoolean(dto.getFlgGiriVariabili()!=null && Constants.NO_0 == dto.getFlgGiriVariabili().intValue()));
		po.xsetL64GiriVarSI(getXmlBoolean(dto.getFlgGiriVariabili()!=null && Constants.SI_1 == dto.getFlgGiriVariabili().intValue()));
		po.setL64Modello(dto.getModello());
		po.setL64NumPO(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		po.setL64PotNominale(dto.getPotNominaleKw());
		po.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return po;
	}
	
	private static RowPOsost mapToRowPOSost(SigitVCompPoDto dto) {
		RowPOsost po = RowPOsost.Factory.newInstance();
		po.setL64DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		po.setL64DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		po.setL64Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		po.xsetL64GiriVarNO(getXmlBoolean(dto.getFlgGiriVariabili()!=null && Constants.NO_0 == dto.getFlgGiriVariabili().intValue()));
		po.xsetL64GiriVarSI(getXmlBoolean(dto.getFlgGiriVariabili()!=null && Constants.SI_1 == dto.getFlgGiriVariabili().intValue()));
		po.setL64Modello(dto.getModello());
		po.setL64PotNominale(dto.getPotNominaleKw());
		return po;
	}
	
	public static void mapToSchedaSistemiEmissione(DatiSchedaSistemaEmissione em, SigitTCompXSempliceDto dto) {
		em.setL7DescrAltro(dto.getL70Altro());
		em.xsetL7FlagAltro(getXmlBoolean(GenericUtil.isNotNullOrEmpty(dto.getL70Altro())));
		em.xsetL7FlagBocchette(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL70FlgBocchette())));
		em.xsetL7FlagPannelRadianti(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL70FlgPannelli())));
		em.xsetL7FlagRadiatori(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL70FlgRadiatori())));
		em.xsetL7FlagStrisce(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL70FlgStrisce())));
		em.xsetL7FlagTermoConvett(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL70FlgTermoconvettori())));
		em.xsetL7FlagTravi(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL70FlgTravi())));
		em.xsetL7FlagVentilConvett(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getL70FlgVentilconvettori())));
	}
	
	public static void mapToSchedaAC(SezAC sezAC, List<SigitVCompAcDto> acList) {
		log.debug("mapToSchedaAc: START");
		BigDecimal progressivo = null;
		List<RowAC> listPo = new ArrayList<RowAC>();
		RowAC ac = null;
		List<RowACsost> listSost = new ArrayList<RowACsost>();
		if(acList.size()>0)
			progressivo = acList.get(0).getProgressivo();
		log.debug("mapping scheda AC");
		int numInProgr = 1;
		for (int i=0; i<acList.size();i++) {
			log.debug("i="+i +", posInProgr = " + numInProgr);
			SigitVCompAcDto dto = acList.get(i);
			log.debug("AC: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo AC sostituite "+listSost.size());
					ac.addNewSezACsostituite().getRowACsostList().addAll(listSost);
				}
				listPo.add(ac);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowACsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("AC principale");
				ac = mapToRowAC(dto);
			}
			else
			{
				log.debug("AC sost");
				listSost.add(mapToRowACSost(dto));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo AC sostituite "+listSost.size());
			ac.addNewSezACsostituite();
			ac.getSezACsostituite().getRowACsostList().addAll(listSost);
		}
		listPo.add(ac);
		sezAC.getRowACList().addAll(listPo);
		log.debug("mapToSchedaAC: END");		
	}

	private static RowAC mapToRowAC(SigitVCompAcDto dto) {
		RowAC ac = RowAC.Factory.newInstance();
		ac.setL81Capacita(dto.getCapacita());
		ac.setL81DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		ac.setL81DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		ac.setL81Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		ac.xsetL81FlagACS(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgAcs())));
		ac.xsetL81FlagRaffresc(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgRaff())));
		ac.xsetL81FlagRiscald(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgRisc())));
		ac.xsetL81FlagCoibentNO(getXmlBoolean(Constants.FLAG_ASSENTE.equals(dto.getFlgCoib())));
		ac.xsetL81FlagCoibentSI(getXmlBoolean(Constants.FLAG_PRESENTE.equals(dto.getFlgCoib())));
		ac.setL81Matricola(dto.getMatricola());
		ac.setL81Modello(dto.getModello());
		ac.setL81NumAC(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		ac.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return ac;
	}

	private static RowACsost mapToRowACSost(SigitVCompAcDto dto) {
		RowACsost ac = RowACsost.Factory.newInstance();
		ac.setL81Capacita(dto.getCapacita());
		ac.setL81DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		ac.setL81DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		ac.setL81Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		ac.xsetL81FlagACS(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgAcs())));
		ac.xsetL81FlagRaffresc(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgRaff())));
		ac.xsetL81FlagRiscald(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgRisc())));
		ac.xsetL81FlagCoibentNO(getXmlBoolean(Constants.FLAG_ASSENTE.equals(dto.getFlgCoib())));
		ac.xsetL81FlagCoibentSI(getXmlBoolean(Constants.FLAG_PRESENTE.equals(dto.getFlgCoib())));
		ac.setL81Matricola(dto.getMatricola());
		ac.setL81Modello(dto.getModello());
		return ac;
	}
	
	public static void mapToSchedaTE(SezTE sezTE, List<SigitVCompTeDto> teList) {
		log.debug("mapToSchedaTE: START");
		BigDecimal progressivo = null;
		List<RowTE> listTe = new ArrayList<RowTE>();
		RowTE ac = null;
		List<RowTEsost> listSost = new ArrayList<RowTEsost>();
		if(teList.size()>0)
			progressivo = teList.get(0).getProgressivo();
		log.debug("mapping scheda TE");
		int numInProgr = 1;
		for (int i=0; i<teList.size();i++) {
			log.debug("i="+i +", posInProgr = " + numInProgr);
			SigitVCompTeDto dto = teList.get(i);
			log.debug("TE: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo TE sostituite "+listSost.size());
					ac.addNewSezTEsostituite().getRowTEsostList().addAll(listSost);
				}
				listTe.add(ac);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowTEsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("TE principale");
				ac = mapToRowTE(dto);
			}
			else
			{
				log.debug("TE sost");
				listSost.add(mapToRowTESost(dto));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo TE sostituite "+listSost.size());
			ac.addNewSezTEsostituite();
			ac.getSezTEsostituite().getRowTEsostList().addAll(listSost);
		}
		listTe.add(ac);
		sezTE.getRowTEList().addAll(listTe);
		log.debug("mapToSchedaTE: END");
	}
	
	private static RowTE mapToRowTE(SigitVCompTeDto dto) {
		RowTE te = RowTE.Factory.newInstance();
		te.setL91Capacita(dto.getCapacitaL());
		te.setL91DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		te.setL91DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		te.setL91Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		te.setL91Matricola(dto.getMatricola());
		te.setL91Modello(dto.getModello());
		te.setL91NumTE(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		te.setL91NumVentilatori(dto.getNumVentilatori());
		te.setL91TipoVentilatori(dto.getTipoVentilatori());
		te.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return te;
	}

	private static RowTEsost mapToRowTESost(SigitVCompTeDto dto) {
		RowTEsost te = RowTEsost.Factory.newInstance();
		te.setL91Capacita(dto.getCapacitaL());
		te.setL91DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		te.setL91DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		te.setL91Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		te.setL91Matricola(dto.getMatricola());
		te.setL91Modello(dto.getModello());
		te.setL91NumVentilatori(dto.getNumVentilatori());
		te.setL91TipoVentilatori(dto.getTipoVentilatori());
		return te;
	}
	
	public static void mapToSchedaRV(SezRV sezRV, List<SigitVCompRvDto> rvList) {
		log.debug("mapToSchedaRV: START");
		BigDecimal progressivo = null;
		List<RowRV> listTe = new ArrayList<RowRV>();
		RowRV ac = null;
		List<RowRVsost> listSost = new ArrayList<RowRVsost>();
		if(rvList.size()>0)
			progressivo = rvList.get(0).getProgressivo();
		log.debug("mapping scheda RV");
		int numInProgr = 1;
		for (int i=0; i<rvList.size();i++) {
			log.debug("i="+i +", posInProgr = " + numInProgr);
			SigitVCompRvDto dto = rvList.get(i);
			log.debug("RV: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo RV sostituite "+listSost.size());
					ac.addNewSezRVsostituite().getRowRVsostList().addAll(listSost);
				}
				listTe.add(ac);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowRVsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("RV principale");
				ac = mapToRowRV(dto);
			}
			else
			{
				log.debug("RV sost");
				listSost.add(mapToRowRVSost(dto));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo RV sostituite "+listSost.size());
			ac.addNewSezRVsostituite();
			ac.getSezRVsostituite().getRowRVsostList().addAll(listSost);
		}
		listTe.add(ac);
		sezRV.getRowRVList().addAll(listTe);
		log.debug("mapToSchedaRV: END");
	}

	private static RowRV mapToRowRV(SigitVCompRvDto dto) {
		RowRV rv = RowRV.Factory.newInstance();
		rv.setL92DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		rv.setL92DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		rv.setL92Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		rv.setL92Matricola(dto.getMatricola());
		rv.setL92Modello(dto.getModello());
		rv.setL92NumRV(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		rv.setL92NumVentilatori(dto.getNumVentilatori());
		rv.setL92TipoVentilatori(dto.getTipoVentilatori());
		rv.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return rv;
	}

	private static RowRVsost mapToRowRVSost(SigitVCompRvDto dto) {
		RowRVsost rv = RowRVsost.Factory.newInstance();
		rv.setL92DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		rv.setL92DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		rv.setL92Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		rv.setL92Matricola(dto.getMatricola());
		rv.setL92Modello(dto.getModello());
		rv.setL92NumVentilatori(dto.getNumVentilatori());
		rv.setL92TipoVentilatori(dto.getTipoVentilatori());
		return rv;
	}

	public static void mapToSchedaSCX(it.csi.sigit.sigitwebn.xml.libretto.data.DatiAltriComponentiSCDocument.DatiAltriComponentiSC.SezSC sezSC,
			List<SigitTCompXDto> scxList) {
		log.debug("mapToSchedaSCX: START");
		BigDecimal progressivo = null;
		List<RowSCcal> listScx = new ArrayList<RowSCcal>();
		RowSCcal ac = null;
		List<RowSCcalsost> listSost = new ArrayList<RowSCcalsost>();
		if(scxList.size()>0)
			progressivo = scxList.get(0).getProgressivo();
		log.debug("mapping scheda SCX");
		int numInProgr = 1;
		for (int i=0; i<scxList.size();i++) {
			log.debug("i="+i +", posInProgr = " + numInProgr);
			SigitTCompXDto dto = scxList.get(i);
			log.debug("SCX: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo SCX sostituite "+listSost.size());
					ac.addNewSezSCsostituite().getRowSCcalsostList().addAll(listSost);
				}
				listScx.add(ac);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowSCcalsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("SCX principale");
				ac = mapToRowSCX(dto);
			}
			else
			{
				log.debug("SCX sost");
				listSost.add(mapToRowSCXSost(dto));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo SCX sostituite "+listSost.size());
			ac.addNewSezSCsostituite();
			ac.getSezSCsostituite().getRowSCcalsostList().addAll(listSost);
		}
		listScx.add(ac);
		sezSC.getRowSCcalList().addAll(listScx);
		log.debug("mapToSchedaSCX: END");
	}
	
	private static RowSCcal mapToRowSCX(SigitTCompXDto dto) {
		RowSCcal sc = RowSCcal.Factory.newInstance();
		sc.setL93NumSC(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		sc.setL93DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		sc.setL93DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		sc.setL93Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		sc.setL93Modello(dto.getModello());
		sc.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return sc;
	}

	private static RowSCcalsost mapToRowSCXSost(SigitTCompXDto dto) {
		RowSCcalsost sc = RowSCcalsost.Factory.newInstance();
		sc.setL93DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		sc.setL93DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		sc.setL93Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		sc.setL93Modello(dto.getModello());
		return sc;
	}
	
	public static void mapToSchedaCI(SezCI sez, List<SigitVCompCiDto> list) {
		log.debug("mapToSchedaCI: START");
		BigDecimal progressivo = null;
		List<RowCI> listCi = new ArrayList<RowCI>();
		RowCI ac = null;
		List<RowCIsost> listSost = new ArrayList<RowCIsost>();
		if(list.size()>0)
			progressivo = list.get(0).getProgressivo();
		log.debug("mapping scheda CI");
		int numInProgr = 1;
		for (int i=0; i<list.size();i++) {
			log.debug("i="+i +", posInProgr = " + numInProgr);
			SigitVCompCiDto dto = list.get(i);
			log.debug("CI: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo CI sostituite "+listSost.size());
					ac.addNewSezCIsostituite().getRowCIsostList().addAll(listSost);
				}
				listCi.add(ac);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowCIsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("CI principale");
				ac = mapToRowCI(dto);
			}
			else
			{
				log.debug("CI sost");
				listSost.add(mapToRowCISost(dto));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo CI sostituite "+listSost.size());
			ac.addNewSezCIsostituite().getRowCIsostList().addAll(listSost);
		}
		listCi.add(ac);
		sez.getRowCIList().addAll(listCi);
		log.debug("mapToSchedaCI: END");
	}

	private static RowCI mapToRowCI(SigitVCompCiDto dto) {
		RowCI ci = RowCI.Factory.newInstance();
		ci.setL94NumCI(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		ci.setL94DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		ci.setL94DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		ci.setL94LungCircuito(dto.getLunghezzaCircM());
		ci.setL94ProfInstallaz(dto.getProfInstallM());
		ci.setL94SuperfScamb(dto.getSuperfScambM2());
		ci.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return ci;
	}

	private static RowCIsost mapToRowCISost(SigitVCompCiDto dto) {
		RowCIsost ci = RowCIsost.Factory.newInstance();
		ci.setL94DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		ci.setL94DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		ci.setL94LungCircuito(dto.getLunghezzaCircM());
		ci.setL94ProfInstallaz(dto.getProfInstallM());
		ci.setL94SuperfScamb(dto.getSuperfScambM2());
		return ci;
	}

	public static void mapToSchedaUT(SezUT sez, List<SigitVCompUtDto> list) {
		log.debug("mapToSchedaUT: START");
		BigDecimal progressivo = null;
		List<RowUT> listUT = new ArrayList<RowUT>();
		RowUT ac = null;
		List<RowUTsost> listSost = new ArrayList<RowUTsost>();
		if(list.size()>0)
			progressivo = list.get(0).getProgressivo();
		log.debug("mapping scheda UT");
		int numInProgr = 1;
		for (int i=0; i<list.size();i++) {
			log.debug("i="+i +", posInProgr = " + numInProgr);
			SigitVCompUtDto dto = list.get(i);
			log.debug("UT: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo UT sostituite "+listSost.size());
					ac.addNewSezUTsostituite().getRowUTsostList().addAll(listSost);
				}
				listUT.add(ac);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowUTsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("UT principale");
				ac = mapToRowUT(dto);
			}
			else
			{
				log.debug("UT sost");
				listSost.add(mapToRowUTSost(dto));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo UT sostituite "+listSost.size());
			ac.addNewSezUTsostituite().getRowUTsostList().addAll(listSost);
		}
		listUT.add(ac);
		sez.getRowUTList().addAll(listUT);
		log.debug("mapToSchedaUT: END");
	}

	private static RowUT mapToRowUT(SigitVCompUtDto dto) {
		RowUT ut = RowUT.Factory.newInstance();
		ut.setL95NumUT(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		ut.setL95DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		ut.setL95DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		ut.setL95Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		ut.setL95Matricola(dto.getMatricola());
		ut.setL95Modello(dto.getModello());
		ut.setL95PortataVentMandata(dto.getPortataMandataLs());
		ut.setL95PortataVentRipresa(dto.getPortataRipresaLs());
		ut.setL95PotenzaVentMandata(dto.getPotenzaMandataKw());
		ut.setL95PotenzaVentRipresa(dto.getPotenzaRipresaKw());
		ut.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return ut;
	}

	private static RowUTsost mapToRowUTSost(SigitVCompUtDto dto) {
		RowUTsost ut = RowUTsost.Factory.newInstance();
		ut.setL95DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		ut.setL95DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		ut.setL95Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		ut.setL95Matricola(dto.getMatricola());
		ut.setL95Modello(dto.getModello());
		ut.setL95PortataVentMandata(dto.getPortataMandataLs());
		ut.setL95PortataVentRipresa(dto.getPortataRipresaLs());
		ut.setL95PotenzaVentMandata(dto.getPotenzaMandataKw());
		ut.setL95PotenzaVentRipresa(dto.getPotenzaRipresaKw());
		return ut;
	}
	
	public static void mapToSchedaRC(it.csi.sigit.sigitwebn.xml.libretto.data.DatiAltriComponentiRCDocument.DatiAltriComponentiRC.SezRC sez,
			List<SigitVCompRcDto> list) {
		log.debug("mapToSchedaRC: START");
		BigDecimal progressivo = null;
		List<RowRCcal> listRC = new ArrayList<RowRCcal>();
		RowRCcal ac = null;
		List<RowRCcalsost> listSost = new ArrayList<RowRCcalsost>();
		if(list.size()>0)
			progressivo = list.get(0).getProgressivo();
		log.debug("mapping scheda RC");
		int numInProgr = 1;
		for (int i=0; i<list.size();i++) {
			log.debug("i="+i +", posInProgr = " + numInProgr);
			SigitVCompRcDto dto = list.get(i);
			log.debug("RC: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo RC sostituite "+listSost.size());
					ac.addNewSezRCsostituite().getRowRCcalsostList().addAll(listSost);
				}
				listRC.add(ac);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowRCcalsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("RC principale");
				ac = mapToRowRCX(dto);
			}
			else
			{
				log.debug("RC sost");
				listSost.add(mapToRowRCXSost(dto));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo RC sostituite "+listSost.size());
			ac.addNewSezRCsostituite().getRowRCcalsostList().addAll(listSost);
		}
		listRC.add(ac);
		sez.getRowRCcalList().addAll(listRC);
		log.debug("mapToSchedaRC: END");
	}

	private static RowRCcal mapToRowRCX(SigitVCompRcDto dto) {
		RowRCcal rc = RowRCcal.Factory.newInstance();
		rc.setL96NumRC(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		rc.setL96DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		rc.setL96DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		rc.setL96PortataVentMandata(dto.getPortataMandataLs());
		rc.setL96PortataVentRipresa(dto.getPortataRipresaLs());
		rc.setL96PotenzaVentMandata(dto.getPotenzaMandataKw());
		rc.setL96PotenzaVentRipresa(dto.getPotenzaRipresaKw());
		rc.setL96Tipologia(dto.getTipologia());
		rc.xsetL96FlagIndipendente(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgIndipendente())));
		rc.xsetL96FlagInstallato(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgInstallato())));
		rc.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return rc;
	}

	private static RowRCcalsost mapToRowRCXSost(SigitVCompRcDto dto) {
		RowRCcalsost rc = RowRCcalsost.Factory.newInstance();
		rc.setL96DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		rc.setL96DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		rc.setL96PortataVentMandata(dto.getPortataMandataLs());
		rc.setL96PortataVentRipresa(dto.getPortataRipresaLs());
		rc.setL96PotenzaVentMandata(dto.getPotenzaMandataKw());
		rc.setL96PotenzaVentRipresa(dto.getPotenzaRipresaKw());
		rc.setL96Tipologia(dto.getTipologia());
		rc.xsetL96FlagIndipendente(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgIndipendente())));
		rc.xsetL96FlagInstallato(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgInstallato())));
		return rc;
	}
	
	public static void mapToSchedaVM(SezVM sez, List<SigitVCompVmDto> list) {
		log.debug("mapToSchedaVM: START");
		BigDecimal progressivo = null;
		List<RowVM> listVM = new ArrayList<RowVM>();
		RowVM ac = null;
		List<RowVMsost> listSost = new ArrayList<RowVMsost>();
		if(list.size()>0)
			progressivo = list.get(0).getProgressivo();
		log.debug("mapping scheda VM");
		int numInProgr = 1;
		for (int i=0; i<list.size();i++) {
			log.debug("i="+i +", posInProgr = " + numInProgr);
			SigitVCompVmDto dto = list.get(i);
			log.debug("VM: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall());
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!listSost.isEmpty())
				{
					log.debug("aggiungo VM sostituite "+listSost.size());
					ac.addNewSezVMsostituite().getRowVMsostList().addAll(listSost);
				}
				listVM.add(ac);
				progressivo = dto.getProgressivo();
				listSost= new ArrayList<RowVMsost>();
				numInProgr = 1;
			}
			if(numInProgr++ == 1)
			{
				log.debug("VM principale");
				ac = mapToRowVM(dto);
			}
			else
			{
				log.debug("VM sost");
				listSost.add(mapToRowVMSost(dto));
			}
		}
		if(!listSost.isEmpty())
		{
			log.debug("aggiungo VM sostituite "+listSost.size());
			ac.addNewSezVMsostituite().getRowVMsostList().addAll(listSost);
		}
		listVM.add(ac);
		sez.getRowVMList().addAll(listVM);
		log.debug("mapToSchedaVM: END");
	}

	private static RowVM mapToRowVM(SigitVCompVmDto dto) {
		RowVM vm = RowVM.Factory.newInstance();
		vm.setL101NumVM(ConvertUtil.convertToBigInteger(dto.getProgressivo()));
		vm.setL101DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		vm.setL101DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		vm.setL101Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		vm.setL101Modello(dto.getModello());
		vm.setL101DescrAltro(dto.getAltroTipologia());
		vm.xsetL101FlagAltro(getXmlBoolean(GenericUtil.isNotNullOrEmpty(dto.getAltroTipologia())));
		vm.xsetL101FlagSolaEstraz(getXmlBoolean(new BigDecimal("1").equals(dto.getFkDettaglioVm())));
		vm.xsetL101FlagFlussoIncrociato(getXmlBoolean(new BigDecimal("2").equals(dto.getFkDettaglioVm())));
		vm.xsetL101FlagFlussoTermoDinamico(getXmlBoolean(new BigDecimal("3").equals(dto.getFkDettaglioVm())));
		vm.setL101MaxPortataAria(dto.getPortataMaxAriaM3h());
		vm.setL101RendimentoRecupero(ConvertUtil.convertToBigDecimal(dto.getRendimentoCop()));
		vm.xsetFlagDismissione(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgDismissione())));
		return vm;
	}

	private static RowVMsost mapToRowVMSost(SigitVCompVmDto dto) {
		RowVMsost vm = RowVMsost.Factory.newInstance();
		vm.setL101DataInstallaz(ConvertUtil.convertToXmlCalendar(dto.getDataInstall()));
		vm.setL101DataDismiss(ConvertUtil.convertToXmlCalendar(dto.getDataDismiss()));
		vm.setL101Fabbricante(ConvertUtil.convertToString(dto.getFkMarca()));
		vm.setL101Modello(dto.getModello());
		vm.setL101DescrAltro(dto.getAltroTipologia());
		vm.xsetL101FlagAltro(getXmlBoolean(GenericUtil.isNotNullOrEmpty(dto.getAltroTipologia())));
		vm.xsetL101FlagSolaEstraz(getXmlBoolean(new BigDecimal("1").equals(dto.getFkDettaglioVm())));
		vm.xsetL101FlagFlussoIncrociato(getXmlBoolean(new BigDecimal("2").equals(dto.getFkDettaglioVm())));
		vm.xsetL101FlagFlussoTermoDinamico(getXmlBoolean(new BigDecimal("3").equals(dto.getFkDettaglioVm())));
		vm.setL101MaxPortataAria(dto.getPortataMaxAriaM3h());
		vm.setL101RendimentoRecupero(ConvertUtil.convertToBigDecimal(dto.getRendimentoCop()));
		return vm;
	}
	
	public static void mapToDatiRisultatiGT(it.csi.sigit.sigitwebn.xml.libretto.data.DatiRisultatiGTDocument.DatiRisultatiGT.SezGruppiTermici sezGT, List<SigitVCompGtDettDto> compGtImpiantoDett) {
		log.debug("mapToDatiRisultatiGT: START");
		if(compGtImpiantoDett == null) return;
		//it.csi.sigit.sigitwebn.xml.libretto.data.DatiRisultatiGTDocument.DatiRisultatiGT.SezGruppiTermici sezGT = datiRisultatiGT.addNewSezGruppiTermici();
		BigDecimal progressivo = null;
		Date lastDataControllo = null;
		List<L111RowGT> listGt = new ArrayList<L111RowGT>();
		L111RowGT gt = L111RowGT.Factory.newInstance();
		gt.addNewSezDateGT();
		if(compGtImpiantoDett.size()>0)
			progressivo = compGtImpiantoDett.get(0).getProgressivo();
		
		
		log.debug("mapping scheda RisultatiGT");
		RowNumModuliGT modulo;
		RowDateGT rowDateGT = RowDateGT.Factory.newInstance();
		rowDateGT.addNewSezNumeroModuliGT();
		
		
		for (int i=0; i<compGtImpiantoDett.size();i++) {
			log.debug("i="+i+ ", progressivo: " + progressivo);
			SigitVCompGtDettDto dto = compGtImpiantoDett.get(i);
			java.sql.Date dataControllo = dto.getDataControllo();
			
			log.debug("GT: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall()+"," +
					" data controllo: " + dataControllo);
			
			//le componenti non controllate, non si riportano
			if(dataControllo==null)
			{
				log.debug("senza data controllo");
				continue;
			}
			
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!rowDateGT.getSezNumeroModuliGT().getRowNumModuliGTList().isEmpty())
				{//se non ci sono dati, non aggiungo la lista vuota
					//gt.setL111NumGT(ConvertUtil.convertToBigInteger(progressivo));
					gt.getSezDateGT().getRowDateGTList().add(rowDateGT);
					listGt.add(gt);
				}
				rowDateGT = RowDateGT.Factory.newInstance();
				rowDateGT.addNewSezNumeroModuliGT();
				progressivo = dto.getProgressivo();
				
				
				
				gt = L111RowGT.Factory.newInstance();
				gt.addNewSezDateGT();
			}
			else if(lastDataControllo!=null && lastDataControllo.compareTo(dataControllo)!=0)
			{
				log.debug("cambio data controllo");
				//altra data controllo
				gt.getSezDateGT().getRowDateGTList().add(rowDateGT);
				rowDateGT = RowDateGT.Factory.newInstance();
				rowDateGT.addNewSezNumeroModuliGT();
			}
			log.debug("GT attivo");
			modulo = mapToRowNumModuliGT(dto);
			rowDateGT.getSezNumeroModuliGT().getRowNumModuliGTList().add(modulo);
			rowDateGT.setL111NumGT(ConvertUtil.convertToBigInteger(progressivo));
			
			// Beppe parte modificata
			if(GenericUtil.isNotNullOrEmpty(dto.getL111AltroRiferimento()))
			{
				rowDateGT.setL111DescrAltro(dto.getL111AltroRiferimento());
				rowDateGT.xsetL111FlagAltro(MapDto.getXmlBoolean(true));
			}

			rowDateGT.xsetL111FlagNorma(MapDto.getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getEFlgUni103891())));
			
			rowDateGT.setL111Data(ConvertUtil.convertToXmlCalendar(dataControllo));
			
			lastDataControllo = dataControllo;
		}
		gt.getSezDateGT().getRowDateGTList().add(rowDateGT);
		listGt.add(gt);
		sezGT.getL111RowGTList().addAll(listGt);
		
		log.debug("mapToDatiRisultatiGT: END");
	}
	
	private static RowNumModuliGT mapToRowNumModuliGT(SigitVCompGtDettDto dto) {
		RowNumModuliGT modulo = RowNumModuliGT.Factory.newInstance();
		
		modulo.setL111CO(dto.getL111CoNoAriaPpm());
		modulo.setL111COsenzaAria(dto.getECoCorrettoPpm());
		
		modulo.setL111CO2(dto.getECo2Perc());
		
		
		if (GenericUtil.isNullOrEmpty(dto.getNumeroRea()) && dto.getFkRuolo().intValue() == Constants.ID_RUOLO_ISPETTORE)
		{
			modulo.setL111Firma(Constants.DESC_ISPEZIONE);
		}
		else
		{
			modulo.setL111Firma(getCodiceRea(dto.getSiglaRea(), ConvertUtil.convertToInteger(dto.getNumeroRea())));
		}
		
		
		if(dto.getL111FlgCoMin1000() != null)
		{
			if(!ConvertUtil.convertToBooleanAllways(dto.getL111FlgCoMin1000()))
				modulo.xsetL111FlagfumiSecchiNO(getXmlBoolean(true));
			else
				modulo.xsetL111FlagfumiSecchiSI(getXmlBoolean(true));
		}
		
		/*
		if(dto.getL111CoNoAriaPpm()!=null)
		{
			if(dto.getL111CoNoAriaPpm().compareTo(new BigDecimal("1000"))>0)
				modulo.xsetL111FlagfumiSecchiNO(getXmlBoolean(true));
			else
				modulo.xsetL111FlagfumiSecchiSI(getXmlBoolean(true));
		}
		*/
		
		if(dto.getL111FlgRispettaBacharach()!=null)
		{
			if(!ConvertUtil.convertToBooleanAllways(dto.getL111FlgRispettaBacharach()))
				modulo.xsetL111FlagIndBachNO(getXmlBoolean(true));
			else
				modulo.xsetL111FlagIndBachSI(getXmlBoolean(true));
		}
		
		if(dto.getL111FlgRendMagRendMin()!=null)
		{
			if(!ConvertUtil.convertToBooleanAllways(dto.getL111FlgRendMagRendMin()))
				modulo.xsetL111FlagMinimoNO(getXmlBoolean(true));
			else
				modulo.xsetL111FlagMinimoSI(getXmlBoolean(true));
		}
		
		modulo.setL111IndBacharach1(dto.getEBacharachMin());
		modulo.setL111IndBacharach2(dto.getEBacharachMed());
		modulo.setL111IndBacharach3(dto.getEBacharachMax());
		
		String nox = "";
		if (GenericUtil.isNotNullOrEmpty(dto.getENoxPpm()) || 
				GenericUtil.isNotNullOrEmpty(dto.getENoxMgKwh()))
		{
			if (GenericUtil.isNotNullOrEmpty(dto.getENoxPpm()))
			{
				nox = ConvertUtil.convertToString(dto.getENoxPpm()) + " " + Constants.NOX_PPM;
			}
			else if (GenericUtil.isNotNullOrEmpty(dto.getENoxMgKwh()))
			{
				nox = ConvertUtil.convertToString(dto.getENoxMgKwh()) + " " + Constants.NOX_MG_KWH;
			}
		}
		modulo.setL111Nox(nox);
		
		
		modulo.setL111NumModulo(ConvertUtil.convertToString(dto.getENModuloTermico()));
		modulo.setL111O2(dto.getEO2Perc());
		modulo.setL111PercMinimoLegge(dto.getERendMinLeggePerc());
		if(dto.getL111PortataCombustibile()!=null)
			modulo.setL111PortataCombu(ConvertUtil.convertToString(dto.getL111PortataCombustibile()) + " "+ dto.getL111PortataCombustibileUm());
		modulo.setL111PortataTermEff(dto.getEPotTermFocolKw());
		modulo.setL111RendimentoCombu(dto.getERendCombPerc());
		modulo.setL111TempAriaComb(dto.getETempAriaC());
		modulo.setL111TempFumi(dto.getETempFumiC());
		return modulo;
	}
	
	public static void mapToDatiRisultatiGF(SezMacchineFrigo sezGF, List<SigitVCompGfDettDto> compGfImpianto) {
		log.debug("mapToDatiRisultatiGF: START");
		if(compGfImpianto == null || compGfImpianto.isEmpty()) return;
		BigDecimal progressivo = null;
		Date lastDataControllo = null;
		List<L112RowGF> listGf = new ArrayList<L112RowGF>();
		L112RowGF gf = L112RowGF.Factory.newInstance();
		gf.addNewSezDateGF();
		if(compGfImpianto.size()>0)
			progressivo = compGfImpianto.get(0).getProgressivo();
		log.debug("mapping scheda RisultatiGF");
		RowCircuitiGF modulo = RowCircuitiGF.Factory.newInstance();
		RowDateGF rowDateGF = RowDateGF.Factory.newInstance();
		rowDateGF.addNewSezCircuitiGF();
		for (int i=0; i<compGfImpianto.size();i++) {
			log.debug("i="+i+ ", progressivo: " + progressivo);
			SigitVCompGfDettDto dto = compGfImpianto.get(i);
			java.sql.Date dataControllo = dto.getDataControllo();
			
			log.debug("GF: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall()+
					", data controllo: " + dataControllo);
			
			//le componenti non controllate, non si riportano
			if(dataControllo==null)
			{
				log.debug("senza data controllo");
				continue;
			}
			/*
			//controllo validita' componente in data controllo
			if(!(!dataControllo.before(dto.getDataInstall()) && (dto.getDataDismiss()==null || !dataControllo.after(dto.getDataDismiss()))))
			{
				log.debug("non attiva in data " + dataControllo);
				continue;
			}
			*/
			
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				if(!rowDateGF.getSezCircuitiGF().getRowCircuitiGFList().isEmpty())
				{//se non ci sono dati, non aggiungo la lista vuota
					//gf.setL112NumGF(ConvertUtil.convertToBigInteger(progressivo));
					gf.getSezDateGF().getRowDateGFList().add(rowDateGF);
					listGf.add(gf);
				}
				rowDateGF = RowDateGF.Factory.newInstance();
				rowDateGF.addNewSezCircuitiGF();
				progressivo = dto.getProgressivo();
				gf = L112RowGF.Factory.newInstance();
				gf.addNewSezDateGF();
			}
			else if(lastDataControllo!=null && lastDataControllo.compareTo(dataControllo)!=0)
			{
				log.debug("cambio data controllo");
				//altra data controllo
				gf.getSezDateGF().getRowDateGFList().add(rowDateGF);
				rowDateGF = RowDateGF.Factory.newInstance();
				rowDateGF.addNewSezCircuitiGF();
			}
			log.debug("GF attivo");
			modulo = mapToRowNumModuliGF(dto);
			rowDateGF.getSezCircuitiGF().getRowCircuitiGFList().add(modulo);
			rowDateGF.setL112NumGF(ConvertUtil.convertToBigInteger(progressivo));
			rowDateGF.setL112Data(ConvertUtil.convertToXmlCalendar(dataControllo));
			
			lastDataControllo = dataControllo;
		}
		gf.getSezDateGF().getRowDateGFList().add(rowDateGF);
		listGf.add(gf);
		sezGF.getL112RowGFList().addAll(listGf);
		log.debug("mapToDatiRisultatiGF: END");
	}

	private static RowCircuitiGF mapToRowNumModuliGF(SigitVCompGfDettDto dto) {
		RowCircuitiGF row = RowCircuitiGF.Factory.newInstance();
		row.setL112BulboUmido(dto.getL112TorreTBulboUmido());
		row.setL112Condens(dto.getETCondensazioneC());
		row.setL112DataRispristino(ConvertUtil.convertDateToXmlCalendar(dto.getL112DataRipristino()));
		row.setL112Evaporaz(dto.getETEvaporazioneC());
		
		if (GenericUtil.isNullOrEmpty(dto.getNumeroRea()) && dto.getFkRuolo().intValue() == Constants.ID_RUOLO_ISPETTORE)
		{
			row.setL112Firma(Constants.DESC_ISPEZIONE);
		}
		else
		{
			row.setL112Firma(getCodiceRea(dto.getSiglaRea(), ConvertUtil.convertToInteger(dto.getNumeroRea())));
		}
		//row.setL112Firma(getCodiceRea(dto.getSiglaRea(), ConvertUtil.convertToInteger(dto.getNumeroRea())));
		
		//segnalazione 145 libretto_ree
		if(dto.getEFlgPerditaGas()!=null)
		{
			row.xsetL112FlagAssenzaPerditeNO(getXmlBoolean(new BigDecimal(Constants.NO_0).equals(dto.getEFlgPerditaGas())));
			row.xsetL112FlagAssenzaPerditeSI(getXmlBoolean(new BigDecimal(Constants.SI_1).equals(dto.getEFlgPerditaGas())));
		}
		
		if(dto.getL112FlgPuliziaFiltri()!=null)
		{
			if(!ConvertUtil.convertToBooleanAllways(dto.getL112FlgPuliziaFiltri()))
				row.xsetL112FlagFiltriNO(getXmlBoolean(true));
			else
				row.xsetL112FlagFiltriSI(getXmlBoolean(true));
		}
		
		row.xsetL112FlagRaffr(getXmlBoolean(Constants.FLG_RAFFREDDAMENTO.equals(dto.getEFlgModProva())));
		row.xsetL112FlagRisc(getXmlBoolean(Constants.FLG_RISCALDAMENTO.equals(dto.getEFlgModProva())));
		
		if(dto.getL112FlgVerificaSuperata()!=null)
		{
			if(!ConvertUtil.convertToBooleanAllways(dto.getL112FlgVerificaSuperata()))
				row.xsetL112FlagVerificaNO(getXmlBoolean(true));
			else
				row.xsetL112FlagVerificaSI(getXmlBoolean(true));
		}
		
		row.setL112IngressoFluido(dto.getL112ScambiatoreTInExt());
		row.setL112IngressoFluidoMacc(dto.getL112ScambiatTInMacchina());
		row.setL112IngressoUtenze(dto.getETInUtenzeC());
		row.setL112NumCircuito(dto.getENCircuito());
		row.setL112PotAssorbita(dto.getL112PotenzaAssorbitaKw());
		row.setL112SorgenteIngresso(dto.getETInExtC());
		row.setL112SorgenteUscita(dto.getETOutExtC());
		row.setL112Sottoraffr(dto.getETSottorafC());
		row.setL112Surrisc(dto.getETSurriscC());
		row.setL112UscitaFluido(dto.getL112TorreTOutFluido());
		row.setL112UscitaFluidoMacc(dto.getL112ScambiatTOutMacchina());
		row.setL112UscitaFluidoSorg(dto.getL112ScambiatoreTOutExt());
		row.setL112UsciteUtenze(dto.getETOutUtenzeC());
		return row;
	}
	
	public static void mapToDatiRisultatiSC(SezScambiatori sezSC, List<SigitVCompScDettDto> compScImpianto) {
		log.debug("mapToDatiRisultatiSC: START");
		if(compScImpianto == null || compScImpianto.isEmpty()) return;
		BigDecimal progressivo = null;
		List<L113RowSC> listSC = new ArrayList<L113RowSC>();
		L113RowSC sc = L113RowSC.Factory.newInstance();
		sc.addNewSezSC();
		progressivo = compScImpianto.get(0).getProgressivo();
		log.debug("mapping scheda RisultatiSC");
		RowDateSC rowDateSC = RowDateSC.Factory.newInstance();
		for (int i=0; i<compScImpianto.size();i++) {
			log.debug("i="+i+ ", progressivo: " + progressivo);
			SigitVCompScDettDto dto = compScImpianto.get(i);
			java.sql.Date dataControllo = dto.getDataControllo();
			log.debug("SC: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall()+
					", data controllo: " + dataControllo);
			
			//le componenti non controllate, non si riportano
			if(dataControllo==null)
			{
				log.debug("senza data controllo");
				continue;
			}
			
			/*
			//controllo validita' componente in data controllo
			if(!(!dataControllo.before(dto.getDataInstall()) && (dto.getDataDismiss()==null || !dataControllo.after(dto.getDataDismiss()))))
			{
				log.debug("non attiva in data " + dataControllo);
				continue;
			}
			*/
			
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				listSC.add(sc);

				rowDateSC = RowDateSC.Factory.newInstance();
				progressivo = dto.getProgressivo();
				sc = L113RowSC.Factory.newInstance();
				sc.addNewSezSC();
			}
			log.debug("SC attivo");
			rowDateSC = mapToRowDateSC(dto);
			sc.setL113NumSC(ConvertUtil.convertToBigInteger(progressivo));
			rowDateSC.setL113Data(ConvertUtil.convertToXmlCalendar(dataControllo));
			sc.getSezSC().getRowDateSCList().add(rowDateSC);
		}
		listSC.add(sc);
		sezSC.getL113RowSCList().addAll(listSC);
		log.debug("mapToDatiRisultatiSC: END");
	}

	private static RowDateSC mapToRowDateSC(SigitVCompScDettDto dto) {
		RowDateSC row = RowDateSC.Factory.newInstance();
		row.setL113Data(ConvertUtil.convertDateToXmlCalendar(dto.getDataControllo()));
		
		if (GenericUtil.isNullOrEmpty(dto.getNumeroRea()) && dto.getFkRuolo().intValue() == Constants.ID_RUOLO_ISPETTORE)
		{
			row.setL113Firma(Constants.DESC_ISPEZIONE);
		}
		else
		{
			row.setL113Firma(getCodiceRea(dto.getSiglaRea(), ConvertUtil.convertToInteger(dto.getNumeroRea())));
		}
		//row.setL113Firma(getCodiceRea(dto.getSiglaRea(), ConvertUtil.convertToInteger(dto.getNumeroRea())));
		
		
		if(dto.getEFlgDispFunzionanti()!=null)
		{
			row.xsetL113FlagDispRegNC(getXmlBoolean(new BigDecimal("2").equals(dto.getEFlgDispFunzionanti())));
			row.xsetL113FlagDispRegNO(getXmlBoolean(new BigDecimal(Constants.NO_0).equals(dto.getEFlgDispFunzionanti())));
			row.xsetL113FlagDispRegSI(getXmlBoolean(new BigDecimal(Constants.SI_1).equals(dto.getEFlgDispFunzionanti())));
		}
		if(dto.getEFlgPotenzaCompatibile()!=null)
		{
			row.xsetL113FlagPotCompatibNC(getXmlBoolean(new BigDecimal("2").equals(dto.getEFlgPotenzaCompatibile())));
			row.xsetL113FlagPotCompatibNO(getXmlBoolean(new BigDecimal(Constants.NO_0).equals(dto.getEFlgPotenzaCompatibile())));
			row.xsetL113FlagPotCompatibSI(getXmlBoolean(new BigDecimal(Constants.SI_1).equals(dto.getEFlgPotenzaCompatibile())));
		}
		if(dto.getEFlgCoibIdonea()!=null)
		{
			row.xsetL113FlagStatoCoibNC(getXmlBoolean(new BigDecimal("2").equals(dto.getEFlgCoibIdonea())));
			row.xsetL113FlagStatoCoibNO(getXmlBoolean(new BigDecimal(Constants.NO_0).equals(dto.getEFlgCoibIdonea())));
			row.xsetL113FlagStatoCoibSI(getXmlBoolean(new BigDecimal(Constants.SI_1).equals(dto.getEFlgCoibIdonea())));
		}
		row.setL113PortataFluidoPrim(dto.getEPortFluidoM3H());
		row.setL113PotTermica(dto.getEPotenzaTermKw());
		row.setL113TempEsterna(dto.getETempExtC());
		row.setL113TempMandPrimario(dto.getETempMandPrimarioC());
		row.setL113TempMandSecond(dto.getETempMandSecondarioC());
		row.setL113TempRitPrimario(dto.getETempRitorPrimarioC());
		row.setL113TempRitSecond(dto.getETempRitSecondarioC());
		return row;
	}
	
	public static void mapToDatiRisultatiCG(SezCogen sezCG, List<SigitVCompCgDettDto> compCgImpiantoDett) {
		log.debug("mapToDatiRisultatiCG: START");
		if(compCgImpiantoDett == null || compCgImpiantoDett.isEmpty()) return;
		BigDecimal progressivo = null;
		List<L114RowCG> listCG = new ArrayList<L114RowCG>();
		L114RowCG cg = L114RowCG.Factory.newInstance();
		cg.addNewSezCG();
		progressivo = compCgImpiantoDett.get(0).getProgressivo();
		log.debug("mapping scheda RisultatiCG");
		RowDateCG rowDateCG = RowDateCG.Factory.newInstance();
		for (int i=0; i<compCgImpiantoDett.size();i++) {
			log.debug("i="+i+ ", progressivo: " + progressivo);
			SigitVCompCgDettDto dto = compCgImpiantoDett.get(i);
			java.sql.Date dataControllo = dto.getDataControllo();
			log.debug("CG: progr:"+dto.getProgressivo()+", data install: "+ dto.getDataInstall()+
					", data controllo: " + dataControllo);
			
			//le componenti non controllate, non si riportano
			if(dataControllo==null)
			{
				log.debug("senza data controllo");
				continue;
			}
			
			/*
			//controllo validita' componente in data controllo
			if(!(!dataControllo.before(dto.getDataInstall()) && (dto.getDataDismiss()==null || !dataControllo.after(dto.getDataDismiss()))))
			{
				log.debug("non attiva in data " + dataControllo);
				continue;
			}
			*/
			
			if(!progressivo.equals(dto.getProgressivo()))
			{
				log.debug("cambio progressivo");
				listCG.add(cg);

				rowDateCG = RowDateCG.Factory.newInstance();
				progressivo = dto.getProgressivo();
				cg = L114RowCG.Factory.newInstance();
				cg.addNewSezCG();
			}
			log.debug("CG attivo");
			rowDateCG = mapToRowDateCG(dto);
			cg.setL114NumCG(ConvertUtil.convertToBigInteger(progressivo));
			rowDateCG.setL114Data(ConvertUtil.convertToXmlCalendar(dataControllo));
			cg.getSezCG().getRowDateCGList().add(rowDateCG);
		}
		listCG.add(cg);
		sezCG.getL114RowCGList().addAll(listCG);
		log.debug("mapToDatiRisultatiCG: END");
		
	}

	private static RowDateCG mapToRowDateCG(SigitVCompCgDettDto dto) {
		RowDateCG row = RowDateCG.Factory.newInstance();
		row.setL114Data(ConvertUtil.convertDateToXmlCalendar(dto.getDataControllo()));
		row.setL114EmissioniCO(GenericUtil.isNotNullOrEmpty(dto.getCoMin()) ? dto.getCoMin() +"/"+dto.getCoMax() : "");
		
		if (GenericUtil.isNullOrEmpty(dto.getNumeroRea()) && dto.getFkRuolo().intValue() == Constants.ID_RUOLO_ISPETTORE)
		{
			row.setL114Firma(Constants.DESC_ISPEZIONE);
		}
		else
		{
			row.setL114Firma(getCodiceRea(dto.getSiglaRea(), ConvertUtil.convertToInteger(dto.getNumeroRea())));
		}
		//row.setL114Firma(getCodiceRea(dto.getSiglaRea(), ConvertUtil.convertToInteger(dto.getNumeroRea())));
		
		
		row.setL114PotElettricaMorsetti(dto.getEPotenzaMorsettiKw());
		row.setL114SottoFreqSoglia1(dto.getL114SottofreqSogliaHzMin());
		row.setL114SottoFreqSoglia2(dto.getL114SottofreqSogliaHzMed());
		row.setL114SottoFreqSoglia3(dto.getL114SottofreqSogliaHzMax());
		row.setL114SottoFreqTempo1(dto.getL114SottofreqTempoSMin());
		row.setL114SottoFreqTempo2(dto.getL114SottofreqTempoSMed());
		row.setL114SottoFreqTempo3(dto.getL114SottofreqTempoSMax());
		row.setL114SottoTensSoglia1(dto.getL114SottotensSogliaVMin());
		row.setL114SottoTensSoglia2(dto.getL114SottotensSogliaVMed());
		row.setL114SottoTensSoglia3(dto.getL114SottotensSogliaVMax());
		row.setL114SottoTensTempo1(dto.getL114SottotensTempoSMin());
		row.setL114SottoTensTempo2(dto.getL114SottotensTempoSMed());
		row.setL114SottoTensTempo3(dto.getL114SottotensTempoSMax());
		row.setL114SovraFreqSoglia1(dto.getL114SovrafreqSogliaHzMin());
		row.setL114SovraFreqSoglia2(dto.getL114SovrafreqSogliaHzMed());
		row.setL114SovraFreqSoglia3(dto.getL114SovrafreqSogliaHzMax());
		row.setL114SovraFreqTempo1(dto.getL114SovrafreqTempoSMin());
		row.setL114SovraFreqTempo2(dto.getL114SovrafreqTempoSMed());
		row.setL114SovraFreqTempo3(dto.getL114SovrafreqTempoSMax());
		row.setL114SovraTensSoglia1(dto.getL114SovratensSogliaVMin());
		row.setL114SovraTensSoglia2(dto.getL114SovratensSogliaVMed());
		row.setL114SovraTensSoglia3(dto.getL114SovratensSogliaVMax());
		row.setL114SovraTensTempo1(dto.getL114SovratensTempoSMin());
		row.setL114SovraTensTempo2(dto.getL114SovratensTempoSMed());
		row.setL114SovraTensTempo3(dto.getL114SovratensTempoSMax());
		row.setL114TempAriaComb(dto.getETempAriaC());
		row.setL114TempFumiMonte(dto.getETempFumiMonteC());
		row.setL114TempFumiValle(dto.getETempFumiValleC());
		row.setL114TempH2Oingresso(dto.getETempH2oInC());
		row.setL114TempH2Omotore(dto.getETempH2oMotoreC());
		row.setL114TempH2Ouscita(dto.getETempH2oOutC());
		return row;
	}
	
	public static void mapToDatiInterventiControllo(SezInterventi sezInterventi, List<SigitVRicercaAllegatiDto> list) {
		log.debug("mapToDatiInterventiControllo: START");
		if(list!=null && !list.isEmpty())
		{
			for (SigitVRicercaAllegatiDto dto : list) {
				sezInterventi.getIntervControlloList().add(mapToIntervControllo(dto));
			}
		}
		log.debug("mapToDatiInterventiControllo: END");
	}

	private static IntervControllo mapToIntervControllo(SigitVRicercaAllegatiDto dto)
	{
		IntervControllo ic = IntervControllo.Factory.newInstance();
		ic.setL12DataControllo(ConvertUtil.convertToXmlCalendar(dto.getDataControllo()));
		if (dto.getRuoloFunz().equalsIgnoreCase(Constants.RUOLO_ISPETTORE))
		{
			ic.setL12Cciaa(Constants.DESC_ISPEZIONE);
			ic.setL12RagioneSociale(Constants.DESC_PG_RUOLO_ISPETTORE);
		}
		else
		{
			ic.setL12Cciaa(getCodiceRea(dto.getPgSiglaRea(), ConvertUtil.convertToInteger(dto.getPgNumeroRea())));
			ic.setL12RagioneSociale(dto.getPgDenominazione());
		}
		
		ic.xsetL12FlagPrescrNO(getXmlBoolean(GenericUtil.isNullOrEmpty(dto.getFPrescrizioni())));
		ic.xsetL12FlagPrescrSI(getXmlBoolean(GenericUtil.isNotNullOrEmpty(dto.getFPrescrizioni())));
		ic.xsetL12FlagRaccNO(getXmlBoolean(GenericUtil.isNullOrEmpty(dto.getFRaccomandazioni())));
		ic.xsetL12FlagRaccSI(getXmlBoolean(GenericUtil.isNotNullOrEmpty(dto.getFRaccomandazioni())));
		ic.setL12TipoAllegato(dto.getDesTipoDocumento());
		return ic;		
	}
	
	/*
	public static void mapToDatiIspezioni(SezRisultati sezInterventi, List<SigitVRicercaIspezioniDto> list) {
		log.debug("mapToDatiIspezioni: START");
		if(list!=null && !list.isEmpty())
		{
			for (SigitVRicercaIspezioniDto dto : list) {
				sezInterventi.getRowRisultatiIspezList().add(mapToIspezioneControllo(dto));
			}
		}
		
		log.debug("mapToDatiIspezioni: END");
	}
	*/
	
	public static RowRisultatiIspez mapToIspezioneControllo(SigitVRicercaIspezioniConsByCodiceImpiantoDto dto, SigitVRicercaIspezioniDto ispezIspet, String elencoIdAllegati)
	{
		RowRisultatiIspez ri = RowRisultatiIspez.Factory.newInstance();

		ri.setL13DataIspez(ConvertUtil.convertToXmlCalendar(dto.getDtCreazione()));
		ri.setL13CognomeTecnico(ispezIspet.getCognome());
		ri.setL13NomeTecnico(ispezIspet.getNome());
		ri.setL13CodiceFiscale(ispezIspet.getCodiceFiscale());

		ri.setL13EnteCompetente(dto.getEnteCompetente());


		if(ConvertUtil.convertToBooleanAllways(dto.getFlgEsito()))
			ri.xsetL13FlagPositivo(getXmlBoolean(true));
		else
			ri.xsetL13FlagNegativo(getXmlBoolean(true));


		ri.setL13Note(dto.getNote());

		
		if (GenericUtil.isNotNullOrEmpty(elencoIdAllegati))
		{
			ri.setL13RapportoProva(elencoIdAllegati);
		}
		/*
		if (GenericUtil.isNotNullOrEmpty(dto.getIdAllegato()))
		{
			ri.setL13RapportoProva(ConvertUtil.convertToString(dto.getIdAllegato()));
		}
		*/
		return ri;		
	}
	
	public static void mapToDatiManutenzioni(it.csi.sigit.sigitwebn.xml.libretto.data.DatiInterventiManutenzioneDocument.DatiInterventiManutenzione.SezInterventi sezInterventi, List<SigitVRicercaAllegatiDto> list) {
		log.debug("mapToDatiManutenzioni: START");
		if(list!=null && !list.isEmpty())
		{
			for (SigitVRicercaAllegatiDto dto : list) {
				sezInterventi.getRowInterventoList().add(mapToManutenzione(dto));
			}
		}
		
		log.debug("mapToDatiManutenzioni: END");
	}

	private static RowIntervento mapToManutenzione(SigitVRicercaAllegatiDto dto)
	{
		RowIntervento ri = RowIntervento.Factory.newInstance();

		ri.setL15DataManutenzione(ConvertUtil.convertToXmlCalendar(dto.getDataControllo()));

		ri.setL15RagSocManutentore(dto.getPgDenominazione());
		ri.setL15Cciaa(getCodiceRea(dto.getPgSiglaRea(), ConvertUtil.convertToInteger(dto.getPgNumeroRea())));
		ri.setL15TipoIntervento(dto.getDesTipoManutenzione());
		
		ri.setL15IntManEntroIl(ConvertUtil.convertToXmlCalendar(dto.getFInterventoEntro()));
		
		StringBuffer note = new StringBuffer();
		
		note.append("Comp.: ");
		note.append(MapDto.mapToElencoApparecchiatureSplit(dto.getElencoApparecchiature()));
		
		if (GenericUtil.isNotNullOrEmpty(dto.getFPrescrizioni()))
		{
			note.append("\nPrescr.: ");
			note.append(dto.getFPrescrizioni());
		}
		
		if (GenericUtil.isNotNullOrEmpty(dto.getFRaccomandazioni()))
		{
			note.append("\nRacc.: ");
			note.append(dto.getFRaccomandazioni());
		}
		
		if (GenericUtil.isNotNullOrEmpty(dto.getFOsservazioni()))
		{
			note.append("\nOss.: ");
			note.append(dto.getFOsservazioni());
		}
		
		ri.setL15Note(GenericUtil.getSubstring(note.toString(), Constants.MAX_2030_LEN));

		return ri;		
	}
	
	public static void mapResponsabileImpianto(DatiPrecompilati datiPrecompilati, SigitVTotImpiantoDto respImpianto) {
		
		if("PG".equals(respImpianto.getPfPg()))
		{
			datiPrecompilati.setL16Piva(respImpianto.getCodiceFiscale());
			datiPrecompilati.setL16RagSociale(respImpianto.getDenominazione());
			datiPrecompilati.setL16Cf(null);
			datiPrecompilati.setL16Nome(null);
			datiPrecompilati.setL16Cognome(null);
		}
		else
		{
			datiPrecompilati.setL16Nome(respImpianto.getNome());
			datiPrecompilati.setL16Cognome(respImpianto.getDenominazione());
			datiPrecompilati.setL16Cf(respImpianto.getCodiceFiscale());
			datiPrecompilati.setL16Piva(null);
			datiPrecompilati.setL16RagSociale(null);
		}
	}

	public static void mapToSezNomine(List<SigitExtContrattoImpDto> contrattiAll, SezNomine sezNom) {
		if(contrattiAll==null || contrattiAll.isEmpty())
			return;
		
		
		// Siccome la tabella SIGIT_R_COMP4_CONTRATTO ritorna una riga per ogni singola apparecchiatura
		// Devo accorpare per data_inizio, data_revoca, data_fine, id_contratto
		
		List<SigitExtContrattoImpDto> contratti = new ArrayList<SigitExtContrattoImpDto>();
		
		SigitExtContrattoImpDto sigitExtContrattoImpDtoOld = null;
		
		log.debug("VERIFICO LA DUPLICAZIONE DI CONTRATTI - START");
		
		for (SigitExtContrattoImpDto sigitExtContrattoImpDto : contrattiAll) 
		{
			
			log.debug("sigitExtContrattoImpDtoOld: "+sigitExtContrattoImpDtoOld);
			
			if (sigitExtContrattoImpDtoOld != null)
			{
				if (log.isDebugEnabled())
				{
					log.debug("sigitExtContrattoImpDtoOld.getDataInizioContratto(): "+sigitExtContrattoImpDtoOld.getDataInizioContratto());
					log.debug("sigitExtContrattoImpDto.getDataInizioContratto(): "+sigitExtContrattoImpDto.getDataInizioContratto());
					log.debug(GenericUtil.checkDateEqual(sigitExtContrattoImpDtoOld.getDataInizioContratto(), sigitExtContrattoImpDto.getDataInizioContratto()));
					log.debug("-------");
					log.debug("sigitExtContrattoImpDtoOld.getDataRevoca(): "+sigitExtContrattoImpDtoOld.getDataCessazione());
					log.debug("sigitExtContrattoImpDto.getDataRevoca(): "+sigitExtContrattoImpDto.getDataCessazione());
					log.debug(GenericUtil.checkDateEqual(sigitExtContrattoImpDtoOld.getDataCessazione(), sigitExtContrattoImpDto.getDataCessazione()));
					log.debug("-------");
					log.debug("sigitExtContrattoImpDtoOld.getDataFineContratto(): "+sigitExtContrattoImpDtoOld.getDataFineContratto());
					log.debug("sigitExtContrattoImpDto.getDataFineContratto(): "+sigitExtContrattoImpDto.getDataFineContratto());
					log.debug(GenericUtil.checkDateEqual(sigitExtContrattoImpDtoOld.getDataFineContratto(), sigitExtContrattoImpDto.getDataFineContratto()));
					log.debug("-------");
					log.debug("sigitExtContrattoImpDtoOld.getIdContratto(): "+sigitExtContrattoImpDtoOld.getIdContratto());
					log.debug("sigitExtContrattoImpDto.getIdContratto(): "+sigitExtContrattoImpDto.getIdContratto());
					log.debug(sigitExtContrattoImpDtoOld.getIdContratto().intValue() == sigitExtContrattoImpDto.getIdContratto().intValue());
					log.debug("-------");
				}
				
				if (!(GenericUtil.checkDateEqual(sigitExtContrattoImpDtoOld.getDataInizioContratto(), sigitExtContrattoImpDto.getDataInizioContratto()) &&
						GenericUtil.checkDateEqual(sigitExtContrattoImpDtoOld.getDataCessazione(), sigitExtContrattoImpDto.getDataCessazione()) &&
						GenericUtil.checkDateEqual(sigitExtContrattoImpDtoOld.getDataFineContratto(), sigitExtContrattoImpDto.getDataFineContratto()) &&
						sigitExtContrattoImpDtoOld.getIdContratto().intValue() == sigitExtContrattoImpDto.getIdContratto().intValue()))
				{
					
					// Vuol dire che e' cambiato, quindi aggiungo quello precedente
					contratti.add(sigitExtContrattoImpDtoOld);
				}
			}
			
			sigitExtContrattoImpDtoOld = sigitExtContrattoImpDto;

		}
		
		log.debug("VERIFCO LA DUPLICAZIONE DI CONTRATTI - END");
		
		// Devo aggiungere l'ultimo
		contratti.add(sigitExtContrattoImpDtoOld);
		
		
		List<RowNomine> list = new ArrayList<RowNomine>();
		for (SigitExtContrattoImpDto dto : contratti) {
			RowNomine row = RowNomine.Factory.newInstance();
			row.setL3DataValiditaContrattoDal(ConvertUtil.convertToXmlCalendar(dto.getDataInizioContratto()));
			//impostazione data fine contratto
			if(dto.getDataCessazione()!=null)
			{
				//if(DateUtil.checkDateOrder(dto.getDataRevoca(), dto.getDataFineContratto(), true))
				if(dto.getDataCessazione().before(dto.getDataFineContratto()))
				{
					row.setL3DataValiditaContrattoAl(ConvertUtil.convertToXmlCalendar(dto.getDataCessazione()));
				}
				else
				{
					if(!ConvertUtil.convertToBooleanAllways(dto.getFlagTacitoRinnovo()))
					{
						row.setL3DataValiditaContrattoAl(ConvertUtil.convertToXmlCalendar(dto.getDataFineContratto()));

					}
					else
					{
						row.setL3DataValiditaContrattoAl(ConvertUtil.convertToXmlCalendar(dto.getDataCessazione()));
					}
				}
//				if(!ConvertUtil.convertToBooleanAllways(dto.getFlagTacitoRinnovo()))
//				{
//					row.setL3DataValiditaContrattoAl(ConvertUtil.convertToXmlCalendar(dto.getDataFineContratto()));
//				}
//				else
//				{
//					
//				}
//				
//				
//				
//				row.setL3DataValiditaContrattoAl(ConvertUtil.convertToXmlCalendar(dto.getDataRevoca()));
			}
			else
			{
				if(!ConvertUtil.convertToBooleanAllways(dto.getFlagTacitoRinnovo()))
				{
					row.setL3DataValiditaContrattoAl(ConvertUtil.convertToXmlCalendar(dto.getDataFineContratto()));
				}
				else
				{
					if(dto.getDataFineContratto().after(new Date()))
					{
						row.setL3DataValiditaContrattoAl(ConvertUtil.convertToXmlCalendar(dto.getDataFineContratto()));
					}
				}
			}
			if(dto.getFkPgResponsabile()!=null)
			{
				row.setL3Piva(dto.getRespCodiceFiscale());
				row.setL3RagioneSociale(dto.getRespDenominazione());
			}
			else
			{
				row.setL3Nome(dto.getRespNome());
				row.setL3Cognome(dto.getRespDenominazione());
				row.setL3CodiceFiscale(dto.getRespCodiceFiscale());
			}
			row.setL3RagSocialeDitta(dto.getTerzoRespDenominazione());
			row.setL3Cciaa(getCodiceRea(dto.getTerzoRespSiglaRea(), ConvertUtil.convertToInteger(dto.getTerzoRespNumeroRea())));
			if(dto.getFkRuolo().toString().equals(Constants.ID_RUOLO_PROPRIETARIO+"") || dto.getFkRuolo().toString().equals(Constants.ID_RUOLO_RESPONSABILE_IMPRESA_PROPRIETARIO+"") || 
					dto.getFkRuolo().toString().equals(Constants.ID_RUOLO_OCCUPANTE+"") || dto.getFkRuolo().toString().equals(Constants.ID_RUOLO_RESPONSABILE_IMPRESA_OCCUPANTE+""))
				row.xsetL3FlagProprietario(getXmlBoolean(true));
			else
				row.xsetL3FlagAmministratore(getXmlBoolean(true));
			
			
			list.add(row);
		}
		sezNom.setRowNomineArray(list.toArray(new RowNomine[]{}));
	}

	public static void mapToSchedaCombustibile(SezCombu sez, List<SigitTConsumoDto> list) {
		log.debug("mapToSchedaCombustibile: START");
		
		BigDecimal lastCombustibile = ConvertUtil.getBigDecimalValid(list.get(0).getFkCombustibile());
		String lastUM = ConvertUtil.getStringValid(list.get(0).getFkUnitaMisura());

		RowCombu rc = RowCombu.Factory.newInstance();
		rc.setL141TipoCombu(ConvertUtil.convertToString(list.get(0).getFkCombustibile()));
		rc.setL141UnitaMisura(list.get(0).getFkUnitaMisura());
		rc.addNewSezRowConsumo();
		
		BigDecimal newCombustibile = null;
		String newUM = null;
		
		List<RowConsumo> listRc = new ArrayList<RowConsumo>();
		for (SigitTConsumoDto dto : list) {
			log.debug("tipo combustibile: " + dto.getFkCombustibile() + ", lettura iniziale: " + dto.getLetturaIniziale());
			RowConsumo row = mapToRowConsumo(dto);
			
			newCombustibile = ConvertUtil.getBigDecimalValid(dto.getFkCombustibile());
			newUM = ConvertUtil.getStringValid(dto.getFkUnitaMisura());
			
			if(lastCombustibile.equals(newCombustibile) && lastUM.equals(newUM))
			{
				log.debug("stesso combustibile/um di prima");
				listRc.add(row);
			}
			else
			{//cambiato tipo combustibile, creo sezione nuova
				log.debug("cambiato tipo combustibile");
				rc.getSezRowConsumo().setRowConsumoArray(listRc.toArray(new RowConsumo[]{}));
				sez.getRowCombuList().add(rc);
				rc = RowCombu.Factory.newInstance();
				rc.setL141TipoCombu(ConvertUtil.convertToString(dto.getFkCombustibile()));
				rc.setL141UnitaMisura(dto.getFkUnitaMisura());
				rc.addNewSezRowConsumo();
				
//				lastCombustibile = ConvertUtil.getBigDecimalValid(dto.getFkCombustibile());
//				lastUM = ConvertUtil.getStringValid(dto.getFkUnitaMisura());
				
				lastCombustibile = newCombustibile;
				lastUM = newUM;
				
				listRc = new ArrayList<RowConsumo>();
				listRc.add(row);
			}
		}
		rc.getSezRowConsumo().setRowConsumoArray(listRc.toArray(new RowConsumo[]{}));
		sez.getRowCombuList().add(rc);
		log.debug("mapToSchedaCombustibile: END");
	}
	
	private static RowConsumo mapToRowConsumo(SigitTConsumoDto dto) {
		RowConsumo row = RowConsumo.Factory.newInstance();
		row.setL141Acquisti(dto.getAcquisti());
		row.setL141Consumo(dto.getConsumo());
		row.setL141Esercizio1(ConvertUtil.convertToBigInteger(dto.getEsercizioDa()));
		row.setL141Esercizio2(ConvertUtil.convertToBigInteger(dto.getEsercizioA()));
		row.setL141LetturaFinale(dto.getLetturaFinale());
		row.setL141LetturaIniz(dto.getLetturaIniziale());
		return row;
	}
	
	public static void mapToSchedaEnergiaElettrica(SezConsumo sez, List<SigitTConsumoDto> list) {
		log.debug("mapToSchedaEnergiaElettrica: START");
		for (SigitTConsumoDto dto : list) {
			RowConsumoEE ee = mapToRowConsumoEE(dto);
			sez.getRowConsumoEEList().add(ee);
		}
		log.debug("mapToSchedaEnergiaElettrica: END");
	}
	
	private static RowConsumoEE mapToRowConsumoEE(SigitTConsumoDto dto) {
		RowConsumoEE ee = RowConsumoEE.Factory.newInstance();
		ee.setL142ConsumoTot(dto.getConsumo());
		ee.setL142Esercizio1(ConvertUtil.convertToBigInteger(dto.getEsercizioDa()));
		ee.setL142Esercizio2(ConvertUtil.convertToBigInteger(dto.getEsercizioA()));
		ee.setL142LetturaFinale(dto.getLetturaFinale());
		ee.setL142LetturaIniz(dto.getLetturaIniziale());
		return ee;
	}
	
	public static void mapToSchedaAcquaImpianto(DatiConsumoH2O datiConsumoH2O,
			List<SigitTConsumoDto> list) {
		log.debug("mapToSchedaAcquaImpianto: START");
		it.csi.sigit.sigitwebn.xml.libretto.data.DatiConsumoH2ODocument.DatiConsumoH2O.SezConsumo sezConsumo = datiConsumoH2O.addNewSezConsumo();
		for (SigitTConsumoDto dto : list) {
			RowConsumoH2O ee = mapToRowConsumoH2O(dto);
			sezConsumo.getRowConsumoH2OList().add(ee);
			datiConsumoH2O.setL143UnitaMisura(dto.getFkUnitaMisura());
		}
		log.debug("mapToSchedaAcquaImpianto: END");
	}
	
	private static RowConsumoH2O mapToRowConsumoH2O(SigitTConsumoDto dto) {
		RowConsumoH2O r = RowConsumoH2O.Factory.newInstance();
		r.setL143ConsumoTot(dto.getConsumo());
		r.setL143Esercizio1(ConvertUtil.convertToBigInteger(dto.getEsercizioDa()));
		r.setL143Esercizio2(ConvertUtil.convertToBigInteger(dto.getEsercizioA()));
		r.setL143LetturaFinale(dto.getLetturaFinale());
		r.setL143LetturaIniz(dto.getLetturaIniziale());
		return r;
	}
	
	public static void mapToSchedaProdottiChimici(
			it.csi.sigit.sigitwebn.xml.libretto.data.DatiConsumoProdottiChimiciDocument.DatiConsumoProdottiChimici.SezConsumo sez,
			List<SigitTConsumo14_4Dto> list) {
		log.debug("mapToSchedaProdottiChimici: START");
		for (SigitTConsumo14_4Dto dto : list) {
			RowConsumoPROD ee = mapToRowConsumoPROD(dto);
			sez.getRowConsumoPRODList().add(ee);
		}
		log.debug("mapToSchedaProdottiChimici: END");
	}
	
	private static RowConsumoPROD mapToRowConsumoPROD(SigitTConsumo14_4Dto dto) {
		RowConsumoPROD row = RowConsumoPROD.Factory.newInstance();
		row.setL144Esercizio1(ConvertUtil.convertToBigInteger(dto.getEsercizioDa()));
		row.setL144Esercizio2(ConvertUtil.convertToBigInteger(dto.getEsercizioA()));
		row.xsetL144FlagCircuitoACS(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgCircuitoAcs())));
		row.xsetL144FlagCircuitoIT(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgCircuitoIt())));
		row.xsetL144FlagCircuitoAltri(getXmlBoolean(ConvertUtil.convertToBooleanAllways(dto.getFlgAca())));
		row.setL144NomeProdotto(dto.getNomeProdotto());
		row.setL144UnitaMisura(dto.getFkUnitaMisura());
		row.setL144QtaConsumata(dto.getQtaConsumata());
		return row;
	}
	
	public static it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoCombustibile mapToElencoCombustibile(List<CombustibileCITDto> elencoCombustibileDto) {
		it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoCombustibile ec = it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoCombustibile.Factory.newInstance();
		it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoCombustibile.Combustibile[] arr = new it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoCombustibile.Combustibile[elencoCombustibileDto.size()];
		int i=0;
		for (CombustibileCITDto dto : elencoCombustibileDto) {
			it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoCombustibile.Combustibile com = it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoCombustibile.Combustibile.Factory.newInstance();
			com.setCodice(ConvertUtil.convertToString(dto.getIdCombustibile()));
			com.setDescrizione(dto.getDesCombustibile());
			arr[i++] = com;
		}
		ec.setCombustibileArray(arr);
		return ec;
	}
	
	public static it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFabbricante mapToElencoFabbricante(List<MarcaCITDto> elencoMarche) {
		it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFabbricante ef = it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFabbricante.Factory.newInstance();
		it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFabbricante.Fabbricante[] arr = new it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFabbricante.Fabbricante[elencoMarche.size()];
		int i=0;
		for (MarcaCITDto dto : elencoMarche) {
			it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFabbricante.Fabbricante fab = it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFabbricante.Fabbricante.Factory.newInstance();
			fab.setCodice(ConvertUtil.convertToString(dto.getIdMarca()));
			fab.setDescrizione(dto.getDesMarca());
			arr[i++] = fab;
		}
		ef.setFabbricanteArray(arr);
		return ef;
	}

	public static it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFluidoTermoVett mapToElencoFluido(List<FluidoCITDto> elencoFluidi) {
		it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFluidoTermoVett ef = it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFluidoTermoVett.Factory.newInstance();
		it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFluidoTermoVett.FluidoTermoVett[] arr = new it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFluidoTermoVett.FluidoTermoVett[elencoFluidi.size()];
		int i=0;
		for (FluidoCITDto dto : elencoFluidi) {
			it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFluidoTermoVett.FluidoTermoVett fab = it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoFluidoTermoVett.FluidoTermoVett.Factory.newInstance();
			fab.setCodice(ConvertUtil.convertToString(dto.getIdFluido()));
			fab.setDescrizione(dto.getDesFluido());
			arr[i++] = fab;
		}
		ef.setFluidoTermoVettArray(arr);
		return ef;
	}
	
	public static it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoUM mapToElencoUnitaMisura(List<UnitaMisuraCITDto> elencoUM) {
		it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoUM ec = it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoUM.Factory.newInstance();
		it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoUM.UnitaMisura[] arr = new it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoUM.UnitaMisura[elencoUM.size()];
		int i=0;
		for (UnitaMisuraCITDto dto : elencoUM) {
			it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoUM.UnitaMisura um = it.csi.sigit.sigitwebn.xml.libretto.data.DatiPrecompilatiDocument.DatiPrecompilati.ElencoUM.UnitaMisura.Factory.newInstance();
			um.setCodice(dto.getIdUnitaMisura());
			um.setDescrizione(dto.getDesUnitaMisura());
			arr[i++] = um;
		}
		ec.setUnitaMisuraArray(arr);
		return ec;
	}
	
	public static String getCodiceRea(String siglaRea, Integer numeroRea) {
		return getCodiceRea(siglaRea, ConvertUtil.convertToString(numeroRea));
	}
	
	public static String getCodiceRea(String siglaRea, String numeroRea) {
		return normalizeString(GenericUtil.getStringValid(siglaRea) + Constants.INTERVAL_SEP + GenericUtil.getStringValid(numeroRea));
	}

	public static String costruisciCodiceBollino(String siglaBollino, BigDecimal numeroBollino) {
		
		String codiceBollino = "";
		
		if (GenericUtil.isNotNullOrEmpty(numeroBollino))
		{
			codiceBollino = GenericUtil.getStringValid(siglaBollino) + Constants.INTERVAL_SEP + ConvertUtil.convertToString(numeroBollino);
		}
		
		return codiceBollino;
	}

	public static String costruisciUidIndexLibrettoFittizio(Integer codiceImpianto) {
		
		String uidIndexLibrettoFittizio = "";
		
		if (GenericUtil.isNotNullOrEmpty(codiceImpianto))
		{
			uidIndexLibrettoFittizio = Constants.UID_FITTIZIO_PREFIX+codiceImpianto;
		}
		
		return uidIndexLibrettoFittizio;
	}

	/**
	 * Normalizza una stringa trasformandola nella corrispettiva stringa tutta
	 * in maiuscolo
	 * 
	 * @param s
	 *            Stringa da normalizzare
	 * @return Stringa normalizzata
	 */
	private static String normalizeString(String s) {
		return (s == null ? null : s.toUpperCase());
	}
	
	public static String mapToElencoApparecchiatureSplit(String listaApparecchiature)
	{
		StringBuffer sb = new StringBuffer();
		
		if(GenericUtil.isNotNullOrEmpty(listaApparecchiature)){


			StringTokenizer tok = new StringTokenizer(listaApparecchiature, ",");

			String app = null;
			while (tok.hasMoreTokens()) {
				String tmp = tok.nextToken();

				if (tmp.indexOf(" (") != -1)
				{
					app = tmp.substring(0, tmp.indexOf(" ("));
	
					//System.out.println("temp2 *"+app+"*");
	
					if (sb.length() > 0)
					{
						sb.append(", ");
					}
					
					sb.append(app.trim());
				}
			}
		}
		
		//System.out.println("RESULT: "+sb);
		
		return sb.toString();
		
	}
	
	public static LibrettoDocument mapToLibrettoDocument(byte[] theXml){
		try {
			log.debug("[MapDto::mapToLibrettoDocument] start");
			
			String theXmlString = ModolXFAReader.getXMLData(theXml, "libretto");

			InputStream is = new ByteArrayInputStream(XmlBeanUtils.readString(theXmlString));
			
			LibrettoDocument librettoDoc = LibrettoDocument.Factory.parse(is);
			
			log.debug("[MapDto::mapToLibrettoDocument] end");
			return librettoDoc;
		} catch (XmlException e) {
			log.error("Errore mapToLibrettoDocument - XmlException",e);
			
			return null;
		} catch (IOException e) {
			log.error("Errore mapToLibrettoDocument - IOException",e);
			
			return null;
		} catch (ParserConfigurationException e) {
			log.error("Errore mapToLibrettoDocument - ParserConfigurationException",e);
			
			return null;
		} catch (SAXException e) {
			log.error("Errore mapToLibrettoDocument - SAXException",e);
			
			return null;
		}		
	}
	
	public static it.csi.sigit.sigitwebn.xml.importmassivo.allegato2.data.MODIIDocument mapToImportMODIIDocument(byte[] theXml){
		try {
			log.debug("[MapDto::mapToImportMODIIDocument] start");
			String theXmlString = ModolXFAReader.getXMLData(theXml, "MODII");
			InputStream is = new ByteArrayInputStream(XmlBeanUtils.readString(theXmlString));
			it.csi.sigit.sigitwebn.xml.importmassivo.allegato2.data.MODIIDocument allegatoDoc = it.csi.sigit.sigitwebn.xml.importmassivo.allegato2.data.MODIIDocument.Factory.parse(is);
			log.debug("[MapDto::mapToImportMODIIDocument] end");
			return allegatoDoc;
		} catch (Exception e) {
			log.error("Errore mapToImportMODIIDocument - Exception",e);
			return null;
		}		
	}

	public static it.csi.sigit.sigitwebn.xml.importmassivo.allegato3.data.MODIIIDocument mapToImportMODIIIDocument(byte[] theXml){
		try {
			log.debug("[MapDto::mapToImportMODIIIDocument] start");
			String theXmlString = ModolXFAReader.getXMLData(theXml, "MODIII");
			InputStream is = new ByteArrayInputStream(XmlBeanUtils.readString(theXmlString));
			it.csi.sigit.sigitwebn.xml.importmassivo.allegato3.data.MODIIIDocument allegatoDoc = it.csi.sigit.sigitwebn.xml.importmassivo.allegato3.data.MODIIIDocument.Factory.parse(is);
			log.debug("[MapDto::mapToImportMODIIIDocument] end");
			return allegatoDoc;
		} catch (Exception e) {
			log.error("Errore mapToImportMODIIIDocument - Exception",e);
			return null;
		}		
	}

	public static it.csi.sigit.sigitwebn.xml.importmassivo.allegato4.data.MODIVDocument mapToImportMODIVDocument(byte[] theXml){
		try {
			log.debug("[MapDto::mapToImportMODIVDocument] start");
			String theXmlString = ModolXFAReader.getXMLData(theXml, "MODIV");
			InputStream is = new ByteArrayInputStream(XmlBeanUtils.readString(theXmlString));
			it.csi.sigit.sigitwebn.xml.importmassivo.allegato4.data.MODIVDocument allegatoDoc = it.csi.sigit.sigitwebn.xml.importmassivo.allegato4.data.MODIVDocument.Factory.parse(is);
			log.debug("[MapDto::mapToImportMODIVDocument] end");
			return allegatoDoc;
		} catch (Exception e) {
			log.error("Errore mapToImportMODIVDocument - Exception",e);
			return null;
		}		
	}

	public static it.csi.sigit.sigitwebn.xml.importmassivo.allegato5.data.MODVDocument mapToImportMODVDocument(byte[] theXml){
		try {
			log.debug("[MapDto::mapToImportMODVDocument] start");
			String theXmlString = ModolXFAReader.getXMLData(theXml, "MODV");
			InputStream is = new ByteArrayInputStream(XmlBeanUtils.readString(theXmlString));
			it.csi.sigit.sigitwebn.xml.importmassivo.allegato5.data.MODVDocument allegatoDoc = it.csi.sigit.sigitwebn.xml.importmassivo.allegato5.data.MODVDocument.Factory.parse(is);
			log.debug("[MapDto::mapToImportMODVDocument] end");
			return allegatoDoc;
		} catch (Exception e) {
			log.error("Errore mapToImportMODVDocument - Exception",e);
			return null;
		}		
	}
	
	public static it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegt.data.MANUTENZIONEDocument mapToImportMANUTENZIONEGTDocument(byte[] theXml){
		try {
			log.debug("[MapDto::mapToImportMANUTENZIONEGTDocument] start");
			String theXmlString = ModolXFAReader.getXMLData(theXml, "MANUTENZIONE");
			InputStream is = new ByteArrayInputStream(XmlBeanUtils.readString(theXmlString));
			it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegt.data.MANUTENZIONEDocument allegatoDoc = it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegt.data.MANUTENZIONEDocument.Factory.parse(is);
			log.debug("[MapDto::mapToImportMANUTENZIONEGTDocument] end");
			return allegatoDoc;
		} catch (Exception e) {
			log.error("Errore mapToImportMANUTENZIONEGTDocument - Exception",e);
			return null;
		}		
	}
	
	public static it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegf.data.MANUTENZIONEDocument mapToImportMANUTENZIONEGFDocument(byte[] theXml){
		try {
			log.debug("[MapDto::mapToImportMANUTENZIONEGFDocument] start");
			String theXmlString = ModolXFAReader.getXMLData(theXml, "MANUTENZIONE");
			InputStream is = new ByteArrayInputStream(XmlBeanUtils.readString(theXmlString));
			it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegf.data.MANUTENZIONEDocument allegatoDoc = it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegf.data.MANUTENZIONEDocument.Factory.parse(is);
			log.debug("[MapDto::mapToImportMANUTENZIONEGFDocument] end");
			return allegatoDoc;
		} catch (Exception e) {
			log.error("Errore mapToImportMANUTENZIONEGFDocument - Exception",e);
			return null;
		}		
	}
	
	public static it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionesc.data.MANUTENZIONEDocument mapToImportMANUTENZIONESCDocument(byte[] theXml){
		try {
			log.debug("[MapDto::mapToImportMANUTENZIONESCDocument] start");
			String theXmlString = ModolXFAReader.getXMLData(theXml, "MANUTENZIONE");
			InputStream is = new ByteArrayInputStream(XmlBeanUtils.readString(theXmlString));
			it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionesc.data.MANUTENZIONEDocument allegatoDoc = it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionesc.data.MANUTENZIONEDocument.Factory.parse(is);
			log.debug("[MapDto::mapToImportMANUTENZIONESCDocument] end");
			return allegatoDoc;
		} catch (Exception e) {
			log.error("Errore mapToImportMANUTENZIONESCDocument - Exception",e);
			return null;
		}		
	}
	
	public static it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionecg.data.MANUTENZIONEDocument mapToImportMANUTENZIONECGDocument(byte[] theXml){
		try {
			log.debug("[MapDto::mapToImportMANUTENZIONECGDocument] start");
			String theXmlString = ModolXFAReader.getXMLData(theXml, "MANUTENZIONE");
			InputStream is = new ByteArrayInputStream(XmlBeanUtils.readString(theXmlString));
			it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionecg.data.MANUTENZIONEDocument allegatoDoc = it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionecg.data.MANUTENZIONEDocument.Factory.parse(is);
			log.debug("[MapDto::mapToImportMANUTENZIONECGDocument] end");
			return allegatoDoc;
		} catch (Exception e) {
			log.error("Errore mapToImportMANUTENZIONECGDocument - Exception",e);
			return null;
		}		
	}
	
	public static SigitTImportDto mapToSigitTImport(ImportFilter importData) {
		SigitTImportDto dto = new SigitTImportDto();
		dto.setCodiceImpianto(ConvertUtil.convertToBigDecimal(importData.getCodiceImpianto()));
		dto.setNomeFileImport(importData.getNomeFile());
		dto.setDataInizio(importData.getDataInizio());
		dto.setFkPreImport(importData.getIdPreImport());
		
		return dto;
	}
	
	public static String mapToElencoApparecchiatureGt(List<SigitVSk4GtDto> listaApparecchiatureDto)
	{
		String elencoApparecchiature = null;
		for (SigitVSk4GtDto dto : listaApparecchiatureDto) {
			
			if (elencoApparecchiature == null)
			{
				elencoApparecchiature = "";
			}
			else
			{
				elencoApparecchiature += ", ";
			}
			elencoApparecchiature += dto.getIdTipoComponente() + "-" + dto.getProgressivo() +  " (" + dto.getDesMarca() + " - " + dto.getModello() + ")";
		}

		return elencoApparecchiature;
		
	}
	
	public static String mapToElencoApparecchiatureGf(List<SigitVSk4GfDto> listaApparecchiatureDto)
	{
		String elencoApparecchiature = null;
		for (SigitVSk4GfDto dto : listaApparecchiatureDto) {
			
			if (elencoApparecchiature == null)
			{
				elencoApparecchiature = "";
			}
			else
			{
				elencoApparecchiature += ", ";
			}
			elencoApparecchiature += dto.getIdTipoComponente() + "-" + dto.getProgressivo() +  " (" + dto.getDesMarca() + " - " + dto.getModello() + ")";
		}
		
		return elencoApparecchiature;
		
	}
	
	public static String mapToElencoApparecchiatureSc(List<SigitVSk4ScDto> listaApparecchiatureDto)
	{
		String elencoApparecchiature = null;
		for (SigitVSk4ScDto dto : listaApparecchiatureDto) {
			
			if (elencoApparecchiature == null)
			{
				elencoApparecchiature = "";
			}
			else
			{
				elencoApparecchiature += ", ";
			}
			elencoApparecchiature += dto.getIdTipoComponente() + "-" + dto.getProgressivo() +  " (" + dto.getDesMarca() + " - " + dto.getModello() + ")";
		}
		
		return elencoApparecchiature;
		
	}
	
	public static String mapToElencoApparecchiatureCg(List<SigitVSk4CgDto> listaApparecchiatureDto)
	{
		String elencoApparecchiature = null;
		for (SigitVSk4CgDto dto : listaApparecchiatureDto) {
			
			if (elencoApparecchiature == null)
			{
				elencoApparecchiature = "";
			}
			else
			{
				elencoApparecchiature += ", ";
			}
			elencoApparecchiature += dto.getIdTipoComponente() + "-" + dto.getProgressivo() +  " (" + dto.getDesMarca() + " - " + dto.getModello() + ")";
		}
		
		return elencoApparecchiature;
		
	}
	

	public static String mapToElencoCombustibiliGt(List<SigitVSk4GtDto> listaApparecchiatureDto)
	{
		HashMap<BigDecimal, String> hashComb = new HashMap<BigDecimal, String>();

		for (SigitVSk4GtDto dto : listaApparecchiatureDto) {
			hashComb.put(dto.getIdCombustibile(), dto.getDesCombustibile());
		}
		
		Collection coll = hashComb.values();
		
		String elencoCombustibili = null;
		for (Object descComb : coll) {
			
			if (elencoCombustibili == null)
			{
				elencoCombustibili = "";
			}
			else
			{
				elencoCombustibili += ", ";
			}
			elencoCombustibili += (String)descComb;

		}
		
		return elencoCombustibili;
		
	}
	
	public static SigitTAllegatoDto mapToAllegatoDtoForInsert(DettaglioAllegato allegato) {
		SigitTAllegatoDto dto = new SigitTAllegatoDto();
		//i valori di default 
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(allegato.getCodFiscaleUtenteLoggato());
		dto.setCfRedattore(allegato.getCodFiscaleUtenteLoggato());
		dto.setFkStatoRapp(new BigDecimal(allegato.getIdStatoRapporto()));
		
		if (GenericUtil.isNotNullOrEmpty(allegato.getIdIspezIspet()))
		{
			dto.setFkIspezIspet(new BigDecimal(allegato.getIdIspezIspet()));
		}
		
		dto.setFkTipoDocumento(new BigDecimal(allegato.getIdTipoAllegato()));
		
		dto.setDataControllo(ConvertUtil.convertToSqlDate(allegato.getDataControllo()));
		dto.setFOraArrivo(allegato.getOraArrivo());
		
		//SALVO DI DEFAULT A ZERO il flag controllo Bozza
		dto.setFlgControlloBozza(ConvertUtil.convertToBigDecimal(allegato.getFlagControlloBozza()));
		if(GenericUtil.isNotNullOrEmpty(allegato.getNumeroBollinoVerde())){
			//salvo pure la sigla bollino
			dto.setFkNumeroBollino(new BigDecimal(allegato.getNumeroBollinoVerde()));
			dto.setFkSiglaBollino(allegato.getSiglaBollino());
		}

		dto.setIdAllegato(ConvertUtil.convertToBigDecimal(allegato.getIdAllegato()));
		dto.setFkTipoManutenzione(allegato.getIdTipoRapProva());

		dto.setElencoCombustibili(allegato.getElencoCombustibili());
		dto.setElencoApparecchiature(allegato.getElencoApparecchiature());
		
		return dto;
	}
	
	public static SigitTDettTipo4Dto mapToDettTipo4DtoForInsert(SigitVSk4CgDto dtoT, String cfUtente)
	{
		SigitTDettTipo4Dto sigitTDettTipo4Dto = new SigitTDettTipo4Dto();
		sigitTDettTipo4Dto.setCodiceImpianto(dtoT.getCodiceImpianto());
		sigitTDettTipo4Dto.setFkTipoComponente(dtoT.getIdTipoComponente());
		sigitTDettTipo4Dto.setProgressivo(dtoT.getProgressivo());
		sigitTDettTipo4Dto.setDataInstall(dtoT.getDataInstall());
		//sigitTDettTipo4Dto.setENModuloTermico(ConvertUtil.convertToString(numeroModulo));
		sigitTDettTipo4Dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		sigitTDettTipo4Dto.setUtenteUltMod(cfUtente);
		
		return sigitTDettTipo4Dto;
		
	}
	
	public static Metadati mapMetadati(SigitTImpiantoDto impianto, SigitTLibrettoDto libretto, String codiceRea) {
		Metadati md = new Metadati();
		md.setCodiceImpianto(ConvertUtil.convertToString(impianto.getCodiceImpianto()));
		md.setCodiceRea(codiceRea);
		md.setCodIstatComune(impianto.getIstatComune());
		md.setCodIstatProvincia(StringUtils.substring(impianto.getIstatComune(), 0, 3));
		md.setDataRapporto(ConvertUtil.convertToString(impianto.getDataIntervento()));
		md.setIdRapporto(ConvertUtil.convertToString(libretto.getIdLibretto()));
		return md;
	}
	
	public static SigitSLibrettoDto mapToSigitSLibrettoDto(SigitTLibrettoDto tLibretto) {
		SigitSLibrettoDto sLibretto = new SigitSLibrettoDto();
		
		// Copiare le properties da un dto ad un altro:
		try {
			sLibretto.setIdLibretto(tLibretto.getIdLibretto());
			sLibretto.setFkStato(tLibretto.getFkStato());
			sLibretto.setFkMotivoConsolid(tLibretto.getFkMotivoConsolid());
			sLibretto.setFkTipoDocumento(tLibretto.getFkTipoDocumento());
			sLibretto.setDataConsolidamento(tLibretto.getDataConsolidamento());
			sLibretto.setFileIndex(tLibretto.getFileIndex());
			sLibretto.setUidIndex(tLibretto.getUidIndex());
			sLibretto.setCfRedattore(tLibretto.getCfRedattore());
			sLibretto.setFlgControlloBozza(tLibretto.getFlgControlloBozza());
			sLibretto.setDataUltMod(tLibretto.getDataUltMod());
			sLibretto.setUtenteUltMod(tLibretto.getUtenteUltMod());
			sLibretto.setCodiceImpianto(tLibretto.getCodiceImpianto());
			
		} catch (Exception e) {
			log.error("mapToSigitSLibrettoDto - Errore nel copyProperties: "+e);
		} 
		
		return sLibretto;
	}
	
	public static Impianto mapSigitExtImpiantoDtoToImpianto(SigitExtImpiantoDto dto) {
		Impianto impianto = new Impianto();
		
		impianto.setCodiceImpianto(Integer.valueOf(dto.getCodiceImpianto().intValue()));
		impianto.setStato(String.valueOf(dto.getDesStato()));
		impianto.setIndirizzo(String.valueOf(dto.getIndirizzoUnitaImmob()));
		impianto.setCivico(String.valueOf(dto.getCivico()));
		impianto.setDescComune(String.valueOf(dto.getDenominazioneComune()));
		impianto.setSiglaProv(String.valueOf(dto.getSiglaProvincia()));
		impianto.setDenomResponsabile(String.valueOf(dto.getDenominazioneResponsabile()));
		impianto.setCfResponsabile(String.valueOf(dto.getCodiceFiscaleResponsabile()));
		
		return impianto;
		
	}
}
