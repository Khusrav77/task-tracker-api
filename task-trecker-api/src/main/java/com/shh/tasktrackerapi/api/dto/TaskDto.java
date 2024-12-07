package com.shh.tasktrackerapi.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.*;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

    @NonNull
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String description;

    @NonNull
    @JsonProperty("created_at")
    private Instant createdAt;
}
