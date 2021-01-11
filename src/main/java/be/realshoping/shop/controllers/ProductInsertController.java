package be.realshoping.shop.controllers;

import be.realshoping.shop.data.Product;
import be.realshoping.shop.data.User;
import be.realshoping.shop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("product")
public class ProductInsertController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("insert-product")
    public String insertProduct(Model model){
        Product product=new Product();
        model.addAttribute("product", product);
        return "product/insertProduct";
    }

    @PostMapping("/insert-product")
    public String insertUser(@ModelAttribute("product") Product product, Model model){
        LocalDate date = LocalDate.now();
        product.setModified(date);
        product.setProductDataAdd(date);
        System.out.println(product);
        productRepository.save(product);
//        this.user=user;
//        model.addAttribute("user", user);
        return "product/insertProduct";
    }
}