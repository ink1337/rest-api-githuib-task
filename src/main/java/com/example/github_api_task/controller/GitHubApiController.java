package com.example.github_api_task.controller;

import com.example.github_api_task.client.GitHubApiClient;
import com.example.github_api_task.mapper.GitHubResponseMapper;
import com.example.github_api_task.model.GithubResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GitHubApiController {
    private final GitHubApiClient gitHubApiClient;
    private final GitHubResponseMapper gitHubResponseMapper;

    @GetMapping("/{owner}/{repositoryName}")
    public GithubResponseDTO getInfo(@PathVariable("owner") String owner, @PathVariable("repositoryName") String repositoryName) {
        return gitHubResponseMapper.toDTO(gitHubApiClient.getInfo(owner, repositoryName));

    }
}
