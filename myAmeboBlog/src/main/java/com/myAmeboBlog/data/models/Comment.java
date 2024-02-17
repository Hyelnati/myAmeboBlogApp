package com.myAmeboBlog.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document("Comment")
public class Comment {
    @Id
    public String commentId;
    public String commentBody;
    public LocalDate currentDate;

}
