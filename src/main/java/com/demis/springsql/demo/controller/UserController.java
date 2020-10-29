package com.demis.springsql.demo.controller;

import com.demis.springsql.demo.model.User;
import com.demis.springsql.demo.repository.UserRepo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {


    private UserRepo repo;
    private BCryptPasswordEncoder encoder;

    public UserController(UserRepo repo, BCryptPasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }
    @RequestMapping("/users/findById")
    @ResponseBody
    public User findById(Integer id)
    {
        User user = repo.findById(id).get();
        return user;
    }
//    @GetMapping("/users")
//    public String showPage(Model model){
//        List<User> users = repo.findAll();
//        model.addAttribute("users",users);
//        return "user";
//    }
}
