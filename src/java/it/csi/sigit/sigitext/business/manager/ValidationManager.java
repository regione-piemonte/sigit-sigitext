/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.manager;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.ImportFilter;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitRComp4ManutDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTPersonaGiuridicaDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVSk4CgDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVSk4GfDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVSk4GtDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVSk4ScDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.MarcaCITDaoException;
import it.csi.sigit.sigitext.business.util.ComparatorDto;
import it.csi.sigit.sigitext.business.util.ComparatorUtil;
import it.csi.sigit.sigitext.business.util.Constants;
import it.csi.sigit.sigitext.business.util.ConvertUtil;
import it.csi.sigit.sigitext.business.util.DateUtil;
import it.csi.sigit.sigitext.business.util.GenericUtil;
import it.csi.sigit.sigitext.business.util.MapDto;
import it.csi.sigit.sigitext.business.util.Messages;
import it.csi.sigit.sigitext.business.util.XmlBeanUtils;
import it.csi.sigit.sigitext.business.util.XmlValidator;
import it.csi.sigit.sigitext.business.util.exception.XmlValidatorException;
import it.csi.sigit.sigitext.dto.sigitext.DettaglioAllegato;
import it.csi.sigit.sigitext.dto.sigitext.TipoImportAllegatoEnum;
import it.csi.sigit.sigitext.exception.sigitext.SigitextException;
import it.csi.sigit.sigitwebn.xml.importmassivo.allegato2.data.DatiManutentoreDocument.DatiManutentore;
import it.csi.sigit.sigitwebn.xml.importmassivo.allegato2.data.Portata;
import it.csi.sigit.sigitwebn.xml.importmassivo.allegato2.data.RowAllegatoIIDocument.RowAllegatoII;
import it.csi.sigit.sigitwebn.xml.importmassivo.allegato3.data.RowAllegatoIIIDocument.RowAllegatoIII;
import it.csi.sigit.sigitwebn.xml.importmassivo.allegato4.data.RowAllegatoIVDocument.RowAllegatoIV;
import it.csi.sigit.sigitwebn.xml.importmassivo.allegato5.data.RowAllegatoVDocument.RowAllegatoV;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L101VentilazioneMeccanicaDocument.L101VentilazioneMeccanica;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L101VentilazioneMeccanicaSostituitoDocument.L101VentilazioneMeccanicaSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L10VentilazioneDocument.L10Ventilazione;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L10VentilazioneDocument.L10Ventilazione.L101VM;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L144DatiConsumoProdottiChimiciDocument.L144DatiConsumoProdottiChimici;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L14ConsumiDocument.L14Consumi;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L14ConsumiDocument.L14Consumi.L141ConsumoCombustibile;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L1SchedaIdentificativaDocument.L1SchedaIdentificativa;
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
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L4GeneratoriDocument.L4Generatori;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L4GeneratoriDocument.L4Generatori.L41GT;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L4GeneratoriDocument.L4Generatori.L42BR;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L4GeneratoriDocument.L4Generatori.L43RC;
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
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L5SistemiRegolazioneContabilizzazioneDocument.L5SistemiRegolazioneContabilizzazione.L51SR;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L5SistemiRegolazioneContabilizzazioneDocument.L5SistemiRegolazioneContabilizzazione.L51VR;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L64PompaDocument.L64Pompa;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L64PompaSostituitoDocument.L64PompaSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L6SistemiDistribuzioneDocument.L6SistemiDistribuzione;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L6SistemiDistribuzioneDocument.L6SistemiDistribuzione.L63VX;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L6SistemiDistribuzioneDocument.L6SistemiDistribuzione.L64PO;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L7SistemiEmissioneDocument.L7SistemiEmissione;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L81AccumuloDocument.L81Accumulo;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L81AccumuloSostituitoDocument.L81AccumuloSostituito;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L8SistemiAccumuloDocument.L8SistemiAccumulo;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L8SistemiAccumuloDocument.L8SistemiAccumulo.L81AC;
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
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L9AltriComponentiDocument.L9AltriComponenti;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L9AltriComponentiDocument.L9AltriComponenti.L91TE;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L9AltriComponentiDocument.L9AltriComponenti.L92RV;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L9AltriComponentiDocument.L9AltriComponenti.L93SCX;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L9AltriComponentiDocument.L9AltriComponenti.L94CI;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L9AltriComponentiDocument.L9AltriComponenti.L95UT;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.L9AltriComponentiDocument.L9AltriComponenti.L96RCX;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.LibrettoCatastoDocument.LibrettoCatasto;
import it.csi.sigit.sigitwebn.xml.importmassivo.libretto.data.LibrettoDocument;

public class ValidationManager {

	protected static final Logger log = Logger.getLogger(Constants.APPLICATION_CODE + ".SigitextManager==>");

	private DbServiceImp serviceDb;
	
	public DbServiceImp getDbServiceImp() {
		return serviceDb;
	}

	public void setDbServiceImp(DbServiceImp serviceDb) {
		this.serviceDb = serviceDb;
	}
	
	public LibrettoDocument validazioneXmlImportLibretto(byte[] xml) throws SigitextException {
		log.debug("validazioneXmlImport START");
		String schemasDir = "schemaorg_apache_xmlbeans/src/src/adobe/schemas/";
		String librettoSchema = schemasDir + Constants.FILE_IMPORT_LIBRETTO;

		try {
			
			String readXml = XmlBeanUtils.readByteArray(xml);

			Reader xmlReader = new StringReader(readXml);
			
			log.debug("Stampo il readFile: " + readXml);

			LibrettoDocument document = null;
			LibrettoCatasto richiesta = null;

			log.debug("lettura xml del libretto");

			InputStreamReader xmlSchemaReader = new InputStreamReader(GenericUtil.getFileInClassPath(librettoSchema));
			XmlValidator.validate(xmlReader, xmlSchemaReader);
			
			document = MapDto.mapToLibrettoDocument(xml);
			log.debug("convertito xml in java");
			richiesta = document.getLibretto().getLibrettoCatasto();

			validazioneL1SchedaIdentificativa(richiesta);
			validazioneL4Generatori(richiesta);
			validazioneL5SistemiRegolazioneContabilizzazione(richiesta);
			validazioneL6Pompa(richiesta);
			validazioneL7SistemiEmissione(richiesta);
			validazioneL8Accumulo(richiesta);
			validazioneL9TeRvScxCiUtRcx(richiesta);
			validazioneL10VentilazioneMeccanica(richiesta);

			// Verifico i valori delle combo, non validati nei punti successivi
			validazioneComboXml(richiesta);

			log.debug("STAMPO IL DOCUMENT IMPORTATO - ordinato:");
			log.debug(document);

			return document;
		} catch (IOException e) {
			log.error("Errore: ", e);
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S096,  Constants.ESTENSIONE_XML));
		} catch (XmlValidatorException e) {
			log.debug("errore validazione xml", e);
			throw new SigitextException(Messages.S098);
		} catch (Exception e) {
			log.debug("errore validazione xml", e);
			throw new SigitextException(e.getMessage());
		}

		finally {
			log.debug("validazioneXmlImport END");
		}
	}

	private void validazioneL1SchedaIdentificativa(LibrettoCatasto richiesta) throws SigitextException {
		L1SchedaIdentificativa l1SchedaIdent = richiesta.getL1SchedaIdentificativa();

		if (!l1SchedaIdent.getL14FluidoAcqua() && !l1SchedaIdent.getL14FluidoAria()
				&& GenericUtil.isNullOrEmpty(l1SchedaIdent.getL14FluidoAltro())) {
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S137, "1.4"));
		}

		if (!l1SchedaIdent.getL15TipoGeneratore() && !l1SchedaIdent.getL15TipoPompa()
				&& !l1SchedaIdent.getL15TipoFrigo() && !l1SchedaIdent.getL15TipoTelerisc()
				&& !l1SchedaIdent.getL15TipoTeleraff() && !l1SchedaIdent.getL15TipoCogen()
				&& GenericUtil.isNullOrEmpty(l1SchedaIdent.getL15TipoAltro())) {
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S137, "1.5"));
		}
	}

	private void validazioneL4Generatori(LibrettoCatasto richiesta) throws SigitextException {
		L4Generatori l4Generatori = richiesta.getL4Generatori();

		// L4_1GT - L4_2BR - L4_3RC
		validazioneL4GtBrRc(l4Generatori);

		validazioneL4GfScCgCsAg(l4Generatori);
	}

	private void validazioneL4GtBrRc(L4Generatori l4Generatori) throws SigitextException {
		// Devo verificare le date
		// devo ordinare le sostituite per data installazione

		// L4_generatori

		if (l4Generatori != null) {

			List<L41GT> l41GTList = l4Generatori.getL41GTList();
			List<L42BR> l42BRList = l4Generatori.getL42BRList();
			List<L43RC> l43RCList = l4Generatori.getL43RCList();

			String numComponente = null;
			List<ComparatorDto> compList = new ArrayList<ComparatorDto>();

			// Devo verificare che gli elementi BR E RC abbiano come riferimento un GT
			// presente nel'xml

			boolean isPresente = false;
			int gtCollegato = 0;
			int numeroComp = 0;
			if (l42BRList != null && l42BRList.size() > 0) {
				for (L42BR l42BR : l42BRList) {

					numeroComp = l42BR.getL42Numero().intValue();

					// Recupero il GT collegato
					gtCollegato = l42BR.getL42GtCollegato().intValue();

					// Ciclo per tutti i GT, per cercare quello collegato
					for (L41GT l41GT : l41GTList) {
						if (gtCollegato == l41GT.getL41Numero().intValue()) {
							isPresente = true;
							break;
						}
					}

					if (!isPresente) {
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S132, Constants.TIPO_COMPONENTE_BR,
								ConvertUtil.convertToString(numeroComp), ConvertUtil.convertToString(gtCollegato)));
					}
				}
			}

			if (l43RCList != null && l43RCList.size() > 0) {
				isPresente = false;
				gtCollegato = 0;
				numeroComp = 0;

				for (L43RC l43RC : l43RCList) {

					numeroComp = l43RC.getL43Numero().intValue();

					// Recupero il GT collegato
					gtCollegato = l43RC.getL43GtCollegato().intValue();

					// Ciclo per tutti i GT, per cercare quello collegato
					for (L41GT l41GT : l41GTList) {
						if (gtCollegato == l41GT.getL41Numero().intValue()) {
							isPresente = true;
							break;
						}
					}

					if (!isPresente) {
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S132, Constants.TIPO_COMPONENTE_RC,
								ConvertUtil.convertToString(numeroComp), ConvertUtil.convertToString(gtCollegato)));
					}
				}
			}

			// Verifico che ci siano delle GT
			if (l41GTList != null && l41GTList.size() > 0) {
				for (L41GT l41Gt : l41GTList) {

					numComponente = ConvertUtil.convertToString(l41Gt.getL41Numero());

					L41GruppoTermico l41GruppoTermico = l41Gt.getL41GruppoTermico();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_GT, numComponente,
							l41GruppoTermico.getL41DataInstallazione(), l41GruppoTermico.getL41DataDismissione());

					// Verifico i valori delle combo
					validazioneMarca(l41GruppoTermico.getL41Fabbricante());
					validazioneCombustibile(l41GruppoTermico.getL41Combustibile());
					validazioneFluido(l41GruppoTermico.getL41Fluido());

					List<L41GruppoTermicoSostituito> l41GruppoTermicoSostListOrig = l41Gt
							.getL41GruppoTermicoSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l41GruppoTermicoSostListOrig != null && l41GruppoTermicoSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto L51SistemaRegolazioneSostituito non funziona
						for (int i = 0; i < l41GruppoTermicoSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l41GruppoTermicoSostListOrig.get(i).getL41DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// L51SistemaRegolazioneSostituito ordinati
						L41GruppoTermicoSostituito[] l41GruppoTermicoSostArray = new L41GruppoTermicoSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l41GruppoTermicoSostArray[i] = l41GruppoTermicoSostListOrig
									.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l41Gt.setL41GruppoTermicoSostituitoArray(l41GruppoTermicoSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L41GruppoTermicoSostituito> l41GruppoTermicoSostListNew = l41Gt
								.getL41GruppoTermicoSostituitoList();

						int listSize = l41GruppoTermicoSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L41GruppoTermicoSostituito l41GruppoTermicoSost = l41GruppoTermicoSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_GT, numComponente,
										l41GruppoTermicoSost.getL41DataDismissione(),
										l41GruppoTermico.getL41DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_GT, numComponente,
									l41GruppoTermicoSost.getL41DataInstallazione(),
									l41GruppoTermicoSost.getL41DataDismissione());
							// DateUtil.checkDateOrder(l51SistRegSost.getL51DataInstallazione(),
							// l51SistRegSost.getL51DataDismissione(), true);

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_GT, numComponente,
										l41GruppoTermicoSostListNew.get(i + 1).getL41DataInstallazione(),
										l41GruppoTermicoSost.getL41DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_GT, numComponente,
										l41GruppoTermicoSostListNew.get(i + 1).getL41DataInstallazione(),
										l41GruppoTermicoSost.getL41DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_GT, numComponente,
										l41GruppoTermicoSostListNew.get(i + 1).getL41DataDismissione(),
										l41GruppoTermicoSost.getL41DataDismissione());

							}

							// Verifico i valori delle combo
							validazioneMarca(l41GruppoTermicoSost.getL41Fabbricante());
							validazioneCombustibile(l41GruppoTermicoSost.getL41Combustibile());
							validazioneFluido(l41GruppoTermicoSost.getL41Fluido());
						}

					}
				}

				// Pulisco la lista
				compList.clear();

				// DEVO CONSIDERARE CHE GLI ELEMENTI BR E RC HANNO DEI PUNTAMENTI CON IL GT
				// (quindi devo verificare che il numero dei BR e RC sia corrispondente ad uno
				// presente nei GT)

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L41GruppoTermicoSostituito non funziona
				for (int j = 0; j < l41GTList.size(); j++) {
					compList.add(new ComparatorDto(j, l41GTList.get(j).getL41Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L41GT
				// ordinati
				L41GT[] l41GTArray = new L41GT[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l41GTArray[i] = l41GTList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l4Generatori.setL41GTArray(l41GTArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L41GT> l41GTListNew = l4Generatori.getL41GTList();

				// Devo rinominare il progressivo (L41Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				// Devo rinominare anche le componenti BR e RC collegate al GT che sto
				// rinominando
				int count = 1;
				int numeroCompGtOld = 0;
				for (L41GT l51Sr : l41GTListNew) {
					numeroCompGtOld = l51Sr.getL41Numero().intValue();

					for (L42BR l42Br : l42BRList) {

						if (l42Br.getL42GtCollegato().intValue() == numeroCompGtOld) {
							l42Br.setL42GtCollegato(ConvertUtil.convertToBigInteger(count));
						}
					}

					for (L43RC l43Rc : l43RCList) {

						if (l43Rc.getL43GtCollegato().intValue() == numeroCompGtOld) {
							l43Rc.setL43GtCollegato(ConvertUtil.convertToBigInteger(count));
						}
					}

					l51Sr.setL41Numero(ConvertUtil.convertToBigInteger(count++));
				}

			}

			// Verifico che ci siano delle BR
			if (l42BRList != null && l42BRList.size() > 0) {
				for (L42BR l42Br : l42BRList) {

					numComponente = ConvertUtil.convertToString(l42Br.getL42Numero());

					L42Bruciatore l42Bruciatore = l42Br.getL42Bruciatore();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_BR, numComponente,
							l42Bruciatore.getL42DataInstallazione(), l42Bruciatore.getL42DataDismissione());

					// Verifico i valori delle combo
					validazioneMarca(l42Bruciatore.getL42Fabbricante());
					validazioneCombustibile(l42Bruciatore.getL42Combustibile());

					List<L42BruciatoreSostituito> l42BruciatoreSostListOrig = l42Br.getL42BruciatoreSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l42BruciatoreSostListOrig != null && l42BruciatoreSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l42BruciatoreSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l42BruciatoreSostListOrig.get(i).getL42DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L42BruciatoreSostituito[] l42BruciatoreSostArray = new L42BruciatoreSostituito[compList.size()];

						for (int i = 0; i < compList.size(); i++) {
							l42BruciatoreSostArray[i] = l42BruciatoreSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l42Br.setL42BruciatoreSostituitoArray(l42BruciatoreSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L42BruciatoreSostituito> l42BruciatoreSostListNew = l42Br.getL42BruciatoreSostituitoList();

						int listSize = l42BruciatoreSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L42BruciatoreSostituito l42BruciatoreSost = l42BruciatoreSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_BR, numComponente,
										l42BruciatoreSost.getL42DataDismissione(),
										l42Bruciatore.getL42DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_BR, numComponente,
									l42BruciatoreSost.getL42DataInstallazione(),
									l42BruciatoreSost.getL42DataDismissione());
							// DateUtil.checkDateOrder(l51SistRegSost.getL51DataInstallazione(),
							// l51SistRegSost.getL51DataDismissione(), true);

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_BR, numComponente,
										l42BruciatoreSostListNew.get(i + 1).getL42DataInstallazione(),
										l42BruciatoreSost.getL42DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_BR, numComponente,
										l42BruciatoreSostListNew.get(i + 1).getL42DataInstallazione(),
										l42BruciatoreSost.getL42DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_BR, numComponente,
										l42BruciatoreSostListNew.get(i + 1).getL42DataDismissione(),
										l42BruciatoreSost.getL42DataDismissione());

							}

							// Verifico i valori delle combo
							validazioneMarca(l42BruciatoreSost.getL42Fabbricante());
							validazioneCombustibile(l42BruciatoreSost.getL42Combustibile());
						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L42BruciatoreSostituito non funziona
				for (int j = 0; j < l42BRList.size(); j++) {
					compList.add(new ComparatorDto(j, l42BRList.get(j).getL42Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L42BR
				// ordinati
				L42BR[] l42BRArray = new L42BR[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l42BRArray[i] = l42BRList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l4Generatori.setL42BRArray(l42BRArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L42BR> l42BRListNew = l4Generatori.getL42BRList();

				// Devo rinominare il progressivo (L42Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L42BR l42Br : l42BRListNew) {

					l42Br.setL42Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}

			// Verifico che ci siano delle RC
			if (l43RCList != null && l43RCList.size() > 0) {
				for (L43RC l43Rc : l43RCList) {

					numComponente = ConvertUtil.convertToString(l43Rc.getL43Numero());

					L43Recuperatore l43Recuperatore = l43Rc.getL43Recuperatore();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_RC, numComponente,
							l43Recuperatore.getL43DataInstallazione(), l43Recuperatore.getL43DataDismissione());

					// Verifico i valori delle combo
					validazioneMarca(l43Recuperatore.getL43Fabbricante());

					List<L43RecuperatoreSostituito> l43RecuperatoreSostListOrig = l43Rc
							.getL43RecuperatoreSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l43RecuperatoreSostListOrig != null && l43RecuperatoreSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto L43RecuperatoreSostituito non funziona
						for (int i = 0; i < l43RecuperatoreSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l43RecuperatoreSostListOrig.get(i).getL43DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// L51SistemaRegolazioneSostituito ordinati
						L43RecuperatoreSostituito[] l43RecuperatoreSostArray = new L43RecuperatoreSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l43RecuperatoreSostArray[i] = l43RecuperatoreSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l43Rc.setL43RecuperatoreSostituitoArray(l43RecuperatoreSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L43RecuperatoreSostituito> l43RecuperatoreSostListNew = l43Rc
								.getL43RecuperatoreSostituitoList();

						int listSize = l43RecuperatoreSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L43RecuperatoreSostituito l43RecuperatoreSost = l43RecuperatoreSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_RC, numComponente,
										l43RecuperatoreSost.getL43DataDismissione(),
										l43Recuperatore.getL43DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_RC, numComponente,
									l43RecuperatoreSost.getL43DataInstallazione(),
									l43RecuperatoreSost.getL43DataDismissione());
							// DateUtil.checkDateOrder(l51SistRegSost.getL51DataInstallazione(),
							// l51SistRegSost.getL51DataDismissione(), true);

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_RC, numComponente,
										l43RecuperatoreSostListNew.get(i + 1).getL43DataInstallazione(),
										l43RecuperatoreSost.getL43DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_RC, numComponente,
										l43RecuperatoreSostListNew.get(i + 1).getL43DataInstallazione(),
										l43RecuperatoreSost.getL43DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_RC, numComponente,
										l43RecuperatoreSostListNew.get(i + 1).getL43DataDismissione(),
										l43RecuperatoreSost.getL43DataDismissione());

							}

							// Verifico i valori delle combo
							validazioneMarca(l43RecuperatoreSost.getL43Fabbricante());

						}

					}
				}

				// Pulisco la lista
				compList.clear();

				// DEVO CONSIDERARE CHE GLI ELEMENTI BR E RC HANNO DEI PUNTAMENTI CON IL GT
				// (quindi devo verificare che il numero dei BR e RC sia corrispondente ad uno
				// presente nei GT)

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L51SistemaRegolazioneSostituito non funziona
				for (int j = 0; j < l43RCList.size(); j++) {
					compList.add(new ComparatorDto(j, l43RCList.get(j).getL43Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L51SR
				// ordinati
				L43RC[] l43RCArray = new L43RC[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l43RCArray[i] = l43RCList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l4Generatori.setL43RCArray(l43RCArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L43RC> l43RCListNew = l4Generatori.getL43RCList();

				// Devo rinominare il progressivo (L51Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L43RC l43Rc : l43RCListNew) {

					l43Rc.setL43Numero(ConvertUtil.convertToBigInteger(count++));
				}

			}
		}
	}

	private void validazioneL4GfScCgCsAg(L4Generatori l4Generatori) throws SigitextException {
		// Devo verificare le date
		// devo ordinare le sostituite per data installazione

		// L4_generatori

		if (l4Generatori != null) {

			List<L44GF> l44GFList = l4Generatori.getL44GFList();
			List<L45SC> l45SCList = l4Generatori.getL45SCList();
			List<L46CG> l46CGList = l4Generatori.getL46CGList();
			List<L47CS> l47CSList = l4Generatori.getL47CSList();
			List<L48AG> l48AGList = l4Generatori.getL48AGList();

			String numComponente = null;
			List<ComparatorDto> compList = new ArrayList<ComparatorDto>();

			// Verifico che ci siano delle GF
			if (l44GFList != null && l44GFList.size() > 0) {
				for (L44GF l44Gf : l44GFList) {

					numComponente = ConvertUtil.convertToString(l44Gf.getL44Numero());

					L44GruppoFrigo l44GruppoFrigo = l44Gf.getL44GruppoFrigo();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_GF, numComponente,
							l44GruppoFrigo.getL44DataInstallazione(), l44GruppoFrigo.getL44DataDismissione());

					// Verifico i valori delle combo
					validazioneMarca(l44GruppoFrigo.getL44Fabbricante());

					if (l44GruppoFrigo.getL44CombustibileAssorbimentoFiammaDiretta() != 0) {
						validazioneCombustibile(l44GruppoFrigo.getL44CombustibileAssorbimentoFiammaDiretta());
					}

					List<L44GruppoFrigoSostituito> l44GruppoFrigoSostListOrig = l44Gf.getL44GruppoFrigoSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l44GruppoFrigoSostListOrig != null && l44GruppoFrigoSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l44GruppoFrigoSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l44GruppoFrigoSostListOrig.get(i).getL44DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L44GruppoFrigoSostituito[] l44GruppoFrigoSostArray = new L44GruppoFrigoSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l44GruppoFrigoSostArray[i] = l44GruppoFrigoSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l44Gf.setL44GruppoFrigoSostituitoArray(l44GruppoFrigoSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L44GruppoFrigoSostituito> l44GruppoFrigoSostListNew = l44Gf
								.getL44GruppoFrigoSostituitoList();

						int listSize = l44GruppoFrigoSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L44GruppoFrigoSostituito l44GruppoFrigoSost = l44GruppoFrigoSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_GF, numComponente,
										l44GruppoFrigoSost.getL44DataDismissione(),
										l44GruppoFrigo.getL44DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_GF, numComponente,
									l44GruppoFrigoSost.getL44DataInstallazione(),
									l44GruppoFrigoSost.getL44DataDismissione());
							// DateUtil.checkDateOrder(l51SistRegSost.getL51DataInstallazione(),
							// l51SistRegSost.getL51DataDismissione(), true);

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_GF, numComponente,
										l44GruppoFrigoSostListNew.get(i + 1).getL44DataInstallazione(),
										l44GruppoFrigoSost.getL44DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_GF, numComponente,
										l44GruppoFrigoSostListNew.get(i + 1).getL44DataInstallazione(),
										l44GruppoFrigoSost.getL44DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_GF, numComponente,
										l44GruppoFrigoSostListNew.get(i + 1).getL44DataDismissione(),
										l44GruppoFrigoSost.getL44DataDismissione());

							}

							// Verifico i valori delle combo
							validazioneMarca(l44GruppoFrigoSost.getL44Fabbricante());

							if (l44GruppoFrigoSost.getL44CombustibileAssorbimentoFiammaDiretta() != 0) {
								validazioneCombustibile(
										l44GruppoFrigoSost.getL44CombustibileAssorbimentoFiammaDiretta());
							}
						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L44GruppoFrigoSostituito non funziona
				for (int j = 0; j < l44GFList.size(); j++) {
					compList.add(new ComparatorDto(j, l44GFList.get(j).getL44Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L44GF
				// ordinati
				L44GF[] l44GFArray = new L44GF[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l44GFArray[i] = l44GFList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l4Generatori.setL44GFArray(l44GFArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L44GF> l44GFListNew = l4Generatori.getL44GFList();

				// Devo rinominare il progressivo (L42Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L44GF l44Gf : l44GFListNew) {

					l44Gf.setL44Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}

			// Verifico che ci siano delle SC
			if (l45SCList != null && l45SCList.size() > 0) {
				for (L45SC l45Sc : l45SCList) {

					numComponente = ConvertUtil.convertToString(l45Sc.getL45Numero());

					L45Scambiatore l45Scambiatore = l45Sc.getL45Scambiatore();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_SC, numComponente,
							l45Scambiatore.getL45DataInstallazione(), l45Scambiatore.getL45DataDismissione());

					// Verifico i valori delle combo
					validazioneMarca(l45Scambiatore.getL45Fabbricante());

					List<L45ScambiatoreSostituito> l45ScambiatoreSostListOrig = l45Sc.getL45ScambiatoreSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l45ScambiatoreSostListOrig != null && l45ScambiatoreSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l45ScambiatoreSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l45ScambiatoreSostListOrig.get(i).getL45DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L45ScambiatoreSostituito[] l45ScambiatoreSostArray = new L45ScambiatoreSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l45ScambiatoreSostArray[i] = l45ScambiatoreSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l45Sc.setL45ScambiatoreSostituitoArray(l45ScambiatoreSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L45ScambiatoreSostituito> l45ScambiatoreSostListNew = l45Sc
								.getL45ScambiatoreSostituitoList();

						int listSize = l45ScambiatoreSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L45ScambiatoreSostituito l45ScambiatoreSost = l45ScambiatoreSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_SC, numComponente,
										l45ScambiatoreSost.getL45DataDismissione(),
										l45Scambiatore.getL45DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_SC, numComponente,
									l45ScambiatoreSost.getL45DataInstallazione(),
									l45ScambiatoreSost.getL45DataDismissione());
							// DateUtil.checkDateOrder(l51SistRegSost.getL51DataInstallazione(),
							// l51SistRegSost.getL51DataDismissione(), true);

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_SC, numComponente,
										l45ScambiatoreSostListNew.get(i + 1).getL45DataInstallazione(),
										l45ScambiatoreSost.getL45DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_SC, numComponente,
										l45ScambiatoreSostListNew.get(i + 1).getL45DataInstallazione(),
										l45ScambiatoreSost.getL45DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_SC, numComponente,
										l45ScambiatoreSostListNew.get(i + 1).getL45DataDismissione(),
										l45ScambiatoreSost.getL45DataDismissione());

							}

							// Verifico i valori delle combo
							validazioneMarca(l45ScambiatoreSost.getL45Fabbricante());

						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L45ScambiatoreSostituito non funziona
				for (int j = 0; j < l45SCList.size(); j++) {
					compList.add(new ComparatorDto(j, l45SCList.get(j).getL45Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L42BR
				// ordinati
				L45SC[] l45SCArray = new L45SC[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l45SCArray[i] = l45SCList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l4Generatori.setL45SCArray(l45SCArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L45SC> l45SCListNew = l4Generatori.getL45SCList();

				// Devo rinominare il progressivo (L42Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L45SC l45Sc : l45SCListNew) {

					l45Sc.setL45Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}

			// Verifico che ci siano delle CG
			if (l46CGList != null && l46CGList.size() > 0) {
				for (L46CG l46Cg : l46CGList) {

					numComponente = ConvertUtil.convertToString(l46Cg.getL46Numero());

					L46Cogeneratore l46Cogeneratore = l46Cg.getL46Cogeneratore();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_CG, numComponente,
							l46Cogeneratore.getL46DataInstallazione(), l46Cogeneratore.getL46DataDismissione());

					// Verifico i valori delle combo
					validazioneMarca(l46Cogeneratore.getL46Fabbricante());
					validazioneCombustibile(l46Cogeneratore.getL46Alimentazione());

					List<L46CogeneratoreSostituito> l46CogeneratoreSostListOrig = l46Cg
							.getL46CogeneratoreSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l46CogeneratoreSostListOrig != null && l46CogeneratoreSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l46CogeneratoreSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l46CogeneratoreSostListOrig.get(i).getL46DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L46CogeneratoreSostituito[] l46CogeneratoreSostArray = new L46CogeneratoreSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l46CogeneratoreSostArray[i] = l46CogeneratoreSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l46Cg.setL46CogeneratoreSostituitoArray(l46CogeneratoreSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L46CogeneratoreSostituito> l46CogeneratoreSostListNew = l46Cg
								.getL46CogeneratoreSostituitoList();

						int listSize = l46CogeneratoreSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L46CogeneratoreSostituito l46CogeneratoreSost = l46CogeneratoreSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_CG, numComponente,
										l46CogeneratoreSost.getL46DataDismissione(),
										l46Cogeneratore.getL46DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_CG, numComponente,
									l46CogeneratoreSost.getL46DataInstallazione(),
									l46CogeneratoreSost.getL46DataDismissione());
							// DateUtil.checkDateOrder(l51SistRegSost.getL51DataInstallazione(),
							// l51SistRegSost.getL51DataDismissione(), true);

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_CG, numComponente,
										l46CogeneratoreSostListNew.get(i + 1).getL46DataInstallazione(),
										l46CogeneratoreSost.getL46DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_CG, numComponente,
										l46CogeneratoreSostListNew.get(i + 1).getL46DataInstallazione(),
										l46CogeneratoreSost.getL46DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_CG, numComponente,
										l46CogeneratoreSostListNew.get(i + 1).getL46DataDismissione(),
										l46CogeneratoreSost.getL46DataDismissione());

							}

							// Verifico i valori delle combo
							validazioneMarca(l46CogeneratoreSost.getL46Fabbricante());
							validazioneCombustibile(l46CogeneratoreSost.getL46Alimentazione());
						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L46CogeneratoreSostituito non funziona
				for (int j = 0; j < l46CGList.size(); j++) {
					compList.add(new ComparatorDto(j, l46CGList.get(j).getL46Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L46CG
				// ordinati
				L46CG[] l46CGArray = new L46CG[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l46CGArray[i] = l46CGList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l4Generatori.setL46CGArray(l46CGArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L46CG> l46CGListNew = l4Generatori.getL46CGList();

				// Devo rinominare il progressivo (L46Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L46CG l46Cg : l46CGListNew) {

					l46Cg.setL46Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}

			// Verifico che ci siano delle CS
			if (l47CSList != null && l47CSList.size() > 0) {
				for (L47CS l47Cs : l47CSList) {

					numComponente = ConvertUtil.convertToString(l47Cs.getL47Numero());

					L47CampoSolareTermico l47CamSolTer = l47Cs.getL47CampoSolareTermico();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_CS, numComponente,
							l47CamSolTer.getL47DataInstallazione(), l47CamSolTer.getL47DataDismissione());

					// Verifico i valori delle combo
					validazioneMarca(l47CamSolTer.getL47Fabbricante());

					List<L47CampoSolareTermicoSostituito> l47CamSolTerSostListOrig = l47Cs
							.getL47CampoSolareTermicoSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l47CamSolTerSostListOrig != null && l47CamSolTerSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l47CamSolTerSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l47CamSolTerSostListOrig.get(i).getL47DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L47CampoSolareTermicoSostituito[] l47CamSolTerSostArray = new L47CampoSolareTermicoSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l47CamSolTerSostArray[i] = l47CamSolTerSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l47Cs.setL47CampoSolareTermicoSostituitoArray(l47CamSolTerSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L47CampoSolareTermicoSostituito> l47CamSolTerSostListNew = l47Cs
								.getL47CampoSolareTermicoSostituitoList();

						int listSize = l47CamSolTerSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L47CampoSolareTermicoSostituito l47CamSolTerSost = l47CamSolTerSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_CS, numComponente,
										l47CamSolTerSost.getL47DataDismissione(),
										l47CamSolTer.getL47DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_CS, numComponente,
									l47CamSolTerSost.getL47DataInstallazione(),
									l47CamSolTerSost.getL47DataDismissione());
							// DateUtil.checkDateOrder(l51SistRegSost.getL51DataInstallazione(),
							// l51SistRegSost.getL51DataDismissione(), true);

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_CS, numComponente,
										l47CamSolTerSostListNew.get(i + 1).getL47DataInstallazione(),
										l47CamSolTerSost.getL47DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_CS, numComponente,
										l47CamSolTerSostListNew.get(i + 1).getL47DataInstallazione(),
										l47CamSolTerSost.getL47DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_CS, numComponente,
										l47CamSolTerSostListNew.get(i + 1).getL47DataDismissione(),
										l47CamSolTerSost.getL47DataDismissione());

							}

							// Verifico i valori delle combo
							validazioneMarca(l47CamSolTerSost.getL47Fabbricante());
						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L47CampoSolareTerSostituito non funziona
				for (int j = 0; j < l47CSList.size(); j++) {
					compList.add(new ComparatorDto(j, l47CSList.get(j).getL47Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L42BR
				// ordinati
				L47CS[] l47CSArray = new L47CS[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l47CSArray[i] = l47CSList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l4Generatori.setL47CSArray(l47CSArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L47CS> l47CSListNew = l4Generatori.getL47CSList();

				// Devo rinominare il progressivo (L42Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L47CS l47Cs : l47CSListNew) {

					l47Cs.setL47Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}

			// Verifico che ci siano delle AG
			if (l48AGList != null && l48AGList.size() > 0) {
				for (L48AG l49Ag : l48AGList) {

					numComponente = ConvertUtil.convertToString(l49Ag.getL48Numero());

					L48AltroGeneratore l48AltroGeneratore = l49Ag.getL48AltroGeneratore();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_AG, numComponente,
							l48AltroGeneratore.getL48DataInstallazione(), l48AltroGeneratore.getL48DataDismissione());

					// Verifico i valori delle combo
					validazioneMarca(l48AltroGeneratore.getL48Fabbricante());

					List<L48AltroGeneratoreSostituito> l48AltroGeneratoreSostListOrig = l49Ag
							.getL48AltroGeneratoreSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l48AltroGeneratoreSostListOrig != null && l48AltroGeneratoreSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l48AltroGeneratoreSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l48AltroGeneratoreSostListOrig.get(i).getL48DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L48AltroGeneratoreSostituito[] l48AltroGeneratoreSostArray = new L48AltroGeneratoreSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l48AltroGeneratoreSostArray[i] = l48AltroGeneratoreSostListOrig
									.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l49Ag.setL48AltroGeneratoreSostituitoArray(l48AltroGeneratoreSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L48AltroGeneratoreSostituito> l48AltroGeneratoreSostListNew = l49Ag
								.getL48AltroGeneratoreSostituitoList();

						int listSize = l48AltroGeneratoreSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L48AltroGeneratoreSostituito l48AltroGeneratoreSost = l48AltroGeneratoreSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_AG, numComponente,
										l48AltroGeneratoreSost.getL48DataDismissione(),
										l48AltroGeneratore.getL48DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_AG, numComponente,
									l48AltroGeneratoreSost.getL48DataInstallazione(),
									l48AltroGeneratoreSost.getL48DataDismissione());
							// DateUtil.checkDateOrder(l51SistRegSost.getL51DataInstallazione(),
							// l51SistRegSost.getL51DataDismissione(), true);

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_AG, numComponente,
										l48AltroGeneratoreSostListNew.get(i + 1).getL48DataInstallazione(),
										l48AltroGeneratoreSost.getL48DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_AG, numComponente,
										l48AltroGeneratoreSostListNew.get(i + 1).getL48DataInstallazione(),
										l48AltroGeneratoreSost.getL48DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_AG, numComponente,
										l48AltroGeneratoreSostListNew.get(i + 1).getL48DataDismissione(),
										l48AltroGeneratoreSost.getL48DataDismissione());

							}

							// Verifico i valori delle combo
							validazioneMarca(l48AltroGeneratoreSost.getL48Fabbricante());

						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L48AltroGeneratoreSostituito non funziona
				for (int j = 0; j < l48AGList.size(); j++) {
					compList.add(new ComparatorDto(j, l48AGList.get(j).getL48Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L48AG
				// ordinati
				L48AG[] l48AGArray = new L48AG[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l48AGArray[i] = l48AGList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l4Generatori.setL48AGArray(l48AGArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L48AG> l48AGListNew = l4Generatori.getL48AGList();

				// Devo rinominare il progressivo (L42Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L48AG l48Ag : l48AGListNew) {

					l48Ag.setL48Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}
		}
	}

	private void validazioneL5SistemiRegolazioneContabilizzazione(LibrettoCatasto richiesta)
			throws SigitextException {
		// Devo verificare le date
		// devo ordinare le sostituite per data installazione

		// L5_sistemiRegolazioneContabilizzazione

		// L5_1sistemaRegolazioneSostituito
		// L5_1valvolaRegolazioneSostituito

		L5SistemiRegolazioneContabilizzazione l5SistRegCont = richiesta.getL5SistemiRegolazioneContabilizzazione();

		if (l5SistRegCont != null) {

			List<L51SR> l51SRList = l5SistRegCont.getL51SRList();
			List<L51VR> l51VRList = l5SistRegCont.getL51VRList();

			String numComponente = null;
			List<ComparatorDto> compList = new ArrayList<ComparatorDto>();

			// Verifico che ci siano delle SR
			if (l51SRList != null && l51SRList.size() > 0) {
				for (L51SR l51sr : l51SRList) {

					numComponente = ConvertUtil.convertToString(l51sr.getL51Numero());

					L51SistemaRegolazione l51SistReg = l51sr.getL51SistemaRegolazione();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_SR, numComponente,
							l51SistReg.getL51DataInstallazione(), l51SistReg.getL51DataDismissione());

					// Verifico i valori delle combo
					validazioneMarca(l51SistReg.getL51Fabbricante());

					List<L51SistemaRegolazioneSostituito> l51SistRegSostListOrig = l51sr
							.getL51SistemaRegolazioneSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l51SistRegSostListOrig != null && l51SistRegSostListOrig.size() > 0) {

						// compList = new ArrayList<ComparatorDto>();

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto L51SistemaRegolazioneSostituito non funziona
						for (int i = 0; i < l51SistRegSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l51SistRegSostListOrig.get(i).getL51DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// L51SistemaRegolazioneSostituito ordinati
						L51SistemaRegolazioneSostituito[] l51SistRegSostArray = new L51SistemaRegolazioneSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l51SistRegSostArray[i] = l51SistRegSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l51sr.setL51SistemaRegolazioneSostituitoArray(l51SistRegSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi
						List<L51SistemaRegolazioneSostituito> l51SistRegSostListNew = l51sr
								.getL51SistemaRegolazioneSostituitoList();

						int listSize = l51SistRegSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L51SistemaRegolazioneSostituito l51SistRegSost = l51SistRegSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_SR, numComponente,
										l51SistRegSost.getL51DataDismissione(), l51SistReg.getL51DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_SR, numComponente,
									l51SistRegSost.getL51DataInstallazione(), l51SistRegSost.getL51DataDismissione());
							// DateUtil.checkDateOrder(l51SistRegSost.getL51DataInstallazione(),
							// l51SistRegSost.getL51DataDismissione(), true);

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_SR, numComponente,
										l51SistRegSostListNew.get(i + 1).getL51DataInstallazione(),
										l51SistRegSost.getL51DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_SR, numComponente,
										l51SistRegSostListNew.get(i + 1).getL51DataInstallazione(),
										l51SistRegSost.getL51DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_SR, numComponente,
										l51SistRegSostListNew.get(i + 1).getL51DataDismissione(),
										l51SistRegSost.getL51DataDismissione());

							}

							// Verifico i valori delle combo
							validazioneMarca(l51SistRegSost.getL51Fabbricante());

						}

					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L51SistemaRegolazioneSostituito non funziona
				for (int j = 0; j < l51SRList.size(); j++) {
					compList.add(new ComparatorDto(j, l51SRList.get(j).getL51Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L51SR
				// ordinati
				L51SR[] l51SRArray = new L51SR[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l51SRArray[i] = l51SRList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l5SistRegCont.setL51SRArray(l51SRArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L51SR> l51SRListNew = l5SistRegCont.getL51SRList();

				// Devo rinominare il progressivo (L51Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L51SR l51Sr : l51SRListNew) {

					l51Sr.setL51Numero(ConvertUtil.convertToBigInteger(count++));
				}

			}

			// Verifico che ci siano delle SR
			if (l51VRList != null && l51VRList.size() > 0) {
				for (L51VR l51vr : l51VRList) {

					numComponente = ConvertUtil.convertToString(l51vr.getL51Numero());

					L51ValvolaRegolazione l51ValvReg = l51vr.getL51ValvolaRegolazione();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_VR, numComponente,
							l51ValvReg.getL51DataInstallazione(), l51ValvReg.getL51DataDismissione());

					// Verifico i valori delle combo
					validazioneMarca(l51ValvReg.getL51Fabbricante());

					List<L51ValvolaRegolazioneSostituito> l51ValvRegSostListOrig = l51vr
							.getL51ValvolaRegolazioneSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l51ValvRegSostListOrig != null && l51ValvRegSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto L51SistemaRegolazioneSostituito non funziona
						for (int i = 0; i < l51ValvRegSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l51ValvRegSostListOrig.get(i).getL51DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// L51SistemaRegolazioneSostituito ordinati
						L51ValvolaRegolazioneSostituito[] l51ValvRegSostArray = new L51ValvolaRegolazioneSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l51ValvRegSostArray[i] = l51ValvRegSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l51vr.setL51ValvolaRegolazioneSostituitoArray(l51ValvRegSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi
						List<L51ValvolaRegolazioneSostituito> l51ValvRegSostListNew = l51vr
								.getL51ValvolaRegolazioneSostituitoList();

						int listSize = l51ValvRegSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L51ValvolaRegolazioneSostituito l51ValvRegSost = l51ValvRegSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_VR, numComponente,
										l51ValvRegSost.getL51DataDismissione(), l51ValvReg.getL51DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_VR, numComponente,
									l51ValvRegSost.getL51DataInstallazione(), l51ValvRegSost.getL51DataDismissione());
							// DateUtil.checkDateOrder(l51SistRegSost.getL51DataInstallazione(),
							// l51SistRegSost.getL51DataDismissione(), true);

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_VR, numComponente,
										l51ValvRegSostListNew.get(i + 1).getL51DataInstallazione(),
										l51ValvRegSost.getL51DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_VR, numComponente,
										l51ValvRegSostListNew.get(i + 1).getL51DataInstallazione(),
										l51ValvRegSost.getL51DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_VR, numComponente,
										l51ValvRegSostListNew.get(i + 1).getL51DataDismissione(),
										l51ValvRegSost.getL51DataDismissione());

							}

							// Verifico i valori delle combo
							validazioneMarca(l51ValvRegSost.getL51Fabbricante());

						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L51SistemaRegolazioneSostituito non funziona
				for (int j = 0; j < l51VRList.size(); j++) {
					compList.add(new ComparatorDto(j, l51VRList.get(j).getL51Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L51SR
				// ordinati
				L51VR[] l51VRArray = new L51VR[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l51VRArray[i] = l51VRList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l5SistRegCont.setL51VRArray(l51VRArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L51VR> l51VRListNew = l5SistRegCont.getL51VRList();

				// Devo rinominare il progressivo (L51Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L51VR l51Vr : l51VRListNew) {

					l51Vr.setL51Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}
		}
	}

	private void validazioneL6Pompa(LibrettoCatasto richiesta) throws SigitextException {
		L6SistemiDistribuzione l6SistDistrib = richiesta.getL6SistemiDistribuzione();

		if (l6SistDistrib != null) {
			List<ComparatorDto> compList = new ArrayList<ComparatorDto>();

			List<L63VX> l63VXList = l6SistDistrib.getL63VXList();

			// Verifico che ci siano delle VX
			if (l63VXList != null && l63VXList.size() > 0) {
				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L64PompaSostituito non funziona
				for (int j = 0; j < l63VXList.size(); j++) {
					compList.add(new ComparatorDto(j, l63VXList.get(j).getL63Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L63VX
				// ordinati
				L63VX[] l63VXArray = new L63VX[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l63VXArray[i] = l63VXList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l6SistDistrib.setL63VXArray(l63VXArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L63VX> l63VXListNew = l6SistDistrib.getL63VXList();

				// Devo rinominare il progressivo (L63Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L63VX l63Vx : l63VXListNew) {

					l63Vx.setL63Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}

			List<L64PO> l64POList = l6SistDistrib.getL64POList();

			// Verifico che ci siano delle PO
			if (l64POList != null && l64POList.size() > 0) {
				for (L64PO l64Po : l64POList) {

					String numComponente = ConvertUtil.convertToString(l64Po.getL64Numero());

					L64Pompa l64Pompa = l64Po.getL64Pompa();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_PO, numComponente,
							l64Pompa.getL64DataInstallazione(), l64Pompa.getL64DataDismissione());

					if (l64Pompa.getL64Fabbricante() > 0) {
						validazioneMarca(l64Pompa.getL64Fabbricante());
					}

					List<L64PompaSostituito> l64PompaSostListOrig = l64Po.getL64PompaSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l64PompaSostListOrig != null && l64PompaSostListOrig.size() > 0) {

						// Pulisco la lista
						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l64PompaSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i,
									ConvertUtil.convertToDate(l64PompaSostListOrig.get(i).getL64DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L64PompaSostituito[] l64PompaSostArray = new L64PompaSostituito[compList.size()];

						for (int i = 0; i < compList.size(); i++) {
							l64PompaSostArray[i] = l64PompaSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l64Po.setL64PompaSostituitoArray(l64PompaSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L64PompaSostituito> l64PompaSostListNew = l64Po.getL64PompaSostituitoList();

						int listSize = l64PompaSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L64PompaSostituito l64PompaSost = l64PompaSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_PO, numComponente,
										l64PompaSost.getL64DataDismissione(), l64Pompa.getL64DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_PO, numComponente,
									l64PompaSost.getL64DataInstallazione(), l64PompaSost.getL64DataDismissione());

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_PO, numComponente,
										l64PompaSostListNew.get(i + 1).getL64DataInstallazione(),
										l64PompaSost.getL64DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_PO, numComponente,
										l64PompaSostListNew.get(i + 1).getL64DataInstallazione(),
										l64PompaSost.getL64DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_PO, numComponente,
										l64PompaSostListNew.get(i + 1).getL64DataDismissione(),
										l64PompaSost.getL64DataDismissione());

							}

							if (l64PompaSost.getL64Fabbricante() > 0) {
								validazioneMarca(l64PompaSost.getL64Fabbricante());
							}

						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L64PompaSostituito non funziona
				for (int j = 0; j < l64POList.size(); j++) {
					compList.add(new ComparatorDto(j, l64POList.get(j).getL64Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L64PO
				// ordinati
				L64PO[] l64POArray = new L64PO[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l64POArray[i] = l64POList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l6SistDistrib.setL64POArray(l64POArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L64PO> l64POListNew = l6SistDistrib.getL64POList();

				// Devo rinominare il progressivo (L64Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L64PO l64Po : l64POListNew) {

					l64Po.setL64Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}
		}
	}

	private void validazioneL7SistemiEmissione(LibrettoCatasto richiesta) throws SigitextException {
		L7SistemiEmissione L7SistemiEmissione = richiesta.getL7SistemiEmissione();

		if (!L7SistemiEmissione.getL71Radiatori() && !L7SistemiEmissione.getL71Termoconvettori()
				&& !L7SistemiEmissione.getL71Ventilconvettori() && !L7SistemiEmissione.getL71PanelliRadianti()
				&& !L7SistemiEmissione.getL71Bocchette() && !L7SistemiEmissione.getL71StrisceRadianti()
				&& !L7SistemiEmissione.getL71TraviFredde()
				&& GenericUtil.isNullOrEmpty(L7SistemiEmissione.getL71Altro())) {
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S137, "7.1"));
		}

	}

	private void validazioneL8Accumulo(LibrettoCatasto richiesta) throws SigitextException {
		L8SistemiAccumulo l8SistAccumulo = richiesta.getL8SistemiAccumulo();

		if (l8SistAccumulo != null) {

			List<L81AC> l81ACList = l8SistAccumulo.getL81ACList();

			List<ComparatorDto> compList = new ArrayList<ComparatorDto>();
			// Verifico che ci siano delle AC
			if (l81ACList != null && l81ACList.size() > 0) {
				for (L81AC l81Ac : l81ACList) {

					String numComponente = ConvertUtil.convertToString(l81Ac.getL81Numero());

					L81Accumulo l81Accumulo = l81Ac.getL81Accumulo();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_AC, numComponente,
							l81Accumulo.getL81DataInstallazione(), l81Accumulo.getL81DataDismissione());

					if (l81Accumulo.getL81Fabbricante() > 0) {
						validazioneMarca(l81Accumulo.getL81Fabbricante());
					}

					List<L81AccumuloSostituito> l81AccumuloSostListOrig = l81Ac.getL81AccumuloSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l81AccumuloSostListOrig != null && l81AccumuloSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l81AccumuloSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l81AccumuloSostListOrig.get(i).getL81DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L81AccumuloSostituito[] l81AccumuloSostArray = new L81AccumuloSostituito[compList.size()];

						for (int i = 0; i < compList.size(); i++) {
							l81AccumuloSostArray[i] = l81AccumuloSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l81Ac.setL81AccumuloSostituitoArray(l81AccumuloSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L81AccumuloSostituito> l81AccumuloSostListNew = l81Ac.getL81AccumuloSostituitoList();

						int listSize = l81AccumuloSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L81AccumuloSostituito l81AccumuloSost = l81AccumuloSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_AC, numComponente,
										l81AccumuloSost.getL81DataDismissione(), l81Accumulo.getL81DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_AC, numComponente,
									l81AccumuloSost.getL81DataInstallazione(), l81AccumuloSost.getL81DataDismissione());

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_AC, numComponente,
										l81AccumuloSostListNew.get(i + 1).getL81DataInstallazione(),
										l81AccumuloSost.getL81DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_AC, numComponente,
										l81AccumuloSostListNew.get(i + 1).getL81DataInstallazione(),
										l81AccumuloSost.getL81DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_AC, numComponente,
										l81AccumuloSostListNew.get(i + 1).getL81DataDismissione(),
										l81AccumuloSost.getL81DataDismissione());

							}

							if (l81AccumuloSost.getL81Fabbricante() > 0) {
								validazioneMarca(l81AccumuloSost.getL81Fabbricante());
							}

						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L81AccumuloSostituito non funziona
				for (int j = 0; j < l81ACList.size(); j++) {
					compList.add(new ComparatorDto(j, l81ACList.get(j).getL81Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L81AC
				// ordinati
				L81AC[] l81ACArray = new L81AC[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l81ACArray[i] = l81ACList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l8SistAccumulo.setL81ACArray(l81ACArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L81AC> l81ACListNew = l8SistAccumulo.getL81ACList();

				// Devo rinominare il progressivo (L64Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L81AC l81Ac : l81ACListNew) {

					l81Ac.setL81Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}
		}
	}

	private void validazioneL9TeRvScxCiUtRcx(LibrettoCatasto richiesta) throws SigitextException {
		L9AltriComponenti l9AltriComp = richiesta.getL9AltriComponenti();

		if (l9AltriComp != null) {
			List<L91TE> l91TEList = l9AltriComp.getL91TEList();
			List<L92RV> l92RVList = l9AltriComp.getL92RVList();
			List<L93SCX> l93SCXList = l9AltriComp.getL93SCXList();

			List<L94CI> l94CIList = l9AltriComp.getL94CIList();
			List<L95UT> l95UTList = l9AltriComp.getL95UTList();
			List<L96RCX> l96RCXList = l9AltriComp.getL96RCXList();

			List<ComparatorDto> compList = new ArrayList<ComparatorDto>();

			String numComponente = null;

			// Verifico che ci siano delle PO
			if (l91TEList != null && l91TEList.size() > 0) {
				for (L91TE l91Te : l91TEList) {

					numComponente = ConvertUtil.convertToString(l91Te.getL91Numero());

					L91Torre l91Torre = l91Te.getL91Torre();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_TE, numComponente,
							l91Torre.getL91DataInstallazione(), l91Torre.getL91DataDismissione());

					if (l91Torre.getL91Fabbricante() > 0) {
						validazioneMarca(l91Torre.getL91Fabbricante());
					}

					List<L91TorreSostituito> l91TorreSostListOrig = l91Te.getL91TorreSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l91TorreSostListOrig != null && l91TorreSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l91TorreSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i,
									ConvertUtil.convertToDate(l91TorreSostListOrig.get(i).getL91DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L91TorreSostituito[] l91TorreSostArray = new L91TorreSostituito[compList.size()];

						for (int i = 0; i < compList.size(); i++) {
							l91TorreSostArray[i] = l91TorreSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l91Te.setL91TorreSostituitoArray(l91TorreSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L91TorreSostituito> l91TorreSostListNew = l91Te.getL91TorreSostituitoList();

						int listSize = l91TorreSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L91TorreSostituito l91TorreSost = l91TorreSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_TE, numComponente,
										l91TorreSost.getL91DataDismissione(), l91Torre.getL91DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_TE, numComponente,
									l91TorreSost.getL91DataInstallazione(), l91TorreSost.getL91DataDismissione());

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_TE, numComponente,
										l91TorreSostListNew.get(i + 1).getL91DataInstallazione(),
										l91TorreSost.getL91DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_TE, numComponente,
										l91TorreSostListNew.get(i + 1).getL91DataInstallazione(),
										l91TorreSost.getL91DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_TE, numComponente,
										l91TorreSostListNew.get(i + 1).getL91DataDismissione(),
										l91TorreSost.getL91DataDismissione());

							}

							if (l91TorreSost.getL91Fabbricante() > 0) {
								validazioneMarca(l91TorreSost.getL91Fabbricante());
							}

						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L91TorreSostituito non funziona
				for (int j = 0; j < l91TEList.size(); j++) {
					compList.add(new ComparatorDto(j, l91TEList.get(j).getL91Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L91PO
				// ordinati
				L91TE[] l91TEArray = new L91TE[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l91TEArray[i] = l91TEList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l9AltriComp.setL91TEArray(l91TEArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L91TE> l91TEListNew = l9AltriComp.getL91TEList();

				// Devo rinominare il progressivo (L91Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L91TE l91Te : l91TEListNew) {

					l91Te.setL91Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}

			// Verifico che ci siano delle RV
			if (l92RVList != null && l92RVList.size() > 0) {
				for (L92RV l92Rv : l92RVList) {

					numComponente = ConvertUtil.convertToString(l92Rv.getL92Numero());

					L92Raffreddatore l92Raffreddatore = l92Rv.getL92Raffreddatore();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_RV, numComponente,
							l92Raffreddatore.getL92DataInstallazione(), l92Raffreddatore.getL92DataDismissione());

					if (l92Raffreddatore.getL92Fabbricante() > 0) {
						validazioneMarca(l92Raffreddatore.getL92Fabbricante());
					}

					List<L92RaffreddatoreSostituito> l92RaffreddatoreSostListOrig = l92Rv
							.getL92RaffreddatoreSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l92RaffreddatoreSostListOrig != null && l92RaffreddatoreSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l92RaffreddatoreSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l92RaffreddatoreSostListOrig.get(i).getL92DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L92RaffreddatoreSostituito[] l92RaffreddatoreSostArray = new L92RaffreddatoreSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l92RaffreddatoreSostArray[i] = l92RaffreddatoreSostListOrig
									.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l92Rv.setL92RaffreddatoreSostituitoArray(l92RaffreddatoreSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L92RaffreddatoreSostituito> l92RaffreddatoreSostListNew = l92Rv
								.getL92RaffreddatoreSostituitoList();

						int listSize = l92RaffreddatoreSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L92RaffreddatoreSostituito l92RaffreddatoreSost = l92RaffreddatoreSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_RV, numComponente,
										l92RaffreddatoreSost.getL92DataDismissione(),
										l92Raffreddatore.getL92DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_RV, numComponente,
									l92RaffreddatoreSost.getL92DataInstallazione(),
									l92RaffreddatoreSost.getL92DataDismissione());
							// DateUtil.checkDateOrder(l51SistRegSost.getL51DataInstallazione(),
							// l51SistRegSost.getL51DataDismissione(), true);

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_RV, numComponente,
										l92RaffreddatoreSostListNew.get(i + 1).getL92DataInstallazione(),
										l92RaffreddatoreSost.getL92DataDismissione());
								// DateUtil.checkDateOrder(l51SistRegSostList.get(i+1).getL51DataInstallazione(),
								// l51SistRegSost.getL51DataDismissione(), false);

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_RV, numComponente,
										l92RaffreddatoreSostListNew.get(i + 1).getL92DataInstallazione(),
										l92RaffreddatoreSost.getL92DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_RV, numComponente,
										l92RaffreddatoreSostListNew.get(i + 1).getL92DataDismissione(),
										l92RaffreddatoreSost.getL92DataDismissione());

							}

							if (l92RaffreddatoreSost.getL92Fabbricante() > 0) {
								validazioneMarca(l92RaffreddatoreSost.getL92Fabbricante());
							}

						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L92RaffreddatoreSostituito non funziona
				for (int j = 0; j < l92RVList.size(); j++) {
					compList.add(new ComparatorDto(j, l92RVList.get(j).getL92Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L92RV
				// ordinati
				L92RV[] l92RVArray = new L92RV[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l92RVArray[i] = l92RVList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l9AltriComp.setL92RVArray(l92RVArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L92RV> l92RVListNew = l9AltriComp.getL92RVList();

				// Devo rinominare il progressivo (L42Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L92RV l92Rv : l92RVListNew) {

					l92Rv.setL92Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}

			// Verifico che ci siano delle SCX
			if (l93SCXList != null && l93SCXList.size() > 0) {
				for (L93SCX l93Scx : l93SCXList) {

					numComponente = ConvertUtil.convertToString(l93Scx.getL93Numero());

					L93ScambiatoreIntermedio l93ScambInter = l93Scx.getL93ScambiatoreIntermedio();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_SCX, numComponente,
							l93ScambInter.getL93DataInstallazione(), l93ScambInter.getL93DataDismissione());

					if (l93ScambInter.getL93Fabbricante() > 0) {
						validazioneMarca(l93ScambInter.getL93Fabbricante());
					}

					List<L93ScambiatoreIntermedioSostituito> l93ScambInterSostListOrig = l93Scx
							.getL93ScambiatoreIntermedioSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l93ScambInterSostListOrig != null && l93ScambInterSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l93ScambInterSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l93ScambInterSostListOrig.get(i).getL93DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L93ScambiatoreIntermedioSostituito[] l93ScambInterSostArray = new L93ScambiatoreIntermedioSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l93ScambInterSostArray[i] = l93ScambInterSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l93Scx.setL93ScambiatoreIntermedioSostituitoArray(l93ScambInterSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L93ScambiatoreIntermedioSostituito> l93ScambInterSostListNew = l93Scx
								.getL93ScambiatoreIntermedioSostituitoList();

						int listSize = l93ScambInterSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L93ScambiatoreIntermedioSostituito l93ScambInterSost = l93ScambInterSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_SCX,
										numComponente, l93ScambInterSost.getL93DataDismissione(),
										l93ScambInter.getL93DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_SCX, numComponente,
									l93ScambInterSost.getL93DataInstallazione(),
									l93ScambInterSost.getL93DataDismissione());

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_SCX, numComponente,
										l93ScambInterSostListNew.get(i + 1).getL93DataInstallazione(),
										l93ScambInterSost.getL93DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_SCX, numComponente,
										l93ScambInterSostListNew.get(i + 1).getL93DataInstallazione(),
										l93ScambInterSost.getL93DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_SCX, numComponente,
										l93ScambInterSostListNew.get(i + 1).getL93DataDismissione(),
										l93ScambInterSost.getL93DataDismissione());

							}

							if (l93ScambInterSost.getL93Fabbricante() > 0) {
								validazioneMarca(l93ScambInterSost.getL93Fabbricante());
							}

						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L93ScambInterSostituito non funziona
				for (int j = 0; j < l93SCXList.size(); j++) {
					compList.add(new ComparatorDto(j, l93SCXList.get(j).getL93Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L93SCX
				// ordinati
				L93SCX[] l93SCXArray = new L93SCX[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l93SCXArray[i] = l93SCXList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l9AltriComp.setL93SCXArray(l93SCXArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L93SCX> l93SCXListNew = l9AltriComp.getL93SCXList();

				// Devo rinominare il progressivo (L93Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L93SCX l93Scx : l93SCXListNew) {

					l93Scx.setL93Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}

			// Verifico che ci siano delle CI
			if (l94CIList != null && l94CIList.size() > 0) {
				for (L94CI l94Ci : l94CIList) {

					numComponente = ConvertUtil.convertToString(l94Ci.getL94Numero());

					L94Circuito l94Circuito = l94Ci.getL94Circuito();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_CI, numComponente,
							l94Circuito.getL94DataInstallazione(), l94Circuito.getL94DataDismissione());

					List<L94CircuitoSostituito> l94CircuitoSostListOrig = l94Ci.getL94CircuitoSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l94CircuitoSostListOrig != null && l94CircuitoSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l94CircuitoSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l94CircuitoSostListOrig.get(i).getL94DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L94CircuitoSostituito[] l94CircuitoSostArray = new L94CircuitoSostituito[compList.size()];

						for (int i = 0; i < compList.size(); i++) {
							l94CircuitoSostArray[i] = l94CircuitoSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l94Ci.setL94CircuitoSostituitoArray(l94CircuitoSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L94CircuitoSostituito> l94CircuitoSostListNew = l94Ci.getL94CircuitoSostituitoList();

						int listSize = l94CircuitoSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L94CircuitoSostituito l94CircuitoSost = l94CircuitoSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_CI, numComponente,
										l94CircuitoSost.getL94DataDismissione(), l94Circuito.getL94DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_CI, numComponente,
									l94CircuitoSost.getL94DataInstallazione(), l94CircuitoSost.getL94DataDismissione());

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_CI, numComponente,
										l94CircuitoSostListNew.get(i + 1).getL94DataInstallazione(),
										l94CircuitoSost.getL94DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_CI, numComponente,
										l94CircuitoSostListNew.get(i + 1).getL94DataInstallazione(),
										l94CircuitoSost.getL94DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_CI, numComponente,
										l94CircuitoSostListNew.get(i + 1).getL94DataDismissione(),
										l94CircuitoSost.getL94DataDismissione());

							}
						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L94CircuitoSostituito non funziona
				for (int j = 0; j < l94CIList.size(); j++) {
					compList.add(new ComparatorDto(j, l94CIList.get(j).getL94Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L94CI
				// ordinati
				L94CI[] l94CIArray = new L94CI[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l94CIArray[i] = l94CIList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l9AltriComp.setL94CIArray(l94CIArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L94CI> l94CIListNew = l9AltriComp.getL94CIList();

				// Devo rinominare il progressivo (L94Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L94CI l94Ci : l94CIListNew) {

					l94Ci.setL94Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}

			// Verifico che ci siano delle UT
			if (l95UTList != null && l95UTList.size() > 0) {
				for (L95UT l95Ut : l95UTList) {

					numComponente = ConvertUtil.convertToString(l95Ut.getL95Numero());

					L95UnitaTrattAria l95UnitaTrattAria = l95Ut.getL95UnitaTrattAria();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_UT, numComponente,
							l95UnitaTrattAria.getL95DataInstallazione(), l95UnitaTrattAria.getL95DataDismissione());

					if (l95UnitaTrattAria.getL95Fabbricante() > 0) {
						validazioneMarca(l95UnitaTrattAria.getL95Fabbricante());
					}

					List<L95UnitaTrattAriaSostituito> l95UnitaTrattAriaSostListOrig = l95Ut
							.getL95UnitaTrattAriaSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l95UnitaTrattAriaSostListOrig != null && l95UnitaTrattAriaSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l95UnitaTrattAriaSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l95UnitaTrattAriaSostListOrig.get(i).getL95DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L95UnitaTrattAriaSostituito[] l95UnitaTrattAriaSostArray = new L95UnitaTrattAriaSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l95UnitaTrattAriaSostArray[i] = l95UnitaTrattAriaSostListOrig
									.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l95Ut.setL95UnitaTrattAriaSostituitoArray(l95UnitaTrattAriaSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L95UnitaTrattAriaSostituito> l95UnitaTrattAriaSostListNew = l95Ut
								.getL95UnitaTrattAriaSostituitoList();

						int listSize = l95UnitaTrattAriaSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L95UnitaTrattAriaSostituito l95UnitaTrattAriaSost = l95UnitaTrattAriaSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_UT, numComponente,
										l95UnitaTrattAriaSost.getL95DataDismissione(),
										l95UnitaTrattAria.getL95DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_UT, numComponente,
									l95UnitaTrattAriaSost.getL95DataInstallazione(),
									l95UnitaTrattAriaSost.getL95DataDismissione());

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_UT, numComponente,
										l95UnitaTrattAriaSostListNew.get(i + 1).getL95DataInstallazione(),
										l95UnitaTrattAriaSost.getL95DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_UT, numComponente,
										l95UnitaTrattAriaSostListNew.get(i + 1).getL95DataInstallazione(),
										l95UnitaTrattAriaSost.getL95DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_UT, numComponente,
										l95UnitaTrattAriaSostListNew.get(i + 1).getL95DataDismissione(),
										l95UnitaTrattAriaSost.getL95DataDismissione());

							}

							if (l95UnitaTrattAriaSost.getL95Fabbricante() > 0) {
								validazioneMarca(l95UnitaTrattAriaSost.getL95Fabbricante());
							}

						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L95UnitaTrattAriaSostituito non funziona
				for (int j = 0; j < l95UTList.size(); j++) {
					compList.add(new ComparatorDto(j, l95UTList.get(j).getL95Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L95UT
				// ordinati
				L95UT[] l95UTArray = new L95UT[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l95UTArray[i] = l95UTList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l9AltriComp.setL95UTArray(l95UTArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L95UT> l95UTListNew = l9AltriComp.getL95UTList();

				// Devo rinominare il progressivo (L95Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L95UT l95Ut : l95UTListNew) {

					l95Ut.setL95Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}

			// Verifico che ci siano delle RCX
			if (l96RCXList != null && l96RCXList.size() > 0) {
				for (L96RCX l96Rcx : l96RCXList) {

					numComponente = ConvertUtil.convertToString(l96Rcx.getL96Numero());

					L96RecuperatoreAriaAmb l96RecAriaAmb = l96Rcx.getL96RecuperatoreAriaAmb();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_RCX, numComponente,
							l96RecAriaAmb.getL96DataInstallazione(), l96RecAriaAmb.getL96DataDismissione());

					List<L96RecuperatoreAriaAmbSostituito> l96RecAriaAmbSostListOrig = l96Rcx
							.getL96RecuperatoreAriaAmbSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l96RecAriaAmbSostListOrig != null && l96RecAriaAmbSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l96RecAriaAmbSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l96RecAriaAmbSostListOrig.get(i).getL96DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L96RecuperatoreAriaAmbSostituito[] l96RecAriaAmbSostArray = new L96RecuperatoreAriaAmbSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l96RecAriaAmbSostArray[i] = l96RecAriaAmbSostListOrig.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l96Rcx.setL96RecuperatoreAriaAmbSostituitoArray(l96RecAriaAmbSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L96RecuperatoreAriaAmbSostituito> l96RecAriaAmbSostListNew = l96Rcx
								.getL96RecuperatoreAriaAmbSostituitoList();

						int listSize = l96RecAriaAmbSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L96RecuperatoreAriaAmbSostituito l96RecAriaAmbSost = l96RecAriaAmbSostListNew.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_RCX,
										numComponente, l96RecAriaAmbSost.getL96DataDismissione(),
										l96RecAriaAmb.getL96DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_RCX, numComponente,
									l96RecAriaAmbSost.getL96DataInstallazione(),
									l96RecAriaAmbSost.getL96DataDismissione());

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_RCX, numComponente,
										l96RecAriaAmbSostListNew.get(i + 1).getL96DataInstallazione(),
										l96RecAriaAmbSost.getL96DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_RCX, numComponente,
										l96RecAriaAmbSostListNew.get(i + 1).getL96DataInstallazione(),
										l96RecAriaAmbSost.getL96DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_RCX, numComponente,
										l96RecAriaAmbSostListNew.get(i + 1).getL96DataDismissione(),
										l96RecAriaAmbSost.getL96DataDismissione());

							}
						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L96RecuperatoreAriaAmbSostituito non funziona
				for (int j = 0; j < l96RCXList.size(); j++) {
					compList.add(new ComparatorDto(j, l96RCXList.get(j).getL96Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L96RCX
				// ordinati
				L96RCX[] l96RCXArray = new L96RCX[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l96RCXArray[i] = l96RCXList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l9AltriComp.setL96RCXArray(l96RCXArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L96RCX> l96RCXListNew = l9AltriComp.getL96RCXList();

				// Devo rinominare il progressivo (L96Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L96RCX l96Rcx : l96RCXListNew) {

					l96Rcx.setL96Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}
		}

	}

	private void validazioneL10VentilazioneMeccanica(LibrettoCatasto richiesta) throws SigitextException {
		L10Ventilazione l8SistAccumulo = richiesta.getL10Ventilazione();

		if (l8SistAccumulo != null) {

			List<L101VM> l101VMList = l8SistAccumulo.getL101VMList();

			List<ComparatorDto> compList = new ArrayList<ComparatorDto>();
			// Verifico che ci siano delle AC
			if (l101VMList != null && l101VMList.size() > 0) {
				for (L101VM l101Vm : l101VMList) {

					String numComponente = ConvertUtil.convertToString(l101Vm.getL101Numero());

					L101VentilazioneMeccanica l101VentMeccanica = l101Vm.getL101VentilazioneMeccanica();

					validazioneDataInstDataDismisSePresImpLib(Constants.TIPO_COMPONENTE_VM, numComponente,
							l101VentMeccanica.getL101DataInstallazione(), l101VentMeccanica.getL101DataDismissione());

					validazioneMarca(l101VentMeccanica.getL101Fabbricante());

					List<L101VentilazioneMeccanicaSostituito> l101VentMeccanicaSostListOrig = l101Vm
							.getL101VentilazioneMeccanicaSostituitoList();

					// Verifico che ci siano delle sostituzioni
					if (l101VentMeccanicaSostListOrig != null && l101VentMeccanicaSostListOrig.size() > 0) {

						compList.clear();

						// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
						// l'oggetto Array[] non funziona
						for (int i = 0; i < l101VentMeccanicaSostListOrig.size(); i++) {
							compList.add(new ComparatorDto(i, ConvertUtil
									.convertToDate(l101VentMeccanicaSostListOrig.get(i).getL101DataInstallazione())));
						}

						// ordino per dataInstallazione la lista
						Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByData());

						// Dopo aver ordinato per la dataInstallazione devo ricostruire la lista di
						// oggetti ordinati
						L101VentilazioneMeccanicaSostituito[] l101VentMeccanicaSostArray = new L101VentilazioneMeccanicaSostituito[compList
								.size()];

						for (int i = 0; i < compList.size(); i++) {
							l101VentMeccanicaSostArray[i] = l101VentMeccanicaSostListOrig
									.get(compList.get(i).getIdData());

						}

						// Risetto l'array ordinato
						l101Vm.setL101VentilazioneMeccanicaSostituitoArray(l101VentMeccanicaSostArray);

						// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
						List<L101VentilazioneMeccanicaSostituito> l101VentMeccanicaSostListNew = l101Vm
								.getL101VentilazioneMeccanicaSostituitoList();

						int listSize = l101VentMeccanicaSostListNew.size();

						for (int i = 0; i < listSize; i++) {

							L101VentilazioneMeccanicaSostituito l101VentMeccanicaSost = l101VentMeccanicaSostListNew
									.get(i);

							if (i == 0) {
								// Adesso che ho ordinato verifico che la dataDismissione del primo elemento
								// (quindi quello piu' recente - l'elemento 0) sia precedente alla
								// dataInstallazione dell'elemento attuale
								validazioneDataInstSuccDataDismisSostImpLib(Constants.TIPO_COMPONENTE_VM, numComponente,
										l101VentMeccanicaSost.getL101DataDismissione(),
										l101VentMeccanica.getL101DataInstallazione());
							}

							// Adesso che ho ordinato le date devo verificarle, sia tra dataInizio ->
							// dataFine, che la data inizio dell'ultima sia successiva alla data fine di
							// quella precedente
							validazioneDataInstDataDismisImpLib(Constants.TIPO_COMPONENTE_VM, numComponente,
									l101VentMeccanicaSost.getL101DataInstallazione(),
									l101VentMeccanicaSost.getL101DataDismissione());

							if (i != listSize - 1) {
								// Esistono ancora elementi successivi, quindi controllo la data fine attuale
								// con la data inizio successiva
								validazioneDataInstSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_VM, numComponente,
										l101VentMeccanicaSostListNew.get(i + 1).getL101DataInstallazione(),
										l101VentMeccanicaSost.getL101DataDismissione());

								validazioneDataInstSuccDataInstImpLib(Constants.TIPO_COMPONENTE_VM, numComponente,
										l101VentMeccanicaSostListNew.get(i + 1).getL101DataInstallazione(),
										l101VentMeccanicaSost.getL101DataInstallazione());
								validazioneDataDismisSuccDataDismisImpLib(Constants.TIPO_COMPONENTE_VM, numComponente,
										l101VentMeccanicaSostListNew.get(i + 1).getL101DataDismissione(),
										l101VentMeccanicaSost.getL101DataDismissione());

							}

							validazioneMarca(l101VentMeccanicaSost.getL101Fabbricante());

						}
					}
				}

				// Pulisco la lista
				compList.clear();

				// Mi creo una lista specifica per fare l'ordinamento, perche' l'ordinamento con
				// l'oggetto L101VentMeccanicaSostituito non funziona
				for (int j = 0; j < l101VMList.size(); j++) {
					compList.add(new ComparatorDto(j, l101VMList.get(j).getL101Numero()));
				}

				// ordino per progressivo la lista
				Collections.sort(compList, ComparatorUtil.compareCamparatorDtoByProgressivo());

				// Dopo aver ordinato per la progressivo devo ricostruire la lista di L101VM
				// ordinati
				L101VM[] l101VMArray = new L101VM[compList.size()];

				for (int i = 0; i < compList.size(); i++) {
					l101VMArray[i] = l101VMList.get(compList.get(i).getIdData());

				}

				// Risetto l'array ordinato
				l8SistAccumulo.setL101VMArray(l101VMArray);

				// Recupero l'oggetto (ho notato che se riusavo l'array avevo dei problemi)
				List<L101VM> l101VMListNew = l8SistAccumulo.getL101VMList();

				// Devo rinominare il progressivo (L64Numero), in modo che sia 1,2,3,ecc.
				// Perche' l'utente potrebbe aver inserito numeri a caso...
				int count = 1;
				for (L101VM l101Ac : l101VMListNew) {

					l101Ac.setL101Numero(ConvertUtil.convertToBigInteger(count++));
				}
			}
		}
	}

	private void validazioneComboXml(LibrettoCatasto richiesta) throws SigitextException {

		L14Consumi l14Consumi = richiesta.getL14Consumi();

		if (l14Consumi != null) {
			List<L141ConsumoCombustibile> l141ConCombList = l14Consumi.getL141ConsumoCombustibileList();

			for (L141ConsumoCombustibile l141ConsumoCombustibile : l141ConCombList) {

				validazioneCombustibile(l141ConsumoCombustibile.getL141Combustibile());

				validazioneUnitaMisura(l141ConsumoCombustibile.getL141UnitaMisura());

			}

			if (l14Consumi.getL143ConsumoAcqua() != null) {
				validazioneUnitaMisura(l14Consumi.getL143ConsumoAcqua().getL143UnitaMisura());

			}

			if (l14Consumi.getL144ConsumoProdottiChimici() != null) {
				List<L144DatiConsumoProdottiChimici> l144DatiConsumoProdChimiciList = l14Consumi
						.getL144ConsumoProdottiChimici().getL144DatiConsumoProdottiChimiciList();
				for (L144DatiConsumoProdottiChimici l144DatiConsumoProdChimici : l144DatiConsumoProdChimiciList) {

					validazioneUnitaMisura(l144DatiConsumoProdChimici.getL144UnitaMisura());

				}
			}
		}
	}
	
	private static void validazioneDataInstDataDismisSePresImpLib(String tipoComp, String componente, Calendar dataInstallazione, Calendar dataDismissione) throws SigitextException
	{
		boolean check = false;
		
		// verifico la data installazione che non sia futura
		check = GenericUtil.checkDateFuture(dataInstallazione);
		if (!check)
		{
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S134, tipoComp, componente, ConvertUtil.convertToString(dataInstallazione)));
		}

		// verifico la data dismissione (se presente) che non sia futura
		check = GenericUtil.checkDateFutureIsPresents(dataDismissione);
		if (!check)
		{
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S134, tipoComp, componente, ConvertUtil.convertToString(dataDismissione)));
		}
		
		check = GenericUtil.checkDateOrderIsPresents(dataInstallazione, dataDismissione, true);

		if (!check)
		{
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S130, tipoComp, componente, ConvertUtil.convertToString(dataInstallazione)));
		}
	}

	private static void validazioneDataInstDataDismisImpLib(String tipoComp, String componente, Calendar dataInstallazione, Calendar dataDismissione) throws SigitextException
	{
		boolean check = GenericUtil.checkDateOrder(dataInstallazione, dataDismissione, true);

		if (!check)
		{
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S130, tipoComp, componente, ConvertUtil.convertToString(dataInstallazione)));
		}
	}
	
	private static void validazioneDataInstSuccDataDismisImpLib(String tipoComp, String componente, Calendar dataInstallazione, Calendar dataDismissione) throws SigitextException
	{

		boolean check = GenericUtil.checkDateOrder(dataInstallazione, dataDismissione, false);

		if (!check)
		{
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S131, tipoComp, componente, ConvertUtil.convertToString(dataInstallazione), ConvertUtil.convertToString(dataDismissione)));
		}
	}
	
	private static void validazioneDataInstSuccDataDismisSostImpLib(String tipoComp, String componente, Calendar dataInstallazione, Calendar dataDismissione) throws SigitextException
	{

		boolean check = GenericUtil.checkDateOrder(dataInstallazione, dataDismissione, false);

		if (!check)
		{
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S131, tipoComp, componente, ConvertUtil.convertToString(dataDismissione), ConvertUtil.convertToString(dataInstallazione)));
		}
	}
	
	private static void validazioneDataInstSuccDataInstImpLib(String tipoComp, String componente, Calendar dataInstallazionePrec, Calendar dataInstallazione) throws SigitextException
	{

		boolean check = GenericUtil.checkDateOrder(dataInstallazionePrec, dataInstallazione, false);

		if (!check)
		{
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S142, tipoComp, componente, ConvertUtil.convertToString(dataInstallazionePrec), ConvertUtil.convertToString(dataInstallazione)));
		}
	}
	
	private static void validazioneDataDismisSuccDataDismisImpLib(String tipoComp, String componente, Calendar dataDismissionePrec, Calendar dataDismissione) throws SigitextException
	{

		boolean check = GenericUtil.checkDateOrder(dataDismissionePrec, dataDismissione, false);

		if (!check)
		{
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S143, tipoComp, componente, ConvertUtil.convertToString(dataDismissionePrec), ConvertUtil.convertToString(dataDismissione)));
		}
	}
	
	private void validazioneCombustibile(int idCombustibile) throws SigitextException
	{
		
		try
		{
			if (getDbServiceImp().getCombustibileCITByPrimaryKey(ConvertUtil.convertToBigDecimal(idCombustibile)) == null)
			{
				throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S133, Constants.DESC_TABELLA_COMBUSTIBILE, ConvertUtil.convertToString(idCombustibile)));
			}
		} catch (Exception e) {
			throw new SigitextException(Messages.ERROR_RECUPERO_SERVIZIO);
		} 
	}

	private void validazioneUnitaMisura(int idUnitaMisura) throws SigitextException
	{
		
		try
		{
			if (getDbServiceImp().getUnitaMisuraCITByPrimaryKey(ConvertUtil.convertToString(idUnitaMisura)) == null)
			{
				throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S133, Constants.DESC_TABELLA_UNITA_MISURA, ConvertUtil.convertToString(idUnitaMisura)));
			}
		} catch (Exception e) {
			throw new SigitextException(Messages.ERROR_RECUPERO_SERVIZIO);
		} 
	}

	private void validazioneMarca(int idMarca) throws SigitextException
	{
		
		try
		{
			if (getDbServiceImp().getMarcaCITByPrimaryKey(ConvertUtil.convertToBigDecimal(idMarca)) == null)
			{
				throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S133, Constants.DESC_TABELLA_MARCA, ConvertUtil.convertToString(idMarca)));
			}
		} catch (MarcaCITDaoException e) {
			throw new SigitextException(Messages.ERROR_RECUPERO_SERVIZIO);
		} 
	}

	private void validazioneFluido(int idFluido) throws SigitextException
	{
		try
		{
			if (getDbServiceImp().getFluidoCITByPrimaryKey(ConvertUtil.convertToBigDecimal(idFluido)) == null)
			{
				throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S133, Constants.DESC_TABELLA_FLUIDO, ConvertUtil.convertToString(idFluido)));
			}
		} catch (Exception e) {
			throw new SigitextException(Messages.ERROR_RECUPERO_SERVIZIO);
		} 
	}

	public ImportFilter validazionePreImportXmlControllo(Integer codiceImpianto, String tipoControllo, SigitTPersonaGiuridicaDto personaGiuridica, byte[] xml) throws SigitextException {

		log.debug("validazionePreImportXmlControllo START");
		
		try {
			
			String readXml = XmlBeanUtils.readByteArray(xml);
	
			Reader xmlReader = new StringReader(readXml);
			
			String codiceCatasto;
			String siglaRea;
			String numeroRea;
			String codiceFiscale;
			Calendar dataControllo;
			Calendar dataIntervento;
			Integer idRuolo;
			String tipoAllegato="";
			String idTipoAllegato;
			BigInteger idTipoManutenzione = null;
			ArrayList<String> listaProgressivi = new ArrayList<String>();
			ArrayList<String> listaIdCom4Manut = new ArrayList<String>();

			List<RowAllegatoII> listaRowII = null;
			List<RowAllegatoIII> listaRowIII = null;
			List<RowAllegatoIV> listaRowIV = null;
			List<RowAllegatoV> listaRowV = null;
			List<BigInteger> listaCompManut = null;
			int numComponenti = 0;
			
			TipoImportAllegatoEnum tipoImportAllegato = TipoImportAllegatoEnum.valueOfLabel(tipoControllo);
			
			if (tipoImportAllegato == null) {
				log.debug("Tipo controllo non conosciuto");
				throw new SigitextException(Messages.ERROR_TIPO_CONTROLLO);
			}
			
			switch (tipoImportAllegato) {
			case ALLEGATOII:
				log.debug("lettura xml dell'allegato 2");
				InputStreamReader xmlSchemaReader = new InputStreamReader(GenericUtil.getFileInClassPath(Constants.XML_IMPORT_ALLEGATO_II_SCHEMA_DIR));
				
				XmlValidator.validate(xmlReader, xmlSchemaReader);
				
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato2.data.MODIIDocument documentII = MapDto.mapToImportMODIIDocument(xml);
				log.debug("convertito xml in java");
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato2.data.RichiestaDocument.Richiesta richiestaII = documentII.getMODII().getRichiesta();
				codiceCatasto = richiestaII.getDatiIntestazione().getCodiceCatasto();
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato2.data.DatiManutentoreDocument.DatiManutentore manutentoreII = richiestaII.getDatiManutentore();
				siglaRea = manutentoreII.getSiglaREA();
				numeroRea = manutentoreII.getNumeroREA();
				codiceFiscale = manutentoreII.getCodiceFiscale();
				dataControllo = richiestaII.getDatiIntestazione().getAFDataControllo();
				dataIntervento = richiestaII.getDatiAllegato().getDatiTecnico().getAFDataIntervento();
				listaRowII = richiestaII.getDatiAllegato().getAllegatoII().getRowAllegatoIIList();
				
				numComponenti = listaRowII.size();
				idRuolo = Constants.ID_RUOLO_MANUTENTORE_ALL_1;
				idTipoAllegato = Constants.ALLEGATO_TIPO_1;
				break;
			case ALLEGATOIII: 
				log.debug("lettura xml dell'allegato 3");
				XmlValidator.validate(xmlReader, new InputStreamReader(GenericUtil.getFileInClassPath(Constants.XML_IMPORT_ALLEGATO_III_SCHEMA_DIR)));
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato3.data.MODIIIDocument documentIII = MapDto.mapToImportMODIIIDocument(xml);
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato3.data.RichiestaDocument.Richiesta richiestaIII = documentIII.getMODIII().getRichiesta();
				codiceCatasto = richiestaIII.getDatiIntestazione().getCodiceCatasto();
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato3.data.DatiManutentoreDocument.DatiManutentore manutentoreIII = richiestaIII.getDatiManutentore();
				siglaRea = manutentoreIII.getSiglaREA();
				numeroRea = manutentoreIII.getNumeroREA();
				codiceFiscale = manutentoreIII.getCodiceFiscale();
				dataControllo = richiestaIII.getDatiIntestazione().getAFDataControllo();
				dataIntervento = richiestaIII.getDatiAllegato().getDatiTecnico().getAFDataIntervento();
				listaRowIII = richiestaIII.getDatiAllegato().getAllegatoIII().getRowAllegatoIIIList();
				
				numComponenti = listaRowIII.size();
				idRuolo = Constants.ID_RUOLO_MANUTENTORE_ALL_2;
				idTipoAllegato = Constants.ALLEGATO_TIPO_2;
				break;
			case ALLEGATOIV: 
				log.debug("lettura xml dell'allegato 4");
				XmlValidator.validate(xmlReader, new InputStreamReader(GenericUtil.getFileInClassPath(Constants.XML_IMPORT_ALLEGATO_IV_SCHEMA_DIR)));;
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato4.data.MODIVDocument documentIV = MapDto.mapToImportMODIVDocument(xml);
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato4.data.RichiestaDocument.Richiesta richiestaIV = documentIV.getMODIV().getRichiesta();
				codiceCatasto = richiestaIV.getDatiIntestazione().getCodiceCatasto();
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato4.data.DatiManutentoreDocument.DatiManutentore manutentoreIV = richiestaIV.getDatiManutentore();
				siglaRea = manutentoreIV.getSiglaREA();
				numeroRea = manutentoreIV.getNumeroREA();
				codiceFiscale = manutentoreIV.getCodiceFiscale();
				dataControllo = richiestaIV.getDatiIntestazione().getAFDataControllo();
				dataIntervento = richiestaIV.getDatiAllegato().getDatiTecnico().getAFDataIntervento();
				listaRowIV = richiestaIV.getDatiAllegato().getAllegatoIV().getRowAllegatoIVList();
				
				numComponenti = listaRowIV.size();
				idRuolo = Constants.ID_RUOLO_MANUTENTORE_ALL_3;
				idTipoAllegato = Constants.ALLEGATO_TIPO_3;
				break;
			case ALLEGATOV: 
				log.debug("lettura xml dell'allegato 5");
				XmlValidator.validate(xmlReader, new InputStreamReader(GenericUtil.getFileInClassPath(Constants.XML_IMPORT_ALLEGATO_V_SCHEMA_DIR)));
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato5.data.MODVDocument documentV = MapDto.mapToImportMODVDocument(xml);
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato5.data.RichiestaDocument.Richiesta richiestaV = documentV.getMODV().getRichiesta();
				codiceCatasto = richiestaV.getDatiIntestazione().getCodiceCatasto();
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato5.data.DatiManutentoreDocument.DatiManutentore manutentoreV = richiestaV.getDatiManutentore();
				siglaRea = manutentoreV.getSiglaREA();
				numeroRea = manutentoreV.getNumeroREA();
				codiceFiscale = manutentoreV.getCodiceFiscale();
				dataControllo = richiestaV.getDatiIntestazione().getAFDataControllo();
				dataIntervento = richiestaV.getDatiAllegato().getDatiTecnico().getAFDataIntervento();
				listaRowV = richiestaV.getDatiAllegato().getAllegatoV().getRowAllegatoVList();

				numComponenti = listaRowV.size();
				idRuolo = Constants.ID_RUOLO_MANUTENTORE_ALL_4;
				idTipoAllegato = Constants.ALLEGATO_TIPO_4;
				break;
			case MANUT_GT: 
				log.debug("lettura xml della manutenzione GT");
				XmlValidator.validate(xmlReader, new InputStreamReader(GenericUtil.getFileInClassPath(Constants.XML_IMPORT_MANUT_GT_SCHEMA_DIR)));
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegt.data.MANUTENZIONEDocument documentGT = MapDto.mapToImportMANUTENZIONEGTDocument(xml);
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegt.data.RichiestaDocument.Richiesta richiestaGT = documentGT.getMANUTENZIONE().getRichiesta();
				codiceCatasto = richiestaGT.getDatiIntestazione().getCodiceCatasto();
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegt.data.DatiImpresaDocument.DatiImpresa datiImpresaGT = richiestaGT.getDatiImpresa();
				siglaRea = datiImpresaGT.getSiglaREA();
				numeroRea = datiImpresaGT.getNumeroREA();
				codiceFiscale = datiImpresaGT.getCodiceFiscale();
				dataControllo = richiestaGT.getDatiIntestazione().getAFDataControllo();
				dataIntervento = richiestaGT.getDatiManutenzione().getDatiTecnico().getAFDataIntervento();
				listaCompManut = richiestaGT.getDatiManutenzione().getDettManutenzione().getAENumGTList();
				idTipoManutenzione = richiestaGT.getDatiIntestazione().getTipoIntervento();
				
				numComponenti = listaCompManut.size();
				idRuolo = Constants.ID_RUOLO_MANUTENTORE_ALL_1;
				idTipoAllegato = Constants.MANUTENZIONE_GT;
				break;
			case MANUT_GF: 
				log.debug("lettura xml della manutenzione GF");
				XmlValidator.validate(xmlReader, new InputStreamReader(GenericUtil.getFileInClassPath(Constants.XML_IMPORT_MANUT_GF_SCHEMA_DIR)));
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegf.data.MANUTENZIONEDocument documentGF = MapDto.mapToImportMANUTENZIONEGFDocument(xml);
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegf.data.RichiestaDocument.Richiesta richiestaGF = documentGF.getMANUTENZIONE().getRichiesta();
				codiceCatasto = richiestaGF.getDatiIntestazione().getCodiceCatasto();
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegf.data.DatiImpresaDocument.DatiImpresa datiImpresaGF = richiestaGF.getDatiImpresa();
				siglaRea = datiImpresaGF.getSiglaREA();
				numeroRea = datiImpresaGF.getNumeroREA();
				codiceFiscale = datiImpresaGF.getCodiceFiscale();
				dataControllo = richiestaGF.getDatiIntestazione().getAFDataControllo();
				dataIntervento = richiestaGF.getDatiManutenzione().getDatiTecnico().getAFDataIntervento();
				listaCompManut = richiestaGF.getDatiManutenzione().getDettManutenzione().getAENumGFList();
				idTipoManutenzione = richiestaGF.getDatiIntestazione().getTipoIntervento();
				
				numComponenti = listaCompManut.size();
				idRuolo = Constants.ID_RUOLO_MANUTENTORE_ALL_2;
				idTipoAllegato = Constants.MANUTENZIONE_GF;
				break;
			case MANUT_SC: 
				log.debug("lettura xml della manutenzione SC");
				XmlValidator.validate(xmlReader, new InputStreamReader(GenericUtil.getFileInClassPath(Constants.XML_IMPORT_MANUT_SC_SCHEMA_DIR)));
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionesc.data.MANUTENZIONEDocument documentSC = MapDto.mapToImportMANUTENZIONESCDocument(xml);
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionesc.data.RichiestaDocument.Richiesta richiestaSC = documentSC.getMANUTENZIONE().getRichiesta();
				codiceCatasto = richiestaSC.getDatiIntestazione().getCodiceCatasto();
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionesc.data.DatiImpresaDocument.DatiImpresa datiImpresaSC = richiestaSC.getDatiImpresa();
				siglaRea = datiImpresaSC.getSiglaREA();
				numeroRea = datiImpresaSC.getNumeroREA();
				codiceFiscale = datiImpresaSC.getCodiceFiscale();
				dataControllo = richiestaSC.getDatiIntestazione().getAFDataControllo();
				dataIntervento = richiestaSC.getDatiManutenzione().getDatiTecnico().getAFDataIntervento();
				listaCompManut = richiestaSC.getDatiManutenzione().getDettManutenzione().getAENumSCList();
				idTipoManutenzione = richiestaSC.getDatiIntestazione().getTipoIntervento();
				
				numComponenti = listaCompManut.size();
				idRuolo = Constants.ID_RUOLO_MANUTENTORE_ALL_3;
				idTipoAllegato = Constants.MANUTENZIONE_SC;
				break;
			case MANUT_CG:
				log.debug("lettura xml della manutenzione CG");
				XmlValidator.validate(xmlReader, new InputStreamReader(GenericUtil.getFileInClassPath(Constants.XML_IMPORT_MANUT_CG_SCHEMA_DIR)));
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionecg.data.MANUTENZIONEDocument documentCG = MapDto.mapToImportMANUTENZIONECGDocument(xml);
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionecg.data.RichiestaDocument.Richiesta richiestaCG = documentCG.getMANUTENZIONE().getRichiesta();
				codiceCatasto = richiestaCG.getDatiIntestazione().getCodiceCatasto();
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionecg.data.DatiImpresaDocument.DatiImpresa datiImpresaCG = richiestaCG.getDatiImpresa();
				siglaRea = datiImpresaCG.getSiglaREA();
				numeroRea = datiImpresaCG.getNumeroREA();
				codiceFiscale = datiImpresaCG.getCodiceFiscale();
				dataControllo = richiestaCG.getDatiIntestazione().getAFDataControllo();
				dataIntervento = richiestaCG.getDatiManutenzione().getDatiTecnico().getAFDataIntervento();
				listaCompManut = richiestaCG.getDatiManutenzione().getDettManutenzione().getAENumCGList();
				idTipoManutenzione = richiestaCG.getDatiIntestazione().getTipoIntervento();
				
				numComponenti = listaCompManut.size();
				idRuolo = Constants.ID_RUOLO_MANUTENTORE_ALL_4;
				idTipoAllegato = Constants.MANUTENZIONE_CG;
				break;
			default:
				log.debug("Tipo controllo non conosciuto");
				throw new SigitextException(Messages.ERROR_TIPO_CONTROLLO);
			}
			
			log.debug("tipo allegato: " + tipoAllegato);

			if (codiceImpianto == null || codiceCatasto == null || !codiceImpianto.equals(ConvertUtil.convertToInteger(codiceCatasto))) {
				throw new SigitextException(Messages.ERROR_CODICE_IMPIANTO_DIVERSO_DA_CODICE_CATASTO);
			}
						
			if (personaGiuridica != null && !(personaGiuridica.getSiglaRea().equalsIgnoreCase(siglaRea) &&
					ConvertUtil.convertToString(personaGiuridica.getNumeroRea()).equalsIgnoreCase(numeroRea) &&
					personaGiuridica.getCodiceFiscale().equalsIgnoreCase(codiceFiscale)))
			{
				log.debug("L'impresa indicata nell'xml e' diversa da quella loggata");
				throw new SigitextException(Messages.S044);
				
			}
			
			// Verificare che il manutentore indicato (tag siglaREA, numeroREA, codiceFiscale) esista su SIGIT_T_PERSONA_GIURIDICA
			List<SigitTPersonaGiuridicaDto> pgList = getDbServiceImp().cercaPersonaGiuridica(codiceFiscale, siglaRea, ConvertUtil.convertToBigDecimal(numeroRea));
			SigitTPersonaGiuridicaDto pg = null;
			if(pgList==null || pgList.isEmpty())
			{
				log.debug("Persona giuridica non trovata");
				throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S100, MapDto.getCodiceRea(siglaRea, ConvertUtil.convertToInteger(numeroRea))));
			}
			
			// Setto la PersonaGiuridica
			pg = pgList.get(0);
			
			if (pg.getFkStatoPg().intValue() == Constants.ID_STATO_IMPRESA_SOSPESA
					|| pg.getFkStatoPg().intValue() == Constants.ID_STATO_IMPRESA_RADIATA) {
				throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S147, MapDto.getCodiceRea(pg.getSiglaRea(), ConvertUtil.convertToInteger(pg.getNumeroRea())), pg.getCodiceFiscale()));
			}
			
			//controllo se il manutentore indicato non abbia l'attivita' cessata
			verificaDataCessazioneAttivita(ConvertUtil.convertToString(dataControllo),
					ConvertUtil.convertToString(pgList.get(0).getDataCessazione()));
			
			switch (tipoImportAllegato) {
			case ALLEGATOII:
				if (listaRowII == null)
				{
					throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "rowAllegatoII"));
				}
				
				for (int i = 0; i < listaRowII.size(); i++) {
					RowAllegatoII rowAllegatoII = listaRowII.get(i);
					String progressivo = ConvertUtil.convertToString(rowAllegatoII.getAENumGT());
					
					if (!listaProgressivi.contains(progressivo)) {		
						listaProgressivi.add(progressivo);
					}
				}
				break;
			case ALLEGATOIII:
				if (listaRowIII == null)
				{
					throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "rowAllegatoIII"));
				}
				
				for (int i = 0; i < listaRowIII.size(); i++) {
					RowAllegatoIII rowAllegatoIII = listaRowIII.get(i);
					String progressivo = ConvertUtil.convertToString(rowAllegatoIII.getAENumGF());
					
					if (!listaProgressivi.contains(progressivo)) {		
						listaProgressivi.add(progressivo);
					}
				}
				break;
			case ALLEGATOIV:
				if (listaRowIV == null) {
					throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "rowAllegatoIV"));
				}

				for (int i = 0; i < listaRowIV.size(); i++) {
					RowAllegatoIV rowAllegatoIV = listaRowIV.get(i);
					String progressivo = ConvertUtil.convertToString(rowAllegatoIV.getAENumSC());
					
					if (!listaProgressivi.contains(progressivo)) {		
						listaProgressivi.add(progressivo);
					}
				}
				break;
			case ALLEGATOV:
				if (listaRowV == null) {
					throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "rowAllegatoV"));
				}
				
				for (int i = 0; i < listaRowV.size(); i++) {
					RowAllegatoV rowAllegatoV = listaRowV.get(i);
					String progressivo = ConvertUtil.convertToString(rowAllegatoV.getAENumCG());
					
					if (!listaProgressivi.contains(progressivo)) {		
						listaProgressivi.add(progressivo);
					}
				}
				break;
			case MANUT_GT:
			case MANUT_GF:
			case MANUT_SC:
			case MANUT_CG:
				if (listaCompManut == null) {
					
					if (tipoImportAllegato.equals(TipoImportAllegatoEnum.MANUT_GT)) {				
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_numGT"));
					} else if (tipoImportAllegato.equals(TipoImportAllegatoEnum.MANUT_GF)) {
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_numGF"));
					} else if (tipoImportAllegato.equals(TipoImportAllegatoEnum.MANUT_SC)) {
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_numSC"));
					} else {
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_numCG"));
					}
				}
				
				for (int i = 0; i < listaCompManut.size(); i++) {
					BigInteger progCompManut = listaCompManut.get(i);
					String progressivo = ConvertUtil.convertToString(progCompManut);
					
					if (!listaProgressivi.contains(progressivo)) {		
						listaProgressivi.add(progressivo);
					}
				}
				break;
			}
			
//			Verificare che il manutentore indicato (tag siglaREA, numeroREA, codiceFiscale) abbia una associazione attiva alla data attuale
//			su SIGIT_R_IMP_RUOLO_PFPG per il codice impianto indicato (tag codiceCatasto) e per il tipo allegato indicato
			List<SigitRComp4ManutDto> manAttivoAttuale = getDbServiceImp().cercaAttualiByRuolo(codiceCatasto, pg.getIdPersonaGiuridica(), idRuolo, listaProgressivi);
			
			if(manAttivoAttuale==null || manAttivoAttuale.isEmpty() || manAttivoAttuale.size() != numComponenti)
			{
				log.debug("Manutentore non attivo alla data attuale");
				String msg = Messages.S101.replaceFirst("##valueCodImpianto##", codiceCatasto)
						//.replaceFirst("##valueDataControllo##", ConvertUtil.convertToString(dataControllo))
						.replaceFirst("##valueTipoAllegato##", tipoAllegato);
				throw new SigitextException(GenericUtil.replacePlaceholder(msg, MapDto.getCodiceRea(siglaRea, ConvertUtil.convertToInteger(numeroRea))));
			}

			for (SigitRComp4ManutDto sigitRComp4ManutDto : manAttivoAttuale) {
				listaIdCom4Manut.add(ConvertUtil.convertToString(sigitRComp4ManutDto.getIdRComp4Manut()));
			}
		
			DettaglioAllegato allegato = new DettaglioAllegato();
			allegato.setCodiceImpianto(codiceCatasto);
			allegato.setDataControllo(ConvertUtil.convertToString(dataControllo));
			allegato.setDataIntervento(ConvertUtil.convertToString(dataIntervento));
			allegato.setIdTipoAllegato(idTipoAllegato);
			allegato.setPersonaGiuridica(pg);
			allegato.setIdApparecchiatureFunz(listaProgressivi);
			allegato.setIdCom4Manut(listaIdCom4Manut);
			allegato.setCodiceReaPg(siglaRea + numeroRea);
			allegato.setIdTipoRapProva(ConvertUtil.convertToInteger(idTipoManutenzione));
			
			ImportFilter data = new ImportFilter();
			data.setCodiceImpianto(codiceCatasto);
			data.setDataInizio(DateUtil.getSqlDataCorrente());
			data.setNomeFile(tipoControllo);
			data.setDatiXml(xml);
			data.setDettaglioAllegato(allegato);
			return data;
			
		} catch (IOException e) {
			log.error("Errore: ", e);
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S096,  Constants.ESTENSIONE_XML));
		} catch (XmlValidatorException e) {
			log.debug("errore validazione xml", e);
			throw new SigitextException(Messages.S098);
		} 
		finally
		{
			log.debug("validazionePreImportXmlControllo END");
		}	
	}
	
	public void validazioneImportXmlControllo(ImportFilter data, String tipoControllo) throws SigitextException {
		
		log.debug("[validazioneImportXmlControllo::validazioneImportXmlControllo] Step 3.2.2 - data controllo futura");
		
		byte[] xml = data.getDatiXml();
		
		DettaglioAllegato allegato = data.getDettaglioAllegato();
		String dataControllo = allegato.getDataControllo();
		String dataIntervento = allegato.getDataIntervento();
		String codiceImpianto = allegato.getCodiceImpianto();
		SigitTPersonaGiuridicaDto pg = allegato.getPersonaGiuridica();
		Date dataControlloDate = null;
		ArrayList<String> listaProgressivi = allegato.getIdApparecchiatureFunz();
		
		try {
			dataControlloDate = ConvertUtil.convertToDate(dataControllo);
		} catch (Exception e) {
			throw new SigitextException(Messages.ERROR_FORMAT_DATA_CONTROLLO,e);
		}
		
		
		// Verifico che la data controllo non sia futura
		if (dataControlloDate.getTime() > System.currentTimeMillis()) {
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S102, dataControllo));
		}
		
		//Verifico che la data "intervento raccomandato entro" non sia precedente alla data controllo 
		if (DateUtil.checkDateOrder(dataIntervento, dataControllo, false)) {
			throw new SigitextException(Messages.ERROR_DATA_INTERVENTO_PRECEDENTE_DATA_CONTROLLO);
		}
				
		// Devo verificare che esista un responsabile alla data rapporto
		if (isNessunResponsabileByCodImpiantoApp(codiceImpianto, dataControllo, listaProgressivi)) {
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.ERROR_NESSUN_RESPONSABILE_A_DATA_CONTROLLO, dataControllo, codiceImpianto));
		} 
		
		// Devo verificare che esista un responsabile alla data odierna
		if (getDbServiceImp().cercaResponsabileAttivoByCodImpianto(ConvertUtil.convertToInteger(codiceImpianto)) == null) {
			// Vuol dire che non c'e' un respansabile attivo alla sysdate, non riuscirei a creare il libretto
			throw new SigitextException(GenericUtil.replacePlaceholder(Messages.ERROR_NESSUN_RESPONSABILE_A_DATA_CORRENTE, ConvertUtil.convertToString(new Date()), codiceImpianto));
		} 
		
		TipoImportAllegatoEnum tipoImportAllegato = TipoImportAllegatoEnum.valueOfLabel(tipoControllo);
		
		if (tipoImportAllegato.equals(TipoImportAllegatoEnum.ALLEGATOII) || 
				tipoImportAllegato.equals(TipoImportAllegatoEnum.MANUT_GT)) {
			List<SigitVSk4GtDto> listGt = getDbServiceImp().getCompGtAttiviInDataByIdPg(codiceImpianto, dataControlloDate, pg.getIdPersonaGiuridica());

			if (tipoImportAllegato.equals(TipoImportAllegatoEnum.ALLEGATOII)) {
				
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato2.data.MODIIDocument document = MapDto.mapToImportMODIIDocument(xml);
				
				List<RowAllegatoII> listaRowII = document.getMODII().getRichiesta().getDatiAllegato().getAllegatoII().getRowAllegatoIIList();
				
				ArrayList<BigInteger> moduliTermiciList = new ArrayList<BigInteger>();

			
				if (listaRowII == null || listGt == null)
				{
					throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "rowAllegatoII"));
				}
				
				for (int i = 0; i < listaRowII.size(); i++) {
					RowAllegatoII rowAllegatoII = listaRowII.get(i);
					SigitVSk4GtDto gt = null;
					
					moduliTermiciList.clear();

					boolean isTrovato = false;
					
					for (int z = 0; z < listGt.size(); z++) {
						gt = listGt.get(z);
						if (rowAllegatoII.getAENumGT().intValue() == gt.getProgressivo().intValue())
						{
							// Vuol dire che go trovato la riga anche sul DB
							isTrovato = true;

							break;
						}
					}
					
					if (!isTrovato)
					{
						// Il numero del GT non e' corretto, non risulta associato al manutentore
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S106, GenericUtil.getDescSezioneComp(Constants.TIPO_COMPONENTE_GT, rowAllegatoII.getAENumGT()), MapDto.getCodiceRea(pg.getSiglaRea(), ConvertUtil.convertToInteger(pg.getNumeroRea()))));
						// La componente GT rowAllegatoII.getAENumGT() non risulta associato al manutentore pg.getSiglaRea() + NumRFea
					}
					
					List<it.csi.sigit.sigitwebn.xml.importmassivo.allegato2.data.RowFumiDocument.RowFumi> listFumi = rowAllegatoII.getTabFumi().getRowFumiList();

					int nModuliDb = GenericUtil.isNotNullOrEmpty(gt.getNModuli())?gt.getNModuli().intValue() : 1;

					if (listFumi.size() != nModuliDb)
					{
						log.debug("[validazioneImportXmlControllo::validazioneXmlImport] Step 3.10 - Il numero dei row fumi XML non corrisponde con il numero di row fumi del DB");

						// Non corrispondono le righe
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S107_GT, codiceImpianto));
					}
					
					for (int j = 0; j < listFumi.size(); j++) {
						it.csi.sigit.sigitwebn.xml.importmassivo.allegato2.data.RowFumiDocument.RowFumi rowFumi = listFumi.get(j);
						
						if (moduliTermiciList.contains(rowFumi.getAEModuloTermico()))
						{
							// Il numero del modulo non e' corretto, e' gia' presente lo stesso numero A_E_moduloTermico
							throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_moduloTermico"));
						}
						else
						{
							moduliTermiciList.add(rowFumi.getAEModuloTermico());
						}
						
						if (GenericUtil.isNotNullOrEmpty(rowFumi.getAEValorePortata()) && GenericUtil.isNullOrEmpty(rowFumi.getAEPortataCombu())) {
							throw new SigitextException(Messages.ERROR_PORTATA_COMBUSTIBILE_NON_TROVATA);
						}
						
						if (GenericUtil.isNotNullOrEmpty(rowFumi.getAEPortataCombu()) && 
								!(rowFumi.getAEPortataCombu().equals(Portata.M_3_H) ||
								rowFumi.getAEPortataCombu().equals(Portata.KG_H))) {
							throw new SigitextException(Messages.ERROR_PORTATA_COMBUSTIBILE_NON_COERENTE);
						}
					}

					for (int j = 1; j <= nModuliDb; j++) {
						
						if (!moduliTermiciList.contains(new BigInteger(ConvertUtil.convertToString(j))))
						{
							// l'utente ha inserito un numero modulo non corretto, ad es: sul db c'e' solo 1 numero modulo, l'utente ci ha passato 1 solo rowFumi ma come numero ha settato 2
							throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S107_GT, codiceImpianto));
						}
					}
				}
			} else {
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegt.data.MANUTENZIONEDocument document = MapDto.mapToImportMANUTENZIONEGTDocument(xml);
				
				List<BigInteger> listaCompManut = document.getMANUTENZIONE().getRichiesta().getDatiManutenzione().getDettManutenzione().getAENumGTList();
				
				if (listaCompManut == null || listGt == null)
				{
					throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_numGT"));
				}
				
				for (int i = 0; i < listaCompManut.size(); i++) {
					BigInteger progCompManut = listaCompManut.get(i);
					SigitVSk4GtDto gt = null;
					
					boolean isTrovato = false;
					
					for (int z = 0; z < listGt.size(); z++) {
						gt = listGt.get(z);
						if (progCompManut.intValue() == gt.getProgressivo().intValue())
						{
							// Vuol dire che go trovato la riga anche sul DB
							isTrovato = true;

							break;
						}
					}
					
					if (!isTrovato)
					{
						// Il numero del GT non e' corretto, non risulta associato al manutentore
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S106, GenericUtil.getDescSezioneComp(Constants.TIPO_COMPONENTE_GT, progCompManut), MapDto.getCodiceRea(pg.getSiglaRea(), ConvertUtil.convertToInteger(pg.getNumeroRea()))));
					}
				}
			}
		} else if (tipoImportAllegato.equals(TipoImportAllegatoEnum.ALLEGATOIII) ||
				tipoImportAllegato.equals(TipoImportAllegatoEnum.MANUT_GF)) {

			List<SigitVSk4GfDto> listGf = getDbServiceImp().getCompGfAttiviInDataByIdPg(codiceImpianto, dataControlloDate, pg.getIdPersonaGiuridica());

			if (tipoImportAllegato.equals(TipoImportAllegatoEnum.ALLEGATOIII)) {

				it.csi.sigit.sigitwebn.xml.importmassivo.allegato3.data.MODIIIDocument document = MapDto.mapToImportMODIIIDocument(xml);
				
				List<RowAllegatoIII> listaRowIII = document.getMODIII().getRichiesta().getDatiAllegato().getAllegatoIII().getRowAllegatoIIIList();

				
				if (listaRowIII == null || listGf == null)
				{
					throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "rowAllegatoIII"));
				}
				
				ArrayList<BigInteger> numCircuitoList = new ArrayList<BigInteger>();
				//ArrayList<String> listaProgressivi = new ArrayList<String>();

				for (int i = 0; i < listaRowIII.size(); i++) {
					RowAllegatoIII rowAllegatoIII = listaRowIII.get(i);
					
					numCircuitoList.clear();
					
					boolean isTrovato = false;
					SigitVSk4GfDto gf = null;
					for (int z = 0; z < listGf.size(); z++) {
						gf = listGf.get(z);
						if (rowAllegatoIII.getAENumGF().intValue() == gf.getProgressivo().intValue())
						{
							isTrovato = true;
							break;
						}
					}
					
					if (!isTrovato)
					{
						// Il numero del GF non e' corretto, non risulta associato al manutentore
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S106, GenericUtil.getDescSezioneComp(Constants.TIPO_COMPONENTE_GF, rowAllegatoIII.getAENumGF()), MapDto.getCodiceRea(pg.getSiglaRea(), ConvertUtil.convertToInteger(pg.getNumeroRea()))));

					}

					List<it.csi.sigit.sigitwebn.xml.importmassivo.allegato3.data.RowFumiDocument.RowFumi> listFumi = rowAllegatoIII.getTabFumi().getRowFumiList();

					int nCircuitiDb = GenericUtil.isNotNullOrEmpty(gf.getNCircuiti())?gf.getNCircuiti().intValue() : 1;

					if (listFumi.size() != nCircuitiDb)
					{
						log.debug("[validazioneImportXmlControllo::validazioneXmlImport] Step 3.10 - Il numero dei row fumi XML non corrisponde con il numero di row circuito del DB");

						// Non corrispondono le righe
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S107_GF, codiceImpianto));
					}
					
				
					for (int j = 0; j < listFumi.size(); j++) {
						it.csi.sigit.sigitwebn.xml.importmassivo.allegato3.data.RowFumiDocument.RowFumi rowFumi = listFumi.get(j);
						
						
						if (numCircuitoList.contains(rowFumi.getAENumCircuito()))
						{
							// Il numero del modulo non e' corretto, e' gia' presente lo stesso numero A_E_numCircuito
							throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_numCircuito"));
						}
						else
						{
							numCircuitoList.add(rowFumi.getAENumCircuito());
						}
					}

					for (int j = 1; j <= nCircuitiDb; j++) {
						
						if (!numCircuitoList.contains(new BigInteger(ConvertUtil.convertToString(j))))
						{
							// l'utente ha inserito un numero modulo non corretto, ad es: sul db c'e' rolo 1 numero circuito, l'utente ci ha passato 1 solo rowFumi ma come numero ha settato 2
							throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S107_GF, codiceImpianto));
						}
					}
				}
			} else {
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionegf.data.MANUTENZIONEDocument document = MapDto.mapToImportMANUTENZIONEGFDocument(xml);
				
				List<BigInteger> listaCompManut = document.getMANUTENZIONE().getRichiesta().getDatiManutenzione().getDettManutenzione().getAENumGFList();
				
				if (listaCompManut == null || listGf == null)
				{
					throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_numGF"));
				}
				
				for (int i = 0; i < listaCompManut.size(); i++) {
					BigInteger progCompManut = listaCompManut.get(i);
					SigitVSk4GfDto gf = null;
					
					boolean isTrovato = false;
					
					for (int z = 0; z < listGf.size(); z++) {
						gf = listGf.get(z);
						if (progCompManut.intValue() == gf.getProgressivo().intValue())
						{
							// Vuol dire che go trovato la riga anche sul DB
							isTrovato = true;

							break;
						}
					}
					
					if (!isTrovato)
					{
						// Il numero del GF non e' corretto, non risulta associato al manutentore
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S106, GenericUtil.getDescSezioneComp(Constants.TIPO_COMPONENTE_GF, progCompManut), MapDto.getCodiceRea(pg.getSiglaRea(), ConvertUtil.convertToInteger(pg.getNumeroRea()))));
					}
				}
			}
		} else if (tipoImportAllegato.equals(TipoImportAllegatoEnum.ALLEGATOIV) ||
				tipoImportAllegato.equals(TipoImportAllegatoEnum.MANUT_SC)) {

			List<SigitVSk4ScDto> listSc = getDbServiceImp().getCompScAttiviInDataByIdPg(codiceImpianto, dataControlloDate, pg.getIdPersonaGiuridica());

			if (tipoImportAllegato.equals(TipoImportAllegatoEnum.ALLEGATOIV)) {
				
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato4.data.MODIVDocument document = MapDto.mapToImportMODIVDocument(xml);
				
				List<RowAllegatoIV> listaRowIV = document.getMODIV().getRichiesta().getDatiAllegato().getAllegatoIV().getRowAllegatoIVList();

				
				if (listaRowIV == null || listSc == null)
				{
					throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "rowAllegatoIV"));
				}

				for (int i = 0; i < listaRowIV.size(); i++) {
					RowAllegatoIV rowAllegatoIV = listaRowIV.get(i);

					SigitVSk4ScDto sc = null;

					boolean isTrovato = false;
					for (int z = 0; z < listSc.size(); z++) {
						sc = listSc.get(z);
						if (rowAllegatoIV.getAENumSC().intValue() == sc.getProgressivo().intValue())
						{
							isTrovato = true;
							break;
						}
					}
					
					if (!isTrovato)
					{
						// Il numero del SC non e' corretto, non risulta associato al manutentore
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S106, GenericUtil.getDescSezioneComp(Constants.TIPO_COMPONENTE_SC, rowAllegatoIV.getAENumSC()), MapDto.getCodiceRea(pg.getSiglaRea(), ConvertUtil.convertToInteger(pg.getNumeroRea()))));

					}
					
					it.csi.sigit.sigitwebn.xml.importmassivo.allegato4.data.ControlloVerificaEnergeticaDocument.ControlloVerificaEnergetica controlloVEner = rowAllegatoIV.getControlloVerificaEnergetica();

					
					if (!GenericUtil.checkValideNumber(controlloVEner.getAECombustibile()) || 
							getDbServiceImp().getFluidoCITByPrimaryKey(ConvertUtil.convertToBigDecimal(controlloVEner.getAECombustibile())) == null)
					{
						// Il codice fluido e' inesistente
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_combustibile"));

					}
					
					if (!GenericUtil.checkValideNumber(controlloVEner.getAEFluidoVett()) || 
							getDbServiceImp().getFluidoCITByPrimaryKey(ConvertUtil.convertToBigDecimal(controlloVEner.getAEFluidoVett())) == null)
					{
						// Il codice fluido e' inesistente
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_fluidoVett"));
					}
				}
			} else {
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionesc.data.MANUTENZIONEDocument document = MapDto.mapToImportMANUTENZIONESCDocument(xml);
				
				List<BigInteger> listaCompManut = document.getMANUTENZIONE().getRichiesta().getDatiManutenzione().getDettManutenzione().getAENumSCList();
				
				if (listaCompManut == null || listSc == null)
				{
					throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_numSC"));
				}
				
				for (int i = 0; i < listaCompManut.size(); i++) {
					BigInteger progCompManut = listaCompManut.get(i);
					SigitVSk4ScDto sc = null;
					
					boolean isTrovato = false;
					
					for (int z = 0; z < listSc.size(); z++) {
						sc = listSc.get(z);
						if (progCompManut.intValue() == sc.getProgressivo().intValue())
						{
							// Vuol dire che go trovato la riga anche sul DB
							isTrovato = true;

							break;
						}
					}
					
					if (!isTrovato)
					{
						// Il numero del SC non e' corretto, non risulta associato al manutentore
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S106, GenericUtil.getDescSezioneComp(Constants.TIPO_COMPONENTE_SC, progCompManut), MapDto.getCodiceRea(pg.getSiglaRea(), ConvertUtil.convertToInteger(pg.getNumeroRea()))));
					}
				}
			}
		} else if (tipoImportAllegato.equals(TipoImportAllegatoEnum.ALLEGATOV) ||
				tipoImportAllegato.equals(TipoImportAllegatoEnum.MANUT_CG)) {
			List<SigitVSk4CgDto> listCg = getDbServiceImp().getCompCgAttiviInDataByIdPg(codiceImpianto, dataControlloDate, pg.getIdPersonaGiuridica());

			if (tipoImportAllegato.equals(TipoImportAllegatoEnum.ALLEGATOV)) {
				it.csi.sigit.sigitwebn.xml.importmassivo.allegato5.data.MODVDocument document = MapDto.mapToImportMODVDocument(xml);
				
				List<RowAllegatoV> listaRowV = document.getMODV().getRichiesta().getDatiAllegato().getAllegatoV().getRowAllegatoVList();
				

				if (listaRowV == null || listCg == null)
				{
					throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "rowAllegatoV"));
				}
				
				for (int i = 0; i < listaRowV.size(); i++) {
					RowAllegatoV rowAllegatoV = listaRowV.get(i);

					SigitVSk4CgDto cg = null;

					boolean isTrovato = false;
					for (int z = 0; z < listCg.size(); z++) {
						cg = listCg.get(z);
						if (rowAllegatoV.getAENumCG().intValue() == cg.getProgressivo().intValue())
						{
							isTrovato = true;
							
							break;
						}
					}
					
					if (!isTrovato)
					{
						// Il numero del CG non e' corretto, non risulta associato al manutentore
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S106, GenericUtil.getDescSezioneComp(Constants.TIPO_COMPONENTE_CG, rowAllegatoV.getAENumCG()), MapDto.getCodiceRea(pg.getSiglaRea(), ConvertUtil.convertToInteger(pg.getNumeroRea()))));

					}
					
					it.csi.sigit.sigitwebn.xml.importmassivo.allegato5.data.ControlloVerificaEnergeticaDocument.ControlloVerificaEnergetica controlloVEner = rowAllegatoV.getControlloVerificaEnergetica();

					if (!GenericUtil.checkValideNumber(controlloVEner.getAEFluidoVett()) || 
							getDbServiceImp().getFluidoCITByPrimaryKey(ConvertUtil.convertToBigDecimal(controlloVEner.getAEFluidoVett())) == null)
					{
						// Il codice fluido e' inesistente
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_fluidoVett"));

					}
				}
			} else {
				it.csi.sigit.sigitwebn.xml.importmassivo.manutenzionecg.data.MANUTENZIONEDocument document = MapDto.mapToImportMANUTENZIONECGDocument(xml);
				
				List<BigInteger> listaCompManut = document.getMANUTENZIONE().getRichiesta().getDatiManutenzione().getDettManutenzione().getAENumCGList();
				
				if (listaCompManut == null || listCg == null)
				{
					throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S105, "A_E_numCG"));
				}
				
				for (int i = 0; i < listaCompManut.size(); i++) {
					BigInteger progCompManut = listaCompManut.get(i);
					SigitVSk4CgDto cg = null;
					
					boolean isTrovato = false;
					
					for (int z = 0; z < listCg.size(); z++) {
						cg = listCg.get(z);
						if (progCompManut.intValue() == cg.getProgressivo().intValue())
						{
							// Vuol dire che go trovato la riga anche sul DB
							isTrovato = true;

							break;
						}
					}
					
					if (!isTrovato)
					{
						// Il numero del CG non e' corretto, non risulta associato al manutentore
						throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S106, GenericUtil.getDescSezioneComp(Constants.TIPO_COMPONENTE_CG, progCompManut), MapDto.getCodiceRea(pg.getSiglaRea(), ConvertUtil.convertToInteger(pg.getNumeroRea()))));
					}
				}
			}
		}	
	}

	/**
	 * Controllo che in caso di manutentore con attivita' cessata, la data di controllo non sia successiva alla data di cessata attivita'
	  * @param String dataControllo
	  * @param String dataCessazione
	  * @throws SigitextException la data di controllo e' precedende a quella di ritiro
	 */

	private void verificaDataCessazioneAttivita(String dataControllo, String dataCessazione) throws SigitextException {

		if(GenericUtil.isNotNullOrEmpty(dataCessazione)){
			boolean flag = DateUtil.checkDateOrder(dataCessazione, dataControllo, true);

			if(flag){
				throw new SigitextException(GenericUtil.replacePlaceholder(Messages.S052,dataCessazione));
			}
		}
	}
	
	private boolean isNessunResponsabileByCodImpiantoApp(String codImpianto, String dataRapporto, ArrayList<String> listaProgressivi) throws SigitextException {
			
		Integer contaResponsabile = getDbServiceImp().cercaPrimoResponsabileAttivoAllaDataByCodImpiantoApp(codImpianto, dataRapporto, listaProgressivi);
		
		return contaResponsabile == null || contaResponsabile.intValue() == 0;
	}
	
}
