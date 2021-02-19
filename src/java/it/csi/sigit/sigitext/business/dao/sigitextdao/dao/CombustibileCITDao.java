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
 * Interfaccia pubblica del DAO CombustibileCIT.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface CombustibileCITDao {

	/** 
	 * Restituisce tutte le righe della tabella SIGIT_D_COMBUSTIBILE.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<CombustibileCITDto> findAll() throws CombustibileCITDaoException;

	/** 
	 * Returns all rows from the SIGIT_D_COMBUSTIBILE table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public CombustibileCITDto findByPrimaryKey(CombustibileCITPk pk) throws CombustibileCITDaoException;

}
