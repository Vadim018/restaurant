package ua.com.shop.restaurant_project.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.shop.restaurant_project.bl.Cart;
import ua.com.shop.restaurant_project.bl.ItemCart;
import ua.com.shop.restaurant_project.entity.*;
import ua.com.shop.restaurant_project.repository.AddressRepository;
import ua.com.shop.restaurant_project.repository.OrderRepository;
import ua.com.shop.restaurant_project.repository.ProductHasOrderRepository;
import ua.com.shop.restaurant_project.service.ClientService;
import ua.com.shop.restaurant_project.service.CustomerManagerService;
import ua.com.shop.restaurant_project.service.UserManagerService;
import ua.com.shop.restaurant_project.service.UserService;
import java.util.Date;

@Controller
public class UserController
{
    private final UserManagerService userManagerService;
    private final UserService userService;
    private final ClientService clientService;
    private final CustomerManagerService customerManagerService;
    private final AddressRepository addressRepository;
    private final OrderRepository orderRepository;
    private final ProductHasOrderRepository productHasOrderRepository;

    @Autowired
    public UserController(UserManagerService userManagerService, UserService userService, ClientService clientService, CustomerManagerService customerManagerService, AddressRepository addressRepository, OrderRepository orderRepository, ProductHasOrderRepository productHasOrderRepository)
    {
        this.userManagerService = userManagerService;
        this.userService = userService;
        this.clientService = clientService;
        this.customerManagerService = customerManagerService;
        this.addressRepository = addressRepository;
        this.orderRepository = orderRepository;
        this.productHasOrderRepository = productHasOrderRepository;
    }

    @GetMapping("/order")
    public String getPageOrder(HttpServletRequest request, Model model)
    {
        HttpSession session = request.getSession();

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth.getName());

        Users user = null;
        try {
            user = (Users) userManagerService.loadUserByUsername(auth.getName());
        } catch (Exception e)
        {

        }

        //Users user = (Users) session.getAttribute("user");

        if (user == null)
        {
            return "redirect:/login";
        }

        Cart cart = (Cart) session.getAttribute("cart");

        if (cart == null) return "redirect:/";

        model.addAttribute("itemCart", cart.getCart());
//        model.addAttribute("totalEl", cart.getSumItemCart());
       // model.addAttribute("totalValue", cart.getTotalVal());

       // Client client = clientService.getClientByUser(user);

        Customer client = customerManagerService.getCustomerByUsername(user);
        //List<Address> addresses = addressRepository.findAllByClientes(client);

        model.addAttribute("client", client);

        //model.addAttribute("address", addresses);

        return "order";
    }

    @PostMapping("/order")
    public String saveOrderToDB(@RequestParam(name = "delivery") String delivery, @RequestParam(name = "payment") String payment, HttpServletRequest request)
    {
        HttpSession session = request.getSession();

        Cart cart = (Cart) session.getAttribute("cart");


        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth.getName());

        Users user = null;
        try {
            user = (Users) userManagerService.loadUserByUsername(auth.getName());
        } catch (Exception e)
        {

        }
//        Users user = (Users) session.getAttribute("user");

        //Client client = clientService.getClientByUser(user);

        Customer client = customerManagerService.getCustomerByUsername(user);

        Order order = new Order();

        order.setDateCreated(new Date());
        order.setCustomer(client);
        order.setDelivery(delivery);
        order.setPayment(payment);
        order.setStatusOrder(false);

        Order order1 = orderRepository.save(order);

        for (ItemCart el : cart.getCart())
        {
            productHasOrderRepository.save(new ProductHasOrder(el.getProduct(), el.getQuantity(), order1));
        }
        return "thank";
    }

    @GetMapping("/thank")
    public String getPageThank()
    {
        return "thank";
    }
}