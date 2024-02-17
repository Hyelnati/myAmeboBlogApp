package com.myAmeboBlog.services;

import com.myAmeboBlog.data.models.User;
import com.myAmeboBlog.data.repository.UserRepository;
import com.myAmeboBlog.dto.request.UserRegistrationRequest;
import com.myAmeboBlog.dto.response.UserRegistrationResponse;
import com.myAmeboBlog.utilities.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    int count = 0;
    UserRepository userRepository;
    @Override
    public UserRegistrationResponse userSignUp(UserRegistrationRequest userRegistrationRequest) {
        if (emailAlreadyExist(userRegistrationRequest.getEmail())) throw new IllegalArgumentException("User already Exist");
        User user = Mapper.userRequestMapper(userRegistrationRequest);
        User saved = userRepository.saveUser(user);
        count++;
        return Mapper.userResponseMapper(saved);

    }
    private boolean emailAlreadyExist(String email){
        User findEmail = userRepository.findUserByEmail(email);
        return findEmail != null;
    }

    @Override
    public UserRegistrationResponse findUserByPhoneNumber(String phoneNumber) {
        User findUsrByPhoneNumber = userRepository.findUserByPhoneNumber(phoneNumber);
        if (findUsrByPhoneNumber == null){
            throw new IllegalArgumentException("User does not exist");
        }
        return Mapper.userResponseMapper(findUsrByPhoneNumber);

    }

    @Override
    public UserRegistrationResponse findUserByEmail(String email) {
        User findUserByEmail = userRepository.findUserByEmail(email);
        if (findUserByEmail == null){
            throw new IllegalArgumentException("User already exist");
        }
        return Mapper.userResponseMapper(findUserByEmail);

    }

    @Override
    public List<UserRegistrationResponse> findAllUser() {
        if (userRepository.findAllUser().isEmpty()){
            throw new IllegalArgumentException("No existing users");
        }else {
            userRepository.findAllUser();
        }
        return null;
    }

    @Override
    public void deleteUser(String email) {
        User findUserByEmail = userRepository.findUserByEmail(email);
        if (findUserByEmail == null) {
            throw new IllegalArgumentException("User already exist");
        }
        userRepository.deleteUser(findUserByEmail.toString());
        count--;

    }

    @Override
    public int count() {
        return count;
    }
}
