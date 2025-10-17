# Gestionale-Viaggi
Progetto basato sulla realizzazione di un gestionale di viaggi di lavoro aziendali. 
- Viaggio: rappresenta un viaggio di lavoro, caratterizzato da una destinazione, una data e uno stato( in programma, completato).
- Dipendente: rappresenta un dipendente che può essere assegnato a un viaggio. Ogni dipendente ha un nome, cognome, username e e-mail.

Verrà gestita la prenotazione di un viaggio da parte di un dipendente. Ogni prenotazione ha un riferimento al viaggio, una data di richiesta, e può includere note o preferenze per il dipendente ( es- preferenze di volo, alloggio). Un dipendente non può avere più prenotazioni per lo stesso giorno.

Le entità coinvolte sono : VIAGGIO, DIPENDENTE e PRENOTAZIONE. Sotto il modello ERM:
<img width="1195" height="705" alt="Screenshot 2025-10-17 164601" src="https://github.com/user-attachments/assets/48e6d6e2-a3bd-4d9d-b79f-8204c76d7e7f" />

Il web service contiene anche le operazioni CRUD per la gestione dei viaggi e dei dipendenti, oltre ad un endpoint per consentire l'assegnazione di un dipendente ad un viaggio.
Presente un endpoint per modificare lo stato del viaggio ( da "IN_PROGRAMMA" a "COMPLETATO").
Implementato anche un endpoint per per l'upload dell'immagine profilo di un dipendente.
Presente la gestione della convalida dei dati e il prevenimento delle prenotazioni di viaggi per dipendenti già impegnati in altre date.

TECNOLOGIE USATE:
- Spring Boot(per la creazione del progetto)
- Spring Data JPA
- Spring Web
- PostgreSQL (per la parte Database)
- Postman(per le chiamate API)
- Dipendenze: ( Cloudinary, per gestire la parte dell'upload dell'immagine di profilo del dipendente tramite l'URL estratto / Lombok / Validation per gestire l'aspetto delle validazioni degli endpoint REST) 
