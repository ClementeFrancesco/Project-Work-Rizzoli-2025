package its.rizzoli.projectwork25.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Registri")
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "register", orphanRemoval = true)
    private List<Visit> visits;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "register", orphanRemoval = true)
    private List<Vehicle> vehicles;

    String enterDateTime;
    String exitDateTime;

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

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getEnterDateTime() {
        return enterDateTime;
    }

    public void setEnterDateTime(String enterDateTime) {
        this.enterDateTime = enterDateTime;
    }

    public String getExitDateTime() {
        return exitDateTime;
    }

    public void setExitDateTime(String exitDateTime) {
        this.exitDateTime = exitDateTime;
    }

    public Register() {
    }
}
