package it.itsrizzoli.prjw;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WSPersonaController {
    ArrayList<Persona> persone = new ArrayList();

    public WSPersonaController() {
        persone.add(new Persona("Pippo", "pluto", "pippo@example.com"));
        persone.add(new Persona("Topolino", "topo", "topolino@example.com"));
        persone.add(new Persona("Clarabella", "mucca", "clarabella@example.com"));
        persone.add(new Persona("Snoopy", "cane", "snoopy@example.com"));
    }

    // http://localhost:8080/api/personas
    @RequestMapping("/api/allpersonas")
    public ArrayList<Persona> getAllPersona() {
        return persone;
    }

    // http://localhost:8080/api/animals?tipo=cane
    @RequestMapping("/api/personas")
    public ArrayList<Persona> getTypeOfPersona(@RequestParam String mail) {
        ArrayList<Persona> ricerca = new ArrayList();

        for (Persona pers: persone)
            if (pers.mail.equals(mail)) {
                ricerca.add(pers);
            }

        return ricerca;
    }

}
