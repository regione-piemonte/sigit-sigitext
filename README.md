# Project Title
SIGIT-SIGITEXT

# Project Description
Questa componente espone i servizi web service per la gestione degli impianti termici.

# Configurations
Aprire il file buildfiles/dev-rp-01.properties e configurare i seguenti parametri:
- index.wsdl.url: servizi di fruizione del gestionale documentale;

# Getting Started 
Clonare la componente sigit-sigitext dal repository git 
Modificare i file di configurazione e compilare il progetto.

# Prerequisites
I prerequisiti per l'installazione della componente sono i seguenti:
## Software
- [JDK 8](https://www.apache.org)
- [RedHat JBoss 6.4 GA](https://developers.redhat.com)  
- [PostgreSQL 9.6.11](https://www.postgresql.org/download/)  

- Tutte le librerie elencate nel BOM.csv devono essere accessibili per compilare il progetto. Le librerie sono pubblicate su http://repart.csi.it, ma per semplicità sono state incluse nella cartella lib/, ad esclusione della libreria weblogic-client-3.0.0.jar che deve essere scaricata autonomamente dal sito di Oracle.

# Installing
Installare il file ear sull'ambiente JBoss 6.4. 

# Versioning
Per la gestione del codice sorgente viene utilizzata Git. Per la gestione del versioning si fa riferimento alla metodologia [Semantic Versioning](https://semver.org/).

# Copyrights
(C) Copyright 2021 Regione Piemonte

# License
Questo software è distribuito con licenza EUPL-1.2
Consultare i file EUPL v1_2 IT-LICENSE.txt e EUPL v1_2 EN-LICENSE.txt per maggiori dettagli.

