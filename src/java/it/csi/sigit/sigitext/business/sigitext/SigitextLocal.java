
package it.csi.sigit.sigitext.business.sigitext;

import it.csi.sigit.sigitext.dto.sigitext.*;

import it.csi.sigit.sigitext.exception.sigitext.*;

/**
 * Interfaccia locale dell'EJB che implementa il servizio sigitext.
 * @generated
 */
public interface SigitextLocal
		extends
			javax.ejb.EJBLocalObject,
			it.csi.sigit.sigitext.interfacecsi.sigitext.SigitextSrv {

	/**
	 * @generated
	 */
	public boolean testResources() //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck( //NOSONAR  Reason:EIAS 
			it.csi.coopdiag.api.CalledResource[] alreadyChecked) //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException; //NOSONAR  Reason:EIAS

}
