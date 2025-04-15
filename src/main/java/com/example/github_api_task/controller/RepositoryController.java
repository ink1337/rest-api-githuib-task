package com.example.github_api_task.controller;

import com.example.github_api_task.model.RepositoryDTO;
import com.example.github_api_task.service.RepositoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RepositoryController {
    private final RepositoryService repositoryService;

    @PostMapping("/repositories/{owner}/{repository-name}")
    public Long add(@PathVariable("owner") String owner, @PathVariable("repository-name") String repositoryName) {
        return repositoryService.add(owner, repositoryName);
    }

    @GetMapping("local/repositories/{owner}/{repository-name}")
    public RepositoryDTO get(@PathVariable("owner") String owner, @PathVariable("repository-name") String repositoryName) {
        return repositoryService.find(owner, repositoryName);
    }
}
