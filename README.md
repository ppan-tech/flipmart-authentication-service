# flipmart-authentication-service
user authentication service

#Sample DB setup - MySQL
create database flipmart;
use flipmart;
create user flipmart_user;
grant all privileges on flipmart.* to flipmart_user;
