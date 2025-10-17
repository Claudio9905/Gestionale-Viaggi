package claudiopostiglione.gestionaleviaggi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "dipendente")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Dipendente {

    //Attributi
    @Id
    @GeneratedValue
    private UUID id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Cognome")
    private String congnome;
    @Column(name = "Username")
    private String username;
    @Column(name = "Email")
    private String email;
    @Column(name = "Immagine_Profilo")
    private String imageProfile;

    @JsonIgnore
    @OneToMany(mappedBy = "dipendente")
    private List<Prenotazione> listaPrenotazioni = new ArrayList<>();


    //Costruttori
    public Dipendente(String nome, String congnome, String username, String email) {
        this.nome = nome;
        this.congnome = congnome;
        this.username = username;
        this.email = email;
    }

    //Metodi


}
