package com.sample.restaurantmanagementsystem.exception;

public class TableNotFoundException extends NotFoundException{
    public TableNotFoundException(String message) {
        super(message);
    }
}
