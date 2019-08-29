package com.oauthsystem.server.controller;

import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public UserController() {
        System.out.println("aaaaaaa");
    }

    {
        System.out.println("a");
    }

    public static void main(String[] args) {
        System.out.println(Strings.isEmpty(null));
    }
}
