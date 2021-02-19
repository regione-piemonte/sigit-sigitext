/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.dto.sigitext;

import java.io.Serializable;

public class Metadati implements Serializable {

	private static final long serialVersionUID = 6092264891878897848L;
	
	public static final String META_ID_RAPPORTO = "sigit:idRapporto";
	public static final String META_ID_ALLEGATO = "sigit:idAllegato";
	public static final String META_CODICE_REA = "sigit:codiceREA";
	public static final String META_COD_ISTAT_PROVINCIA = "sigit:codIstatProvincia";
	public static final String META_COD_ISTAT_COMUNE = "sigit:codIstatComune";
	public static final String META_BOLLINO_VERDE = "sigit:bollinoVerde";
	public static final String META_DATA_RAPPORTO = "sigit:dataRapporto";
	
	private String idRapporto = null;
	private String idAllegato = null;

	private String codiceRea = null;
	private String codIstatProvincia = null;
	private String codIstatComune = null;
	private String bollinoVerde = null;
	private String dataRapporto = null;
	private String codiceImpianto = null;
	
	public String getIdRapporto() {
		return idRapporto;
	}
	public void setIdRapporto(String idRapporto) {
		this.idRapporto = idRapporto;
	}
	public String getIdAllegato() {
		return idAllegato;
	}
	public void setIdAllegato(String idAllegato) {
		this.idAllegato = idAllegato;
	}
	
	public String getCodiceRea() {
		return codiceRea;
	}
	public void setCodiceRea(String codiceRea) {
		this.codiceRea = codiceRea;
	}
	public String getCodIstatProvincia() {
		return codIstatProvincia;
	}
	public void setCodIstatProvincia(String codIstatProvincia) {
		this.codIstatProvincia = codIstatProvincia;
	}
	public String getCodIstatComune() {
		return codIstatComune;
	}
	public void setCodIstatComune(String codIstatComune) {
		this.codIstatComune = codIstatComune;
	}
	public String getBollinoVerde() {
		return bollinoVerde;
	}
	public void setBollinoVerde(String bollinoVerde) {
		this.bollinoVerde = bollinoVerde;
	}
	public String getDataRapporto() {
		return dataRapporto;
	}
	public void setDataRapporto(String dataRapporto) {
		this.dataRapporto = dataRapporto;
	}
	public String getCodiceImpianto() {
		return codiceImpianto;
	}
	public void setCodiceImpianto(String codiceImpianto) {
		this.codiceImpianto = codiceImpianto;
	}
	
}
