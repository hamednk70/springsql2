package com.demis.springsql.demo.service;

import com.demis.springsql.demo.model.Department;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DepartmentServiceImplTest {
    @Autowired
    DepartmentService departmentService;

    @Test
    void findDepartment() {
        Department result = departmentService.findDepartment("12345");
        assertEquals(result.getId(), 1);

    }
    @Test
    void findAll() {
        Collection<Department> result = departmentService.findAll();
//        if(result == null || result.size() == 0 || result.isEmpty()){
//            System.out.println("null");
//        }
//        result.forEach(s-> System.out.println(s.getCode()));
//
//        assertEquals("12345",result.stream().findFirst().get().getCode());
//        assertEquals("123345",result
//                .stream()
//                .map(s->s.getCustomerByCustomeerId().getCity())
//                .findFirst().get());
//        List<Department> res = result.stream().collect(Collectors.toList());
//        assertEquals("12345", res.get(0).);




    }
}