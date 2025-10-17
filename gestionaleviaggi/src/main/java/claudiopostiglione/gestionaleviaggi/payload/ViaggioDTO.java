package claudiopostiglione.gestionaleviaggi.payload;

import claudiopostiglione.gestionaleviaggi.entities.StatoDestinazione;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalTime;

public record ViaggioDTO(
        @NotBlank(message = "Il nome della destinazione è obbligatorio")
        @Size(min = 2, max = 30, message = "Il nome della destinazione deve essere compreso tra i 2 e i 30 caratteri")
        String destinazione,
        @NotBlank(message = "La data di destinazione è obbligatoria")
        @JsonFormat(pattern = "dd-MM-yyyy")
        LocalDate dataDestinazione,
        @NotBlank(message = "L'orario della partenza è obbligatorio")
        @JsonFormat(pattern = "HH:mm")
        LocalTime orarioPartenza,
        @NotBlank(message = "Lo stato della destinazione è obbligatorio")
        StatoDestinazione stato
) {
}
