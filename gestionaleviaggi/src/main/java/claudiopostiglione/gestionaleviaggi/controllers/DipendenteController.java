package claudiopostiglione.gestionaleviaggi.controllers;

import claudiopostiglione.gestionaleviaggi.entities.Dipendente;
import claudiopostiglione.gestionaleviaggi.payload.DipendenteDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/dipendente")
public class DipendenteController {

    // POST http://localhost:3005/dipendente + payload
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Dipendente createDipendente(@RequestBody @Validated DipendenteDTO body, BindingResult validationResult){}

    // GET  http://localhost:3005/dipendente
    @GetMapping
    public Page<Dipendente> getAllDipendenti(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "nome") String sortBy){}

    // GET  http://localhost:3005/dipendente/{dipendenteId}
    @GetMapping("/{dipendenteId}")
    @ResponseStatus(HttpStatus.FOUND)
    public Dipendente getDipendenteById(@PathVariable UUID dipendenteId){}

    // PUT  http://localhost:3005/dipendente/{dipendenteId} + payload
    @PutMapping("/{dipendenteId}")
    public Dipendente getDipendenteByIdAndUpdate(@PathVariable UUID dipendenteId, @RequestBody DipendenteDTO bodyUpdate){}

    // DELETE http://localhost:3005/dipendente/{dipendenteId}
    @DeleteMapping("/{dipendenteId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void getDipendenteByIdAndDelete(@PathVariable UUID dipendenteID){}
}
