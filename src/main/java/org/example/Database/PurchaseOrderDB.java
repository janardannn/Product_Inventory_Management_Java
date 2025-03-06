package org.example.Database;

import java.util.Date;
import java.util.List;
import org.example.Models.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderDB extends JpaRepository<PurchaseOrder, Long> {
    List<PurchaseOrder> findByOrderDateBetween(Date startDate, Date endDate);
}
