package org.example.Models;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    private String id;
    
    @ManyToOne
    private PurchaseOrder purchaseOrder;
    
    @ManyToOne
    private Product product;
    
    private int quantity;
    
    private float unitPrice;
}
