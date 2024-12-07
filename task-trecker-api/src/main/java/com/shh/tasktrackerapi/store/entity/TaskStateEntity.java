package com.shh.tasktrackerapi.store.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @ToString
@Table(name = "task_state")
public class TaskStateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ordinalId;

    @Column(unique = true)
    private String name;

    @Builder.Default
    private Instant createdAt = Instant.now();

    @Builder.Default
    @OneToMany
    private List<TaskEntity> tasks = new ArrayList<>();
}
