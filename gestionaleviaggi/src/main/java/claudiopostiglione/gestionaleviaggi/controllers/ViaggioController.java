package claudiopostiglione.gestionaleviaggi.controllers;

import claudiopostiglione.gestionaleviaggi.entities.Viaggio;
import claudiopostiglione.gestionaleviaggi.payload.ViaggioDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/viaggio")
public class ViaggioController {

    // POST http://localhost:3005/viaggio + payload
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ViaggioController createViaggio(@RequestBody @Validated ViaggioDTO body, BindingResult validationResult) {
    }

    // GET  http://localhost:3005/viaggio
    @GetMapping
    public Page<Viaggio> getAllViaggi(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "nome") String sortBy) {
    }

    // GET  http://localhost:3005/viaggio/{viaggioId}
    @GetMapping("/{viaggioId}")
    @ResponseStatus(HttpStatus.FOUND)
    public Viaggio getViaggioById(@PathVariable UUID viaggioId) {
    }

    // PUT  http://localhost:3005/viaggio/{viaggioId} + payload
    @PutMapping("/{viaggioId}")
    public Viaggio getViaggioByIdAndUpdate(@PathVariable UUID viaggioId, @RequestBody ViaggioDTO bodyUpdate) {
    }

    // DELETE http://localhost:3005/viaggio/{viaggioId}
    @DeleteMapping("/{viaggioId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void getViaggioByIdAndDelete(@PathVariable UUID viaggioID) {
    }
}
