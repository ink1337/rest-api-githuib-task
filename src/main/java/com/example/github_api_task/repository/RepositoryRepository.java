package com.example.github_api_task.repository;

import com.example.github_api_task.model.RepositoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryRepository extends JpaRepository<RepositoryEntity, Long> {
    RepositoryEntity findByOwnerAndName(String owner, String repositoryName);
}
