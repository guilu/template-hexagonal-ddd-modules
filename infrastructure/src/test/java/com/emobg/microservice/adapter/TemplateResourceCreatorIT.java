package com.emobg.microservice.adapter;

import com.emobg.microservice.port.dto.output.ResourceCreator;
import com.emobg.microservice.port.dto.ResourceCreationFromRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@DirtiesContext
public class TemplateResourceCreatorIT {

    @Autowired
    ResourceCreator resourceCreator;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void create_a_resource_successfully() {
        String name = "dummyName";
        String date = "01/01/2020";
        ResourceCreationFromRequest resourceCreationInfo = new ResourceCreationFromRequest(name, date);

        resourceCreator.execute(resourceCreationInfo);

        assertTrue(resourceIsPersisted());
    }

    private Boolean resourceIsPersisted() {
        String query = "SELECT COUNT(1) " +
                "FROM resources_table " +
                "WHERE resource_id = ?";
        return jdbcTemplate.queryForObject(query, Boolean.class, "dummyId");
    }

}
