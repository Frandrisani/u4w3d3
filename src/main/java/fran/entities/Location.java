package fran.entities;

public class Location {
    // Attributes
    private Long id;
    private String nome;
    private String citta;

    // Constructor
    public Location(String nome, String citta) {
        this.nome = nome;
        this.citta = citta;
    }

    public Location() {}

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    // toString

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", citta='" + citta + '\'' +
                '}';
    }
}
