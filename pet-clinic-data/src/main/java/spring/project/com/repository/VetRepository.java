package spring.project.com.repository;

import org.springframework.data.repository.CrudRepository;
import spring.project.com.model.Vet;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
