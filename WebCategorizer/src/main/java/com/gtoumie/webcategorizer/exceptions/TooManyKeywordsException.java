package com.gtoumie.webcategorizer.exceptions;

public class TooManyKeywordsException extends RuntimeException{
    public TooManyKeywordsException() {
        super("Category can't have more than 1000 keywords");
    }
}
