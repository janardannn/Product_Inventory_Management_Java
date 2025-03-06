package org.example.Database;

import org.example.Models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierDB extends JpaRepository<Supplier, Long> {
    Supplier findById(String name);
}
