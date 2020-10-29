package com.demis.springsql.demo.service;

import com.demis.springsql.demo.model.Customer;
import com.demis.springsql.demo.model.Department;

public interface CustomerService {

    Customer findCustomer(String city);
}
