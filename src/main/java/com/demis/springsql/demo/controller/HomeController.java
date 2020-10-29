package com.demis.springsql.demo.controller;

import com.demis.springsql.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {

    private final UserRepo userRepo;

    @Autowired
    public HomeController(UserRepo userRepo) {

        this.userRepo = userRepo;
    }

    @RequestMapping("/index")
    public String profile(Model model, Principal principal) {
        String nu = principal.getName();

        model.addAttribute("users", userRepo.findUsersByUsername(nu));
        return "index";
    }


}
