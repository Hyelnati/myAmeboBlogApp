package com.myAmeboBlog.controllers;

import com.myAmeboBlog.dto.request.CommentRequest;
import com.myAmeboBlog.services.CommentService;
import com.myAmeboBlog.services.CommentServiceImpl;

public class CommentController {
    private static final CommentService commentService = new CommentServiceImpl();
    public Object writeComment(CommentRequest commentRequest){
        try {
            commentService.saveComment(commentRequest);
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
    public Object findComment(CommentRequest commentRequest){
        try {
            commentService.findComment(commentRequest.getCommentId());
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
    public Object deleteComment(CommentRequest commentRequest){
        try {
            commentService.deleteComment(commentRequest.getCommentId());
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
}
