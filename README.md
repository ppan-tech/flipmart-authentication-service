# flipmart-authentication-service
A service to authentication user.

#Sample DB setup - MySQL
create database flipmart;
use flipmart;
create user flipmart_user;
grant all privileges on flipmart.* to flipmart_user;  

The spring security does not permit any end-point, so add a security-config with these setting:  
.requestMatchers("/","/api/v1/auth/signup", "/home").permitAll() -- which allows only these end-points.Add here more endpoints to permit them in future.
