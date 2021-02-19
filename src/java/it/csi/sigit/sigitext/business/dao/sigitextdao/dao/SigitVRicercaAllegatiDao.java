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
 * Interfaccia pubblica del DAO sigitVRicercaAllegati.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitVRicercaAllegatiDao {

	/** 
	 * Implementazione del finder inviatiByCodImpiantoOrderedByData
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVRicercaAllegatiDto> findInviatiByCodImpiantoOrderedByData(java.lang.Integer input)
			throws SigitVRicercaAllegatiDaoException;

	/** 
	 * Implementazione del finder manutByCodImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVRicercaAllegatiDto> findManutByCodImpianto(java.lang.Integer input)
			throws SigitVRicercaAllegatiDaoException;

}
