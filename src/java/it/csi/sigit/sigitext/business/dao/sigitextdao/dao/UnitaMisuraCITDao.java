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
 * Interfaccia pubblica del DAO UnitaMisuraCIT.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface UnitaMisuraCITDao {

	/** 
	 * Restituisce tutte le righe della tabella SIGIT_D_UNITA_MISURA.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<UnitaMisuraCITDto> findAll() throws UnitaMisuraCITDaoException;

	/** 
	 * Returns all rows from the SIGIT_D_UNITA_MISURA table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public UnitaMisuraCITDto findByPrimaryKey(UnitaMisuraCITPk pk) throws UnitaMisuraCITDaoException;

}
