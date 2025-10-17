package claudiopostiglione.gestionaleviaggi.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.UUID;

public record PrenotazioneDTO(
        @JsonFormat(pattern = "dd-MM-yyyy")
        LocalDate dataRichiesta,
        @Size(min = 0, max = 150, message = "Le note/preferenze possono non esserci oppure avere un massimo di 150 caratteri")
        String notePreferenze,
        @NotBlank(message = "L'ID del dipendente è obbligatorio")
        UUID dipendenteId,
        @NotBlank(message = "L'ID del viaggio è obbligatorio")
        UUID viaggioId
) {
}
