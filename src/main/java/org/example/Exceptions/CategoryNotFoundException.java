package org.example.Exceptions;

import java.lang.RuntimeException;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(String message) {
        super(message);
    }

}
