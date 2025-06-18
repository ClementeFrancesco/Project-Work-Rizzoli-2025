package it.itsrizzoli.prjwdef;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WSPersonaController {
	ArrayList<Persona> personas = new ArrayList();
	
	public WSPersonaController() {
		personas.add(new Persona("Pippo", "pluto", ""));
		personas.add(new Persona("Topolino", "topo", ""));
		personas.add(new Persona("Clarabella", "mucca", ""));
		personas.add(new Persona("Snoopy", "cane", ""));
	}
	
	// http://localhost:8080/api/allanimals
	@RequestMapping("/api/persona")
	public ArrayList<Persona> getAllAnimali() {
		return personas;
	}

	// http://localhost:8080/api/animals?tipo=cane
	@RequestMapping("/api/persona")
	public ArrayList<Persona> getTypeOfAnimali(@RequestParam String mail) {
		ArrayList<Persona> ricerca = new ArrayList();
		
		for (Persona anim: personas)
			if (anim.cognome.equals(mail))
				ricerca.add(anim);
		
		return ricerca;
	}

}
