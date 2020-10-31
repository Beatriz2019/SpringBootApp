package springbootapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springbootapplication.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository {

}
