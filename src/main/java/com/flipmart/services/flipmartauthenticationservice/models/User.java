package com.flipmart.services.flipmartauthenticationservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User extends Base
{
    private String name;
    private String email;
    private String password;

    @ManyToMany
    private List<Role> roles;// Note: This is a many-to-many relationship because a user can have multiple roles and
                            // a role can be assigned to multiple users.
}