package be.realshoping.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductInsertController {

    @GetMapping("insert-product")
    public String insertProduct(){
        return "insertProduct";
    }
}