package com.emobg.microservice.dto;

import com.emobg.microservice.adapter.input.dto.ResourceInfo;
import com.emobg.microservice.port.dto.ResourceCreationInfo;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResourceInfoShould {

    @Test
    void transform_itself_to_resource_creation_info_object() {
        String name = "dummyName";
        String date = "01/01/2020";
        ResourceInfo resourceInfo = new ResourceInfo(name, date);

        ResourceCreationInfo resourceCreationInfo = resourceInfo.toResourceCreationInfo();

        assertThat(resourceCreationInfo.getId()).isEqualTo("dummyId");
    }

}
