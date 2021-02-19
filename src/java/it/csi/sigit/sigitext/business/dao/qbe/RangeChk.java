package it.csi.sigit.sigitext.business.dao.qbe;

/**
 * 
 * Verifica di appartenenza ad un range continuo 
 * @generated
 */
public class RangeChk extends FieldChk {

	/**
	 * @generated
	 */
	private final Object lowerBound;

	/**
	 * @generated
	 */
	private final Object upperBound;

	/**
	 * @generated
	 */
	private final boolean includeLB;

	/**
	 * @generated
	 */
	private final boolean includeUB;

	/**
	 * @param lowerBound l'estremo inferiore del range (se non specificato il check &egrave; a -infinito)
	 * @param upperBound l'estremo superiore del range (se non specificato il check &egrave; a +infinito)
	 * @param includeLB include o meno il lowerbound tra i valori ammessi
	 * @param includeUB include o meno l'upperbound tra i valori ammessi 
	 * @generated
	 */
	public RangeChk(Object p_lowerBound, Object p_upperBound, boolean p_includeLB, boolean p_includeUB) {
		assert p_lowerBound != null || p_upperBound != null;
		lowerBound = p_lowerBound;
		upperBound = p_upperBound;
		includeLB = p_includeLB;
		includeUB = p_includeUB;
	}

	/**
	 * @generated
	 */
	public Object getLowerBound() {
		return lowerBound;
	}

	/**
	 * @generated
	 */
	public Object getUpperBound() {
		return upperBound;
	}

	/**
	 * @generated
	 */
	public boolean isLBIncluded() {
		return includeLB;
	}

	/**
	 * @generated
	 */
	public boolean isUBIncluded() {
		return includeUB;
	}
}
