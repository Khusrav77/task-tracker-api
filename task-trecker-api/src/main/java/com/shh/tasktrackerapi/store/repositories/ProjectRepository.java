package com.shh.tasktrackerapi.store.repositories;

import com.shh.tasktrackerapi.store.entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
}
