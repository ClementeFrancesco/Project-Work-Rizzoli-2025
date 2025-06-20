package it.itsrizzoli.prjw;

public class Ospite extends Persona {
    String nome_azienda;
    int numerocellurare;
    String codicefiscale;
    int id_ospite;
    public Ospite(String nome, String cognome, String mail, int numerocellurare, String nome_azienda, String codicefiscale, int id_ospite) {
        super(nome, cognome, mail);
        this.numerocellurare = numerocellurare;
        this.nome_azienda = nome_azienda;
        this.codicefiscale = codicefiscale;
        this.id_ospite = id_ospite;
    }
}
