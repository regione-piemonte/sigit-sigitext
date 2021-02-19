
package it.csi.sigit.sigitext.exception.sigitext;

import it.csi.csi.wrapper.SystemException;
import it.csi.csi.wrapper.UserException;
import it.csi.csi.wrapper.UnrecoverableException;

////{PROTECTED REGION ID(R-2133948766) ENABLED START////}
/**
 * Inserire qui la documentazione dell'eccezione SigitExcessiveResultsException.
 * Consigli:
 * <ul>
 * <li> Dire se l'eccezione rappresenta una condizione di errore oppure 
 *      una casistica eccezionale applicativa
 * <li> Potrebbe essere meglio non dettagliare tanto la documentazione dell'
 *      eccezione quanto la documentazione delle clausole "throws" nei metodi
 *      che rilanciano effettivamente quest'eccezione
 * </ul>
 * @generated
 */
////{PROTECTED REGION END////}
public class SigitExcessiveResultsException extends UserException {

	/**
	 * il serial version UID di una eccezione csi &egrave; sempre "1" perch&egrave; le
	 * eccezioni CSI non possono contenere features aggiuntive
	 * @generated
	 */
	static final long serialVersionUID = 1;

	/**
	 * @generated
	 */
	public SigitExcessiveResultsException(String msg, String nestedExcClassName, String nestedExcMessage,
			String nestedExcStackTrace) {
		super(msg, nestedExcClassName, nestedExcMessage, nestedExcStackTrace);
	}

	/**
	 * @generated
	 */
	public SigitExcessiveResultsException(String msg, String nestedExcClassName, String nestedExcMessage) {
		super(msg, nestedExcClassName, nestedExcMessage);
	}

	/**
	 * @generated
	 */
	public SigitExcessiveResultsException(String msg, Throwable nested) {
		super(msg, nested);
	}

	/**
	 * @generated
	 */
	public SigitExcessiveResultsException(String msg) {
		super(msg);
	}
}
