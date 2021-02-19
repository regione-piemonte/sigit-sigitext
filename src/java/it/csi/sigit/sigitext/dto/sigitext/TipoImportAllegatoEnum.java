/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.dto.sigitext;

public enum TipoImportAllegatoEnum {
	ALLEGATOII("allegatoII"),
	ALLEGATOIII("allegatoIII"),
	ALLEGATOIV("allegatoIV"),
	ALLEGATOV("allegatoV"),
	MANUT_GT("manutGT"),
	MANUT_GF("manutGF"),
	MANUT_SC("manutSC"),
	MANUT_CG("manutCG");
	
	public final String tipoImportLabel;
	
	private TipoImportAllegatoEnum(String tipoImportLabel) {
		this.tipoImportLabel = tipoImportLabel;
	}
	
	public static TipoImportAllegatoEnum valueOfLabel(String tipoImportLabel) {
	    for (TipoImportAllegatoEnum tipoImport : values()) {
	        if (tipoImport.tipoImportLabel.equals(tipoImportLabel)) {
	            return tipoImport;
	        }
	    }
	    return null;
	}
}
