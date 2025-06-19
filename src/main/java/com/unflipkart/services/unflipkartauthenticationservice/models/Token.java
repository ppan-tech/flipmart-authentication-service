package com.unflipkart.services.unflipkartauthenticationservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Token extends Base
{
    private String tokenValue;
    private Date expiryAt;

    @ManyToOne
    private User user;
    /*Note:
     * This is the user to whom this token belongs.
     * It is a many-to-one relationship because a user can have multiple tokens.
     * The user can be null if the token is not associated with any user.
     * This can happen in case of anonymous users or guest users.
     */
}
