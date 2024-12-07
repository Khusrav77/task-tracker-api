package com.shh.tasktrackerapi.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @ToString
@Table(name = "task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String description;

    @Builder.Default
    private Instant createdAt = Instant.now();

}
