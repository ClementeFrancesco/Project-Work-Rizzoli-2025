package its.rizzoli.projectwork25.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "Ospiti")
public class Guest {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "guest", orphanRemoval = true)
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

    @Size(min = 3, max = 25, message = "Il Nome dell'Azienda deve essere tra 3 e 25 caratteri.")
    @NotNull(message = "Il Nome dell'Azienda non può essere nulla.")
    @Column(nullable = false)
    String companyName;

    @Pattern(regexp = "\\d{10}", message = "Il Numero di Telefono deve essere composto da 10 cifre.")
    @NotNull(message = "Il Numero di Telefono non può essere nullo.")
    @Column(nullable = false)
    String telephone;

    @NotNull(message = "La Foto non può essere nulla.")
    @Column(nullable = false)
    String photoUrl;

    @NotNull(message = "Il Documento (Carta d'Identià o Patente) non può essere nullo.")
    @Column(nullable = false)
    String documentUrl;

    @NotNull(message = "Il Codice Fiscale non può essere nullo.")
    @Column(nullable = false)
    String taxId;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public Guest() {}
}
