package com.myAmeboBlog.data.repository;

import com.myAmeboBlog.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {
    User findUserByPhoneNumber(String phoneNumber);

    User findUserByEmail(String email);

    List<User> findAllUser();

    void deleteUser(String toString);

    User saveUser(User user);
}
