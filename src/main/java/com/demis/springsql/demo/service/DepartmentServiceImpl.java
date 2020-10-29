package com.demis.springsql.demo.service;

import com.demis.springsql.demo.model.Department;
import com.demis.springsql.demo.repository.Departmentrepo;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final Departmentrepo departmentrepo;

    public DepartmentServiceImpl(Departmentrepo departmentrepo) {
        this.departmentrepo = departmentrepo;
    }

    @Override
    public Department findDepartment(String code) {

        return departmentrepo.findByCode(code);
    }

    @Override
    public Collection<Department> findAll() {
       return departmentrepo.findAll();
    }
}
