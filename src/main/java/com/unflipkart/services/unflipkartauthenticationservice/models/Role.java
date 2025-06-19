package com.unflipkart.services.unflipkartauthenticationservice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Role extends Base
{
    private int value;
}