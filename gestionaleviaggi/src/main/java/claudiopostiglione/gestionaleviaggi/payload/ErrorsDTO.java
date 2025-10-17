package claudiopostiglione.gestionaleviaggi.payload;

import java.time.LocalDate;

public record ErrorsDTO(
        String message,
        LocalDate timestamp
) {
}
