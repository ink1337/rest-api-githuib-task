package com.example.github_api_task.mapper;

import com.example.github_api_task.model.GitHubResponse;
import com.example.github_api_task.model.RepositoryDTO;
import com.example.github_api_task.model.RepositoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GitHubResponseMapper {

    @Mapping(target = "id", ignore = true)
    RepositoryDTO fromResponseToDTO(GitHubResponse response);

    RepositoryDTO toDTO(RepositoryEntity response);

    @Mapping(target = "id", ignore = true)
    RepositoryEntity toEntity(GitHubResponse response);
}
