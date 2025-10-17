package claudiopostiglione.gestionaleviaggi.services;

import claudiopostiglione.gestionaleviaggi.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;
}
