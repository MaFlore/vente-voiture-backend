package com.projet.classe.vente.serviceImpl;

import com.projet.classe.vente.model.Client;
import com.projet.classe.vente.repository.ClientRepository;
import com.projet.classe.vente.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    public ClientRepository clientRepository;


    @Override
    public List<Client> getAll() {
        return this.clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return this.clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client save(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public Client update(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public void deleteById(Long id) {
        this.clientRepository.deleteById(id);
    }

    @Override
    public long count() {
        return this.clientRepository.count();
    }
}
