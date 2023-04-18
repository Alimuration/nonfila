package ru.tinkoff.edu.java.bot;

public class ChatNotFoundException extends RuntimeException{
    public ChatNotFoundException(String message) {
        super(message);
    }
}