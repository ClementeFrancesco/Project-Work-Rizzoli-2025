package it.itsrizzoli.prjwdef;

public class Receptionist extends Persona {
    int id_receptionist;
    String password;
    int id_referente;

    public Receptionist(String nome, String cognome, String mail, int id_receptionist, String password, int id_referente) {
        super(nome, cognome, mail);
        this.id_receptionist = id_receptionist;
        this.password = password;
        this.id_referente = id_referente;
    }
}
