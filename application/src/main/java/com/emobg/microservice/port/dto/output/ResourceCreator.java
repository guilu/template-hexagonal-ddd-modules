package com.emobg.microservice.port.dto.output;

import com.emobg.microservice.port.dto.ResourceCreationInfo;

public interface ResourceCreator {
    void execute(ResourceCreationInfo info);
}
