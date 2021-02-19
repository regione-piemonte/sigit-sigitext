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
 * Interfaccia pubblica del DAO MarcaCIT.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface MarcaCITDao {

	/** 
	 * Restituisce tutte le righe della tabella SIGIT_D_MARCA.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<MarcaCITDto> findAll() throws MarcaCITDaoException;

	/** 
	 * Returns all rows from the SIGIT_D_MARCA table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public MarcaCITDto findByPrimaryKey(MarcaCITPk pk) throws MarcaCITDaoException;

}
