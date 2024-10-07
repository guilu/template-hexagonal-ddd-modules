package com.emobg.microservice.config;

import com.emobg.microservice.adapter.output.TemplateResourcePersister;
import com.emobg.microservice.adapter.output.TemplateResourceCreator;
import com.emobg.microservice.adapter.output.repositories.JdbcResourceRepository;
import com.emobg.microservice.adapter.output.repositories.ResourceRepository;
import com.emobg.microservice.port.dto.output.ResourceCreator;
import com.emobg.microservice.port.dto.output.ResourcePersister;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class SpringContextConfiguration {

    @Bean
    public ResourceCreator templateResourceCreator(ResourcePersister templateResourcePersister) {
        return new TemplateResourceCreator(templateResourcePersister);
    }

    @Bean
    public ResourcePersister templateResourcePersister(ResourceRepository jdbcResourceRepository) {
        return new TemplateResourcePersister(jdbcResourceRepository);
    }

    @Bean
    public ResourceRepository jdbcResourceRepository(JdbcTemplate jdbcTemplate) {
        return new JdbcResourceRepository(jdbcTemplate);
    }

}
