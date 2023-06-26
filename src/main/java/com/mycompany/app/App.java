package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        if(MESSAGE == null)
        System.out.println("message is null");
        
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
