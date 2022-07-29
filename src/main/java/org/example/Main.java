package org.example;

public class Main {
    public static void main(String[] args) {
        String size = PropertyReader.getProperty("browserSize");
        System.out.println(size);
    }
}