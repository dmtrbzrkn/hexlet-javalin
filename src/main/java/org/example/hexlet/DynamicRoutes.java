package org.example.hexlet;

import io.javalin.Javalin;

public class DynamicRoutes {
    public static Javalin getApp() {
        var app = Javalin.create(javalinConfig -> {
            javalinConfig.plugins.enableDevLogging();
        });

        app.get("users/{id}/post/{postId}", context -> {
            context.result("User ID: " + context.pathParam("id"));
            context.result("Post ID: " + context.pathParam("postId"));
        });

        return app;
    }
}
