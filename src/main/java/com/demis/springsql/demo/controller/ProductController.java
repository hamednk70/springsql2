package com.demis.springsql.demo.controller;

import com.demis.springsql.demo.model.Product;
import com.demis.springsql.demo.model.ProductResult;
import com.demis.springsql.demo.model.Supplier;
import com.demis.springsql.demo.repository.ProductRepo;
import com.demis.springsql.demo.repository.SupplierRepo;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    ProductRepo productRepo;

    @Autowired
    public ProductController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    @GetMapping("/product")
    public String showSupplier(Model model, @RequestParam(name = "id", required = false) Integer id){
        if (id == null){
            List<Product> products = productRepo.findBysupplier();
            model.addAttribute("products",products);
            return "product";
        }
        else {
            List<Product> products = productRepo.findByIsDiscontinued(id);
            model.addAttribute("products",products);
            return "product";

        }
//        List<ProductResult> products = productRepo.findAllProduct();

    }
//    @GetMapping("/productfind")
////    public String findpro(Model model){
////        List<Product> products = productRepo.findByIsDiscontinued();
////        model.addAttribute("products",products);
////        return "product";
////    }

    @GetMapping("/peoducts")
    @ResponseBody
    public List<Product> allPro(){
        return productRepo.findAll();
    }
    @GetMapping("/products")
    public List<Product> allProducts(
            @RequestParam(value = "page",defaultValue = "0") int page,
            @RequestParam(value = "page_size",defaultValue = "10") int pageSize
    ){
        Pageable pageable = PageRequest.of(page,pageSize);
        Page<Product> products = productRepo.findAll(pageable);
        return products.getContent();


    }
    @GetMapping("/findproduct")
    public Product findpro(Model model) throws ChangeSetPersister.NotFoundException {

        Optional<Product> product = productRepo.findById(2);
//        Optional<Product> products = productRepo.findAll();
        if (product.isPresent()){
            return  product.orElseThrow(ChangeSetPersister.NotFoundException::new);
        }
        else {
            return null;
        }



    }

    @PostMapping("/saveProduct")
    public ResponseEntity<Void> saveProduct(@RequestBody Product product) {
        productRepo.save(product);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","this is a testing");
        return ResponseEntity.status(HttpStatus.OK).headers(headers).build();
//        if (name.equalsIgnoreCase("hamed")){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        else {
//            return new ResponseEntity<>(new Product(), HttpStatus.OK);
//        }

    }

    @GetMapping("/list")
    public ResponseEntity<List<Product>> litPro() {
        List<Product> products = productRepo.findAll();
//        return ResponseEntity
       return ResponseEntity.status(HttpStatus.OK).body(products);
//       return ResponseEntity.ok(products);
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        Product product = productRepo.findById(id).orElse(null);

//        return ResponseEntity
        return ResponseEntity.status(HttpStatus.OK).body(product);
//       return ResponseEntity.ok(products);
    }
    @GetMapping("/person")
    public String showperson(Model model){
        Product product = new Product();
        return "singer";
    }
//    @PostMapping("/addPerson")
//    public String addProduct(@Valid @RequestBody Product product, Errors error){
//        if (error.hasErrors()){
//            return null;
//        }
//        else {
//            productRepo.save(product);
//        }
//
//    }

}
