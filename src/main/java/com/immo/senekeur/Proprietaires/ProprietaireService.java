package com.immo.senekeur.Proprietaires;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProprietaireService {
    
    
    @Autowired
    ProprietaireRepository proprietaireRepository;

    public List<Proprietaire> getAllProprietaires(){
		List<Proprietaire> proprietaires = new ArrayList<>();
        proprietaireRepository.findAll()
		.forEach(proprietaires::add);
		return proprietaires;
	}
    
	
    public Optional<Proprietaire> getProprietaire(Integer id) {
		
		if (!proprietaireRepository.findById(id).isPresent())
			throw new RuntimeException();
		
		return proprietaireRepository.findById(id);
	}

    public void addProprietaire(Proprietaire proprietaire) {
		proprietaireRepository.save(proprietaire);
	}
}
