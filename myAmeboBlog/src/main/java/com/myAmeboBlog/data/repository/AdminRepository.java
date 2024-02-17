package com.myAmeboBlog.data.repository;

import com.myAmeboBlog.data.models.Admin;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {
    Admin findByBiodata_Email(String email);
    Admin findByBiodata_PhoneNumber(String phoneNumber);

    void deleteAdmin(String toString);
}
