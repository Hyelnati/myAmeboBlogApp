package com.myAmeboBlog.dto.response;

import com.myAmeboBlog.data.models.Comment;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.List;

@Data
public class PostResponse {
    public String postId;
    public String postTitle;
    public String postBody;
    public List<Comment> comments;
    @CreatedDate
    public LocalDate currentDate;
}
