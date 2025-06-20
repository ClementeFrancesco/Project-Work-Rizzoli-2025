package it.itsrizzoli.prjw;

import java.util.Date;

public class Registro{
    int id_registro;
    Date data_entrata;
    Date data_uscita;
    Date orario_entrata;
    Date orario_uscita;
    int id_veicolo;
    int id_visita;

    public Registro(int id_visita, Date orario_uscita, int id_veicolo, Date orario_entrata, Date data_uscita, int id_registro, Date data_entrata) {
        this.id_visita = id_visita;
        this.orario_uscita = orario_uscita;
        this.id_veicolo = id_veicolo;
        this.orario_entrata = orario_entrata;
        this.data_uscita = data_uscita;
        this.id_registro = id_registro;
        this.data_entrata = data_entrata;
    }
}
