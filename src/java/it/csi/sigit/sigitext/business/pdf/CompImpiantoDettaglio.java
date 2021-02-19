/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.pdf;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.lowagie.text.pdf.PdfPTable;

public class CompImpiantoDettaglio {
	boolean isNormaUni;
	boolean isAltro;
	String descAltro;
	BigDecimal progressivo;
	String dataControllo;
	List<PdfPTable> moduli;
	
	public CompImpiantoDettaglio() {
		this.moduli = new ArrayList<PdfPTable>();
	}
	
	public boolean isNormaUni() {
		return isNormaUni;
	}
	public void setNormaUni(boolean isNormaUni) {
		this.isNormaUni = isNormaUni;
	}
	public boolean isAltro() {
		return isAltro;
	}
	public void setAltro(boolean isAltro) {
		this.isAltro = isAltro;
	}
	public String getDescAltro() {
		return descAltro;
	}
	public void setDescAltro(String descAltro) {
		this.descAltro = descAltro;
	}
	public BigDecimal getProgressivo() {
		return progressivo;
	}
	public void setProgressivo(BigDecimal progressivo) {
		this.progressivo = progressivo;
	}
	public String getDataControllo() {
		return dataControllo;
	}
	public void setDataControllo(String dataControllo) {
		this.dataControllo = dataControllo;
	}
	public List<PdfPTable> getModuli() {
		return moduli;
	}
	public void setModuli(List<PdfPTable> moduli) {
		this.moduli = moduli;
	}
	
	public void addModulo(PdfPTable modulo) {
		this.moduli.add(modulo);
	}
}
