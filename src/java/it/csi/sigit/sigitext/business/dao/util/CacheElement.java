package it.csi.sigit.sigitext.business.dao.util;

/**
 * elemento della cache con indicazione dell'istante di inserimento in cache (per TTL)
 * @generated
 */
public class CacheElement {
	/**
	 * istante di ultimo accesso all'elemento
	* @generated
	*/
	long lastAccess = 0;

	/**
	 * il valore mantenuto in cache
	* @generated
	*/
	Object value = null;

	/**
	 * @return l'istante di ultimo accesso all'oggetto
	* @generated
	*/
	public long getLastAccess() {
		return lastAccess;
	}

	/**
	 * imposta l'istante di ultimo accesso all'oggetto
	 * @param lastAccess l'istante di ultimo accesso all'oggetto
	 * @generated
	 */
	public void setLastAccess(long lastAccess) {
		this.lastAccess = lastAccess;
	}

	/**
	 * @return il valore dell'elemento di cache
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * imposta il valore dell'elemento di cache
	 * @param value il valore da conservare in cache
	 * @generated
	 */
	public void setValue(Object value) {
		this.value = value;
	}

}
