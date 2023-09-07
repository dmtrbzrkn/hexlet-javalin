package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> config.plugins.enableDevLogging());
        // Описываем что загрузится по адресу /
        //app.get("/hello", ctx -> ctx.result("Hello World"));
        app.get("/users", ctx -> {
            var name = ctx.queryParam("name");
            assert name != null;
            var response = name.equals("John") ? "Hello, John!" : "Hello, World!";
            ctx.result(response);
        });

        app.start(7070);
    }
}
