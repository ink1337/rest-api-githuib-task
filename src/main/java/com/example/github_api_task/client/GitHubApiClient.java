package com.example.github_api_task.client;


import com.example.github_api_task.model.GitHubResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "github-api")
public interface GitHubApiClient {

    @GetMapping("/{owner}/{repositoryName}")
    GitHubResponse getInfo(@PathVariable("owner") String owner , @PathVariable("repositoryName") String repositoryName);
}
