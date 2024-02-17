package com.myAmeboBlog.services;

import com.myAmeboBlog.data.models.Comment;
import com.myAmeboBlog.data.repository.CommentRepository;
import com.myAmeboBlog.dto.request.CommentRequest;
import com.myAmeboBlog.dto.response.CommentResponse;
import com.myAmeboBlog.utilities.Mapper;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    int count = 0;
    CommentRepository commentRepository;
    @Override
    public CommentResponse saveComment(CommentRequest commentRequest) {
        if (generateCommentId(commentRequest.getCommentId())){
            throw new IllegalArgumentException("Write new comment");
        }else {
            Comment comment = Mapper.commentRequestMapper(commentRequest);
            Comment saveComment = commentRepository.saveComment(comment);
            count++;
            return Mapper.commentResponseMapper(saveComment);
        }

    }

      private boolean generateCommentId(String id){
        Comment commentId = commentRepository.findComment(id);
        return commentId != null;
    }

    @Override
    public CommentResponse findComment(String id) {
        Comment findComment = commentRepository.findComment(id);
        if (findComment == null){
            throw new IllegalArgumentException("No comments");
        }
        return Mapper.commentResponseMapper(findComment);
    }

    @Override
    public void deleteComment(String id) {
        Comment findCommentToDelete = commentRepository.findComment(id);
        if (findCommentToDelete ==null){
            throw new IllegalArgumentException("No comments");
        }
        commentRepository.deleteComment(findCommentToDelete.commentId);
        count--;
    }

    @Override
    public int count() {
        return count;
    }
}
