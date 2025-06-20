package com.unflipkart.services.unflipkartauthenticationservice.controllers;

import com.unflipkart.services.unflipkartauthenticationservice.services.IAuthServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
    private IAuthServices authService;
    public AuthenticationController(IAuthServices authService) {
        this.authService = authService;
    }

    // TODO: Add endpoints for signup, login, logout, and token validation here, just adding pseudo code.
    public void singup(){}
    public void login() {}
    public void logout() {}
    public void validateToken() {}
}
