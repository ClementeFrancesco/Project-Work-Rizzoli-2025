package its.rizzoli.projectwork25.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Visite")
public class Visit {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idOspite")
    private Guest guest;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idReceptionist")
    private Receptionist receptionist;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idReferente")
    private Referent referent;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idRegistro")
    private Register register;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    public Referent getReferent() {
        return referent;
    }

    public void setReferent(Referent referent) {
        this.referent = referent;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public Visit() {
    }
}
