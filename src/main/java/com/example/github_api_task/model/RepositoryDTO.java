package com.example.github_api_task.model;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class RepositoryDTO {

    private Long id;

    private String description;

    private String fullName;

    private OffsetDateTime createdAt;

    private Long stars;

    private String cloneUrl;
}
