package it.itsrizzoli.prjw;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WSPersonaController {
    ArrayList<Persona> persone = new ArrayList<>();

    public WSPersonaController() {
        persone.add(new Persona("Pippo", "pluto", "pippo@example.com"));
        persone.add(new Persona("Topolino", "topo", "topolino@example.com"));
        persone.add(new Persona("Clarabella", "mucca", "clarabella@example.com"));
        persone.add(new Persona("Snoopy", "cane", "snoopy@example.com"));
    }

    // http://localhost:8080/api/allpersonas
    @RequestMapping("/api/allpersonas")
    public ArrayList<Persona> getAllPersona() {
        return persone;
    }

    // http://localhost:8080/api/personas?mail=
    @RequestMapping("/api/personas")
    public ArrayList<Persona> getTypeOfPersona(@RequestParam(required = false) String mail) {
        ArrayList<Persona> ricerca = new ArrayList<>();

        if (mail == null || mail.isEmpty()) {
            return persone;
        }

        for (Persona pers: persone)
            if (pers.mail.equals(mail)) {
                ricerca.add(pers);
            }

        return ricerca;
    }

}
