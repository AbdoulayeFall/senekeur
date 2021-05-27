package com.immo.senekeur.Clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {
    @Autowired
	ClientService clientService;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping(value ="/clients")
	public String getAllClients() {
		clientService.getAllClients();
		return "clients";
	}

	@GetMapping(value = "/deleteClient")
	public String delete(@RequestParam(name="id") Integer id) {
		clientRepository.deleteById(id);
		return "redirect:/clients";
	}
	
}
