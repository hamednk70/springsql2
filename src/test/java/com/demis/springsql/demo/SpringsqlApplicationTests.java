package com.demis.springsql.demo;

import com.demis.springsql.demo.repository.ProductRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

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
//    @Test
//    public void getProductUnitTest() throws Exception{
//        ResponseEntity<Product> response = restTemplate.getForEntity("/product/list", Product.class);
//
//        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
////        Assertions.assertThat(response.getBody().getProductName()).isEqualTo("Chai");
//
//
//
//
//    }




}
