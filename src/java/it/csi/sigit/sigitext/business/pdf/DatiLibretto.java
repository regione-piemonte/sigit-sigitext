/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.pdf;

import java.util.List;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.CombustibileCITDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.FluidoCITDto;
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
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVSk4CgDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVSk4GfDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVSk4GtDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVSk4ScDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitVTotImpiantoDto;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.UnitaMisuraCITDto;

public class DatiLibretto {

	private SigitTImpiantoDto impianto;
	
	private List<CombustibileCITDto> elencoCombustibile;

	private List<MarcaCITDto> elencoFabbricante;

	private List<FluidoCITDto> elencoFluidoTermoVett;
	
	private List<UnitaMisuraCITDto> elencoUM;
	
	private List<SigitTUnitaImmobiliareDto> unitaImmobiliList;
	
	private SigitTTrattH2ODto trattH2O;
	
	private List<SigitVSk4GtDto> comSk4GtImpianto;
	
	private List<SigitTCompBrRcDto> compBrImpianto;
	
	private List<SigitTCompBrRcDto> compRcImpianto;
	
	private List<SigitVSk4GfDto> comSk4GfImpianto;
	
	private List<SigitVSk4ScDto> comSk4ScImpianto;
	
	private List<SigitVSk4CgDto> comSk4CgImpianto;
	
	private List<SigitVCompCsDto> compCsImpianto;
	
	private List<SigitVCompAgDto> compAgImpianto;
	
	private SigitTCompXSempliceDto compXSemplice;
	
	private List<SigitVCompSrDto> srList;
	
	private List<SigitVCompVrDto> vrList;
	
	private List<SigitTCompVxDto> vxList;
	
	private List<SigitVCompPoDto> poList;
	
	private List<SigitVCompAcDto> acList;
	
	private List<SigitVCompTeDto> teList;
	
	private List<SigitVCompRvDto> rvList;
	
	private List<SigitTCompXDto> scxList;
	
	private List<SigitVCompCiDto> ciList;
	
	private List<SigitVCompUtDto> utList;
	
	private List<SigitVCompRcDto> rcList;
	
	private List<SigitVCompVmDto> vmList;
	
	private List<SigitVTotImpiantoDto> respAttivi;
	
	private List<SigitExtContrattoImpDto> contratti;
	
	private List<SigitVCompGtDettDto> compGtImpiantoDett;
	
	private List<SigitVCompGfDettDto> compGfImpiantoDett;
	
	private List<SigitVCompScDettDto> compScImpiantoDett;
	
	private List<SigitVCompCgDettDto> compCgImpiantoDett;
	
	private List<SigitVRicercaAllegatiDto> listControlliEfficenza;
	
	private List<DettaglioIspezione> dettaglioIspezioneList;
	
	private List<SigitVRicercaAllegatiDto> manutenzioniList;
	
	private List<SigitTConsumoDto> combustibileList;
	
	private List<SigitTConsumoDto> energiaElettricaList;
	
	private List<SigitTConsumoDto> h2oList;
	
	private List<SigitTConsumo14_4Dto> prodottiChimiciList;

	
	public DatiLibretto() {
		
	}
	
	public SigitTImpiantoDto getImpianto() {
		return impianto;
	}

	public void setImpianto(SigitTImpiantoDto impianto) {
		this.impianto = impianto;
	}
	
	public List<CombustibileCITDto> getElencoCombustibile() {
		return elencoCombustibile;
	}

	public void setElencoCombustibile(List<CombustibileCITDto> elencoCombustibile) {
		this.elencoCombustibile = elencoCombustibile;
	}

	public List<MarcaCITDto> getElencoFabbricante() {
		return elencoFabbricante;
	}

	public void setElencoFabbricante(List<MarcaCITDto> elencoFabbricante) {
		this.elencoFabbricante = elencoFabbricante;
	}

	public List<FluidoCITDto> getElencoFluidoTermoVett() {
		return elencoFluidoTermoVett;
	}

	public void setElencoFluidoTermoVett(List<FluidoCITDto> elencoFluidoTermoVett) {
		this.elencoFluidoTermoVett = elencoFluidoTermoVett;
	}

	public List<UnitaMisuraCITDto> getElencoUM() {
		return elencoUM;
	}

	public void setElencoUM(List<UnitaMisuraCITDto> elencoUM) {
		this.elencoUM = elencoUM;
	}

	public List<SigitTUnitaImmobiliareDto> getUnitaImmobiliList() {
		return unitaImmobiliList;
	}

	public void setUnitaImmobiliList(List<SigitTUnitaImmobiliareDto> unitaImmobiliList) {
		this.unitaImmobiliList = unitaImmobiliList;
	}

	public SigitTTrattH2ODto getTrattH2O() {
		return trattH2O;
	}

	public void setTrattH2O(SigitTTrattH2ODto trattH2O) {
		this.trattH2O = trattH2O;
	}

	public List<SigitVSk4GtDto> getComSk4GtImpianto() {
		return comSk4GtImpianto;
	}

	public void setComSk4GtImpianto(List<SigitVSk4GtDto> comSk4GtImpianto) {
		this.comSk4GtImpianto = comSk4GtImpianto;
	}

	public List<SigitTCompBrRcDto> getCompBrImpianto() {
		return compBrImpianto;
	}

	public void setCompBrImpianto(List<SigitTCompBrRcDto> compBrImpianto) {
		this.compBrImpianto = compBrImpianto;
	}

	public List<SigitTCompBrRcDto> getCompRcImpianto() {
		return compRcImpianto;
	}

	public void setCompRcImpianto(List<SigitTCompBrRcDto> compRcImpianto) {
		this.compRcImpianto = compRcImpianto;
	}

	public List<SigitVSk4GfDto> getComSk4GfImpianto() {
		return comSk4GfImpianto;
	}

	public void setComSk4GfImpianto(List<SigitVSk4GfDto> comSk4GfImpianto) {
		this.comSk4GfImpianto = comSk4GfImpianto;
	}

	public List<SigitVSk4ScDto> getComSk4ScImpianto() {
		return comSk4ScImpianto;
	}

	public void setComSk4ScImpianto(List<SigitVSk4ScDto> comSk4ScImpianto) {
		this.comSk4ScImpianto = comSk4ScImpianto;
	}

	public List<SigitVSk4CgDto> getComSk4CgImpianto() {
		return comSk4CgImpianto;
	}

	public void setComSk4CgImpianto(List<SigitVSk4CgDto> comSk4CgImpianto) {
		this.comSk4CgImpianto = comSk4CgImpianto;
	}

	public List<SigitVCompCsDto> getCompCsImpianto() {
		return compCsImpianto;
	}

	public void setCompCsImpianto(List<SigitVCompCsDto> compCsImpianto) {
		this.compCsImpianto = compCsImpianto;
	}

	public List<SigitVCompAgDto> getCompAgImpianto() {
		return compAgImpianto;
	}

	public void setCompAgImpianto(List<SigitVCompAgDto> compAgImpianto) {
		this.compAgImpianto = compAgImpianto;
	}

	public SigitTCompXSempliceDto getCompXSemplice() {
		return compXSemplice;
	}

	public void setCompXSemplice(SigitTCompXSempliceDto compXSemplice) {
		this.compXSemplice = compXSemplice;
	}

	public List<SigitVCompSrDto> getSrList() {
		return srList;
	}

	public void setSrList(List<SigitVCompSrDto> srList) {
		this.srList = srList;
	}

	public List<SigitVCompVrDto> getVrList() {
		return vrList;
	}

	public void setVrList(List<SigitVCompVrDto> vrList) {
		this.vrList = vrList;
	}

	public List<SigitTCompVxDto> getVxList() {
		return vxList;
	}

	public void setVxList(List<SigitTCompVxDto> vxList) {
		this.vxList = vxList;
	}

	public List<SigitVCompPoDto> getPoList() {
		return poList;
	}

	public void setPoList(List<SigitVCompPoDto> poList) {
		this.poList = poList;
	}

	public List<SigitVCompAcDto> getAcList() {
		return acList;
	}

	public void setAcList(List<SigitVCompAcDto> acList) {
		this.acList = acList;
	}

	public List<SigitVCompTeDto> getTeList() {
		return teList;
	}

	public void setTeList(List<SigitVCompTeDto> teList) {
		this.teList = teList;
	}

	public List<SigitVCompRvDto> getRvList() {
		return rvList;
	}

	public void setRvList(List<SigitVCompRvDto> rvList) {
		this.rvList = rvList;
	}

	public List<SigitTCompXDto> getScxList() {
		return scxList;
	}

	public void setScxList(List<SigitTCompXDto> scxList) {
		this.scxList = scxList;
	}

	public List<SigitVCompCiDto> getCiList() {
		return ciList;
	}

	public void setCiList(List<SigitVCompCiDto> ciList) {
		this.ciList = ciList;
	}

	public List<SigitVCompUtDto> getUtList() {
		return utList;
	}

	public void setUtList(List<SigitVCompUtDto> utList) {
		this.utList = utList;
	}

	public List<SigitVCompRcDto> getRcList() {
		return rcList;
	}

	public void setRcList(List<SigitVCompRcDto> rcList) {
		this.rcList = rcList;
	}

	public List<SigitVCompVmDto> getVmList() {
		return vmList;
	}

	public void setVmList(List<SigitVCompVmDto> vmList) {
		this.vmList = vmList;
	}

	public List<SigitVTotImpiantoDto> getRespAttivi() {
		return respAttivi;
	}

	public void setRespAttivi(List<SigitVTotImpiantoDto> respAttivi) {
		this.respAttivi = respAttivi;
	}

	public List<SigitExtContrattoImpDto> getContratti() {
		return contratti;
	}

	public void setContratti(List<SigitExtContrattoImpDto> contratti) {
		this.contratti = contratti;
	}

	public List<SigitVCompGtDettDto> getCompGtImpiantoDett() {
		return compGtImpiantoDett;
	}

	public void setCompGtImpiantoDett(List<SigitVCompGtDettDto> compGtImpiantoDett) {
		this.compGtImpiantoDett = compGtImpiantoDett;
	}

	public List<SigitVCompGfDettDto> getCompGfImpiantoDett() {
		return compGfImpiantoDett;
	}

	public void setCompGfImpiantoDett(List<SigitVCompGfDettDto> compGfImpiantoDett) {
		this.compGfImpiantoDett = compGfImpiantoDett;
	}

	public List<SigitVCompScDettDto> getCompScImpiantoDett() {
		return compScImpiantoDett;
	}

	public void setCompScImpiantoDett(List<SigitVCompScDettDto> compScImpiantoDett) {
		this.compScImpiantoDett = compScImpiantoDett;
	}

	public List<SigitVCompCgDettDto> getCompCgImpiantoDett() {
		return compCgImpiantoDett;
	}

	public void setCompCgImpiantoDett(List<SigitVCompCgDettDto> compCgImpiantoDett) {
		this.compCgImpiantoDett = compCgImpiantoDett;
	}

	public List<SigitVRicercaAllegatiDto> getListControlliEfficenza() {
		return listControlliEfficenza;
	}

	public void setListControlliEfficenza(List<SigitVRicercaAllegatiDto> listControlliEfficenza) {
		this.listControlliEfficenza = listControlliEfficenza;
	}

	public List<DettaglioIspezione> getDettaglioIspezioneList() {
		return dettaglioIspezioneList;
	}

	public void setDettaglioIspezioneList(List<DettaglioIspezione> dettaglioIspezioneList) {
		this.dettaglioIspezioneList = dettaglioIspezioneList;
	}

	public List<SigitVRicercaAllegatiDto> getManutenzioniList() {
		return manutenzioniList;
	}

	public void setManutenzioniList(List<SigitVRicercaAllegatiDto> manutenzioniList) {
		this.manutenzioniList = manutenzioniList;
	}

	public List<SigitTConsumoDto> getCombustibileList() {
		return combustibileList;
	}

	public void setCombustibileList(List<SigitTConsumoDto> combustibileList) {
		this.combustibileList = combustibileList;
	}

	public List<SigitTConsumoDto> getEnergiaElettricaList() {
		return energiaElettricaList;
	}

	public void setEnergiaElettricaList(List<SigitTConsumoDto> energiaElettricaList) {
		this.energiaElettricaList = energiaElettricaList;
	}

	public List<SigitTConsumoDto> getH2oList() {
		return h2oList;
	}

	public void setH2oList(List<SigitTConsumoDto> h2oList) {
		this.h2oList = h2oList;
	}

	public List<SigitTConsumo14_4Dto> getProdottiChimiciList() {
		return prodottiChimiciList;
	}

	public void setProdottiChimiciList(List<SigitTConsumo14_4Dto> prodottiChimiciList) {
		this.prodottiChimiciList = prodottiChimiciList;
	}

	@Override
	public String toString() {
		return "DatiLibretto [elencoCombustibile=" + elencoCombustibile + ", elencoFabbricante=" + elencoFabbricante
				+ ", elencoFluidoTermoVett=" + elencoFluidoTermoVett + ", elencoUM=" + elencoUM + ", trattH2O="
				+ trattH2O + ", comSk4GtImpianto=" + comSk4GtImpianto + ", compBrImpianto=" + compBrImpianto
				+ ", compRcImpianto=" + compRcImpianto + ", comSk4GfImpianto=" + comSk4GfImpianto
				+ ", comSk4ScImpianto=" + comSk4ScImpianto + ", comSk4CgImpianto=" + comSk4CgImpianto
				+ ", compCsImpianto=" + compCsImpianto + ", compAgImpianto=" + compAgImpianto + ", compXSemplice="
				+ compXSemplice + ", srList=" + srList + ", vrList=" + vrList + ", vxList=" + vxList + ", poList="
				+ poList + ", acList=" + acList + ", teList=" + teList + ", rvList=" + rvList + ", scxList=" + scxList
				+ ", ciList=" + ciList + ", utList=" + utList + ", rcList=" + rcList + ", vmList=" + vmList
				+ ", respAttivi=" + respAttivi + ", contratti=" + contratti + ", compGtImpiantoDett="
				+ compGtImpiantoDett + ", compGfImpiantoDett=" + compGfImpiantoDett + ", compScImpiantoDett="
				+ compScImpiantoDett + ", compCgImpiantoDett=" + compCgImpiantoDett + ", listControlliEfficenza="
				+ listControlliEfficenza + ", dettaglioIspezioneList=" + dettaglioIspezioneList + ", manutenzioniList="
				+ manutenzioniList + ", combustibileList=" + combustibileList + ", energiaElettricaList="
				+ energiaElettricaList + ", h2oList=" + h2oList + ", prodottiChimiciList=" + prodottiChimiciList + "]";
	}
}
