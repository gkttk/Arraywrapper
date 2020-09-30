package com.github.gkttk.fourth.arraywrapper.exception;

/**
 * This exception is thrown when given index is not between 0 and inner array size(exclusive).
 */

public class WrongIndexException extends RuntimeException {

    public WrongIndexException(String message, int wrongIndex) {
        super(message);
        System.out.println("Wrong index: " + wrongIndex);
    }
}
