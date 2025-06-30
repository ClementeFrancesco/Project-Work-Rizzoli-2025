package its.rizzoli.projectwork25.repositories;

import its.rizzoli.projectwork25.model.Guest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<Guest, Long> {
    Guest findById(long id);
    List<Guest> findByName(String name);
    List<Guest> findByEmail(String email);
    List<Guest> findBySurname(String surname);
    List<Guest> findByCompanyName(String companyName);
    List<Guest> findByTelephone(String telephone);
}
