package be.realshoping.shop.controllers;

import be.realshoping.shop.data.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userController {

    private User user;

    @GetMapping("/registration")
//    @ModelAttribute
    public String registrationForm(Model model){
        User user=new User();
        model.addAttribute("user", user);
        return "registration";
    }

    @PostMapping("/registration")
    public String insertUser(@ModelAttribute("user") User user, Model model){
        System.out.println(user);
        this.user=user;
        model.addAttribute("user", user);
        return "redirect:registration/success";
    }

    @GetMapping("/registration/success")
//    public String success(@ModelAttribute("user") User user, Model model){
    public String success(Model model){
        System.out.println("=============");
        System.out.println(this.user);
        model.addAttribute("user", this.user);
        return "registration/success";
    }

}
