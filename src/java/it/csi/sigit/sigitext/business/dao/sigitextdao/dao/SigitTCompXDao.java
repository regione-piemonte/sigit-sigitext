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
 * Interfaccia pubblica del DAO sigitTCompX.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitTCompXDao {

	/**
	 * Metodo di inserimento del DAO sigitTCompX. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTCompXPk
	 * @generated
	 */

	public SigitTCompXPk insert(SigitTCompXDto dto)

	;

	/** 
	 * Custom deleter in the SIGIT_T_COMP_X table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(Integer filter) throws SigitTCompXDaoException;

	/** 
	 * Implementazione del finder byTipoAndCodImpiantoOrdered
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTCompXDto> findByTipoAndCodImpiantoOrdered(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.CompFilter input) throws SigitTCompXDaoException;

}
