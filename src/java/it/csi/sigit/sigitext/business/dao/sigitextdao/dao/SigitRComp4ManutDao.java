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
 * Interfaccia pubblica del DAO sigitRComp4Manut.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitRComp4ManutDao {

	/**
	 * Metodo di inserimento del DAO sigitRComp4Manut. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitRComp4ManutPk
	 * @generated
	 */

	public SigitRComp4ManutPk insert(SigitRComp4ManutDto dto)

	;

	/** 
	 * Custom deleter in the SIGIT_R_COMP4_MANUT table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(Integer filter) throws SigitRComp4ManutDaoException;

	/** 
	 * Implementazione del finder attiviByFilter
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitRComp4ManutDto> findAttiviByFilter(SigitRComp4ManutDto input) throws SigitRComp4ManutDaoException;

	/** 
	 * Implementazione del finder byPersonaGiuridicaCodImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitRComp4ManutDto> findByPersonaGiuridicaCodImpianto(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.CompFilter input)
			throws SigitRComp4ManutDaoException;

	/** 
	 * Implementazione del finder byRuoloFunzPersonaGiuridicaCodImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitRComp4ManutDto> findByRuoloFunzPersonaGiuridicaCodImpianto(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.CompFilter input)
			throws SigitRComp4ManutDaoException;

}
