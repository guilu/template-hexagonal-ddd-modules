package com.emobg.microservice.dto;

import com.emobg.microservice.adapter.output.dtos.ResourcePersistenceInfo;
import com.emobg.microservice.entity.Resource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResourcePersistenceInfoShould {

    @Test
    void create_correctly_from_a_given_resource() {
        String id = "dummyId";
        String name = "dummyName";
        String date = "01/01/2020";
        Resource resource = new Resource(id, name, date);

        ResourcePersistenceInfo resourcePersistenceInfo = ResourcePersistenceInfo.from(resource);

        assertThat(resourcePersistenceInfo.getId()).isEqualTo(id);
        assertThat(resourcePersistenceInfo.getName()).isEqualTo(name);
        assertThat(resourcePersistenceInfo.getDate()).isEqualTo(date);

    }

}
