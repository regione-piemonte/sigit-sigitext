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
 * Interfaccia pubblica del DAO FluidoCIT.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface FluidoCITDao {

	/** 
	 * Restituisce tutte le righe della tabella SIGIT_D_FLUIDO.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<FluidoCITDto> findAll() throws FluidoCITDaoException;

	/** 
	 * Returns all rows from the SIGIT_D_FLUIDO table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public FluidoCITDto findByPrimaryKey(FluidoCITPk pk) throws FluidoCITDaoException;

}
