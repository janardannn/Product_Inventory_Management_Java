package org.example.Database;

import org.example.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDB extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
