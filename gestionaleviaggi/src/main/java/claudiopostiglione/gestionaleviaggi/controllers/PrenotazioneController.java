package claudiopostiglione.gestionaleviaggi.controllers;


import claudiopostiglione.gestionaleviaggi.entities.Prenotazione;
import claudiopostiglione.gestionaleviaggi.payload.PrenotazioneDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/prenotazione")
public class PrenotazioneController {

    // POST http://localhost:3005/prenotazione + payload
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PrenotazioneController createPrenotazione(@RequestBody @Validated PrenotazioneDTO body, BindingResult validationResult) {
    }

    // GET  http://localhost:3005/prenotazione
    @GetMapping
    public Page<Prenotazione> getAllPrenotazioni(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "nome") String sortBy) {
    }

    // GET  http://localhost:3005/prenotazione/{prenotazioneId}
    @GetMapping("/{prenotazioneId}")
    @ResponseStatus(HttpStatus.FOUND)
    public Prenotazione getPrenotazioneById(@PathVariable UUID prenotazioneId) {
    }

    // PUT  http://localhost:3005/prenotazione/{prenotazioneId} + payload
    @PutMapping("/{prenotazioneId}")
    public Prenotazione getPrenotazioneByIdAndUpdate(@PathVariable UUID prenotazioneId, @RequestBody PrenotazioneDTO bodyUpdate) {
    }

    // DELETE http://localhost:3005/prenotazione/{prenotazioneId}
    @DeleteMapping("/{prenotazioneId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void getPrenotazioneByIdAndDelete(@PathVariable UUID prenotazioneID) {
    }
}
