/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class SigitExtImpiantoDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7148203549346925489L;

	private BigDecimal codiceImpianto;
	private String istatComune;
	private String denominazioneComune;
	private String siglaProvincia;
	private String denominazioneProvincia;
	private BigDecimal fkStato;
	private Integer l13PotH2oKw;
	private Integer l13PotClimaInvKw;
	private Integer l13PotClimaEstKw;
	private Integer flgNopdr;
	private String indirizzoUnitaImmob;
	private String civico;
	private String sezione;
	private String foglio;
	private String particella;
	private String subalterno;
	private String podElettrico;
	private String pdrGas;
	private String desStato;
	private Integer flgVisuProprietario;
	private String codiceFiscaleResponsabile;
	private String denominazioneResponsabile;
	private BigDecimal ruoloResponsabile;
	private Date dataFinePfpgResponsabile;
	private String ruoloFunz;
	private String desRuoloFunz;
	private String codiceFiscaleProprietario;
	private String denominazioneProprietario;
	
	public BigDecimal getCodiceImpianto() {
		return codiceImpianto;
	}
	public void setCodiceImpianto(BigDecimal codiceImpianto) {
		this.codiceImpianto = codiceImpianto;
	}
	public String getIstatComune() {
		return istatComune;
	}
	public void setIstatComune(String istatComune) {
		this.istatComune = istatComune;
	}
	public String getDenominazioneComune() {
		return denominazioneComune;
	}
	public void setDenominazioneComune(String denominazioneComune) {
		this.denominazioneComune = denominazioneComune;
	}
	public String getSiglaProvincia() {
		return siglaProvincia;
	}
	public void setSiglaProvincia(String siglaProvincia) {
		this.siglaProvincia = siglaProvincia;
	}
	public String getDenominazioneProvincia() {
		return denominazioneProvincia;
	}
	public void setDenominazioneProvincia(String denominazioneProvincia) {
		this.denominazioneProvincia = denominazioneProvincia;
	}
	public BigDecimal getFkStato() {
		return fkStato;
	}
	public void setFkStato(BigDecimal fkStato) {
		this.fkStato = fkStato;
	}
	public Integer getL13PotH2oKw() {
		return l13PotH2oKw;
	}
	public void setL13PotH2oKw(Integer l13PotH2oKw) {
		this.l13PotH2oKw = l13PotH2oKw;
	}
	public Integer getL13PotClimaInvKw() {
		return l13PotClimaInvKw;
	}
	public void setL13PotClimaInvKw(Integer l13PotClimaInvKw) {
		this.l13PotClimaInvKw = l13PotClimaInvKw;
	}
	public Integer getL13PotClimaEstKw() {
		return l13PotClimaEstKw;
	}
	public void setL13PotClimaEstKw(Integer l13PotClimaEstKw) {
		this.l13PotClimaEstKw = l13PotClimaEstKw;
	}
	public Integer getFlgNopdr() {
		return flgNopdr;
	}
	public void setFlgNopdr(Integer flgNopdr) {
		this.flgNopdr = flgNopdr;
	}
	public String getIndirizzoUnitaImmob() {
		return indirizzoUnitaImmob;
	}
	public void setIndirizzoUnitaImmob(String indirizzoUnitaImmob) {
		this.indirizzoUnitaImmob = indirizzoUnitaImmob;
	}
	public String getCivico() {
		return civico;
	}
	public void setCivico(String civico) {
		this.civico = civico;
	}
	public String getSezione() {
		return sezione;
	}
	public void setSezione(String sezione) {
		this.sezione = sezione;
	}
	public String getFoglio() {
		return foglio;
	}
	public void setFoglio(String foglio) {
		this.foglio = foglio;
	}
	public String getParticella() {
		return particella;
	}
	public void setParticella(String particella) {
		this.particella = particella;
	}
	public String getSubalterno() {
		return subalterno;
	}
	public void setSubalterno(String subalterno) {
		this.subalterno = subalterno;
	}
	public String getPodElettrico() {
		return podElettrico;
	}
	public void setPodElettrico(String podElettrico) {
		this.podElettrico = podElettrico;
	}
	public String getPdrGas() {
		return pdrGas;
	}
	public void setPdrGas(String pdrGas) {
		this.pdrGas = pdrGas;
	}
	public String getDesStato() {
		return desStato;
	}
	public void setDesStato(String desStato) {
		this.desStato = desStato;
	}
	public Integer getFlgVisuProprietario() {
		return flgVisuProprietario;
	}
	public void setFlgVisuProprietario(Integer flgVisuProprietario) {
		this.flgVisuProprietario = flgVisuProprietario;
	}
	public String getCodiceFiscaleResponsabile() {
		return codiceFiscaleResponsabile;
	}
	public void setCodiceFiscaleResponsabile(String codiceFiscaleResponsabile) {
		this.codiceFiscaleResponsabile = codiceFiscaleResponsabile;
	}
	public String getDenominazioneResponsabile() {
		return denominazioneResponsabile;
	}
	public void setDenominazioneResponsabile(String denominazioneResponsabile) {
		this.denominazioneResponsabile = denominazioneResponsabile;
	}
	public BigDecimal getRuoloResponsabile() {
		return ruoloResponsabile;
	}
	public void setRuoloResponsabile(BigDecimal ruoloResponsabile) {
		this.ruoloResponsabile = ruoloResponsabile;
	}
	public Date getDataFinePfpgResponsabile() {
		if (dataFinePfpgResponsabile != null) {
			return new java.sql.Date(dataFinePfpgResponsabile.getTime());
		} else {
			return null;
		}
	}
	public void setDataFinePfpgResponsabile(Date dataFinePfpgResponsabile) {
		
		if (dataFinePfpgResponsabile != null) {
			this.dataFinePfpgResponsabile = new java.sql.Date(dataFinePfpgResponsabile.getTime());
		} else {
			this.dataFinePfpgResponsabile = null;
		}
	}
	public String getRuoloFunz() {
		return ruoloFunz;
	}
	public void setRuoloFunz(String ruoloFunz) {
		this.ruoloFunz = ruoloFunz;
	}
	public String getDesRuoloFunz() {
		return desRuoloFunz;
	}
	public void setDesRuoloFunz(String desRuoloFunz) {
		this.desRuoloFunz = desRuoloFunz;
	}
	public String getCodiceFiscaleProprietario() {
		return codiceFiscaleProprietario;
	}
	public void setCodiceFiscaleProprietario(String codiceFiscaleProprietario) {
		this.codiceFiscaleProprietario = codiceFiscaleProprietario;
	}
	public String getDenominazioneProprietario() {
		return denominazioneProprietario;
	}
	public void setDenominazioneProprietario(String denominazioneProprietario) {
		this.denominazioneProprietario = denominazioneProprietario;
	}
	
}
