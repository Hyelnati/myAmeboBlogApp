package com.myAmeboBlog.dto.response;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Data
public class UserRegistrationResponse {
    private String userId;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String passWord;
    @CreatedDate
    private LocalDate currentDate;
}
