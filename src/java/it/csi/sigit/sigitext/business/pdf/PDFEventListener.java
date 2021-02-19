/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.pdf;

import java.awt.Color;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.ExceptionConverter;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfName;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfPageEventHelper;
import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfWriter;

import it.csi.sigit.sigitext.business.pdf.BaseBuilder;
import it.csi.sigit.sigitext.business.util.Constants;


//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.Element;
//import com.itextpdf.text.Font;
//import com.itextpdf.text.Font.FontFamily;
//import com.itextpdf.text.Phrase;
//import com.itextpdf.text.pdf.ColumnText;
//import com.itextpdf.text.pdf.PdfContentByte;
//import com.itextpdf.text.pdf.PdfPageEventHelper;
//import com.itextpdf.text.pdf.PdfWriter;
// 
 
public class PDFEventListener extends PdfPageEventHelper
{
	public static Font FONT = new Font(Font.HELVETICA, 8);
	//Image imgLogo = null;
	
	private PdfTemplate total;
	private boolean isBozza;
	private boolean isHeader = false;
	private BigDecimal codiceImpianto;
	private SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	private String date;
	
	
	//String header = "PROVA";

	public PDFEventListener() {
		this.date = spf.format(new Date());
	}
	
	public PDFEventListener(boolean isBozza, BigDecimal codiceImpianto)
	{		
		this();
		this.isBozza = isBozza;
		this.codiceImpianto = codiceImpianto;
		
	}

	public PDFEventListener(boolean isBozza, boolean isHeader, BigDecimal codiceImpianto)
	{
		this();
		this.isBozza = isBozza;
		this.isHeader = isHeader;
		this.codiceImpianto = codiceImpianto;
	}
	
	
	public boolean isBozza() {
		return isBozza;
	}

	public void setBozza(boolean isBozza) {
		this.isBozza = isBozza;
	}

    public void onOpenDocument(PdfWriter writer, Document document) {

        total = writer.getDirectContent().createTemplate(30, 16);
    }

    // pag 1 di 1 messo nell'header sopra
    public void onEndPage(PdfWriter writer, Document document)
    {
    	addHeader(writer);
    	addFooter(writer);
    	
    }

    private void addHeader(PdfWriter writer) {
    	if (isHeader)
    	{
    		PdfPTable table = new PdfPTable(3);
    		try {

    			// set defaults
    			table.setWidths(new int[]{24, 24, 2});

    			//table.setWidthPercentage(100);
    			table.setTotalWidth(575);
    			table.setLockedWidth(true);
    			//table.getDefaultCell().setFixedHeight(10);
    			table.getDefaultCell().setBorder(Rectangle.NO_BORDER);
    			//table.getDefaultCell().setBorder(Rectangle.BOX);
    			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
    			
    			Phrase phrase = new Phrase();
    			phrase.add(new Chunk ("COD. CATASTO", BaseBuilder.FONT_HELVETICA_9_B));
    			phrase.add(new Chunk (" (cod. impianto)     ", BaseBuilder.FONT_HELVETICA_7));
    			phrase.add(new Chunk (codiceImpianto.toString(), BaseBuilder.FONT_HELVETICA_9_B));
    			

    			PdfPCell cellCol1 = new PdfPCell(phrase);
    			cellCol1.setBorder(Rectangle.NO_BORDER);
    			table.addCell(cellCol1);

    			phrase = new Phrase();
    			phrase.add(new Chunk (String.format("Pagina° %d di", writer.getPageNumber()), BaseBuilder.FONT_HELVETICA_6_GRAY));
    			phrase.add(new Chunk ("\n\nALLEGATO ", BaseBuilder.FONT_HELVETICA_9_B));

    			phrase.add(new Chunk ("I", BaseBuilder.FONT_HELVETICA_9_B));

    			phrase.add(new Chunk ("    (Art. 1)", BaseBuilder.FONT_HELVETICA_6_GRAY));

    			PdfPCell cellCol2 = new PdfPCell(phrase);
    			cellCol2.setHorizontalAlignment(Paragraph.ALIGN_RIGHT);
    			cellCol2.setBorder(Rectangle.NO_BORDER);
    			table.addCell(cellCol2);

    			PdfPCell cell = new PdfPCell(Image.getInstance(total));
    			cell.setBorder(Rectangle.NO_BORDER);
    			table.addCell(cell);

    			/*
    			 * public float writeSelectedRows(
                               int rowStart,
                               int rowEnd,
                               float xPos,
                               float yPos,
                               PdfContentByte canvas)
               Parameters:
				rowStart - the first row to be written, zero index
				rowEnd - the last row to be written + 1. If it is -1 all the rows to the end are written
				xPos - the x write coordinate
				yPos - the y write coordinate
				canvas - the PdfContentByte where the rows will be written to
			  Returns:
				the y coordinate position of the bottom of the last row
    			 */
    			//table.writeSelectedRows(0, -1, 10, 803, writer.getDirectContent());
    			table.writeSelectedRows(0, -1, 10, 833, writer.getDirectContent());
    		} catch(DocumentException de) {
    			throw new ExceptionConverter(de);
    		} 
    	}
    }
    
    private void addFooter(PdfWriter writer) {
    	if (isBozza)
    	{
    		PdfContentByte canvas = writer.getDirectContentUnder();
    		Phrase watermark = new Phrase("BOZZA", new Font(Font.HELVETICA, 190, Font.NORMAL, Color.LIGHT_GRAY));
    		//ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, watermark, 337, 500, 45);
    		ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, watermark, 337, 400, 45);
    	}
    	
    	PdfPTable table = new PdfPTable(1);
		try {
			// set defaults
			table.setWidths(new int[]{100});

			//table.setWidthPercentage(100);
			table.setTotalWidth(600);
			table.setLockedWidth(true);
			//table.getDefaultCell().setFixedHeight(10);
			table.getDefaultCell().setBorder(Rectangle.TOP);
			
			Paragraph par = new Paragraph();  
						
			BaseBuilder.aggiungiSpaziVuoti(par, 2);
			
			try{ 
				par.setAlignment(Paragraph.ALIGN_LEFT);
				par.add(new Chunk(BaseBuilder.IMG_LOGO, 0, 0,true));
			}catch(Exception e){  
				System.out.println("Immagine mancante");
			}
			
			BaseBuilder.aggiungiSpaziVuoti(par, 10);
			
			Phrase phrase = new Phrase();
			phrase.add(new Chunk ("Libretto impianto  ", BaseBuilder.FONT_HELVETICA_7));
			phrase.add(new Chunk (date, BaseBuilder.FONT_HELVETICA_7));

			par.add(phrase);
			
			table.addCell(par);

	        table.writeSelectedRows(0, -1, 0, 50, writer.getDirectContent());
	        
		} catch(DocumentException de) {
			throw new ExceptionConverter(de);
		} 
    }
    
	public void onCloseDocument(PdfWriter writer, Document document) {
		
//    	Font font = new Font(BaseBuilder.FONT_HELVETICA_6);
//    	font.setColor(Color.GRAY);	
    	// Se c'e' l'header setto il numero di pagina
    	if (isHeader)
    	{
			/*
			public static void showTextAligned(PdfContentByte canvas,
			                                   int alignment,
			                                   Phrase phrase,
			                                   float x,
			                                   float y,
			                                   float rotation)
				Shows a line of text. Only the first line is written.
			Parameters:
				canvas - where the text is to be written to
				alignment - the alignment
				phrase - the Phrase with the text
				x - the x reference position
				y - the y reference position
				rotation - the rotation to be applied in degrees counterclockwise
			 */
			
			ColumnText.showTextAligned(total, Element.ALIGN_LEFT,
					new Phrase(String.valueOf(writer.getPageNumber() - 1), BaseBuilder.FONT_HELVETICA_6_GRAY), 2, 8, 0);
    	}
	}
}
