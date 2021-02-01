package spring.project.com.repository;

import org.springframework.data.repository.CrudRepository;
import spring.project.com.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
