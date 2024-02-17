package com.myAmeboBlog.data.repository;

import com.myAmeboBlog.data.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {
    Post findPostByTitle(String title);

    Post savePost(Post post);


    List<Post>findAllPost();

    void deletePost(String postTitle);
}
