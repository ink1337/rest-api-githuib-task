package com.example.github_api_task.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class GitHubResponse {
    private String description;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("watchers_count")
    private Long stars;

    @JsonProperty("url")
    private String cloneUrl;
}
