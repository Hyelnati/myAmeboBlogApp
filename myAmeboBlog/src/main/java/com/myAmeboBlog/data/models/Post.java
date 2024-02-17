package com.myAmeboBlog.data.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Document("Products")
public class Post {
    @Id
    public String postId;
    public String postTitle;
    public String postBody;
    public List<Comment> comments;
    public LocalDate localDate;
}
