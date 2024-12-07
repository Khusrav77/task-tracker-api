package com.shh.tasktrackerapi.store.repositories;

import com.shh.tasktrackerapi.store.entities.TaskStateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskStateRepository extends JpaRepository<TaskStateEntity, Long> {
}
