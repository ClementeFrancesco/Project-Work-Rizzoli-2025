package it.itsrizzoli.prjw;

public class Referente extends Persona { ;
    int id_referente;
    int id_visita;

    public Referente(String nome, String cognome, String mail, int id_referente, int id_visita) {
        super(nome, cognome, mail);
        this.id_referente = id_referente;
        this.id_visita = id_visita;
    }

}
