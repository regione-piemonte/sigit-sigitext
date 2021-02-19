/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
/*
 * 
 */
package it.csi.sigit.sigitext.business.util;




import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.URL;
import java.math.BigDecimal;
import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.util.Calendar;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;

import it.csi.sigit.sigitext.business.pdf.BaseBuilder;
import it.csi.sigit.sigitext.dto.sigitext.UtenteJWT;

/*
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
*/

/**
 * The Class GenericUtil.
 */
public class GenericUtil {

	/** The Constant BEGIN. */
	static final int BEGIN = 1;

	/** The Constant END. */
	static final int END = 2;

	/** The Constant VALUE. */
	static final int VALUE = 3;

	/** The Constant TEST. */
	static final int TEST = 4;

	/** The Constant SIMPLE. */
	static final int SIMPLE = 5;
	
	

	/** The log. */
	protected static Logger log = Logger.getLogger(Constants.APPLICATION_CODE);

	private static final String PUBLIC_KEY = "/it/csi/sigit/sigitext/business/util/keystore/public_key.pem";

	/**
	 * Stampa.
	 * 
	 * @param o
	 *            the o
	 * @param useLog4j
	 *            the use log4j
	 * @param depth
	 *            the depth
	 * @param testName
	 *            the test name
	 */
	public static void stampa(Object o, boolean useLog4j, int depth,
			String testName) {
		try {
			if (useLog4j) {
				log.debug(testName + " BEGIN");
			} else {
				System.out.println(testName + " BEGIN");
			}
			if (o != null) {
				if (o.getClass().isArray()) {
					Object[] a = (Object[]) o;
					stampa(a, useLog4j, depth);
				} else {
					stampa(o, useLog4j, depth);
				}
			}
			if (useLog4j) {
				log.debug(testName + " END");
			} else {
				System.out.println(testName + " END");
			}
		} catch (Exception e) {
			log.debug("Errore stampa: ", e);
		}
	}

	/**
	 * Stampa.
	 * 
	 * @param o
	 *            the o
	 * @param useLog4j
	 *            the use log4j
	 * @param depth
	 *            the depth
	 */
	public static void stampa(Object o, boolean useLog4j, int depth) {

		try {
			if (o == null) {
				print(o, null, useLog4j, depth, BEGIN);
			} else {
				if (o instanceof String) {
					print(o, o, useLog4j, depth, SIMPLE);
				} else {
					print(o, null, useLog4j, depth, BEGIN);
					callGetMethods(o, useLog4j, depth + 1);
					print(o, null, useLog4j, depth, END);
				}
			}
		} catch (Exception e) {
			log.debug(e);
		}
	}

	/**
	 * Prints the.
	 * 
	 * @param o
	 *            the o
	 * @param value
	 *            the value
	 * @param useLog4j
	 *            the use log4j
	 * @param depth
	 *            the depth
	 * @param type
	 *            the type
	 * @throws Exception
	 *             the exception
	 */
	private static void print(Object o, Object value, boolean useLog4j,
			int depth, int type) throws Exception {

		StringBuffer tab = new StringBuffer();
		for (int i = 0; i < depth; i++) {
			tab.append("\t");
		}
		if (o != null) {
			String className = o.getClass().getName();
			switch (type) {
			case BEGIN:
				tab.append(className);
				tab.append(" BEGIN");
				break;
			case END:
				tab.append(className);
				tab.append(" END");
				break;
			case VALUE:
				tab.append(((Method) o).getName());
				tab.append(" == ");
				tab.append(value);
				break;
			case SIMPLE:
				tab.append(o);
				tab.append(" == ");
				tab.append(value);
				break;
			default:

			}
		} else if (type == TEST) {
			tab.append("");
		} else {
			tab.append("Oggetto nullo!!");
		}

		if (useLog4j) {
			log.debug(tab);
		} else {
			System.out.println(tab);
		}

	}

	/**
	 * Call get methods.
	 * 
	 * @param o
	 *            the o
	 * @param useLog4j
	 *            the use log4j
	 * @param depth
	 *            the depth
	 */
	private static void callGetMethods(Object o, boolean useLog4j, int depth) {
		try {
			Method[] meth = o.getClass().getDeclaredMethods();
			for (int i = 0; i < meth.length; i++) {
				Method thisM = meth[i];
				if (thisM.getName().startsWith("get")) {
					if (!thisM.getName().equals("get")) {
						Object result = thisM.invoke(o, new Object[] {});
						if (result != null && result.getClass().isArray()) {
							Object[] a = (Object[]) result;
							stampa(a, useLog4j, depth);
						} else {
							print(thisM, result, useLog4j, depth, VALUE);
						}
					}
				}
			}
		} catch (Exception e) {
			log.debug("Errore callGetMethods()", e);
		}
	}

	/**
	 * Stampa.
	 * 
	 * @param o
	 *            the o
	 * @param useLog4j
	 *            the use log4j
	 * @param depth
	 *            the depth
	 * @throws Exception
	 *             the exception
	 */
	public static void stampa(Object[] o, boolean useLog4j, int depth)
			throws Exception {
		String className = o.getClass().getSimpleName();
		for (int i = 0; i < o.length; i++) {
			stampa(o[i], false, depth);
		}

		if (o.length == 0) {
			System.out.println(className + " vuoto");
		}

	}



	/**
	 * Checks if is null or empty.
	 * 
	 * @param s
	 *            the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(String s) {
		return s == null || s.trim().length() == 0;
	}
	/*


	public static String getStringValid(String s) {
		return StringUtils.trimToEmpty(s);
	}
	
	public static String getStringValidNull(String s) {
		return StringUtils.trimToNull(s);
	}
	
	
	public static String getStringSql(String s) {
		return StringUtils.trimToNull(s);
	}
	*/
	
	/**
	 * Checks if is null or empty.
	 * 
	 * @param s
	 *            the s
	 * @return true, if is null or empty
	 */
	public static boolean isNotNullOrEmpty(String s) {
		return s != null && s.trim().length() > 0;
	}
	
	/**
	 * Checks if is null or empty.
	 * 
	 * @param s
	 *            the s
	 * @return true, if is null or empty
	 */
	public static boolean isNotNullOrEmpty(Integer s) {
		return s != null;
	}

	/**
	 * Checks if is not null or empty.
	 * 
	 * @param s
	 *            the s
	 * @return true, if is not null or empty
	 */
	public static boolean isNotNullOrEmpty(Object s) {
		return s != null;
	}

	/**
	 * Checks if is null or empty.
	 * 
	 * @param s
	 *            the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Integer s) {
		return s == null;
	}
	/**
	 * Checks if is null or empty.
	 * 
	 * @param s
	 *            the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Double s) {
		return s == null;
	}

	/**
	 * Checks if is null or empty.
	 * 
	 * @param s
	 *            the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Boolean s) {
		return s == null;
	}

	/**
	 * Checks if is null or empty.
	 * 
	 * @param s
	 *            the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Object s) {
		return s == null;
	}

	public static boolean isNullOrEmpty(List<?> s) {
		if (s != null) {
			return s.isEmpty();
		}

		return s == null;
	}
	
	public static String getStringValid(String s) {
		return StringUtils.trimToEmpty(s);
	}

	// verifico se due datre sono uguali, se tutte e due sono nulle, sono comunque uguali 
	public static boolean checkDateEqual(Date dataPrec, Date dataSucc) {
		try {

			if (GenericUtil.isNullOrEmpty(dataPrec) && GenericUtil.isNullOrEmpty(dataSucc)) {
				return true;
			}
			else if (GenericUtil.isNullOrEmpty(dataPrec) || GenericUtil.isNullOrEmpty(dataSucc)) {
				return false;
			}

			int confronto = dataPrec.compareTo(dataSucc);
			if (confronto != 0) 
			{
				return false;
			}
		} 
		catch (Exception parseEx) {
			return false;
		}
		return true;
	}
	
	public static String getSubstring(String s, int maxLenght) {
		
		String ret = null;
		if (s != null)
		{
			if (s.length() > maxLenght)
			{
				ret = StringUtils.substring(s, 0, maxLenght);
			}
			else
			{
				ret = s;
			}
		}
		return ret;
	}
	

	public static InputStream getFileInClassPath(String fileName) {
		return GenericUtil.class.getClassLoader().getResourceAsStream(fileName);
	}
	
	public static URL getURIInClassPath(String filename) {
		return GenericUtil.class.getClassLoader().getResource(filename);
	}
	
	public static String replacePlaceholder(String text, String value) {
		return text.replaceFirst(Constants.VALUE_PLACEHOLDER, value);
	}
	
	public static String replacePlaceholder(String text, String value1,String value2) {
		text = text.replaceFirst(Constants.VALUE_PLACEHOLDER1, value1);
		return text.replaceFirst(Constants.VALUE_PLACEHOLDER2, value2);
	}

	public static String replacePlaceholder(String text, String value1,String value2,String value3) {
		text = text.replaceFirst(Constants.VALUE_PLACEHOLDER1, value1);
		text = text.replaceFirst(Constants.VALUE_PLACEHOLDER2, value2);
		return text.replaceFirst(Constants.VALUE_PLACEHOLDER3, value3);
	}
	
	public static String replacePlaceholder(String text, String value1,String value2,String value3,String value4) {
		text = text.replaceFirst(Constants.VALUE_PLACEHOLDER1, value1);
		text = text.replaceFirst(Constants.VALUE_PLACEHOLDER2, value2);
		text = text.replaceFirst(Constants.VALUE_PLACEHOLDER3, value3);
		return text.replaceFirst(Constants.VALUE_PLACEHOLDER4, value4);
	}
	
	public static String replacePlaceholder(String text, long value) {
		return text.replaceFirst(Constants.VALUE_PLACEHOLDER, Long.toString(value));
	}

	public static String replacePlaceholder(String text, Date value) {
		return text.replaceFirst(Constants.VALUE_PLACEHOLDER, ConvertUtil.convertToString(value));
	}

	public static String replacePlaceholder(String text, int value) {
		return text.replaceFirst(Constants.VALUE_PLACEHOLDER, Integer.toString(value));
	}
	
	public static boolean checkDateOrder(Calendar dataPrec, Calendar dataSucc,
			boolean canBeEqual) {
		try {
			if (GenericUtil.isNullOrEmpty(dataPrec) || GenericUtil.isNullOrEmpty(dataSucc)) {
				return false;
			}
			java.util.Date dataInizio = ConvertUtil.convertToDate(dataPrec);
			java.util.Date dataFine = ConvertUtil.convertToDate(dataSucc);
			int confronto = dataInizio.compareTo(dataFine);
			if (confronto > 0 || (!canBeEqual && confronto == 0)) {
				return false;
			}

		} 
		catch (Exception parseEx) {
			return false;
		}
		return true;
	}

	public static boolean checkDateFuture(Calendar data) {
		try {
			java.util.Date dataControllo = ConvertUtil.convertToDate(data);
			if(dataControllo.getTime() > System.currentTimeMillis()) {
				
				return false;
			}
		} 
		catch (Exception parseEx) {
			return false;
		}
		return true;
	}
	
	public static boolean checkDateOrderIsPresents(String dataPrec, String dataSucc,
			boolean canBeEqual) {
		try {
			if (GenericUtil.isNullOrEmpty(dataPrec) || GenericUtil.isNullOrEmpty(dataSucc)) {
				return true;
			}
			java.util.Date dataInizio = ConvertUtil.convertToDate(dataPrec);
			java.util.Date dataFine = ConvertUtil.convertToDate(dataSucc);
			int confronto = dataInizio.compareTo(dataFine);
			if (confronto > 0 || (!canBeEqual && confronto == 0)) {
				return false;
			}

		} catch (ParseException parseEx) {
			return false;
		}
		catch (Exception parseEx) {
			return false;
		}
		return true;
	}
	
	public static boolean checkDateOrderIsPresents(Calendar dataPrec, Calendar dataSucc,
			boolean canBeEqual) {
		try {
			if (GenericUtil.isNullOrEmpty(dataPrec) || GenericUtil.isNullOrEmpty(dataSucc)) {
				return true;
			}
			java.util.Date dataInizio = ConvertUtil.convertToDate(dataPrec);
			java.util.Date dataFine = ConvertUtil.convertToDate(dataSucc);
			int confronto = dataInizio.compareTo(dataFine);
			if (confronto > 0 || (!canBeEqual && confronto == 0)) {
				return false;
			}

		} 
		catch (Exception parseEx) {
			return false;
		}
		return true;
	}
	
	public static boolean checkDateFutureIsPresents(Calendar data) {
		try {
			if (GenericUtil.isNullOrEmpty(data)) {
				return true;
			}
			else
			{
				return checkDateFuture(data);
			}
		} 
		catch (Exception parseEx) {
			return false;
		}
		
	}
	
	public static java.sql.Timestamp getSqlDataCorrente(){
		return new java.sql.Timestamp(System.currentTimeMillis());
	}

	public static java.sql.Date getSqlCurrentDate(){
		return new java.sql.Date(System.currentTimeMillis());
	}
	
	public static String getStringSql(String s) {
		return StringUtils.trimToNull(s);
	}
	
	public static String getDescSezioneComp(String tipoComp, BigInteger nProgressivo) {
		String desc = null;
		
		desc = tipoComp + Constants.INTERVAL_SEP + nProgressivo;
		
		return desc;
	}
	
	/**
	 * Check valide four number.
	 * 
	 * @param num
	 *            the num
	 * @return true, if successful
	 */
	public static boolean checkValideNumber(String num) {
		if (!isNullOrEmpty(num)) {
			if (num.matches("^[0-9]*"))
				return true;
			else
				return false;
		}

		return false;
	}
	
	
	public static UtenteJWT verifyToken(String token) throws Exception {
		// Decodifico il token appena creato
		UtenteJWT utenteJWT = null;
		try {

			//RSAKey pubRSA = (RSAKey) PemUtils.readPublicKeyFromFile("D:\\progetti\\testOxygen\\Test\\conf\\key\\public_key.pem", "RSA");
			log.debug("verifyToken - START");
		    InputStream ioBf = BaseBuilder.class.getResourceAsStream(PUBLIC_KEY);

		    Reader targetReader = new InputStreamReader(ioBf);

			RSAKey pubRSA = (RSAKey) PemUtils.readPublicKeyFromFile(targetReader, "RSA");
		    targetReader.close();

		    Algorithm algorithmRS = Algorithm.RSA256((RSAPublicKey)pubRSA, null);
		    
		    JWTVerifier verifier = JWT.require(algorithmRS).build(); 
			
			DecodedJWT jwt = verifier.verify(token);
			
			utenteJWT = new UtenteJWT();
			utenteJWT.setIssuer(jwt.getIssuer());
			utenteJWT.setSubject(jwt.getSubject());
			utenteJWT.setIdPersonaGiuridica(jwt.getClaim("idPg").asString());
			utenteJWT.setCodiceFruitore(jwt.getClaim("codiceFruitore").asString());
			utenteJWT.setCodiceFiscalePersonaFisica(jwt.getClaim("codiceFiscalePersonaFisica").asString());
			utenteJWT.setIssuedAt(jwt.getIssuedAt());
			utenteJWT.setExpiration(jwt.getExpiresAt());
			
		} 

		catch (SignatureVerificationException exception){
			//Invalid token

			System.err.println("Token errato (SignatureVerificationException)");
			
			throw exception;
		}
		catch (JWTDecodeException exception){
			//Invalid token

			System.err.println("Token errato (JWTDecodeException)");
			
			throw exception;
		}
		catch (TokenExpiredException exception)
		{
			//Invalid token

			System.err.println("Token scaduto");
			
			throw exception;
		}
		catch (JWTVerificationException exception)
		{
			System.err.println("Invalid token (JWTVerificationException): "+exception);

			throw exception;
		}
		catch (Exception exception)
		{
			System.err.println("Invalid token (Exception): "+exception);

			throw exception;
		}
		log.debug("verifyToken - END");
		return utenteJWT;
	}
	

}