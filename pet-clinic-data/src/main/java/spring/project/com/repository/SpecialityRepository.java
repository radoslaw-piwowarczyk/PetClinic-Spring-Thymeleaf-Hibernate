package spring.project.com.repository;

import org.springframework.data.repository.CrudRepository;
import spring.project.com.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
