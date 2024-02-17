package com.myAmeboBlog.services;

import com.myAmeboBlog.dto.request.UserRegistrationRequest;
import com.myAmeboBlog.dto.response.UserRegistrationResponse;

import java.util.List;

public interface UserService {
    UserRegistrationResponse userSignUp(UserRegistrationRequest userRegistrationRequest);
    UserRegistrationResponse findUserByPhoneNumber(String phoneNumber);
    UserRegistrationResponse findUserByEmail(String email);
    List<UserRegistrationResponse> findAllUser();
    void deleteUser(String email);
    int count();
}
