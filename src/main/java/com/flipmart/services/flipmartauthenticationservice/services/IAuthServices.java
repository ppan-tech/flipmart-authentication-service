package com.flipmart.services.flipmartauthenticationservice.services;

import com.flipmart.services.flipmartauthenticationservice.exceptions.UserAlreadyExistException;
import com.flipmart.services.flipmartauthenticationservice.models.Token;
import com.flipmart.services.flipmartauthenticationservice.models.User;

public interface IAuthServices {
    User signup(String name,String email, String password) throws UserAlreadyExistException;
    Token login(String email, String password);
    void logout(Token token);
    User validateToken(String tokenValue);
}