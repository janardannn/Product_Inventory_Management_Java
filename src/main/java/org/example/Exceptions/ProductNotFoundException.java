package org.example.Exceptions;

import java.lang.RuntimeException;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
