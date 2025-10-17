package claudiopostiglione.gestionaleviaggi.services;

import claudiopostiglione.gestionaleviaggi.repositories.ViaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaggioService {

    @Autowired
    private ViaggioRepository viaggioRepository;
}
