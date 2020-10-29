package com.demis.springsql.demo.service;

import com.demis.springsql.demo.model.Department;
import com.demis.springsql.demo.model.Organization;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class OrganizationServiceImplTest {

    @Autowired
    OrganizationService organizationService;

    @Test
    void findorganization() {
        Organization result = organizationService.findorganization("ef");
        assertEquals(result.getId(), 1);
        assertEquals(result.getDepartmentByDepartmentId().getCustomerByCustomeerId().getFirstname(), "Maria");
    }
}