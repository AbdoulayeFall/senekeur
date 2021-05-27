package com.immo.senekeur.Clients;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientService {


    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClients(){
		List<Client> clients = new ArrayList<>();
		clientRepository.findAll()
		.forEach(clients::add);
		return clients;
	}

    public Optional<Client> getClient(Integer id) {
		
		if (!clientRepository.findById(id).isPresent())
			throw new RuntimeException();
		
		return clientRepository.findById(id);
	}

    public void addClient(Client client) {
		clientRepository.save(client);
	}
}
