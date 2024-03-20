package fran.entities;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "partecipazione")
public class Partecipazione {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Persona persona;
    private Evento evento;
    @Column(name="stato")
    @Enumerated(EnumType.STRING)
    private StatoPartecipazione stato;
    @OneToMany(mappedBy = "partecipazione")
    private List<Evento> eventiList;
    @OneToMany(mappedBy = "partecipazione")
    private List<Persona> personaList;

    // Constructor
    public Partecipazione(Persona persona, Evento evento, StatoPartecipazione stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public Partecipazione() {}

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public StatoPartecipazione getStato() {
        return stato;
    }

    public void setStato(StatoPartecipazione stato) {
        this.stato = stato;
    }

    // toString

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona=" + persona +
                ", evento=" + evento +
                ", stato=" + stato +
                '}';
    }
}
