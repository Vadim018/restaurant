package ua.com.shop.restaurant_project.bl;

import lombok.*;
import ua.com.shop.restaurant_project.entity.Product;
/*
 Геттер і Сеттер - це методи, які використовуються для отримання
 та встановлення значення приватних змінних класу.
 Геттер повертає значення змінної, а сеттер встановлює значення змінної.
*/
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ItemCart
{
    private Product product;

    private int quantity;
}