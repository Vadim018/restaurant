package ua.com.shop.restaurant_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.shop.restaurant_project.entity.Attribute;

public interface AttributeRepository extends JpaRepository<Attribute,Long>
{

}