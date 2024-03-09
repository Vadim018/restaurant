package ua.com.shop.restaurant_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.shop.restaurant_project.entity.Order;
import ua.com.shop.restaurant_project.service.OrderManagerService;
@Service
public class OrderManagerController
{
    private final OrderManagerService orderService;

    @Autowired
    public OrderManagerController(OrderManagerService orderService)
    {
        this.orderService = orderService;
    }

//    @GetMapping("/order")
//    public String getAllOrderPage(Model model)
//    {
//        model.addAttribute("order1", orderService.findListOrderByStatus(false));
//        model.addAttribute("order2", orderService.findListOrderByStatus(true));
//        return "order";
//    }

    @PostMapping("/updateOrder")
    public String updateOrder(@RequestParam(value = "id") Order order)
    {
        orderService.updateOrderNewStatus(order);
        return "redirect:/order";
    }
}