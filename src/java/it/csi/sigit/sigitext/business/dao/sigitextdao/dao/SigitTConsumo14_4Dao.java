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
 * Interfaccia pubblica del DAO sigitTConsumo14_4.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitTConsumo14_4Dao {

	/**
	 * Metodo di inserimento del DAO sigitTConsumo14_4. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTConsumo14_4Pk
	 * @generated
	 */

	public SigitTConsumo14_4Pk insert(SigitTConsumo14_4Dto dto)

	;

	/** 
	 * Custom deleter in the SIGIT_T_CONSUMO_14_4 table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(Integer filter) throws SigitTConsumo14_4DaoException;

	/** 
	 * Implementazione del finder byCodImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTConsumo14_4Dto> findByCodImpianto(java.lang.Integer input) throws SigitTConsumo14_4DaoException;

}
