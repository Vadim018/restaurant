package ua.com.shop.restaurant_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.shop.restaurant_project.entity.Client;
import ua.com.shop.restaurant_project.entity.Users;
import ua.com.shop.restaurant_project.repository.ClientRepository;

@Service
public class ClientService
{
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client getClientByUser(Users users){
        return clientRepository.findByUser(users);
    }
}