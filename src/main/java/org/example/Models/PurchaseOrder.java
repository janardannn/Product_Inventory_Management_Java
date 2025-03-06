package org.example.Models;

import lombok.Data;
import jakarta.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "purchase_orders")

public class PurchaseOrder {
    @Id
    private String id;

    private Date orderDate;

    @ManyToOne
    private Supplier supplier;

    private int totalAmount;
}
