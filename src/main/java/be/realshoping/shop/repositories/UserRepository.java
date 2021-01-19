package be.realshoping.shop.repositories;

import be.realshoping.shop.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findUserByEmailAndPassword(String email, String password);
}
