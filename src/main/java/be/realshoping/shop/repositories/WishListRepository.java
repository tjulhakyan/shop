package be.realshoping.shop.repositories;

import be.realshoping.shop.data.WishList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<WishList,Integer> {
}
