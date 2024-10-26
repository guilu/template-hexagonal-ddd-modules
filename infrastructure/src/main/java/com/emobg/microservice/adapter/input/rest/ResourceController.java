package com.emobg.microservice.adapter.input.rest;

import com.emobg.microservice.adapter.input.dto.ResourceRequest;
import com.emobg.microservice.port.dto.output.ResourceCreator;
import com.emobg.microservice.port.dto.ResourceCreationFromRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/v1")
public class ResourceController {

    private final ResourceCreator resourceCreator;

    public ResourceController(ResourceCreator templateResourceCreator) {
        resourceCreator = templateResourceCreator;
    }

    @PostMapping(
            value = "/resources",
            produces = APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, String>> createResource(
            @Valid @RequestBody ResourceRequest info
    ) {
        ResourceCreationFromRequest adaptedInfo = info.toResourceCreationInfo();
        resourceCreator.execute(adaptedInfo);
        return new ResponseEntity<>(formatResponse(adaptedInfo), CREATED);
    }

    private Map<String, String> formatResponse(ResourceCreationFromRequest info) {
        Map<String, String> responseBody = new HashMap<>();
        responseBody.put("resourceId", info.getId());
        return responseBody;
    }

}
