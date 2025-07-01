package com.flipmart.services.flipmartauthenticationservice.services;

import com.flipmart.services.flipmartauthenticationservice.exceptions.InvalidSignUpException;
import com.flipmart.services.flipmartauthenticationservice.exceptions.UserAlreadyExistException;
import com.flipmart.services.flipmartauthenticationservice.models.Token;
import com.flipmart.services.flipmartauthenticationservice.models.User;
import com.flipmart.services.flipmartauthenticationservice.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements IAuthServices{
    private final UserRepository userRepository;
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User signup(String name, String email, String password) throws InvalidSignUpException, UserAlreadyExistException {

        if (name == null || name.isEmpty()) {
            throw new InvalidSignUpException("Name cannot be null or empty");
        }
        if (email == null || email.isEmpty()) {
            throw new InvalidSignUpException("Email cannot be null or empty");
        }
        if (password == null || password.isEmpty()) {
            throw new InvalidSignUpException("Password cannot be null or empty");
        }
        if (userRepository.findByEmail(email).isPresent()) {
            throw new UserAlreadyExistException("User already exists having email:"+email);
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        return userRepository.save(user);

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
