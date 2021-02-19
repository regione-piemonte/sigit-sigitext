package it.csi.sigit.sigitext.business.dao.sigitextdao.metadata;

import it.csi.sigit.sigitext.business.dao.sigitextdao.dto.*;
import it.csi.sigit.sigitext.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitVRicercaIspezioniMetadata extends DAOMetadata {

	/**
	 * contiene l'elenco dei nomi delle property del DTO associato al DAO a cui
	 * questi metadati fanno riferimento
	 */
	private final String[] propertyNames;

	/**
	 * contiene l'elenco dei nomi delle colonne della tabella associata al DAO a cui
	 * questi metadati fanno riferimento
	 */
	private final String[] columnNames;

	/**
	 * Contiene i metadati relativi a:
	 * DAO: [sigitVRicercaIspezioni]
	 * tabella: [VISTA_RICERCA_ISPEZIONI].
	 */
	public SigitVRicercaIspezioniMetadata() {
		columnNames = new String[]{"ID_ISPEZIONE_2018", "CODICE_IMPIANTO", "ID_ISPEZ_ISPET", "FK_STATO_ISPEZIONE",
				"DES_STATO_ISPEZIONE", "ENTE_COMPETENTE", "DT_CREAZIONE", "DT_CONCLUSIONE", "FLG_ESITO", "NOTE",
				"ID_ALLEGATO", "FK_STATO_RAPP", "DES_STATO_RAPP", "FK_TIPO_DOCUMENTO", "DES_TIPO_DOCUMENTO",
				"FK_SIGLA_BOLLINO", "FK_NUMERO_BOLLINO", "DATA_CONTROLLO", "B_FLG_LIBRETTO_USO",
				"B_FLG_DICHIAR_CONFORM", "B_FLG_LIB_IMP", "B_FLG_LIB_COMPL", "F_OSSERVAZIONI", "F_RACCOMANDAZIONI",
				"F_PRESCRIZIONI", "F_FLG_PUO_FUNZIONARE", "F_INTERVENTO_ENTRO", "F_ORA_ARRIVO", "F_ORA_PARTENZA",
				"F_DENOMINAZ_TECNICO", "F_FLG_FIRMA_TECNICO", "F_FLG_FIRMA_RESPONSABILE", "DATA_INVIO", "NOME_ALLEGATO",
				"DATA_ULT_MOD_ALLEGATO", "UTENTE_ULT_MOD_ALLEGATO", "CF_REDATTORE", "UID_INDEX", "F_FIRMA_TECNICO",
				"F_FIRMA_RESPONSABILE", "FLG_CONTROLLO_BOZZA", "A_POTENZA_TERMICA_NOMINALE_MAX", "ELENCO_COMBUSTIBILI",
				"ELENCO_APPARECCHIATURE", "ID_PERSONA_FISICA", "NOME", "COGNOME", "CODICE_FISCALE",
				"ISTAT_PROV_COMPETENZA", "FLG_ACC_SOSTITUTIVO", "CF_ISPETTORE_SECONDARIO", "FLG_ISP_PAGAMENTO"};
		propertyNames = new String[]{"idIspezione2018", "codiceImpianto", "idIspezIspet", "fkStatoIspezione",
				"desStatoIspezione", "enteCompetente", "dtCreazione", "dtConclusione", "flgEsito", "note", "idAllegato",
				"fkStatoRapp", "desStatoRapp", "fkTipoDocumento", "desTipoDocumento", "fkSiglaBollino",
				"fkNumeroBollino", "dataControllo", "bFlgLibrettoUso", "bFlgDichiarConform", "bFlgLibImp",
				"bFlgLibCompl", "fOsservazioni", "fRaccomandazioni", "fPrescrizioni", "fFlgPuoFunzionare",
				"fInterventoEntro", "fOraArrivo", "fOraPartenza", "fDenominazTecnico", "fFlgFirmaTecnico",
				"fFlgFirmaResponsabile", "dataInvio", "nomeAllegato", "dataUltModAllegato", "utenteUltModAllegato",
				"cfRedattore", "uidIndex", "fFirmaTecnico", "fFirmaResponsabile", "flgControlloBozza",
				"aPotenzaTermicaNominaleMax", "elencoCombustibili", "elencoApparecchiature", "idPersonaFisica", "nome",
				"cognome", "codiceFiscale", "istatProvCompetenza", "flgAccSostitutivo", "cfIspettoreSecondario",
				"flgIspPagamento"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitVRicercaIspezioni] fa riferimento
	 * (VISTA_RICERCA_ISPEZIONI).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_RICERCA_ISPEZIONI";
	}

	/**
	 * Method 'getColumnNames'
	 * Restutuisce l'insieme dei nomi delle colonne gestite dal DAO.
	 * @return String[]
	 * @generated
	 */
	public String[] getColumnNames() {
		String ris[] = new String[columnNames.length];
		System.arraycopy(columnNames, 0, ris, 0, columnNames.length);
		return ris;
	}

}
