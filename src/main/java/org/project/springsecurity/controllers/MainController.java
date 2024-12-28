package org.project.springsecurity.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class MainController {
    @GetMapping("/unsecured")
    public String unsecured() {
        return "unsecured";
    }
    @GetMapping("/secured")
    public String secured() {
        return "secured";
    }
    @GetMapping("/admin")
    public String adminData() {
        return "admin";
    }
    @GetMapping("/info")
    public String userData(Principal principal) {
        return principal.getName();
    }

}
