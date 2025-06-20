package com.unflipkart.services.unflipkartauthenticationservice.services;

import com.unflipkart.services.unflipkartauthenticationservice.models.Token;
import com.unflipkart.services.unflipkartauthenticationservice.models.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements IAuthServices{
    @Override
    public User signup(String name, String email, String password) {
        return null;
    }

    @Override
    public Token login(String email, String password) {
        return null;
    }

    @Override
    public void logout(Token token) {

    }

    @Override
    public User validateToken(String tokenValue) {
        return null;
    }
}
