package it.csi.sigit.sigitext.business.dao.sigitextdao.dao;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dao.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.qbe.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.metadata.*;
import it.csi.sigit.sigitext.business.dao.sigitextdao.exceptions.*;
import it.csi.sigit.sigitext.business.dao.util.*;
import it.csi.sigit.sigitext.business.dao.qbe.*;
import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Interfaccia pubblica del DAO sigitTImportXmlLib.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitTImportXmlLibDao {

	/**
	 * Metodo di inserimento del DAO sigitTImportXmlLib. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTImportXmlLibPk
	 * @generated
	 */

	public SigitTImportXmlLibPk insert(SigitTImportXmlLibDto dto)

	;

	/** 
	 * Updates a single row in the SIGIT_T_IMPORT_XML_LIB table.
	 * @generated
	 */
	public void update(SigitTImportXmlLibDto dto) throws SigitTImportXmlLibDaoException;

	/** 
	 * Returns all rows from the SIGIT_T_IMPORT_XML_LIB table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitTImportXmlLibDto findByPrimaryKey(SigitTImportXmlLibPk pk) throws SigitTImportXmlLibDaoException;

}
