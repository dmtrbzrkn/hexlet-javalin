package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        var app = DynamicRoutes.getApp();
        app.start(7070);
    }
}
