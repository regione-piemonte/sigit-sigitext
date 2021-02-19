package it.csi.sigit.sigitext.business.dao.sigitextdao.dto;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitTRappTipo2Dao.
 * @generated
 */
public class SigitTRappTipo2Dto extends SigitTRappTipo2Pk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna D_FLG_LOCALE_IDONEO
	 * @generated
	 */
	protected java.math.BigDecimal dFlgLocaleIdoneo;

	/**
	 * Imposta il valore della proprieta' dFlgLocaleIdoneo associata alla
	 * colonna D_FLG_LOCALE_IDONEO.
	 * @generated
	 */
	public void setDFlgLocaleIdoneo(java.math.BigDecimal val) {

		dFlgLocaleIdoneo = val;

	}

	/**
	 * Legge il valore della proprieta' dFlgLocaleIdoneo associata alla
	 * @generated
	 */
	public java.math.BigDecimal getDFlgLocaleIdoneo() {

		return dFlgLocaleIdoneo;

	}

	/**
	 * store della proprieta' associata alla colonna D_FLG_APERTURE_LIBERE
	 * @generated
	 */
	protected java.math.BigDecimal dFlgApertureLibere;

	/**
	 * Imposta il valore della proprieta' dFlgApertureLibere associata alla
	 * colonna D_FLG_APERTURE_LIBERE.
	 * @generated
	 */
	public void setDFlgApertureLibere(java.math.BigDecimal val) {

		dFlgApertureLibere = val;

	}

	/**
	 * Legge il valore della proprieta' dFlgApertureLibere associata alla
	 * @generated
	 */
	public java.math.BigDecimal getDFlgApertureLibere() {

		return dFlgApertureLibere;

	}

	/**
	 * store della proprieta' associata alla colonna D_FLG_APERTURE_ADEG
	 * @generated
	 */
	protected java.math.BigDecimal dFlgApertureAdeg;

	/**
	 * Imposta il valore della proprieta' dFlgApertureAdeg associata alla
	 * colonna D_FLG_APERTURE_ADEG.
	 * @generated
	 */
	public void setDFlgApertureAdeg(java.math.BigDecimal val) {

		dFlgApertureAdeg = val;

	}

	/**
	 * Legge il valore della proprieta' dFlgApertureAdeg associata alla
	 * @generated
	 */
	public java.math.BigDecimal getDFlgApertureAdeg() {

		return dFlgApertureAdeg;

	}

	/**
	 * store della proprieta' associata alla colonna D_FLG_LINEA_ELETT_IDONEA
	 * @generated
	 */
	protected java.math.BigDecimal dFlgLineaElettIdonea;

	/**
	 * Imposta il valore della proprieta' dFlgLineaElettIdonea associata alla
	 * colonna D_FLG_LINEA_ELETT_IDONEA.
	 * @generated
	 */
	public void setDFlgLineaElettIdonea(java.math.BigDecimal val) {

		dFlgLineaElettIdonea = val;

	}

	/**
	 * Legge il valore della proprieta' dFlgLineaElettIdonea associata alla
	 * @generated
	 */
	public java.math.BigDecimal getDFlgLineaElettIdonea() {

		return dFlgLineaElettIdonea;

	}

	/**
	 * store della proprieta' associata alla colonna F_FLG_SOSTITUZ_GENERATORI
	 * @generated
	 */
	protected java.math.BigDecimal fFlgSostituzGeneratori;

	/**
	 * Imposta il valore della proprieta' fFlgSostituzGeneratori associata alla
	 * colonna F_FLG_SOSTITUZ_GENERATORI.
	 * @generated
	 */
	public void setFFlgSostituzGeneratori(java.math.BigDecimal val) {

		fFlgSostituzGeneratori = val;

	}

	/**
	 * Legge il valore della proprieta' fFlgSostituzGeneratori associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFFlgSostituzGeneratori() {

		return fFlgSostituzGeneratori;

	}

	/**
	 * store della proprieta' associata alla colonna F_FLG_SOSTITUZ_SISTEMI_REG
	 * @generated
	 */
	protected java.math.BigDecimal fFlgSostituzSistemiReg;

	/**
	 * Imposta il valore della proprieta' fFlgSostituzSistemiReg associata alla
	 * colonna F_FLG_SOSTITUZ_SISTEMI_REG.
	 * @generated
	 */
	public void setFFlgSostituzSistemiReg(java.math.BigDecimal val) {

		fFlgSostituzSistemiReg = val;

	}

	/**
	 * Legge il valore della proprieta' fFlgSostituzSistemiReg associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFFlgSostituzSistemiReg() {

		return fFlgSostituzSistemiReg;

	}

	/**
	 * store della proprieta' associata alla colonna F_FLG_ISOL_DISTRIBUZ_H2O
	 * @generated
	 */
	protected java.math.BigDecimal fFlgIsolDistribuzH2o;

	/**
	 * Imposta il valore della proprieta' fFlgIsolDistribuzH2o associata alla
	 * colonna F_FLG_ISOL_DISTRIBUZ_H2O.
	 * @generated
	 */
	public void setFFlgIsolDistribuzH2o(java.math.BigDecimal val) {

		fFlgIsolDistribuzH2o = val;

	}

	/**
	 * Legge il valore della proprieta' fFlgIsolDistribuzH2o associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFFlgIsolDistribuzH2o() {

		return fFlgIsolDistribuzH2o;

	}

	/**
	 * store della proprieta' associata alla colonna F_FLG_ISOL_DISTRIBUZ_ARIA
	 * @generated
	 */
	protected java.math.BigDecimal fFlgIsolDistribuzAria;

	/**
	 * Imposta il valore della proprieta' fFlgIsolDistribuzAria associata alla
	 * colonna F_FLG_ISOL_DISTRIBUZ_ARIA.
	 * @generated
	 */
	public void setFFlgIsolDistribuzAria(java.math.BigDecimal val) {

		fFlgIsolDistribuzAria = val;

	}

	/**
	 * Legge il valore della proprieta' fFlgIsolDistribuzAria associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFFlgIsolDistribuzAria() {

		return fFlgIsolDistribuzAria;

	}

	/**
	 * store della proprieta' associata alla colonna C_FLG_TRATT_CLIMA_NON_RICHIEST
	 * @generated
	 */
	protected java.math.BigDecimal cFlgTrattClimaNonRichiest;

	/**
	 * Imposta il valore della proprieta' cFlgTrattClimaNonRichiest associata alla
	 * colonna C_FLG_TRATT_CLIMA_NON_RICHIEST.
	 * @generated
	 */
	public void setCFlgTrattClimaNonRichiest(java.math.BigDecimal val) {

		cFlgTrattClimaNonRichiest = val;

	}

	/**
	 * Legge il valore della proprieta' cFlgTrattClimaNonRichiest associata alla
	 * @generated
	 */
	public java.math.BigDecimal getCFlgTrattClimaNonRichiest() {

		return cFlgTrattClimaNonRichiest;

	}

	/**
	 * store della proprieta' associata alla colonna D_FLG_COIB_IDONEA
	 * @generated
	 */
	protected java.math.BigDecimal dFlgCoibIdonea;

	/**
	 * Imposta il valore della proprieta' dFlgCoibIdonea associata alla
	 * colonna D_FLG_COIB_IDONEA.
	 * @generated
	 */
	public void setDFlgCoibIdonea(java.math.BigDecimal val) {

		dFlgCoibIdonea = val;

	}

	/**
	 * Legge il valore della proprieta' dFlgCoibIdonea associata alla
	 * @generated
	 */
	public java.math.BigDecimal getDFlgCoibIdonea() {

		return dFlgCoibIdonea;

	}

	/**
	 * Crea una istanza di SigitTRappTipo2Pk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitTRappTipo2Pk
	 * @generated
	 */
	public SigitTRappTipo2Pk createPk() {
		return new SigitTRappTipo2Pk(idAllegato);
	}

	/**
	 * la semantica dell'equals del DTO e' la stessa della PK
	 * (ovvero della superclasse).
	 * @param other l'oggetto con cui effettuare il confronto
	 * @return true se i due oggetti sono semanticamente da considerarsi uguali
	 */
	public boolean equals(Object other) {
		return super.equals(other);
	}

	/**
	 * la semantica dell'hashCode del DTO e' la stessa della PK
	 * (ovvero della superclasse).
	 * 
	 * @return int
	 */
	public int hashCode() {
		return super.hashCode();
	}

}
