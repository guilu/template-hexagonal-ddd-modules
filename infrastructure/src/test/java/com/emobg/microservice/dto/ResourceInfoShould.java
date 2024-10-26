package com.emobg.microservice.dto;

import com.emobg.microservice.adapter.input.dto.ResourceRequest;
import com.emobg.microservice.port.dto.ResourceCreationFromRequest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResourceInfoShould {

    @Test
    void transform_itself_to_resource_creation_info_object() {
        String name = "dummyName";
        String date = "01/01/2020";
        ResourceRequest resourceRequest = new ResourceRequest(name, date);

        ResourceCreationFromRequest resourceCreationFromRequest = resourceRequest.toResourceCreationInfo();

        assertThat(resourceCreationFromRequest.getId()).isEqualTo("dummyId");
    }

}
