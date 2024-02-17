package com.myAmeboBlog.services;

import com.myAmeboBlog.data.models.Admin;
import com.myAmeboBlog.dto.request.AdminRegistrationRequest;
import com.myAmeboBlog.dto.response.AdminRegistrationResponse;

import java.util.List;

public interface AdminService {
    AdminRegistrationResponse adminSignUp(AdminRegistrationRequest adminRegistrationRequest);
    AdminRegistrationResponse findAdminByPhoneNumber(String phoneNumber);
    AdminRegistrationResponse findAminByEmail(String email);
    List<Admin> findAll();
    void deleteAdmin(String email);
    int count();
}

