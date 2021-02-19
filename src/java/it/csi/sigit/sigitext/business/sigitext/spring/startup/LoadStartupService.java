package it.csi.sigit.sigitext.business.sigitext.spring.startup;

import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.context.access.ContextBeanFactoryReference;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

/**
 * @generated
 */
public class LoadStartupService implements LoadStartupServiceMBean {

	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "sigitext";
	public static final Logger LOGGER = Logger.getLogger(LOGGER_PREFIX);

	/** Spring BeanFactory that provides the namespace for this EJB 
	* @generated
	*/
	private static BeanFactoryReference beanFactoryReference;

	/**
	 * @generated
	 */
	private String message = "problems....";

	/**
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @generated
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @generated
	 */
	public void printMessage() {
		LOGGER.info(message);
	}

	/**
	 * @generated
	 */
	public void start() throws Exception {
		LOGGER.debug("Messaggio di avvio MBEAN=" + message);
		try {
			String[] springCfg = new String[]{"META-INF/sigitextBeanContext.xml", "META-INF/sigitextDao-beans.xml"};
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(springCfg);
			beanFactoryReference = new ContextBeanFactoryReference(ctx);

		} catch (Exception e) {
			LOGGER.error("Attenzione si e' verificata un'eccezione: " + e, e);
			throw e;
		}
		LOGGER.debug("Chiamata da MBEAN eseguita!!!!");
	}

	/**
	 * @generated
	 */
	public static Object getBean(String beanName) {

		Object beanObject = null;

		try {

			beanObject = beanFactoryReference.getFactory().getBean(beanName);

		} catch (Exception e) {
			LOGGER.error("Attenzione si e' verificata un'eccezione: " + e, e);
		}

		return beanObject;
	}

	/**
	 * @generated
	 */
	public void stop() {
		LOGGER.debug("Messaggio di stop MBEAN=" + message);
	}
}
