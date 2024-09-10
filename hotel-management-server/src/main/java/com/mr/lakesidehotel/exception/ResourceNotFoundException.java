package com.mr.lakesidehotel.exception;

/**
 * @author Simpson Alfred
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
