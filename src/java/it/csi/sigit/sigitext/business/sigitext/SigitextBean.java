
package it.csi.sigit.sigitext.business.sigitext;

import it.csi.csi.wrapper.CSIException;
import it.csi.csi.wrapper.SystemException;
import it.csi.csi.wrapper.UnrecoverableException;

import it.csi.sigit.sigitext.dto.sigitext.*;

import it.csi.sigit.sigitext.interfacecsi.sigitext.*;

import it.csi.sigit.sigitext.exception.sigitext.*;

import it.csi.sigit.sigitext.business.sigitext.spring.SpringBeanLocator;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import org.apache.log4j.*;

/**
 * @generated
 */
public class SigitextBean implements SessionBean {

	// business delegate contenente le implementazioni del servizio
	/**
	 * @generated
	 */
	protected SigitextImpl delegate = null;

	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "sigitext";
	public static final Logger logger = Logger.getLogger(LOGGER_PREFIX);

	/// Operazioni esposte dal servizio

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione[] getCombustibileCIT( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::getCombustibileCIT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione[] valueObjRet = delegate.getCombustibileCIT(

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "getCombustibileCIT()",
					"invocazione servizio [sigitext]::[getCombustibileCIT]", "(valore input omesso)");
			logger.debug("[SigitextBean::getCombustibileCIT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione[] getFluidoCIT( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::getFluidoCIT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione[] valueObjRet = delegate.getFluidoCIT(

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "getFluidoCIT()", "invocazione servizio [sigitext]::[getFluidoCIT]",
					"(valore input omesso)");
			logger.debug("[SigitextBean::getFluidoCIT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione[] getMarcaCIT( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::getMarcaCIT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione[] valueObjRet = delegate.getMarcaCIT(

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "getMarcaCIT()", "invocazione servizio [sigitext]::[getMarcaCIT]",
					"(valore input omesso)");
			logger.debug("[SigitextBean::getMarcaCIT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione[] getUnitaMisuraCIT( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::getUnitaMisuraCIT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione[] valueObjRet = delegate.getUnitaMisuraCIT(

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "getUnitaMisuraCIT()",
					"invocazione servizio [sigitext]::[getUnitaMisuraCIT]", "(valore input omesso)");
			logger.debug("[SigitextBean::getUnitaMisuraCIT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.Impianto[] getImpiantoByCodiceJWT( //NOSONAR  Reason:EIAS

			java.lang.Integer codiceImpianto, //NOSONAR  Reason:EIAS

			java.lang.String tokenJWT //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::getImpiantoByCodiceJWT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			it.csi.sigit.sigitext.dto.sigitext.Impianto[] valueObjRet = delegate.getImpiantoByCodiceJWT(

					codiceImpianto,

					tokenJWT

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "getImpiantoByCodiceJWT()",
					"invocazione servizio [sigitext]::[getImpiantoByCodiceJWT]", "(valore input omesso)");
			logger.debug("[SigitextBean::getImpiantoByCodiceJWT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.Impianto[] getImpiantoByPODJWT( //NOSONAR  Reason:EIAS

			java.lang.String pod, //NOSONAR  Reason:EIAS

			java.lang.String tokenJWT //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException

			, it.csi.sigit.sigitext.exception.sigitext.SigitExcessiveResultsException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::getImpiantoByPODJWT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			it.csi.sigit.sigitext.dto.sigitext.Impianto[] valueObjRet = delegate.getImpiantoByPODJWT(

					pod,

					tokenJWT

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "getImpiantoByPODJWT()",
					"invocazione servizio [sigitext]::[getImpiantoByPODJWT]", "(valore input omesso)");
			logger.debug("[SigitextBean::getImpiantoByPODJWT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.Impianto[] getImpiantoByPDRJWT( //NOSONAR  Reason:EIAS

			java.lang.String pdr, //NOSONAR  Reason:EIAS

			java.lang.String tokenJWT //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException

			, it.csi.sigit.sigitext.exception.sigitext.SigitExcessiveResultsException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::getImpiantoByPDRJWT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			it.csi.sigit.sigitext.dto.sigitext.Impianto[] valueObjRet = delegate.getImpiantoByPDRJWT(

					pdr,

					tokenJWT

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "getImpiantoByPDRJWT()",
					"invocazione servizio [sigitext]::[getImpiantoByPDRJWT]", "(valore input omesso)");
			logger.debug("[SigitextBean::getImpiantoByPDRJWT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.Documento getLibrettoByUIDJWT( //NOSONAR  Reason:EIAS

			java.lang.String uid, //NOSONAR  Reason:EIAS

			java.lang.String tokenJWT //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::getLibrettoByUIDJWT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			it.csi.sigit.sigitext.dto.sigitext.Documento valueObjRet = delegate.getLibrettoByUIDJWT(

					uid,

					tokenJWT

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "getLibrettoByUIDJWT()",
					"invocazione servizio [sigitext]::[getLibrettoByUIDJWT]", "(valore input omesso)");
			logger.debug("[SigitextBean::getLibrettoByUIDJWT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.Documento getXMLLibrettoNowJWT( //NOSONAR  Reason:EIAS

			java.lang.Integer codiceImpianto, //NOSONAR  Reason:EIAS

			java.lang.Boolean isConsolidato, //NOSONAR  Reason:EIAS

			java.lang.String tokenJWT //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::getXMLLibrettoNowJWT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			it.csi.sigit.sigitext.dto.sigitext.Documento valueObjRet = delegate.getXMLLibrettoNowJWT(

					codiceImpianto,

					isConsolidato,

					tokenJWT

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "getXMLLibrettoNowJWT()",
					"invocazione servizio [sigitext]::[getXMLLibrettoNowJWT]", "(valore input omesso)");
			logger.debug("[SigitextBean::getXMLLibrettoNowJWT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.Libretto getLibrettoNowJWT( //NOSONAR  Reason:EIAS

			java.lang.Integer codiceImpianto, //NOSONAR  Reason:EIAS

			java.lang.Boolean isConsolidato, //NOSONAR  Reason:EIAS

			java.lang.String tokenJWT //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::getLibrettoNowJWT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			it.csi.sigit.sigitext.dto.sigitext.Libretto valueObjRet = delegate.getLibrettoNowJWT(

					codiceImpianto,

					isConsolidato,

					tokenJWT

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "getLibrettoNowJWT()",
					"invocazione servizio [sigitext]::[getLibrettoNowJWT]", "(valore input omesso)");
			logger.debug("[SigitextBean::getLibrettoNowJWT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.Documento getXMLLibrettoConsolidatoJWT( //NOSONAR  Reason:EIAS

			java.lang.Integer codiceImpianto, //NOSONAR  Reason:EIAS

			java.lang.String tokenJWT //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::getXMLLibrettoConsolidatoJWT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			it.csi.sigit.sigitext.dto.sigitext.Documento valueObjRet = delegate.getXMLLibrettoConsolidatoJWT(

					codiceImpianto,

					tokenJWT

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "getXMLLibrettoConsolidatoJWT()",
					"invocazione servizio [sigitext]::[getXMLLibrettoConsolidatoJWT]", "(valore input omesso)");
			logger.debug("[SigitextBean::getXMLLibrettoConsolidatoJWT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public void uploadXMLLibrettoJWT( //NOSONAR  Reason:EIAS

			java.lang.Integer codiceImpianto, //NOSONAR  Reason:EIAS

			byte[] xml, //NOSONAR  Reason:EIAS

			java.lang.String tokenJWT //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::uploadXMLLibrettoJWT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			delegate.uploadXMLLibrettoJWT(

					codiceImpianto,

					xml,

					tokenJWT

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "uploadXMLLibrettoJWT()",
					"invocazione servizio [sigitext]::[uploadXMLLibrettoJWT]", "(valore input omesso)");
			logger.debug("[SigitextBean::uploadXMLLibrettoJWT()] - END");

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public int uploadXMLControlloJWT( //NOSONAR  Reason:EIAS

			java.lang.Integer codiceImpianto, //NOSONAR  Reason:EIAS

			java.lang.String tipoControllo, //NOSONAR  Reason:EIAS

			byte[] xml, //NOSONAR  Reason:EIAS

			java.lang.String tokenJWT //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::uploadXMLControlloJWT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			int valueObjRet = delegate.uploadXMLControlloJWT(

					codiceImpianto,

					tipoControllo,

					xml,

					tokenJWT

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "uploadXMLControlloJWT()",
					"invocazione servizio [sigitext]::[uploadXMLControlloJWT]", "(valore input omesso)");
			logger.debug("[SigitextBean::uploadXMLControlloJWT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.Impianto[] getImpiantiByFiltroJWT( //NOSONAR  Reason:EIAS

			it.csi.sigit.sigitext.dto.sigitext.ImpiantoFiltro impiantoFiltro, //NOSONAR  Reason:EIAS

			java.lang.String tokenJWT //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SigitextBean::getImpiantiByFiltroJWT()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
			// inizio misurazione
			watcher.start();

			it.csi.sigit.sigitext.dto.sigitext.Impianto[] valueObjRet = delegate.getImpiantiByFiltroJWT(

					impiantoFiltro,

					tokenJWT

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextBean", "getImpiantiByFiltroJWT()",
					"invocazione servizio [sigitext]::[getImpiantiByFiltroJWT]", "(valore input omesso)");
			logger.debug("[SigitextBean::getImpiantiByFiltroJWT()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public boolean testResources() //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException { //NOSONAR  Reason:EIAS 
		return delegate.testResources();
	}

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck( //NOSONAR  Reason:EIAS 
			it.csi.coopdiag.api.CalledResource[] alreadyChecked) //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException { //NOSONAR  Reason:EIAS
		return delegate.selfCheck(alreadyChecked);
	}

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException { //NOSONAR  Reason:EIAS
		return delegate.hasSelfCheck();
	}

	/// lifecycle dell EJB

	/**
	 * @generated
	 */
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	/**
	 * @generated
	 */
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	/**
	 * @generated
	 */
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	/**
	 * @generated
	 */
	public void ejbCreate() {
	}

	/**
	 * @generated
	 */
	SessionContext ctx = null;

	/**
	 * @generated
	 */
	public void createImpl(Object initOptions) throws EJBException {
		Logger logger = getLogger(null);
		logger.debug("[SigitextBean::createImpl] - START");
		try {
			delegate = (SigitextImpl) SpringBeanLocator.getBean("sigitextImpl");
			delegate.init(initOptions);

		}

		catch (Exception ie) {
			logger.debug("[SigitextBean::createImpl] - ERROR", ie);
			throw new EJBException(
					"Errore nella inizializzazione dell'implementazione del servizio sigitext:" + ie.getMessage(), ie);
		} finally {
			logger.debug("[SigitextBean::createImpl] - END");
		}
	}

	/**
	 * @generated
	 */
	public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {

		/// META-TODO: forse sarebbe opportuno accodare il nome del servizio al logger...
		Logger logger = getLogger(null);
		logger.debug("[SigitextBean::setSessionContext] - START");
		this.ctx = ctx;
		// contiene eventuali oggetti inizializzati nella sezione seguente e che
		// devono essere passati all'oggetto delegate
		Object implInitOptions = null;

		/// Inizializzazione risorse
		/*PROTECTED REGION ID(R1383132378) ENABLED START*/
		// inserire qui il codice di inziializzazione risorse:
		// non verra' cancellato dalle successive rignerazioni
		// esempio di cose da fare:
		// -- leggere environment entry o context jndi 
		// -- inizializzare datasource, altre risorse
		// -- inserire le options in 'implInitOptions': saranno poi 
		//    passate al metodo initImpl()
		// NOTA: il contenuto specifico dell'oggetto implInitOptions e'
		// specifico di ogni applicazione		
		/*PROTECTED REGION END*/
		/// creazione dell'implementazione
		createImpl(implInitOptions);
		logger.debug("[SigitextBean::setSessionContext] - END");
	}

	/**
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}
}
