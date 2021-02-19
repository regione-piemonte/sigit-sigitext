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
 * Interfaccia pubblica del DAO sigitVTotImpianto.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitVTotImpiantoDao {

	/** 
	 * Implementazione del finder responsabiliAttiviByCodiceImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVTotImpiantoDto> findResponsabiliAttiviByCodiceImpianto(java.lang.Integer input)
			throws SigitVTotImpiantoDaoException;

	/** 
	 * Implementazione del finder responsabiliAttiviAllaDataByCodiceImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVTotImpiantoDto> findResponsabiliAttiviAllaDataByCodiceImpianto(
			it.csi.sigit.sigitext.business.dao.sigitextdao.dao.filter.ResponsabileFilter input)
			throws SigitVTotImpiantoDaoException;

}
