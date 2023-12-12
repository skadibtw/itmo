package ru.itmolabs.lab3.exceptions;

public class InvalidName extends RuntimeException{
    public InvalidName(String message) {
        super(message);
    }
}
