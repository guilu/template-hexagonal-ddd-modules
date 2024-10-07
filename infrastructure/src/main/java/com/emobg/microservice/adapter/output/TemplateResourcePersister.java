package com.emobg.microservice.adapter.output;

import com.emobg.microservice.adapter.output.dtos.ResourcePersistenceInfo;
import com.emobg.microservice.adapter.output.repositories.ResourceRepository;
import com.emobg.microservice.entity.Resource;
import com.emobg.microservice.port.dto.output.ResourcePersister;

public class TemplateResourcePersister implements ResourcePersister {

    private ResourceRepository resourceRepository;

    public TemplateResourcePersister(ResourceRepository jdbcResourceRepository) {
        this.resourceRepository = jdbcResourceRepository;
    }

    @Override
    public void persist(Resource resource) {
        resourceRepository.save(ResourcePersistenceInfo.from(resource));
    }

}
