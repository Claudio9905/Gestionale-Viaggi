package claudiopostiglione.gestionaleviaggi.repositories;

import claudiopostiglione.gestionaleviaggi.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, UUID> {
}
