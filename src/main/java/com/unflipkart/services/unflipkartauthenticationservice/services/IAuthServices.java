package com.unflipkart.services.unflipkartauthenticationservice.services;

import com.unflipkart.services.unflipkartauthenticationservice.models.Token;
import com.unflipkart.services.unflipkartauthenticationservice.models.User;

public interface IAuthServices {
    User signup(String name,String email, String password);
    Token login(String email, String password);
    void logout(Token token);
    User validateToken(String tokenValue);
}