package com.myAmeboBlog.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class AdminRegistrationRequest {
    @Id
    private String adminId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String passWord;

}
