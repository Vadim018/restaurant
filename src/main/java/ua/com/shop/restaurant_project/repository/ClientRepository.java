package ua.com.shop.restaurant_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.shop.restaurant_project.entity.Client;
import ua.com.shop.restaurant_project.entity.Users;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>
{
    Client findByUser(Users users);
}