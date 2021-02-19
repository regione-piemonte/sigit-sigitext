package it.csi.sigit.sigitext.business.dao.qbe;

/**
 * 
 * Verifica di conformita' con una regular expression 
 * @generated
 */
public class RegexpChk extends FieldChk {

	/**
	 * @generated
	 */
	private final String regexp;

	/**
	 * @param equalsTo valore di confronto 
	 * @generated
	 */
	public RegexpChk(String p_regexp) {
		assert p_regexp != null && p_regexp.length() > 0;
		regexp = p_regexp;
	}

	/**
	 * @generated
	 */
	public String getRegexp() {
		return regexp;
	}
}
