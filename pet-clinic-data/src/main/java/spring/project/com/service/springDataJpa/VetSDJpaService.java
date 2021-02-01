package spring.project.com.service.springDataJpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.project.com.model.Vet;
import spring.project.com.repository.VetRepository;
import spring.project.com.service.VetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springDataJpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
