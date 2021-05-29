package com.immo.senekeur.BiensImmobilier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BiensImmobilierController {
    
    @Autowired
    private BiensImmobilierService biensImmobilierService;
	
	@Autowired
    private BiensImmobilierRepository biensImmobilierRepository;

	@GetMapping(value ="/immobiliers")
	public String getAllClients() {
        biensImmobilierService.getAllBiensImmobiliers();
		return "immobiliers";
	}

	@GetMapping(value = "/deleteImmobilier")
	public String delete(@RequestParam(name="id") Integer id) {
        biensImmobilierRepository.deleteById(id);
		return "redirect:/immobiliers";
	}
}
