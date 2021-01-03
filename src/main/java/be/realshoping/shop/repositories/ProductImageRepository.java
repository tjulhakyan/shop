package be.realshoping.shop.repositories;

import be.realshoping.shop.data.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage,Integer> {
}
