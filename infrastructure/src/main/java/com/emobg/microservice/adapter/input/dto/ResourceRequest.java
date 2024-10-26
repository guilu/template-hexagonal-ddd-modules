package com.emobg.microservice.adapter.input.dto;

import com.emobg.microservice.port.dto.ResourceCreationInfo;

import jakarta.validation.constraints.NotNull;

public class ResourceInfo {

    @NotNull
    private String name;
    @NotNull
    private String date;

    public ResourceInfo(
            String name,
            String date
    ) {
        this.name = name;
        this.date = date;
    }

    public ResourceCreationInfo toResourceCreationInfo() {
        return new ResourceCreationInfo(
                this.name,
                this.date
        );
    }

}
