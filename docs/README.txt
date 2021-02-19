
Istruzioni per l'utilizzo dei files contenuti in questa directory.

- log4j_sigitext.properties: 
  E'il frammento di configurazione di log4j da inserire nel file di configurazione
  del server (occorre completare i path di destinazione dei file di log).
  Contiene:
  - le configurazioni del log applicativo
  - le configurazioni dello stopwatch
  - le configurazioni necessarie per abilitare coop-trace (se previsto) 

- log4j_sigitext.xml:
  E'il frammento di configuraizone di log4j necessario per configurare l'appender
  JMS che serve alle librerie coop-trace per tracciare le chiamate a servizi.
