/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.pdf;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVRicercaIspezioniConsByCodiceImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVRicercaIspezioniDto;

public class DettaglioIspezione {

	private SigitVRicercaIspezioniConsByCodiceImpiantoDto ispezioneDb;
	private SigitVRicercaIspezioniDto ispezIspet;
	private String elencoIdAllegati;
	
	public DettaglioIspezione() {
		
	}
	
	public SigitVRicercaIspezioniConsByCodiceImpiantoDto getIspezioneDb() {
		return ispezioneDb;
	}
	public void setIspezioneDb(SigitVRicercaIspezioniConsByCodiceImpiantoDto ispezioneDb) {
		this.ispezioneDb = ispezioneDb;
	}
	public SigitVRicercaIspezioniDto getIspezIspet() {
		return ispezIspet;
	}
	public void setIspezIspet(SigitVRicercaIspezioniDto ispezIspet) {
		this.ispezIspet = ispezIspet;
	}
	public String getElencoIdAllegati() {
		return elencoIdAllegati;
	}
	public void setElencoIdAllegati(String elencoIdAllegati) {
		this.elencoIdAllegati = elencoIdAllegati;
	}

	@Override
	public String toString() {
		return "DettaglioIspezione [ispezioneDb=" + ispezioneDb + ", ispezIspet=" + ispezIspet + ", elencoIdAllegati="
				+ elencoIdAllegati + "]";
	}
}
