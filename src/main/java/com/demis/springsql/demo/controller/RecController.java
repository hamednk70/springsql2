package com.demis.springsql.demo.controller;

import com.demis.springsql.demo.model.Product;
import com.demis.springsql.demo.model.Rec;
import com.demis.springsql.demo.repository.ProductRepo;
import com.demis.springsql.demo.repository.RecRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping
@SessionAttributes("rec")
public class RecController {
    RecRepo recRepo;

    @Autowired
    public RecController(RecRepo recRepo) {
        this.recRepo = recRepo;
    }

    @GetMapping("/tt")
    public String showSupplier(Model model, @RequestParam(name = "id", required = false) Integer id){
        List<Rec> products = recRepo.findBykol();
        model.addAttribute("products",products);
        return "product";
//        List<ProductResult> products = productRepo.findAllProduct();

    }

//    @GetMapping("/productfind")
//    public String findpro(Model model){
//        List<Product> products = productRepo.findByIsDiscontinued();
//        model.addAttribute("products",products);
//        return "product";
//    }
    @GetMapping("/step1")
    public String step1(Model model){
        model.addAttribute("rec",new Rec());
        return "step1";
    }
    @PostMapping("/step2")
    public String step2(Rec rec, HttpSession session){
        session.setAttribute("reca",rec);
        return "step2";
    }



}
