package com.myAmeboBlog.controllers;

import com.myAmeboBlog.dto.request.UserRegistrationRequest;
import com.myAmeboBlog.services.UserService;
import com.myAmeboBlog.services.UserServiceImpl;

public class UserController {
    private static final UserService userService = new UserServiceImpl();

    public Object signUp(UserRegistrationRequest userRegistrationRequest){
        try {
            userService.userSignUp(userRegistrationRequest);
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
    public Object findUserByPhoneNumber(UserRegistrationRequest userRegistrationRequest){
        try {
            userService.findUserByPhoneNumber(userRegistrationRequest.getPhoneNumber());
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
    public Object findUserByEmail(UserRegistrationRequest userRegistrationRequest){
        try {
            userService.findUserByEmail(userRegistrationRequest.getEmail());
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
    public Object findAllUsers(UserRegistrationRequest userRegistrationRequest){
        try {
            userService.findAllUser();
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
    public Object deleteUser(UserRegistrationRequest userRegistrationRequest){
        try {
            userService.deleteUser(userRegistrationRequest.getEmail());
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
}
