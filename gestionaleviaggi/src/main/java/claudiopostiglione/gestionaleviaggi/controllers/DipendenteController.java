package claudiopostiglione.gestionaleviaggi.controllers;

import claudiopostiglione.gestionaleviaggi.entities.Dipendente;
import claudiopostiglione.gestionaleviaggi.exceptions.ValidationException;
import claudiopostiglione.gestionaleviaggi.payload.DipendenteDTO;
import claudiopostiglione.gestionaleviaggi.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/dipendenti")
public class DipendenteController {

    @Autowired
    private DipendenteService dipendenteService;


    // POST http://localhost:3005/dipendenti + payload
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Dipendente createDipendente(@RequestBody @Validated DipendenteDTO body, BindingResult validationResult) {
        if (validationResult.hasErrors()) {
            throw new ValidationException(validationResult.getFieldErrors().stream().map(fieldError -> fieldError.getDefaultMessage()).toList());
        }
        return this.dipendenteService.saveDipendente(body);
    }

    // GET  http://localhost:3005/dipendenti
    @GetMapping
    public Page<Dipendente> getAllDipendenti(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "id") String sortBy) {
        return this.dipendenteService.findAllDipendenti(page, size, sortBy);
    }

    // GET  http://localhost:3005/dipendenti/{dipendenteId}
    @GetMapping("/{dipendenteId}")
    @ResponseStatus(HttpStatus.FOUND)
    public Dipendente getDipendenteById(@PathVariable UUID dipendenteId) {
        return this.dipendenteService.findDipendenteById(dipendenteId);
    }

    // PUT  http://localhost:3005/dipendenti/{dipendenteId} + payload
    @PutMapping("/{dipendenteId}")
    public Dipendente getDipendenteByIdAndUpdate(@PathVariable UUID dipendenteId, @RequestBody DipendenteDTO bodyUpdate) {
        return this.dipendenteService.findDipendenteByIdAndUpdate(dipendenteId, bodyUpdate);
    }

    // DELETE http://localhost:3005/dipendenti/{dipendenteId}
    @DeleteMapping("/{dipendenteId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void getDipendenteByIdAndDelete(@PathVariable UUID dipendenteId) {
        this.dipendenteService.findDipendenteByIdAndDelete(dipendenteId);
    }
}
