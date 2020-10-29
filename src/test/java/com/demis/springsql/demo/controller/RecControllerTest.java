package com.demis.springsql.demo.controller;

import com.demis.springsql.demo.model.Rec;
import com.demis.springsql.demo.repository.RecRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
//class RecControllerTest {
//    @Autowired
//    RecRepo recRepo;
//    @Test
//    void showSupplier() {
//        List<Rec> recs = recRepo.findAll();
//        System.out.println(recs);
//
//    }
//}