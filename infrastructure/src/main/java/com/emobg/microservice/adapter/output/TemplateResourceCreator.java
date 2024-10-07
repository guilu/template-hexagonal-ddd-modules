package com.emobg.microservice.adapter.output;

import com.emobg.microservice.port.dto.output.ResourceCreator;
import com.emobg.microservice.port.dto.output.ResourcePersister;
import com.emobg.microservice.port.dto.ResourceCreationInfo;

public class TemplateResourceCreator implements ResourceCreator {

    private final ResourcePersister resourcePersister;

    public TemplateResourceCreator(ResourcePersister templateResourcePersister) {
        resourcePersister = templateResourcePersister;
    }

    @Override
    public void execute(ResourceCreationInfo info) {
        resourcePersister.persist(info.toResource());
    }
}
