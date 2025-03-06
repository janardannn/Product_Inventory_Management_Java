package org.example.Services;

import org.example.Models.Product;
import org.example.Database.ProductDB;
import org.example.Exceptions.ProductNotFoundException;
import java.util.List;

public class ProductService {
    private ProductDB productDB;

    public void addProduct(Product product) {
        productDB.save(product);
    }

    public Product getProductById(Long id) throws ProductNotFoundException {
        return productDB.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + id));
    }

    public List<Product> getAllProducts() {
        return productDB.findAll();
    }

    public void updateProduct(Product product) {
        productDB.save(product);
    }

    public void deleteProduct(Long id) {
        productDB.deleteById(id);
    }
}
