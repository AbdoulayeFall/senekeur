package com.immo.senekeur.Proprietaires;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProprietaireController {
    @Autowired
	ProprietaireService proprietaireService;
	
	@Autowired
	private ProprietaireRepository proprietaireRepository;
	
	@GetMapping(value ="/proprietaires")
	public String getAllProprietaires() {
		proprietaireService.getAllProprietaires();
		return "proprietaires";
	}

	@GetMapping(value = "/deleteProprietaire")
	public String delete(@RequestParam(name="id") Integer id) {
		proprietaireRepository.deleteById(id);
		return "redirect:/propritaires";
	}
}
