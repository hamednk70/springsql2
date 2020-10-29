package com.demis.springsql.demo.repository;

import com.demis.springsql.demo.model.Customer;
import com.demis.springsql.demo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Departmentrepo extends JpaRepository<Department, Integer> {
;
    @Query("from Department t where t.code = :code ")
    Department findByCode(@Param("code") String code);
}
