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
 * Interfaccia pubblica del DAO sigitTUnitaImmobiliare.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitTUnitaImmobiliareDao {

	/** 
	 * Updates a single row in the SIGIT_T_UNITA_IMMOBILIARE table.
	 * @generated
	 */
	public void update(SigitTUnitaImmobiliareDto dto) throws SigitTUnitaImmobiliareDaoException;

	/** 
	 * Implementazione del finder byCodiceImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTUnitaImmobiliareDto> findByCodiceImpianto(java.lang.Integer input)
			throws SigitTUnitaImmobiliareDaoException;

	/** 
	 * Implementazione del finder unitaPrincipaleImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTUnitaImmobiliareDto> findUnitaPrincipaleImpianto(java.lang.Integer input)
			throws SigitTUnitaImmobiliareDaoException;

}
