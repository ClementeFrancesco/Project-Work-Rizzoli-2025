package its.rizzoli.projectwork25.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "Referenti")
public class Referent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "referent", orphanRemoval = true)
    private List<Visit> visits;

    @Size(min = 3, max = 32, message = "Il Nome deve essere tra 3 e 32 caratteri.")
    @NotNull(message = "Il Nome non può essere nullo.")
    @Column(nullable = false)
    String name;

    @Size(min = 3, max = 25, message = "Il Cognome deve esser tra 3 e 25 caratteri.")
    @NotNull(message = "Il Cognome non può essere nullo.")
    @Column(nullable = false)
    String surname;

    @Size(min = 5, max = 25, message = "La Mail deve esser tra 5 e 25 caratteri.")
    @Email(message = "La Mail inserita non è valida.")
    @NotNull(message = "La Mail non può essere nulla.")
    @Column(nullable = false)
    String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Referent() {
    }
}
