
package it.csi.sigit.sigitext.business.sigitext;

import it.csi.sigit.sigitext.dto.sigitext.*;

import it.csi.sigit.sigitext.exception.sigitext.*;

/**
 * Interfaccia remota dell'EJB che implementa il servizio sigitext.
 * @generated
 */
public interface SigitextRemote extends javax.ejb.EJBObject {

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione[] getCombustibileCIT( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException;

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione[] getFluidoCIT( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException;

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione[] getMarcaCIT( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException;

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitext.dto.sigitext.CodiceDescrizione[] getUnitaMisuraCIT( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException

			, it.csi.sigit.sigitext.exception.sigitext.SigitExcessiveResultsException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException

			, it.csi.sigit.sigitext.exception.sigitext.SigitExcessiveResultsException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sigit.sigitext.exception.sigitext.SigitextException

			, it.csi.sigit.sigitext.exception.sigitext.SigitUserNotAuthorizedException;

	/**
	 * @generated
	 */
	public boolean testResources() //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck( //NOSONAR  Reason:EIAS 
			it.csi.coopdiag.api.CalledResource[] alreadyChecked) //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException; //NOSONAR  Reason:EIAS

}
