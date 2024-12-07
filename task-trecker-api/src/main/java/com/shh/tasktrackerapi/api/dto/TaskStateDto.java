package com.shh.tasktrackerapi.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskStateDto {
    @NonNull

    private Long id;

    @NonNull
    private Long ordinalId;

    @NonNull
    private String name;

    @NonNull
    @JsonProperty("created_at")
    private Instant createdAt;
}
