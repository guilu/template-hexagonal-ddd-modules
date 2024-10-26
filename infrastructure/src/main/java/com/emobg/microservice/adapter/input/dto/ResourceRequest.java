package com.emobg.microservice.adapter.input.dto;

import com.emobg.microservice.port.dto.ResourceCreationFromRequest;

import jakarta.validation.constraints.NotNull;

public class ResourceRequest {

    @NotNull
    private String name;
    @NotNull
    private String date;

    public ResourceRequest(
            String name,
            String date
    ) {
        this.name = name;
        this.date = date;
    }

    public ResourceCreationFromRequest toResourceCreationInfo() {
        return new ResourceCreationFromRequest(
                this.name,
                this.date
        );
    }

}
