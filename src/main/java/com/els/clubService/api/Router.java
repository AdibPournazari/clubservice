package com.els.clubService.api;

import static spark.Spark.*;

import com.google.inject.Inject;

public class Router {

    @Inject
    private Controller controller;

    public void handleRequests() {
        post("/club", controller::createClub);
        put("/user", controller::addUserToClub);
    }
}
