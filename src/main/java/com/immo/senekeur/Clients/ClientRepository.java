package com.immo.senekeur.Clients;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer>{
    
    Optional<Client> findById(Integer id);
    List<Client> findByPrenom(String prenom);
}
