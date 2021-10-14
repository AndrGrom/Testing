package com.company.Task2;

public class ValidateNumberException extends RuntimeException{

    public ValidateNumberException() {
    }

    public ValidateNumberException(String message) {
        super(message);
    }

    public ValidateNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidateNumberException(Throwable cause) {
        super(cause);
    }

    public ValidateNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
