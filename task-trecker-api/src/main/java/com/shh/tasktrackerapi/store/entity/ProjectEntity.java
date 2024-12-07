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
@Table(name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @Builder.Default
    private Instant createdAt = Instant.now();

    @Builder.Default
    @OneToMany
    private List<TaskStateEntity> taskStates = new ArrayList<>();
}
