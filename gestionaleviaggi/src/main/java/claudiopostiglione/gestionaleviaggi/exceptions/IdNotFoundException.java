package claudiopostiglione.gestionaleviaggi.exceptions;

import java.util.UUID;

public class IdNotFoundException extends RuntimeException {
    public IdNotFoundException(String message) {
        super(message);
    }
}
