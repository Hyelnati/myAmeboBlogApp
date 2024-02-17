package com.myAmeboBlog.dto.request;

import com.myAmeboBlog.data.models.Comment;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class PostRequest {
    public String postId;
    public String postTitle;
    public String postBody;
    public List<Comment> comments;
}
