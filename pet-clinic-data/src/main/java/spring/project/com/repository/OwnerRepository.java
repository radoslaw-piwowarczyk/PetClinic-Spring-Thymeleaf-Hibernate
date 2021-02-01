package spring.project.com.repository;

import org.springframework.data.repository.CrudRepository;
import spring.project.com.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
