package claudiopostiglione.gestionaleviaggi.payload;

import claudiopostiglione.gestionaleviaggi.entities.StatoDestinazione;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record ViaggioDTO(
        @NotBlank(message = "Il nome della destinazione è obbligatorio")
        @Size(min = 2, max = 30, message = "Il nome della destinazione deve essere compreso tra i 2 e i 30 caratteri")
        String destinazione,
        @NotBlank(message = "La data di destinazione è obbligatoria")
        LocalDate dataDestinazione,
        @NotBlank(message = "Lo stato della destinazione è obbligatorio")
        StatoDestinazione stato
) {
}
