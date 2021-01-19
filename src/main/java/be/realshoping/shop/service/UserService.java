package be.realshoping.shop.service;

import be.realshoping.shop.data.User;
import be.realshoping.shop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user){
        System.out.println(user);
        userRepository.save(user);
    }

    public User getUserByPassWordAndUserName(String email, String password){
        return userRepository.findUserByEmailAndPassword(email,password);
    }
}
