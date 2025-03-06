package org.example.Services;

import org.example.Models.Product;
import org.example.Database.ProductDB;
import org.example.Exceptions.ProductNotFoundException;
import java.util.List;
import java.util.Optional;

public class ProductService {
    private ProductDB productDB;

    public void addProduct(Product product) {
        productDB.save(product);
    }

    public Optional<Product> getProductById(String id) throws ProductNotFoundException {
        return productDB.findById(id);
    }

    public List<Product> getAllProducts() {
        return productDB.findAll();
    }

    public void updateProduct(Product product) {
        productDB.save(product);
    }

    public void deleteProduct(String id) {
        productDB.deleteById(id);
    }
}
