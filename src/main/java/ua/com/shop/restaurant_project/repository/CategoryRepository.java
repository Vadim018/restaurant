package ua.com.shop.restaurant_project.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.shop.restaurant_project.entity.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long>
{
    Page<Category> findAll(Pageable pageable);
    Category findByName(String name);

    List<Category> findByNameContaining(String name);
}