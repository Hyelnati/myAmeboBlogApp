package com.myAmeboBlog.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document("Biodata")
public class Biodata {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;
    public String passWord;
    @CreatedDate
    public LocalDate currentDate;
}
