package com.myAmeboBlog.services;

import com.myAmeboBlog.data.models.Post;
import com.myAmeboBlog.dto.request.PostRequest;
import com.myAmeboBlog.dto.response.PostResponse;

import java.util.List;

public interface PostService {
    PostResponse savePost(PostRequest postRequest);
    PostResponse findPostByTitle(String title);
    List<Post> findAllPost();
    void deletePost(String title);
    int count();
}
