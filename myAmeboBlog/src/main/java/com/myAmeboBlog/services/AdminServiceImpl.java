package com.myAmeboBlog.services;

import com.myAmeboBlog.data.models.Admin;
import com.myAmeboBlog.data.repository.AdminRepository;
import com.myAmeboBlog.dto.request.AdminRegistrationRequest;
import com.myAmeboBlog.dto.response.AdminRegistrationResponse;
import com.myAmeboBlog.utilities.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    int count = 0;
    AdminRepository adminRepository;

    @Override
    public AdminRegistrationResponse adminSignUp(AdminRegistrationRequest adminRegistrationRequest) {
        if (emailAlreadyExist(adminRegistrationRequest.getEmail())) throw new IllegalArgumentException("Email already exit");
        Admin admin = Mapper.adminRequestMapper(adminRegistrationRequest);
        Admin saved = adminRepository.save(admin);
        count++;
        return Mapper.adminResponseMapper(saved);
    }
    private boolean emailAlreadyExist(String email){
        Admin findEmail = adminRepository.findByBiodata_Email(email);
        return findEmail != null;
    }



    @Override
    public AdminRegistrationResponse findAdminByPhoneNumber(String phoneNumber) {
        Admin findAdminByPhoneNumber = adminRepository.findByBiodata_PhoneNumber(phoneNumber);
        if(findAdminByPhoneNumber == null){
            throw new IllegalArgumentException("User does not Exist");
        }
        return Mapper.adminResponseMapper(findAdminByPhoneNumber);
    }

    @Override
    public AdminRegistrationResponse findAminByEmail(String email) {
        Admin findAdminByEmail = adminRepository.findByBiodata_Email(email);
        if (findAdminByEmail == null){
            throw  new IllegalArgumentException("User does not exist");
        }
        return Mapper.adminResponseMapper(findAdminByEmail);
    }

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();

    }

    @Override
    public void deleteAdmin(String email) {
        Admin findAdminByEmail = adminRepository.findByBiodata_Email(email);
        if(findAdminByEmail == null){
            throw new IllegalArgumentException("User does not Exist");
        }
        adminRepository.deleteAdmin(findAdminByEmail.toString());
        count--;

    }
    @Override
    public int count(){
        return count;
    }

}
