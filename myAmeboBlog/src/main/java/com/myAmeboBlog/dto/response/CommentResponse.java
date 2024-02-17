package com.myAmeboBlog.dto.response;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Data
public class CommentResponse {
    private String  commentId;
    private String commentBody;
    @CreatedDate
    private LocalDate currentDate;
}
