package com.ismael.strategy.implementation;

public class Demo {
    public static void main(String[] args) {
        var client = new ChatClient(new DES());
        client.send("Hello World");
    }
}
