package com.emobg.microservice.port.dto.output;

import com.emobg.microservice.port.dto.ResourceCreationFromRequest;

public interface ResourceCreator {
    void execute(ResourceCreationFromRequest request);
}
