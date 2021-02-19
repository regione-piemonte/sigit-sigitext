/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ModolXFAReader
{
    private final static String ENCODING = "UTF-8";
    private final static String XFA_DATA_TAGNAME = "xfa:data";
    /** The log. */
	protected static final Logger log = Logger.getLogger(Constants.APPLICATION_CODE + ".SigitextManager==>");
	
    public static String getXMLData(byte[] datiXFAModol, String rootTagName) throws ParserConfigurationException, SAXException, IOException
    {
        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        
		if (log.isDebugEnabled())
			log.debug("Stampo il DocumentBuilder: "+db);
        
        InputSource inputSource = new InputSource(new ByteArrayInputStream(datiXFAModol));

		if (log.isDebugEnabled())
			log.debug("Stampo il inputSource: "+inputSource);

        Document document = null;
        try
        {
        	document = db.parse(inputSource);
        }
        catch (Exception e)
        {
            log.error("Errore nella parsificazione ",e);

        }
        
		if (log.isDebugEnabled())
			log.debug("Stampo il document: "+document);

        
        Document docResult = getNewDocumentFromElement(db, document, XFA_DATA_TAGNAME);
        
		if (log.isDebugEnabled())
			log.debug("Stampo il docResult: "+docResult);
		
        if(docResult==null){
        	 docResult = getNewDocumentFromElement(db, document, rootTagName);
        }else{
        	 docResult = getNewDocumentFromElement(db, docResult, rootTagName);
        }
        
       

		if (log.isDebugEnabled())
			log.debug("Stampo il docResult: "+docResult);

        
        return getStringFromDocument(docResult);
    }

    private static Document getNewDocumentFromElement(DocumentBuilder db, Document document, String tagname)
    {
        Document docResult = null;
        NodeList results = document.getElementsByTagName(tagname);
        
        /*
        log.debug("\n\nStampo il NodeList: "+results);
        
        
        

        GenericUtil.stampa(document, false, 3);
        
        */
        
        assert (results != null);
        assert (results.getLength() == 1);
        if (results != null && results.getLength() > 0)
        {
            Element node = (Element) results.item(0);
            docResult = db.newDocument();

            docResult.appendChild(docResult.importNode(node, true));
        }
        return docResult;
    }

    private static String getStringFromDocument(Document doc)
    {
        try
        {
            DOMSource domSource = new DOMSource(doc);
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, ENCODING);
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(domSource, result);

            String s = new String(writer.toString().getBytes(ENCODING), ENCODING);
            return s;
        }
        catch (TransformerException ex)
        {
            log.error("Errore TransformerException",ex);
            throw new RuntimeException(ex);
        }
        catch (UnsupportedEncodingException e)
        {
            log.error("Errore UnsupportedEncodingException",e);
            throw new RuntimeException(e);
        }        
    }

}
