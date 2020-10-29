package com.demis.springsql.demo.controller;

import com.demis.springsql.demo.model.Supplier;
import com.demis.springsql.demo.repository.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SupplierController {
    SupplierRepo supplierRepo;

    @Autowired
    public SupplierController(SupplierRepo supplierRepo) {
        this.supplierRepo = supplierRepo;
    }
    @GetMapping("/supplier")
    public String showSupplier(Model model){
        List<Supplier> suppliers = supplierRepo.findAll();
        model.addAttribute("suppliers",suppliers);
        return "singer";
    }
}
