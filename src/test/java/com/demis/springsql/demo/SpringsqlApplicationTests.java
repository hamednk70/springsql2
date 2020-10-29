package com.demis.springsql.demo;

import com.demis.springsql.demo.model.Product;
import com.demis.springsql.demo.repository.ProductRepo;
import net.minidev.json.JSONUtil;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.text.html.parser.Entity;
import javax.xml.ws.Response;
import java.util.List;
import java.util.stream.Collector;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringsqlApplicationTests {
   private ProductRepo productRepo;
   private TestRestTemplate restTemplate;

   @Autowired
    public SpringsqlApplicationTests(ProductRepo productRepo, TestRestTemplate restTemplate) {
        this.productRepo = productRepo;
        this.restTemplate = restTemplate;
    }

    @Test
   public void getOnePersion() {
//       List<Product> products =  productRepo.findAll(Sort.by("productName").ascending());
//        for (Product p : products){
//            System.out.println(products);
//        }

//        Product product = new Product();
////        product.setDiscontinued(true);
//        product.setProductName("Chai");
////        product.setUnitPrice(18.00);
//      List<Product> products1 =  productRepo.findAll(Example.of(product));
//        System.out.println(products1);
    }
    @Test
    public void getProductUnitTest() throws Exception{
        ResponseEntity<Product> response = restTemplate.getForEntity("/product/list", Product.class);

        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
//        Assertions.assertThat(response.getBody().getProductName()).isEqualTo("Chai");




    }




}
