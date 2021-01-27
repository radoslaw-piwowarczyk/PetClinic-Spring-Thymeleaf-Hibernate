package spring.project.com.service;

import spring.project.com.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById (Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
