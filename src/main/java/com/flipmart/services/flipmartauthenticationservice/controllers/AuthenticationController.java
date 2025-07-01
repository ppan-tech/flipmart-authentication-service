package com.flipmart.services.flipmartauthenticationservice.controllers;

import com.flipmart.services.flipmartauthenticationservice.dtos.LoginRequestDto;
import com.flipmart.services.flipmartauthenticationservice.dtos.LoginResponseDto;
import com.flipmart.services.flipmartauthenticationservice.dtos.SignUpRequestDto;
import com.flipmart.services.flipmartauthenticationservice.dtos.UserDto;
import com.flipmart.services.flipmartauthenticationservice.models.Token;
import com.flipmart.services.flipmartauthenticationservice.models.User;
import com.flipmart.services.flipmartauthenticationservice.services.IAuthServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
    private IAuthServices authService;
    public AuthenticationController(IAuthServices authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public  UserDto singup(@RequestBody SignUpRequestDto signUpRequestDto) {
        // Call authService.signup() with the details from signUpRequestDto
        // and Return the UserDto object
        User user = authService.signup(
                signUpRequestDto.getName(),
                signUpRequestDto.getEmail(),
                signUpRequestDto.getPassword()
        );
        return UserDto.from(user);
    }

    @PostMapping("/login")
    public LoginResponseDto login(@RequestBody LoginRequestDto loginRequestDto) {
            Token token = authService.login(loginRequestDto.getEmail(), loginRequestDto.getPassword());
            LoginResponseDto loginResponseDto = new LoginResponseDto();
            loginResponseDto.setTokenValue(token.getTokenValue());
            return loginResponseDto;
    }
    // TODO: Add endpoints for  logout, and token validation here, just adding pseudo code.
    public void logout() {}
    public void validateToken() {}
}
