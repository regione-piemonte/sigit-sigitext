package it.csi.sigit.sigitext.business.dao.qbe;

/**
 * 
 * Verifica di appartenenza ad un insieme discreto di valori costanti 
 * @generated
 */
public class InSetChk extends FieldChk {

	/**
	 * @generated
	 */
	private final Object[] items;

	/**
	 * 
	 * @param items insieme degli elementi dell'insieme di riferimento 
	 * @generated
	 */
	public InSetChk(Object[] p_items) {
		assert p_items != null && p_items.length > 0;
		items = new Object[p_items.length];
		System.arraycopy(p_items, 0, items, 0, p_items.length);
	}
	/**
	 * @generated
	 */
	public Object[] getItems() {
		Object ris[] = new Object[items.length];
		System.arraycopy(items, 0, ris, 0, items.length);
		return ris;
	}
}
