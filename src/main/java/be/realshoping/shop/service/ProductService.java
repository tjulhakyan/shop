package be.realshoping.shop.service;

import be.realshoping.shop.data.Product;
import be.realshoping.shop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void savePrductToDB(MultipartFile file){
        String fileName= StringUtils.cleanPath(file.getOriginalFilename());
//        productRepository.saveAll(new ArrayList<>());
        if(fileName.contentEquals("..")){
            System.out.println("Not a valid file");
        }
    }

    public List<Product> getAllProducts(){
        List<Product> list = new ArrayList<>();
        productRepository.findAll().forEach(e -> list.add(e));
        return list;
    }
}
