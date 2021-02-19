/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.pdf;

import java.math.BigDecimal;

import com.lowagie.text.pdf.PdfPTable;

public class SezioneBrRc {
	PdfPTable tabellaBrRc;
	BigDecimal progessivoGt;
	
	public PdfPTable getTabellaBrRc() {
		return tabellaBrRc;
	}
	public void setTabellaBrRc(PdfPTable tabellaBrRc) {
		this.tabellaBrRc = tabellaBrRc;
	}
	public BigDecimal getProgessivoGt() {
		return progessivoGt;
	}
	public void setProgessivoGt(BigDecimal progessivoGt) {
		this.progessivoGt = progessivoGt;
	}
}
