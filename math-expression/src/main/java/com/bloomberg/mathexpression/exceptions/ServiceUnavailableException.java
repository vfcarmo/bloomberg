package com.bloomberg.mathexpression.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
public class ServiceUnavailableException extends RuntimeException {
    public ServiceUnavailableException(Throwable cause) {
        this(ErrorCode.SERVICE_UNAVAILABLE, cause);
    }

    public ServiceUnavailableException(String message, Throwable cause) {
        super(message, cause);
    }
}
