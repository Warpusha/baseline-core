package com.baseline.sales.exception;

public class SkuNotFoundException extends RuntimeException {
    public SkuNotFoundException(Long id) {
        super(String.format("SKU with id %d does not exist", id));
    }
}
