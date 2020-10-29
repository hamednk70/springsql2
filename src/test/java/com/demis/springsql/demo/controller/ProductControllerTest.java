package com.demis.springsql.demo.controller;

import com.demis.springsql.demo.model.Product;
import com.demis.springsql.demo.repository.ProductRepo;
import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductControllerTest {

    @MockBean
    private ProductRepo productRepo;

    @Test
    public void getAllProduct(){
        when(productRepo.findAll()).thenReturn(Stream
                .of(new Product("tt"),new Product("Chai"))
                .collect(Collectors.toList()));
        assertEquals(2, productRepo.findAll().size());
    }



    @Test
    public void TestRepo() {
//        productRepo.getOne(1);
        assertNotNull(productRepo.findById(1).orElse(new Product()));
//        assertEquals("hh",productRepo.findById(1)
//                .orElse(new Product()).getProductName());
//        assertEquals("hh", productRepo.findById(1).get().per.getProductName().);
    }


}