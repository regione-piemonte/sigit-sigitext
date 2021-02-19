/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.pdf;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.CombustibileCITDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.MarcaCITDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitExtContrattoImpDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompBrRcDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompVxDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompXDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTCompXSempliceDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTConsumo14_4Dto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTConsumoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTImpiantoDto;
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
import it.csi.sigit.sigitext.business.util.Constants;
import it.csi.sigit.sigitext.business.util.ConvertUtil;
import it.csi.sigit.sigitext.business.util.GenericUtil;
import it.csi.sigit.sigitext.business.util.MapDto;
import it.csi.sigit.sigitext.dto.sigitext.Documento;

public class LibrettoBuilder extends BaseBuilder {
	
	private static String FILE = "C:/Repo/CSI/sigit/sigit_sigitext/test/java/test/sigitext/";
		
	public static void main(String[] args) {
		try {
			LibrettoBuilder ispezione = new LibrettoBuilder();

			Documento documento = ispezione.generaLibretto(null, true, true);
			byte[] libretto = documento.getDoc(); 
			
			FileOutputStream fileStream =  new FileOutputStream(FILE+getDataCompleta()+"_test_libretto.pdf");
			
			fileStream.write(libretto);   
			fileStream.flush(); 
			fileStream.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Documento generaLibretto(DatiLibretto datiLibretto, boolean isSimul, boolean isBozza) {
		gestDebug(isSimul, "generaLibretto - START");
		
		Documento libretto = new Documento();
		
		if (isSimul) {
			datiLibretto = new DatiLibretto();
			
			SigitTImpiantoDto impianto = new SigitTImpiantoDto();
			impianto.setCodiceImpianto(BigDecimal.ONE);
			datiLibretto.setImpianto(impianto);
			
			datiLibretto.setUnitaImmobiliList(new ArrayList<SigitTUnitaImmobiliareDto>());
//			
//			List <SigitVTotImpiantoDto> respImpiantoList = new ArrayList<SigitVTotImpiantoDto>();
//			respImpiantoList.add(new SigitVTotImpiantoDto()); 
//			datiLibretto.setRespAttivi(respImpiantoList);
//			datiLibretto.setTrattH2O(new SigitTTrattH2ODto());
//			
//			List<SigitExtContrattoImpDto> contratti = new ArrayList<SigitExtContrattoImpDto>();
//			SigitExtContrattoImpDto contratto = new SigitExtContrattoImpDto();
//			contratto.setFkRuolo(BigDecimal.valueOf(4));
//			contratti.add(contratto);
//			datiLibretto.setContratti(contratti);
//			
//			List<SigitVSk4GtDto> compGtImpiantoList = new ArrayList<SigitVSk4GtDto>();
//			SigitVSk4GtDto compGt = new SigitVSk4GtDto();
//			compGt.setProgressivo(BigDecimal.ONE);
//			compGtImpiantoList.add(compGt);
//			datiLibretto.setComSk4GtImpianto(compGtImpiantoList);
//			
//			List<SigitTCompBrRcDto> compBrImpiantoList = new ArrayList<SigitTCompBrRcDto>();
//			SigitTCompBrRcDto compBrImpianto = new SigitTCompBrRcDto();
//			compBrImpianto.setProgressivoBrRc(BigDecimal.ONE);
//			compBrImpianto.setFkProgressivo(BigDecimal.ONE);
//			compBrImpiantoList.add(compBrImpianto);
//			datiLibretto.setCompBrImpianto(compBrImpiantoList);
//			
//			List<SigitTCompBrRcDto> compRcImpiantoList = new ArrayList<SigitTCompBrRcDto>();
//			SigitTCompBrRcDto compRcImpianto = new SigitTCompBrRcDto();
//			compRcImpianto.setProgressivoBrRc(BigDecimal.ONE);
//			compRcImpianto.setFkProgressivo(BigDecimal.ONE);
//			compRcImpiantoList.add(compRcImpianto);
//			datiLibretto.setCompRcImpianto(compRcImpiantoList);
//			
//			List<SigitVSk4GfDto> compGfImpiantoList = new ArrayList<SigitVSk4GfDto>();
//			SigitVSk4GfDto compGf = new SigitVSk4GfDto();
//			compGf.setProgressivo(BigDecimal.ONE);
//			compGfImpiantoList.add(compGf);
//			datiLibretto.setComSk4GfImpianto(compGfImpiantoList);
//			
//			List<SigitVSk4ScDto> compScImpiantoList = new ArrayList<SigitVSk4ScDto>();
//			SigitVSk4ScDto compSc = new SigitVSk4ScDto();
//			compSc.setProgressivo(BigDecimal.ONE);
//			compScImpiantoList.add(compSc);
//			datiLibretto.setComSk4ScImpianto(compScImpiantoList);
//			
//			List<SigitVSk4CgDto> compCgImpiantoList = new ArrayList<SigitVSk4CgDto>();
//			SigitVSk4CgDto compCg = new SigitVSk4CgDto();
//			compCg.setProgressivo(BigDecimal.ONE);
//			compCgImpiantoList.add(compCg);
//			datiLibretto.setComSk4CgImpianto(compCgImpiantoList);
//			
//			List<SigitVCompCsDto> compCsImpiantoList = new ArrayList<SigitVCompCsDto>();
//			SigitVCompCsDto compCs = new SigitVCompCsDto();
//			compCs.setProgressivo(BigDecimal.ONE);
//			compCsImpiantoList.add(compCs);
//			datiLibretto.setCompCsImpianto(compCsImpiantoList);
//			
//			List<SigitVCompAgDto> compAgImpiantoList = new ArrayList<SigitVCompAgDto>();
//			SigitVCompAgDto compAg = new SigitVCompAgDto();
//			compAg.setProgressivo(BigDecimal.ONE);
//			compAgImpiantoList.add(compAg);
//			datiLibretto.setCompAgImpianto(compAgImpiantoList);
//			datiLibretto.setCompXSemplice(new SigitTCompXSempliceDto());
//			
//			List<SigitVCompSrDto> compSrList = new ArrayList<SigitVCompSrDto>();
//			SigitVCompSrDto compSr = new SigitVCompSrDto();
//			compSr.setProgressivo(BigDecimal.ONE);
//			compSrList.add(compSr);
//			datiLibretto.setSrList(compSrList);
//			
//			List<SigitVCompVrDto> compVrList = new ArrayList<SigitVCompVrDto>();
//			SigitVCompVrDto compVr = new SigitVCompVrDto();
//			compVr.setProgressivo(BigDecimal.ONE);
//			compVrList.add(compVr);
//			datiLibretto.setVrList(compVrList);
//			
//			List<SigitTCompVxDto> compVxList = new ArrayList<SigitTCompVxDto>();
//			SigitTCompVxDto compVx = new SigitTCompVxDto();
//			compVx.setProgressivo(BigDecimal.ONE);
//			compVxList.add(compVx);
//			datiLibretto.setVxList(compVxList);
//			
//			List<SigitVCompPoDto> compPoList = new ArrayList<SigitVCompPoDto>();
//			SigitVCompPoDto compPo = new SigitVCompPoDto();
//			compPo.setProgressivo(BigDecimal.ONE);
//			compPoList.add(compPo);
//			datiLibretto.setPoList(compPoList);
//			
//			List<SigitVCompAcDto> compAcList = new ArrayList<SigitVCompAcDto>();
//			SigitVCompAcDto compAc = new SigitVCompAcDto();
//			compAc.setProgressivo(BigDecimal.ONE);
//			compAcList.add(compAc);
//			datiLibretto.setAcList(compAcList);
//			
//			List<SigitVCompTeDto> compTeList = new ArrayList<SigitVCompTeDto>();
//			SigitVCompTeDto compTe = new SigitVCompTeDto();
//			compTe.setProgressivo(BigDecimal.ONE);
//			compTeList.add(compTe);
//			datiLibretto.setTeList(compTeList);
//			
//			List<SigitVCompRvDto> compRvList = new ArrayList<SigitVCompRvDto>();
//			SigitVCompRvDto compRv = new SigitVCompRvDto();
//			compRv.setProgressivo(BigDecimal.ONE);
//			compRvList.add(compRv);
//			datiLibretto.setRvList(compRvList);
//			
//			List<SigitTCompXDto> compScxList = new ArrayList<SigitTCompXDto>();
//			SigitTCompXDto compScx = new SigitTCompXDto();
//			compScx.setProgressivo(BigDecimal.ONE);
//			compScxList.add(compScx);
//			datiLibretto.setScxList(compScxList);
//			
//			List<SigitVCompCiDto> compCiList = new ArrayList<SigitVCompCiDto>();
//			SigitVCompCiDto compCi = new SigitVCompCiDto();
//			compCi.setProgressivo(BigDecimal.ONE);
//			compCiList.add(compCi);
//			datiLibretto.setCiList(compCiList);
//			
//			List<SigitVCompUtDto> compUtList = new ArrayList<SigitVCompUtDto>();
//			SigitVCompUtDto compUt = new SigitVCompUtDto();
//			compUt.setProgressivo(BigDecimal.ONE);
//			compUtList.add(compUt);
//			datiLibretto.setUtList(compUtList);
//			
//			List<SigitVCompRcDto> compRcList = new ArrayList<SigitVCompRcDto>();
//			SigitVCompRcDto compRc = new SigitVCompRcDto();
//			compRc.setProgressivo(BigDecimal.ONE);
//			compRcList.add(compRc);
//			datiLibretto.setRcList(compRcList);
//			
//			List<SigitVCompVmDto> compVmList = new ArrayList<SigitVCompVmDto>();
//			SigitVCompVmDto compVm = new SigitVCompVmDto();
//			compVm.setProgressivo(BigDecimal.ONE);
//			compVmList.add(compVm);
//			datiLibretto.setVmList(compVmList);
//			
//			List<SigitVCompGtDettDto> compGtImpiantoDettList = new ArrayList<SigitVCompGtDettDto>();
//			SigitVCompGtDettDto compGtImpiantoDett = new SigitVCompGtDettDto();
//			compGtImpiantoDett.setProgressivo(BigDecimal.ONE);
//			compGtImpiantoDett.setDataControllo(new java.sql.Date(new java.util.Date().getTime()));
//			compGtImpiantoDett.setFkRuolo(BigDecimal.ONE);
//			compGtImpiantoDettList.add(compGtImpiantoDett);
//			datiLibretto.setCompGtImpiantoDett(compGtImpiantoDettList);
//			
//			List<SigitVCompGfDettDto> compGfImpiantoDettList = new ArrayList<SigitVCompGfDettDto>();
//			SigitVCompGfDettDto compGfImpiantoDett = new SigitVCompGfDettDto();
//			compGfImpiantoDett.setProgressivo(BigDecimal.ONE);
//			compGfImpiantoDett.setDataControllo(new java.sql.Date(new java.util.Date().getTime()));
//			compGfImpiantoDett.setFkRuolo(BigDecimal.ONE);
//			compGfImpiantoDettList.add(compGfImpiantoDett);
//			datiLibretto.setCompGfImpiantoDett(compGfImpiantoDettList);
//			
//			List<SigitVCompScDettDto> compScImpiantoDettList = new ArrayList<SigitVCompScDettDto>();
//			SigitVCompScDettDto compScImpiantoDett = new SigitVCompScDettDto();
//			compScImpiantoDett.setProgressivo(BigDecimal.ONE);
//			compScImpiantoDett.setDataControllo(new java.sql.Date(new java.util.Date().getTime()));
//			compScImpiantoDett.setFkRuolo(BigDecimal.ONE);
//			compScImpiantoDettList.add(compScImpiantoDett);
//			datiLibretto.setCompScImpiantoDett(compScImpiantoDettList);
//			
//			List<SigitVCompCgDettDto> compCgImpiantoDettList = new ArrayList<SigitVCompCgDettDto>();
//			SigitVCompCgDettDto compCgImpiantoDett = new SigitVCompCgDettDto();
//			compCgImpiantoDett.setProgressivo(BigDecimal.ONE);
//			compCgImpiantoDett.setDataControllo(new java.sql.Date(new java.util.Date().getTime()));
//			compCgImpiantoDett.setFkRuolo(BigDecimal.ONE);
//			compCgImpiantoDettList.add(compCgImpiantoDett);
//			datiLibretto.setCompCgImpiantoDett(compCgImpiantoDettList);
//			
//			List<SigitVRicercaAllegatiDto> controlli = new ArrayList<SigitVRicercaAllegatiDto>();
//			SigitVRicercaAllegatiDto controllo = new SigitVRicercaAllegatiDto();
//			controllo.setDataControllo(new java.sql.Date(new java.util.Date().getTime()));
//			controllo.setRuoloFunz("1");
//			controlli.add(controllo);
//			datiLibretto.setListControlliEfficenza(controlli);
//			
//			List<DettaglioIspezione> dettaglioIspezioneList = new ArrayList<DettaglioIspezione>();
//			DettaglioIspezione dettaglioIspezione = new DettaglioIspezione();
//			dettaglioIspezione.setElencoIdAllegati("1");
//			dettaglioIspezione.setIspezioneDb(new SigitVRicercaIspezioniConsByCodiceImpiantoDto());
//			dettaglioIspezione.setIspezIspet(new SigitVRicercaIspezioniDto());
//			dettaglioIspezioneList.add(dettaglioIspezione);
//			datiLibretto.setDettaglioIspezioneList(dettaglioIspezioneList);	
//			
//			List<SigitTConsumoDto> combustibileList = new ArrayList<SigitTConsumoDto>();
//			SigitTConsumoDto consumo = new SigitTConsumoDto();
//			consumo.setFkCombustibile(BigDecimal.ONE);
//			consumo.setFkUnitaMisura("m2");
//			combustibileList.add(consumo);
//			datiLibretto.setCombustibileList(combustibileList);
//			datiLibretto.setEnergiaElettricaList(combustibileList);
//			datiLibretto.setH2oList(combustibileList);
//			
//			List<SigitTConsumo14_4Dto> consumiList = new ArrayList<SigitTConsumo14_4Dto>();
//			consumiList.add(new SigitTConsumo14_4Dto());
//			datiLibretto.setProdottiChimiciList(consumiList);
//			
//			List<SigitVRicercaAllegatiDto> listManutenzioni = new ArrayList<SigitVRicercaAllegatiDto>();
//			listManutenzioni.add(new SigitVRicercaAllegatiDto());
//			datiLibretto.setManutenzioniList(listManutenzioni);
		}
		
		try {
			Document document = creaDocumentoLibretto(isSimul);
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			PdfWriter writer = PdfWriter.getInstance(document, outputStream);
						
			PDFEventListener event = new PDFEventListener(isBozza, true, datiLibretto.getImpianto().getCodiceImpianto());
			writer.setPageEvent(event);
			
			document.open();
			
			aggiungiScheda1IdentificativaImpianto(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda2TrattamentoAcqua(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda3NominaTerzoResponsabile(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda4Generatori(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda5SistemiRegolazioneContabilizzazione(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda6SistemiDistribuzione(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda7SistemaEmissione(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda8SistemaAccumulo(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda9AltriComponentiImpianto(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda10ImpiantoVentilazione(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda11RisultatiPrimaVerifica(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda12InterventiControllo(document, datiLibretto, isSimul); 
			
			document.newPage();
			
			aggiungiScheda13RisultatiIspezioni(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda14RegistrazioneConsumi(document, datiLibretto, isSimul);
			
			document.newPage();
			
			aggiungiScheda15InterventiManutenzione(document, datiLibretto, isSimul);
			
			outputStream.flush();
			document.close();
			outputStream.close();
			
			byte[] pdfITextLibretto = outputStream.toByteArray();
			
			libretto.setDoc(pdfITextLibretto);
			libretto.setNome("Libretto_IText.pdf");
			
		} catch(DocumentException docEx) {
			gestError(isSimul, docEx.getMessage(), docEx);
		} catch(Exception ex) {
			gestError(isSimul, ex.getMessage(), ex);
		}
	
	gestDebug(isSimul, "generaLibretto - END");
		return libretto;
	}
	
	private void aggiungiScheda1IdentificativaImpianto(Document document, DatiLibretto datiLibretto, boolean isSimul)  throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda1IdentificativaImpianto - START");
		
		List<SigitTUnitaImmobiliareDto> listaUnitaImmobiliare = datiLibretto.getUnitaImmobiliList();
		SigitTImpiantoDto impianto = datiLibretto.getImpianto();
		
		Paragraph paragraph = new Paragraph("1. SCHEDA IDENTIFICATIVA DELL' IMPIANTO", FONT_HELVETICA_9_B);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);
		
		List<SigitTUnitaImmobiliareDto> unitaImmobSecondarie = new ArrayList<SigitTUnitaImmobiliareDto>();
		SigitTUnitaImmobiliareDto unitaImmobPrincipale = new SigitTUnitaImmobiliareDto();

		for (SigitTUnitaImmobiliareDto ui : listaUnitaImmobiliare) {
			if(ConvertUtil.convertToBooleanAllways(ui.getFlgPrincipale()))
				unitaImmobPrincipale = ui;
			else
				unitaImmobSecondarie.add(ui);
		}

		// SEZIONE 1.1
		float[] columnWidths = {35,10,45,10}; 

		PdfPTable tabella = initializeTable(columnWidths);

		PdfPCell cell;

		//START ROW
		cell = new PdfPCell(new Paragraph("1.1 TIPOLOGIA INTERVENTO", FONT_HELVETICA_8_B));
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW

		//START ROW
		Phrase phrase = new Phrase();
		phrase.add(new Chunk ("in data: ", FONT_HELVETICA_8));
		phrase.add(new Chunk (ConvertUtil.convertToStringOrEmpty((impianto.getDataIntervento())), FONT_HELVETICA_8));

		cell = initializeDefaultCell(phrase);
		cell.setColspan(4);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);

		tabella.addCell(cell);
		//END ROW

		//START ROW

		boolean isNuovaInstal = false;
		boolean isRistrutturazione = false;
		boolean isSostituzione = false;
		boolean isLibrettoEsistente = false;
		
		if(impianto.getFkTipoIntervento()!=null)
		{
			if(Constants.ID_TIPO_INT_NUOVA_INSTALZ == impianto.getFkTipoIntervento().intValue())
				isNuovaInstal = true;
			if(Constants.ID_TIPO_INT_RISTRUTTURAZ == impianto.getFkTipoIntervento().intValue())
				isRistrutturazione = true;
			if(Constants.ID_TIPO_INT_SOSTITUZIONE == impianto.getFkTipoIntervento().intValue())
				isSostituzione = true;
			if(Constants.ID_TIPO_INT_COMPILAZIONE == impianto.getFkTipoIntervento().intValue())
				isLibrettoEsistente = true;
		}
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);

		aggiungiCheckPrima(paragraph, "Nuova installazione", isNuovaInstal, 40);
		aggiungiCheckPrima(paragraph, "Ristrutturazione", isRistrutturazione, 40);
		aggiungiCheckPrima(paragraph, "Sostituzione del generatore", isSostituzione, 40);
		aggiungiCheckPrima(paragraph, "Compilazione libretto impianto esistente", isLibrettoEsistente, 40); 
		
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW

		document.add(tabella);
		
		//SEZIONE 1.2
		
		tabella = initializeTable(new float[]{10,10,10,10,10,10,10,10});
		tabella.setSpacingBefore(0);
		
		//START ROW
		addEmptyCell(tabella, 8, Rectangle.LEFT | Rectangle.RIGHT);
		cell = new PdfPCell(new Paragraph("1.2  UBICAZIONE E DESTINAZIONE DELL'EDIFICIO", FONT_HELVETICA_8_B));
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(8);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		String indirizzo = GenericUtil.isNotNullOrEmpty(unitaImmobPrincipale.getIndirizzoSitad()) ? 
				unitaImmobPrincipale.getIndirizzoSitad() : unitaImmobPrincipale.getIndirizzoNonTrovato();

		cell = initializeDefaultCell(new Paragraph("Indirizzo: "+ConvertUtil.getStringValid(indirizzo), FONT_HELVETICA_8));
		cell.setColspan(2);
		cell.setBorder(Rectangle.LEFT);

		tabella.addCell(cell);		 
		
		paragraph = new Paragraph("N. "+ConvertUtil.getStringValid(unitaImmobPrincipale.getCivico()), FONT_HELVETICA_8);

		aggiungiSpazioETesto(paragraph, "Palazzo "+ConvertUtil.getStringValid(unitaImmobPrincipale.getPalazzo()), 25);
		
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		cell.setColspan(3);
		tabella.addCell(cell);

		paragraph = new Paragraph("Scala "+ConvertUtil.getStringValid(unitaImmobPrincipale.getScala()), FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		cell = initializeDefaultCell(new Paragraph("Interno: "+ConvertUtil.getStringValid(unitaImmobPrincipale.getInterno()), FONT_HELVETICA_8));
		cell.setBorder(Rectangle.RIGHT);
		cell.setColspan(2);
		tabella.addCell(cell);		 
		//END ROW
		
		//START ROW
		cell = initializeDefaultCell(new Paragraph("Comune: "+ConvertUtil.getStringValid(impianto.getDenominazioneComune()), FONT_HELVETICA_8));
		cell.setColspan(4);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
		
		cell = initializeDefaultCell(new Paragraph("Prov: "+ ConvertUtil.getStringValid(impianto.getSiglaProvincia()), FONT_HELVETICA_8));
		cell.setColspan(4);
		cell.setBorder(Rectangle.RIGHT);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		cell = initializeDefaultCell(new Paragraph("sezione: "+ConvertUtil.getStringValid(unitaImmobPrincipale.getSezione()), FONT_HELVETICA_8));
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);		 

		cell = initializeDefaultCell(new Paragraph("foglio: "+ConvertUtil.getStringValid(unitaImmobPrincipale.getFoglio()), FONT_HELVETICA_8));
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);		 

		cell = initializeDefaultCell(new Paragraph("particella: "+ConvertUtil.getStringValid(unitaImmobPrincipale.getParticella()), FONT_HELVETICA_8));
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);		 

		cell = initializeDefaultCell(new Paragraph("sub.: "+ConvertUtil.getStringValid(unitaImmobPrincipale.getSubalterno()), FONT_HELVETICA_8));
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);		 

		cell = initializeDefaultCell(new Paragraph("POD: "+ConvertUtil.getStringValid(unitaImmobPrincipale.getPodElettrico()), FONT_HELVETICA_8));
		cell.setBorder(Rectangle.NO_BORDER);
		cell.setColspan(2);
		tabella.addCell(cell);		 

		cell = initializeDefaultCell(new Paragraph("PDR: "+ConvertUtil.getStringValid(unitaImmobPrincipale.getPdrGas()), FONT_HELVETICA_8));
		cell.setBorder(Rectangle.RIGHT);
		cell.setColspan(2);
		tabella.addCell(cell);		 
		//END ROW

		for (SigitTUnitaImmobiliareDto umSec : unitaImmobSecondarie) 
		{
			//START ROW
			cell = initializeDefaultCell(new Paragraph("sezione: "+ConvertUtil.getStringValid(umSec.getSezione()), FONT_HELVETICA_8));
			cell.setBorder(Rectangle.LEFT);
			tabella.addCell(cell);		 

			cell = initializeDefaultCell(new Paragraph("foglio: "+ConvertUtil.getStringValid(umSec.getFoglio()), FONT_HELVETICA_8));
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);		 

			cell = initializeDefaultCell(new Paragraph("particella: "+ConvertUtil.getStringValid(umSec.getParticella()), FONT_HELVETICA_8));
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);		 

			cell = initializeDefaultCell(new Paragraph("sub.: "+ConvertUtil.getStringValid(umSec.getSubalterno()), FONT_HELVETICA_8));
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);		 

			cell = initializeDefaultCell(new Paragraph("POD: "+ConvertUtil.getStringValid(umSec.getPodElettrico()), FONT_HELVETICA_8));
			cell.setBorder(Rectangle.NO_BORDER);
			cell.setColspan(2);
			tabella.addCell(cell);		 

			cell = initializeDefaultCell(new Paragraph("PDR: "+ConvertUtil.getStringValid(umSec.getPdrGas()), FONT_HELVETICA_8));
			cell.setBorder(Rectangle.RIGHT);
			cell.setColspan(2);
			tabella.addCell(cell);		 
			//END ROW
		}
		
		document.add(tabella); //AGGIUNGO LA TABELLA NEL DOCUMENTO	
		
		tabella = initializeTable(new float[]{25,25,25,25});
		tabella.setSpacingBefore(0);    
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Singola unit\u00E1 immobiliare", ConvertUtil.convertToBooleanAllways(unitaImmobPrincipale.getL12FlgSingolaUnita()), 40);
		
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
		
		boolean isE1 = false;
		boolean isE2 = false;
		boolean isE3 = false;
		boolean isE4 = false;
		boolean isE5 = false;
		boolean isE6 = false;
		boolean isE7 = false;
		boolean isE8 = false;
		
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E1.equals(unitaImmobPrincipale.getL12FkCategoria()))
			isE1 = true;
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E2.equals(unitaImmobPrincipale.getL12FkCategoria()))
			isE2 = true;
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E3.equals(unitaImmobPrincipale.getL12FkCategoria()))
			isE3 = true;
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E4.equals(unitaImmobPrincipale.getL12FkCategoria()))
			isE4 = true;
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E5.equals(unitaImmobPrincipale.getL12FkCategoria()))
			isE5 = true;
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E6.equals(unitaImmobPrincipale.getL12FkCategoria()))
			isE6 = true;
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E7.equals(unitaImmobPrincipale.getL12FkCategoria()))
			isE7 = true;
		if(Constants.ID_UNITA_IMMOB_CATEGORIA_E8.equals(unitaImmobPrincipale.getL12FkCategoria()))
			isE8 = true;
		
		
		paragraph = new Paragraph("Categoria :", FONT_HELVETICA_8);
		aggiungiSpaziVuoti(paragraph, 10);
		aggiungiCheckPrima(paragraph, "E.1", isE1, 10);
		aggiungiCheckPrima(paragraph, "E.2", isE2, 10);
		aggiungiCheckPrima(paragraph, "E.3", isE3, 10);
		aggiungiCheckPrima(paragraph, "E.4", isE4, 10); 
		aggiungiCheckPrima(paragraph, "E.5", isE5, 10); 
		aggiungiCheckPrima(paragraph, "E.6", isE6, 10); 
		aggiungiCheckPrima(paragraph, "E.7", isE7, 10); 
		aggiungiCheckPrima(paragraph, "E.8", isE8, 10); 
		
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setColspan(3);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Volume lordo riscaldato :", FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiValoreUnitaMisura(paragraph, ConvertUtil.convertToStringOrEmpty(unitaImmobPrincipale.getL12VolRiscM3()), "(m\u00B3)", 0);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setColspan(3);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Volume lordo raffrescato :", FONT_HELVETICA_8);		
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiValoreUnitaMisura(paragraph, ConvertUtil.convertToStringOrEmpty(unitaImmobPrincipale.getL12VolRaffM3()), "(m\u00B3)", 0);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setColspan(3);
		tabella.addCell(cell);
		//END ROW
				
		//SEZIONE 1.3
		
		//START ROW
		addEmptyCell(tabella, 4, Rectangle.LEFT | Rectangle.RIGHT);
		cell = new PdfPCell(new Paragraph("1.3 IMPIANTO TERMICO DESTINATO A SODDISFARE I SEGUENTI SERVIZI", FONT_HELVETICA_8_B));
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Produzione di acqua calda sanitaria (acs)", GenericUtil.isNotNullOrEmpty(impianto.getL13PotH2oKw()), 40);
		cell = initializeDefaultCell(paragraph);
		cell.setColspan(2);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Potenza utile", FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiValoreUnitaMisura(paragraph, ConvertUtil.convertToStringOrEmpty(impianto.getL13PotH2oKw()), "(kW)", 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Climatizzazione invernale", (GenericUtil.isNotNullOrEmpty(impianto.getL13PotClimaInvKw())), 40);
		cell = initializeDefaultCell(paragraph);
		cell.setColspan(2);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Potenza utile", FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph( "", FONT_HELVETICA_8);
		aggiungiValoreUnitaMisura(paragraph, ConvertUtil.convertToStringOrEmpty(impianto.getL13PotClimaInvKw()), "(kW)", 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Climatizzazione estiva", GenericUtil.isNotNullOrEmpty(impianto.getL13PotClimaEstKw()), 40);
		cell = initializeDefaultCell(paragraph);
		cell.setColspan(2);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Potenza utile", FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiValoreUnitaMisura(paragraph, ConvertUtil.convertToStringOrEmpty(impianto.getL13PotClimaEstKw()), "(kW)", 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Altro", GenericUtil.isNotNullOrEmpty(impianto.getL13Altro()), 40);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(impianto.getL13Altro()), 20);
		cell = initializeDefaultCell(paragraph);
		cell.setColspan(4);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		tabella.addCell(cell);
		//END ROW
				
		//SEZIONE 1.4
		
		//START ROW
		addEmptyCell(tabella, 4, Rectangle.LEFT | Rectangle.RIGHT);
		cell = new PdfPCell(new Paragraph("1.4 TIPOLOGIA FLUIDO VETTORE", FONT_HELVETICA_8_B));
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Acqua", ConvertUtil.convertToBooleanAllways(impianto.getL14FlgH2o()), 40);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Aria", ConvertUtil.convertToBooleanAllways(impianto.getL14FlgAria()), 40);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Altro", GenericUtil.isNotNullOrEmpty(impianto.getL14Altro()), 40);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(impianto.getL14Altro()), 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
				
		//SEZIONE 1.5
		
		//START ROW
		addEmptyCell(tabella, 4, Rectangle.LEFT | Rectangle.RIGHT);
		cell = new PdfPCell(new Paragraph("1.5 INDIVIDUAZIONE DELLA TIPOLOGIA DEI GENERATORI", FONT_HELVETICA_8_B));
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Generatore a combustione", ConvertUtil.convertToBooleanAllways(impianto.getL15FlgGeneratore()), 40);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Pompa di calore", ConvertUtil.convertToBooleanAllways(impianto.getL15FlgPompa()), 40);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Macchina frigorifera", ConvertUtil.convertToBooleanAllways(impianto.getL15FlgFrigo()), 40);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Teleriscaldamento", ConvertUtil.convertToBooleanAllways(impianto.getL15FlgTelerisc()), 40);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Teleraffrescamento", ConvertUtil.convertToBooleanAllways(impianto.getL15FlgTeleraffr()), 40);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Cogenerazione / trigenerazione", ConvertUtil.convertToBooleanAllways(impianto.getL15FlgCogeneratore()), 40);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START  ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Altro", GenericUtil.isNotNullOrEmpty(impianto.getL15Altro()), 40);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(impianto.getL15Altro()), 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START  ROW
		cell = initializeDefaultCell(new Paragraph("Eventuale integrazione con: ", FONT_HELVETICA_8_B));
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START  ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Pannelli solari termici: superficie totale lorda", GenericUtil.isNotNullOrEmpty(impianto.getL15SupPannelliSolM2()), 40);
		aggiungiSpazioETesto(paragraph, ConvertUtil.convertToStringOrEmpty(impianto.getL15SupPannelliSolM2()), 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Altro", GenericUtil.isNotNullOrEmpty(impianto.getL15Altro()), 40);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(impianto.getL15AltroIntegrazione()), 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph, "Potenza utile", 20);
		aggiungiValoreUnitaMisura(paragraph, ConvertUtil.convertToStringOrEmpty(impianto.getL15AltroIntegrPotKw()), "(kW)", 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph, "Per:" , 10);
		aggiungiSpaziVuoti(paragraph, 5);
		aggiungiCheckPrima(paragraph, "Climatizzazione invernale", ConvertUtil.convertToBooleanAllways(impianto.getL15FlgAltroClimaInv()), 40);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiSpaziVuoti(paragraph, 5);
		aggiungiCheckPrima(paragraph, "Climatizzazione estiva", ConvertUtil.convertToBooleanAllways(impianto.getL15FlgAltroClimaEstate()), 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Produzione acs",  ConvertUtil.convertToBooleanAllways(impianto.getL15FlgAltroAcs()), 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Altro", GenericUtil.isNotNullOrEmpty(impianto.getL15AltroDesc()), 20);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(impianto.getL15AltroDesc()), 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		tabella.addCell(cell);
		//END ROW
				
		//SEZIONE 1.6
		
		//START ROW
		addEmptyCell(tabella, 4, Rectangle.LEFT | Rectangle.RIGHT);
		cell = new PdfPCell(new Paragraph("1.6 RESPONSABILE DELL' IMPIANTO", FONT_HELVETICA_8_B));
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		List <SigitVTotImpiantoDto> respImpiantoList = datiLibretto.getRespAttivi();
		
		SigitVTotImpiantoDto respImpianto = null;
		
		if (respImpiantoList == null || respImpiantoList.isEmpty()) {
			respImpianto = new SigitVTotImpiantoDto();
		}
		else {
			respImpianto = respImpiantoList.get(0);
		}
						
		String partitaIva = "";
		String ragioneSociale = "";
		String nome = "";
		String cognome = "";
		String codiceFiscale = "";
		
		if("PG".equals(respImpianto.getPfPg()))
		{
			partitaIva = respImpianto.getCodiceFiscale();
			ragioneSociale = respImpianto.getDenominazione();
		}
		else
		{
			nome = respImpianto.getNome();
			cognome = respImpianto.getDenominazione();
			codiceFiscale = respImpianto.getCodiceFiscale();
		}
		
		
		// START ROW
		paragraph = new Paragraph("Cognome", FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(cognome), 20, FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
	
		paragraph = new Paragraph("Nome", FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(nome), 20, FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
	
	
		paragraph = new Paragraph("Codice Fiscale", FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(codiceFiscale), 20, FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		// START ROW
		paragraph = new Paragraph("Ragione sociale", FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(ragioneSociale), 20, FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		cell.setColspan(2);
		tabella.addCell(cell);
	
		paragraph = new Paragraph("P.IVA",FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(partitaIva), 20, FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		// START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM);
		cell.setColspan(2);
		tabella.addCell(cell);
	
		paragraph = new Paragraph("Firma responsabile", FONT_HELVETICA_9_B);
		cell = initializeDefaultCell(paragraph);
		cell.setColspan(2);
		cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
		tabella.addCell(cell);
		//END ROW

		document.add(tabella); //AGGIUNGO LA TABELLA NEL DOCUMENTO	
		gestDebug(isSimul, "aggiungiScheda1IdentificativaImpianto - END");
	}

	private void aggiungiScheda2TrattamentoAcqua(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda2TrattamentoAcqua - START");
		
		SigitTTrattH2ODto trattH2O = datiLibretto.getTrattH2O();
		
		Paragraph paragraph = new Paragraph("2. TRATTAMENTO ACQUA", FONT_HELVETICA_9_B);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);
		
		// SEZIONE 2.1
		float[] columnWidths = {20,25,30,25}; 

		PdfPTable tabella = initializeTable(columnWidths);

		int border = Rectangle.NO_BORDER;
		
		PdfPCell cell;

		//START ROW
		cell = new PdfPCell(new Paragraph("2.1 CONTENUTO D'ACQUA DELL' IMPIANTO DI CLIMATIZZAZIONE", FONT_HELVETICA_8_B));
		cell.setPaddingLeft(0);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
	
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiValoreUnitaMisura(paragraph, ConvertUtil.convertToStringOrEmpty(trattH2O != null ? trattH2O.getL21H2oClimaM3() : null),  "(m\u00B3)", 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//SEZIONE 2.2
		
		//START ROW
		addEmptyCell(tabella, 4, Rectangle.NO_BORDER);
		cell = new PdfPCell(new Paragraph("2.2 DUREZZA TOTALE DELL'ACQUA", FONT_HELVETICA_8_B));
		cell.setPaddingLeft(0);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
	
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiValoreUnitaMisura(paragraph, ConvertUtil.convertToStringOrEmpty(trattH2O != null ? trattH2O.getL22DurezzaH2oFr() : null), "(\u00B0fr)", 20);
		cell = initializeDefaultCell(paragraph);
		cell.setColspan(2);
		cell.setBorder(border);

		tabella.addCell(cell);
		//END ROW
		
		//SEZIONE 2.3
		
		//START ROW
		addEmptyCell(tabella, 4, Rectangle.NO_BORDER);
		cell = new PdfPCell(new Paragraph("2.3 TRATTAMENTO DELL'ACQUA DELL'IMPIANTO DI CLIMATIZZAZIONE (Rif. UNI 8065)", FONT_HELVETICA_8_B));
		cell.setPaddingLeft(0);
		cell.setBorder(border);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Assente", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL23FlgTrattClimaAssente() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Filtrazione", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL23FlgTrattClimaFiltr() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Addolcimento:", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL23FlgTrattClimaAddolc() : null));
		aggiungiValoreUnitaMisura(paragraph, ConvertUtil.convertToStringOrEmpty(trattH2O != null ? trattH2O.getL23DurezzaTotH2oFr() : null) , "(\u00B0fr)", 20);
		paragraph.add(new Chunk ("\ndurezza totale acqua impianto", FONT_HELVETICA_6));	
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Condizionamento chimico", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL23FlgTrattClimaChimico() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Protezione del gelo:", FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Assente", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL23FlgTrattGeloAssente() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(3);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Glicole etilenico:", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL23FlgTrattGeloGliEtil() : null));
		paragraph.add(new Chunk ("\nconcentrazione glicole nel fluido termovettore", FONT_HELVETICA_6));	
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiValoreUnitaMisura(paragraph,ConvertUtil.convertToStringOrEmpty(trattH2O != null ? trattH2O.getL23PercGliEtil() : null), "(%)", 0);
		aggiungiValoreUnitaMisura(paragraph,ConvertUtil.convertToStringOrEmpty(trattH2O != null ? trattH2O.getL23PhGliEtil() : null), "(pH)", 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Glicole propilenico:", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL23FlgTrattGeloGliProp() : null));
		paragraph.add(new Chunk ("\nconcentrazione glicole nel fluido termovettore", FONT_HELVETICA_6));	
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiValoreUnitaMisura(paragraph,ConvertUtil.convertToStringOrEmpty(trattH2O != null ? trattH2O.getL23PercGliProp() : null), "(%)", 0);
		aggiungiValoreUnitaMisura(paragraph,ConvertUtil.convertToStringOrEmpty(trattH2O != null ? trattH2O.getL23PhGliProp() : null), "(pH)", 20);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		tabella.addCell(cell);
		//END ROW
		
		//SEZIONE 2.4
		
		//START ROW
		addEmptyCell(tabella, 4, Rectangle.NO_BORDER);
		cell = new PdfPCell(new Paragraph("2.4 TRATTAMENTO DELL'ACQUA CALDA SANITARIA (Rif. UNI 8065)", FONT_HELVETICA_8_B));
		cell.setPaddingLeft(0);
		cell.setBorder(border);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Assente", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL24FlgTrattAcsAssente() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Filtrazione", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL24FlgTrattAcsFiltr() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Addolcimento:", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL24FlgTrattAcsAddolc() : null));
		aggiungiValoreUnitaMisura(paragraph, ConvertUtil.convertToStringOrEmpty(trattH2O != null ? trattH2O.getL24DurezzaAddolcFr() : null), "(\u00B0fr)", 20);
		paragraph.add(new Chunk ("\ndurezza totale acqua impianto", FONT_HELVETICA_6));	
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Condizionamento chimico", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL24FlgTrattAcsChimico() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		//END ROW
		
		//SEZIONE 2.5
		
		//START ROW
		addEmptyCell(tabella, 4, Rectangle.NO_BORDER);
		cell = new PdfPCell(new Paragraph("2.5 TRATTAMENTO DELL'ACQUA DI RAFFREDDAMENTO DELL'IMPIANTO DI CLIMATIZZAZIONE ESTIVA", FONT_HELVETICA_8_B));
		cell.setPaddingLeft(0);
		cell.setBorder(border);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Assente", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattRaffAssente() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Tipologia circuito di raffreddamento:", FONT_HELVETICA_8_B);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "senza recupero termico", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattRaffNoRt() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "a recupero termico parziale", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattRaffRtp() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, " a recupero termico totale", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattRaffRtt() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Origine acqua di alimento:", FONT_HELVETICA_8_B);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "acquedotto", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattRaffAcq() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "pozzo", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattRaffPzz() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "acqua superficiale", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattRaffH2oSup() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Trattamenti acqua esistenti:", FONT_HELVETICA_8_B);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		boolean isFiltrAltro = GenericUtil.isNotNullOrEmpty(trattH2O != null ? trattH2O.getL25TrattFAltro() : null);
		boolean isFiltrMas = ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattFFiltMas() : null);
		boolean isFiltrNoTratt = ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattFNoTratt() : null);
		boolean isFiltrSic = ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattFFiltSic() : null);
		boolean isFiltr = isFiltrAltro || isFiltrMas || isFiltrNoTratt || isFiltrSic;
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Filtrazione", isFiltr);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "filtrazione di sicurezza", isFiltrSic);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "filtrazione di masse", isFiltrMas);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "altro  ", isFiltrAltro);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(trattH2O != null ? trattH2O.getL25TrattFAltro() : null), 0);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		
		//START ROW
		paragraph = new Paragraph("");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "nessun trattamento", isFiltrNoTratt);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		
		//START ROW
		boolean isTrattAltro = GenericUtil.isNotNullOrEmpty(trattH2O != null ?  trattH2O.getL25TrattTAltro() : null);
		boolean isTrattDemin = ConvertUtil.convertToBooleanAllways(trattH2O != null ?  trattH2O.getL25FlgTrattTDemin() : null);
		boolean isTrattNoTratt = ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattTNoTratt() : null);
		boolean isTrattOsm = ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattTOsmosi() : null);
		boolean isTrattAddolc = ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattTAddolc() : null);
		boolean isTratt = isTrattAltro || isTrattDemin || isTrattNoTratt || isTrattOsm || isTrattAddolc;
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Trattamento acqua", isTratt);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "addolcimento", isTrattAddolc);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "osmosi inversa", isTrattOsm);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "demineralizzazione", isTrattDemin);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "altro  ", isTrattAltro);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(trattH2O != null ? trattH2O.getL25TrattTAltro() : null), 0);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "nessun trattamento", isTrattNoTratt);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		

		//START ROW
		boolean isCondChimAltro = GenericUtil.isNotNullOrEmpty(trattH2O != null ? trattH2O.getL25TrattCAltro() : null);
		boolean isCondChimAnticorr = ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattCPaanticorr() : null);
		boolean isCondChimAnticrosta = ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattCPaantincro() : null);
		boolean isCondChimAnticrostaAnticorr = ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattCAaa() : null);
		boolean isCondChimBiocida = ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattCBiocida() : null);
		boolean isCondChimNoTratt = ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgTrattCNoTratt() : null);
		boolean isCondChim = isCondChimAltro || isCondChimAnticorr || isCondChimAnticrosta || isCondChimAnticrostaAnticorr || isCondChimBiocida || isCondChimNoTratt;
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Condizionamento chimico", isCondChim);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "a prevalente azione anticrostante", isCondChimAnticrosta);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "a prevalente azione anticorrosiva", isCondChimAnticorr);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "azione anticrostante e anticorrosiva", isCondChimAnticrostaAnticorr);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "biocida", isCondChimBiocida);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "altro  ", isCondChimAltro);
		aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(trattH2O != null ? trattH2O.getL25TrattCAltro() : null), 0);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "nessun trattamento", isCondChimNoTratt);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Gestione torre raffreddamento:", FONT_HELVETICA_8_B);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Preferenza sistema spurgo automatico (per circuiti a recupero parziale)", ConvertUtil.convertToBooleanAllways(trattH2O != null ? trattH2O.getL25FlgSpurgoAutom() : null));
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Conducibilita' acqua in ingresso", FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(trattH2O != null ? trattH2O.getL25ConducH2oIng() : null), FONT_HELVETICA_8);
		paragraph.add(" (\u00B5S/cm)");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Taratura valore conducibilita' inizio spurgo", FONT_HELVETICA_8);
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(trattH2O != null ? trattH2O.getL25Taratura() : null), FONT_HELVETICA_8);
		paragraph.add(" (\u00B5S/cm)");
		cell = initializeDefaultCell(paragraph);
		cell.setBorder(border);
		cell.setColspan(2);
		tabella.addCell(cell);
		//END ROW
	
		document.add(tabella);
		gestDebug(isSimul, "aggiungiScheda2TrattamentoAcqua - END");
		
	}
	
	private void aggiungiScheda3NominaTerzoResponsabile(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda3NominaTerzoResponsabile - START");
		
		List<SigitExtContrattoImpDto> contratti = datiLibretto.getContratti();
		
		if(contratti == null || contratti.isEmpty()) {
			contratti = new ArrayList<SigitExtContrattoImpDto>();
			contratti.add(new SigitExtContrattoImpDto());
		}
		
		Paragraph paragraph = new Paragraph("3. NOMINA DEL TERZO RESPONSABILE DELL'IMPIANTO TERMICO", FONT_HELVETICA_9_B);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);
		
		List<SigitExtContrattoImpDto> contrattiFiltrati = new ArrayList<SigitExtContrattoImpDto>();
		
		SigitExtContrattoImpDto sigitExtContrattoImpDtoOld = null;
		
		
		for (SigitExtContrattoImpDto sigitExtContrattoImpDto : contratti) 
		{
						
			if (sigitExtContrattoImpDtoOld != null)
			{	
				if (!(GenericUtil.checkDateEqual(sigitExtContrattoImpDtoOld.getDataInizioContratto(), sigitExtContrattoImpDto.getDataInizioContratto()) &&
						GenericUtil.checkDateEqual(sigitExtContrattoImpDtoOld.getDataCessazione(), sigitExtContrattoImpDto.getDataCessazione()) &&
						GenericUtil.checkDateEqual(sigitExtContrattoImpDtoOld.getDataFineContratto(), sigitExtContrattoImpDto.getDataFineContratto()) &&
						sigitExtContrattoImpDtoOld.getIdContratto().intValue() == sigitExtContrattoImpDto.getIdContratto().intValue()))
				{
					
					contrattiFiltrati.add(sigitExtContrattoImpDtoOld);
				}
			}
			
			sigitExtContrattoImpDtoOld = sigitExtContrattoImpDto;

		}
				
		contrattiFiltrati.add(sigitExtContrattoImpDtoOld);
		
		
		for (SigitExtContrattoImpDto contratto : contrattiFiltrati) {
			float[] columnWidths = {33,33,33}; 

			PdfPTable tabella = initializeTable(columnWidths);

			PdfPCell cell;
			
			String dataFineContratto = "";
			String partitaIva = "";
			String ragioneSociale = "";
			String nome = "";
			String cognome = "";
			String codiceFiscale = "";
			
			if(contratto.getDataCessazione() != null)
			{
				if(contratto.getDataCessazione().before(contratto.getDataFineContratto()))
				{
					dataFineContratto = ConvertUtil.convertToStringOrEmpty(contratto.getDataCessazione());
				}
				else
				{
					if(!ConvertUtil.convertToBooleanAllways(contratto.getFlagTacitoRinnovo()))
					{
						dataFineContratto = ConvertUtil.convertToStringOrEmpty(contratto.getDataFineContratto());

					}
					else
					{
						dataFineContratto = ConvertUtil.convertToStringOrEmpty(contratto.getDataCessazione());
					}
				}
			}
			else
			{
				if(!ConvertUtil.convertToBooleanAllways(contratto.getFlagTacitoRinnovo()))
				{
					dataFineContratto = ConvertUtil.convertToStringOrEmpty(contratto.getDataFineContratto());
				}
				else
				{
					if(contratto.getDataFineContratto().after(new Date()))
					{
						dataFineContratto = ConvertUtil.convertToStringOrEmpty(contratto.getDataFineContratto());
					}
				}
			}
			if(contratto.getFkPgResponsabile()!=null)
			{
				partitaIva = contratto.getRespCodiceFiscale();
				ragioneSociale = contratto.getRespDenominazione();
			}
			else
			{
				nome = contratto.getRespNome();
				cognome = contratto.getRespDenominazione();
				codiceFiscale = contratto.getRespCodiceFiscale();
			}
			
			Boolean isPropietario = null;
			
			if (contratto.getFkRuolo() != null) {
				isPropietario = contratto.getFkRuolo().toString().equals(Constants.ID_RUOLO_PROPRIETARIO+"") || contratto.getFkRuolo().toString().equals(Constants.ID_RUOLO_RESPONSABILE_IMPRESA_PROPRIETARIO+"") || 
						contratto.getFkRuolo().toString().equals(Constants.ID_RUOLO_OCCUPANTE+"") || contratto.getFkRuolo().toString().equals(Constants.ID_RUOLO_RESPONSABILE_IMPRESA_OCCUPANTE+"");	
			}
			
			//START ROW
			paragraph = new Paragraph("il sottoscritto", FONT_HELVETICA_8_B);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.RIGHT | Rectangle.TOP | Rectangle.LEFT);
			cell.setColspan(3);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Cognome", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(cognome) , 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("Nome", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(nome) , 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("CF", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(codiceFiscale) , 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.RIGHT);
			tabella.addCell(cell);
			//END ROW
			

			//START ROW
			paragraph = new Paragraph("Ragione Sociale", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(ragioneSociale) , 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT);
			cell.setColspan(2);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("P.IVA", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(partitaIva) , 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.RIGHT);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("responsabile dell'impianto in qualita' di", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "propietario/occupante", isPropietario != null ? isPropietario : false , 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "amministratore", isPropietario != null ? !isPropietario : false , 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.RIGHT);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("affida la responsabilita' dell'impianto alla ditta", FONT_HELVETICA_8_B);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
			cell.setColspan(3);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Ragione sociale", FONT_HELVETICA_8);
			aggiungiSpaziVuoti(paragraph, 5);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(contratto.getTerzoRespDenominazione()), 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT);
			cell.setColspan(2);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("CCIAA", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid( MapDto.getCodiceRea(contratto.getTerzoRespSiglaRea(), ConvertUtil.convertToInteger(contratto.getTerzoRespNumeroRea()))) , 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.RIGHT);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Riferimento: contratto allegato, valido dal ", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.convertToStringOrEmpty(contratto.getDataInizioContratto()), 20);
			aggiungiSpazioETesto(paragraph, "al", 20);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(dataFineContratto), 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			cell.setColspan(3);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			tabella = addEmptyCell(tabella, 3, Rectangle.LEFT | Rectangle.RIGHT);
			//END ROW

			//START ROW
			tabella = addEmptyCell(tabella, 3, Rectangle.LEFT | Rectangle.RIGHT);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Firma del proprietario / amministratore", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			cell.setColspan(3);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Firma del terzo responsabile", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(3);
			tabella.addCell(cell);
			//END ROW
			
			document.add(tabella);
		}		
		gestDebug(isSimul, "aggiungiScheda3NominaTerzoResponsabile - END");
	}

	private void aggiungiScheda4Generatori(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda4Generatori - START");
		Paragraph paragraph = new Paragraph("4. GENERATORI", FONT_HELVETICA_9_B);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);
		
		//SEZIONE 4.1
		aggiungiSezione4_1GruppiTermici(document, datiLibretto, isSimul); 
		
		document.newPage();
		
		//SEZIONE 4.2
		aggiungiSezione4_2Bruciatori(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 4.3
		aggiungiSezione4_3RecuperatoriCondensatori(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 4.4
		aggiungiSezione4_4GruppiFrigoriferi(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 4.5
		aggiungiSezione4_5Scambiatori(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 4.6
		aggiungiSezione4_6Cogeneratori(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 4.7
		aggiungiSezione4_7CampiSolari(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 4.8
		aggiungiSezione4_8AltriGeneratori(document, datiLibretto, isSimul);
		
		gestDebug(isSimul, "aggiungiScheda4Generatori - END");
	}

	private void aggiungiSezione4_1GruppiTermici(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiSezione4_1GruppiTermici - START");

		List<SigitVSk4GtDto> compGtImpiantoList = datiLibretto.getComSk4GtImpianto();
		
		Map<String, PdfPTable> tabellaGtList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleGTSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25, 25, 25, 25};
		
		PdfPTable tabellaGt = initializeTable(columnWidth);
		tabellaGt.setSpacingBefore(0);
		PdfPTable tabellaSostGt = initializeTable(columnWidth);
		tabellaSostGt.setSpacingBefore(0);
		
		if(compGtImpiantoList == null || compGtImpiantoList.isEmpty()) {
			compGtImpiantoList = new ArrayList<SigitVSk4GtDto>();
			tabellaGtList.put("", aggiungiGt(tabellaGt, new SigitVSk4GtDto()));
		}
		BigDecimal progressivo = null;
		Date lastDataInstall = null;
		
		if (compGtImpiantoList.size()>0) {
			progressivo = compGtImpiantoList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
				
		
		Paragraph title = new Paragraph("4.1 GRUPPI TERMICI O CALDAIE", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i < compGtImpiantoList.size(); i++) {
						
			SigitVSk4GtDto compGtImpianto = compGtImpiantoList.get(i);
			
			Paragraph paragraph = null;
			PdfPCell cell = null;
			
			if (progressivo.equals(compGtImpianto.getProgressivo()) && lastDataInstall!=null && lastDataInstall.compareTo(compGtImpianto.getDataInstall())==0) {
				continue;
			}
			
			if(!progressivo.equals(compGtImpianto.getProgressivo()))
			{	
				progressivo = compGtImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaGt = initializeTable(columnWidth);
				tabellaGt.setSpacingBefore(0);
				tabellaSostGt = initializeTable(columnWidth);
				tabellaSostGt.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaGt = aggiungiGt(tabellaGt, compGtImpianto);
				tabellaGtList.put(progressivo.toString(), tabellaGt);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setBackgroundColor(LIGHT_GRAY);
				cell.setColspan(4);
				tabellaSostGt.addCell(cell);
				tabellaSostGt = aggiungiGt(tabellaSostGt, compGtImpianto);
				tabelleGTSostList.put(progressivo.toString(), tabellaSostGt);
			}
			lastDataInstall = compGtImpianto.getDataInstall();
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaGtList.entrySet()) {
			String progessivo = entry.getKey();

			tabellaGt = entry.getValue();
			tabellaSostGt = tabelleGTSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Gruppo Termico", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("GT", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo), 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostGt != null) {
				tabellaSostGt.addCell(cell);	
				document.add(tabellaGt);
				document.add(tabellaSostGt);
			}
			else {
				tabellaGt.addCell(cell);
				document.add(tabellaGt);
			}		
			
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiSezione4_1GruppiTermici - END");
	}
	
	private PdfPTable aggiungiGt(PdfPTable tabella, SigitVSk4GtDto compGtImpianto) {
		
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compGtImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compGtImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compGtImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compGtImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Matricola");
		datoTabella.setValore(ConvertUtil.getStringValid(compGtImpianto.getMatricola()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Combustibile");
		datoTabella.setValore(ConvertUtil.getStringValid(compGtImpianto.getDesCombustibile()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fluido Termovettore");
		datoTabella.setValore(ConvertUtil.getStringValid(compGtImpianto.getDesFluido()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Potenza termica utile nominale Pn max");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compGtImpianto.getPotenzaTermicaKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Rendimento termico utile a Pn max");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compGtImpianto.getRendimentoPerc()) + " %");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		boolean isSingolo = false;
		boolean isModulare = false;
		boolean isTupoRadiante = false;
		boolean isGenAriaCalda = false;
		String numAnalisiFumi = "";
		
		if(Constants.ID_DETT_GT_GRUPPO_TERM_SING.equals(ConvertUtil.convertToStringOrEmpty(compGtImpianto.getFkDettaglioGt()))) {			
			isSingolo = true;
		}
		if(Constants.ID_DETT_GT_GRUPPO_TERM_MOD.equals(ConvertUtil.convertToStringOrEmpty(compGtImpianto.getFkDettaglioGt())) ) {
			isModulare = true;
			numAnalisiFumi = ConvertUtil.convertToStringOrEmpty(compGtImpianto.getNModuli());			
		}
		if(Constants.ID_DETT_GT_TUBO_RADIANTE.equals(ConvertUtil.convertToStringOrEmpty(compGtImpianto.getFkDettaglioGt()))) {			
			isTupoRadiante = true;
		}
		if(Constants.ID_DETT_GT_GEN_ARIA_CALDA.equals(ConvertUtil.convertToStringOrEmpty(compGtImpianto.getFkDettaglioGt()))) {			
			isGenAriaCalda = true;
		}
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		DatoCheckbox checkbox = new DatoCheckbox();
		ArrayList<DatoCheckbox> datiCheckbox = new ArrayList<DatoCheckbox>();
		checkbox.setLabel("Gruppo termico singolo");
		checkbox.setValore(isSingolo);
		datiCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(datiCheckbox);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		checkbox = new DatoCheckbox();
		datiCheckbox = new ArrayList<DatoCheckbox>();
		checkbox.setLabel("Gruppo termico modulare con n\u00B0 " + numAnalisiFumi + " analisi fumi previste");
		checkbox.setValore(isModulare);
		datiCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(datiCheckbox);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		checkbox = new DatoCheckbox();
		datiCheckbox = new ArrayList<DatoCheckbox>();
		checkbox.setLabel("Tubo / nastro radiante");
		checkbox.setValore(isTupoRadiante);
		datiCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(datiCheckbox);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		checkbox = new DatoCheckbox();
		datiCheckbox = new ArrayList<DatoCheckbox>();
		checkbox.setLabel("Generatore d'aria calda");
		checkbox.setValore(isGenAriaCalda);
		datiCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(datiCheckbox);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Da manutenere ogni (anni)");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compGtImpianto.getTempoManutAnni()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
	
		return aggiungiSezioneTabella(tabella, datiTabella);
	}

	private void aggiungiSezione4_2Bruciatori(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiSezione4_2Bruciatori - START");

		List<SigitTCompBrRcDto> compBrImpiantoList = datiLibretto.getCompBrImpianto();

		Map<String, SezioneBrRc> sezioneBrList = new LinkedHashMap<String, SezioneBrRc>();
		Map<String, PdfPTable> tabellaBrSostList = new LinkedHashMap<String, PdfPTable>();

		float[] columnWidth = {25, 25, 25, 25};
		
		PdfPTable tabellaBr = initializeTable(columnWidth);
		tabellaBr.setSpacingBefore(0);
		PdfPTable tabellaSostBr = initializeTable(columnWidth);
		tabellaSostBr.setSpacingBefore(0);
		
		if (compBrImpiantoList == null || compBrImpiantoList.isEmpty()) {
			compBrImpiantoList = new ArrayList<SigitTCompBrRcDto>();
			tabellaBr = aggiungiBr(tabellaBr, new SigitTCompBrRcDto());
			SezioneBrRc sezioneBr = new SezioneBrRc();
			sezioneBr.setTabellaBrRc(tabellaBr);
			sezioneBr.setProgessivoGt(null);
			sezioneBrList.put("", sezioneBr);
		}
		
		BigDecimal progressivo = null;
		
		if(compBrImpiantoList!=null && compBrImpiantoList.size()>0)
			progressivo = compBrImpiantoList.get(0).getProgressivoBrRc();
		
		int numInProgr = 1;
		
		
		Paragraph titolo = new Paragraph();
		Phrase titoloGrassetto = new Phrase("4.2 BRUCIATORI", FONT_HELVETICA_8_B);
		Phrase titoloSecondario = new Phrase(" (se non incorporati nel gruppo termico)", FONT_HELVETICA_6);
		titolo.add(titoloGrassetto);
		titolo.add(titoloSecondario);
		document.add(titolo);
		
		for (int i=0; i<compBrImpiantoList.size();i++) {
			
			SigitTCompBrRcDto compBrImpianto = compBrImpiantoList.get(i);

			SezioneBrRc sezioneBr = new SezioneBrRc();
			
			Paragraph paragraph = null;
			PdfPCell cell = null;
			
			if(!progressivo.equals(compBrImpianto.getProgressivoBrRc()))
			{
				progressivo = compBrImpianto.getProgressivoBrRc();
				numInProgr = 1;
				
				tabellaBr = initializeTable(columnWidth);
				tabellaBr.setSpacingBefore(0);
				tabellaSostBr = initializeTable(columnWidth);
				tabellaSostBr.setSpacingBefore(0);
			}

//			boolean isGtControllato = false;
			if(numInProgr++ == 1)
			{
//				for (SigitVSk4GtDto gt : compGtImpiantoList) {
//					if(gt.getProgressivo().equals(compBrImpianto.getFkProgressivo()))
//						isGtControllato = GenericUtil.isNotNullOrEmpty(gt.getDataControllo());
//				}
								
				tabellaBr = aggiungiBr(tabellaBr, compBrImpianto);
				sezioneBr.setTabellaBrRc(tabellaBr);
				sezioneBr.setProgessivoGt(compBrImpianto.getFkProgressivo());
				sezioneBrList.put(progressivo.toString(), sezioneBr);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);		
				cell.setBackgroundColor(LIGHT_GRAY);
				cell.setColspan(4);
				tabellaSostBr.addCell(cell);
				tabellaSostBr = aggiungiBr(tabellaSostBr, compBrImpianto);
				tabellaBrSostList.put(progressivo.toString(), tabellaSostBr);
			}
		}
		
		for (Map.Entry<String, SezioneBrRc> entry : sezioneBrList.entrySet()) {
			String progessivo = entry.getKey();
			SezioneBrRc sezioneBr = entry.getValue();
			tabellaBr = sezioneBr.getTabellaBrRc();
			tabellaSostBr = tabellaBrSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 20, 60});
			Paragraph paragraph = new Paragraph("Bruciatore", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Collegato al Gruppo Termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Br", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo), 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("GT", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.convertToStringOrEmpty(sezioneBr.getProgessivoGt()), 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostBr != null) {
				tabellaSostBr.addCell(cell);	
				document.add(tabellaBr);
				document.add(tabellaSostBr);
			}
			else {
				tabellaBr.addCell(cell);
				document.add(tabellaBr);
			}				
			
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiSezione4_2Bruciatori - END");
	}
	
	private PdfPTable aggiungiBr(PdfPTable tabella, SigitTCompBrRcDto compBrImpianto) {
		
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compBrImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compBrImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(getDesFabbricante(compBrImpianto.getFkMarca())));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compBrImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Matricola");
		datoTabella.setValore(ConvertUtil.getStringValid(compBrImpianto.getMatricola()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Tipologia");
		datoTabella.setValore(ConvertUtil.getStringValid(compBrImpianto.getTipologia()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Combustibile");
		datoTabella.setValore(ConvertUtil.getStringValid(getDesCombustibile(compBrImpianto.getFkCombustibile())));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Portata termica max nominale");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compBrImpianto.getPotTermMaxKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Portata termica min nominale");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compBrImpianto.getPotTermMinKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
	
		return aggiungiSezioneTabella(tabella, datiTabella);	
	}
	
	private void aggiungiSezione4_3RecuperatoriCondensatori(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiSezione4_3RecuperatoriCondensatori - START");

		List<SigitTCompBrRcDto> compRcImpiantoList = datiLibretto.getCompRcImpianto();
		
		Map<String, SezioneBrRc> sezioneRcList = new LinkedHashMap<String, SezioneBrRc>();
		Map<String, PdfPTable> tabellaRcSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25, 25, 25, 25};
		
		PdfPTable tabellaRc = initializeTable(columnWidth);
		tabellaRc.setSpacingBefore(0);
		PdfPTable tabellaSostRc = initializeTable(columnWidth);
		tabellaSostRc.setSpacingBefore(0);
		
		if(compRcImpiantoList == null || compRcImpiantoList.isEmpty()) {
			compRcImpiantoList = new ArrayList<SigitTCompBrRcDto>();
			tabellaRc = aggiungiRc(tabellaRc, new SigitTCompBrRcDto());
			SezioneBrRc sezioneRc = new SezioneBrRc();
			sezioneRc.setTabellaBrRc(tabellaRc);
			sezioneRc.setProgessivoGt(null);
			sezioneRcList.put("", sezioneRc);
		}
		
		BigDecimal progressivo = null;
		
		if(compRcImpiantoList!=null && compRcImpiantoList.size()>0)
			progressivo = compRcImpiantoList.get(0).getProgressivoBrRc();
		
		int numInProgr = 1;
		
	
		
		Paragraph titolo = new Paragraph();
		Phrase titoloGrassetto = new Phrase("4.3 RECUPERATORI / CONDENSATORI LATO FUMI", FONT_HELVETICA_8_B);
		Phrase titoloSecondario = new Phrase(" (se non incorporati nel gruppo termico)", FONT_HELVETICA_6);
		titolo.add(titoloGrassetto);
		titolo.add(titoloSecondario);
		document.add(titolo);
		
		for (int i=0; i<compRcImpiantoList.size();i++) {
			
			SigitTCompBrRcDto compRcImpianto = compRcImpiantoList.get(i);

			SezioneBrRc sezioneRc = new SezioneBrRc();
			
			Paragraph paragraph = null;
			PdfPCell cell = null;
			
			if(!progressivo.equals(compRcImpianto.getProgressivoBrRc()))
			{
				progressivo = compRcImpianto.getProgressivoBrRc();
				numInProgr = 1;
				
				tabellaRc = initializeTable(columnWidth);
				tabellaRc.setSpacingBefore(0);
				tabellaSostRc = initializeTable(columnWidth);
				tabellaSostRc.setSpacingBefore(0);
			}

//			boolean isGtControllato = false;
			if(numInProgr++ == 1)
			{
//				for (SigitVSk4GtDto gt : compGtImpiantoList) {
//					if(gt.getProgressivo().equals(compRcImpianto.getFkProgressivo()))
//						isGtControllato = GenericUtil.isNotNullOrEmpty(gt.getDataControllo());
//				}
								
				tabellaRc = aggiungiRc(tabellaRc, compRcImpianto);
				sezioneRc.setTabellaBrRc(tabellaRc);
				sezioneRc.setProgessivoGt(compRcImpianto.getFkProgressivo());
				sezioneRcList.put(progressivo.toString(), sezioneRc);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setColspan(4);
				cell.setBackgroundColor(LIGHT_GRAY);
				tabellaSostRc.addCell(cell);
				tabellaSostRc = aggiungiRc(tabellaSostRc, compRcImpianto);
				tabellaRcSostList.put(progressivo.toString(), tabellaSostRc);
			}
		}
		
		for (Map.Entry<String, SezioneBrRc> entry : sezioneRcList.entrySet()) {
			String progessivo = entry.getKey();
			SezioneBrRc sezioneRc = entry.getValue();
			tabellaRc = sezioneRc.getTabellaBrRc();
			tabellaSostRc = tabellaRcSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 20, 60});
			Paragraph paragraph = new Paragraph("Recuperatore / Condensatore", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Collegato al Gruppo Termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Rc", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("GT", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.convertToStringOrEmpty(sezioneRc.getProgessivoGt()),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostRc != null) {
				tabellaSostRc.addCell(cell);	
				document.add(tabellaRc);
				document.add(tabellaSostRc);
			}
			else {
				tabellaRc.addCell(cell);
				document.add(tabellaRc);
			}	
			
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiSezione4_3RecuperatoriCondensatori - END");
	}
	
	private PdfPTable aggiungiRc(PdfPTable tabella, SigitTCompBrRcDto compRcImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compRcImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compRcImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(getDesFabbricante(compRcImpianto.getFkMarca())));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compRcImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Matricola");
		datoTabella.setValore(ConvertUtil.getStringValid(compRcImpianto.getMatricola()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Portata termica nominale totale");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compRcImpianto.getPotTermMaxKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
	
		return aggiungiSezioneTabella(tabella, datiTabella);	
	}

	private void aggiungiSezione4_4GruppiFrigoriferi(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiSezione4_4GruppiFrigoriferi - START");

		List<SigitVSk4GfDto> compGfImpiantoList = datiLibretto.getComSk4GfImpianto();
		
		Map<String, PdfPTable> tabellaGfList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleGfSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};

		PdfPTable tabellaGf = initializeTable(columnWidth);
		tabellaGf.setSpacingBefore(0);
		PdfPTable tabellaSostGf = initializeTable(columnWidth);
		tabellaSostGf.setSpacingBefore(0);
		
		if(compGfImpiantoList == null || compGfImpiantoList.isEmpty()) {
			compGfImpiantoList = new ArrayList<SigitVSk4GfDto>();
			tabellaGfList.put("", aggiungiGf(tabellaGf, new SigitVSk4GfDto()));
		}
		BigDecimal progressivo = null;
		Date lastDataInstall = null;
		
		if (compGfImpiantoList.size()>0) {
			progressivo = compGfImpiantoList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
		
		Paragraph title = new Paragraph("4.4 MACCHINE FRIGORIFERE / POMPE DI CALORE", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i < compGfImpiantoList.size(); i++) {
						
			SigitVSk4GfDto compGfImpianto = compGfImpiantoList.get(i);
									
			Paragraph paragraph = null;
			PdfPCell cell = null;
			
			if (progressivo.equals(compGfImpianto.getProgressivo()) && lastDataInstall!=null && lastDataInstall.compareTo(compGfImpianto.getDataInstall())==0) {
				continue;
			}
			
			if(!progressivo.equals(compGfImpianto.getProgressivo()))
			{	
				progressivo = compGfImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaGf = initializeTable(columnWidth);
				tabellaGf.setSpacingBefore(0);
				tabellaSostGf = initializeTable(columnWidth);
				tabellaSostGf.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaGf = aggiungiGf(tabellaGf, compGfImpianto);
				tabellaGfList.put(progressivo.toString(), tabellaGf);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setColspan(4);
				cell.setBackgroundColor(LIGHT_GRAY);
				tabellaSostGf.addCell(cell);
				tabellaSostGf = aggiungiGf(tabellaSostGf, compGfImpianto);
				tabelleGfSostList.put(progressivo.toString(), tabellaSostGf);
			}
			lastDataInstall = compGfImpianto.getDataInstall();
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaGfList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaGf = entry.getValue();
			tabellaSostGf = tabelleGfSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Gruppo Frigo / Pompa di calore", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("GF", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostGf != null) {
				tabellaSostGf.addCell(cell);	
				document.add(tabellaGf);
				document.add(tabellaSostGf);
			}
			else {
				tabellaGf.addCell(cell);
				document.add(tabellaGf);
			}		
			
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiSezione4_4GruppiFrigoriferi - END");
	}
	
	private PdfPTable aggiungiGf(PdfPTable tabella, SigitVSk4GfDto compGfImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compGfImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compGfImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compGfImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compGfImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Matricola");
		datoTabella.setValore(ConvertUtil.getStringValid(compGfImpianto.getMatricola()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Sorgente lato esterno");
		datoTabella.setTipoDato(TipoDato.DOPPIACHECKBOX);
		ArrayList<DatoCheckbox> valoriCheckbox = new ArrayList<DatoCheckbox>();
		DatoCheckbox checkbox = new DatoCheckbox();
		checkbox.setLabel("Aria");
		checkbox.setValore(Constants.FLG_ARIA.equals(compGfImpianto.getFlgSorgenteExt()));
		valoriCheckbox.add(checkbox);
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Acqua");
		checkbox.setValore(Constants.FLG_ACQUA.equals(compGfImpianto.getFlgSorgenteExt()));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fluido Frigorifero");
		datoTabella.setValore(ConvertUtil.getStringValid(compGfImpianto.getFluidoFrigorigeno()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fluido lato utenze");
		datoTabella.setTipoDato(TipoDato.DOPPIACHECKBOX);
		valoriCheckbox = new ArrayList<DatoCheckbox>();
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Aria");
		checkbox.setValore(Constants.FLG_ARIA.equals(compGfImpianto.getFlgFluidoUtenze()));
		valoriCheckbox.add(checkbox);
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Acqua");
		checkbox.setValore(Constants.FLG_ACQUA.equals(compGfImpianto.getFlgFluidoUtenze()));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		valoriCheckbox = new ArrayList<DatoCheckbox>();
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Ad assorbimento per recupero calore");
		checkbox.setValore(Constants.ID_DETT_GF_ASS_REC_CALORE.equals(ConvertUtil.convertToStringOrEmpty(compGfImpianto.getFkDettaglioGf())));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		valoriCheckbox = new ArrayList<DatoCheckbox>();
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Ad assorbimento a fiamma diretta con combustibile");
		checkbox.setValore(Constants.ID_DETT_GF_ASS_FIAMM_COMB.equals(ConvertUtil.convertToStringOrEmpty(compGfImpianto.getFkDettaglioGf())));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		valoriCheckbox = new ArrayList<DatoCheckbox>();
		checkbox = new DatoCheckbox();
		checkbox.setLabel("A ciclo di compressione con motore elettrico o endotermico");
		checkbox.setValore(Constants.ID_DETT_GF_CICLO_COMPRESS.equals(ConvertUtil.convertToStringOrEmpty(compGfImpianto.getFkDettaglioGf())));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW

		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Circuiti n\u00B0");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compGfImpianto.getNCircuiti()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		PdfPTable tabellaRiga = new PdfPTable(new float[] {16,12,8,21,11,21,11});
		tabellaRiga.getDefaultCell().setBorder(Rectangle.NO_BORDER);
		Paragraph paragraph = new Paragraph("Raffrescamento" ,FONT_HELVETICA_8);
		tabellaRiga.addCell(paragraph);
		
		paragraph = new Paragraph("EER(o GUE)" ,FONT_HELVETICA_8);
		tabellaRiga.addCell(paragraph);
		
		paragraph = new Paragraph(ConvertUtil.getStringValid(compGfImpianto.getRaffrescamentoEer()) ,FONT_HELVETICA_8);
		tabellaRiga.addCell(paragraph);
		
		paragraph = new Paragraph("Potenza frigorifera nominale" ,FONT_HELVETICA_8);
		tabellaRiga.addCell(paragraph);
		
		tabellaRiga.addCell(getCellaValoreUnitaMisura(ConvertUtil.convertToStringOrEmpty(compGfImpianto.getRaffPotenzaKw()),"(kW)", Rectangle.NO_BORDER));
		
		paragraph = new Paragraph("Potenza assorbita nominale" ,FONT_HELVETICA_8);
		tabellaRiga.addCell(paragraph);
		
		tabellaRiga.addCell(getCellaValoreUnitaMisura(ConvertUtil.convertToStringOrEmpty(compGfImpianto.getRaffPotenzaAss()),"(kW)", Rectangle.NO_BORDER));
		
		datoTabella = new DatoTabella();
		datoTabella.setTabellaRiga(tabellaRiga);
		datoTabella.setTipoDato(TipoDato.TABELLA);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		tabellaRiga = new PdfPTable(new float[] {16,12,8,21,11,21,11});
		tabellaRiga.getDefaultCell().setBorder(Rectangle.NO_BORDER);
		paragraph = new Paragraph("Riscaldamento",FONT_HELVETICA_8);
		tabellaRiga.addCell(paragraph);
		
		paragraph = new Paragraph("COP (o ",FONT_HELVETICA_8);
		paragraph.add(SYMBOL_ETA);
		paragraph.add(")");
		tabellaRiga.addCell(paragraph);
		
		paragraph = new Paragraph(ConvertUtil.getStringValid(compGfImpianto.getRiscaldamentoCop()) ,FONT_HELVETICA_8);
		tabellaRiga.addCell(paragraph);
		
		paragraph = new Paragraph("Potenza termica nominale",FONT_HELVETICA_8);
		tabellaRiga.addCell(paragraph);
		
		tabellaRiga.addCell(getCellaValoreUnitaMisura(ConvertUtil.convertToStringOrEmpty(compGfImpianto.getRiscPotenzaKw()),"(kW)", Rectangle.NO_BORDER));
		
		paragraph = new Paragraph("Potenza assorbita nominale",FONT_HELVETICA_8);
		tabellaRiga.addCell(paragraph);
		
		tabellaRiga.addCell(getCellaValoreUnitaMisura(ConvertUtil.convertToStringOrEmpty(compGfImpianto.getRiscPotenzaAssKw()),"(kW)", Rectangle.NO_BORDER));
		
		datoTabella = new DatoTabella();
		datoTabella.setTabellaRiga(tabellaRiga);
		datoTabella.setTipoDato(TipoDato.TABELLA);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Da manutenere ogni (anni)");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compGfImpianto.getTempoManutAnni()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
	
		return aggiungiSezioneTabella(tabella, datiTabella);	
	}

	private void aggiungiSezione4_5Scambiatori(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiSezione4_5Scambiatori - START");

		List<SigitVSk4ScDto> compScImpiantoList = datiLibretto.getComSk4ScImpianto();
		
		Map<String, PdfPTable> tabellaScList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleScSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};
		
		PdfPTable tabellaSc = initializeTable(columnWidth);
		tabellaSc.setSpacingBefore(0);
		PdfPTable tabellaSostSc = initializeTable(columnWidth);
		tabellaSostSc.setSpacingBefore(0);
		
		if(compScImpiantoList == null || compScImpiantoList.isEmpty()) {
			compScImpiantoList = new ArrayList<SigitVSk4ScDto>();
			tabellaScList.put("", aggiungiSc(tabellaSc, new SigitVSk4ScDto()));
		}
		
		BigDecimal progressivo = null;
		Date lastDataInstall = null;
		
		if (compScImpiantoList.size()>0) {
			progressivo = compScImpiantoList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
				
	
		
		Paragraph title = new Paragraph("4.5 SCAMBIATORI DI CALORE DELLA SOTTOSTAZIONE DI TELERISCALDAMENTO / TELERAFFRESCAMENTO", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i < compScImpiantoList.size(); i++) {
						
			SigitVSk4ScDto compScImpianto = compScImpiantoList.get(i);
						
			Paragraph paragraph = null;
			PdfPCell cell = null;
			
			if (progressivo.equals(compScImpianto.getProgressivo()) && lastDataInstall!=null && lastDataInstall.compareTo(compScImpianto.getDataInstall())==0) {
				continue;
			}
			
			if(!progressivo.equals(compScImpianto.getProgressivo()))
			{	
				progressivo = compScImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaSc = initializeTable(columnWidth);
				tabellaSc.setSpacingBefore(0);
				tabellaSostSc = initializeTable(columnWidth);
				tabellaSostSc.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaSc = aggiungiSc(tabellaSc, compScImpianto);
				tabellaScList.put(progressivo.toString(), tabellaSc);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setColspan(4);
				cell.setBackgroundColor(LIGHT_GRAY);
				tabellaSostSc.addCell(cell);
				tabellaSostSc = aggiungiSc(tabellaSostSc, compScImpianto);
				tabelleScSostList.put(progressivo.toString(), tabellaSostSc);
			}
			lastDataInstall = compScImpianto.getDataInstall();
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaScList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaSc = entry.getValue();
			tabellaSostSc = tabelleScSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Scambiatore", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("SC", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostSc != null) {
				tabellaSostSc.addCell(cell);	
				document.add(tabellaSc);
				document.add(tabellaSostSc);
			}
			else {
				tabellaSc.addCell(cell);
				document.add(tabellaSc);
			}		
			
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiSezione4_5Scambiatori - END");
	}
	
	private PdfPTable aggiungiSc(PdfPTable tabella, SigitVSk4ScDto compScImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compScImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compScImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compScImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compScImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Matricola");
		datoTabella.setValore(ConvertUtil.getStringValid(compScImpianto.getMatricola()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Potenza termica nominale totale");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compScImpianto.getPotenzaTermicaKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Da manutenere ogni (anni)");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compScImpianto.getTempoManutAnni()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
	
		return aggiungiSezioneTabella(tabella, datiTabella);	
	}

	private void aggiungiSezione4_6Cogeneratori(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiSezione4_6Cogeneratori - START");

		List<SigitVSk4CgDto> compCgImpiantoList = datiLibretto.getComSk4CgImpianto();
		
		Map<String, PdfPTable> tabellaCgList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleCgSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};
		
		PdfPTable tabellaCg = initializeTable(columnWidth);
		tabellaCg.setSpacingBefore(0);
		PdfPTable tabellaSostCg = initializeTable(columnWidth);
		tabellaSostCg.setSpacingBefore(0);
		
		if(compCgImpiantoList == null || compCgImpiantoList.isEmpty()) {
			compCgImpiantoList = new ArrayList<SigitVSk4CgDto>();
			tabellaCgList.put("", aggiungiCg(tabellaCg, new SigitVSk4CgDto()));
		}
		
		BigDecimal progressivo = null;
		Date lastDataInstall = null;
		
		if (compCgImpiantoList.size()>0) {
			progressivo = compCgImpiantoList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
		
		Paragraph title = new Paragraph("4.6 COGENERATORI / TRIGENERATORI", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i < compCgImpiantoList.size(); i++) {
						
			SigitVSk4CgDto compCgImpianto = compCgImpiantoList.get(i);
			
			Paragraph paragraph = null;
			PdfPCell cell = null;
			
			if (progressivo.equals(compCgImpianto.getProgressivo()) && lastDataInstall!=null && lastDataInstall.compareTo(compCgImpianto.getDataInstall())==0) {
				continue;
			}
			
			if(!progressivo.equals(compCgImpianto.getProgressivo()))
			{	
				progressivo = compCgImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaCg = initializeTable(columnWidth);
				tabellaCg.setSpacingBefore(0);
				tabellaSostCg = initializeTable(columnWidth);
				tabellaSostCg.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaCg = aggiungiCg(tabellaCg, compCgImpianto);
				tabellaCgList.put(progressivo.toString(), tabellaCg);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setBackgroundColor(LIGHT_GRAY);
				cell.setColspan(4);
				tabellaSostCg.addCell(cell);
				tabellaSostCg = aggiungiCg(tabellaSostCg, compCgImpianto);
				tabelleCgSostList.put(progressivo.toString(), tabellaSostCg);
			}
			lastDataInstall = compCgImpianto.getDataInstall();
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaCgList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaCg = entry.getValue();
			tabellaSostCg = tabelleCgSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Cogeneratore / Trigeneratore", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("CG", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostCg != null) {
				tabellaSostCg.addCell(cell);	
				document.add(tabellaCg);
				document.add(tabellaSostCg);
			}
			else {
				tabellaCg.addCell(cell);
				document.add(tabellaCg);
			}
			
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiSezione4_6Cogeneratori - END");
	}
	
	private PdfPTable aggiungiCg(PdfPTable tabella, SigitVSk4CgDto compCgImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compCgImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compCgImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Matricola");
		datoTabella.setValore(ConvertUtil.getStringValid(compCgImpianto.getMatricola()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Tipologia");
		datoTabella.setValore(ConvertUtil.getStringValid(compCgImpianto.getTipologia()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Alimentazione");
		datoTabella.setValore(ConvertUtil.getStringValid(compCgImpianto.getDesCombustibile()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
	
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Potenza termica nominale (massimo recupero)");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getPotenzaTermicaKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Potenza elettrica nominale ai morsetti del generatore");
		datoTabella.setValore( ConvertUtil.convertToStringOrEmpty(compCgImpianto.getPotenzaElettricaKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Dati di targa");
		datoTabella.setValore("min");
		datoTabella.setSecondoValore("max");
		datoTabella.setTipoDato(TipoDato.DOPPIOVALORE);
		datoTabella.setHasBackgroundScuro(true);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Dati di targa");
		datoTabella.setValore("min");
		datoTabella.setSecondoValore("max");
		datoTabella.setTipoDato(TipoDato.DOPPIOVALORE);
		datoTabella.setHasBackgroundScuro(true);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Temperatura acqua in uscita (\u00B0C)");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getTempH2oOutMin()));
		datoTabella.setSecondoValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getTempH2oOutMax()));
		datoTabella.setTipoDato(TipoDato.DOPPIOVALORE);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Temperatura fumi  a valle dello scambiatore  (\u00B0C)");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getTempFumiValleMin()));
		datoTabella.setSecondoValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getTempFumiValleMax()));
		datoTabella.setTipoDato(TipoDato.DOPPIOVALORE);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Temperatura acqua in ingresso (\u00B0C)");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getTempH2oInMin()));
		datoTabella.setSecondoValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getTempH2oInMax()));
		datoTabella.setTipoDato(TipoDato.DOPPIOVALORE);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Temperatura fumi a monte dello scambiatore (\u00B0C)");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getTempFumiMonteMin()));
		datoTabella.setSecondoValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getTempFumiMonteMax()));
		datoTabella.setTipoDato(TipoDato.DOPPIOVALORE);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Temperatura acqua motore (solo m.c.i.) (\u00B0C)");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getTempH2oMotoreMin()));
		datoTabella.setSecondoValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getTempH2oMotoreMax()));
		datoTabella.setTipoDato(TipoDato.DOPPIOVALORE);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Emissioni di monossido di carbonio CO \n (mg/Nm\u00B3 riportati al 5% di O2 nei fumi)");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getCoMin()));
		datoTabella.setSecondoValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getCoMax()));
		datoTabella.setTipoDato(TipoDato.DOPPIOVALORE);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Da manutenere ogni (anni)");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCgImpianto.getTempoManutAnni()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
	
		return aggiungiSezioneTabella(tabella, datiTabella);
	}

	private void aggiungiSezione4_7CampiSolari(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiSezione4_7CampiSolari - START");

		List<SigitVCompCsDto> compCsImpiantoList = datiLibretto.getCompCsImpianto();
		
		Map<String, PdfPTable> tabellaCsList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleCsSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};
		
		PdfPTable tabellaCs = initializeTable(columnWidth);
		tabellaCs.setSpacingBefore(0);
		PdfPTable tabellaSostCs = initializeTable(columnWidth);
		tabellaSostCs.setSpacingBefore(0);
		
		if(compCsImpiantoList == null || compCsImpiantoList.isEmpty()) {
			compCsImpiantoList = new ArrayList<SigitVCompCsDto>();
			tabellaCsList.put("", aggiungiCs(tabellaCs, new SigitVCompCsDto()));
		}
		
		BigDecimal progressivo = null;
		
		if (compCsImpiantoList.size()>0) {
			progressivo = compCsImpiantoList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
				
		Paragraph title = new Paragraph("4.7 CAMPI SOLARI TERMICI", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i < compCsImpiantoList.size(); i++) {
						
			SigitVCompCsDto compCsImpianto = compCsImpiantoList.get(i);
									
			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compCsImpianto.getProgressivo()))
			{	
				progressivo = compCsImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaCs = initializeTable(columnWidth);
				tabellaCs.setSpacingBefore(0);
				tabellaSostCs = initializeTable(columnWidth);
				tabellaSostCs.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaCs = aggiungiCs(tabellaCs, compCsImpianto);
				tabellaCsList.put(progressivo.toString(), tabellaCs);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setBackgroundColor(LIGHT_GRAY);
				cell.setColspan(4);
				tabellaSostCs.addCell(cell);
				tabellaSostCs = aggiungiCs(tabellaSostCs, compCsImpianto);
				tabelleCsSostList.put(progressivo.toString(), tabellaSostCs);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaCsList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaCs = entry.getValue();
			tabellaSostCs = tabelleCsSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Campo Solare", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("CS", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostCs != null) {
				tabellaSostCs.addCell(cell);	
				document.add(tabellaCs);
				document.add(tabellaSostCs);
			}
			else {
				tabellaCs.addCell(cell);
				document.add(tabellaCs);
			}		
			
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiSezione4_7CampiSolari - END");
	}
	
	private PdfPTable aggiungiCs(PdfPTable tabella, SigitVCompCsDto compCsImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCsImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCsImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compCsImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Collettori");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCsImpianto.getNumCollettori()) + " (n\u00B0)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Superficie totale di apertura");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCsImpianto.getSupApertura()) + " (m\u00B2)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
	
		return aggiungiSezioneTabella(tabella, datiTabella);
	}

	private void aggiungiSezione4_8AltriGeneratori(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiSezione4_8AltriGeneratori - START");

		List<SigitVCompAgDto> compAgImpiantoList = datiLibretto.getCompAgImpianto();
		
		Map<String, PdfPTable> tabellaAgList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleAgSostList = new LinkedHashMap<String, PdfPTable>();
	
		float[] columnWidth = {25,25,25,25};

		PdfPTable tabellaAg = initializeTable(columnWidth);
		tabellaAg.setSpacingBefore(0);
		PdfPTable tabellaSostAg = initializeTable(columnWidth);
		tabellaSostAg.setSpacingBefore(0);
		
		if(compAgImpiantoList == null || compAgImpiantoList.isEmpty()) {
			compAgImpiantoList = new ArrayList<SigitVCompAgDto>();
			tabellaAgList.put("", aggiungiAg(tabellaAg, new SigitVCompAgDto()));
		}
		
		BigDecimal progressivo = null;
		
		if (compAgImpiantoList.size()>0) {
			progressivo = compAgImpiantoList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
		
		Paragraph title = new Paragraph("4.8 ALTRI GENERATORI", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i < compAgImpiantoList.size(); i++) {
						
			SigitVCompAgDto compAgImpianto = compAgImpiantoList.get(i);
									
			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compAgImpianto.getProgressivo()))
			{	
				progressivo = compAgImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaAg = initializeTable(columnWidth);
				tabellaAg.setSpacingBefore(0);
				tabellaSostAg = initializeTable(columnWidth);
				tabellaSostAg.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaAg = aggiungiAg(tabellaAg, compAgImpianto);
				tabellaAgList.put(progressivo.toString(), tabellaAg);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setColspan(4);
				cell.setBackgroundColor(LIGHT_GRAY);
				tabellaSostAg.addCell(cell);
				tabellaSostAg = aggiungiAg(tabellaSostAg, compAgImpianto);
				tabelleAgSostList.put(progressivo.toString(), tabellaSostAg);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaAgList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaAg = entry.getValue();
			tabellaSostAg = tabelleAgSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Altro Generatore", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("AG", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostAg != null) {
				tabellaSostAg.addCell(cell);	
				document.add(tabellaAg);
				document.add(tabellaSostAg);
			}
			else {
				tabellaAg.addCell(cell);
				document.add(tabellaAg);
			}		
			
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiSezione4_8AltriGeneratori - END");
	}
	
	private PdfPTable aggiungiAg(PdfPTable tabella, SigitVCompAgDto compAgImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compAgImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compAgImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compAgImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compAgImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Matricola");
		datoTabella.setValore(ConvertUtil.getStringValid(compAgImpianto.getMatricola()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Tipologia");
		datoTabella.setValore(ConvertUtil.getStringValid(compAgImpianto.getTipologia()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Potenza utile");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compAgImpianto.getPotenzaTermicaKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		return aggiungiSezioneTabella(tabella, datiTabella);
	}

	private void aggiungiScheda5SistemiRegolazioneContabilizzazione(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda5SistemiRegolazioneContabilizzazione - START");
		
		SigitTCompXSempliceDto compXSemplice = datiLibretto.getCompXSemplice();
		
		float[] columnWidth = {25, 25, 25, 25};
		
		Paragraph paragraph = new Paragraph("5. SISTEMI DI REGOLAZIONE E CONTABILIZZAZIONE", FONT_HELVETICA_9_B);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);
		
		//SEZIONE 5.1
		paragraph = new Paragraph("5.1 REGOLAZIONE PRIMARIA", FONT_HELVETICA_8_B);
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Sistema di regolazione ON - OFF", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgSrOnoff()));
		document.add(paragraph);

		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Sistema di regolazione con impostazione della curva climatica integrata nel generatore", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgSrGeneratore()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Sistema di regolazione con impostazione della curva climatica indipendente", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgSrIndipendente()));
		document.add(paragraph);
		
		aggiungiSezioneSistemaRegolazione(document, datiLibretto, isSimul);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Valvole di regolazione", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgValvoleRegolazione()));
		paragraph.add(new Phrase(" (se non incorporate nel generatore)", FONT_HELVETICA_6_B));
		document.add(paragraph);
		
		aggiungiSezioneValvolaRegolazione(document, datiLibretto, isSimul);
		
		paragraph = new Paragraph("",FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Sistema di regolazione multigradino", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgSrMultigradino()));
		document.add(paragraph);
		
		paragraph = new Paragraph("",FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Sistema di regolazione a Inverter del generatore", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgSrInverter()));
		document.add(paragraph);
		
		paragraph = new Paragraph("",FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Altri sistemi di regolazione primaria", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL51FlgSrAltri()));
		paragraph.add(new Phrase(" (Riportare descrizione del sistema, fabbricanti, modelli, etc.)", FONT_HELVETICA_6_B));
		document.add(paragraph);
		
		paragraph = new Paragraph("Descrizione del sistema",FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph, compXSemplice != null ? ConvertUtil.getStringValid(compXSemplice.getL51SrDescrizione()) : "", 20);
		document.add(paragraph);
		
		document.newPage();
		
		//SEZIONE 5.2
		paragraph = new Paragraph("5.2 REGOLAZIONE SINGOLO AMBIENTE DI ZONA", FONT_HELVETICA_8_B);
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Termostato di zona o ambiente con controllo ON-OFF", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL52FlgTermoOnoff()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Termostato di zona o ambiente con controllo proporzionale", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL52FlgTermoProporzionale()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Controllo entalpico su serranda aria esterna", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL52FlgContrEntalpico()));
		document.add(paragraph);

		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Controllo portata aria variabile per aria canalizzata", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL52FlgContrPortata()));
		document.add(paragraph);
		
		//START ROW
		PdfPTable tabella = initializeTable(columnWidth);
		paragraph = new Paragraph("Valvole Termostatiche (rif. UNI EN 215)", FONT_HELVETICA_8);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.TOP);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Presenti", compXSemplice != null && Constants.FLAG_PRESENTE.equals(compXSemplice.getL52FlgValvoleTermo()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.TOP);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Assenti", compXSemplice != null && Constants.FLAG_ASSENTE.equals(compXSemplice.getL52FlgValvoleTermo()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.TOP | Rectangle.RIGHT);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Valvole a due vie", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Presenti", compXSemplice != null && Constants.FLAG_PRESENTE.equals(compXSemplice.getL52FlgValvole2()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Assenti", compXSemplice != null && Constants.FLAG_ASSENTE.equals(compXSemplice.getL52FlgValvole2()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Valvole a tre vie", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Presenti", compXSemplice != null && Constants.FLAG_PRESENTE.equals(compXSemplice.getL52FlgValvole3()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Assenti", compXSemplice != null && Constants.FLAG_ASSENTE.equals(compXSemplice.getL52FlgValvole3()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Note", FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph, compXSemplice != null ? ConvertUtil.getStringValid(compXSemplice.getL52Note()) : "", 20);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		document.add(tabella);
		
		//SEZIONE 5.3
		paragraph = new Paragraph("5.3 SISTEMI TELEMATICI DI TELELETTURA E TELEGESTIONE", FONT_HELVETICA_8_B);
		document.add(paragraph);
		
		tabella = initializeTable(columnWidth);
		
		//START ROW
		paragraph = new Paragraph("Telelettura", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.TOP);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Presenti", compXSemplice != null && Constants.FLAG_PRESENTE.equals(compXSemplice.getL53FlgTelelettura()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.TOP);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Assenti", compXSemplice != null && Constants.FLAG_ASSENTE.equals(compXSemplice.getL53FlgTelelettura()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.TOP);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Telegestione", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Presenti", compXSemplice != null && Constants.FLAG_PRESENTE.equals(compXSemplice.getL53FlgTelegestione()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Assenti", compXSemplice != null && Constants.FLAG_ASSENTE.equals(compXSemplice.getL53FlgTelegestione()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Descrizione del sistema", FONT_HELVETICA_8);
		paragraph.add(new Phrase(" (situazione alla prima installazione o alla ristrutturazione dell'impianto termico)", FONT_HELVETICA_6));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(compXSemplice != null ? ConvertUtil.getStringValid(compXSemplice.getL53DesSistemaInstallaz()) : "", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Data di sostituzione", FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph, compXSemplice != null ? ConvertUtil.convertToStringOrEmpty(compXSemplice.getL53DataSostituz()) : "", 20);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Descrizione del sistema", FONT_HELVETICA_8);
		paragraph.add(new Phrase(" (sostituzione del sistema)", FONT_HELVETICA_6));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph, compXSemplice != null ? ConvertUtil.getStringValid(compXSemplice.getL53DesSistemaSostituz()) : "", 20);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		document.add(tabella);
		
		//SEZIONE 5.4
		paragraph = new Paragraph("5.4 CONTABILIZZAZIONE", FONT_HELVETICA_8_B);
		document.add(paragraph);
		
		tabella = initializeTable(columnWidth);
		
		boolean isContabilizzate = compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL54FlgUic());
		
		//START ROW
		paragraph = new Paragraph("Unita' Immobiliari Contabilizzate", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.TOP);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "SI", compXSemplice != null && isContabilizzate);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.TOP);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "NO", compXSemplice != null && !isContabilizzate);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.TOP);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Se contabilizzate", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Riscaldamento", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL54FlgRisc()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Raffrescamento", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL54FlgRaff()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Acqua calda sanitaria", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL54FlgAcs()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Tipologia sistema", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT);
		cell.setColspan(2);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "diretto", compXSemplice != null && Constants.FLG_5_4_TIPOLOGIA_DIRETTO.equals(compXSemplice.getL54FlgTipologia()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "indiretto", compXSemplice != null && Constants.FLG_5_4_TIPOLOGIA_INDIRETTO.equals(compXSemplice.getL54FlgTipologia()));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Descrizione del sistema", FONT_HELVETICA_8);
		paragraph.add(new Phrase(" (situazione alla prima installazione o alla ristrutturazione dell'impianto termico)", FONT_HELVETICA_6));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(compXSemplice != null ? ConvertUtil.getStringValid(compXSemplice.getL54DesSistemaInstallaz()) : "", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Data di sostituzione", FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph,compXSemplice != null ? ConvertUtil.convertToStringOrEmpty(compXSemplice.getL54DataSostituz()) : "", 20);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Descrizione del sistema", FONT_HELVETICA_8);
		paragraph.add(new Phrase(" (sostituzione del sistema)", FONT_HELVETICA_6));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiSpazioETesto(paragraph, compXSemplice != null ? ConvertUtil.getStringValid(compXSemplice.getL54DesSistemaSostituz()) : "", 20);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		document.add(tabella);
		
		gestDebug(isSimul, "aggiungiScheda5SistemiRegolazioneContabilizzazione - END");
	}
	
	private void aggiungiSezioneSistemaRegolazione(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiSezioneSistemaRegolazione - START");

		List<SigitVCompSrDto> compSrList = datiLibretto.getSrList();
		
		Map<String, PdfPTable> tabellaSrList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleSrSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};
		
		PdfPTable tabellaSr = initializeTable(columnWidth);
		tabellaSr.setSpacingBefore(0);
		PdfPTable tabellaSostSr = initializeTable(columnWidth);
		tabellaSostSr.setSpacingBefore(0);
		
		if(compSrList == null || compSrList.isEmpty()) {
			compSrList = new ArrayList<SigitVCompSrDto>();
			tabellaSrList.put("", aggiungiSr(tabellaSr, new SigitVCompSrDto()));
		}
		BigDecimal progressivo = null;
		
		if (compSrList.size()>0) {
			progressivo = compSrList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
		
		for (int i=0; i < compSrList.size(); i++) {
						
			SigitVCompSrDto compSrImpianto = compSrList.get(i);
								
			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compSrImpianto.getProgressivo()))
			{	
				progressivo = compSrImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaSr = initializeTable(columnWidth);
				tabellaSr.setSpacingBefore(0);
				tabellaSostSr = initializeTable(columnWidth);
				tabellaSostSr.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaSr = aggiungiSr(tabellaSr, compSrImpianto);
				tabellaSrList.put(progressivo.toString(), tabellaSr);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setBackgroundColor(LIGHT_GRAY);
				cell.setColspan(4);
				tabellaSostSr.addCell(cell);
				tabellaSostSr = aggiungiSr(tabellaSostSr, compSrImpianto);
				tabelleSrSostList.put(progressivo.toString(), tabellaSostSr);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaSrList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaSr = entry.getValue();
			tabellaSostSr = tabelleSrSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Sistema reg.ne", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("SR", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostSr != null) {
				tabellaSostSr.addCell(cell);	
				document.add(tabellaSr);
				document.add(tabellaSostSr);
			}
			else {
				tabellaSr.addCell(cell);
				document.add(tabellaSr);
			}		
			
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiSezioneSistemaRegolazione - END");
	}
	
	private PdfPTable aggiungiSr(PdfPTable tabella, SigitVCompSrDto compSrImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compSrImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compSrImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compSrImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compSrImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Numero punti di regolazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compSrImpianto.getNumPtiRegolazione()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Numero livelli di temperatura");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compSrImpianto.getNumLivTemp()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		return aggiungiSezioneTabella(tabella, datiTabella);
	}

	private void aggiungiSezioneValvolaRegolazione(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiSezioneValvolaRegolazione - START");

		List<SigitVCompVrDto> compVrList = datiLibretto.getVrList();
		
		Map<String, PdfPTable> tabellaVrList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleVrSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};

		PdfPTable tabellaVr = initializeTable(columnWidth);
		tabellaVr.setSpacingBefore(0);
		PdfPTable tabellaSostVr = initializeTable(columnWidth);
		tabellaSostVr.setSpacingBefore(0);
		
		if(compVrList == null || compVrList.isEmpty()) {
			compVrList = new ArrayList<SigitVCompVrDto>();
			tabellaVrList.put("", aggiungiVr(tabellaVr, new SigitVCompVrDto()));
		}
		
		BigDecimal progressivo = null;
		
		if (compVrList.size()>0) {
			progressivo = compVrList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
					
		for (int i=0; i < compVrList.size(); i++) {
						
			SigitVCompVrDto compVrImpianto = compVrList.get(i);

			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compVrImpianto.getProgressivo()))
			{	
				progressivo = compVrImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaVr = initializeTable(columnWidth);
				tabellaVr.setSpacingBefore(0);
				tabellaSostVr = initializeTable(columnWidth);
				tabellaSostVr.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaVr = aggiungiVr(tabellaVr, compVrImpianto);
				tabellaVrList.put(progressivo.toString(), tabellaVr);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setBackgroundColor(LIGHT_GRAY);
				cell.setColspan(4);
				tabellaSostVr.addCell(cell);
				tabellaSostVr = aggiungiVr(tabellaSostVr, compVrImpianto);
				tabelleVrSostList.put(progressivo.toString(), tabellaSostVr);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaVrList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaVr = entry.getValue();
			tabellaSostVr = tabelleVrSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Valvola reg.ne", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("VR", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostVr != null) {
				tabellaSostVr.addCell(cell);	
				document.add(tabellaVr);
				document.add(tabellaSostVr);
			}
			else {
				tabellaVr.addCell(cell);
				document.add(tabellaVr);
			}	
			
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiSezioneValvolaRegolazione - END");
	}
	
	private PdfPTable aggiungiVr(PdfPTable tabella, SigitVCompVrDto compVrImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compVrImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compVrImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compVrImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compVrImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Numero di vie");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compVrImpianto.getNumVie()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Servomotore");
		datoTabella.setValore(ConvertUtil.getStringValid(compVrImpianto.getServomotore()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		return aggiungiSezioneTabella(tabella, datiTabella);
	}
	
	private void aggiungiScheda6SistemiDistribuzione(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda6SistemiDistribuzione - START");
		
		SigitTCompXSempliceDto compXSemplice = datiLibretto.getCompXSemplice();
		
		Paragraph paragraph = new Paragraph("6. SISTEMI DI DISTRIBUZIONE", FONT_HELVETICA_9_B);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);
		
		//SEZIONE 6.1
		paragraph = new Paragraph("6.1 TIPO DI DISTRIBUZIONE", FONT_HELVETICA_8_B);
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Verticale a colonne montanti", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL61FlgVerticale()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Orizzontale a zone", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL61FlgOrizzontale()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Canali d'aria", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL61FlgCan()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Altro  ", compXSemplice != null && GenericUtil.isNotNullOrEmpty(compXSemplice.getL61Altro()));
		aggiungiSpazioETesto(paragraph, compXSemplice != null ? ConvertUtil.getStringValid(compXSemplice.getL61Altro()) : "", 0);
		document.add(paragraph);
		
		//SEZIONE 6.2
		paragraph = new Paragraph("6.2 COIBENTAZIONE RETE DI DISTRIBUZIONE", FONT_HELVETICA_8_B);
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Assente", compXSemplice != null && Constants.FLAG_ASSENTE.equals(compXSemplice.getL62FlgCoibent()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Presente", compXSemplice != null && Constants.FLAG_PRESENTE.equals(compXSemplice.getL62FlgCoibent()));
		document.add(paragraph);
		
		paragraph = new Paragraph("Note  ", FONT_HELVETICA_8_B);
		aggiungiSpazioETesto(paragraph, compXSemplice != null ? ConvertUtil.getStringValid(compXSemplice.getL62Note()) : "", 0);
		document.add(paragraph);
			
		aggiungiSezioneVasiEspansione(document, datiLibretto, isSimul);
		
		aggiungiSezionePompeCircolazione(document, datiLibretto, isSimul);
		
		gestDebug(isSimul, "aggiungiScheda6SistemiDistribuzione - END");
	}

	private void aggiungiSezioneVasiEspansione(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiSezioneVasiEspansione - END");
		//SEZIONE 6.3
		Paragraph paragraph = new Paragraph("6.3  VASI DI ESPANSIONE", FONT_HELVETICA_8_B);
		document.add(paragraph);
		
		List<SigitTCompVxDto> vxList = datiLibretto.getVxList();
		
		if (vxList == null || vxList.isEmpty()) {
			vxList = new ArrayList<SigitTCompVxDto>();
			vxList.add(new SigitTCompVxDto());
		}
		
		PdfPTable tabella = initializeTable(new float[] {(float) 12.5, (float) 12.5, (float) 12.5, (float) 12.5, (float) 12.5, (float) 12.5, (float) 12.5, (float) 12.5 });
		PdfPCell cell;
		for (SigitTCompVxDto vx : vxList) {
			//START ROW
			paragraph = new Paragraph("VX", FONT_HELVETICA_8_B);
			aggiungiSpazioETesto(paragraph, ConvertUtil.convertToStringOrEmpty(vx.getProgressivo()), 3);
			aggiungiSpazioETesto(paragraph, "-   Capacit\u00E1 (l) ", 3);
			aggiungiSpazioETesto(paragraph, ConvertUtil.convertToStringOrEmpty(vx.getCapacitaL()), 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			cell.setColspan(3);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "Aperto", Constants.FLAG_VASO_APERTO.equals(vx.getFlgVaso()));
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "Chiuso", Constants.FLAG_VASO_CHIUSO.equals(vx.getFlgVaso()));
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Pressione di precarica", FONT_HELVETICA_8);
			paragraph.add(new Phrase(" (solo per vasi chiusi)", FONT_HELVETICA_6));
			aggiungiValoreUnitaMisura(paragraph, ConvertUtil.convertToStringOrEmpty(vx.getPressioneBar()), "(bar)", 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			cell.setColspan(3);
			tabella.addCell(cell);
			//END ROW
		}
		document.add(tabella);
		gestDebug(isSimul, "aggiungiSezioneVasiEspansione - END");
	}
	
	private void aggiungiSezionePompeCircolazione(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiSezionePompeCircolazione - START");

		List<SigitVCompPoDto> compPoList = datiLibretto.getPoList();
		
		Map<String, PdfPTable> tabellaPoList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabellePoSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};

		PdfPTable tabellaPo = initializeTable(columnWidth);
		tabellaPo.setSpacingBefore(0);
		PdfPTable tabellaSostPo = initializeTable(columnWidth);
		tabellaSostPo.setSpacingBefore(0);
		
		if(compPoList == null || compPoList.isEmpty()) {
			compPoList = new ArrayList<SigitVCompPoDto>();
			tabellaPoList.put("", aggiungiPo(tabellaPo, new SigitVCompPoDto()));
		}
		
		BigDecimal progressivo = null;
		
		if (compPoList.size()>0) {
			progressivo = compPoList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
				
		Paragraph title = new Paragraph("6.4 POMPE DI CIRCOLAZIONE", FONT_HELVETICA_8_B);
		title.add(new Phrase(" (se non incorporate nel generatore)", FONT_HELVETICA_6_B));
		document.add(title);
		
		for (int i=0; i < compPoList.size(); i++) {
						
			SigitVCompPoDto compPoImpianto = compPoList.get(i);
			
			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compPoImpianto.getProgressivo()))
			{	
				progressivo = compPoImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaPo = initializeTable(columnWidth);
				tabellaPo.setSpacingBefore(0);
				tabellaSostPo = initializeTable(columnWidth);
				tabellaSostPo.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaPo = aggiungiPo(tabellaPo, compPoImpianto);
				tabellaPoList.put(progressivo.toString(), tabellaPo);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setBackgroundColor(LIGHT_GRAY);
				cell.setColspan(4);
				tabellaSostPo.addCell(cell);
				tabellaSostPo = aggiungiPo(tabellaSostPo, compPoImpianto);
				tabellePoSostList.put(progressivo.toString(), tabellaSostPo);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaPoList.entrySet()) {
			String progessivo = entry.getKey();
			PdfPTable tabellaSr = entry.getValue();
			PdfPTable tabellaSrSost = tabellePoSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Pompa", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("PO", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSrSost != null) {
				tabellaSrSost.addCell(cell);	
				document.add(tabellaSr);
				document.add(tabellaSrSost);
			}
			else {
				tabellaSr.addCell(cell);
				document.add(tabellaSr);
			}	
			
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiSezionePompeCircolazione - END");
	}
	
	private PdfPTable aggiungiPo(PdfPTable tabella, SigitVCompPoDto compPoImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compPoImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compPoImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compPoImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compPoImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		BigDecimal flgGiriVariabili = compPoImpianto.getFlgGiriVariabili();
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Giri Variabili");
		ArrayList<DatoCheckbox> valoriCheckbox = new ArrayList<DatoCheckbox>();
		DatoCheckbox checkbox = new DatoCheckbox();
		checkbox.setLabel("SI");
		checkbox.setValore(flgGiriVariabili!=null && Constants.SI_1 == flgGiriVariabili.intValue());
		valoriCheckbox.add(checkbox);
		checkbox = new DatoCheckbox();
		checkbox.setLabel("NO");
		checkbox.setValore(flgGiriVariabili!=null && Constants.NO_0 == flgGiriVariabili.intValue());
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datoTabella.setTipoDato(TipoDato.DOPPIACHECKBOX);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Potenza Nominale");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compPoImpianto.getPotNominaleKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		return aggiungiSezioneTabella(tabella, datiTabella);
	}
	
	private void aggiungiScheda7SistemaEmissione (Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda7SistemaEmissione - START");
		
		SigitTCompXSempliceDto compXSemplice = datiLibretto.getCompXSemplice();
		
		Paragraph paragraph = new Paragraph("7. SISTEMA DI EMISSIONE", FONT_HELVETICA_9_B);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);
		
		//SEZIONE 7
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Radiatori", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL70FlgRadiatori()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Termoconvettori", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL70FlgTermoconvettori()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Ventilconvettori", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL70FlgVentilconvettori()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Pannelli radianti", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL70FlgPannelli()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Bocchette", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL70FlgBocchette()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Strisce radianti", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL70FlgStrisce()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Travi fredde", compXSemplice != null && ConvertUtil.convertToBooleanAllways(compXSemplice.getL70FlgTravi()));
		document.add(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Altro", compXSemplice != null && GenericUtil.isNotNullOrEmpty(compXSemplice.getL70Altro()), 20);
		aggiungiSpazioETesto(paragraph, compXSemplice != null ? ConvertUtil.getStringValid(compXSemplice.getL70Altro()) : "", 20);
		document.add(paragraph);
		
		gestDebug(isSimul, "aggiungiScheda7SistemaEmissione - END");
	}
	
	private void aggiungiScheda8SistemaAccumulo(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda8SistemaAccumulo - START");

		List<SigitVCompAcDto> compAcList = datiLibretto.getAcList();
		
		Map<String, PdfPTable> tabellaAcList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleAcSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};
	
		PdfPTable tabellaAc = initializeTable(columnWidth);
		tabellaAc.setSpacingBefore(0);
		PdfPTable tabellaSostAc = initializeTable(columnWidth);
		tabellaSostAc.setSpacingBefore(0);
		
		if(compAcList == null || compAcList.isEmpty()) {
			compAcList = new ArrayList<SigitVCompAcDto>();
			tabellaAcList.put("", aggiungiAc(tabellaAc, new SigitVCompAcDto()));
		}
		BigDecimal progressivo = null;
		
		if (compAcList.size()>0) {
			progressivo = compAcList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
				
		Paragraph title = new Paragraph("8. SISTEMA DI ACCUMULO", FONT_HELVETICA_9_B);
		title.setAlignment(Element.ALIGN_CENTER);
		document.add(title);
		
		Paragraph subtitle = new Paragraph("8.1 ACCUMULI", FONT_HELVETICA_8_B);
		subtitle.add(new Phrase(" (se non incorporati nel gruppo termico o caldaia)", FONT_HELVETICA_6));
		document.add(subtitle);
		
		for (int i=0; i < compAcList.size(); i++) {
						
			SigitVCompAcDto compAcImpianto = compAcList.get(i);
		
			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compAcImpianto.getProgressivo()))
			{	
				progressivo = compAcImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaAc = initializeTable(columnWidth);
				tabellaAc.setSpacingBefore(0);
				tabellaSostAc = initializeTable(columnWidth);
				tabellaSostAc.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaAc = aggiungiAc(tabellaAc, compAcImpianto);
				tabellaAcList.put(progressivo.toString(), tabellaAc);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setColspan(4);
				cell.setBackgroundColor(LIGHT_GRAY);
				tabellaSostAc.addCell(cell);
				tabellaSostAc = aggiungiAc(tabellaSostAc, compAcImpianto);
				tabelleAcSostList.put(progressivo.toString(), tabellaSostAc);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaAcList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaAc = entry.getValue();
			tabellaSostAc = tabelleAcSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Accumulo", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("AC", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostAc != null) {
				tabellaSostAc.addCell(cell);	
				document.add(tabellaAc);
				document.add(tabellaSostAc);
			}
			else {
				tabellaAc.addCell(cell);
				document.add(tabellaAc);
			}	
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiScheda8SistemaAccumulo - END");
	}
	
	private PdfPTable aggiungiAc(PdfPTable tabella, SigitVCompAcDto compAcImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compAcImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compAcImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compAcImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compAcImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Matricola");
		datoTabella.setValore(ConvertUtil.getStringValid(compAcImpianto.getMatricola()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Capacit\u00E1");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compAcImpianto.getCapacita()) + " (l)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		ArrayList<DatoCheckbox> valoriCheckbox = new ArrayList<DatoCheckbox>();
		DatoCheckbox checkbox = new DatoCheckbox();
		checkbox.setLabel("Acqua calda sanitaria");
		checkbox.setValore(ConvertUtil.convertToBooleanAllways(compAcImpianto.getFlgAcs()));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Coibentazione");
		valoriCheckbox = new ArrayList<DatoCheckbox>();
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Assente");
		checkbox.setValore(Constants.FLAG_ASSENTE.equals(compAcImpianto.getFlgCoib()));
		valoriCheckbox.add(checkbox);
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Presente");
		checkbox.setValore(Constants.FLAG_PRESENTE.equals(compAcImpianto.getFlgCoib()));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datoTabella.setTipoDato(TipoDato.DOPPIACHECKBOX);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		valoriCheckbox = new ArrayList<DatoCheckbox>();
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Riscaldamento");
		checkbox.setValore(ConvertUtil.convertToBooleanAllways(compAcImpianto.getFlgRisc()));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		valoriCheckbox = new ArrayList<DatoCheckbox>();
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Raffrescamento");
		checkbox.setValore(ConvertUtil.convertToBooleanAllways(compAcImpianto.getFlgRaff()));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		return aggiungiSezioneTabella(tabella, datiTabella);
	}
	
	private void aggiungiScheda9AltriComponentiImpianto(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda9AltriComponentiImpianto - START");
						
		Paragraph paragraph = new Paragraph("9. ALTRI COMPONENTI DELL'IMPIANTO", FONT_HELVETICA_9_B);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);

		//SEZIONE 9.1
		aggiungiScheda9_1TorriEvaporatori(document, datiLibretto, isSimul);
		
		document.newPage();

		//SEZIONE 9.2
		aggiungiScheda9_2RaffreddatoriLiquido(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 9.3
		aggiungiScheda9_3ScambiatoriCaloreIntermedio(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 9.4
		aggiungiScheda9_4CircuitiInterrati(document, datiLibretto, isSimul); 
		
		document.newPage();
		
		//SEZIONE 9.5
		aggiungiScheda9_5UnitaTrattamentoAria(document, datiLibretto, isSimul); 
		
		document.newPage();
		
		//SEZIONE 9.6
		aggiungiScheda9_6RecuperatoriCalore(document, datiLibretto, isSimul); 
		
		gestDebug(isSimul, "aggiungiScheda9AltriComponentiImpianto - END");
	}
	
	private void aggiungiScheda9_1TorriEvaporatori(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda9_1TorriEvaporatori - START");

		List<SigitVCompTeDto> compTeList = datiLibretto.getTeList();
		
		Map<String, PdfPTable> tabellaTeList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleTeSostList = new LinkedHashMap<String, PdfPTable>();

		float[] columnWidth = {25,25,25,25};
		
		PdfPTable tabellaTe = initializeTable(columnWidth);
		tabellaTe.setSpacingBefore(0);
		PdfPTable tabellaSostTe = initializeTable(columnWidth);
		tabellaSostTe.setSpacingBefore(0);
		
		if(compTeList == null || compTeList.isEmpty()) {
			compTeList = new ArrayList<SigitVCompTeDto>();
			tabellaTeList.put("", aggiungiTe(tabellaTe, new SigitVCompTeDto()));
		}
		
		BigDecimal progressivo = null;
		
		if (compTeList.size()>0) {
			progressivo = compTeList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
				
		Paragraph title = new Paragraph("9.1 TORRI EVAPORATIVE", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i < compTeList.size(); i++) {
						
			SigitVCompTeDto compTeImpianto = compTeList.get(i);
			
			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compTeImpianto.getProgressivo()))
			{	
				progressivo = compTeImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaTe = initializeTable(columnWidth);
				tabellaTe.setSpacingBefore(0);
				tabellaSostTe = initializeTable(columnWidth);
				tabellaSostTe.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaTe = aggiungiTe(tabellaTe, compTeImpianto);
				tabellaTeList.put(progressivo.toString(), tabellaTe);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setColspan(4);
				cell.setBackgroundColor(LIGHT_GRAY);
				tabellaSostTe.addCell(cell);
				tabellaSostTe = aggiungiTe(tabellaSostTe, compTeImpianto);
				tabelleTeSostList.put(progressivo.toString(), tabellaSostTe);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaTeList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaTe = entry.getValue();
			tabellaSostTe = tabelleTeSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Torre", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("TE", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostTe != null) {
				tabellaSostTe.addCell(cell);	
				document.add(tabellaTe);
				document.add(tabellaSostTe);
			}
			else {
				tabellaTe.addCell(cell);
				document.add(tabellaTe);
			}	
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiScheda9_1TorriEvaporatori - END");
	}
	
	private PdfPTable aggiungiTe(PdfPTable tabella, SigitVCompTeDto compTeImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compTeImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compTeImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compTeImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compTeImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Matricola");
		datoTabella.setValore(ConvertUtil.getStringValid(compTeImpianto.getMatricola()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Capcit\u00E1 nominale");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compTeImpianto.getCapacitaL()) + "(l)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Numero ventilatori");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compTeImpianto.getNumVentilatori()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Tipo ventilatori");
		datoTabella.setValore(ConvertUtil.getStringValid(compTeImpianto.getTipoVentilatori()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		return aggiungiSezioneTabella(tabella, datiTabella);
	}
	
	private void aggiungiScheda9_2RaffreddatoriLiquido(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda9_2RaffreddatoriLiquido - START");

		List<SigitVCompRvDto> compRvList = datiLibretto.getRvList();
		
		Map<String, PdfPTable> tabellaRvList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleRvSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};

		PdfPTable tabellaRv = initializeTable(columnWidth);
		tabellaRv.setSpacingBefore(0);
		PdfPTable tabellaSostRv = initializeTable(columnWidth);
		tabellaSostRv.setSpacingBefore(0);
		
		if(compRvList == null || compRvList.isEmpty()) {
			compRvList = new ArrayList<SigitVCompRvDto>();
			tabellaRvList.put("", aggiungiRv(tabellaRv, new SigitVCompRvDto()));
		}
		
		BigDecimal progressivo = null;
		
		if (compRvList.size()>0) {
			progressivo = compRvList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
				
		Paragraph title = new Paragraph("9.2 RAFFREDDATORI DI LIQUIDO", FONT_HELVETICA_8_B);
		title.add(new Phrase(" (a circuito chiuso)", FONT_HELVETICA_6));
		document.add(title);
		
		for (int i=0; i < compRvList.size(); i++) {
						
			SigitVCompRvDto compRvImpianto = compRvList.get(i);

			
			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compRvImpianto.getProgressivo()))
			{	
				progressivo = compRvImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaRv = initializeTable(columnWidth);
				tabellaRv.setSpacingBefore(0);
				tabellaSostRv = initializeTable(columnWidth);
				tabellaSostRv.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaRv = aggiungiRv(tabellaRv, compRvImpianto);
				tabellaRvList.put(progressivo.toString(), tabellaRv);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setColspan(4);
				cell.setBackgroundColor(LIGHT_GRAY);
				tabellaSostRv.addCell(cell);
				tabellaSostRv = aggiungiRv(tabellaSostRv, compRvImpianto);
				tabelleRvSostList.put(progressivo.toString(), tabellaSostRv);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaRvList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaRv = entry.getValue();
			tabellaSostRv = tabelleRvSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Raffreddatore", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("RV", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostRv != null) {
				tabellaSostRv.addCell(cell);	
				document.add(tabellaRv);
				document.add(tabellaSostRv);
			}
			else {
				tabellaRv.addCell(cell);
				document.add(tabellaRv);
			}		
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiScheda9_2RaffreddatoriLiquido - END");
	}
	
	private PdfPTable aggiungiRv(PdfPTable tabella, SigitVCompRvDto compRvImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compRvImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compRvImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compRvImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compRvImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Matricola");
		datoTabella.setValore(ConvertUtil.getStringValid(compRvImpianto.getMatricola()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Numero ventilatori");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compRvImpianto.getNumVentilatori()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Tipo ventilatori");
		datoTabella.setValore(ConvertUtil.getStringValid(compRvImpianto.getTipoVentilatori()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		return aggiungiSezioneTabella(tabella, datiTabella);
	}
	
	private void aggiungiScheda9_3ScambiatoriCaloreIntermedio(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda9_3ScambiatoriCaloreIntermedio - START");

		List<SigitTCompXDto> compScxList = datiLibretto.getScxList();
		
		Map<String, PdfPTable> tabellaScxList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleScxSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};
		
		PdfPTable tabellaScx = initializeTable(columnWidth);
		tabellaScx.setSpacingBefore(0);
		PdfPTable tabellaSostScx = initializeTable(columnWidth);
		tabellaSostScx.setSpacingBefore(0);
		
		if(compScxList == null || compScxList.isEmpty()) {
			compScxList = new ArrayList<SigitTCompXDto>();
			tabellaScxList.put("", aggiungiScx(tabellaScx, new SigitTCompXDto()));	
		}
		
		BigDecimal progressivo = null;
		
		if (compScxList.size()>0) {
			progressivo = compScxList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
				
		Paragraph title = new Paragraph("9.3 SCAMBIATORI DI CALORE INTERMEDI", FONT_HELVETICA_8_B);
		title.add(new Phrase(" (per acqua di superficie o di falda)", FONT_HELVETICA_6));
		document.add(title);
		
		for (int i=0; i < compScxList.size(); i++) {
						
			SigitTCompXDto compScxImpianto = compScxList.get(i);
			
			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compScxImpianto.getProgressivo()))
			{	
				progressivo = compScxImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaScx = initializeTable(columnWidth);
				tabellaScx.setSpacingBefore(0);
				tabellaSostScx = initializeTable(columnWidth);
				tabellaSostScx.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaScx = aggiungiScx(tabellaScx, compScxImpianto);
				tabellaScxList.put(progressivo.toString(), tabellaScx);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setColspan(4);
				cell.setBackgroundColor(LIGHT_GRAY);
				tabellaSostScx.addCell(cell);
				tabellaSostScx = aggiungiScx(tabellaSostScx, compScxImpianto);
				tabelleScxSostList.put(progressivo.toString(), tabellaSostScx);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaScxList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaScx = entry.getValue();
			tabellaSostScx = tabelleScxSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Scambiatore", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("SC", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostScx != null) {
				tabellaSostScx.addCell(cell);	
				document.add(tabellaScx);
				document.add(tabellaSostScx);
			}
			else {
				tabellaScx.addCell(cell);
				document.add(tabellaScx);
			}		
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiScheda9_3ScambiatoriCaloreIntermedio - END");
	}
	
	private PdfPTable aggiungiScx(PdfPTable tabella, SigitTCompXDto compScxImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compScxImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compScxImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(getDesFabbricante(compScxImpianto.getFkMarca())));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compScxImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		return aggiungiSezioneTabella(tabella, datiTabella);
	}
	
	private void aggiungiScheda9_4CircuitiInterrati(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda9_4CircuitiInterrati - START");

		List<SigitVCompCiDto> compCiList = datiLibretto.getCiList();
		
		Map<String, PdfPTable> tabellaCiList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleCiSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};
		
		PdfPTable tabellaCi = initializeTable(columnWidth);
		tabellaCi.setSpacingBefore(0);
		PdfPTable tabellaSostCi = initializeTable(columnWidth);
		tabellaSostCi.setSpacingBefore(0);
		
		if(compCiList == null || compCiList.isEmpty()) {
			compCiList = new ArrayList<SigitVCompCiDto>();
			tabellaCiList.put("", aggiungiCi(tabellaCi, new SigitVCompCiDto()));		
		}
		
		BigDecimal progressivo = null;
		
		if (compCiList.size()>0) {
			progressivo = compCiList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
		
		Paragraph title = new Paragraph("9.4 CIRCUITI INTERRATI A CONDENSAZIONE / ESPANSIONE DIRETTA", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i < compCiList.size(); i++) {
						
			SigitVCompCiDto compCiImpianto = compCiList.get(i);
			
			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compCiImpianto.getProgressivo()))
			{	
				progressivo = compCiImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaCi = initializeTable(columnWidth);
				tabellaCi.setSpacingBefore(0);
				tabellaSostCi = initializeTable(columnWidth);
				tabellaSostCi.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaCi = aggiungiCi(tabellaCi, compCiImpianto);
				tabellaCiList.put(progressivo.toString(), tabellaCi);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setColspan(4);
				cell.setBackgroundColor(LIGHT_GRAY);
				tabellaSostCi.addCell(cell);
				tabellaSostCi = aggiungiCi(tabellaSostCi, compCiImpianto);
				tabelleCiSostList.put(progressivo.toString(), tabellaSostCi);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaCiList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaCi = entry.getValue();
			tabellaSostCi = tabelleCiSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Circuito", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("CI", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostCi != null) {
				tabellaSostCi.addCell(cell);	
				document.add(tabellaCi);
				document.add(tabellaSostCi);
			}
			else {
				tabellaCi.addCell(cell);
				document.add(tabellaCi);
			}		
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiScheda9_4CircuitiInterrati - END");
	}
	
	private PdfPTable aggiungiCi(PdfPTable tabella, SigitVCompCiDto compCiImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCiImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCiImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Lunghezza circuito");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCiImpianto.getLunghezzaCircM()) + " (m)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Superficie dello scambiatore");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCiImpianto.getSuperfScambM2()) + " (m\u00B2)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Profondit\u00E1 d'installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compCiImpianto.getProfInstallM()) + " (m)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		return aggiungiSezioneTabella(tabella, datiTabella);
	}
	
	private void aggiungiScheda9_5UnitaTrattamentoAria(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda9_5UnitaTrattamentoAria - START");

		List<SigitVCompUtDto> compUtList = datiLibretto.getUtList();

		Map<String, PdfPTable> tabellaUtList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleUtSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};
		
		PdfPTable tabellaUt = initializeTable(columnWidth);
		tabellaUt.setSpacingBefore(0);
		PdfPTable tabellaSostUt = initializeTable(columnWidth);
		tabellaSostUt.setSpacingBefore(0);
		
		if(compUtList == null || compUtList.isEmpty()) {
			compUtList = new ArrayList<SigitVCompUtDto>();
			tabellaUtList.put("", aggiungiUt(tabellaUt, new SigitVCompUtDto()));		
		}
		
		BigDecimal progressivo = null;
		
		if (compUtList.size()>0) {
			progressivo = compUtList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
		
		Paragraph title = new Paragraph("9.5 UNITA' DI TRATTAMENTO ARIA", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i < compUtList.size(); i++) {
						
			SigitVCompUtDto compUtImpianto = compUtList.get(i);
			
			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compUtImpianto.getProgressivo()))
			{	
				progressivo = compUtImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaUt = initializeTable(columnWidth);
				tabellaUt.setSpacingBefore(0);
				tabellaSostUt = initializeTable(columnWidth);
				tabellaSostUt.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaUt = aggiungiUt(tabellaUt, compUtImpianto);
				tabellaUtList.put(progressivo.toString(), tabellaUt);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setColspan(4);
				cell.setBackgroundColor(LIGHT_GRAY);
				tabellaSostUt.addCell(cell);
				tabellaSostUt = aggiungiUt(tabellaSostUt, compUtImpianto);
				tabelleUtSostList.put(progressivo.toString(), tabellaSostUt);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaUtList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaUt = entry.getValue();
			tabellaSostUt = tabelleUtSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Unit\u00E1 T.A.", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("UT", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostUt != null) {
				tabellaSostUt.addCell(cell);	
				document.add(tabellaUt);
				document.add(tabellaSostUt);
			}
			else {
				tabellaUt.addCell(cell);
				document.add(tabellaUt);
			}
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiScheda9_5UnitaTrattamentoAria - END");
	}
	
	private PdfPTable aggiungiUt(PdfPTable tabella, SigitVCompUtDto compUtImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compUtImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compUtImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compUtImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compUtImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Matricola");
		datoTabella.setValore(ConvertUtil.getStringValid(compUtImpianto.getMatricola()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Portata ventilatore di mandata");
		datoTabella.setValore( ConvertUtil.convertToStringOrEmpty(compUtImpianto.getPortataMandataLs()) + " (l/s)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Potenza ventilatore di mandata");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compUtImpianto.getPotenzaMandataKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Portata ventilatore di ripresa");
		datoTabella.setValore( ConvertUtil.convertToStringOrEmpty(compUtImpianto.getPortataRipresaLs()) + " (l/s)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Potenza ventilatore di ripresa");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compUtImpianto.getPotenzaRipresaKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		return aggiungiSezioneTabella(tabella, datiTabella);
	}
	
	private void aggiungiScheda9_6RecuperatoriCalore(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda9_6RecuperatoriCalore - START");

		List<SigitVCompRcDto> compRcList = datiLibretto.getRcList();
		
		Map<String, PdfPTable> tabellaRcList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleRcSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};
		
		PdfPTable tabellaRc = initializeTable(columnWidth);
		tabellaRc.setSpacingBefore(0);
		PdfPTable tabellaSostRc = initializeTable(columnWidth);
		tabellaSostRc.setSpacingBefore(0);
		
		if(compRcList == null || compRcList.isEmpty()) {
			compRcList = new ArrayList<SigitVCompRcDto>();
			tabellaRcList.put("", aggiungiRc(tabellaRc, new SigitVCompRcDto()));		
		}
		
		BigDecimal progressivo = null;
		
		if (compRcList.size()>0) {
			progressivo = compRcList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
		
		Paragraph title = new Paragraph("9.6 RECUPERATORI DI CALORE (aria ambiente)", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i < compRcList.size(); i++) {
						
			SigitVCompRcDto compRcImpianto = compRcList.get(i);

			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compRcImpianto.getProgressivo()))
			{	
				progressivo = compRcImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaRc = initializeTable(columnWidth);
				tabellaRc.setSpacingBefore(0);
				tabellaSostRc = initializeTable(columnWidth);
				tabellaSostRc.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaRc = aggiungiRc(tabellaRc, compRcImpianto);
				tabellaRcList.put(progressivo.toString(), tabellaRc);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setColspan(4);
				cell.setBackgroundColor(LIGHT_GRAY);
				tabellaSostRc.addCell(cell);
				tabellaSostRc = aggiungiRc(tabellaSostRc, compRcImpianto);
				tabelleRcSostList.put(progressivo.toString(), tabellaSostRc);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaRcList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaRc = entry.getValue();
			tabellaSostRc = tabelleRcSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Recuperatore", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("RC", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostRc != null) {
				tabellaSostRc.addCell(cell);	
				document.add(tabellaRc);
				document.add(tabellaSostRc);
			}
			else {
				tabellaRc.addCell(cell);
				document.add(tabellaRc);
			}		
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiScheda9_6RecuperatoriCalore - END");
	}
	
	private PdfPTable aggiungiRc(PdfPTable tabella, SigitVCompRcDto compRcImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compRcImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compRcImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Tipologia");
		datoTabella.setValore(ConvertUtil.getStringValid(compRcImpianto.getTipologia()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		ArrayList<DatoCheckbox> valoriCheckbox = new ArrayList<DatoCheckbox>();
		DatoCheckbox checkbox = new DatoCheckbox();
		checkbox.setLabel("Installato in U.T.A. o V.M.C.");
		checkbox.setValore(ConvertUtil.convertToBooleanAllways(compRcImpianto.getFlgInstallato()));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		valoriCheckbox = new ArrayList<DatoCheckbox>();
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Indipendente");
		checkbox.setValore(ConvertUtil.convertToBooleanAllways(compRcImpianto.getFlgIndipendente()));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Portata ventilatore di mandata");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compRcImpianto.getPortataMandataLs()) + " (l/s)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Potenza ventilatore di mandata");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compRcImpianto.getPotenzaMandataKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Portata ventilatore di ripresa");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compRcImpianto.getPortataRipresaLs()) + " (l/s)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Potenza ventilatore di ripresa");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compRcImpianto.getPotenzaRipresaKw()) + " (kW)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		return aggiungiSezioneTabella(tabella, datiTabella);
	}
	
	private void aggiungiScheda10ImpiantoVentilazione(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda10ImpiantoVentilazione - START");

		List<SigitVCompVmDto> compVmList = datiLibretto.getVmList();
		
		Map<String, PdfPTable> tabellaVmList = new LinkedHashMap<String, PdfPTable>();
		
		Map<String, PdfPTable> tabelleVmSostList = new LinkedHashMap<String, PdfPTable>();
		
		float[] columnWidth = {25,25,25,25};
		
		PdfPTable tabellaVm = initializeTable(columnWidth);
		tabellaVm.setSpacingBefore(0);
		PdfPTable tabellaSostVm = initializeTable(columnWidth);
		tabellaSostVm.setSpacingBefore(0);
		
		if(compVmList == null || compVmList.isEmpty()) {
			compVmList = new ArrayList<SigitVCompVmDto>();
			tabellaVmList.put("", aggiungiVm(tabellaVm, new SigitVCompVmDto()));		
		}
		BigDecimal progressivo = null;
		
		if (compVmList.size()>0) {
			progressivo = compVmList.get(0).getProgressivo();
		}
		
		int numInProgr = 1;
		
		Paragraph title = new Paragraph("10. IMPIANTO DI VENTILAZIONE MECCANICA CONTROLLATA", FONT_HELVETICA_8_B);
		title.setAlignment(Element.ALIGN_CENTER);
		document.add(title);
		
		Paragraph subtitle = new Paragraph("10.1 IMPIANTO DI VENTILAZIONE MECCANICA CONTROLLATA", FONT_HELVETICA_8_B);
		document.add(subtitle);
		
		for (int i=0; i < compVmList.size(); i++) {
						
			SigitVCompVmDto compVmImpianto = compVmList.get(i);
				
			Paragraph paragraph = null;
			PdfPCell cell = null;
		
			if(!progressivo.equals(compVmImpianto.getProgressivo()))
			{	
				progressivo = compVmImpianto.getProgressivo();
				numInProgr = 1;
				
				tabellaVm = initializeTable(columnWidth);
				tabellaVm.setSpacingBefore(0);
				tabellaSostVm = initializeTable(columnWidth);
				tabellaSostVm.setSpacingBefore(0);
			}

			if (numInProgr++ == 1)
			{
				tabellaVm = aggiungiVm(tabellaVm, compVmImpianto);
				tabellaVmList.put(progressivo.toString(), tabellaVm);
			}
			else
			{
				paragraph = new Paragraph("\nSOSTITUZIONE DEL COMPONENTE\n", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setColspan(4);
				cell.setBackgroundColor(LIGHT_GRAY);
				tabellaSostVm.addCell(cell);
				tabellaSostVm = aggiungiVm(tabellaSostVm, compVmImpianto);
				tabelleVmSostList.put(progressivo.toString(), tabellaSostVm);
			}
		}
		
		for (Map.Entry<String, PdfPTable> entry : tabellaVmList.entrySet()) {
			String progessivo = entry.getKey();
			tabellaVm = entry.getValue();
			tabellaSostVm = tabelleVmSostList.get(progessivo);
			
			PdfPTable tabellaHeader = initializeTable(new float[] {20, 80});
			Paragraph paragraph = new Paragraph("Impianto", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("Situazione alla prima installazione o alla ristrutturazione dell'impianto termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.RIGHT);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("VM", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(progessivo),10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			
			document.add(tabellaHeader);
			
			cell = new PdfPCell(new Paragraph());
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(4);
			
			if (tabellaSostVm != null) {
				tabellaSostVm.addCell(cell);	
				document.add(tabellaVm);
				document.add(tabellaSostVm);
			}
			else {
				tabellaVm.addCell(cell);
				document.add(tabellaVm);
			}		
			document.newPage();
		}
		gestDebug(isSimul, "aggiungiScheda10ImpiantoVentilazione - END");
	}
	
	private PdfPTable aggiungiVm(PdfPTable tabella, SigitVCompVmDto compVmImpianto) {
		List<DatoTabella> datiTabella = new ArrayList<DatoTabella>();
		DatoTabella datoTabella = null;
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di installazione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compVmImpianto.getDataInstall()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Data di dismissione");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compVmImpianto.getDataDismiss()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Fabbricante");
		datoTabella.setValore(ConvertUtil.getStringValid(compVmImpianto.getDesMarca()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Modello");
		datoTabella.setValore(ConvertUtil.getStringValid(compVmImpianto.getModello()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Tipologia:");
		datoTabella.setValore("");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		ArrayList<DatoCheckbox> valoriCheckbox = new ArrayList<DatoCheckbox>();
		DatoCheckbox checkbox = new DatoCheckbox();
		checkbox.setLabel("Sola estrazione");
		checkbox.setValore(new BigDecimal("1").equals(compVmImpianto.getFkDettaglioVm()));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		valoriCheckbox = new ArrayList<DatoCheckbox>();
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Flusso doppio con recupero tramite scambiatore a flussi incrociati");
		checkbox.setValore(new BigDecimal("2").equals(compVmImpianto.getFkDettaglioVm()));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		valoriCheckbox = new ArrayList<DatoCheckbox>();
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Flusso doppio con recupero termodinamico");
		checkbox.setValore(new BigDecimal("3").equals(compVmImpianto.getFkDettaglioVm()));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setTipoDato(TipoDato.VUOTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		valoriCheckbox = new ArrayList<DatoCheckbox>();
		checkbox = new DatoCheckbox();
		checkbox.setLabel("Altro   " +  ConvertUtil.getStringValid(compVmImpianto.getAltroTipologia()));
		checkbox.setValore(GenericUtil.isNotNullOrEmpty(compVmImpianto.getAltroTipologia()));
		valoriCheckbox.add(checkbox);
		datoTabella.setValoriCheckbox(valoriCheckbox);
		datoTabella.setTipoDato(TipoDato.CHECKBOX);
		datiTabella.add(datoTabella);
		//END ROW
		
		//START ROW
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Massima portata aria");
		datoTabella.setValore(ConvertUtil.convertToStringOrEmpty(compVmImpianto.getPortataMaxAriaM3h()) + " (m\u00B3/ h)");
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		
		datoTabella = new DatoTabella();
		datoTabella.setLabel("Rendimento di recupero / COP");
		datoTabella.setValore(ConvertUtil.getStringValid(compVmImpianto.getRendimentoCop()));
		datoTabella.setTipoDato(TipoDato.TESTO);
		datiTabella.add(datoTabella);
		//END ROW
		
		return aggiungiSezioneTabella(tabella, datiTabella);
	}

	private void aggiungiScheda11RisultatiPrimaVerifica(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda11RisultatiPrimaVerifica - START");
		
		Paragraph paragraph = new Paragraph("11. RISULTATI DELLA PRIMA VERIFICA EFFETTUATA DALL'INSTALLATORE E DELLE VERIFICHE PERIODICHE SUCCESSIVE EFFETTUATE DAL MANUTENTORE", FONT_HELVETICA_9_B);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);

		//SEZIONE 11.1
		aggiungiScheda11_1DettaglioGruppiTermici(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 11.2
		aggiungiScheda11_2DettaglioMacchineFrigo(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 11.3
		aggiungiScheda11_3DettaglioScambiatoriCalore(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 11.4
		aggiungiScheda11_4DettaglioCogeneratori(document, datiLibretto, isSimul);
		
		gestDebug(isSimul, "aggiungiScheda11RisultatiPrimaVerifica - END");
	}
	
	private void aggiungiScheda11_1DettaglioGruppiTermici(Document document,DatiLibretto datiLibretto,boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda11_1DettaglioGruppiTermici - START");
		
		List<SigitVCompGtDettDto> compGtImpiantoDettList = datiLibretto.getCompGtImpiantoDett();
		
		if(compGtImpiantoDettList == null) {
			compGtImpiantoDettList = new ArrayList<SigitVCompGtDettDto>();
			compGtImpiantoDettList.add(new SigitVCompGtDettDto());		
		}
		
		BigDecimal progressivo = null;
		Date lastDataControllo = null;
		BigDecimal lastIdAllegato = null;
		
		if(compGtImpiantoDettList.size()>0)
			progressivo = compGtImpiantoDettList.get(0).getProgressivo();
		
		List<CompImpiantoDettaglio> compGtTabelleList = new ArrayList<CompImpiantoDettaglio>();
		CompImpiantoDettaglio compImpiantoDettaglio = new CompImpiantoDettaglio();
		
		Paragraph title = new Paragraph("11.1 GRUPPI TERMICI", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i<compGtImpiantoDettList.size();i++) {
			log.debug("i="+i+ ", progressivo: " + progressivo);
			SigitVCompGtDettDto compGtImpiantoDet = compGtImpiantoDettList.get(i);
			java.sql.Date dataControllo = compGtImpiantoDet.getDataControllo();
			BigDecimal idAllegato = compGtImpiantoDet.getFkAllegato();
			
			if(dataControllo==null)
			{
				continue;
			}
			
			if(!progressivo.equals(compGtImpiantoDet.getProgressivo())
				|| (lastDataControllo!=null && lastDataControllo.compareTo(dataControllo)!=0)
				|| (lastIdAllegato != null && lastIdAllegato.compareTo(idAllegato) != 0))
			{
				compGtTabelleList.add(compImpiantoDettaglio);
				compImpiantoDettaglio = new CompImpiantoDettaglio();
				progressivo = compGtImpiantoDet.getProgressivo();
			}
			
			compImpiantoDettaglio.addModulo(addModuloGt(compGtImpiantoDet));
			
			compImpiantoDettaglio.setProgressivo(progressivo);
			
			compImpiantoDettaglio.setAltro(GenericUtil.isNotNullOrEmpty(compGtImpiantoDet.getL111AltroRiferimento()));
			
			compImpiantoDettaglio.setDescAltro(ConvertUtil.getStringValid(compGtImpiantoDet.getL111AltroRiferimento()));

			compImpiantoDettaglio.setNormaUni(ConvertUtil.convertToBooleanAllways(compGtImpiantoDet.getEFlgUni103891()));
			
			compImpiantoDettaglio.setDataControllo(ConvertUtil.convertToStringOrEmpty(dataControllo));
			
			lastDataControllo = dataControllo;
			lastIdAllegato = idAllegato;
		}
		
		compGtTabelleList.add(compImpiantoDettaglio);
		
		for (CompImpiantoDettaglio dettaglioGt : compGtTabelleList) {
			PdfPTable tabellaHeader = initializeTable(new float[] {33, 33, 33});
			PdfPTable tabellaModuloHeader = initializeTable(new float[] {100});
			Paragraph paragraph;
			PdfPCell cell;

			//START HEADER
			
			//START ROW
			paragraph = new Paragraph("Riferimento:", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.TOP | Rectangle.LEFT);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "norma UNI-10389-1", dettaglioGt.isNormaUni());
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.TOP);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "altro", dettaglioGt.isAltro(), 20);
			aggiungiSpazioETesto(paragraph, dettaglioGt.getDescAltro(), 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.TOP | Rectangle.RIGHT);
			tabellaHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Gruppo Termico", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			cell.setColspan(2);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("GT", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.convertToStringOrEmpty(dettaglioGt.getProgressivo()) , 5);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(2);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Data", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, dettaglioGt.getDataControllo() , 40);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			cell.setColspan(3);
			tabellaHeader.addCell(cell);
			//END ROW
			
			//END HEADER
			
			//START MODULO HEADER
			
			//START ROW
			paragraph = new Paragraph("Numero modulo", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Portata termica effettiva (kW)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("VALORI MISURATI", FONT_HELVETICA_8_B);
			cell = initializeModuloCell(paragraph);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Temperatura fumi (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW

			//START ROW
			paragraph = new Paragraph("Temperatura aria comburente (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("O2 (%)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("CO2 (%)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Indice di Bacharach", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("CO nei fumi secchi (ppm v/v)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Portata combustibile (m\u00B3/ h oppure kg/h)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("NOx", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("VALORI CALCOLATI", FONT_HELVETICA_8_B);
			cell = initializeModuloCell(paragraph);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("CO nei fumi secchi e senz'aria (ppm v/v)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Rendimento di combustione ", FONT_HELVETICA_8);
			paragraph.add(SYMBOL_ETA);
			paragraph.add("c (%)");
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("VERIFICATI", FONT_HELVETICA_8_B);
			cell = initializeModuloCell(paragraph);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Rispetta l'indice di Bacharach", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("CO nei fumi secchi e senz'aria <= 1.000 ppm v/v", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			paragraph.add(SYMBOL_ETA);
			paragraph.add(" minimo di legge (%)");
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			paragraph.add(SYMBOL_ETA);
			paragraph.add("c >= ");
			paragraph.add(SYMBOL_ETA);
			paragraph.add(" minimo");

			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("FIRMA", FONT_HELVETICA_8_B);
			paragraph.setAlignment(Element.ALIGN_RIGHT);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			//END MODULO HEADER
			
			renderDettaglioImpianto(document, dettaglioGt, tabellaHeader, tabellaModuloHeader);
		}
			
		gestDebug(isSimul, "aggiungiScheda11_1DettaglioGruppiTermici - END");
	}
	
	private PdfPTable addModuloGt(SigitVCompGtDettDto compGtImpiantoDett) {
		
		PdfPTable modulo = initializeTable(new float[] {100});
		Paragraph paragraph = null;
		PdfPCell cell = null;
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getENModuloTermico()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.TOP | Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getEPotTermFocolKw()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph();
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getETempFumiC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getETempAriaC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		cell.setMinimumHeight(20);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getEO2Perc()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getECo2Perc()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		String valoreMin = ConvertUtil.getStringValid(compGtImpiantoDett.getEBacharachMin());
		String valoreMed = ConvertUtil.getStringValid(compGtImpiantoDett.getEBacharachMed());
		String valoreMax = ConvertUtil.getStringValid(compGtImpiantoDett.getEBacharachMax());
		PdfPTable tabellaValori = aggiungiValoreMultiplo(valoreMin, valoreMed, valoreMax);
		cell = initializeModuloCell(tabellaValori);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getL111CoNoAriaPpm()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		String portataCombustibile = "";
		
		if(compGtImpiantoDett.getL111PortataCombustibile()!=null) {			
			portataCombustibile = ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getL111PortataCombustibile()) + " "+ compGtImpiantoDett.getL111PortataCombustibileUm();
		}
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.getStringValid(portataCombustibile), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		String nox = "";
	
		if (GenericUtil.isNotNullOrEmpty(compGtImpiantoDett.getENoxPpm())) {
			
			nox = ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getENoxPpm()) + " " + Constants.NOX_PPM;
		}
		else if (GenericUtil.isNotNullOrEmpty(compGtImpiantoDett.getENoxMgKwh())) {
			
			nox = ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getENoxMgKwh()) + " " + Constants.NOX_MG_KWH;
		}
	
		
		//START ROW
		paragraph = new Paragraph(nox, FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph();
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getECoCorrettoPpm()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getERendCombPerc()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph();
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		Boolean flgIndiceBacharach = null;
		if(compGtImpiantoDett.getL111FlgRispettaBacharach() != null)
		{
			flgIndiceBacharach = ConvertUtil.convertToBooleanAllways(compGtImpiantoDett.getL111FlgRispettaBacharach());
		}
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "SI", flgIndiceBacharach != null && flgIndiceBacharach, 20);
		aggiungiCheckPrima(paragraph, "NO", flgIndiceBacharach != null && !flgIndiceBacharach);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		Boolean flgCOFumiSecchi = null;
		if(compGtImpiantoDett.getL111FlgCoMin1000() != null)
		{
			flgCOFumiSecchi = ConvertUtil.convertToBooleanAllways(compGtImpiantoDett.getL111FlgCoMin1000());
		}
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "SI", flgCOFumiSecchi != null && flgCOFumiSecchi, 20);
		aggiungiCheckPrima(paragraph, "NO", flgCOFumiSecchi != null && !flgCOFumiSecchi);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW

		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGtImpiantoDett.getERendMinLeggePerc()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		

		Boolean flgRendMagRendMin = null;
		if(compGtImpiantoDett.getL111FlgRendMagRendMin() != null)
		{
			flgRendMagRendMin = ConvertUtil.convertToBooleanAllways(compGtImpiantoDett.getL111FlgRendMagRendMin());
		}
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "SI", flgRendMagRendMin != null && flgRendMagRendMin,20);
		aggiungiCheckPrima(paragraph, "NO", flgRendMagRendMin != null && !flgRendMagRendMin);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(GenericUtil.getStringValid(getFirmaModulo(compGtImpiantoDett.getNumeroRea(), compGtImpiantoDett.getFkRuolo(), compGtImpiantoDett.getSiglaRea())), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(3);
		modulo.addCell(cell);
		//END ROW
						
		return modulo;
	}

	private void aggiungiScheda11_2DettaglioMacchineFrigo(Document document,DatiLibretto datiLibretto,boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda11_2DettaglioMacchineFrigo - START");
		
		List<SigitVCompGfDettDto> compGfImpiantoDettList = datiLibretto.getCompGfImpiantoDett();
		
		if(compGfImpiantoDettList == null) {
			compGfImpiantoDettList = new ArrayList<SigitVCompGfDettDto>();
			compGfImpiantoDettList.add(new SigitVCompGfDettDto());	
		}
		
		BigDecimal progressivo = null;
		Date lastDataControllo = null;
		BigDecimal lastIdAllegato = null;
		
		if(compGfImpiantoDettList.size()>0)
			progressivo = compGfImpiantoDettList.get(0).getProgressivo();
		
		List<CompImpiantoDettaglio> compGfTabelleList = new ArrayList<CompImpiantoDettaglio>();
		CompImpiantoDettaglio compImpiantoDettaglio = new CompImpiantoDettaglio();
		
		Paragraph title = new Paragraph("11.2 MACCHINE FRIGO / POMPE DI CALORE", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i<compGfImpiantoDettList.size();i++) {
			log.debug("i="+i+ ", progressivo: " + progressivo);
			SigitVCompGfDettDto compGfImpiantoDett = compGfImpiantoDettList.get(i);
			java.sql.Date dataControllo = compGfImpiantoDett.getDataControllo();
			BigDecimal idAllegato = compGfImpiantoDett.getFkAllegato();
			
			if(dataControllo==null)
			{
				continue;
			}
			
			if(!progressivo.equals(compGfImpiantoDett.getProgressivo())
				|| (lastDataControllo!=null && lastDataControllo.compareTo(dataControllo)!=0)
				|| (lastIdAllegato != null && lastIdAllegato.compareTo(idAllegato) != 0))
			{
				compGfTabelleList.add(compImpiantoDettaglio);
				compImpiantoDettaglio = new CompImpiantoDettaglio();
				progressivo = compGfImpiantoDett.getProgressivo();
			}
			
			compImpiantoDettaglio.addModulo(addModuloGf(compGfImpiantoDett));
			
			compImpiantoDettaglio.setProgressivo(progressivo);
			
			compImpiantoDettaglio.setDataControllo(ConvertUtil.convertToStringOrEmpty(dataControllo));
			
			lastDataControllo = dataControllo;
			lastIdAllegato = idAllegato;
		}
		
		compGfTabelleList.add(compImpiantoDettaglio);
		
		for (CompImpiantoDettaglio dettaglioGf : compGfTabelleList) {
			PdfPTable tabellaHeader = initializeTable(new float[] {33, 33, 33});
			PdfPTable tabellaModuloHeader = initializeTable(new float[] {100});
			Paragraph paragraph;
			PdfPCell cell;

			//START HEADER
			
			//START ROW
			paragraph = new Paragraph("Gruppo frigo / Pompa di calore", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			cell.setColspan(2);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("GF", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.convertToStringOrEmpty(dettaglioGf.getProgressivo()) , 5);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(2);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Data", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, dettaglioGf.getDataControllo() , 20);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			cell.setColspan(3);
			tabellaHeader.addCell(cell);
			//END ROW
			
			//END HEADER
			
			//START MODULO HEADER
			
			//START ROW
			paragraph = new Paragraph("Numero circuito", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Assenza perdite refrigerante", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Modalita' di funzionamento", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Surriscaldamento (K)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW

			//START ROW
			paragraph = new Paragraph("Sottoraffreddamento (K)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("T condensazione (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("T evaporazione (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("T sorgente ingresso lato esterno (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("T sorgente uscita lato esterno (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("T ingresso fluido utenze (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("T uscita fluido utenze (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Se usata Torre di raffreddamento o raffreddatore a fluido", FONT_HELVETICA_7_B);
			cell = initializeModuloCell(paragraph);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("T uscita fluido (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("T bulbo umido aria (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Se usato Scambiatore di calore intermedio", FONT_HELVETICA_8_B);
			cell = initializeModuloCell(paragraph);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("T ingresso fluido sorgente esterna (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("T uscita fluido sorgente esterna (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("T ingresso fluido alla macchina (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("T uscita fluido dalla macchina (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph();
			cell = initializeModuloCell(paragraph);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaModuloHeader.addCell(cell);
			//END ROW

			//START ROW
			paragraph = new Paragraph("Potenza assorbita (kW)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW

			//START ROW
			paragraph = new Paragraph("Filtri puliti", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Verifica superata", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW

			//START ROW
			paragraph = new Paragraph("Se ", FONT_HELVETICA_7);
			paragraph.add(new Chunk("NO", FONT_HELVETICA_7_B));
			paragraph.add(new Chunk(", l'efficienza dell'impianto va ripristinata entro la data del ", FONT_HELVETICA_7));
			cell = initializeModuloCell(paragraph);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("FIRMA", FONT_HELVETICA_8_B);
			paragraph.setAlignment(Element.ALIGN_RIGHT);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			//END MODULO HEADER
			
			renderDettaglioImpianto(document, dettaglioGf, tabellaHeader, tabellaModuloHeader);
		}
			
		gestDebug(isSimul, "aggiungiScheda11_2DettaglioMacchineFrigo - END");
	}
	
	private PdfPTable addModuloGf(SigitVCompGfDettDto compGfImpiantoDett) {
		
		PdfPTable modulo = initializeTable(new float[] {100});
		Paragraph paragraph = null;
		PdfPCell cell = null;
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.getStringValid(compGfImpiantoDett.getENCircuito()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.TOP | Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
				
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "SI", new BigDecimal(Constants.SI_1).equals(compGfImpiantoDett.getEFlgPerditaGas()), 20);
		aggiungiCheckPrima(paragraph, "NO", new BigDecimal(Constants.NO_0).equals(compGfImpiantoDett.getEFlgPerditaGas()));
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Raff", Constants.FLG_RAFFREDDAMENTO.equals(compGfImpiantoDett.getEFlgModProva()), 19);
		aggiungiCheckPrima(paragraph, "Risc", Constants.FLG_RISCALDAMENTO.equals(compGfImpiantoDett.getEFlgModProva()));
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getETSurriscC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getETSottorafC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getETCondensazioneC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		cell.setMinimumHeight(20);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getETEvaporazioneC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getETInExtC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getETOutExtC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getETInUtenzeC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getETOutUtenzeC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph();
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getL112TorreTOutFluido()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getL112TorreTBulboUmido()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph();
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getL112ScambiatoreTInExt()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getL112ScambiatoreTOutExt()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getL112ScambiatTInMacchina()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getL112ScambiatTOutMacchina()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph();
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getL112PotenzaAssorbitaKw()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		Boolean flgPuliziaFiltri = null;
		if(compGfImpiantoDett.getL112FlgPuliziaFiltri()!=null)
		{
			flgPuliziaFiltri = ConvertUtil.convertToBooleanAllways(compGfImpiantoDett.getL112FlgPuliziaFiltri());
		}
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "SI", flgPuliziaFiltri != null && flgPuliziaFiltri, 20);
		aggiungiCheckPrima(paragraph, "NO", flgPuliziaFiltri != null && !flgPuliziaFiltri);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		Boolean flgVerificaSuperata = null;
		if(compGfImpiantoDett.getL112FlgVerificaSuperata()!=null)
		{
			flgVerificaSuperata = ConvertUtil.convertToBooleanAllways(compGfImpiantoDett.getL112FlgVerificaSuperata());
		}
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "SI", flgVerificaSuperata != null && flgVerificaSuperata, 20);
		aggiungiCheckPrima(paragraph, "NO", flgVerificaSuperata != null && !flgVerificaSuperata);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compGfImpiantoDett.getL112DataRipristino()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(GenericUtil.getStringValid(getFirmaModulo(compGfImpiantoDett.getNumeroRea(), compGfImpiantoDett.getFkRuolo(), compGfImpiantoDett.getSiglaRea())), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
						
		return modulo;
	}
	
	private void aggiungiScheda11_3DettaglioScambiatoriCalore(Document document,DatiLibretto datiLibretto,boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda11_3DettaglioScambiatoriCalore - START");
		
		List<SigitVCompScDettDto> compScImpiantoDettList = datiLibretto.getCompScImpiantoDett();
		
		if(compScImpiantoDettList == null) {
			compScImpiantoDettList = new ArrayList<SigitVCompScDettDto>();
			compScImpiantoDettList.add(new SigitVCompScDettDto());		
		}
		
		BigDecimal progressivo = null;
		Date lastDataControllo = null;
		BigDecimal lastIdAllegato = null;
		
		if(compScImpiantoDettList.size()>0)
			progressivo = compScImpiantoDettList.get(0).getProgressivo();
		
		List<CompImpiantoDettaglio> compScTabelleList = new ArrayList<CompImpiantoDettaglio>();
		CompImpiantoDettaglio compImpiantoDettaglio = new CompImpiantoDettaglio();
		
		Paragraph title = new Paragraph("11.3 SCAMBIATORI DI CALORE DELLA SOTTOSTAZIONE DI TELERISCALDAMENTO / TELEFAFFRESCAMENTO", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i<compScImpiantoDettList.size();i++) {
			log.debug("i="+i+ ", progressivo: " + progressivo);
			SigitVCompScDettDto compScImpiantoDett = compScImpiantoDettList.get(i);
			java.sql.Date dataControllo = compScImpiantoDett.getDataControllo();
			BigDecimal idAllegato = compScImpiantoDett.getFkAllegato();
			
			if(dataControllo==null)
			{
				continue;
			}
			
			if(!progressivo.equals(compScImpiantoDett.getProgressivo())
				|| (lastDataControllo!=null && lastDataControllo.compareTo(dataControllo)!=0)
				|| (lastIdAllegato != null && lastIdAllegato.compareTo(idAllegato) != 0))
			{
				compScTabelleList.add(compImpiantoDettaglio);
				compImpiantoDettaglio = new CompImpiantoDettaglio();
				progressivo = compScImpiantoDett.getProgressivo();
			}
			
			compImpiantoDettaglio.addModulo(addModuloSc(compScImpiantoDett));
			
			compImpiantoDettaglio.setProgressivo(progressivo);
			
			compImpiantoDettaglio.setDataControllo(ConvertUtil.convertToStringOrEmpty(dataControllo));
			
			lastDataControllo = dataControllo;
			lastIdAllegato = idAllegato;
		}
		
		compScTabelleList.add(compImpiantoDettaglio);
		
		for (CompImpiantoDettaglio dettaglioSc : compScTabelleList) {
			PdfPTable tabellaHeader = initializeTable(new float[] {33, 33, 33});
			PdfPTable tabellaModuloHeader = initializeTable(new float[] {100});
			Paragraph paragraph;
			PdfPCell cell;

			//START HEADER
			
			//START ROW
			paragraph = new Paragraph("Scambiatore", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			cell.setColspan(2);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("SC", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.convertToStringOrEmpty(dettaglioSc.getProgressivo()) , 5);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(2);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			//END ROW
			
			//END HEADER
			
			//START MODULO HEADER
			
			//START ROW
			paragraph = new Paragraph("Data", FONT_HELVETICA_8_B);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("VALORI MISURATI", FONT_HELVETICA_8_B);
			cell = initializeModuloCell(paragraph);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Temperatura esterna (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Temperatura mandata primario (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Temperatura ritorno primario (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW

			//START ROW
			paragraph = new Paragraph("Temperatura mandata secondario (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Temperatura ritorno secondario (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Portata fluido primario (m\u00B3/ h)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Potenza termica nominale totale (kW)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("ALTRE VERIFICHE EFFETTUATE", FONT_HELVETICA_8_B);
			cell = initializeModuloCell(paragraph);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Potenza compatibile con i dati di progetto", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Stato dellle coibentazioni idoneo", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Dispositivi di regolazione e controllo (assenza di trafilamenti sulla valvola di regolazione)", FONT_HELVETICA_7);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("FIRMA", FONT_HELVETICA_8_B);
			paragraph.setAlignment(Element.ALIGN_RIGHT);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			//END MODULO HEADER
			
			renderDettaglioImpianto(document, dettaglioSc, tabellaHeader, tabellaModuloHeader);
		}
			
		gestDebug(isSimul, "aggiungiScheda11_3DettaglioScambiatoriCalore - END");
	}
	
	private PdfPTable addModuloSc(SigitVCompScDettDto compScImpiantoDett) {
		
		PdfPTable modulo = initializeTable(new float[] {100});
		Paragraph paragraph = null;
		PdfPCell cell = null;
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compScImpiantoDett.getDataControllo()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.TOP | Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph();
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compScImpiantoDett.getETempExtC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
				
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compScImpiantoDett.getETempMandPrimarioC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compScImpiantoDett.getETempRitorPrimarioC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compScImpiantoDett.getETempMandSecondarioC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compScImpiantoDett.getETempRitSecondarioC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compScImpiantoDett.getEPortFluidoM3H()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		cell.setMinimumHeight(20);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compScImpiantoDett.getEPotenzaTermKw()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph();
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "SI", new BigDecimal(Constants.SI_1).equals(compScImpiantoDett.getEFlgPotenzaCompatibile()), 10);
		aggiungiCheckPrima(paragraph, "NO", new BigDecimal(Constants.NO_0).equals(compScImpiantoDett.getEFlgPotenzaCompatibile()), 10);
		aggiungiCheckPrima(paragraph, "NC", new BigDecimal("2").equals(compScImpiantoDett.getEFlgPotenzaCompatibile()));
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "SI", new BigDecimal(Constants.SI_1).equals(compScImpiantoDett.getEFlgCoibIdonea()), 10);
		aggiungiCheckPrima(paragraph, "NO", new BigDecimal(Constants.NO_0).equals(compScImpiantoDett.getEFlgCoibIdonea()), 10);
		aggiungiCheckPrima(paragraph, "NC", new BigDecimal("2").equals(compScImpiantoDett.getEFlgCoibIdonea()));
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "SI", new BigDecimal(Constants.SI_1).equals(compScImpiantoDett.getEFlgDispFunzionanti()), 10);
		aggiungiCheckPrima(paragraph, "NO", new BigDecimal(Constants.NO_0).equals(compScImpiantoDett.getEFlgDispFunzionanti()), 10);
		aggiungiCheckPrima(paragraph, "NC", new BigDecimal("2").equals(compScImpiantoDett.getEFlgDispFunzionanti()));
		cell = initializeModuloCell(paragraph);
		cell.setMinimumHeight(25);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(GenericUtil.getStringValid(getFirmaModulo(compScImpiantoDett.getNumeroRea(), compScImpiantoDett.getFkRuolo(), compScImpiantoDett.getSiglaRea())), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
						
		return modulo;
	}
	
	private void aggiungiScheda11_4DettaglioCogeneratori(Document document,DatiLibretto datiLibretto,boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda11_4DettaglioCogeneratori - START");
		
		List<SigitVCompCgDettDto> compCgImpiantoDettList = datiLibretto.getCompCgImpiantoDett();
		
		if(compCgImpiantoDettList == null) {
			compCgImpiantoDettList = new ArrayList<SigitVCompCgDettDto>();
			compCgImpiantoDettList.add(new SigitVCompCgDettDto());			
		}
		
		BigDecimal progressivo = null;
		Date lastDataControllo = null;
		BigDecimal lastIdAllegato = null;
		
		if(compCgImpiantoDettList.size()>0)
			progressivo = compCgImpiantoDettList.get(0).getProgressivo();
		
		List<CompImpiantoDettaglio> compCgTabelleList = new ArrayList<CompImpiantoDettaglio>();
		CompImpiantoDettaglio compImpiantoDettaglio = new CompImpiantoDettaglio();
		
		Paragraph title = new Paragraph("11.4 COGENERATORI / TRIGENERATORI", FONT_HELVETICA_8_B);
		document.add(title);
		
		for (int i=0; i<compCgImpiantoDettList.size();i++) {
			log.debug("i="+i+ ", progressivo: " + progressivo);
			SigitVCompCgDettDto compCgImpiantoDett = compCgImpiantoDettList.get(i);
			java.sql.Date dataControllo = compCgImpiantoDett.getDataControllo();
			BigDecimal idAllegato = compCgImpiantoDett.getFkAllegato();
			
			if(dataControllo==null)
			{
				continue;
			}
			
			if(!progressivo.equals(compCgImpiantoDett.getProgressivo())
				|| (lastDataControllo!=null && lastDataControllo.compareTo(dataControllo)!=0)
				|| (lastIdAllegato != null && lastIdAllegato.compareTo(idAllegato) != 0))
			{
				compCgTabelleList.add(compImpiantoDettaglio);
				compImpiantoDettaglio = new CompImpiantoDettaglio();
				progressivo = compCgImpiantoDett.getProgressivo();
			}
			
			compImpiantoDettaglio.addModulo(addModuloCg(compCgImpiantoDett));
			
			compImpiantoDettaglio.setProgressivo(progressivo);
			
			compImpiantoDettaglio.setDataControllo(ConvertUtil.convertToStringOrEmpty(dataControllo));		
			
			lastDataControllo = dataControllo;
			lastIdAllegato = idAllegato;
		}
		
		compCgTabelleList.add(compImpiantoDettaglio);
		
		for (CompImpiantoDettaglio dettaglioCg : compCgTabelleList) {
			PdfPTable tabellaHeader = initializeTable(new float[] {33, 33, 33});
			PdfPTable tabellaModuloHeader = initializeTable(new float[] {100});
			Paragraph paragraph;
			PdfPCell cell;

			//START HEADER
			
			//START ROW
			paragraph = new Paragraph("Cogeneratore / Trigeneratore", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			cell.setColspan(2);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("CG", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.convertToStringOrEmpty(dettaglioCg.getProgressivo()) , 5);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			tabellaHeader.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setColspan(2);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaHeader.addCell(cell);
			//END ROW
			
			//END HEADER
			
			//START MODULO HEADER
			
			//START ROW
			paragraph = new Paragraph("Data", FONT_HELVETICA_8_B);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Temperatura aria comburente (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Temperatura acqua in uscita (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Temperatura acqua in ingresso (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Temperatura acqua motore [solo m.c.i.] (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW

			//START ROW
			paragraph = new Paragraph("Temperatura fumi a valle dello scambiatore fumi (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Temperatura fumi a monte dello scambiatore fumi (\u00B0C)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Potenza elettrica ai morsetti (kW)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Emissioni di monossido di carbonio CO (mg/Nm\u00B3 riportati al 5% di O2 nei fumi)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Protezione di interfaccia con la rete elettrica, verifica per ciascuna fase. L1/L2/L3", FONT_HELVETICA_7_B);
			cell = initializeModuloCell(paragraph);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Sovrafrequenza: soglia di intervento (Hz)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Sovrafrequenza: tempo di intervento (s)", FONT_HELVETICA_8);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Sottofrequenza: soglia di intervento (Hz)", FONT_HELVETICA_7);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Sottofrequenza: tempo di intervento (s)", FONT_HELVETICA_7);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Sovratensione: soglia di intervento (V)", FONT_HELVETICA_7);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Sovratensione: tempo di intervento (s)", FONT_HELVETICA_7);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Sottotensione: soglia di intervento (V)", FONT_HELVETICA_7);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Sottotensione: tempo di intervento (s)", FONT_HELVETICA_7);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("FIRMA", FONT_HELVETICA_8_B);
			paragraph.setAlignment(Element.ALIGN_RIGHT);
			cell = initializeModuloCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaModuloHeader.addCell(cell);
			//END ROW
			//END MODULO HEADER
			
			renderDettaglioImpianto(document, dettaglioCg, tabellaHeader, tabellaModuloHeader);
		}
			
		gestDebug(isSimul, "aggiungiScheda11_4DettaglioCogeneratori - END");
	}
	
	private PdfPTable addModuloCg(SigitVCompCgDettDto compCgImpiantoDett) {
		
		PdfPTable modulo = initializeTable(new float[] {100});
		Paragraph paragraph = null;
		PdfPCell cell = null;
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getDataControllo()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.TOP | Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getETempAriaC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
				
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getETempH2oOutC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getETempH2oInC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getETempH2oMotoreC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getETempFumiValleC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getETempFumiMonteC()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		cell.setMinimumHeight(20);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getEPotenzaMorsettiKw()), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		String emissioniCO = "";
		if (GenericUtil.isNotNullOrEmpty(compCgImpiantoDett.getCoMin())) {
			emissioniCO =  ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getCoMin()) + "/" + ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getCoMax());
		}
		
		//START ROW
		paragraph = new Paragraph(ConvertUtil.getStringValid(emissioniCO), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setMinimumHeight(30);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph();
		cell = initializeModuloCell(paragraph);
		cell.setMinimumHeight(30);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW

		//START ROW
		String valoreMin = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SovrafreqSogliaHzMin());
		String valoreMed = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SovrafreqSogliaHzMed());
		String valoreMax = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SovrafreqSogliaHzMax());
		
		PdfPTable tabella = aggiungiValoreMultiplo(valoreMin, valoreMed, valoreMax);
		cell = initializeModuloCell(tabella);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		valoreMin = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SovrafreqTempoSMin());
		valoreMed = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SovrafreqTempoSMed());
		valoreMax = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SovrafreqTempoSMax());
		
		tabella = aggiungiValoreMultiplo(valoreMin, valoreMed, valoreMax);
		cell = initializeModuloCell(tabella);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
				
		//START ROW
		valoreMin = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottofreqSogliaHzMin());
		valoreMed = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottofreqSogliaHzMed());
		valoreMax = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottofreqSogliaHzMax());
		
		tabella = aggiungiValoreMultiplo(valoreMin, valoreMed, valoreMax);
		cell = initializeModuloCell(tabella);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
				
		//START ROW
		valoreMin = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottofreqTempoSMin());
		valoreMed = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottofreqTempoSMed());
		valoreMax = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottofreqTempoSMax());
		
		tabella = aggiungiValoreMultiplo(valoreMin, valoreMed, valoreMax);
		cell = initializeModuloCell(tabella);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
				
		//START ROW
		valoreMin = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SovratensSogliaVMin());
		valoreMed = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SovratensSogliaVMed());
		valoreMax = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SovratensSogliaVMax());
		
		tabella = aggiungiValoreMultiplo(valoreMin, valoreMed, valoreMax);
		cell = initializeModuloCell(tabella);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
				
		//START ROW
		valoreMin = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SovratensTempoSMin());
		valoreMed = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SovratensTempoSMed());
		valoreMax = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SovratensTempoSMax());
		
		tabella = aggiungiValoreMultiplo(valoreMin, valoreMed, valoreMax);
		cell = initializeModuloCell(tabella);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		valoreMin = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottotensSogliaVMin());
		valoreMed = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottotensSogliaVMed());
		valoreMax = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottotensSogliaVMax());
		
		tabella = aggiungiValoreMultiplo(valoreMin, valoreMed, valoreMax);
		cell = initializeModuloCell(tabella);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
				
		//START ROW
		valoreMin = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottotensTempoSMin());
		valoreMed = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottotensTempoSMed());
		valoreMax = ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottotensTempoSMax());
		
		tabella = aggiungiValoreMultiplo(valoreMin, valoreMed, valoreMax);
		cell = initializeModuloCell(tabella);
		paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(compCgImpiantoDett.getL114SottotensTempoSMin()), FONT_HELVETICA_8);
		cell.setBorder(Rectangle.RIGHT | Rectangle.LEFT);
		modulo.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(GenericUtil.getStringValid(getFirmaModulo(compCgImpiantoDett.getNumeroRea(), compCgImpiantoDett.getFkRuolo(), compCgImpiantoDett.getSiglaRea())), FONT_HELVETICA_8);
		cell = initializeModuloCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		modulo.addCell(cell);
		//END ROW
						
		return modulo;
	}
	
	private void renderDettaglioImpianto(Document document, CompImpiantoDettaglio dettaglio,PdfPTable tabellaHeader, PdfPTable tabellaModuloHeader) throws DocumentException {
		List<PdfPTable> moduli = dettaglio.getModuli();

		PdfPTable tabellaBody = initializeTable(new float[] {20, 20, 20, 20, 20});
		tabellaBody.setSpacingBefore(0);
		
		PdfPCell cell = null;
		
		int i = 0;
		
		cell = new PdfPCell(tabellaModuloHeader);
		cell.setBorder(Rectangle.BOTTOM);
		tabellaBody.addCell(cell);
		
		for (i = 0; i < moduli.size(); i++) {
			if (i != 0 && i % 4 == 0) {
				cell = new PdfPCell(tabellaModuloHeader);
				cell.setBorder(Rectangle.BOTTOM);
				tabellaBody.addCell(cell);
			}
			
			PdfPTable modulo = moduli.get(i);
			cell = new PdfPCell(modulo);
			cell.setBorder(Rectangle.BOTTOM);
			tabellaBody.addCell(cell);
			
			// viene aggiunta una nuova pagina se i moduli sono 4 e hanno completato la tabella
			if ( i % 4 == 3) {
				document.add(tabellaHeader);
				document.add(tabellaBody);
				
				document.newPage();
				
				tabellaBody = initializeTable(new float[] {20, 20, 20, 20, 20});
				tabellaBody.setSpacingBefore(0);
			}
		}
		
		
		
		// viene aggiunta una colonna per completare la tabella nel caso non lo fosse già
		if (i == 0 || i % 4 != 0) {
			int colspan = 1;
			if (i == 0) {
				colspan = 4;
			}
			else {
				colspan = 5 - (i % 4);
			}
			
			cell = new PdfPCell();
			cell.setColspan(colspan);
			tabellaBody.addCell(cell);
			
			document.add(tabellaHeader);
			document.add(tabellaBody);
			
			document.newPage();
		}
	}
	
	private void aggiungiScheda12InterventiControllo(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda12InterventiControllo - START");
		
		List <SigitVRicercaAllegatiDto> controlli = datiLibretto.getListControlliEfficenza();
		
		if (controlli == null || controlli.isEmpty()) {			
			controlli = new ArrayList<SigitVRicercaAllegatiDto>();
			controlli.add(new SigitVRicercaAllegatiDto());
		}
		
		Paragraph paragraph = new Paragraph("12. INTERVENTI DI CONTROLLO EFFICIENZA ENERGETICA", FONT_HELVETICA_9_B);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		
		document.add(paragraph);
		
		paragraph = new Paragraph("Allegare al presente libretto i relativi rapporti di intervento", FONT_HELVETICA_8);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		
		document.add(paragraph);
		
		float[] columnWidth = new float[] {(float) 6.33, (float) 6.33, (float) 12.33, (float) 12.33,(float) 6.33, (float) 6.33, (float) 12.33, (float) 12.33,(float) 6.33, (float) 6.33, (float) 6.33, (float) 6.33};
		
		PdfPTable tabellaControlli = initializeTable(columnWidth);
		
		int topHeaderBorder = Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP;
		int bottomHeaderBorder = Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM;
		
		//HEADER TABELLA START
		//START ROW
		paragraph = new Paragraph("Data controllo", FONT_HELVETICA_8);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBorder(topHeaderBorder);
		cell.setColspan(2);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaControlli.addCell(cell);
		
		paragraph = new Paragraph("Ragione sociale manutentore", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(topHeaderBorder);
		cell.setColspan(2);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaControlli.addCell(cell);
		
		paragraph = new Paragraph("CCIAA", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(topHeaderBorder);
		cell.setColspan(2);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaControlli.addCell(cell);
		
		paragraph = new Paragraph("Tipo allegato", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(topHeaderBorder);
		cell.setColspan(2);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaControlli.addCell(cell);
		
		paragraph = new Paragraph("Raccomandazioni", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(topHeaderBorder);
		cell.setColspan(2);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaControlli.addCell(cell);
		
		paragraph = new Paragraph("Prescrizioni", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(topHeaderBorder);
		cell.setColspan(2);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaControlli.addCell(cell);
		//END ROW
		
		//START ROW
		tabellaControlli = addEmptyCell(tabellaControlli, 2, bottomHeaderBorder, LIGHT_GRAY);
		tabellaControlli = addEmptyCell(tabellaControlli, 2, bottomHeaderBorder, LIGHT_GRAY);
		tabellaControlli = addEmptyCell(tabellaControlli, 2, bottomHeaderBorder, LIGHT_GRAY);
		tabellaControlli = addEmptyCell(tabellaControlli, 2, bottomHeaderBorder, LIGHT_GRAY);
		
		paragraph = new Paragraph("SI", FONT_HELVETICA_8);
		paragraph.setAlignment(Element.ALIGN_LEFT);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.BOTTOM | Rectangle.LEFT);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaControlli.addCell(cell);
		
		paragraph = new Paragraph("NO", FONT_HELVETICA_8);
		paragraph.setAlignment(Element.ALIGN_RIGHT);
		cell = new PdfPCell(paragraph);
		cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
		cell.setBorder(Rectangle.BOTTOM | Rectangle.RIGHT);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaControlli.addCell(cell);
		
		paragraph = new Paragraph("SI", FONT_HELVETICA_8);
		paragraph.setAlignment(Element.ALIGN_LEFT);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.BOTTOM | Rectangle.LEFT);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaControlli.addCell(cell);
		
		paragraph = new Paragraph("NO", FONT_HELVETICA_8);
		paragraph.setAlignment(Element.ALIGN_RIGHT);
		cell = new PdfPCell(paragraph);
		cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
		cell.setBorder(Rectangle.BOTTOM | Rectangle.RIGHT);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaControlli.addCell(cell);
		
		//END ROW
		//HEADER TABELLA END
		
		for (SigitVRicercaAllegatiDto controllo : controlli) {
			
			BigDecimal idAllegato = controllo.getIdAllegato();
			
			int border = Rectangle.RIGHT | Rectangle.LEFT;
			int borderLeft = Rectangle.LEFT;
			int borderRight = Rectangle.RIGHT;
			
			if (controlli.indexOf(controllo) == controlli.size() - 1) {
				border |= Rectangle.BOTTOM;
				borderLeft |= Rectangle.BOTTOM;
				borderRight |= Rectangle.BOTTOM;
			}
			
			String ragioneSociale = "";
			String cciaa = "";
			
			if (controllo.getRuoloFunz() != null && controllo.getRuoloFunz().equalsIgnoreCase(Constants.RUOLO_ISPETTORE))
			{
				cciaa = Constants.DESC_ISPEZIONE;
				ragioneSociale = Constants.DESC_PG_RUOLO_ISPETTORE;
			}
			else
			{
				cciaa = MapDto.getCodiceRea(controllo.getPgSiglaRea(), ConvertUtil.convertToInteger(controllo.getPgNumeroRea()));
				ragioneSociale = controllo.getPgDenominazione();
			}
			
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(controllo.getDataControllo()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(border);
			cell.setColspan(2);
			tabellaControlli.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.getStringValid(ragioneSociale), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(border);
			cell.setColspan(2);
			tabellaControlli.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.getStringValid(cciaa), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(border);
			cell.setColspan(2);
			tabellaControlli.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.getStringValid(controllo.getDesTipoDocumento()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(border);
			cell.setColspan(2);
			tabellaControlli.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "", GenericUtil.isNotNullOrEmpty(controllo.getFRaccomandazioni()));
			paragraph.setAlignment(Element.ALIGN_LEFT);
			cell = new PdfPCell(paragraph);
			cell.setBorder(borderLeft);
			tabellaControlli.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "", idAllegato != null && GenericUtil.isNullOrEmpty(controllo.getFRaccomandazioni()));
			paragraph.setAlignment(Element.ALIGN_CENTER);
			cell = new PdfPCell(paragraph);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			cell.setBorder(borderRight);
			tabellaControlli.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "", GenericUtil.isNotNullOrEmpty(controllo.getFPrescrizioni()));
			paragraph.setAlignment(Element.ALIGN_LEFT);
			cell = new PdfPCell(paragraph);
			cell.setBorder(borderLeft);
			tabellaControlli.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "", idAllegato != null && GenericUtil.isNullOrEmpty(controllo.getFPrescrizioni()));
			paragraph.setAlignment(Element.ALIGN_CENTER);
			cell = new PdfPCell(paragraph);
			cell.setBorder(borderRight);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
			tabellaControlli.addCell(cell);
		}
		
		document.add(tabellaControlli);
		
		gestDebug(isSimul, "aggiungiScheda12InterventiControllo - END");
	}

	private void aggiungiScheda13RisultatiIspezioni(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda13RisultatiIspezioni - START");
		
		List<DettaglioIspezione> dettaglioIspezioneList = datiLibretto.getDettaglioIspezioneList();
		
		if (dettaglioIspezioneList == null ||dettaglioIspezioneList.isEmpty()) {
			dettaglioIspezioneList = new ArrayList<DettaglioIspezione>();
			DettaglioIspezione dettaglioIspezione = new DettaglioIspezione();
			dettaglioIspezione.setElencoIdAllegati("");
			dettaglioIspezione.setIspezioneDb(new SigitVRicercaIspezioniConsByCodiceImpiantoDto());
			dettaglioIspezione.setIspezIspet(new SigitVRicercaIspezioniDto());
			dettaglioIspezioneList.add(dettaglioIspezione);
		}
		
		Paragraph paragraph = new Paragraph("13. RISULTATI DELLE ISPEZIONI PERIODICHE EFFETTUATE A CURA DELL'ENTE COMPETENTE", FONT_HELVETICA_9_B);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);
		
		float[] columnWidth = new float[] {33, 33, 33};
		
		for (DettaglioIspezione dettaglioIspezione : dettaglioIspezioneList) {
			
			PdfPTable tabella = initializeTable(columnWidth); 
			PdfPCell cell;
			
			SigitVRicercaIspezioniConsByCodiceImpiantoDto ispezioneDb = dettaglioIspezione.getIspezioneDb();
			SigitVRicercaIspezioniDto ispezioneIspet = dettaglioIspezione.getIspezIspet();
			String elencoAllegati = dettaglioIspezione.getElencoIdAllegati();
			
			//START ROW
			paragraph = new Paragraph("Ispezione eseguita il ", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.convertToStringOrEmpty(ispezioneDb.getDtCreazione()), 10);
			aggiungiSpazioETesto(paragraph, "da:", 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
			cell.setColspan(3);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Cognome ", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(ispezioneIspet != null ? ispezioneIspet.getCognome() : ""), 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("Nome ", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(ispezioneIspet != null ? ispezioneIspet.getNome() : ""), 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("CF ", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(ispezioneIspet != null ? ispezioneIspet.getCodiceFiscale() : ""), 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.RIGHT);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("per conto di Ente Competente ", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(ispezioneDb.getEnteCompetente()), 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			cell.setColspan(3);
			tabella.addCell(cell);
			//END ROW
			
			boolean flgEsito = ConvertUtil.convertToBooleanAllways(ispezioneDb.getFlgEsito());
			
			//START ROW
			paragraph = new Paragraph("La verifica della documentazione impianto, dell'avvenuto controllo ed eventuale manutenzione e, ove previsto, del rendimento della combustione, ha avuto esito:", FONT_HELVETICA_8);
			aggiungiSpaziVuoti(paragraph, 10);
			aggiungiCheckPrima(paragraph, "Positivo", flgEsito, 10);
			aggiungiCheckPrima(paragraph, "Negativo", ispezioneDb.getIdIspezione2018() != null && !flgEsito, 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			cell.setColspan(3);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Note ", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, ConvertUtil.getStringValid(ispezioneDb.getNote()), 0);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			cell.setColspan(3);
			tabella.addCell(cell);
			//END ROW
			
			//START ROW
			paragraph = new Paragraph("Si allega copia del Rapporto di prova n\u00B0 ", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, elencoAllegati, 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM);
			cell.setColspan(2);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("Firma dell'ispettore ", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.BOTTOM | Rectangle.RIGHT);
			tabella.addCell(cell);
			//END ROW

			document.add(tabella);
		}
		
		gestDebug(isSimul, "aggiungiScheda13RisultatiIspezioni - START");
	}
	
	private void aggiungiScheda14RegistrazioneConsumi(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda14RegistrazioneConsumi - START");
		
		Paragraph paragraph = new Paragraph("14. REGISTRAZIONE DEI CONSUMI NEI VARI ESERCIZI", FONT_HELVETICA_9_B);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);
		
		//SEZIONE 14.1
		aggiungiScheda14_1ConsumoCombustibile(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 14.2
		aggiungiScheda14_2ConsumoEnergiaElettrica(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 14.3
		aggiungiScheda14_3ConsumoAcqua(document, datiLibretto, isSimul);
		
		document.newPage();
		
		//SEZIONE 14.4
		aggiungiScheda14_4ConsumoProdottiChimici(document, datiLibretto, isSimul);
		
		gestDebug(isSimul, "aggiungiScheda14RegistrazioneConsumi - END");
	}
	
	private void aggiungiScheda14_1ConsumoCombustibile(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda14_1ConsumoCombustibile - START");
		
		List<SigitTConsumoDto> combustibileList = datiLibretto.getCombustibileList();
		
		if (combustibileList == null || combustibileList.isEmpty()) {
			combustibileList = new ArrayList<SigitTConsumoDto>();
			combustibileList.add(new SigitTConsumoDto());
		}
		
		Paragraph paragraph = new Paragraph("14.1 CONSUMO DI COMBUSTIBILE", FONT_HELVETICA_8_B);
		document.add(paragraph);
		
		BigDecimal lastCombustibile = ConvertUtil.getBigDecimalValid(combustibileList.get(0).getFkCombustibile());
		String lastUM = ConvertUtil.getStringValid(combustibileList.get(0).getFkUnitaMisura());
		
		BigDecimal newCombustibile = null;
		String newUM = null;
		
		float[] columWidths = new float[] {20, 20, 20, 20, 20};
		
		PdfPTable tabellaConsumo = initializeTable(columWidths);
		tabellaConsumo = aggiungiHeaderScheda14_1(tabellaConsumo, lastCombustibile, lastUM);
		
		for (SigitTConsumoDto consumo : combustibileList) {
			newCombustibile = ConvertUtil.getBigDecimalValid(consumo.getFkCombustibile());
			newUM = ConvertUtil.getStringValid(consumo.getFkUnitaMisura());
			
			if(lastCombustibile != null && (!lastCombustibile.equals(newCombustibile) || !lastUM.equals(newUM)))
			{				
				lastCombustibile = newCombustibile;
				lastUM = newUM;
				
				//START ROW
				paragraph = new Paragraph("", FONT_HELVETICA_8);
				PdfPCell cell = new PdfPCell(paragraph);
				cell.setBorder(Rectangle.BOTTOM | Rectangle.LEFT | Rectangle.RIGHT);
				cell.setColspan(5);
				tabellaConsumo.addCell(cell);
				//END ROW
				
				document.add(tabellaConsumo);
				
				tabellaConsumo = initializeTable(columWidths);
				tabellaConsumo = aggiungiHeaderScheda14_1(tabellaConsumo, lastCombustibile, lastUM);
			}
			
			PdfPCell cell = new PdfPCell(aggiungiValoreDoppio(ConvertUtil.convertToStringOrEmpty(consumo.getEsercizioDa()), ConvertUtil.convertToStringOrEmpty(consumo.getEsercizioA())));
			cell.setBorder(Rectangle.LEFT);
			tabellaConsumo.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.getStringValid(consumo.getAcquisti()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabellaConsumo.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(consumo.getLetturaIniziale()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabellaConsumo.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(consumo.getLetturaFinale()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabellaConsumo.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(consumo.getConsumo()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.RIGHT);
			tabellaConsumo.addCell(cell);
			
		}
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.BOTTOM | Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(5);
		tabellaConsumo.addCell(cell);
		//END ROW
		
		document.add(tabellaConsumo);
		
		gestDebug(isSimul, "aggiungiScheda14_1ConsumoCombustibile - END");
	}
	
	private PdfPTable aggiungiHeaderScheda14_1(PdfPTable tabella, BigDecimal combustibile, String um) {
		
		Paragraph paragraph = null;
		PdfPCell cell = null;
		
		//START ROW
		paragraph = new Paragraph("Tipo combustibile ", FONT_HELVETICA_8);
		paragraph.add(new Chunk(ConvertUtil.getStringValid(getDesCombustibile(combustibile)),FONT_HELVETICA_8_B));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.TOP | Rectangle.BOTTOM);
		cell.setColspan(3);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Unita' di misura ", FONT_HELVETICA_8);
		paragraph.add(new Chunk(ConvertUtil.getStringValid(getDesUnitaMisura(um)),FONT_HELVETICA_8_B));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT | Rectangle.TOP | Rectangle.BOTTOM);
		cell.setColspan(2);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("Esercizio", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Acquisti", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Scorta o lettura iniziale", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Scorta o lettura finale", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Consumo", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		tabella.addCell(cell);
		//END ROW
		
		return tabella;
	}
	
	private void aggiungiScheda14_2ConsumoEnergiaElettrica(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda14_2ConsumoEnergiaElettrica - END");
		
		List<SigitTConsumoDto> consumiList = datiLibretto.getEnergiaElettricaList();
		
		if (consumiList == null || consumiList.isEmpty()) {
			consumiList = new ArrayList<SigitTConsumoDto>();
			consumiList.add(new SigitTConsumoDto());
		}
		
		Paragraph paragraph = new Paragraph("14.2 CONSUMO DI ENERGIA ELETTRICA", FONT_HELVETICA_8_B);
		document.add(paragraph);
		
		PdfPTable tabella = initializeTable(new float[] {25, 25, 25, 25});
		
		//START ROW
		paragraph = new Paragraph("Esercizio", FONT_HELVETICA_8);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Lettura iniziale (kWh)", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Lettura finale (kWh)", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Consumo totale (kWh)", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		//END ROW
		
		for (SigitTConsumoDto consumo : consumiList) {
			//START ROW
			cell = new PdfPCell(aggiungiValoreDoppio(ConvertUtil.convertToStringOrEmpty(consumo.getEsercizioDa()), ConvertUtil.convertToStringOrEmpty(consumo.getEsercizioA())));
			cell.setBorder(Rectangle.LEFT);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(consumo.getLetturaIniziale()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(consumo.getLetturaFinale()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(consumo.getConsumo()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.RIGHT);
			tabella.addCell(cell);
			//END ROW
		}
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.BOTTOM | Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		document.add(tabella);
		
		gestDebug(isSimul, "aggiungiScheda14_2ConsumoEnergiaElettrica - END");
	}
	
	private void aggiungiScheda14_3ConsumoAcqua(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda14_3ConsumoAcqua - END");
		
		List<SigitTConsumoDto> consumiList = datiLibretto.getH2oList();
		
		if (consumiList == null || consumiList.isEmpty()) {
			consumiList = new ArrayList<SigitTConsumoDto>();
			consumiList.add(new SigitTConsumoDto());
		}
		
		String unitaMisura = consumiList.get(0).getFkUnitaMisura();
		
		PdfPTable tabellaHeader = initializeTable(new float[] {75, 25});
		Paragraph paragraph = new Paragraph("14.3 CONSUMO DI ENERGIA ELETTRICA", FONT_HELVETICA_8_B);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabellaHeader.addCell(cell);
		
		paragraph = new Paragraph("Unita' di misura ", FONT_HELVETICA_8);
		paragraph.add(new Chunk(ConvertUtil.getStringValid(getDesUnitaMisura(unitaMisura)),FONT_HELVETICA_8_B));
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		tabellaHeader.addCell(cell);
		
		document.add(tabellaHeader);
		
		PdfPTable tabella = initializeTable(new float[] {25, 25, 25, 25});
		
		//START ROW
		paragraph = new Paragraph("Esercizio", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Lettura iniziale", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Lettura finale", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Consumo totale", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		//END ROW
		
		for (SigitTConsumoDto consumo : consumiList) {
			//START ROW
			cell = new PdfPCell(aggiungiValoreDoppio(ConvertUtil.convertToStringOrEmpty(consumo.getEsercizioDa()), ConvertUtil.convertToStringOrEmpty(consumo.getEsercizioA())));
			cell.setBorder(Rectangle.LEFT);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(consumo.getLetturaIniziale()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);			
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(consumo.getLetturaFinale()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(consumo.getConsumo()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.RIGHT);
			tabella.addCell(cell);
			//END ROW
		}
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.BOTTOM | Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(4);
		tabella.addCell(cell);
		//END ROW
		
		document.add(tabella);
		
		gestDebug(isSimul, "aggiungiScheda14_3ConsumoAcqua - END");
	}
	
	private void aggiungiScheda14_4ConsumoProdottiChimici(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda14_4ConsumoProdottiChimici - END");
		
		List<SigitTConsumo14_4Dto> consumiList = datiLibretto.getProdottiChimiciList();
		
		if (consumiList == null || consumiList.isEmpty()) {
			consumiList = new ArrayList<SigitTConsumo14_4Dto>();
			consumiList.add(new SigitTConsumo14_4Dto());
		}
				
		Paragraph paragraph = new Paragraph("14.4 CONSUMO DI PRODOTTI CHIMICI PER IL TRATTAMENTO ACQUA DEL CIRCUITO DELL'IMPIANTO TERMICO", FONT_HELVETICA_8_B);
		document.add(paragraph);
		
		PdfPTable tabella = initializeTable(new float[] {15, 15, 15, 15, 20, 10, 10});
		
		//START ROW
		paragraph = new Paragraph("Esercizio", FONT_HELVETICA_8);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Circuito impianto termico", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Circuito ACS", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Altri circuiti ausiliari", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Nome prodotto", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Quantita' consumata", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("Unita' di misura", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabella.addCell(cell);
		//END ROW
		
		for (SigitTConsumo14_4Dto consumo : consumiList) {
			//START ROW
			cell = new PdfPCell(aggiungiValoreDoppio(ConvertUtil.convertToStringOrEmpty(consumo.getEsercizioDa()),  ConvertUtil.convertToStringOrEmpty(consumo.getEsercizioA())));
			cell.setBorder(Rectangle.LEFT);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "", ConvertUtil.convertToBooleanAllways(consumo.getFlgCircuitoIt()));
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "", ConvertUtil.convertToBooleanAllways(consumo.getFlgCircuitoAcs()));
			cell = new PdfPCell(paragraph);		
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheckPrima(paragraph, "", ConvertUtil.convertToBooleanAllways(consumo.getFlgAca()));
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.getStringValid(consumo.getNomeProdotto()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(consumo.getQtaConsumata()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.getStringValid(getDesUnitaMisura(consumo.getFkUnitaMisura())), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.RIGHT);
			tabella.addCell(cell);
			//END ROW
		}
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.BOTTOM | Rectangle.LEFT | Rectangle.RIGHT);
		cell.setColspan(7);
		tabella.addCell(cell);
		//END ROW
		
		document.add(tabella);
		
		gestDebug(isSimul, "aggiungiScheda14_4ConsumoProdottiChimici - END");
	}
	
	private void aggiungiScheda15InterventiManutenzione(Document document, DatiLibretto datiLibretto, boolean isSimul) throws DocumentException {
		gestDebug(isSimul, "aggiungiScheda15InterventiManutenzione - END");
		
		List<SigitVRicercaAllegatiDto> listManutenzioni = datiLibretto.getManutenzioniList();
		
		if (listManutenzioni == null || listManutenzioni.isEmpty()) {
			listManutenzioni = new ArrayList<SigitVRicercaAllegatiDto>();
			listManutenzioni.add(new SigitVRicercaAllegatiDto());
		}
		
		Paragraph paragraph = new Paragraph("15. INTERVENTI DI MANUTENZIONE", FONT_HELVETICA_8_B);
		document.add(paragraph);
		
		float[] columnWidths = {20, 20, 20, 20, 20};
		
		PdfPTable tabellaHeader = initializeTable(columnWidths);
		
		//START ROW
		paragraph = new Paragraph("Data di manutenzione", FONT_HELVETICA_8);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaHeader.addCell(cell);
		
		paragraph = new Paragraph("Ragione sociale manutentore", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaHeader.addCell(cell);
		
		paragraph = new Paragraph("CCIAA", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaHeader.addCell(cell);
		
		paragraph = new Paragraph("Tipo intervento", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaHeader.addCell(cell);
		
		paragraph = new Paragraph("Intervento manutentivo entro il", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		tabellaHeader.addCell(cell);
		//END ROW
		
		document.add(tabellaHeader);
		
		for (SigitVRicercaAllegatiDto manutenzione : listManutenzioni) {
			
			PdfPTable tabella = initializeTable(columnWidths);
			tabella.setSpacingBefore(0);
			
			//START ROW
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(manutenzione.getDataControllo()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.TOP);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.getStringValid(manutenzione.getPgDenominazione()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.TOP);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.getStringValid(MapDto.getCodiceRea(manutenzione.getPgSiglaRea(), ConvertUtil.convertToInteger(manutenzione.getPgNumeroRea()))), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.TOP);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.getStringValid(manutenzione.getDesTipoManutenzione()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.TOP);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(ConvertUtil.convertToStringOrEmpty(manutenzione.getFInterventoEntro()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.RIGHT | Rectangle.TOP);
			tabella.addCell(cell);
			//END ROW
			
			StringBuffer note = new StringBuffer();
			
			note.append("Comp.: ");
			note.append(MapDto.mapToElencoApparecchiatureSplit(manutenzione.getElencoApparecchiature()));
			
			if (GenericUtil.isNotNullOrEmpty(manutenzione.getFPrescrizioni()))
			{
				note.append("\nPrescr.: ");
				note.append(manutenzione.getFPrescrizioni());
			}
			
			if (GenericUtil.isNotNullOrEmpty(manutenzione.getFRaccomandazioni()))
			{
				note.append("\nRacc.: ");
				note.append(manutenzione.getFRaccomandazioni());
			}
			
			if (GenericUtil.isNotNullOrEmpty(manutenzione.getFOsservazioni()))
			{
				note.append("\nOss.: ");
				note.append(manutenzione.getFOsservazioni());
			}
			
			//START ROW
			paragraph = new Paragraph("Note", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM);
			cell.setBackgroundColor(LIGHT_GRAY);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(GenericUtil.getSubstring(note.toString(), Constants.MAX_2030_LEN), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setColspan(4);
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			tabella.addCell(cell);
			//END ROW
		
			document.add(tabella);
		}		
		
		gestDebug(isSimul, "aggiungiScheda15InterventiManutenzione - END");
	}
	
	private PdfPCell initializeModuloCell(PdfPTable tabella) {
		PdfPCell cell = new PdfPCell(tabella);
		cell.setMinimumHeight(20);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		return cell;
	}
	
	private PdfPCell initializeModuloCell(Paragraph paragraph) {
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setMinimumHeight(20);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		return cell;
	}
	
	private String getFirmaModulo(BigDecimal numeroRea, BigDecimal fkRuolo, String siglaRea) {
		if (GenericUtil.isNullOrEmpty(numeroRea) && fkRuolo.intValue() == Constants.ID_RUOLO_ISPETTORE)
		{
			return Constants.DESC_ISPEZIONE;
		}
		
		return MapDto.getCodiceRea(siglaRea, ConvertUtil.convertToInteger(numeroRea));
		
	}

	private void aggiungiValoreUnitaMisura(Paragraph paragraph, String valore, String unitaMisura, int minSpazio) {
		aggiungiSpazioETesto(paragraph, valore, minSpazio);
		paragraph.add(" " + unitaMisura);
		paragraph.setAlignment(Element.ALIGN_RIGHT);
	}
	
	private PdfPCell getCellaValoreUnitaMisura(String valore, String unitaMisura, int border) {
		Paragraph paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiValoreUnitaMisura(paragraph, valore, unitaMisura, 0);
		PdfPCell cella = new PdfPCell(paragraph);
		cella.setBorder(border);
		cella.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
		cella.setPaddingRight(8);
		
		return cella;
	}
	
	private PdfPTable aggiungiValoreDoppio(String primoValore, String secondoValore) {
		PdfPTable tabellaValori = new PdfPTable(new float[] {45, 5, 45});
		tabellaValori.setWidthPercentage(100);
		tabellaValori.getDefaultCell().setBorder(Rectangle.NO_BORDER);
		tabellaValori.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		
		tabellaValori.addCell(new Paragraph(primoValore, FONT_HELVETICA_8));
		
		tabellaValori.addCell(new Paragraph("/", FONT_HELVETICA_8));
		
		tabellaValori.addCell(new Paragraph(secondoValore, FONT_HELVETICA_8));

		return tabellaValori;
	}
	
	private PdfPTable aggiungiValoreMultiplo(String primoValore, String secondoValore, String terzoValore) {
		PdfPTable tabellaValori = new PdfPTable(new float[] {28, 5, 28 ,5, 30});
		tabellaValori.setWidthPercentage(100);
		tabellaValori.getDefaultCell().setBorder(Rectangle.NO_BORDER);
		tabellaValori.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		
		tabellaValori.addCell(new Paragraph(primoValore, FONT_HELVETICA_8));
		
		tabellaValori.addCell(new Paragraph("/", FONT_HELVETICA_8));
		
		tabellaValori.addCell(new Paragraph(secondoValore, FONT_HELVETICA_8));
		
		tabellaValori.addCell(new Paragraph("/", FONT_HELVETICA_8));
		
		tabellaValori.addCell(new Paragraph(terzoValore, FONT_HELVETICA_8));

		return tabellaValori;
	}

	private PdfPTable aggiungiSezioneTabella(PdfPTable tabella, List<DatoTabella> datiTabella) {
		
		Paragraph paragraph = null;
		PdfPCell cell = null;
		
		for (int i = 0; i < datiTabella.size(); i++) {
			
			DatoTabella datoTabella = datiTabella.get(i);			
			String label = datoTabella.getLabel();
			int valueCellColSpan = 2;
			TipoDato tipoDato = datoTabella.getTipoDato();
			int borderLabel = Rectangle.LEFT;
			int borderValue = Rectangle.NO_BORDER;
			
			if (i != 0 && i%2 != 0) {
				borderLabel = Rectangle.NO_BORDER;
				borderValue = Rectangle.RIGHT;
			}
			
			if (label != null && !label.equals("")) {
				valueCellColSpan = 1;
				paragraph = new Paragraph("", FONT_HELVETICA_8);
				
				//Sostituisco il placeholder %eta% con il valore η
				if (datoTabella.getLabelHasEta()) {
					String[] labelArray = label.split("%eta%");
					
					int lastLabelArrayIndex = labelArray.length - 1;
					
					for(int j = 0; j < lastLabelArrayIndex; j++) {
						paragraph.add(labelArray[j]);
						paragraph.add(SYMBOL_ETA);
					}
					
					paragraph.add(labelArray[lastLabelArrayIndex]);
				} else {
					paragraph.add(label);
				}
				
				cell = new PdfPCell(paragraph);
				cell.setBorder(borderLabel);
				
				if (datoTabella.getHasBackgroundScuro()) {
					cell.setBackgroundColor(LIGHT_GRAY);
				}
				
				tabella.addCell(cell);
			} else if (borderValue == Rectangle.NO_BORDER) {
					borderValue = Rectangle.LEFT;
			}
			
			switch (tipoDato) {
				case TESTO :
					paragraph = new Paragraph(datoTabella.getValore(), FONT_HELVETICA_8);
					cell = new PdfPCell(paragraph);
					break;
				case DOPPIOVALORE :
					cell = new PdfPCell(aggiungiValoreDoppio(datoTabella.getValore(), datoTabella.getSecondoValore()));
					break;
				case CHECKBOX : 
					paragraph = new Paragraph("", FONT_HELVETICA_8);
					DatoCheckbox checkbox = datoTabella.getValoriCheckbox().get(0);
					aggiungiCheckPrima(paragraph, checkbox.getLabel(), checkbox.getValore());
					cell = new PdfPCell(paragraph);
					break;
				case DOPPIACHECKBOX :
					paragraph = new Paragraph("", FONT_HELVETICA_8);
					DatoCheckbox primaCheckbox = datoTabella.getValoriCheckbox().get(0);
					DatoCheckbox secondaCheckbox = datoTabella.getValoriCheckbox().get(1);
					aggiungiCheckPrima(paragraph, primaCheckbox.getLabel(), primaCheckbox.getValore(),20);
					aggiungiCheckPrima(paragraph, secondaCheckbox.getLabel(), secondaCheckbox.getValore());
					cell = new PdfPCell(paragraph);
					break;
				case TABELLA :
					borderValue = Rectangle.LEFT | Rectangle.RIGHT;
					valueCellColSpan = 4;
					cell = new PdfPCell(datoTabella.getTabellaRiga());
					break;
				default :
					paragraph = new Paragraph("", FONT_HELVETICA_8);
					cell = new PdfPCell(paragraph);
			}			
			cell.setBorder(borderValue);
			cell.setColspan(valueCellColSpan);
			
			if (datoTabella.getHasBackgroundScuro()) {
				cell.setBackgroundColor(LIGHT_GRAY);
			}
			
			tabella.addCell(cell);
		}
		return tabella;
	}

	private String getDesFabbricante(BigDecimal marcaCITPk) {
		if (marcaCITPk == null || marcaCITPk.equals(BigDecimal.ZERO)) {
			return "";
		}
		
		try {
			MarcaCITDto marcaCIT = getDbServiceImp().getMarcaCITByPrimaryKey(marcaCITPk);
			return marcaCIT.getDesMarca();
			
		} catch (Exception e) {
			log.error("Errore durante il recupero del fabbricante: ",e);
			return "";
		}		
	}
	
	private String getDesCombustibile(BigDecimal combustibileCITPk) {
		if (combustibileCITPk == null || combustibileCITPk.equals(BigDecimal.ZERO)) {
			return "";
		}
		
		try {
			CombustibileCITDto combustibileCIT = getDbServiceImp().getCombustibileCITByPrimaryKey(combustibileCITPk);
			return combustibileCIT.getDesCombustibile();
			
		} catch (Exception e) {
			log.error("Errore durante il recupero del combustibile: ",e);
			return "";
		}
	}
	
	private String getDesUnitaMisura(String unitaMisuraCITPk) {
		if (GenericUtil.isNullOrEmpty(unitaMisuraCITPk)) {
			return "";
		}
		
		try {
			UnitaMisuraCITDto unitaMisuraCIT = getDbServiceImp().getUnitaMisuraCITByPrimaryKey(unitaMisuraCITPk);
			return unitaMisuraCIT.getDesUnitaMisura();
			
		} catch (Exception e) {
			log.error("Errore durante il recupero dell' unita di misura: ",e);
			return "";
		}	
	}

	private PdfPCell initializeDefaultCell(Phrase phrase) {
		PdfPCell cell = new PdfPCell(phrase);
		cell.setPaddingTop(5);
		cell.setPaddingBottom(5);
		
		return cell;
	}
}
