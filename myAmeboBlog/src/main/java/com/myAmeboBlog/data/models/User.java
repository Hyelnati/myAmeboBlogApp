package com.myAmeboBlog.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("User")
public class User {
    @Id
    public String userId;
    public Biodata biodata;
    public Post post;
}
