package myapp;

import java.io.Serializable;

public class HelloWorld implements Serializable {
    private String randomText = "Hello";
    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }
}
