package com.shh.tasktrackerapi.api.mappers;

import com.shh.tasktrackerapi.api.dto.TaskDto;
import com.shh.tasktrackerapi.store.entities.TaskEntity;
import org.springframework.scheduling.config.Task;

public class TaskDtoMapper {

    public TaskDto makeTaskDto(TaskEntity entity) {

        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .description(entity.getDescription())
                .build();
    }
}
