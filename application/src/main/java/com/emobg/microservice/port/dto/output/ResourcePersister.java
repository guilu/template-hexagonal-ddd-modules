package com.emobg.microservice.port.dto.output;

import com.emobg.microservice.entity.Resource;

public interface ResourcePersister {
    void persist(Resource from);
}
