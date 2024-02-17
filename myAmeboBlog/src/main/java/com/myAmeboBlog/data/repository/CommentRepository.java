package com.myAmeboBlog.data.repository;

import com.myAmeboBlog.data.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {
    Comment saveComment(Comment comment);

    Comment findComment(String id);

    void deleteComment(String commentId);
}
