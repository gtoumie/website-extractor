package com.gtoumie.webcategorizer.exceptions;

public class TooManyWordsException extends RuntimeException{
    public TooManyWordsException() {
        super("CategoryKeyword can have a phrase up to 6 words only!");
    }
}
