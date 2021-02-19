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
 * Interfaccia pubblica del DAO sigitVRicercaIspezioni.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitVRicercaIspezioniDao {

	/** 
	 * Implementazione del finder byIspezioneFilter
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVRicercaIspezioniDto> findByIspezioneFilter(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.IspezioneFilter input)
			throws SigitVRicercaIspezioniDaoException;

	/** 
		 * Implementazione del finder consByCodiceImpianto con Qdef
		 * @generated
		 */

	public List<SigitVRicercaIspezioniConsByCodiceImpiantoDto> findConsByCodiceImpianto(Integer input)
			throws SigitVRicercaIspezioniDaoException;

	/** 
	 * Implementazione del finder consDettRappProvaByFilter
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVRicercaIspezioniDto> findConsDettRappProvaByFilter(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.IspezioneFilter input)
			throws SigitVRicercaIspezioniDaoException;

	/** 
	 * Implementazione del finder byIdIspezIspet
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVRicercaIspezioniDto> findByIdIspezIspet(Integer input) throws SigitVRicercaIspezioniDaoException;

}
