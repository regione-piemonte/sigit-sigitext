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
 * Interfaccia pubblica del DAO sigitTConsumo.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitTConsumoDao {

	/**
	 * Metodo di inserimento del DAO sigitTConsumo. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTConsumoPk
	 * @generated
	 */

	public SigitTConsumoPk insert(SigitTConsumoDto dto)

	;

	/** 
	 * Custom deleter in the SIGIT_T_CONSUMO table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(Integer filter) throws SigitTConsumoDaoException;

	/** 
	 * Implementazione del finder ByCodImpiantoAndTipo
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTConsumoDto> findByCodImpiantoAndTipo(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dto.SigitTConsumoDto input) throws SigitTConsumoDaoException;

}
