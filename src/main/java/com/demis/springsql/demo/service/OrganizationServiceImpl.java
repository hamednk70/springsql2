package com.demis.springsql.demo.service;

import com.demis.springsql.demo.model.Organization;
import com.demis.springsql.demo.repository.OrganizationRepo;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepo organizationRepo;

    public OrganizationServiceImpl(OrganizationRepo organizationRepo) {
        this.organizationRepo = organizationRepo;
    }

    @Override
    public Organization findorganization(String code) {
        return organizationRepo.findByCode(code);
    }
}
