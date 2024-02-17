package com.myAmeboBlog.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Admin")
public class Admin {

    public Biodata biodata;
    @Id
    public String adminId;
    public Post post;
}
