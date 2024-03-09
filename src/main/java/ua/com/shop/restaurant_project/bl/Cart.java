/*
Цей код визначає клас Cart, який є кошиком для покупок у магазині.
Він містить список товарів cart, загальну вартість покупок totalValue та кількість товарів sumItem.

Клас має метод addNewItemToCart, який додає новий елемент у кошик.
Якщо товар вже є у кошику, то метод додає кількість quantity до існуючого товару,
інакше він додає новий товар.

Метод updateItemCart оновлює кількість певного товару у кошику.
Якщо кількість менша або дорівнює 0, то він видаляє товар з кошика,
інакше він змінює кількість товару.

Метод deleteItemFromCart видаляє товар з кошика.

Метод deleteAllItemFromCart видаляє всі товари з кошика і обнуляє загальну вартість та кількість товарів.

Методи getTotalVal та getSumItemCart повертають загальну
вартість кошика та кількість товарів у кошику відповідно.

Для зручності управління кошиком, використовується бібліотека Lombok
для автоматичної генерації геттерів та сеттерів для змінних класу.
*/

package ua.com.shop.restaurant_project.bl;

import lombok.Getter;
import lombok.Setter;
import ua.com.shop.restaurant_project.entity.Product;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter

public class Cart
{
    List<ItemCart> cart;

    private double totalValue;

    private int sumItem;
    public Cart()
    {
        cart = new ArrayList<>();
        totalValue = 0;
        sumItem = 0;
    }
    public synchronized void addNewItemToCart(Product product, int quantity)
    {
        boolean logic = true;

        for (ItemCart el : cart)
        {
            if(product.getId() == el.getProduct().getId())
            {
             logic = false;
             el.setQuantity(el.getQuantity() + quantity);
            }
        }
        if(logic) cart.add(new ItemCart(product, quantity));
    }
    public synchronized void updateItemCart(Product product, int quantity)
    {
        if(quantity <= 0)
        {
            for (ItemCart el : cart)
            {
               if(el.getProduct().getId() == product.getId())
               {
                   cart.remove(el);
                   break;
               }
            }
        }
        else
        {
            for (ItemCart el : cart)
            {
                if(product.getId() == el.getProduct().getId())
                    el.setQuantity(quantity);
            }
        }
    }
    public synchronized void deleteItemFromCart(Product product)
    {
        for (ItemCart el : cart)
        {
            if(product.getId() == el.getProduct().getId())
            {
                cart.remove(el);
                break;
            }
        }
    }
    public synchronized void deleteAllItemFromCart()
    {
        cart.clear();
        totalValue = 0;
        sumItem = 0;
    }
    public synchronized double getTotalVal()
    {
        totalValue = 0;
        for (ItemCart el : cart)
        {
            totalValue += el.getQuantity()*el.getProduct().getPrice().doubleValue();
        }
        return totalValue;
    }
    public  synchronized int getSumItemCart()
    {
        int a = 0;
        for (ItemCart el : cart)
        {
            a++;
        }
        return a;
    }
}