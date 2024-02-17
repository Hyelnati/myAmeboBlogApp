package com.myAmeboBlog.controllers;

import com.myAmeboBlog.dto.request.PostRequest;
import com.myAmeboBlog.services.PostService;
import com.myAmeboBlog.services.PostServiceImpl;

public class PostController {
    private static final PostService postService = new PostServiceImpl();
    public Object savePost(PostRequest postRequest){
        try {
            postService.savePost(postRequest);
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
    public Object findPostByTitle(PostRequest postRequest){
        try {
            postService.findPostByTitle(postRequest.getPostTitle());
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
    public Object findAllPost(){
        try {
            postService.findAllPost();
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
    private Object deletePost(PostRequest postRequest){
        try {
            postService.deletePost(postRequest.getPostTitle());
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return null;
    }
}
