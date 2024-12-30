package com.shh.tasktrackerapi.api.mappers;

import com.shh.tasktrackerapi.api.dto.TaskStateDto;
import com.shh.tasktrackerapi.store.entities.TaskStateEntity;

import org.springframework.stereotype.Component;

@Component
public class TaskStateMapper {

    public TaskStateDto makeTaskStateDto(TaskStateEntity entity) {

        return TaskStateDto.builder()
                .id(entity.getId())
                .ordinalId(entity.getOrdinalId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
