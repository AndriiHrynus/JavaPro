package org.example.work21.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(exclude = "id")
@Builder
public class Homework {
    private int id;
    private String name;
    private String description;
}
