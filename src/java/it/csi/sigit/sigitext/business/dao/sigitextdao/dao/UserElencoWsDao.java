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
 * Interfaccia pubblica del DAO userElencoWs.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface UserElencoWsDao {

	/** 
		 * Implementazione del finder byUtenteFunzionalita con Qdef
		 * @generated
		 */

	public List<UserElencoWsByUtenteFunzionalitaDto> findByUtenteFunzionalita(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.UtenteFunzionalitaFilter input)
			throws UserElencoWsDaoException;

	/** 
	 * Implementazione del finder byIdUtenteAndIdFunzionalita
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<UserElencoWsDto> findByIdUtenteAndIdFunzionalita(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.UtenteFunzionalitaFilter input)
			throws UserElencoWsDaoException;

}
