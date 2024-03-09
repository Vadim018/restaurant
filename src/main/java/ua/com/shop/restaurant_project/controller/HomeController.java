    package ua.com.shop.restaurant_project.controller;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
    import ua.com.shop.restaurant_project.service.CategoryManagerService;

    @Controller
    public class HomeController
    {
        private  final CategoryManagerService categoryService;

        @Autowired
        public HomeController(CategoryManagerService categoryService)
        {
            this.categoryService = categoryService;
        }

        @GetMapping("/products")
        public String getProductAdmin()
        {
            return "product_admin_page";
        }

        @GetMapping("/categories")
        public String getCategoryAdmin()
        {
            return "category_admin_page";
        }

        @GetMapping("/orders")
        public String getOrdersAdmin()
        {
            return "order";
        }

        @GetMapping("/customers")
        public String getCustomersAdmin()
        {
            return "customer";
        }

        @GetMapping("/delivery")
        public String getDelivery()
        {
            return "delivery";
        }

        @GetMapping("/inform")
        public String getInfoByUsers()
        {
            return "inform";
        }

        @GetMapping("/manager")
        public String getManagerInfo() {
            return "manager";
        }
        @GetMapping("/about")
        public String getInfoAboutUs() {
            return "about";
        }
        @GetMapping("/contacts")
        public String getContactsInfo() {
            return "contacts";
        }
        @GetMapping("/gallery")
        public String getGalleryInfo() {
            return "gallery";
        }

    }