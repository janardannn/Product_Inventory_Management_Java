package org.example.Services;

import org.example.Models.Category;
import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    private List<Category> categories = new ArrayList<>();

    public void addCategory(Category category) {
        categories.add(category);
    }

    public List<Category> getAllCategories() {
        return new ArrayList<>(categories);
    }
}
