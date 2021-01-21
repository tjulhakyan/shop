package be.realshoping.shop.controllers;

import be.realshoping.shop.data.Product;
import be.realshoping.shop.data.ProductImage;
import be.realshoping.shop.data.User;
import be.realshoping.shop.repositories.ProductRepository;
import be.realshoping.shop.service.FileService;
import be.realshoping.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("product")
public class ProductInsertController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService prodServ;

    @Autowired
    FileService fileService;

    @GetMapping("insert-product")
    public String insertProduct(Model model){
        Product product=new Product();
        model.addAttribute("product", product);
        return "product/insertProduct";
    }

    @PostMapping("/insert-product")
    public String insertUser(@ModelAttribute("product") Product product, @RequestParam("files") MultipartFile[] files,
                             RedirectAttributes redirectAttributes, Model model){
        LocalDate date = LocalDate.now();
        product.setModified(date);
        product.setProductDataAdd(date);
        System.out.println(product);

        Arrays.asList(files)
                .stream()
//                .peek(file -> System.out.println(file.getOriginalFilename()))
                .forEach(file -> fileService.uploadFile(file));

        List<ProductImage> prodImg= Arrays.asList(files).stream()
                .map(file -> new ProductImage(file.getOriginalFilename(), product))
                .collect(Collectors.toList());

        product.setProductImages(prodImg);

        productRepository.save(product);
//        this.user=user;
//        model.addAttribute("user", user);
        return "product/insertProduct";
    }


    @GetMapping("/all-products")
    public String showAllProducts(Model model){
        List<Product> listProducts = new ArrayList<>();
        listProducts=prodServ.getAllProducts();
        listProducts.forEach(System.out::println);
//        System.out.println("/n=============================/n");
//        listProducts.forEach(pr->pr.getProductImages().stream().forEach(System.out::println));
//        System.out.println("/n=============================/n");
        model.addAttribute("products", prodServ.getAllProducts());
        return "product/allProducts";
    }
}