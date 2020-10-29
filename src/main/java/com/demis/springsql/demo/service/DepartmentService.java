package com.demis.springsql.demo.service;

import com.demis.springsql.demo.model.Department;

import java.util.Collection;

public interface DepartmentService {

    Department findDepartment(String code);

    Collection<Department> findAll();
}
