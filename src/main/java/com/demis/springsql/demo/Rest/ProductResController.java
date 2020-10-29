package com.demis.springsql.demo.Rest;

import com.demis.springsql.demo.model.Product;
import com.demis.springsql.demo.repository.ProductRepo;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductResController {
    ProductRepo productRepo;

    @Autowired
    public ProductResController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping("/list")
    public List<Product> listProduct(Model model, @RequestParam(name = "id", required = false) Integer id) {
//       return productRepo.findAll();
//       return productRepo.findBySupplierId(id);
        return productRepo.findAll();

    }


    @GetMapping("/hi/{id}")
    public String checkHello(@PathVariable String id) {
        return id;
    }


    @GetMapping("/product/{id:\\d}")
    public ResponseEntity<Product> getProduct(@PathVariable(required = false) Integer id) {
        Product product = productRepo.findById(id).get();
        HttpHeaders headers = new HttpHeaders();
        headers.add("hh", "this is header");
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(product);

    }


    @GetMapping("/getOne/{id}")
    public Product getOneProduct(@PathVariable Integer id) {
        Optional<Product> product = productRepo.findById(id);
        return product.orElse(new Product());
    }
}
