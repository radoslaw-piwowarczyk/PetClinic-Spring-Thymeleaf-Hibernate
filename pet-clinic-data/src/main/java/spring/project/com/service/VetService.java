package spring.project.com.service;

import spring.project.com.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save (Vet vet);
    Set<Vet> findAll();
}
