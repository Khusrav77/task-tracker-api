package com.shh.tasktrackerapi.store.repositories;

import com.shh.tasktrackerapi.store.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
