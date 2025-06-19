# unflipkart-auth-service
auth service

#Sample DB setup - MySQL
create database unflipkart;
use unflipkart;
create user unflipkart_user;
grant all privileges on unflipkart.* to unflipkart_user;