package com.emobg.microservice.adapter.output.repositories;

import com.emobg.microservice.adapter.output.dtos.ResourcePersistenceInfo;

public interface ResourceRepository {
    void save(ResourcePersistenceInfo resourcePersistenceInfo);
}
