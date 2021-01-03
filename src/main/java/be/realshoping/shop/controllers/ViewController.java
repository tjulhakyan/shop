package be.realshoping.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String indexPage(){
        return "index";
    }

    @GetMapping("/shop")
    public String shopPage(){return "shop";}
}
