package com.demis.springsql.demo.service;

import com.demis.springsql.demo.model.Customer;
import com.demis.springsql.demo.model.Department;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerServiceImplTest {
    @Autowired
    CustomerService customerService;

    @Test
    void findDepartment() {
        //this is tst
        //this is tst2
    }

    @Test
    String findDepartmtyent() {
        return "sfsdgf";


    }

    @Test
    void findCustomer() {
        Customer result = customerService.findCustomer("ef");
        assertEquals(result.getId(), 1);
    }
}