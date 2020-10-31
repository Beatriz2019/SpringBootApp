package springbootapplication.repository;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springbootapplication.entity.User;
// <User, Long> = Tipo de objeto que recibe y tipo del Id del usuario
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    // convención sobre configuración
	
	//Spring Data JPA
	//public Set<User> findByUsername(String Username);
	
	//public Iterable<User> findAllByStatus(String status);
	
    public Optional findByUsername(String username);
    public Optional findAllByStatus(String status);
	//public Optional findByIdAndPassword(Long id, String password);
}
