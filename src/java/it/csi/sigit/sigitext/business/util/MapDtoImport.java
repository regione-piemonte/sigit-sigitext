/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.log4j.Logger;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRComp4ManutDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTComp4Dto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompAcDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompAgDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompBrRcDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompCgDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompCiDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompCsDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompGfDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompGtDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompPoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompRcDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompRvDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompScDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompScxDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompSrDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompTeDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompUtDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompVmDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompVrDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompVxDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompXDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompXSempliceDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTConsumo14_4Dto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTConsumoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTTrattH2ODto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTUnitaImmobiliareDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitWrkLogDto;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L101VentilazioneMeccanicaDocument.L101VentilazioneMeccanica;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L101VentilazioneMeccanicaSostituitoDocument.L101VentilazioneMeccanicaSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L141DatiConsumoCombustibileDocument.L141DatiConsumoCombustibile;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L142DatiConsumoEnergiaElettricaDocument.L142DatiConsumoEnergiaElettrica;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L143DatiConsumoAcquaDocument.L143DatiConsumoAcqua;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L144DatiConsumoProdottiChimiciDocument.L144DatiConsumoProdottiChimici;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L1SchedaIdentificativaDocument.L1SchedaIdentificativa;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L2TrattamentoAcquaDocument.L2TrattamentoAcqua;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L41GruppoTermicoDocument.L41GruppoTermico;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L41GruppoTermicoSostituitoDocument.L41GruppoTermicoSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L42BruciatoreDocument.L42Bruciatore;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L42BruciatoreSostituitoDocument.L42BruciatoreSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L43RecuperatoreDocument.L43Recuperatore;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L43RecuperatoreSostituitoDocument.L43RecuperatoreSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L44GruppoFrigoDocument.L44GruppoFrigo;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L44GruppoFrigoSostituitoDocument.L44GruppoFrigoSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L45ScambiatoreDocument.L45Scambiatore;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L45ScambiatoreSostituitoDocument.L45ScambiatoreSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L46CogeneratoreDocument.L46Cogeneratore;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L46CogeneratoreSostituitoDocument.L46CogeneratoreSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L47CampoSolareTermicoDocument.L47CampoSolareTermico;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L47CampoSolareTermicoSostituitoDocument.L47CampoSolareTermicoSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L48AltroGeneratoreDocument.L48AltroGeneratore;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L48AltroGeneratoreSostituitoDocument.L48AltroGeneratoreSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L4GeneratoriDocument.L4Generatori.L41GT;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L4GeneratoriDocument.L4Generatori.L44GF;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L4GeneratoriDocument.L4Generatori.L45SC;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L4GeneratoriDocument.L4Generatori.L46CG;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L4GeneratoriDocument.L4Generatori.L47CS;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L4GeneratoriDocument.L4Generatori.L48AG;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L51SistemaRegolazioneDocument.L51SistemaRegolazione;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L51SistemaRegolazioneSostituitoDocument.L51SistemaRegolazioneSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L51ValvolaRegolazioneDocument.L51ValvolaRegolazione;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L51ValvolaRegolazioneSostituitoDocument.L51ValvolaRegolazioneSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L5SistemiRegolazioneContabilizzazioneDocument.L5SistemiRegolazioneContabilizzazione;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L63VasoEspansioneDocument.L63VasoEspansione;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L64PompaDocument.L64Pompa;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L64PompaSostituitoDocument.L64PompaSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L6SistemiDistribuzioneDocument.L6SistemiDistribuzione;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L7SistemiEmissioneDocument.L7SistemiEmissione;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L81AccumuloDocument.L81Accumulo;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L81AccumuloSostituitoDocument.L81AccumuloSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L91TorreDocument.L91Torre;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L91TorreSostituitoDocument.L91TorreSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L92RaffreddatoreDocument.L92Raffreddatore;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L92RaffreddatoreSostituitoDocument.L92RaffreddatoreSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L93ScambiatoreIntermedioDocument.L93ScambiatoreIntermedio;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L93ScambiatoreIntermedioSostituitoDocument.L93ScambiatoreIntermedioSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L94CircuitoDocument.L94Circuito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L94CircuitoSostituitoDocument.L94CircuitoSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L95UnitaTrattAriaDocument.L95UnitaTrattAria;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L95UnitaTrattAriaSostituitoDocument.L95UnitaTrattAriaSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L96RecuperatoreAriaAmbDocument.L96RecuperatoreAriaAmb;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L96RecuperatoreAriaAmbSostituitoDocument.L96RecuperatoreAriaAmbSostituito;

/**
 * Mappa DTO con gli oggetti GUI e viceversa
 * 
 */
public class MapDtoImport extends MapDto {
	/**
	 * Logger da utilizzare
	 */
	private static Logger log = Logger.getLogger(Constants.APPLICATION_CODE
			+ ".util");

	public static SigitTImpiantoDto mapToSigitTImpiantoImp(L1SchedaIdentificativa l1SchedaIdentificativa,
			SigitTImpiantoDto datiImpianto, String cfUtenteMod) {
		datiImpianto.setDataIntervento(ConvertUtil.convertToDate(l1SchedaIdentificativa.getL11DataIntervento()));

		if(l1SchedaIdentificativa.getL11TipoIntervento()!=null)
		{
			datiImpianto.setFkTipoIntervento(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL11TipoIntervento()));
		}


		if (l1SchedaIdentificativa.getL13ServizioACSList() != null &&
				l1SchedaIdentificativa.getL13ServizioACSList().size() > 0)
		{
			datiImpianto.setL13PotH2oKw(l1SchedaIdentificativa.getL13ServizioACSArray(0));	
		}

		if (l1SchedaIdentificativa.getL13ServizioClimaInvList() != null &&
				l1SchedaIdentificativa.getL13ServizioClimaInvList().size() > 0)
		{
			datiImpianto.setL13PotClimaInvKw(l1SchedaIdentificativa.getL13ServizioClimaInvArray(0));	
		}

		if (l1SchedaIdentificativa.getL13ServizioClimaEstList() != null &&
				l1SchedaIdentificativa.getL13ServizioClimaEstList().size() > 0)
		{
			datiImpianto.setL13PotClimaEstKw(l1SchedaIdentificativa.getL13ServizioClimaEstArray(0));	
		}

		if (l1SchedaIdentificativa.getL13ServizioAltroList() != null &&
				l1SchedaIdentificativa.getL13ServizioAltroList().size() > 0)
		{
			datiImpianto.setL13Altro(l1SchedaIdentificativa.getL13ServizioAltroArray(0));	
		}

		datiImpianto.setL14FlgH2o(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL14FluidoAcqua()));
		datiImpianto.setL14FlgAria(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL14FluidoAria()));

		if (GenericUtil.isNotNullOrEmpty(l1SchedaIdentificativa.getL14FluidoAltro()))
		{
			datiImpianto.setL14Altro(l1SchedaIdentificativa.getL14FluidoAltro());
		}



		datiImpianto.setL15FlgGeneratore(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL15TipoGeneratore()));
		datiImpianto.setL15FlgPompa(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL15TipoPompa()));
		datiImpianto.setL15FlgFrigo(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL15TipoFrigo()));
		datiImpianto.setL15FlgTelerisc(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL15TipoTelerisc()));
		datiImpianto.setL15FlgTeleraffr(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL15TipoTeleraff()));

		datiImpianto.setL15FlgCogeneratore(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL15TipoCogen()));


		if (GenericUtil.isNotNullOrEmpty(l1SchedaIdentificativa.getL14FluidoAltro()))
		{

			datiImpianto.setL15Altro(l1SchedaIdentificativa.getL15TipoAltro());

		}


		if (GenericUtil.isNotNullOrEmpty(l1SchedaIdentificativa.getL15TipoIntegrazionePannelli()))
		{
			datiImpianto.setL15SupPannelliSolM2(l1SchedaIdentificativa.getL15TipoIntegrazionePannelli());	
		}

		if (l1SchedaIdentificativa.getL15TipoIntegrazioneAltro() != null && l1SchedaIdentificativa.getL15TipoIntegrazioneAltro().getDescrizioneDecimaleType() != null)
		{
			if (GenericUtil.isNotNullOrEmpty(l1SchedaIdentificativa.getL15TipoIntegrazioneAltro().getDescrizioneDecimaleType().getDescrizione()))
			{
				datiImpianto.setL15AltroIntegrazione(l1SchedaIdentificativa.getL15TipoIntegrazioneAltro().getDescrizioneDecimaleType().getDescrizione());	
			}

			if (GenericUtil.isNotNullOrEmpty(l1SchedaIdentificativa.getL15TipoIntegrazioneAltro().getDescrizioneDecimaleType().getDecimale()))
			{
				datiImpianto.setL15AltroIntegrPotKw(l1SchedaIdentificativa.getL15TipoIntegrazioneAltro().getDescrizioneDecimaleType().getDecimale());	
			}

		}


		datiImpianto.setL15FlgAltroClimaInv(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL15TipoPerClimaInv()));
		datiImpianto.setL15FlgAltroClimaEstate(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL15TipoPerClimaEst()));

		datiImpianto.setL15FlgAltroAcs(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL15TipoPerACS()));

		if (GenericUtil.isNotNullOrEmpty(l1SchedaIdentificativa.getL15TipoPerAltro()))
		{

			datiImpianto.setL15AltroDesc(l1SchedaIdentificativa.getL15TipoPerAltro());

		}

		datiImpianto.setDataUltMod(DateUtil.getSqlDataCorrente());
		datiImpianto.setUtenteUltMod(cfUtenteMod);


		return datiImpianto;
	}

	public static SigitTUnitaImmobiliareDto mapTosigitTUnitaImmobiliareImp(
			L1SchedaIdentificativa l1SchedaIdentificativa, SigitTUnitaImmobiliareDto uiPrincipale, String cfUtenteMod) {
		uiPrincipale.setL12FlgSingolaUnita(ConvertUtil.convertToBigDecimal(l1SchedaIdentificativa.getL12FlagUnitaImmSingle()));
		uiPrincipale.setL12VolRiscM3(l1SchedaIdentificativa.getL12VolLordoRisc());
		uiPrincipale.setL12VolRaffM3(l1SchedaIdentificativa.getL12VolLordoRaffr());

		String categoria = null;

		if (l1SchedaIdentificativa.getL12Categoria() != null)
		{
			if(Constants.ID_UNITA_IMMOB_CATEGORIA_E1.equals(l1SchedaIdentificativa.getL12Categoria().toString()))
				categoria = Constants.ID_UNITA_IMMOB_CATEGORIA_E1;
			if(Constants.ID_UNITA_IMMOB_CATEGORIA_E2.equals(l1SchedaIdentificativa.getL12Categoria().toString()))
				categoria = Constants.ID_UNITA_IMMOB_CATEGORIA_E2;
			if(Constants.ID_UNITA_IMMOB_CATEGORIA_E3.equals(l1SchedaIdentificativa.getL12Categoria().toString()))
				categoria = Constants.ID_UNITA_IMMOB_CATEGORIA_E3;
			if(Constants.ID_UNITA_IMMOB_CATEGORIA_E4.equals(l1SchedaIdentificativa.getL12Categoria().toString()))
				categoria = Constants.ID_UNITA_IMMOB_CATEGORIA_E4;
			if(Constants.ID_UNITA_IMMOB_CATEGORIA_E5.equals(l1SchedaIdentificativa.getL12Categoria().toString()))
				categoria = Constants.ID_UNITA_IMMOB_CATEGORIA_E5;
			if(Constants.ID_UNITA_IMMOB_CATEGORIA_E6.equals(l1SchedaIdentificativa.getL12Categoria().toString()))
				categoria = Constants.ID_UNITA_IMMOB_CATEGORIA_E6;
			if(Constants.ID_UNITA_IMMOB_CATEGORIA_E7.equals(l1SchedaIdentificativa.getL12Categoria().toString()))
				categoria = Constants.ID_UNITA_IMMOB_CATEGORIA_E7;
			if(Constants.ID_UNITA_IMMOB_CATEGORIA_E8.equals(l1SchedaIdentificativa.getL12Categoria().toString()))
				categoria = Constants.ID_UNITA_IMMOB_CATEGORIA_E8;
		}

		uiPrincipale.setL12FkCategoria(categoria);

		uiPrincipale.setDataUltMod(DateUtil.getSqlDataCorrente());
		uiPrincipale.setUtenteUltMod(cfUtenteMod);

		return uiPrincipale;
	}

	public static SigitTTrattH2ODto getSigitTTrattH2oNew(BigDecimal codImpianto, L2TrattamentoAcqua datiH)
	{
		SigitTTrattH2ODto dto = new SigitTTrattH2ODto();
		dto.setCodiceImpianto(codImpianto);
		try {
			dto.setL21H2oClimaM3(datiH.getL21ContenutoAcqua());
		} catch (Exception e) {dto.setL21H2oClimaM3(null);}
		try {
			dto.setL22DurezzaH2oFr(datiH.getL22DurezzaAcqua());
		} catch (Exception e) {dto.setL22DurezzaH2oFr(null);}

		if (GenericUtil.isNotNullOrEmpty(datiH.getL23TrattamentoAcquaAddolcimento()))
		{
			dto.setL23FlgTrattClimaAddolc(ConvertUtil.convertToBigDecimal(true));
			dto.setL23DurezzaTotH2oFr(datiH.getL23TrattamentoAcquaAddolcimento());
		}

		dto.setL23FlgTrattClimaAssente(ConvertUtil.convertToBigDecimal(datiH.getL23TrattAcquaAssente()));
		dto.setL23FlgTrattClimaChimico(ConvertUtil.convertToBigDecimal(datiH.getL23TrattAcquaChimico()));
		dto.setL23FlgTrattClimaFiltr(ConvertUtil.convertToBigDecimal(datiH.getL23TrattAcquaFiltrazione()));
		dto.setL23FlgTrattGeloAssente(ConvertUtil.convertToBigDecimal(datiH.getL23TrattAcquaGeloAssente()));

		if (datiH.getL23TrattAcquaGeloEtilenico() != null && datiH.getL23TrattAcquaGeloEtilenico().getPercentoDecimaleType() != null)
		{
			if (GenericUtil.isNotNullOrEmpty(datiH.getL23TrattAcquaGeloEtilenico().getPercentoDecimaleType().getPercento()))
			{
				dto.setL23FlgTrattGeloGliEtil(ConvertUtil.convertToBigDecimal(true));
				dto.setL23PercGliEtil(datiH.getL23TrattAcquaGeloEtilenico().getPercentoDecimaleType().getPercento());
			}

			if (GenericUtil.isNotNullOrEmpty(datiH.getL23TrattAcquaGeloEtilenico().getPercentoDecimaleType().getPh()))
			{
				dto.setL23FlgTrattGeloGliEtil(ConvertUtil.convertToBigDecimal(true));
				dto.setL23PhGliEtil(datiH.getL23TrattAcquaGeloEtilenico().getPercentoDecimaleType().getPh());
			}


		}

		if (datiH.getL23TrattAcquaGeloPropilenico() != null && datiH.getL23TrattAcquaGeloPropilenico().getPercentoDecimaleType() != null)
		{
			if (GenericUtil.isNotNullOrEmpty(datiH.getL23TrattAcquaGeloPropilenico().getPercentoDecimaleType().getPercento()))
			{
				dto.setL23FlgTrattGeloGliProp(ConvertUtil.convertToBigDecimal(true));
				dto.setL23PercGliProp(datiH.getL23TrattAcquaGeloPropilenico().getPercentoDecimaleType().getPercento());
			}

			if (GenericUtil.isNotNullOrEmpty(datiH.getL23TrattAcquaGeloPropilenico().getPercentoDecimaleType().getPh()))
			{
				dto.setL23FlgTrattGeloGliProp(ConvertUtil.convertToBigDecimal(true));
				dto.setL23PhGliProp(datiH.getL23TrattAcquaGeloPropilenico().getPercentoDecimaleType().getPh());
			}
		}


		if (GenericUtil.isNotNullOrEmpty(datiH.getL24TrattamentoAcquaAcsAddolcimento()))
		{
			dto.setL24FlgTrattAcsAddolc(ConvertUtil.convertToBigDecimal(true));
			dto.setL24DurezzaAddolcFr(datiH.getL24TrattamentoAcquaAcsAddolcimento());
		}


		dto.setL24FlgTrattAcsAssente(ConvertUtil.convertToBigDecimal(datiH.getL24TrattAcquaAcsAssente()));
		dto.setL24FlgTrattAcsChimico(ConvertUtil.convertToBigDecimal(datiH.getL24TrattAcquaAcsChimico()));
		dto.setL24FlgTrattAcsFiltr(ConvertUtil.convertToBigDecimal(datiH.getL24TrattAcquaAcsFiltrazione()));


		if (datiH.getL25TorreRaffreddamento() != null)
		{
			if (GenericUtil.isNotNullOrEmpty(datiH.getL25TorreRaffreddamento().getL25Conducibilita()))
			{

				dto.setL25FlgSpurgoAutom(ConvertUtil.convertToBigDecimal(true));

				dto.setL25ConducH2oIng(datiH.getL25TorreRaffreddamento().getL25Conducibilita());
			}

			if (GenericUtil.isNotNullOrEmpty(datiH.getL25TorreRaffreddamento().getL25Taratura()))
			{

				dto.setL25FlgSpurgoAutom(ConvertUtil.convertToBigDecimal(true));

				dto.setL25Taratura(datiH.getL25TorreRaffreddamento().getL25Taratura());
			}
		}

		if (GenericUtil.isNotNullOrEmpty(datiH.getL25CondChimicoAltro()))
		{
			//datiH2o.xsetL25FlagCondChimAltro(ConvertUtil.convertToBigDecimal(true));
			dto.setL25TrattCAltro(datiH.getL25CondChimicoAltro());
		}

		dto.setL25FlgTrattCAaa(ConvertUtil.convertToBigDecimal(datiH.getL25CondChimicoAnticrostanteAnticorrosiva()));
		dto.setL25FlgTrattCBiocida(ConvertUtil.convertToBigDecimal(datiH.getL25CondChimicoBioacida()));
		dto.setL25FlgTrattCNoTratt(ConvertUtil.convertToBigDecimal(datiH.getL25CondChimicoNessunTrattamento()));
		dto.setL25FlgTrattCPaanticorr(ConvertUtil.convertToBigDecimal(datiH.getL25CondChimicoAnticorrosiva()));
		dto.setL25FlgTrattCPaantincro(ConvertUtil.convertToBigDecimal(datiH.getL25CondChimicoAnticrostante()));

		if (GenericUtil.isNotNullOrEmpty(datiH.getL25FiltrazioneAltro()))
		{
			dto.setL25TrattFAltro(datiH.getL25FiltrazioneAltro());
		}

		dto.setL25FlgTrattFFiltMas(ConvertUtil.convertToBigDecimal(datiH.getL25FiltrazioneMasse()));
		dto.setL25FlgTrattFFiltSic(ConvertUtil.convertToBigDecimal(datiH.getL25FiltrazioneSicurezza()));
		dto.setL25FlgTrattFNoTratt(ConvertUtil.convertToBigDecimal(datiH.getL25FiltrazioneNessunTrattamento()));
		dto.setL25FlgTrattRaffAcq(ConvertUtil.convertToBigDecimal(datiH.getL25Acquedotto()));
		dto.setL25FlgTrattRaffAssente(ConvertUtil.convertToBigDecimal(datiH.getL25TrattAcquaRaffreddamentoAssente()));
		dto.setL25FlgTrattRaffH2oSup(ConvertUtil.convertToBigDecimal(datiH.getL25AcquaSuperficiale()));
		dto.setL25FlgTrattRaffNoRt(ConvertUtil.convertToBigDecimal(datiH.getL25SenzaRecuperoTermico()));
		dto.setL25FlgTrattRaffPzz(ConvertUtil.convertToBigDecimal(datiH.getL25Pozzo()));
		dto.setL25FlgTrattRaffRtp(ConvertUtil.convertToBigDecimal(datiH.getL25RecuperoTermicoParziale()));
		dto.setL25FlgTrattRaffRtt(ConvertUtil.convertToBigDecimal(datiH.getL25RecuperoTermicoTotale()));

		if (GenericUtil.isNotNullOrEmpty(datiH.getL25TrattAcquaAltro()))
		{
			dto.setL25TrattTAltro(datiH.getL25TrattAcquaAltro());
		}

		dto.setL25FlgTrattTAddolc(ConvertUtil.convertToBigDecimal(datiH.getL25TrattAcquaAddolcimento()));
		dto.setL25FlgTrattTDemin(ConvertUtil.convertToBigDecimal(datiH.getL25TrattAcquaDemineraliz()));
		dto.setL25FlgTrattTNoTratt(ConvertUtil.convertToBigDecimal(datiH.getL25TrattAcquaNessunTrattamento()));
		dto.setL25FlgTrattTOsmosi(ConvertUtil.convertToBigDecimal(datiH.getL25TrattAcquaOsmosi()));

		return dto;
	}
	
	public static SigitTComp4Dto getSigitTComp4New(BigDecimal codImpianto, L41GT gt)
	{
		SigitTComp4Dto dto = new SigitTComp4Dto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_GT);
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(gt.getL41Numero()));

		return dto;
	}
	
	public static SigitTCompGtDto mapToRowGTNew(BigDecimal codImpianto, L41GruppoTermico gt, BigDecimal progressivo, String cfUtenteMod) {

		SigitTCompGtDto dto = new SigitTCompGtDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(progressivo);
		try{dto.setDataInstall(DateUtil.getSqlDate(gt.getL41DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setDataDismiss(DateUtil.getSqlDate(gt.getL41DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		dto.setFkMarca(ConvertUtil.convertToBigDecimal(gt.getL41Fabbricante()));
		dto.setModello(gt.getL41Modello());
		dto.setMatricola(gt.getL41Matricola());
		try {dto.setFkCombustibile(ConvertUtil.convertToBigDecimal(gt.getL41Combustibile()));} catch (Exception e) {dto.setFkCombustibile(null);}
		try {dto.setPotenzaTermicaKw(gt.getL41Potenza());} catch (Exception e) {dto.setPotenzaTermicaKw(null);}

		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_GT);
		try {dto.setFkFluido(ConvertUtil.convertToBigDecimal(gt.getL41Fluido()));} catch (Exception e) {dto.setFkFluido(null);}
		try {dto.setNModuli(ConvertUtil.convertToBigDecimal(gt.getL41NumeroAnalisiFumi()));} catch (Exception e) {dto.setNModuli(null);}
		try {dto.setRendimentoPerc(gt.getL41Rendimento());} catch (Exception e) {dto.setRendimentoPerc(null);}

		dto.setFkDettaglioGt(ConvertUtil.convertToBigDecimal(gt.getL41TipoGruppoTermico()));

		if(dto.getNModuli()==null)
			dto.setNModuli(new BigDecimal("1"));

		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(gt.getL41DataDismissione())));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;

	}
	
	public static SigitTCompGtDto mapToRowGTSostNew(BigDecimal codImpianto, L41GruppoTermicoSostituito gt, BigDecimal progressivo, String cfUtenteMod) {
		SigitTCompGtDto dto = new SigitTCompGtDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(progressivo);
		try{dto.setDataInstall(DateUtil.getSqlDate(gt.getL41DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setDataDismiss(DateUtil.getSqlDate(gt.getL41DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		dto.setFkMarca(ConvertUtil.convertToBigDecimal(gt.getL41Fabbricante()));
		dto.setModello(gt.getL41Modello());
		dto.setMatricola(gt.getL41Matricola());
		try {dto.setFkCombustibile(ConvertUtil.convertToBigDecimal(gt.getL41Combustibile()));} catch (Exception e) {dto.setFkCombustibile(null);}
		try {dto.setPotenzaTermicaKw(gt.getL41Potenza());} catch (Exception e) {dto.setPotenzaTermicaKw(null);}

		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_GT);
		try {dto.setFkFluido(ConvertUtil.convertToBigDecimal(gt.getL41Fluido()));} catch (Exception e) {dto.setFkFluido(null);}
		try {dto.setNModuli(ConvertUtil.convertToBigDecimal(gt.getL41NumeroAnalisiFumi()));} catch (Exception e) {dto.setNModuli(null);}
		try {dto.setRendimentoPerc(gt.getL41Rendimento());} catch (Exception e) {dto.setRendimentoPerc(null);}

		dto.setFkDettaglioGt(ConvertUtil.convertToBigDecimal(gt.getL41TipoGruppoTermico()));

		if(dto.getNModuli()==null)
			dto.setNModuli(new BigDecimal("1"));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;

	}
	
	public static SigitRComp4ManutDto getSigitRComp4ManutNew(BigDecimal codImpianto, L41GruppoTermico gt, Integer idPersonaGiuridica, int idRuolo, BigDecimal progressivo, String cfUtenteMod)
	{
		SigitRComp4ManutDto dto = new SigitRComp4ManutDto();
		dto.setFkPersonaGiuridica(ConvertUtil.convertToBigDecimal(idPersonaGiuridica));
		dto.setCodiceImpianto(codImpianto);
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_GT);
		dto.setProgressivo(progressivo);

		dto.setDataInizio(DateUtil.getSqlCurrentDate());

		dto.setFkRuolo(ConvertUtil.convertToBigDecimal(idRuolo));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);


		return dto;
	}
	
	public static SigitTCompBrRcDto getSigitTCompBrRcNew(L42Bruciatore rowBR, BigInteger progressivo, BigDecimal idImpianto, L41GT gt) {
		SigitTCompBrRcDto dto = new SigitTCompBrRcDto();
		dto.setCodiceImpianto(idImpianto);
		dto.setFkProgressivo(ConvertUtil.convertToBigDecimal(gt.getL41Numero()));
		dto.setFkTipoComponente(Constants.TIPO_COMPONENTE_GT);
		try{dto.setFkDataInstall(DateUtil.getSqlDate(gt.getL41GruppoTermico().getL41DataInstallazione()));}catch (Exception e) {dto.setFkDataInstall(null);}
		dto.setProgressivoBrRc(ConvertUtil.convertToBigDecimal(progressivo));
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowBR.getL42DataDismissione()));} catch (Exception e1) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowBR.getL42DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}

		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowBR.getL42DataDismissione())));

		dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowBR.getL42Fabbricante()));
		dto.setFkCombustibile(ConvertUtil.convertToBigDecimal(rowBR.getL42Combustibile()));
		dto.setMatricola(rowBR.getL42Matricola());
		dto.setModello(rowBR.getL42Modello());
		try {
			dto.setPotTermMaxKw(rowBR.getL42PortataMaxNominale());
		} catch (Exception e) {dto.setPotTermMaxKw(null);}
		try {
			dto.setPotTermMinKw(rowBR.getL42PortataMinNominale());
		} catch (Exception e) {dto.setPotTermMinKw(null);}
		dto.setTipologia(rowBR.getL42Tipologia());
		dto.setTipologiaBrRc(Constants.TIPO_COMPONENTE_BR);
		return dto;
	}
	
	public static SigitTCompBrRcDto getSigitTCompBrRcNew(L43Recuperatore rowBR, BigInteger progressivo, BigDecimal idImpianto, L41GT gt) {
		SigitTCompBrRcDto dto = new SigitTCompBrRcDto();
		dto.setCodiceImpianto(idImpianto);
		dto.setFkProgressivo(ConvertUtil.convertToBigDecimal(gt.getL41Numero()));
		dto.setFkTipoComponente(Constants.TIPO_COMPONENTE_GT);
		try{dto.setFkDataInstall(DateUtil.getSqlDate(gt.getL41GruppoTermico().getL41DataInstallazione()));}catch (Exception e) {dto.setFkDataInstall(null);}
		dto.setProgressivoBrRc(ConvertUtil.convertToBigDecimal(progressivo));
		try {dto.setDataDismiss(DateUtil.getSqlDate(rowBR.getL43DataDismissione()));} catch (Exception e1) {dto.setDataDismiss(null);}
		try {dto.setDataInstall(DateUtil.getSqlDate(rowBR.getL43DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowBR.getL43DataDismissione())));

		dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowBR.getL43Fabbricante()));
		dto.setMatricola(rowBR.getL43Matricola());
		dto.setModello(rowBR.getL43Modello());
		try {dto.setPotTermMaxKw(rowBR.getL43PotenzaNominaleTotale());} catch (Exception e) {dto.setPotTermMaxKw(null);}
		dto.setTipologiaBrRc(Constants.TIPO_COMPONENTE_RC);
		return dto;
	}
	
	public static SigitTCompBrRcDto getSigitTCompBrRcSostNew(L42BruciatoreSostituito rowBR, BigDecimal progressivo, BigDecimal idImpianto, L41GT gt) {
		SigitTCompBrRcDto dto = new SigitTCompBrRcDto();
		dto.setCodiceImpianto(idImpianto);
		dto.setFkProgressivo(ConvertUtil.convertToBigDecimal(gt.getL41Numero()));
		dto.setFkTipoComponente(Constants.TIPO_COMPONENTE_GT);
		try{dto.setFkDataInstall(DateUtil.getSqlDate(gt.getL41GruppoTermico().getL41DataInstallazione()));}catch (Exception e) {dto.setFkDataInstall(null);}
		dto.setProgressivoBrRc(ConvertUtil.convertToBigDecimal(progressivo));
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowBR.getL42DataDismissione()));} catch (Exception e1) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowBR.getL42DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}

		dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowBR.getL42Fabbricante()));
		dto.setFkCombustibile(ConvertUtil.convertToBigDecimal(rowBR.getL42Combustibile()));
		dto.setMatricola(rowBR.getL42Matricola());
		dto.setModello(rowBR.getL42Modello());
		try {
			dto.setPotTermMaxKw(rowBR.getL42PortataMaxNominale());
		} catch (Exception e) {dto.setPotTermMaxKw(null);}
		try {
			dto.setPotTermMinKw(rowBR.getL42PortataMinNominale());
		} catch (Exception e) {dto.setPotTermMinKw(null);}
		dto.setTipologia(rowBR.getL42Tipologia());
		dto.setTipologiaBrRc(Constants.TIPO_COMPONENTE_BR);
		return dto;
	}
	
	public static SigitTCompBrRcDto getSigitTCompBrRcSostNew(L43RecuperatoreSostituito rowBR, BigDecimal progressivo, BigDecimal idImpianto, L41GT gt) {
		SigitTCompBrRcDto dto = new SigitTCompBrRcDto();
		dto.setCodiceImpianto(idImpianto);
		dto.setFkProgressivo(ConvertUtil.convertToBigDecimal(gt.getL41Numero()));
		dto.setFkTipoComponente(Constants.TIPO_COMPONENTE_GT);
		try{dto.setFkDataInstall(DateUtil.getSqlDate(gt.getL41GruppoTermico().getL41DataInstallazione()));}catch (Exception e) {dto.setFkDataInstall(null);}
		dto.setProgressivoBrRc(ConvertUtil.convertToBigDecimal(progressivo));
		try {dto.setDataDismiss(DateUtil.getSqlDate(rowBR.getL43DataDismissione()));} catch (Exception e1) {dto.setDataDismiss(null);}
		try {dto.setDataInstall(DateUtil.getSqlDate(rowBR.getL43DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}

		dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowBR.getL43Fabbricante()));
		dto.setMatricola(rowBR.getL43Matricola());
		dto.setModello(rowBR.getL43Modello());
		try {dto.setPotTermMaxKw(rowBR.getL43PotenzaNominaleTotale());} catch (Exception e) {dto.setPotTermMaxKw(null);}
		dto.setTipologiaBrRc(Constants.TIPO_COMPONENTE_RC);
		return dto;
	}
	
	public static SigitTComp4Dto getSigitTComp4New(BigDecimal idImpianto, L44GF rowGF) {
		SigitTComp4Dto dto = new SigitTComp4Dto();
		dto.setCodiceImpianto(idImpianto);
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_GF);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(rowGF.getL44Numero()));

		return dto;
	}
	
	public static SigitTCompGfDto mapToRowGFNew(BigDecimal codImpianto, L44GruppoFrigo rowGF, BigDecimal progressivo, String cfUtenteMod) {
		SigitTCompGfDto dto = new SigitTCompGfDto();
		
		if (log.isDebugEnabled())
			GenericUtil.stampa(rowGF, true, 3);
		
		log.debug("## rowGF.getL44CombustibileAssorbimentoFiammaDiretta(): "+rowGF.getL44CombustibileAssorbimentoFiammaDiretta());
		
		dto.setCodiceImpianto(codImpianto);
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_GF);
		dto.setProgressivo(progressivo);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowGF.getL44DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowGF.getL44DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}

		dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowGF.getL44Fabbricante()));
		dto.setModello(rowGF.getL44Modello());
		dto.setMatricola(rowGF.getL44Matricola());

		dto.setFlgSorgenteExt(rowGF.getL44SorgenteExtAria() ? Constants.FLG_ARIA : rowGF.getL44SorgenteExtAcqua() ? Constants.FLG_ACQUA : null);
		dto.setFluidoFrigorigeno(rowGF.getL44FluidoFrigorigeno());
		dto.setFlgFluidoUtenze(rowGF.getL44FluidoUtenzeAria() ? Constants.FLG_ARIA : rowGF.getL44FluidoUtenzeAcqua() ? Constants.FLG_ACQUA : null);

		BigDecimal val = null;
		if (rowGF.getL44AssorbimentoPerRecupero())
		{
			val = ConvertUtil.convertToBigDecimal("1");
		}


		if (rowGF.getL44CombustibileAssorbimentoFiammaDiretta() != 0)
		{
			dto.setFkCombustibile(ConvertUtil.convertToBigDecimal(rowGF.getL44CombustibileAssorbimentoFiammaDiretta()));

			val = ConvertUtil.convertToBigDecimal("2");
		}

		if (rowGF.getL44CompressioneMotoreElettrico())
		{
			val = ConvertUtil.convertToBigDecimal("3");
		}


		dto.setFkDettaglioGf(val);

		try {dto.setNCircuiti(ConvertUtil.convertToBigDecimal(rowGF.getL44NumCircuiti()));} catch (Exception e) {dto.setNCircuiti(null);}
		try {dto.setRaffrescamentoEer(ConvertUtil.convertToString(rowGF.getL44RaffEER()));} catch (Exception e) {dto.setRaffrescamentoEer(null);}
		try {dto.setRaffPotenzaKw(rowGF.getL44RaffPotenzaAssNominale());} catch (Exception e) {dto.setRaffPotenzaKw(null);}
		try {dto.setRaffPotenzaAss(rowGF.getL44RaffPotenzaAssNominale());} catch (Exception e) {dto.setRaffPotenzaAss(null);}
		try {dto.setRiscaldamentoCop(ConvertUtil.convertToString(rowGF.getL44RiscCOP()));} catch (Exception e) {dto.setRiscaldamentoCop(null);}
		try {dto.setRiscPotenzaKw(rowGF.getL44RiscPotenzaNominale());} catch (Exception e) {dto.setRiscPotenzaKw(null);}
		try {dto.setRiscPotenzaAssKw(rowGF.getL44RiscPotenzaAssNominale());} catch (Exception e) {dto.setRiscPotenzaAssKw(null);}

		if(dto.getNCircuiti()==null)
			dto.setNCircuiti(new BigDecimal("1"));

		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowGF.getL44DataDismissione())));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;
	}
	
	public static SigitTCompGfDto mapToRowGFSostNew(BigDecimal codImpianto, L44GruppoFrigoSostituito rowGF, BigDecimal progressivo, String cfUtenteMod) {
		SigitTCompGfDto dto = new SigitTCompGfDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_GF);
		dto.setProgressivo(progressivo);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowGF.getL44DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowGF.getL44DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}

		dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowGF.getL44Fabbricante()));
		dto.setModello(rowGF.getL44Modello());
		dto.setMatricola(rowGF.getL44Matricola());
		
		//dto.setFkCombustibile(ConvertUtil.convertToBigDecimal(rowGF.getL44CombustibileAssorbimentoFiammaDiretta()));

		dto.setFlgSorgenteExt(rowGF.getL44SorgenteExtAria() ? Constants.FLG_ARIA : rowGF.getL44SorgenteExtAcqua() ? Constants.FLG_ACQUA : null);
		dto.setFluidoFrigorigeno(rowGF.getL44FluidoFrigorigeno());
		dto.setFlgFluidoUtenze(rowGF.getL44FluidoUtenzeAria() ? Constants.FLG_ARIA : rowGF.getL44FluidoUtenzeAcqua() ? Constants.FLG_ACQUA : null);

		BigDecimal val = null;
		if (rowGF.getL44AssorbimentoPerRecupero())
		{
			val = ConvertUtil.convertToBigDecimal("1");
		}

		if (rowGF.getL44CombustibileAssorbimentoFiammaDiretta() != 0)
		{
			dto.setFkCombustibile(ConvertUtil.convertToBigDecimal(rowGF.getL44CombustibileAssorbimentoFiammaDiretta()));
			val = ConvertUtil.convertToBigDecimal("2");

		}

		if (rowGF.getL44CompressioneMotoreElettrico())
		{
			val = ConvertUtil.convertToBigDecimal("3");
		}

		dto.setFkDettaglioGf(val);

		try {dto.setNCircuiti(ConvertUtil.convertToBigDecimal(rowGF.getL44NumCircuiti()));} catch (Exception e) {dto.setNCircuiti(null);}
		try {dto.setRaffrescamentoEer(ConvertUtil.convertToString(rowGF.getL44RaffEER()));} catch (Exception e) {dto.setRaffrescamentoEer(null);}
		try {dto.setRaffPotenzaKw(rowGF.getL44RaffPotenzaAssNominale());} catch (Exception e) {dto.setRaffPotenzaKw(null);}
		try {dto.setRaffPotenzaAss(rowGF.getL44RaffPotenzaAssNominale());} catch (Exception e) {dto.setRaffPotenzaAss(null);}
		try {dto.setRiscaldamentoCop(ConvertUtil.convertToString(rowGF.getL44RiscCOP()));} catch (Exception e) {dto.setRiscaldamentoCop(null);}
		try {dto.setRiscPotenzaKw(rowGF.getL44RiscPotenzaNominale());} catch (Exception e) {dto.setRiscPotenzaKw(null);}
		try {dto.setRiscPotenzaAssKw(rowGF.getL44RiscPotenzaAssNominale());} catch (Exception e) {dto.setRiscPotenzaAssKw(null);}

		if(dto.getNCircuiti()==null)
			dto.setNCircuiti(new BigDecimal("1"));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;
	}
	
	public static SigitRComp4ManutDto getSigitRComp4ManutNew(BigDecimal codImpianto, L44GruppoFrigo gf, Integer idPersonaGiuridica, int idRuolo, BigDecimal progressivo, String cfUtenteMod)
	{
		SigitRComp4ManutDto dto = new SigitRComp4ManutDto();
		dto.setFkPersonaGiuridica(ConvertUtil.convertToBigDecimal(idPersonaGiuridica));
		dto.setCodiceImpianto(codImpianto);
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_GF);
		dto.setProgressivo(progressivo);

		dto.setDataInizio(DateUtil.getSqlCurrentDate());

		dto.setFkRuolo(ConvertUtil.convertToBigDecimal(idRuolo));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;
	}
	
	public static SigitTComp4Dto getSigitTComp4New(BigDecimal idImpianto, L45SC rowSC) {
		SigitTComp4Dto dto = new SigitTComp4Dto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_SC);
		dto.setCodiceImpianto(idImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(rowSC.getL45Numero()));

		return dto;
	}
	
	public static SigitTCompScDto mapToRowSCNew(BigDecimal codImpianto, L45Scambiatore rowSC, BigDecimal progressivo, String cfUtenteMod) {
		SigitTCompScDto dto = new SigitTCompScDto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_SC);
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(progressivo);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowSC.getL45DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowSC.getL45DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}

		dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowSC.getL45Fabbricante()));
		dto.setModello(rowSC.getL45Modello());
		dto.setMatricola(rowSC.getL45Matricola());
		try {dto.setPotenzaTermicaKw(rowSC.getL45PotenzaNominaleTotale());} catch (Exception e) {dto.setPotenzaTermicaKw(null);}

		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowSC.getL45DataDismissione())));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;
	}
	
	public static SigitRComp4ManutDto getSigitRComp4ManutNew(BigDecimal codImpianto, L45Scambiatore sc, Integer idPersonaGiuridica, int idRuolo, BigDecimal progressivo, String cfUtenteMod)
	{
		SigitRComp4ManutDto dto = new SigitRComp4ManutDto();
		dto.setFkPersonaGiuridica(ConvertUtil.convertToBigDecimal(idPersonaGiuridica));
		dto.setCodiceImpianto(codImpianto);
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_SC);
		dto.setProgressivo(progressivo);

		dto.setDataInizio(DateUtil.getSqlCurrentDate());

		dto.setFkRuolo(ConvertUtil.convertToBigDecimal(idRuolo));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;
	}
	
	public static SigitTCompScDto mapToRowSCSostNew(BigDecimal codImpianto, L45ScambiatoreSostituito rowSC, BigDecimal progressivo, String cfUtenteMod) {
		SigitTCompScDto dto = new SigitTCompScDto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_SC);
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(progressivo);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowSC.getL45DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowSC.getL45DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}

		dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowSC.getL45Fabbricante()));
		dto.setModello(rowSC.getL45Modello());
		dto.setMatricola(rowSC.getL45Matricola());
		try {dto.setPotenzaTermicaKw(rowSC.getL45PotenzaNominaleTotale());} catch (Exception e) {dto.setPotenzaTermicaKw(null);}

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;
	}
	
	public static SigitTComp4Dto getSigitTComp4New(BigDecimal idImpianto, L46CG row) {
		SigitTComp4Dto dto = new SigitTComp4Dto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_CG);
		dto.setCodiceImpianto(idImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(row.getL46Numero()));

		return dto;
	}
	
	public static SigitTCompCgDto getSigitTCompCgNew(BigDecimal codImpianto, L46Cogeneratore row, BigDecimal progressivo, String cfUtenteMod)
	{
		SigitTCompCgDto dto = new SigitTCompCgDto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_CG);
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		try{dto.setDataInstall(DateUtil.getSqlDate(row.getL46DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setDataDismiss(DateUtil.getSqlDate(row.getL46DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}

		dto.setFkMarca(ConvertUtil.convertToBigDecimal(row.getL46Fabbricante()));
		dto.setModello(row.getL46Modello());
		dto.setMatricola(row.getL46Matricola());
		dto.setFkCombustibile(ConvertUtil.convertToBigDecimal(row.getL46Alimentazione()));
		try {dto.setPotenzaTermicaKw(row.getL46PotenzaTermicaNominale());} catch (Exception e) {dto.setPotenzaTermicaKw(null);}

		try{dto.setPotenzaElettricaKw(row.getL46PotenzaElettricaNominale());} catch (Exception e) {dto.setPotenzaElettricaKw(null);}
		try {dto.setCoMax(ConvertUtil.convertToBigDecimal(row.getL46EmissioniCOMax()));} catch (Exception e) {dto.setCoMax(null);}
		try {dto.setCoMin(ConvertUtil.convertToBigDecimal(row.getL46EmissioniCOMin()));} catch (Exception e) {dto.setCoMin(null);}
		try {dto.setTempFumiMonteMax(ConvertUtil.convertToBigDecimal(row.getL46TempFumiMonteMax()));} catch (Exception e) {dto.setTempFumiMonteMax(null);}
		try {dto.setTempFumiMonteMin(ConvertUtil.convertToBigDecimal(row.getL46TempFumiMonteMin()));} catch (Exception e) {dto.setTempFumiMonteMin(null);}
		try {dto.setTempFumiValleMax(ConvertUtil.convertToBigDecimal(row.getL46TempFumiValleMax()));} catch (Exception e) {dto.setTempFumiValleMax(null);}
		try {dto.setTempFumiValleMin(ConvertUtil.convertToBigDecimal(row.getL46TempFumiValleMin()));} catch (Exception e) {dto.setTempFumiValleMin(null);}
		try {dto.setTempH2oInMax(ConvertUtil.convertToBigDecimal(row.getL46TempAcquaIngressoMax()));} catch (Exception e) {dto.setTempH2oInMax(null);}
		try {dto.setTempH2oInMin(ConvertUtil.convertToBigDecimal(row.getL46TempAcquaIngressoMin()));} catch (Exception e) {dto.setTempH2oInMin(null);}
		try {dto.setTempH2oMotoreMax(ConvertUtil.convertToBigDecimal(row.getL46TempAcquaMotoreMax()));} catch (Exception e) {dto.setTempH2oMotoreMax(null);}
		try {dto.setTempH2oMotoreMin(ConvertUtil.convertToBigDecimal(row.getL46TempAcquaMotoreMin()));} catch (Exception e) {dto.setTempH2oMotoreMin(null);}
		try {dto.setTempH2oOutMax(ConvertUtil.convertToBigDecimal(row.getL46TempAcquaUscitaMax()));} catch (Exception e) {dto.setTempH2oOutMax(null);}
		try {dto.setTempH2oOutMin(ConvertUtil.convertToBigDecimal(row.getL46TempAcquaUscitaMin()));} catch (Exception e) {dto.setTempH2oOutMin(null);}
		dto.setTipologia(row.getL46Tipologia());

		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(row.getL46DataDismissione())));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		if (log.isDebugEnabled())
			GenericUtil.stampa(dto, true, 3);

		return dto;
	}
	
	public static SigitRComp4ManutDto getSigitRComp4ManutNew(BigDecimal codImpianto, L46Cogeneratore gt, Integer idPersonaGiuridica, int idRuolo, BigDecimal progressivo, String cfUtenteMod)
	{
		SigitRComp4ManutDto dto = new SigitRComp4ManutDto();
		dto.setFkPersonaGiuridica(ConvertUtil.convertToBigDecimal(idPersonaGiuridica));
		dto.setCodiceImpianto(codImpianto);
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_CG);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		dto.setDataInizio(DateUtil.getSqlCurrentDate());

		dto.setFkRuolo(ConvertUtil.convertToBigDecimal(idRuolo));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;
	}
	
	public static SigitTCompCgDto getSigitTCompCgSostNew(BigDecimal codImpianto, L46CogeneratoreSostituito row, BigDecimal progressivo, String cfUtenteMod)
	{

		SigitTCompCgDto dto = new SigitTCompCgDto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_CG);
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		try{dto.setDataInstall(DateUtil.getSqlDate(row.getL46DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setDataDismiss(DateUtil.getSqlDate(row.getL46DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}

		dto.setFkMarca(ConvertUtil.convertToBigDecimal(row.getL46Fabbricante()));
		dto.setModello(row.getL46Modello());
		dto.setMatricola(row.getL46Matricola());
		dto.setFkCombustibile(ConvertUtil.convertToBigDecimal(row.getL46Alimentazione()));
		try {dto.setPotenzaTermicaKw(row.getL46PotenzaTermicaNominale());} catch (Exception e) {dto.setPotenzaTermicaKw(null);}

		try{dto.setPotenzaElettricaKw(row.getL46PotenzaElettricaNominale());} catch (Exception e) {dto.setPotenzaElettricaKw(null);}
		try {dto.setCoMax(ConvertUtil.convertToBigDecimal(row.getL46EmissioniCOMax()));} catch (Exception e) {dto.setCoMax(null);}
		try {dto.setCoMin(ConvertUtil.convertToBigDecimal(row.getL46EmissioniCOMin()));} catch (Exception e) {dto.setCoMin(null);}
		try {dto.setTempFumiMonteMax(ConvertUtil.convertToBigDecimal(row.getL46TempFumiMonteMax()));} catch (Exception e) {dto.setTempFumiMonteMax(null);}
		try {dto.setTempFumiMonteMin(ConvertUtil.convertToBigDecimal(row.getL46TempFumiMonteMin()));} catch (Exception e) {dto.setTempFumiMonteMin(null);}
		try {dto.setTempFumiValleMax(ConvertUtil.convertToBigDecimal(row.getL46TempFumiValleMax()));} catch (Exception e) {dto.setTempFumiValleMax(null);}
		try {dto.setTempFumiValleMin(ConvertUtil.convertToBigDecimal(row.getL46TempFumiValleMin()));} catch (Exception e) {dto.setTempFumiValleMin(null);}
		try {dto.setTempH2oInMax(ConvertUtil.convertToBigDecimal(row.getL46TempAcquaIngressoMax()));} catch (Exception e) {dto.setTempH2oInMax(null);}
		try {dto.setTempH2oInMin(ConvertUtil.convertToBigDecimal(row.getL46TempAcquaIngressoMin()));} catch (Exception e) {dto.setTempH2oInMin(null);}
		try {dto.setTempH2oMotoreMax(ConvertUtil.convertToBigDecimal(row.getL46TempAcquaMotoreMax()));} catch (Exception e) {dto.setTempH2oMotoreMax(null);}
		try {dto.setTempH2oMotoreMin(ConvertUtil.convertToBigDecimal(row.getL46TempAcquaMotoreMin()));} catch (Exception e) {dto.setTempH2oMotoreMin(null);}
		try {dto.setTempH2oOutMax(ConvertUtil.convertToBigDecimal(row.getL46TempAcquaUscitaMax()));} catch (Exception e) {dto.setTempH2oOutMax(null);}
		try {dto.setTempH2oOutMin(ConvertUtil.convertToBigDecimal(row.getL46TempAcquaUscitaMin()));} catch (Exception e) {dto.setTempH2oOutMin(null);}
		dto.setTipologia(row.getL46Tipologia());

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		if (log.isDebugEnabled())
			GenericUtil.stampa(dto, true, 3);

		return dto;
	}
	
	public static SigitTCompCsDto getSigitTCompCsDtoNew(BigDecimal codImpianto, L47CampoSolareTermico row, BigDecimal progressivo, String cfUtenteMod) {
		SigitTCompCsDto dto = new SigitTCompCsDto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_CS);
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(progressivo);
		try{dto.setDataInstall(DateUtil.getSqlDate(row.getL47DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setDataDismiss(DateUtil.getSqlDate(row.getL47DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}

		try {dto.setNumCollettori(ConvertUtil.convertToBigDecimal(row.getL47Collettori()));} catch (Exception e) {dto.setNumCollettori(null);}
		try {dto.setSupApertura(row.getL47SupTotaleApertura());} catch (Exception e) {dto.setSupApertura(null);}
		dto.setFkMarca(ConvertUtil.convertToBigDecimal(row.getL47Fabbricante()));

		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(row.getL47DataDismissione())));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;
	}
	
	public static SigitTComp4Dto getSigitTComp4New(BigDecimal idImpianto, L47CS row) {
		SigitTComp4Dto dto = new SigitTComp4Dto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_CS);
		dto.setCodiceImpianto(idImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(row.getL47Numero()));

		return dto;
	}
	
	public static SigitTCompCsDto getSigitTCompCsDtoSostNew(BigDecimal codImpianto, L47CampoSolareTermicoSostituito row, BigDecimal progressivo, String cfUtenteMod) {
		SigitTCompCsDto dto = new SigitTCompCsDto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_CS);
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(progressivo);
		try{dto.setDataInstall(DateUtil.getSqlDate(row.getL47DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setDataDismiss(DateUtil.getSqlDate(row.getL47DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}

		try {dto.setNumCollettori(ConvertUtil.convertToBigDecimal(row.getL47Collettori()));} catch (Exception e) {dto.setNumCollettori(null);}
		try {dto.setSupApertura(row.getL47SupTotaleApertura());} catch (Exception e) {dto.setSupApertura(null);}
		dto.setFkMarca(ConvertUtil.convertToBigDecimal(row.getL47Fabbricante()));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;
	}
	
	public static SigitTComp4Dto getSigitTComp4New(BigDecimal idImpianto, L48AG row) {
		SigitTComp4Dto dto = new SigitTComp4Dto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_AG);
		dto.setCodiceImpianto(idImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(row.getL48Numero()));

		return dto;
	}
	
	public static SigitTCompAgDto getSigitTCompAgSostNew(BigDecimal codImpianto, L48AltroGeneratoreSostituito row, BigDecimal progressivo, String cfUtenteMod) {
		SigitTCompAgDto dto = new SigitTCompAgDto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_AG);
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(progressivo);
		try{dto.setDataInstall(DateUtil.getSqlDate(row.getL48DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setDataDismiss(DateUtil.getSqlDate(row.getL48DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}

		dto.setFkMarca(ConvertUtil.convertToBigDecimal(row.getL48Fabbricante()));
		dto.setModello(row.getL48Modello());
		dto.setMatricola(row.getL48Matricola());
		try {dto.setPotenzaTermicaKw(row.getL48PotenzaNominaleTotale());} catch (Exception e) {dto.setPotenzaTermicaKw(null);}
		dto.setTipologia(GenericUtil.getStringSql(row.getL48Tipologia()));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;
	}
	
	public static SigitTCompAgDto getSigitTCompAgNew(BigDecimal codImpianto, L48AltroGeneratore row, BigDecimal progressivo, String cfUtenteMod) {
		SigitTCompAgDto dto = new SigitTCompAgDto();
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_AG);
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(progressivo);
		try{dto.setDataInstall(DateUtil.getSqlDate(row.getL48DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setDataDismiss(DateUtil.getSqlDate(row.getL48DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}

		dto.setFkMarca(ConvertUtil.convertToBigDecimal(row.getL48Fabbricante()));
		dto.setModello(row.getL48Modello());
		dto.setMatricola(row.getL48Matricola());
		try {dto.setPotenzaTermicaKw(row.getL48PotenzaNominaleTotale());} catch (Exception e) {dto.setPotenzaTermicaKw(null);}
		dto.setTipologia(GenericUtil.getStringSql(row.getL48Tipologia()));

		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(row.getL48DataDismissione())));

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtenteMod);

		return dto;
	}
	
	public static SigitWrkLogDto mapToSigitWrkLogDto(String cfUtenteMod, String tabella, String idRecord) {
		
		SigitWrkLogDto dto = new SigitWrkLogDto();
		
		dto.setCodiceFiscale(cfUtenteMod);
		dto.setDataOperazione(DateUtil.getSqlDataCorrente());
		dto.setTblImpattata(tabella);
		dto.setIdRecord(idRecord);
		dto.setTipoOperazione(Constants.TIPO_OPERAZIONE_DB_DELETE);
		
		return dto;
	}
	
	public static SigitTCompXSempliceDto getSigitTCompxSempliceNew(L5SistemiRegolazioneContabilizzazione rp, boolean isValvoleRegolazione, String cfUtenteMod)
	{
		SigitTCompXSempliceDto dto = new SigitTCompXSempliceDto();
		if(rp!=null)
		{
			dto.setL51FlgSrAltri(ConvertUtil.convertToBigDecimal(rp.getL51FlagAltroSistemaRegolazione()));
			dto.setL51FlgSrGeneratore(ConvertUtil.convertToBigDecimal(rp.getL51FlagRegolazioneCurvaIntegrata()));
			dto.setL51FlgSrIndipendente(ConvertUtil.convertToBigDecimal(rp.getL51FlagRegolazioneCurvaIndipendente()));
			dto.setL51FlgSrInverter(ConvertUtil.convertToBigDecimal(rp.getL51FlagSistemaRegolazioneInverter()));
			dto.setL51FlgSrMultigradino(ConvertUtil.convertToBigDecimal(rp.getL51FlagSistemaRegolazioneMultigradino()));
			dto.setL51FlgSrOnoff(ConvertUtil.convertToBigDecimal(rp.getL51FlagRegolazioneOnOff()));
			
			// Questo valore l'ho calcolato, non prendo quello dell'xml
			dto.setL51FlgValvoleRegolazione(ConvertUtil.convertToBigDecimal(isValvoleRegolazione));
			
			dto.setL51SrDescrizione(rp.getL51DescrizioneAltroSistemaRegolazione());
			dto.setUtenteUltMod(cfUtenteMod);
			dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		}
		return dto;
	}
	
	public static void getSigitTCompxSempliceNew(L5SistemiRegolazioneContabilizzazione rsa, SigitTCompXSempliceDto dto) {
		dto.setL52FlgContrEntalpico(ConvertUtil.convertToBigDecimal(rsa.getL52ControlloEntalpico()));
		dto.setL52FlgContrPortata(ConvertUtil.convertToBigDecimal(rsa.getL52ControlloPortata()));
		dto.setL52FlgTermoOnoff(ConvertUtil.convertToBigDecimal(rsa.getL52TermostatoControlloOnOff()));
		dto.setL52FlgTermoProporzionale(ConvertUtil.convertToBigDecimal(rsa.getL52TermostatoControlloProporzionale()));
		dto.setL52FlgValvole2(ConvertUtil.convertToBooleanAllways(rsa.getL52Valvole2ViePresenti()) ? Constants.FLAG_PRESENTE : Constants.FLAG_ASSENTE);
		dto.setL52FlgValvole3(ConvertUtil.convertToBooleanAllways(rsa.getL52Valvole3ViePresenti()) ? Constants.FLAG_PRESENTE : Constants.FLAG_ASSENTE);
		dto.setL52FlgValvoleTermo(ConvertUtil.convertToBooleanAllways(rsa.getL52ValvoleTermostatichePresenti()) ? Constants.FLAG_PRESENTE : Constants.FLAG_ASSENTE);
		dto.setL52Note(rsa.getL52Note());
		try{dto.setL53DataSostituz(DateUtil.getSqlDate(rsa.getL53DataSostituzione()));}catch (Exception e) {dto.setL53DataSostituz(null);}
		dto.setL53DesSistemaInstallaz(rsa.getL53DescSistemaPrimaInstall());
		dto.setL53DesSistemaSostituz(rsa.getL53DescSistemaSost());
		dto.setL53FlgTelegestione(rsa.getL53TelegestionePresenti() ? Constants.FLAG_PRESENTE : Constants.FLAG_ASSENTE);
		dto.setL53FlgTelelettura(rsa.getL53TeleletturaPresenti() ? Constants.FLAG_PRESENTE : Constants.FLAG_ASSENTE);
		try{dto.setL54DataSostituz(DateUtil.getSqlDate(rsa.getL54DataSostituzione()));}catch (Exception e) {dto.setL54DataSostituz(null);}
		dto.setL54DesSistemaInstallaz(rsa.getL54DescSistemaPrimaInstall());
		dto.setL54DesSistemaSostituz(rsa.getL54DescSistemaSost());
		if (rsa.getL54UIContabilizzateSI() != null)
		{
			log.debug("rsa.getL54UIContabilizzateSI().getL54Flag(): "+rsa.getL54UIContabilizzateSI().getL54Flag());
			dto.setL54FlgAcs(ConvertUtil.convertToBigDecimal(rsa.getL54UIContabilizzateSI().getL54Acs()));
			dto.setL54FlgRaff(ConvertUtil.convertToBigDecimal(rsa.getL54UIContabilizzateSI().getL54Raffrescamento()));
			dto.setL54FlgRisc(ConvertUtil.convertToBigDecimal(rsa.getL54UIContabilizzateSI().getL54Riscaldamento()));
		}

		if (rsa.xgetL54TipoSistemaDiretto() != null)
		{
			dto.setL54FlgTipologia(rsa.getL54TipoSistemaDiretto() ? 
					Constants.FLG_5_4_TIPOLOGIA_DIRETTO :  Constants.FLG_5_4_TIPOLOGIA_INDIRETTO);

		}

		log.debug("rsa.getL54UIContabilizzateNO(): "+rsa.getL54UIContabilizzateNO());
		log.debug("rsa.getL54UIContabilizzateSI(): "+rsa.getL54UIContabilizzateSI());
		
		try{dto.setL54FlgUic(ConvertUtil.convertToBigDecimal(rsa.getL54UIContabilizzateNO() ? Constants.NO_0 : rsa.getL54UIContabilizzateSI() != null && rsa.getL54UIContabilizzateSI().getL54Flag() ? Constants.SI_1 : null ));}catch(Exception e){
			log.error(e);
			
		}
	}
	
	public static void getSigitTCompXSempliceNew(SigitTCompXSempliceDto dtoXsemplice, L6SistemiDistribuzione datiSchedaSistemiDistrib) {

		if (datiSchedaSistemiDistrib.getL61TipoDistribuzione() != null)
		{
			switch (datiSchedaSistemiDistrib.getL61TipoDistribuzione().intValue()) {
			case 1: dtoXsemplice.setL61FlgVerticale(ConvertUtil.convertToBigDecimal(true));
			break;
			case 2: dtoXsemplice.setL61FlgOrizzontale(ConvertUtil.convertToBigDecimal(true));
			break;
			case 3: dtoXsemplice.setL61FlgCan(ConvertUtil.convertToBigDecimal(true));
			break;
			}
		}

		if (GenericUtil.isNotNullOrEmpty(datiSchedaSistemiDistrib.getL61DistribuzioneAltro()))
		{
			dtoXsemplice.setL61Altro(datiSchedaSistemiDistrib.getL61DistribuzioneAltro());
		}


		if (datiSchedaSistemiDistrib.xgetL62CoibentazioneAssente() != null)
		{
			dtoXsemplice.setL62FlgCoibent(datiSchedaSistemiDistrib.getL62CoibentazioneAssente() ? Constants.FLAG_ASSENTE : Constants.FLAG_PRESENTE);
		}

		dtoXsemplice.setL62Note(datiSchedaSistemiDistrib.getL62Note());
	}
	
	public static void getSigitTCompxSempliceNew(L7SistemiEmissione datiSchedaSistemaEmissione, SigitTCompXSempliceDto dto) {

		if (GenericUtil.isNotNullOrEmpty(datiSchedaSistemaEmissione.getL71Altro()))
		{
			dto.setL70Altro(datiSchedaSistemaEmissione.getL71Altro());
		}

		dto.setL70FlgBocchette(ConvertUtil.convertToBigDecimal(datiSchedaSistemaEmissione.getL71Bocchette()));
		dto.setL70FlgPannelli(ConvertUtil.convertToBigDecimal(datiSchedaSistemaEmissione.getL71PanelliRadianti()));
		dto.setL70FlgRadiatori(ConvertUtil.convertToBigDecimal(datiSchedaSistemaEmissione.getL71Radiatori()));
		dto.setL70FlgStrisce(ConvertUtil.convertToBigDecimal(datiSchedaSistemaEmissione.getL71StrisceRadianti()));
		dto.setL70FlgTermoconvettori(ConvertUtil.convertToBigDecimal(datiSchedaSistemaEmissione.getL71Termoconvettori()));
		dto.setL70FlgTravi(ConvertUtil.convertToBigDecimal(datiSchedaSistemaEmissione.getL71TraviFredde()));
		dto.setL70FlgVentilconvettori(ConvertUtil.convertToBigDecimal(datiSchedaSistemaEmissione.getL71Ventilconvettori()));
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L51SistemaRegolazione rowSR, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowSR.getL51DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowSR.getL51DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowSR.getL51Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_SR);
		dto.setModello(rowSR.getL51Modello());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowSR.getL51DataDismissione())));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		return dto;
	}
	
	public static SigitTCompSrDto getSigitTCompSRNew(L51SistemaRegolazione rowSR, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompSrDto dto = new SigitTCompSrDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowSR.getL51DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_SR);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		try{dto.setNumLivTemp(ConvertUtil.convertToBigDecimal(rowSR.getL51NumeroLivelliTemp()));}catch (Exception e) {dto.setNumLivTemp(null);}
		try{dto.setNumPtiRegolazione(ConvertUtil.convertToBigDecimal(rowSR.getL51NumeroPuntiRegolazione()));}catch (Exception e) {dto.setNumPtiRegolazione(null);}

		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L51SistemaRegolazioneSostituito rowSR, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowSR.getL51DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowSR.getL51DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowSR.getL51Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_SR);
		dto.setModello(rowSR.getL51Modello());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowSR.getL51DataDismissione())));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}
	
	public static SigitTCompSrDto getSigitTCompSRNew(L51SistemaRegolazioneSostituito rowSR, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompSrDto dto = new SigitTCompSrDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowSR.getL51DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_SR);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		try{dto.setNumLivTemp(ConvertUtil.convertToBigDecimal(rowSR.getL51NumeroLivelliTemp()));}catch (Exception e) {dto.setNumLivTemp(null);}
		try{dto.setNumPtiRegolazione(ConvertUtil.convertToBigDecimal(rowSR.getL51NumeroPuntiRegolazione()));}catch (Exception e) {dto.setNumPtiRegolazione(null);}
		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L51ValvolaRegolazione rowVR, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowVR.getL51DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowVR.getL51DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowVR.getL51Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_VR);
		dto.setModello(rowVR.getL51Modello());
		try{dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));}catch (Exception e) {dto.setProgressivo(null);}
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowVR.getL51DataDismissione())));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}
	
	public static SigitTCompVrDto getSigitTCompVRNew(L51ValvolaRegolazione rowVR, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompVrDto dto = new SigitTCompVrDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowVR.getL51DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_VR);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		try{dto.setNumVie(ConvertUtil.convertToBigDecimal(rowVR.getL51NumeroVie()));}catch (Exception e) {dto.setNumVie(null);}
		dto.setServomotore(rowVR.getL51Servomotore());
		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L51ValvolaRegolazioneSostituito rowVR, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowVR.getL51DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowVR.getL51DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowVR.getL51Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_VR);
		dto.setModello(rowVR.getL51Modello());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}
	
	public static SigitTCompVrDto getSigitTCompVRNew(L51ValvolaRegolazioneSostituito rowVR, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompVrDto dto = new SigitTCompVrDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowVR.getL51DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_VR);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		try{dto.setNumVie(ConvertUtil.convertToBigDecimal(rowVR.getL51NumeroVie()));}catch (Exception e) {dto.setNumVie(null);}
		dto.setServomotore(rowVR.getL51Servomotore());
		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L63VasoEspansione rowSR, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataInstall(ConvertUtil.convertToSqlDate("31/12/9999"));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_VX);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}
	
	public static SigitTCompVxDto getSigitTCompVXNew(L63VasoEspansione rowVX, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompVxDto dto = new SigitTCompVxDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataInstall(ConvertUtil.convertToSqlDate("31/12/9999"));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_VX);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));


		try{dto.setCapacitaL(rowVX.getL63Capacita());}catch(Exception e){dto.setCapacitaL(null);}


		try{dto.setFlgVaso(rowVX.getL63Aperto() ? Constants.FLAG_VASO_APERTO : Constants.FLAG_VASO_CHIUSO);}catch(Exception e){dto.setFlgVaso(null);}

		try{dto.setPressioneBar(rowVX.getL63ChiusoPressione());}catch(Exception e){dto.setPressioneBar(null);}
		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L64Pompa rowPO, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowPO.getL64DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowPO.getL64DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowPO.getL64Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_PO);
		dto.setModello(rowPO.getL64Modello());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowPO.getL64DataDismissione())));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}
	
	public static SigitTCompPoDto getSigitTCompPONew(L64Pompa rowPO, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompPoDto dto = new SigitTCompPoDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowPO.getL64DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_PO);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		if (rowPO.xgetL64GiriVariabiliSI() != null)
		{
			dto.setFlgGiriVariabili(ConvertUtil.convertToBigDecimal(rowPO.getL64GiriVariabiliSI()));
		}

		try{dto.setPotNominaleKw(rowPO.getL64PotenzaNominale());}catch(Exception e){dto.setPotNominaleKw(null);}

		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L64PompaSostituito rowPO, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowPO.getL64DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowPO.getL64DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowPO.getL64Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_PO);
		dto.setModello(rowPO.getL64Modello());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}
	
	public static SigitTCompPoDto getSigitTCompPONew(L64PompaSostituito rowPO, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompPoDto dto = new SigitTCompPoDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowPO.getL64DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_PO);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		if (rowPO.xgetL64GiriVariabiliSI() != null)
		{
			dto.setFlgGiriVariabili(ConvertUtil.convertToBigDecimal(rowPO.getL64GiriVariabiliSI()));
		}

		try{dto.setPotNominaleKw(rowPO.getL64PotenzaNominale());}catch(Exception e){dto.setPotNominaleKw(null);}
		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L81Accumulo rowAC, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowAC.getL81DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowAC.getL81DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowAC.getL81Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_AC);
		dto.setModello(rowAC.getL81Modello());
		dto.setMatricola(rowAC.getL81Matricola());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowAC.getL81DataDismissione())));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}
	
	public static SigitTCompAcDto getSigitTCompACNew(L81Accumulo rowAC, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompAcDto dto = new SigitTCompAcDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_AC);
		try{dto.setCapacita(rowAC.getL81Capacita());}catch(Exception e){dto.setCapacita(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowAC.getL81DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}
		dto.setFlgAcs(ConvertUtil.convertToBigDecimal(rowAC.getL81ACS()));
		dto.setFlgRaff(ConvertUtil.convertToBigDecimal(rowAC.getL81Raffrescamento()));
		dto.setFlgRisc(ConvertUtil.convertToBigDecimal(rowAC.getL81Riscaldamento()));

		if (rowAC.xgetL81CoibentazioneAssente() != null)
		{
			dto.setFlgCoib(rowAC.getL81CoibentazioneAssente() ? Constants.FLAG_ASSENTE : Constants.FLAG_PRESENTE);
		}

		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L81AccumuloSostituito rowAC, BigDecimal codImpianto, String progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowAC.getL81DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowAC.getL81DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowAC.getL81Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_AC);
		dto.setModello(rowAC.getL81Modello());
		dto.setMatricola(rowAC.getL81Matricola());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}
	
	public static SigitTCompAcDto getSigitTCompACNew(L81AccumuloSostituito rowAC, BigDecimal codImpianto, String progressivo) {
		SigitTCompAcDto dto = new SigitTCompAcDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_AC);
		try{dto.setCapacita(rowAC.getL81Capacita());}catch(Exception e){dto.setCapacita(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowAC.getL81DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}
		dto.setFlgAcs(ConvertUtil.convertToBigDecimal(rowAC.getL81ACS()));
		dto.setFlgRaff(ConvertUtil.convertToBigDecimal(rowAC.getL81Raffrescamento()));
		dto.setFlgRisc(ConvertUtil.convertToBigDecimal(rowAC.getL81Riscaldamento()));

		if (rowAC.xgetL81CoibentazioneAssente() != null)
		{
			dto.setFlgCoib(rowAC.getL81CoibentazioneAssente() ? Constants.FLAG_ASSENTE : Constants.FLAG_PRESENTE);
		}

		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L91Torre rowTE, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowTE.getL91DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowTE.getL91DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowTE.getL91Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_TE);
		dto.setModello(rowTE.getL91Modello());
		dto.setMatricola(rowTE.getL91Matricola());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowTE.getL91DataDismissione())));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L91TorreSostituito rowTE, BigDecimal codImpianto, String progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowTE.getL91DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowTE.getL91DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowTE.getL91Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_TE);
		dto.setModello(rowTE.getL91Modello());
		dto.setMatricola(rowTE.getL91Matricola());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}
	
	public static SigitTCompTeDto getSigitTCompTENew(L91TorreSostituito rowTE, BigDecimal codImpianto, String progressivo) {
		SigitTCompTeDto dto = new SigitTCompTeDto();
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setCodiceImpianto(codImpianto);
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_TE);
		try{dto.setCapacitaL(rowTE.getL91Capacita());}catch(Exception e){dto.setCapacitaL(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowTE.getL91DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}
		dto.setTipoVentilatori(rowTE.getL91TipoVentilatori());
		try{dto.setNumVentilatori(ConvertUtil.convertToBigDecimal(rowTE.getL91NumeroVentilatori()));}catch(Exception e){dto.setNumVentilatori(null);}
		return dto;
	}
	
	public static SigitTCompTeDto getSigitTCompTENew(L91Torre rowTE, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompTeDto dto = new SigitTCompTeDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_TE);
		try{dto.setCapacitaL(rowTE.getL91Capacita());}catch(Exception e){dto.setCapacitaL(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowTE.getL91DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}
		dto.setTipoVentilatori(rowTE.getL91TipoVentilatori());
		try{dto.setNumVentilatori(ConvertUtil.convertToBigDecimal(rowTE.getL91NumeroVentilatori()));}catch(Exception e){dto.setNumVentilatori(null);}
		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L92Raffreddatore rowRV, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowRV.getL92DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowRV.getL92DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowRV.getL92Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_RV);
		dto.setModello(rowRV.getL92Modello());
		dto.setMatricola(rowRV.getL92Matricola());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowRV.getL92DataDismissione())));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}

	public static SigitTCompRvDto getSigitTCompRVNew(L92Raffreddatore rowRV, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompRvDto dto = new SigitTCompRvDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_RV);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowRV.getL92DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}
		dto.setTipoVentilatori(rowRV.getL92TipoVentilatori());
		try{dto.setNumVentilatori(ConvertUtil.convertToBigDecimal(rowRV.getL92NumeroVentilatori()));}catch(Exception e){dto.setNumVentilatori(null);}
		return dto;
	}

	public static SigitTCompXDto getSigitTCompXNew(L92RaffreddatoreSostituito rowRV, BigDecimal codImpianto, String progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowRV.getL92DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowRV.getL92DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowRV.getL92Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_RV);
		dto.setModello(rowRV.getL92Modello());
		dto.setMatricola(rowRV.getL92Matricola());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}

	public static SigitTCompRvDto getSigitTCompRVNew(L92RaffreddatoreSostituito rowRV, BigDecimal codImpianto, String progressivo) {
		SigitTCompRvDto dto = new SigitTCompRvDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_RV);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowRV.getL92DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}
		dto.setTipoVentilatori(rowRV.getL92TipoVentilatori());
		try{dto.setNumVentilatori(ConvertUtil.convertToBigDecimal(rowRV.getL92NumeroVentilatori()));}catch(Exception e){dto.setNumVentilatori(null);}
		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L93ScambiatoreIntermedio rowSC, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowSC.getL93DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowSC.getL93DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowSC.getL93Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_SCX);
		dto.setModello(rowSC.getL93Modello());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowSC.getL93DataDismissione())));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}

	public static SigitTCompScxDto getSigitTCompSCXNew(L93ScambiatoreIntermedio rowSC, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompScxDto dto = new SigitTCompScxDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_SCX);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowSC.getL93DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}
		return dto;
	}

	public static SigitTCompXDto getSigitTCompXNew(L93ScambiatoreIntermedioSostituito rowRV, BigDecimal codImpianto, String progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowRV.getL93DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowRV.getL93DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowRV.getL93Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_SCX);
		dto.setModello(rowRV.getL93Modello());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}

	public static SigitTCompScxDto getSigitTCompSCXNew(L93ScambiatoreIntermedioSostituito rowSC, BigDecimal codImpianto, String progressivo) {
		SigitTCompScxDto dto = new SigitTCompScxDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_SCX);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowSC.getL93DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}
		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L94Circuito rowCI, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowCI.getL94DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowCI.getL94DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_CI);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowCI.getL94DataDismissione())));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}

	public static SigitTCompCiDto getSigitTCompCINew(L94Circuito rowCI, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompCiDto dto = new SigitTCompCiDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_CI);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowCI.getL94DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}
		try{dto.setLunghezzaCircM(rowCI.getL94LunghezzaCircuito());}catch(Exception e){dto.setLunghezzaCircM(null);}
		try{dto.setProfInstallM(rowCI.getL94Profondita());}catch(Exception e){dto.setProfInstallM(null);}
		try{dto.setSuperfScambM2(rowCI.getL94SupScambiatore());}catch(Exception e){dto.setSuperfScambM2(null);}
		return dto;
	}

	public static SigitTCompXDto getSigitTCompXNew(L94CircuitoSostituito rowCI, BigDecimal codImpianto, String progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowCI.getL94DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowCI.getL94DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_CI);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}

	public static SigitTCompCiDto getSigitTCompCINew(L94CircuitoSostituito rowCI, BigDecimal codImpianto, String progressivo) {
		SigitTCompCiDto dto = new SigitTCompCiDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_CI);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowCI.getL94DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}
		try{dto.setLunghezzaCircM(rowCI.getL94LunghezzaCircuito());}catch(Exception e){dto.setLunghezzaCircM(null);}
		try{dto.setProfInstallM(rowCI.getL94Profondita());}catch(Exception e){dto.setProfInstallM(null);}
		try{dto.setSuperfScambM2(rowCI.getL94SupScambiatore());}catch(Exception e){dto.setSuperfScambM2(null);}
		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L95UnitaTrattAria rowUT, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowUT.getL95DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowUT.getL95DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowUT.getL95Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_UT);
		dto.setModello(rowUT.getL95Modello());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setMatricola(rowUT.getL95Matricola());
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowUT.getL95DataDismissione())));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}

	public static SigitTCompUtDto getSigitTCompUTNew(L95UnitaTrattAria rowUT, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompUtDto dto = new SigitTCompUtDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_UT);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowUT.getL95DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}
		try{dto.setPortataMandataLs(rowUT.getL95PortataMandata());}catch(Exception e){dto.setPortataMandataLs(null);}
		try{dto.setPortataRipresaLs(rowUT.getL95PortataRipresa());}catch(Exception e){dto.setPortataRipresaLs(null);}
		try{dto.setPotenzaMandataKw(rowUT.getL95PotenzaMandata());}catch(Exception e){dto.setPotenzaMandataKw(null);}
		try{dto.setPotenzaRipresaKw(rowUT.getL95PotenzaRipresa());}catch(Exception e){dto.setPotenzaRipresaKw(null);}
		return dto;
	}

	public static SigitTCompXDto getSigitTCompXNew(L95UnitaTrattAriaSostituito rowUT, BigDecimal codImpianto, String progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowUT.getL95DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowUT.getL95DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowUT.getL95Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_UT);
		dto.setModello(rowUT.getL95Modello());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setMatricola(rowUT.getL95Matricola());

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}

	public static SigitTCompUtDto getSigitTCompUTNew(L95UnitaTrattAriaSostituito rowUT, BigDecimal codImpianto, String progressivo) {
		SigitTCompUtDto dto = new SigitTCompUtDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_UT);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowUT.getL95DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}
		try{dto.setPortataMandataLs(rowUT.getL95PortataMandata());}catch(Exception e){dto.setPortataMandataLs(null);}
		try{dto.setPortataRipresaLs(rowUT.getL95PortataRipresa());}catch(Exception e){dto.setPortataRipresaLs(null);}
		try{dto.setPotenzaMandataKw(rowUT.getL95PotenzaMandata());}catch(Exception e){dto.setPotenzaMandataKw(null);}
		try{dto.setPotenzaRipresaKw(rowUT.getL95PotenzaRipresa());}catch(Exception e){dto.setPotenzaRipresaKw(null);}
		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L96RecuperatoreAriaAmb rowRC, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowRC.getL96DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowRC.getL96DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_RCX);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowRC.getL96DataDismissione())));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}

	public static SigitTCompRcDto getSigitTCompRCNew(L96RecuperatoreAriaAmb rowRC, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompRcDto dto = new SigitTCompRcDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_RCX);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowRC.getL96DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}

		if (rowRC.xgetL96Installato() != null)
		{
			dto.setFlgIndipendente(ConvertUtil.convertToBigDecimal(!rowRC.getL96Installato()));
			dto.setFlgInstallato(ConvertUtil.convertToBigDecimal(rowRC.getL96Installato()));
		}

		try{dto.setPortataMandataLs(rowRC.getL96PortataMandata());}catch (Exception e) {dto.setPortataMandataLs(null);}
		try{dto.setPortataRipresaLs(rowRC.getL96PortataRipresa());}catch (Exception e) {dto.setPortataRipresaLs(null);}
		try{dto.setPotenzaMandataKw(rowRC.getL96PotenzaMandata());}catch (Exception e) {dto.setPotenzaMandataKw(null);}
		try{dto.setPotenzaRipresaKw(rowRC.getL96PotenzaRipresa());}catch (Exception e) {dto.setPotenzaRipresaKw(null);}
		dto.setTipologia(rowRC.getL96Tipologia());
		return dto;
	}

	public static SigitTCompXDto getSigitTCompXNew(L96RecuperatoreAriaAmbSostituito rowRC, BigDecimal codImpianto, String progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowRC.getL96DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowRC.getL96DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_RCX);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}

	public static SigitTCompRcDto getSigitTCompRCNew(L96RecuperatoreAriaAmbSostituito rowRC, BigDecimal codImpianto, String progressivo) {
		SigitTCompRcDto dto = new SigitTCompRcDto();
		dto.setCodiceImpianto(codImpianto);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_RCX);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowRC.getL96DataInstallazione()));}catch(Exception e){dto.setDataInstall(null);}

		if (rowRC.xgetL96Installato() != null)
		{
			dto.setFlgIndipendente(ConvertUtil.convertToBigDecimal(!rowRC.getL96Installato()));
			dto.setFlgInstallato(ConvertUtil.convertToBigDecimal(rowRC.getL96Installato()));
		}

		try{dto.setPortataMandataLs(rowRC.getL96PortataMandata());}catch (Exception e) {dto.setPortataMandataLs(null);}
		try{dto.setPortataRipresaLs(rowRC.getL96PortataRipresa());}catch (Exception e) {dto.setPortataRipresaLs(null);}
		try{dto.setPotenzaMandataKw(rowRC.getL96PotenzaMandata());}catch (Exception e) {dto.setPotenzaMandataKw(null);}
		try{dto.setPotenzaRipresaKw(rowRC.getL96PotenzaRipresa());}catch (Exception e) {dto.setPotenzaRipresaKw(null);}
		return dto;
	}
	
	public static SigitTCompXDto getSigitTCompXNew(L101VentilazioneMeccanica rowVM, BigDecimal codImpianto, BigInteger progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowVM.getL101DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowVM.getL101DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowVM.getL101Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_VM);
		dto.setModello(rowVM.getL101Modello());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));
		dto.setFlgDismissione(ConvertUtil.convertToBigDecimal(GenericUtil.isNotNullOrEmpty(rowVM.getL101DataDismissione())));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}

	public static SigitTCompVmDto getSigitTCompVMNew(L101VentilazioneMeccanica rowVM, BigDecimal codImpianto, BigInteger progressivo) {
		SigitTCompVmDto dto = new SigitTCompVmDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowVM.getL101DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_VM);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		if (GenericUtil.isNotNullOrEmpty(rowVM.getL101TipologiaAltro()))
		{
			dto.setAltroTipologia(rowVM.getL101TipologiaAltro());
		}

		try{dto.setPortataMaxAriaM3h(rowVM.getL101PortataMax());}catch (Exception e) {dto.setPortataMaxAriaM3h(null);}
		try{dto.setRendimentoCop(ConvertUtil.convertToString(rowVM.getL101RendimentoRecupero()));}catch (Exception e) {dto.setRendimentoCop(null);}

		if (rowVM.getL101Tipologia() != null)
		{
			switch (rowVM.getL101Tipologia().intValue()) {
			case 1: dto.setFkDettaglioVm(new BigDecimal("1"));
			break;
			case 2: dto.setFkDettaglioVm(new BigDecimal("2"));
			break;
			case 3: dto.setFkDettaglioVm(new BigDecimal("3"));
			break;
			}
		}

		return dto;
	}

	public static SigitTCompXDto getSigitTCompXNew(L101VentilazioneMeccanicaSostituito rowVM, BigDecimal codImpianto, String progressivo, String cfUtenteMod) {
		SigitTCompXDto dto = new SigitTCompXDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataDismiss(DateUtil.getSqlDate(rowVM.getL101DataDismissione()));}catch (Exception e) {dto.setDataDismiss(null);}
		try{dto.setDataInstall(DateUtil.getSqlDate(rowVM.getL101DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		try{dto.setFkMarca(ConvertUtil.convertToBigDecimal(rowVM.getL101Fabbricante()));}catch (Exception e) {dto.setFkMarca(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_VM);
		dto.setModello(rowVM.getL101Modello());
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}

	public static SigitTCompVmDto getSigitTCompVMNew(L101VentilazioneMeccanicaSostituito rowVM, BigDecimal codImpianto, String progressivo) {
		SigitTCompVmDto dto = new SigitTCompVmDto();
		dto.setCodiceImpianto(codImpianto);
		try{dto.setDataInstall(DateUtil.getSqlDate(rowVM.getL101DataInstallazione()));}catch (Exception e) {dto.setDataInstall(null);}
		dto.setIdTipoComponente(Constants.TIPO_COMPONENTE_VM);
		dto.setProgressivo(ConvertUtil.convertToBigDecimal(progressivo));

		if (GenericUtil.isNotNullOrEmpty(rowVM.getL101TipologiaAltro()))
		{
			dto.setAltroTipologia(rowVM.getL101TipologiaAltro());
		}

		try{dto.setPortataMaxAriaM3h(rowVM.getL101PortataMax());}catch (Exception e) {dto.setPortataMaxAriaM3h(null);}
		try{dto.setRendimentoCop(ConvertUtil.convertToString(rowVM.getL101RendimentoRecupero()));}catch(Exception e){dto.setRendimentoCop(null);}

		if (rowVM.getL101Tipologia() != null)
		{
			switch (rowVM.getL101Tipologia().intValue()) {
			case 1: dto.setFkDettaglioVm(new BigDecimal("1"));
			break;
			case 2: dto.setFkDettaglioVm(new BigDecimal("2"));
			break;
			case 3: dto.setFkDettaglioVm(new BigDecimal("3"));
			break;
			}
		}

		return dto;
	}
	
	public static SigitTConsumoDto getSigitTConsumoNew(L141DatiConsumoCombustibile rowConsumo, BigDecimal codImpianto, BigDecimal tipoCombustibile, BigDecimal unitaMisura, String cfUtente) {
		SigitTConsumoDto dto = null;

		String acquisti = null;
		BigDecimal consumo = null;
		BigDecimal esercizioDa = null;
		BigDecimal esercizioA = null;
		BigDecimal letturaIniziale = null;
		BigDecimal letturaFinale = null;

		acquisti = GenericUtil.getStringValid(rowConsumo.getL141Acquisti());

		try{consumo = rowConsumo.getL141Consumo();}catch(Exception e){}

		try{esercizioDa = ConvertUtil.convertToBigDecimal(rowConsumo.getL141EsercizioDa());}catch(Exception e){}
		try{esercizioA = ConvertUtil.convertToBigDecimal(rowConsumo.getL141EsercizioA());}catch(Exception e){}


		try{letturaIniziale = rowConsumo.getL141LetturaIniziale();}catch(Exception e){}
		try{letturaFinale = rowConsumo.getL141LetturaFinale();}catch(Exception e){}

		if (log.isDebugEnabled())
		{
			log.debug("@@@@@@@@@@@@@@@@@@@@@@");
			log.debug("getSigitTConsumo - tipoCombustibile: "+tipoCombustibile);
			log.debug("getSigitTConsumo - unitaMisura: "+unitaMisura);
			log.debug("getSigitTConsumo - acquisti: "+acquisti);
			log.debug("getSigitTConsumo - consumo: "+consumo);
			log.debug("getSigitTConsumo - esercizioDa: "+esercizioDa);
			log.debug("getSigitTConsumo - esercizioA: "+esercizioA);
			log.debug("getSigitTConsumo - letturaIniziale: "+letturaIniziale);
			log.debug("getSigitTConsumo - letturaFinale: "+letturaFinale);
			log.debug("@@@@@@@@@@@@@@@@@@@@@@");
		}
		
		if (tipoCombustibile != null || unitaMisura != null || acquisti != null || consumo != null ||
				esercizioDa != null || esercizioA != null || letturaIniziale != null || letturaFinale != null)
		{
			dto = new SigitTConsumoDto();
			dto.setFkTipoConsumo(Constants.TIPO_CONSUMO_CB);
			dto.setFkCombustibile(tipoCombustibile);
			dto.setFkUnitaMisura(ConvertUtil.convertToString(unitaMisura));
			dto.setCodiceImpianto(codImpianto);

			dto.setAcquisti(acquisti);
			dto.setConsumo(consumo);
			dto.setEsercizioDa(esercizioDa);
			dto.setEsercizioA(esercizioA);
			dto.setLetturaIniziale(letturaIniziale);
			dto.setLetturaFinale(letturaFinale);

			log.debug("@@@ INSERISCO il SigitTConsumoDto");
			
			if (log.isDebugEnabled())
				GenericUtil.stampa(dto, true, 3);

		}


		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtente);

		return dto;
	}

	public static SigitTConsumoDto getSigitTConsumoNew(L142DatiConsumoEnergiaElettrica rowEE, BigDecimal codImpianto, String cfUtente) {
		SigitTConsumoDto dto = new SigitTConsumoDto();
		dto.setFkTipoConsumo(Constants.TIPO_CONSUMO_EE);
		dto.setCodiceImpianto(codImpianto);
		try{dto.setConsumo(rowEE.getL142Consumo());}catch(Exception e){dto.setConsumo(null);}
		try{dto.setEsercizioA(ConvertUtil.convertToBigDecimal(rowEE.getL142EsercizioDa()));}catch(Exception e){dto.setEsercizioA(null);}
		try{dto.setEsercizioDa(ConvertUtil.convertToBigDecimal(rowEE.getL142EsercizioA()));}catch(Exception e){dto.setEsercizioDa(null);}
		try{dto.setLetturaFinale(rowEE.getL142LetturaFinale());}catch(Exception e){dto.setLetturaFinale(null);}
		try{dto.setLetturaIniziale(rowEE.getL142LetturaIniziale());}catch(Exception e){dto.setLetturaIniziale(null);}

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtente);

		return dto;
	}


	public static SigitTConsumoDto getSigitTConsumoNew(L143DatiConsumoAcqua rowH2O, BigDecimal codImpianto, String unitaMisura, String cfUtente) {
		SigitTConsumoDto dto = new SigitTConsumoDto();
		dto.setFkTipoConsumo(Constants.TIPO_CONSUMO_H2O);
		dto.setCodiceImpianto(codImpianto);
		dto.setFkUnitaMisura(unitaMisura);
		try{dto.setConsumo(rowH2O.getL143Consumo());}catch(Exception e){dto.setConsumo(null);}
		try{dto.setEsercizioDa(ConvertUtil.convertToBigDecimal(rowH2O.getL143EsercizioDa()));}catch(Exception e){dto.setEsercizioDa(null);}
		try{dto.setEsercizioA(ConvertUtil.convertToBigDecimal(rowH2O.getL143EsercizioA()));}catch(Exception e){dto.setEsercizioA(null);}
		try{dto.setLetturaFinale(rowH2O.getL143LetturaFinale());}catch(Exception e){dto.setLetturaFinale(null);}
		try{dto.setLetturaIniziale(rowH2O.getL143LetturaIniziale());}catch(Exception e){dto.setLetturaIniziale(null);}

		dto.setDataUltMod(DateUtil.getSqlDataCorrente());
		dto.setUtenteUltMod(cfUtente);

		return dto;
	}

	public static SigitTConsumo14_4Dto getSigitTConsumo144New(L144DatiConsumoProdottiChimici rowPC, BigDecimal codImpianto, String cfUtenteMod) {
		SigitTConsumo14_4Dto dto = new SigitTConsumo14_4Dto();
		dto.setCodiceImpianto(codImpianto);
		dto.setFkUnitaMisura(ConvertUtil.convertToString(rowPC.getL144UnitaMisura()));
		try{dto.setEsercizioDa(ConvertUtil.convertToBigDecimal(rowPC.getL144EsercizioDa()));}catch(Exception e){dto.setEsercizioDa(null);}
		try{dto.setEsercizioA(ConvertUtil.convertToBigDecimal(rowPC.getL144EsercizioA()));}catch(Exception e){dto.setEsercizioA(null);}
		dto.setFlgAca(ConvertUtil.convertToBigDecimal(rowPC.getL144CircuitoAltro()));
		dto.setFlgCircuitoAcs(ConvertUtil.convertToBigDecimal(rowPC.getL144CircuitoACS()));
		dto.setFlgCircuitoIt(ConvertUtil.convertToBigDecimal(rowPC.getL144CircuitoImpiantoTermico()));
		dto.setNomeProdotto(rowPC.getL144NomeProdotto());
		try{dto.setQtaConsumata(rowPC.getL144Consumo());}catch(Exception e){dto.setQtaConsumata(null);}

		dto.setUtenteUltMod(cfUtenteMod);
		dto.setDataUltMod(DateUtil.getSqlDataCorrente());

		return dto;
	}
	

}


