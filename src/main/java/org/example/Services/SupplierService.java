package org.example.Services;

import org.example.Models.Supplier;
import java.util.ArrayList;
import java.util.List;

public class SupplierService {
    private List<Supplier> suppliers = new ArrayList<>();

    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public List<Supplier> getAllSuppliers() {
        return new ArrayList<>(suppliers);
    }
}
