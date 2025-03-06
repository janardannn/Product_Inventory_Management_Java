package org.example.Database;

import java.util.List;
import org.example.Models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemDB extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByPurchaseOrderId(Long purchaseOrderId);
}
