package com.shh.tasktrackerapi.api.mappers;

import com.shh.tasktrackerapi.api.dto.ProjectDto;
import com.shh.tasktrackerapi.store.entities.ProjectEntity;
import org.springframework.scheduling.config.Task;

public class ProjectDtoMapper {

    public ProjectDto makeProjectDto(ProjectEntity entity) {

        return ProjectDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
