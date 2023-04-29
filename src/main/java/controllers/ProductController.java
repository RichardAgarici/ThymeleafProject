package controllers;

import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
    public String getProduct() {
        return "product";
    }
}
