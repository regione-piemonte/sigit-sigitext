package it.csi.sigit.sigitext.business.dao.sigitextdao.qbe;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTCompXSempliceDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTCompXSempliceExample extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk codiceImpianto;

	/**
	 * @generated
	 */
	public void setCodiceImpianto(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		codiceImpianto = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getCodiceImpianto() {
		return codiceImpianto;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l51FlgSrOnoff;

	/**
	 * @generated
	 */
	public void setL51FlgSrOnoff(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l51FlgSrOnoff = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL51FlgSrOnoff() {
		return l51FlgSrOnoff;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l51FlgSrGeneratore;

	/**
	 * @generated
	 */
	public void setL51FlgSrGeneratore(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l51FlgSrGeneratore = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL51FlgSrGeneratore() {
		return l51FlgSrGeneratore;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l51FlgSrIndipendente;

	/**
	 * @generated
	 */
	public void setL51FlgSrIndipendente(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l51FlgSrIndipendente = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL51FlgSrIndipendente() {
		return l51FlgSrIndipendente;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l51FlgValvoleRegolazione;

	/**
	 * @generated
	 */
	public void setL51FlgValvoleRegolazione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l51FlgValvoleRegolazione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL51FlgValvoleRegolazione() {
		return l51FlgValvoleRegolazione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l51FlgSrMultigradino;

	/**
	 * @generated
	 */
	public void setL51FlgSrMultigradino(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l51FlgSrMultigradino = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL51FlgSrMultigradino() {
		return l51FlgSrMultigradino;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l51FlgSrInverter;

	/**
	 * @generated
	 */
	public void setL51FlgSrInverter(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l51FlgSrInverter = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL51FlgSrInverter() {
		return l51FlgSrInverter;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l51FlgSrAltri;

	/**
	 * @generated
	 */
	public void setL51FlgSrAltri(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l51FlgSrAltri = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL51FlgSrAltri() {
		return l51FlgSrAltri;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l51SrDescrizione;

	/**
	 * @generated
	 */
	public void setL51SrDescrizione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l51SrDescrizione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL51SrDescrizione() {
		return l51SrDescrizione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l52FlgTermoOnoff;

	/**
	 * @generated
	 */
	public void setL52FlgTermoOnoff(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l52FlgTermoOnoff = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL52FlgTermoOnoff() {
		return l52FlgTermoOnoff;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l52FlgTermoProporzionale;

	/**
	 * @generated
	 */
	public void setL52FlgTermoProporzionale(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l52FlgTermoProporzionale = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL52FlgTermoProporzionale() {
		return l52FlgTermoProporzionale;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l52FlgContrEntalpico;

	/**
	 * @generated
	 */
	public void setL52FlgContrEntalpico(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l52FlgContrEntalpico = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL52FlgContrEntalpico() {
		return l52FlgContrEntalpico;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l52FlgContrPortata;

	/**
	 * @generated
	 */
	public void setL52FlgContrPortata(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l52FlgContrPortata = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL52FlgContrPortata() {
		return l52FlgContrPortata;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l52FlgValvoleTermo;

	/**
	 * @generated
	 */
	public void setL52FlgValvoleTermo(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l52FlgValvoleTermo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL52FlgValvoleTermo() {
		return l52FlgValvoleTermo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l52FlgValvole2;

	/**
	 * @generated
	 */
	public void setL52FlgValvole2(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l52FlgValvole2 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL52FlgValvole2() {
		return l52FlgValvole2;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l52FlgValvole3;

	/**
	 * @generated
	 */
	public void setL52FlgValvole3(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l52FlgValvole3 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL52FlgValvole3() {
		return l52FlgValvole3;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l52Note;

	/**
	 * @generated
	 */
	public void setL52Note(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l52Note = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL52Note() {
		return l52Note;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l53FlgTelelettura;

	/**
	 * @generated
	 */
	public void setL53FlgTelelettura(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l53FlgTelelettura = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL53FlgTelelettura() {
		return l53FlgTelelettura;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l53FlgTelegestione;

	/**
	 * @generated
	 */
	public void setL53FlgTelegestione(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l53FlgTelegestione = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL53FlgTelegestione() {
		return l53FlgTelegestione;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l53DesSistemaInstallaz;

	/**
	 * @generated
	 */
	public void setL53DesSistemaInstallaz(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l53DesSistemaInstallaz = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL53DesSistemaInstallaz() {
		return l53DesSistemaInstallaz;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l53DataSostituz;

	/**
	 * @generated
	 */
	public void setL53DataSostituz(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l53DataSostituz = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL53DataSostituz() {
		return l53DataSostituz;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l53DesSistemaSostituz;

	/**
	 * @generated
	 */
	public void setL53DesSistemaSostituz(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l53DesSistemaSostituz = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL53DesSistemaSostituz() {
		return l53DesSistemaSostituz;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l54FlgUic;

	/**
	 * @generated
	 */
	public void setL54FlgUic(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l54FlgUic = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL54FlgUic() {
		return l54FlgUic;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l54FlgRisc;

	/**
	 * @generated
	 */
	public void setL54FlgRisc(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l54FlgRisc = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL54FlgRisc() {
		return l54FlgRisc;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l54FlgRaff;

	/**
	 * @generated
	 */
	public void setL54FlgRaff(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l54FlgRaff = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL54FlgRaff() {
		return l54FlgRaff;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l54FlgAcs;

	/**
	 * @generated
	 */
	public void setL54FlgAcs(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l54FlgAcs = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL54FlgAcs() {
		return l54FlgAcs;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l54FlgTipologia;

	/**
	 * @generated
	 */
	public void setL54FlgTipologia(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l54FlgTipologia = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL54FlgTipologia() {
		return l54FlgTipologia;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l54DesSistemaInstallaz;

	/**
	 * @generated
	 */
	public void setL54DesSistemaInstallaz(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l54DesSistemaInstallaz = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL54DesSistemaInstallaz() {
		return l54DesSistemaInstallaz;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l54DataSostituz;

	/**
	 * @generated
	 */
	public void setL54DataSostituz(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l54DataSostituz = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL54DataSostituz() {
		return l54DataSostituz;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l54DesSistemaSostituz;

	/**
	 * @generated
	 */
	public void setL54DesSistemaSostituz(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l54DesSistemaSostituz = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL54DesSistemaSostituz() {
		return l54DesSistemaSostituz;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l61FlgVerticale;

	/**
	 * @generated
	 */
	public void setL61FlgVerticale(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l61FlgVerticale = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL61FlgVerticale() {
		return l61FlgVerticale;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l61FlgOrizzontale;

	/**
	 * @generated
	 */
	public void setL61FlgOrizzontale(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l61FlgOrizzontale = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL61FlgOrizzontale() {
		return l61FlgOrizzontale;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l61FlgCan;

	/**
	 * @generated
	 */
	public void setL61FlgCan(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l61FlgCan = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL61FlgCan() {
		return l61FlgCan;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l61Altro;

	/**
	 * @generated
	 */
	public void setL61Altro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l61Altro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL61Altro() {
		return l61Altro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l62FlgCoibent;

	/**
	 * @generated
	 */
	public void setL62FlgCoibent(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l62FlgCoibent = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL62FlgCoibent() {
		return l62FlgCoibent;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l62Note;

	/**
	 * @generated
	 */
	public void setL62Note(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l62Note = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL62Note() {
		return l62Note;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l70FlgRadiatori;

	/**
	 * @generated
	 */
	public void setL70FlgRadiatori(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l70FlgRadiatori = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL70FlgRadiatori() {
		return l70FlgRadiatori;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l70FlgTermoconvettori;

	/**
	 * @generated
	 */
	public void setL70FlgTermoconvettori(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l70FlgTermoconvettori = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL70FlgTermoconvettori() {
		return l70FlgTermoconvettori;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l70FlgVentilconvettori;

	/**
	 * @generated
	 */
	public void setL70FlgVentilconvettori(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l70FlgVentilconvettori = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL70FlgVentilconvettori() {
		return l70FlgVentilconvettori;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l70FlgPannelli;

	/**
	 * @generated
	 */
	public void setL70FlgPannelli(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l70FlgPannelli = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL70FlgPannelli() {
		return l70FlgPannelli;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l70FlgBocchette;

	/**
	 * @generated
	 */
	public void setL70FlgBocchette(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l70FlgBocchette = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL70FlgBocchette() {
		return l70FlgBocchette;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l70FlgStrisce;

	/**
	 * @generated
	 */
	public void setL70FlgStrisce(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l70FlgStrisce = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL70FlgStrisce() {
		return l70FlgStrisce;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l70FlgTravi;

	/**
	 * @generated
	 */
	public void setL70FlgTravi(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l70FlgTravi = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL70FlgTravi() {
		return l70FlgTravi;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk l70Altro;

	/**
	 * @generated
	 */
	public void setL70Altro(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		l70Altro = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getL70Altro() {
		return l70Altro;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk dataUltMod;

	/**
	 * @generated
	 */
	public void setDataUltMod(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		dataUltMod = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getDataUltMod() {
		return dataUltMod;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.business.dao.qbe.FieldChk utenteUltMod;

	/**
	 * @generated
	 */
	public void setUtenteUltMod(it.csi.sigit.sigitext.business.dao.qbe.FieldChk chk) {
		utenteUltMod = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.business.dao.qbe.FieldChk getUtenteUltMod() {
		return utenteUltMod;
	}

}
