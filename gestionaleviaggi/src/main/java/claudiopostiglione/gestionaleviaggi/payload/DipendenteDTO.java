package claudiopostiglione.gestionaleviaggi.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DipendenteDTO(
        @NotBlank(message = "Il nome è obbligatorio")
        @Size(min = 2, max = 20, message = "Il nome deve avere un minimo 2 due caratteri e un massimo di 20")
        String nome,
        @Size(min = 2, max = 20, message = "Il cognome deve avere un minimo 2 due caratteri e un massimo di 20")
        String cognome,
        @Size(min = 2, max = 20, message = "Lo username deve avere un minimo 2 due caratteri e un massimo di 20")
        String username,
        @NotBlank
        @Email(message = "L'indirizzo e-mail inserito non è del formato corretto")
        String email
) {
}
