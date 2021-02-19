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
 * Interfaccia pubblica del DAO UnitaImmobiliare.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface UnitaImmobiliareDao {

	/** 
	 * Implementazione del finder byCodiceImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<UnitaImmobiliareDto> findByCodiceImpianto(java.lang.Integer input) throws UnitaImmobiliareDaoException;

	/** 
	 * Implementazione del finder byPod
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<UnitaImmobiliareDto> findByPod(String input) throws UnitaImmobiliareDaoException;

	/** 
	 * Implementazione del finder byPdr
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<UnitaImmobiliareDto> findByPdr(String input) throws UnitaImmobiliareDaoException;

}
