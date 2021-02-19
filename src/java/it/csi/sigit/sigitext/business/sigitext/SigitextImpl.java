
package it.csi.sigit.sigitext.business.sigitext;

import it.csi.csi.wrapper.*;

import it.csi.sigit.sigitext.dto.sigitext.*;

import it.csi.sigit.sigitext.interfacecsi.sigitext.*;

import it.csi.sigit.sigitext.exception.sigitext.*;

import it.csi.coopdiag.api.*;
import it.csi.coopdiag.engine.utils.*;

import javax.ejb.SessionContext;
import javax.sql.DataSource;
import org.apache.log4j.*;

/*PROTECTED REGION ID(R1101171130) ENABLED START*/
// aggiungere qui eventuali import aggiuntive.
// verranno preservate in rigenerazioni successive del progetto
import it.csi.sigit.sigitext.business.manager.SigitextManager;
import it.csi.sigit.sigitext.business.sigitext.spring.SpringBeanLocator;
import it.csi.sigit.sigitext.business.util.Constants;
import it.csi.sigit.sigitext.business.util.ConvertUtil;
import it.csi.sigit.sigitext.business.util.Messages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class SigitextImpl {
	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "sigitext";

	/*PROTECTED REGION ID(R-575633956) ENABLED START*/
	// inserire qui la definizione di varibili locale o costanti dell'implementazione.
	// non verranno sovrascritte da successive rigenerazioni
	/*PROTECTED REGION END*/

	/// Implementazione operazioni esposte dal servizio

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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::getCombustibileCIT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1349185527) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verra' sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R228246377) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getCombustibileCIT'.
			// non verra' sovrascritto nelle successive rigenerazioni

			CodiceDescrizione[] lista = null;
			if (getSigitextManager() == null) {
				logger.error("[SigitextImpl::getCombustibileCIT] - Errore getSigitextManager=null;");
			} else {

				lista = getSigitextManager().getListaCombustibileCIT();

			}
			return lista;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SigitextImpl::getCombustibileCIT] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::getCombustibileCIT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "getCombustibileCIT()",
					"invocazione servizio [sigitext]::[getCombustibileCIT]", "(valore input omesso)");
			logger.debug("[SigitextImpl::getCombustibileCIT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::getFluidoCIT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R1428258776) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verra' sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R1221147448) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getFluidoCIT'.
			// non verra' sovrascritto nelle successive rigenerazioni

			CodiceDescrizione[] lista = null;
			if (getSigitextManager() == null) {
				logger.error("[SigitextImpl::getFluidoCIT] - Errore getSigitextManager=null;");
			} else {

				lista = getSigitextManager().getListaFluidoCIT();

			}
			return lista;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SigitextImpl::getFluidoCIT] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error("[SigitextImpl::getFluidoCIT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
						+ ex, ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "getFluidoCIT()", "invocazione servizio [sigitext]::[getFluidoCIT]",
					"(valore input omesso)");
			logger.debug("[SigitextImpl::getFluidoCIT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::getMarcaCIT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R1283266019) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verra' sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-247435645) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getMarcaCIT'.
			// non verra' sovrascritto nelle successive rigenerazioni

			CodiceDescrizione[] lista = null;
			if (getSigitextManager() == null) {
				logger.error("[SigitextImpl::getMarcaCIT] - Errore getSigitextManager=null;");
			} else {

				lista = getSigitextManager().getListaMarcaCIT();

			}
			return lista;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SigitextImpl::getMarcaCIT] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::getMarcaCIT] - Errore imprevisto occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "getMarcaCIT()", "invocazione servizio [sigitext]::[getMarcaCIT]",
					"(valore input omesso)");
			logger.debug("[SigitextImpl::getMarcaCIT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::getUnitaMisuraCIT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-871087307) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verra' sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-958749739) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getUnitaMisuraCIT'.
			// non verra' sovrascritto nelle successive rigenerazioni

			CodiceDescrizione[] lista = null;
			if (getSigitextManager() == null) {
				logger.error("[SigitextImpl::getUnitaMisuraCIT] - Errore getSigitextManager=null;");
			} else {

				lista = getSigitextManager().getListaUnitaMisuraCIT();

			}
			return lista;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SigitextImpl::getUnitaMisuraCIT] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::getUnitaMisuraCIT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "getUnitaMisuraCIT()",
					"invocazione servizio [sigitext]::[getUnitaMisuraCIT]", "(valore input omesso)");
			logger.debug("[SigitextImpl::getUnitaMisuraCIT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::getImpiantoByCodiceJWT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-441217721) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni	   
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1729064793) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getImpiantoByCodiceJWT'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			int idFunzionalita = Constants.ID_FUNZ_CERCA_IMPIANTO_BY_CODICE;

			UtenteJWT utenteJWT = getSigitextManager().isUtenteAutorizzato(tokenJWT, idFunzionalita);

			Impianto[] listImpianti = null;
			if (utenteJWT != null) {

				if (!getSigitextManager().isAbilitatoSuImpianto(codiceImpianto, utenteJWT)) {
					throw new SigitextException(Messages.ERROR_IMPRESA_NON_ABILITATA_SU_IMPIANTO);
				}

				listImpianti = getSigitextManager().getImpiantoByCodImpianto(codiceImpianto);
			} else {
				throw new SigitUserNotAuthorizedException("Utente non autorizzato all'utilizzo del servizio");
			}

			getSigitextManager().salvaAccesso(utenteJWT, idFunzionalita);

			return listImpianti;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SigitextImpl::getImpiantoByCodiceJWT] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::getImpiantoByCodiceJWT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "getImpiantoByCodiceJWT()",
					"invocazione servizio [sigitext]::[getImpiantoByCodiceJWT]", "(valore input omesso)");
			logger.debug("[SigitextImpl::getImpiantoByCodiceJWT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::getImpiantoByPODJWT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R477291919) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R2133040687) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getImpiantoByPODJWT'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			int idFunzionalita = Constants.ID_FUNZ_CERCA_IMPIANTO_BY_POD;

			UtenteJWT utenteJWT = getSigitextManager().isUtenteAutorizzato(tokenJWT, idFunzionalita);

			Impianto[] listImpianti = null;

			if (utenteJWT != null) {
				listImpianti = getSigitextManager().getImpiantoByPod(pod);

				if (listImpianti != null && listImpianti.length > 0) {
					for (Impianto impianto : listImpianti) {
						if (!getSigitextManager().isAbilitatoSuImpianto(impianto.getCodiceImpianto(), utenteJWT)) {
							throw new SigitextException(Messages.ERROR_IMPRESA_NON_ABILITATA_SU_IMPIANTO);
						}
					}
				}

			} else {
				throw new SigitUserNotAuthorizedException("Utente non autorizzato all'utilizzo del servizio");
			}

			getSigitextManager().salvaAccesso(utenteJWT, idFunzionalita);

			return listImpianti;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SigitextImpl::getImpiantoByPODJWT] - Errore CSI occorso durante l'esecuzione del metodo:"
						+ ex, ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::getImpiantoByPODJWT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "getImpiantoByPODJWT()",
					"invocazione servizio [sigitext]::[getImpiantoByPODJWT]", "(valore input omesso)");
			logger.debug("[SigitextImpl::getImpiantoByPODJWT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::getImpiantoByPDRJWT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R467550262) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R2123299030) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getImpiantoByPDRJWT'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			int idFunzionalita = Constants.ID_FUNZ_CERCA_IMPIANTO_BY_PDR;

			UtenteJWT utenteJWT = getSigitextManager().isUtenteAutorizzato(tokenJWT, idFunzionalita);

			Impianto[] listImpianti = null;
			if (utenteJWT != null) {

				listImpianti = getSigitextManager().getImpiantoByPdr(pdr);

				if (listImpianti != null && listImpianti.length > 0) {
					for (Impianto impianto : listImpianti) {
						if (!getSigitextManager().isAbilitatoSuImpianto(impianto.getCodiceImpianto(), utenteJWT)) {
							throw new SigitextException(Messages.ERROR_IMPRESA_NON_ABILITATA_SU_IMPIANTO);
						}
					}
				}
			} else {
				throw new SigitUserNotAuthorizedException("Utente non autorizzato all'utilizzo del servizio");
			}

			getSigitextManager().salvaAccesso(utenteJWT, idFunzionalita);

			return listImpianti;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SigitextImpl::getImpiantoByPDRJWT] - Errore CSI occorso durante l'esecuzione del metodo:"
						+ ex, ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::getImpiantoByPDRJWT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "getImpiantoByPDRJWT()",
					"invocazione servizio [sigitext]::[getImpiantoByPDRJWT]", "(valore input omesso)");
			logger.debug("[SigitextImpl::getImpiantoByPDRJWT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::getLibrettoByUIDJWT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R109805078) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R1765553846) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getLibrettoByUIDJWT'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			int idFunzionalita = Constants.ID_FUNZ_CERCA_LIBRETTO_BY_UID;

			UtenteJWT utenteJWT = getSigitextManager().isUtenteAutorizzato(tokenJWT, idFunzionalita);

			Documento libretto = null;
			if (utenteJWT != null) {

				if (!getSigitextManager().isAbilitatoSuLibretto(uid, utenteJWT)) {
					throw new SigitextException(Messages.ERROR_IMPRESA_NON_ABILITATA_SU_IMPIANTO);
				}

				libretto = getSigitextManager().getLibrettoByUid(uid);
			} else {
				throw new SigitUserNotAuthorizedException("Utente non autorizzato all'utilizzo del servizio");
			}

			getSigitextManager().salvaAccesso(utenteJWT, idFunzionalita);

			return libretto;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SigitextImpl::getLibrettoByUIDJWT] - Errore CSI occorso durante l'esecuzione del metodo:"
						+ ex, ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::getLibrettoByUIDJWT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "getLibrettoByUIDJWT()",
					"invocazione servizio [sigitext]::[getLibrettoByUIDJWT]", "(valore input omesso)");
			logger.debug("[SigitextImpl::getLibrettoByUIDJWT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::getXMLLibrettoNowJWT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R2052736654) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R1841340910) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getXMLLibrettoNowJWT'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			int idFunzionalita = Constants.ID_FUNZ_GET_XML_LIBRETTO_NOW;

			UtenteJWT utenteJWT = getSigitextManager().isUtenteAutorizzato(tokenJWT, idFunzionalita);

			Documento xmlLibretto = null;
			if (utenteJWT != null) {
				if (!getSigitextManager().isAbilitatoSuImpianto(codiceImpianto, utenteJWT)) {
					throw new SigitextException(Messages.ERROR_IMPRESA_NON_ABILITATA_SU_IMPIANTO);
				}
				xmlLibretto = getSigitextManager().getXMLLibretto(codiceImpianto, isConsolidato);
			} else {
				throw new SigitUserNotAuthorizedException("Utente non autorizzato all'utilizzo del servizio");
			}

			getSigitextManager().salvaAccesso(utenteJWT, idFunzionalita);

			return xmlLibretto;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SigitextImpl::getXMLLibrettoNowJWT] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::getXMLLibrettoNowJWT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "getXMLLibrettoNowJWT()",
					"invocazione servizio [sigitext]::[getXMLLibrettoNowJWT]", "(valore input omesso)");
			logger.debug("[SigitextImpl::getXMLLibrettoNowJWT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::getLibrettoNowJWT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1693604711) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1781267143) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getLibrettoNowJWT'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			int idFunzionalita = Constants.ID_FUNZ_GET_LIBRETTO_NOW;

			UtenteJWT utenteJWT = getSigitextManager().isUtenteAutorizzato(tokenJWT, idFunzionalita);

			Libretto libretto = null;
			if (utenteJWT != null) {

				if (!getSigitextManager().isAbilitatoSuImpianto(codiceImpianto, utenteJWT)) {
					throw new SigitextException(Messages.ERROR_IMPRESA_NON_ABILITATA_SU_IMPIANTO);
				}

				logger.debug("[SigitextImpl::getLibrettoNowJWT] ###########################");
				logger.debug("[SigitextImpl::getLibrettoNowJWT] - codiceImpianto: " + codiceImpianto);
				logger.debug("[SigitextImpl::getLibrettoNowJWT] - isConsolidato: " + isConsolidato);
				logger.debug("[SigitextImpl::getLibrettoNowJWT] ###########################");

				libretto = getSigitextManager().getLibretto(codiceImpianto, isConsolidato);
			} else {
				throw new SigitUserNotAuthorizedException("Utente non autorizzato all'utilizzo del servizio");
			}

			getSigitextManager().salvaAccesso(utenteJWT, idFunzionalita);

			return libretto;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SigitextImpl::getLibrettoNowJWT] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::getLibrettoNowJWT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "getLibrettoNowJWT()",
					"invocazione servizio [sigitext]::[getLibrettoNowJWT]", "(valore input omesso)");
			logger.debug("[SigitextImpl::getLibrettoNowJWT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::getXMLLibrettoConsolidatoJWT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R305651633) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R750574353) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getXMLLibrettoConsolidatoJWT'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			int idFunzionalita = Constants.ID_FUNZ_GET_XML_LIBRETTO_CONSOLIDATO;

			UtenteJWT utenteJWT = getSigitextManager().isUtenteAutorizzato(tokenJWT, idFunzionalita);

			Documento xmlLibrettoConsolidato = null;
			if (utenteJWT != null) {
				if (!getSigitextManager().isAbilitatoSuImpianto(codiceImpianto, utenteJWT)) {
					throw new SigitextException(Messages.ERROR_IMPRESA_NON_ABILITATA_SU_IMPIANTO);
				}

				xmlLibrettoConsolidato = getSigitextManager().getXMLLibrettoConsolidato(codiceImpianto);
			} else {
				throw new SigitUserNotAuthorizedException("Utente non autorizzato all'utilizzo del servizio");
			}

			getSigitextManager().salvaAccesso(utenteJWT, idFunzionalita);

			return xmlLibrettoConsolidato;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SigitextImpl::getXMLLibrettoConsolidatoJWT] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::getXMLLibrettoConsolidatoJWT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "getXMLLibrettoConsolidatoJWT()",
					"invocazione servizio [sigitext]::[getXMLLibrettoConsolidatoJWT]", "(valore input omesso)");
			logger.debug("[SigitextImpl::getXMLLibrettoConsolidatoJWT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::uploadXMLLibrettoJWT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1547983745) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1759379489) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'uploadXMLLibrettoJWT'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			int idFunzionalita = Constants.ID_FUNZ_UPLOAD_XML_LIBRETTO;

			UtenteJWT utenteJWT = getSigitextManager().isUtenteAutorizzato(tokenJWT, idFunzionalita);

			if (utenteJWT != null) {
				if (!getSigitextManager().isAbilitatoSuImpianto(codiceImpianto, utenteJWT)) {
					throw new SigitextException(Messages.ERROR_IMPRESA_NON_ABILITATA_SU_IMPIANTO);
				}

				getSigitextManager().uploadXMLLibretto(codiceImpianto, xml, utenteJWT);
			} else {
				throw new SigitUserNotAuthorizedException("Utente non autorizzato all'utilizzo del servizio");
			}

			getSigitextManager().salvaAccesso(utenteJWT, idFunzionalita);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SigitextImpl::uploadXMLLibrettoJWT] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::uploadXMLLibrettoJWT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "uploadXMLLibrettoJWT()",
					"invocazione servizio [sigitext]::[uploadXMLLibrettoJWT]", "(valore input omesso)");
			logger.debug("[SigitextImpl::uploadXMLLibrettoJWT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::uploadXMLControlloJWT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-671077320) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R1365589208) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'uploadXMLControlloJWT'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			int idFunzionalita = Constants.ID_FUNZ_UPLOAD_XML_CONTROLLO;

			UtenteJWT utenteJWT = getSigitextManager().isUtenteAutorizzato(tokenJWT, idFunzionalita);

			int idAllegato;

			if (utenteJWT != null) {
				if (!getSigitextManager().isAbilitatoSuImpianto(codiceImpianto, utenteJWT)) {
					throw new SigitextException(Messages.ERROR_IMPRESA_NON_ABILITATA_SU_IMPIANTO);
				}

				idAllegato = getSigitextManager().uploadXMLControllo(codiceImpianto, tipoControllo, xml, utenteJWT);
			} else {
				throw new SigitUserNotAuthorizedException("Utente non autorizzato all'utilizzo del servizio");
			}

			getSigitextManager().salvaAccesso(utenteJWT, idFunzionalita);

			return idAllegato;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SigitextImpl::uploadXMLControlloJWT] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::uploadXMLControlloJWT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "uploadXMLControlloJWT()",
					"invocazione servizio [sigitext]::[uploadXMLControlloJWT]", "(valore input omesso)");
			logger.debug("[SigitextImpl::uploadXMLControlloJWT] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::getImpiantiByFiltroJWT] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("sigitext");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1075904008) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R1931216216) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getImpiantiByFiltroJWT'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			int idFunzionalita = Constants.ID_FUNZ_GET_IMPIANTI_BY_FILTRO;

			UtenteJWT utenteJWT = getSigitextManager().isUtenteAutorizzato(tokenJWT, idFunzionalita);

			Impianto[] listImpianti = null;

			if (utenteJWT != null) {

				listImpianti = getSigitextManager().ricercaImpiantoByFiltro(impiantoFiltro);

			} else {
				throw new SigitUserNotAuthorizedException("Utente non autorizzato all'utilizzo del servizio");
			}

			getSigitextManager().salvaAccesso(utenteJWT, idFunzionalita);

			return listImpianti;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SigitextImpl::getImpiantiByFiltroJWT] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SigitextImpl::getImpiantiByFiltroJWT] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SigitextImpl", "getImpiantiByFiltroJWT()",
					"invocazione servizio [sigitext]::[getImpiantiByFiltroJWT]", "(valore input omesso)");
			logger.debug("[SigitextImpl::getImpiantiByFiltroJWT] - END");
		}
	}

	/// dichiarazione del self checker (utilizzato in monitoraggio e diagnostica)
	/**
	 * @generated
	 */
	String _codS = "sigit"; // e' corretto che sia il codice prodotto?
	/**
	 * @generated
	 */
	String _codR = "sigitext";
	/**
	 * @generated
	 */
	String[] _suppS = new String[]{
			/*PROTECTED REGION ID(R-1994635397) ENABLED START*/
			// inserire qui i codici sistema dei supplier diretti (se ci sono)
			// es: "Sistema1","Sistema2"
			/*PROTECTED REGION END*/
	};
	/**
	 * @generated
	 */
	String[] _suppR = new String[]{
			/*PROTECTED REGION ID(R947022202) ENABLED START*/
			// inserire qui i codici risorsa dei supplier diretti (se ci sono)
			// es: "risorsa1","risorsa2"
			// (corrispondono ai codici servizio dei corrispondenti servizi -
			// vedere documentazione coop-diag)
			/*PROTECTED REGION END*/
	};

	/**
	 * @generated
	 */
	DefaultSelfChecker schk = new DefaultSelfChecker(_codS, _codR, getLogger(null).getName(), _suppS, _suppR,
			"/checked_resources_sigitext.xml");

	/**
	 * @generated
	 */
	public boolean testResources() //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException { //NOSONAR  Reason:EIAS
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::testResources()] BEGIN");
		InvocationNode in = new InvocationNode();
		try {
			logger.debug("[SigitextImpl::testResources()] END");
			return schk.testResources();
		} catch (CSIException ex) {
			logger.error("[SigitextImpl::testResources()] : si e' verificato un errore  " + ex);
			throw ex;
		}
	}

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck( //NOSONAR  Reason:EIAS 
			it.csi.coopdiag.api.CalledResource[] alreadyChecked) //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException { //NOSONAR  Reason:EIAS
		Logger logger = getLogger(null);
		logger.debug("[SigitextImpl::selfCheck] - BEGIN");
		InvocationNode in = new InvocationNode();
		try {
			return schk.selfCheck(alreadyChecked);
		} catch (CSIException ex) {
			logger.error("[SigitextImpl::selfCheck()] si e' verificato un errore  " + ex);
		}
		logger.debug("[SigitextImpl::selfCheck] - END");
		// restituisco l’invocation node
		return in;
	}

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException { //NOSONAR  Reason:EIAS
		return true;
	}

	/// inizializzazione
	/**
	 * @generated
	 */
	public void init(Object initOptions) {
		/*PROTECTED REGION ID(R-288265675) ENABLED START*/
		// inserire qui il codice di inizializzazione della implementazione
		// non verra' sovrascritto da successive rigenerazioni
		/*PROTECTED REGION END*/
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

	/// eventuali metodi aggiuntivi
	/*PROTECTED REGION ID(R-333087321) ENABLED START*/
	// inserire qui la dichiarazione di eventuali metodi aggiuntivi utili
	// per l'implementazione.
	// non verra' sovrascritto da successive rigenerazioni.

	SigitextManager sigitextManager = new SigitextManager();

	public SigitextManager getSigitextManager() {
		return (SigitextManager) SpringBeanLocator.getBean("sigitextManager");

	}

	public void setSigitextManager(SigitextManager sigitextManager) {
		this.sigitextManager = sigitextManager;
	}

	/*PROTECTED REGION END*/
}
