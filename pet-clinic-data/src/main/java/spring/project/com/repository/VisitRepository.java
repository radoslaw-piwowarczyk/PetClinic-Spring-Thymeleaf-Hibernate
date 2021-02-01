package spring.project.com.repository;

import org.springframework.data.repository.CrudRepository;
import spring.project.com.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
