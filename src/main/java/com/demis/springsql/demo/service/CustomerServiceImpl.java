package com.demis.springsql.demo.service;

import com.demis.springsql.demo.model.Customer;
import com.demis.springsql.demo.repository.CustomerRepo;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public Customer findCustomer(String city) {
        return customerRepo.findByCity(city);
    }
}
