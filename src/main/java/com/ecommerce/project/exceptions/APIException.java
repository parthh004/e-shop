package com.ecommerce.project.exceptions;

public class APIException extends RuntimeException {
    private static long serialVersionUID = 1L;

    public APIException() {}

    public APIException(String message) {
        super(message);
    }
}
