package it.itsrizzoli.prjwdef;

public class Visita {
    int id_visita;
    int id_receptionist;
    int id_referente;
    int id_ospite;
    String motivo;
    Boolean stato;
    String referente;

    public Visita(int id_visita, String referente, String motivo, Boolean stato, int id_referente, int id_ospite, int id_receptionist) {
        this.id_visita = id_visita;
        this.referente = referente;
        this.motivo = motivo;
        this.stato = stato;
        this.id_referente = id_referente;
        this.id_ospite = id_ospite;
        this.id_receptionist = id_receptionist;
    }
}
