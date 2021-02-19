
package it.csi.sigit.sigitext.dto.sigitext;

////{PROTECTED REGION ID(R246545305) ENABLED START////}
/**
 * Inserire qui la documentazione della classe Libretto.
 * Consigli:
 * <ul>
 * <li> Descrivere il "concetto" rappresentato dall'entita' (qual'&egrave; l'oggetto
 *      del dominio del servizio rappresentato)
 * <li> Se necessario indicare se questo concetto &egrave; mantenuto sugli archivi di
 *      una particolare applicazione
 * <li> Se l'oggetto ha un particolare ciclo di vita (stati, es. creato, da approvare, 
 *      approvato, respinto, annullato.....) si pu&ograve; decidere di descrivere
 *      la state machine qui o nella documentazione dell'interfaccia del servizio
 *      che manipola quest'oggetto
 * </ul>
 * @generated
 */
////{PROTECTED REGION END////}
public class Libretto implements java.io.Serializable {
	// il serial version UID e' impostato in base a quanto configurato nel modello
	/**
	 * @generated
	 */
	static final long serialVersionUID = 1;

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitext.dto.sigitext.Documento librettoPdf = null;

	/**
	 * Imposta il valore della property [librettoPdf]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setLibrettoPdf(it.csi.sigit.sigitext.dto.sigitext.Documento val) {
		librettoPdf = val;
	}

	////{PROTECTED REGION ID(R24125634) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo librettoPdf. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public it.csi.sigit.sigitext.dto.sigitext.Documento getLibrettoPdf() {
		return librettoPdf;
	}

	/**
	 * @generated
	 */
	private byte[] librettoXml = null;

	/**
	 * Imposta il valore della property [librettoXml]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setLibrettoXml(byte[] val) {
		if (val == null) {
			librettoXml = null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			librettoXml = new byte[val.length];
			for (int i = 0; i < val.length; i++) { //NOSONAR  Reason:NOTINJ13
				librettoXml[i] = val[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
		}
	}

	////{PROTECTED REGION ID(R24133607) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo librettoXml. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public byte[] getLibrettoXml() {
		if (librettoXml == null) {
			return null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			byte[] copy = new byte[librettoXml.length];
			for (int i = 0; i < librettoXml.length; i++) { //NOSONAR  Reason:NOTINJ13
				copy[i] = librettoXml[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
			return copy;
		}
	}

	/*PROTECTED REGION ID(R-1995308374) ENABLED START*/
	/// inserire qui eventuali ridefinizioni di toString, hashCode, equals
	/*PROTECTED REGION END*/
}
