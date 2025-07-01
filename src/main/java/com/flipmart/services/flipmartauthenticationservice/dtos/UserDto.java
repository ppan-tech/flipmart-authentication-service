package com.flipmart.services.flipmartauthenticationservice.dtos;

import com.flipmart.services.flipmartauthenticationservice.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String name;
    private String email;
    private String message;

    public static UserDto from(User user)
    {
        if(user == null)
        {
            return null;
        }

        UserDto userDto = new UserDto();
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setMessage("User created successfully");
        return userDto;
    }
}

