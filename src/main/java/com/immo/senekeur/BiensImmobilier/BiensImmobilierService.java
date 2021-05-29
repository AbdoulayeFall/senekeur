package com.immo.senekeur.BiensImmobilier;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BiensImmobilierService {
    @Autowired
    BiensImmobilierRepository biensImmobilierRepository;

    public List<BiensImmobilier> getAllBiensImmobiliers(){
		List<BiensImmobilier> biensImmobiliers = new ArrayList<>();
		biensImmobilierRepository.findAll()
		.forEach(biensImmobiliers::add);
		return biensImmobiliers;
	}
    
	
    public Optional<BiensImmobilier> getBiensImmobilier(Integer id) {
		
		if (!biensImmobilierRepository.findById(id).isPresent())
			throw new RuntimeException();
		
		return biensImmobilierRepository.findById(id);
	}

    public void addBiensImmobilier(BiensImmobilier biensImmobilier) {
		biensImmobilierRepository.save(biensImmobilier);
	}
}
