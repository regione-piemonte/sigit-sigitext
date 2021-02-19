package it.csi.sigit.sigitext.business.dao.util;

import java.util.HashMap;
import java.util.Iterator;

import org.apache.log4j.Logger;

/**
 * Implementazione di cache di DTO. 
 * Utilizzata dai DAO se specificato.
 * @generated
 */
public class SimpleCache {

	/**
	 * @generated
	 */
	protected static final Logger LOG = Logger.getLogger(Constants.APPLICATION_CODE);

	/**
	 * contiene gli elementi in cache.
	 * - la key della mappa coincide con la primary key dell'oggetto in cache
	 * - come valore invece e' inserito un oggetto CacheElement che, oltre al valore
	 *   da mantenere in cache, contiene anche l'indicazione dell'istante di inserimento
	 *   in cache (utilizzato per determinere il TTL). 
	 * @generated
	 */
	HashMap<Object, CacheElement> map = new HashMap<Object, CacheElement>();

	/**
	 * Time To Live degli elementi in cache
	 * @generated
	 */
	int ttlMinutes = 0;

	/**
	 * @generated
	 */
	boolean updateAccessTime = false;

	/**
	 * costruttore
	 * @param ttl
	 * @param updateAccessTime
	 * @generated
	 */
	public SimpleCache(int ttl, boolean updateAccessTime) {
		this.ttlMinutes = ttl;
		this.updateAccessTime = updateAccessTime;
	}

	/**
	 * inserimento del dato nella cache (con valorizzazione dell'istante di inserimento
	 * che serve per determinare lo svecchiamento).
	 * @param key la PK dell'oggetto da inserire in cache
	 * @param value il record da inserire in cache
	 * @generated
	 */
	public void put(Object key, Object value) {
		CacheElement el = new CacheElement();
		el.setLastAccess(System.currentTimeMillis());
		el.setValue(value);
		map.put(key, el);
	}

	/**
	 * Restituisce l'elemento della cache identificato dalla chiave.
	 * @param key la chiave (PK) dell'elemento da cercare in cache
	 * @return l'elemento in cache corrispondente alla chiave key, se presente,
	 *         altrimenti null.
	 * @generated
	 */
	public Object get(Object key) {
		CacheElement el = map.get(key);
		if (el != null) {
			if ((System.currentTimeMillis() - el.getLastAccess()) > (ttlMinutes * 60000)) {
				LOG.debug("elemento trovato ma scaduto... (impostato TTL pari a " + ttlMinutes + " minuti");
				map.remove(key);
				return null;
			}

			else {
				LOG.debug("elemento trovato");
				if (updateAccessTime) {
					el.setLastAccess(System.currentTimeMillis());
				}
				map.put(key, el); // non servirebbe nemmeno, reference...
				Object val = el.getValue();
				return val;
			}
		} else {
			LOG.debug("elemento non trovato");
			return null;
		}

	}

	/**
	 * dump per debug
	 * @generated
	 */
	public void dumpCache() {
		Iterator<Object> it = map.keySet().iterator();
		while (it.hasNext()) {
			Object currK = it.next();
			CacheElement el = map.get(currK);
			LOG.debug("key:" + currK + ", val:" + el.getValue() + ", lastAccess:" + el.getLastAccess());
		}
	}
}
