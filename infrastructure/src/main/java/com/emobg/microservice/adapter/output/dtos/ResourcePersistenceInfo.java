package com.emobg.microservice.adapter.output.dtos;

import com.emobg.microservice.entity.Resource;

public class ResourcePersistenceInfo {

    private String id;
    private String name;
    private String date;

    public ResourcePersistenceInfo(String id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public static ResourcePersistenceInfo from(Resource info) {
        return new ResourcePersistenceInfo(
                info.getId(),
                info.getName(),
                info.getDate()
        );
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
