package claudiopostiglione.gestionaleviaggi.exceptions;

import claudiopostiglione.gestionaleviaggi.payload.ErrorsDTO;
import claudiopostiglione.gestionaleviaggi.payload.ErrorsWithListDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;

@RestControllerAdvice
public class ExceptionsHandler extends RuntimeException {

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorsDTO handleBadRequestException(BadRequestException ex){
        return new ErrorsDTO(ex.getMessage(), LocalDate.now());
    }

    @ExceptionHandler(IdNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorsDTO handleIdNotFoundException(IdNotFoundException ex){
        return new ErrorsDTO(ex.getMessage(), LocalDate.now());
    }

    @ExceptionHandler(ValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorsWithListDTO handleValidationException(ValidationException ex){
        return new ErrorsWithListDTO(ex.getMessage(), LocalDate.now(), ex.getErrorsMessages());
    }

}
