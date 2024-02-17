package com.myAmeboBlog.controllers;

import com.myAmeboBlog.dto.request.AdminRegistrationRequest;
import com.myAmeboBlog.services.AdminService;
import com.myAmeboBlog.services.AdminServiceImpl;

public class AdminController {
    private static final AdminService adminService = new AdminServiceImpl();

    public Object signup(AdminRegistrationRequest adminRegistrationRequest){
        try{
            adminService.adminSignUp(adminRegistrationRequest);
        }catch (IllegalArgumentException exception){
            return exception.getMessage();
        }
        return null;
    }
    public Object findAdminByPhoneNumber(AdminRegistrationRequest adminRegistrationRequest){
        try {
            adminService.findAdminByPhoneNumber(adminRegistrationRequest.getPhoneNumber());
        }catch (IllegalArgumentException exception){
            return exception.getMessage();
        }
        return null;
    }
    public Object findAdminByEmail(AdminRegistrationRequest adminRegistrationRequest){
        try {
            adminService.findAminByEmail(adminRegistrationRequest.getEmail());
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
    public Object findAllAdmin(){
        try {
            adminService.findAll();
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();

        }
        return null;
    }
    public Object deleteAdmin(AdminRegistrationRequest adminRegistrationRequest){
        try {
            adminService.deleteAdmin(adminRegistrationRequest.getEmail());
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
}
