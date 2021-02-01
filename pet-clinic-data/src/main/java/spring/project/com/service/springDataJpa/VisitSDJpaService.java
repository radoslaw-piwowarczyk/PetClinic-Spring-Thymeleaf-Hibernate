package spring.project.com.service.springDataJpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.project.com.model.Visit;
import spring.project.com.repository.VisitRepository;
import spring.project.com.service.VisitService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springDataJpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
