package com.myAmeboBlog.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class CommentRequest {
    @Id
    private String commentId;
    private String commentBody;

}
