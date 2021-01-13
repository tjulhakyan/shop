package be.realshoping.shop.service;

import be.realshoping.shop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void savePrductToDB(MultipartFile file){
        String fileName= StringUtils.cleanPath(file.getOriginalFilename());
        if(fileName.contentEquals("..")){
            System.out.println("Not a valid file");
        }

    }
}
