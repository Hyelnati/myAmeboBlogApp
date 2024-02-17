package com.myAmeboBlog.services;

import com.myAmeboBlog.dto.request.CommentRequest;
import com.myAmeboBlog.dto.response.CommentResponse;

public interface CommentService {
    CommentResponse saveComment(CommentRequest commentRequest);
    void deleteComment(String  id);

    CommentResponse findComment(String id);

    int count();
}
