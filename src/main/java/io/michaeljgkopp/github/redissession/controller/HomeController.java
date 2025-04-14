package io.michaeljgkopp.github.redissession.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(Principal principal) {   // Principal is the authenticated user
        return "Hello, " + principal.getName();
    }
}
