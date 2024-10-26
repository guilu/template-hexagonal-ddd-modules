package com.emobg.microservices.port.dto;

import com.emobg.microservice.entity.Resource;
import com.emobg.microservice.port.dto.ResourceCreationFromRequest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ResourceCreationApplicationTest {

    @Test
    void create_its_own_id_on_object_construction() {
        String name = "dummyName";
        String date = "01/01/2020";

        ResourceCreationFromRequest resourceCreationFromRequest = new ResourceCreationFromRequest(name, date);

        assertThat(resourceCreationFromRequest.getId()).isEqualTo("dummyId");
    }

    @Test
    void transform_itself_to_resource_object() {
        String name = "dummyName";
        String date = "01/01/2020";
        ResourceCreationFromRequest resourceCreationFromRequest = new ResourceCreationFromRequest(name, date);

        Resource resource = resourceCreationFromRequest.toResource();

        assertThat(resource.getId()).isEqualTo("dummyId");
        assertThat(resource.getName()).isEqualTo(name);
        assertThat(resource.getDate()).isEqualTo(date);
    }
}
