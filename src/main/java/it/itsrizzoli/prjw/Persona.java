package it.itsrizzoli.prjw;

public class Persona {
    String nome;
    String cognome;
    String mail;

    public Persona(String nome, String cognome,String mail) {
        super();
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Persona [nome=" + nome + ", razza=" + cognome + ", mail=" + mail + "]";
    }
}
