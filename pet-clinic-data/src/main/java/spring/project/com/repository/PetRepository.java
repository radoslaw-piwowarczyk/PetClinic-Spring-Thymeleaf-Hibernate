package spring.project.com.repository;

import org.springframework.data.repository.CrudRepository;
import spring.project.com.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
