package com.demis.springsql.demo.service;

import com.demis.springsql.demo.model.Department;
import com.demis.springsql.demo.model.Organization;

public interface OrganizationService {

    Organization findorganization(String code);
}
