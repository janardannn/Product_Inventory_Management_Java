package org.example.Models;

import lombok.Data;
import jakarta.persistence.*;
import org.example.Models.Constants.ProductStatus;

@Data
@Entity
@Table(name = "products")

public class Product {
    @Id
    private String id;

    private String name;

    private float price;

    private int quantity;

    private String description;

    @ManyToOne
    private Category category;

    private ProductStatus status;
}
