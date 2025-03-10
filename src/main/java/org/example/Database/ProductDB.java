package org.example.Database;

import java.util.List;
import org.example.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDB extends JpaRepository<Product, String> {
    Product findById(Long id);

    List<Product> findByPriceGreaterThan(int price);
}
