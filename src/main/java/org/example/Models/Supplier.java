package org.example.Models;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "suppliers")

public class Supplier {
    @Id
    private Long id;

    private String name;

    private String contactInfo;
}
