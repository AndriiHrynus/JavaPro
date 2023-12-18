package org.example.work21.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = "id")
@Builder
public class Lesson {
    private int id;
    private String name;
    private String updatedAt;
    private Homework homework;
}
