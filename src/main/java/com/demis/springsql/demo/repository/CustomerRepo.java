package com.demis.springsql.demo.repository;

import com.demis.springsql.demo.model.Customer;
import com.demis.springsql.demo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
//    @Query(value = "SELECT firstname, lastname from Customer",nativeQuery = true)
//    @Query(value = "SELECT c from Customer c")
    @Query(value = "SELECT c.firstname, c.lastname from Customer c")
    List<Customer> findAllCustomer();

    @Query("from Customer t where t.city = :city ")
    Customer findByCity(@Param("city") String city);
}

