package org.example.Models;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "categories")

public class Category {
    @Id
    private String id;

    private String name;

    private String description;
}
