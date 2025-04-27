package com.example.github_api_task.service;

import com.example.github_api_task.client.GitHubApiClient;
import com.example.github_api_task.mapper.GitHubResponseMapper;
import com.example.github_api_task.model.RepositoryDTO;
import com.example.github_api_task.repository.RepositoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RepositoryService {
    private final GitHubApiClient gitHubApiClient;
    private final RepositoryRepository repository;
    private final GitHubResponseMapper mapper;

    public Long add(String owner, String repositoryName) {
        var external = gitHubApiClient.getInfo(owner, repositoryName);
        var entity = mapper.toEntity(external);
        entity.setOwner(owner);
        entity.setName(repositoryName);
        return repository.save(entity).getId();
    }

    public RepositoryDTO find(String owner, String repositoryName) {
        return mapper.toDTO(repository.findByOwnerAndName(owner, repositoryName));
    }

}
