package claudiopostiglione.gestionaleviaggi.services;

import claudiopostiglione.gestionaleviaggi.entities.Prenotazione;
import claudiopostiglione.gestionaleviaggi.entities.Viaggio;
import claudiopostiglione.gestionaleviaggi.exceptions.IdNotFoundException;
import claudiopostiglione.gestionaleviaggi.payload.PrenotazioneDTO;
import claudiopostiglione.gestionaleviaggi.repositories.PrenotazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Autowired
    private ViaggioService viaggioService;

    @Autowired
    private DipendenteService dipendenteService;

    // 1. per la chiamata POST
    public Prenotazione savePrenotazione(PrenotazioneDTO body) {




        Prenotazione newPrenotazione = new Prenotazione(body.dataRichiesta(), body.notePreferenze());

        this.prenotazioneRepository.save(newPrenotazione);

        log.info("La prenotazione " + newPrenotazione  +" è stata salvata corretamente");
        return newPrenotazione;

    }

    //2. per la chiamata GET
    public Page<Prenotazione> findAllViaggi(int numPage, int sizePage, String sortBy) {

        if (sizePage > 50) sizePage = 50;
        sortBy = "dataRichiesta";
        Pageable pageable = PageRequest.of(numPage, sizePage, Sort.by(sortBy).ascending());

        return this.prenotazioneRepository.findAll(pageable);

    }

    //3 per la chiamata GET ID
    public Prenotazione findPrenotazioneById(UUID prenotazioneId) {
        return this.prenotazioneRepository.findById(prenotazioneId).orElseThrow(() -> new IdNotFoundException("La prenotazione con ID " + prenotazioneId + " non è stato trovata"));
    }

    //4. per la chiamata PUT
    public Prenotazione findPrenotazioneByIdAndUpdate(UUID prenotazioneId, PrenotazioneDTO newBody) {

        //Controllo l'ID del prenotazione se esiste
        Prenotazione prenotazioneFound = this.findPrenotazioneById(prenotazioneId);

        prenotazioneFound.setDataRichiesta(newBody.dataRichiesta());
        prenotazioneFound.setNotePreferenze(newBody.notePreferenze());

        Prenotazione updatePrenotazione = this.prenotazioneRepository.save(prenotazioneFound);
        log.info("La prenotazione con ID " + updatePrenotazione.getId() + " è stata aggiornata correttamente");
        return updatePrenotazione;
    }

    //5. per la chiamata DELETE
    public void findPrenotazioneByIdAndDelete(UUID prenotazioneId) {
        Prenotazione prenotazioneFound = this.findPrenotazioneById(prenotazioneId);
        this.prenotazioneRepository.delete(prenotazioneFound);
    }
}
