package com.unflipkart.services.unflipkartauthenticationservice.dtos;

import com.unflipkart.services.unflipkartauthenticationservice.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String name;
    private String email;
    private String password;

    public static UserDto from(User user)
    {
        if(user == null)
        {
            return null;
        }

        UserDto userDto = new UserDto();
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        return userDto;
    }
}
