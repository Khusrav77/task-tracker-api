package com.shh.tasktrackerapi.api.controllers;

import com.shh.tasktrackerapi.api.dto.ProjectDto;
import com.shh.tasktrackerapi.api.exceptions.BadRequestExceptions;
import com.shh.tasktrackerapi.api.mappers.ProjectDtoMapper;
import com.shh.tasktrackerapi.store.entities.ProjectEntity;
import com.shh.tasktrackerapi.store.repositories.ProjectRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Transactional
@RestController
public class ProjectController {

    private final ProjectRepository projectRepository;
    private final ProjectDtoMapper projectDtoMapper;

    public static final String FETCH_PROJECT = "/api/projects";
    public static final String CREATE_PROJECT = "/api/projects";
    public static final String EDIT_PROJECT = "/api/projects/{projectId}";


    @PostMapping(CREATE_PROJECT)
    public ProjectDto createProject(@RequestParam String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new BadRequestExceptions("Project name cannot be null or empty");
        }

        projectRepository
                .findByName(name)
                .ifPresent(project -> {
                    throw new BadRequestExceptions(String.format("Project with name '%s' already exists", name));

                });

        ProjectEntity project = projectRepository.saveAndFlush(
                ProjectEntity.builder()
                        .name(name)
                        .build()
        );
        return projectDtoMapper.makeProjectDto(project);
    }




}
