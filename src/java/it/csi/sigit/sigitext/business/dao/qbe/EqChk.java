package it.csi.sigit.sigitext.business.dao.qbe;

/**
 * 
 * Verifica di uguaglianza del valore del campo con un valore costante. 
 * @generated
 */
public class EqChk extends FieldChk {

	private final Object exVal;
	private final boolean ignoreCase;

	/**
	 * @param equalsTo valore di confronto 
	 * @generated
	 */
	public EqChk(Object equalsTo) {
		assert equalsTo != null;
		exVal = equalsTo;
		ignoreCase = false;
	}

	/**
	 * @generated
	 */
	public boolean valueHasWildcards() {
		if (!(exVal instanceof String))
			return false;
		else {
			return (((String) exVal).indexOf("%") > -1);
		}
	}

	/**
	 * @param equalsTo valore di confronto 
	 * @param ignoreCase ignora il case in caso di tipo stringa
	 * @generated
	 */
	public EqChk(Object equalsTo, boolean p_ignoreCase) {
		assert equalsTo != null;
		exVal = equalsTo;
		ignoreCase = p_ignoreCase;
	}
	/**
	 * @generated
	 */
	public Object getExVal() {
		return exVal;
	}

	/**
	 * @generated
	 */
	public boolean isIgnoreCase() {
		return ignoreCase;
	}
}
