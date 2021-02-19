/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.pdf;

import java.util.ArrayList;

import com.lowagie.text.pdf.PdfPTable;

public class DatoTabella {

	private String label;
	private TipoDato tipoDato;
	private String valore;
	private String secondoValore;
	private Boolean labelHasEta = false;
	private Boolean hasBackgroundScuro = false;
	private ArrayList<DatoCheckbox> valoriCheckbox;
	private PdfPTable tabellaRiga;
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public TipoDato getTipoDato() {
		return tipoDato;
	}
	public void setTipoDato(TipoDato tipoDato) {
		this.tipoDato = tipoDato;
	}
	public String getValore() {
		return valore;
	}
	public void setValore(String valore) {
		this.valore = valore;
	}
	public String getSecondoValore() {
		return secondoValore;
	}
	public void setSecondoValore(String secondoValore) {
		this.secondoValore = secondoValore;
	}
	public Boolean getLabelHasEta() {
		return labelHasEta;
	}
	public void setLabelHasEta(Boolean labelHasEta) {
		this.labelHasEta = labelHasEta;
	}
	public Boolean getHasBackgroundScuro() {
		return hasBackgroundScuro;
	}
	public void setHasBackgroundScuro(Boolean hasBackgroundScuro) {
		this.hasBackgroundScuro = hasBackgroundScuro;
	}
	public ArrayList<DatoCheckbox> getValoriCheckbox() {
		return valoriCheckbox;
	}
	public void setValoriCheckbox(ArrayList<DatoCheckbox> valoriCheckbox) {
		this.valoriCheckbox = valoriCheckbox;
	}
	public PdfPTable getTabellaRiga() {
		return tabellaRiga;
	}
	public void setTabellaRiga(PdfPTable tabellaRiga) {
		this.tabellaRiga = tabellaRiga;
	}
}
