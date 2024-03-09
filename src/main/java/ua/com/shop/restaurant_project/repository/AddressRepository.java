package ua.com.shop.restaurant_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.shop.restaurant_project.entity.Address;
import ua.com.shop.restaurant_project.entity.Client;
import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long>
{
    List<Address> findAllByClientes(Client client);
}