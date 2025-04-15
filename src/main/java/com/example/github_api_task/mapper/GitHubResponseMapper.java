package com.example.github_api_task.mapper;

import com.example.github_api_task.model.GitHubResponse;
import com.example.github_api_task.model.GithubResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GitHubResponseMapper {

    GithubResponseDTO toDTO(GitHubResponse response);
}
