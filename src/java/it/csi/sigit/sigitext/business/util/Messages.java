/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitext.business.util;

public class Messages {

	// Classe che contieni le costanti MESSAGGI
	public final static String ERROR_RECUPERO_DB = "Errore durante il recupero dei dati";
	public final static String ERROR_INSERT_DB = "Errore durante l'inserimento dei dati. Contattare l'amministratore di sistema";
	public final static String ERROR_UPDATE_DB = "Errore durante l'aggiornamento dei dati. Contattare l'amministratore di sistema";
	public final static String ERROR_GENERAZIONE_MODULO = "Errore nella generazione del modulo";
	public final static String ERROR_RECUPERO_SERVIZIO = "Errore durante il recupero dei dati dal servizio";
	public final static String ERROR_NESSUN_LIBRETTO_CONSOLIDATO_TROVATO = "Non sono presenti libretti consolidati negli ultimi 5";
	public final static String ERROR_IMPIANTO_NON_CENSITO = "Impossibile procedere. Impianto non ancora censito";
	public final static String ERROR_LIBRETTO_IMPIANTO_PRESENTE = "Impossibile procedere. L'impianto ha gia' un libretto";
	public final static String ERROR_RUOLO_UTENTE_LOGGATO = "XML corretto. Con il ruolo attuale non si puo' procedere poiche' non e' possibile associare il manutentore alle componenti della scheda 4";
	public final static String ERROR_IMPIANTO_NON_CENTRALIZZATO = "Prima di procedere e' necessario eseguire un aggiornamento dei dati di ubicazione dell'impianto";
	public final static String ERROR_CODICE_IMPIANTO_DIVERSO_DA_CODICE_CATASTO = "Il codice impianto indicato sull' XML e' diverso da quello comunicato tra i parametri in input";
	public final static String ERROR_DATA_INTERVENTO_PRECEDENTE_DATA_CONTROLLO = "Non e' possibile indicare una data intervento raccomandato precedente alla data del rapporto di controllo";
	public final static String ERROR_FORMAT_DATA_CONTROLLO = "Formato della data controllo non valido";
	public final static String ERROR_PORTATA_COMBUSTIBILE_NON_TROVATA = "Errore: portata combustibile senza alcuna unita' di misura";		
	public final static String ERROR_PORTATA_COMBUSTIBILE_NON_COERENTE = "Errore: unita' di misura della portata combustibile non coerente con il valore atteso";		
	public final static String ERROR_NESSUN_RESPONSABILE_A_DATA_CONTROLLO = "Errore: impossibile creare il rapporto di controllo in quanto non esiste una responsabile o un terzo responsabile valido alla data del controllo ##value1## sull'impianto ##value2##";
	public final static String ERROR_NESSUN_RESPONSABILE_A_DATA_CORRENTE = "Errore: impossibile creare la versione aggiornata del libretto in quanto non esiste una responsabile valido alla data odierna ##value1## sull'impianto ##value2##";
	public final static String ERROR_RESPONSABILE_ASSENTE = "Non esistono responsabili attivi";
	public final static String ERROR_IMPOSSIBILE_CONSOLIDARE = "Impossibile consolidare";
	public final static String ERROR_TIPO_CONTROLLO = "Tipo controllo non valido";
	public final static String ERROR_TOKEN_NON_VALIDO = "TOKEN non valido";
	public final static String ERROR_IMPRESA_CESSATA = "L'impresa non puo' operare";
	public final static String ERROR_IMPRESA_NON_ABILITATA_SU_IMPIANTO = "L'impresa non e' abilitata sull'impianto";
	public final static String ERROR_LIBRETTO_NON_TROVATO = "Libretto non trovato";
	public final static String ERROR_CODICE_IMPIANTO_NON_VALIDO = "Codice impianto non valido";
	
	public final static String S044 = "non si posseggono i privilegi per visionare e/o operare sul documento selezionato";
	public final static String S052 = "il manutentore ha cessato l'attivita' in data ##value## non e' possibile inserire una data di controllo successiva";
	public final static String S096 = "Errore: il file non e' presente oppure non ha il formato richiesto (##value##)";
	public final static String S097 = "nome file non coerente con le specifiche";
	public final static String S098 = "struttura file non conforme all'XSD concordato";
	public final static String S099 = "codice impianto ##value## sprovvisto di libretto consolidato";
	public final static String S100 = "il manutentore indicato ##value## non censito";
	public final static String S101 = "il manutentore indicato ##value## non risulta associato all'impianto ##valueCodImpianto## alla data attuale per la tipologia REE ##valueTipoAllegato##";
	public final static String S102 = "la data controllo non puo' essere futura (##value##)";
	public final static String S103 = "il bollino indicato ##value## non e' corretto";
	public final static String S105 = "il tag ##value## non e' coerente con il valore atteso";
	public final static String S106 = "La componente ##value1## non risulta associata al manutentore ##value2## oppure risulta dismessa";
	public final static String S107_GT = "composizione impianto ##value## discordante da quanto presente su CIT. Verificare le prove fumi dei componenti GT";
	public final static String S107_GF = "composizione impianto ##value## discordante da quanto presente su CIT. Verificare i circuiti dei componenti GF";
	public final static String S130 = "incongruenza sulle date per il componente ##value1##-##value2## installato il ##value3##: la data di installazione deve essere successiva o uguale alla data di dismissione del medesimo";
	public final static String S131 = "incongruenza sulle date per il componente ##value1##-##value2##: la data di installazione [##value3##] deve essere successiva alla data di dismissione [##value4##]";
	public final static String S132 = "incongruenza sul GT collegato per la componente ##value1##-##value2##, il GT-##value3## non e' presente";
	public final static String S133 = "il dato ##value1## ##value2## non e' presente nel sistema";
	public final static String S134 = "incongruenza sulla data per il componente ##value1##-##value2##: la data ##value3## non puo' essere futura";
	public final static String S137 = "selezionare almeno un elemento della sezione ##value##";
	public final static String S142 = "incongruenza sulle date per il componente ##value1##-##value2##: la data di installazione [##value3##] deve essere successiva alla data di installazione [##value4##]";
	public final static String S143 = "incongruenza sulle date per il componente ##value1##-##value2##: la data di dismissione [##value3##] deve essere successiva alla data di dismissione [##value4##]";
	public final static String S147 = "non e' possibile procedere in quanto la ditta indicata (##value1## CF/PIVA ##value2##) e' in stato RADIATO o SOSPESO";
	public final static String S157 = "codice impianto ##value## prima di procedere e' necessario eseguire un aggiornamento dei dati di ubicazione dell'impianto";
	
}
