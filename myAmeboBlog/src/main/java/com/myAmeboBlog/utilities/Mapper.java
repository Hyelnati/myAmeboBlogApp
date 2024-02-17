package com.myAmeboBlog.utilities;

import com.myAmeboBlog.data.models.*;
import com.myAmeboBlog.dto.request.AdminRegistrationRequest;
import com.myAmeboBlog.dto.request.CommentRequest;
import com.myAmeboBlog.dto.request.PostRequest;
import com.myAmeboBlog.dto.request.UserRegistrationRequest;
import com.myAmeboBlog.dto.response.AdminRegistrationResponse;
import com.myAmeboBlog.dto.response.CommentResponse;
import com.myAmeboBlog.dto.response.PostResponse;
import com.myAmeboBlog.dto.response.UserRegistrationResponse;

public class Mapper {
    public static Admin adminRequestMapper(AdminRegistrationRequest adminRegistrationRequest){
        Admin map = new Admin();
        Biodata biodata = new Biodata();
        biodata.setEmail(adminRegistrationRequest.getEmail());
        biodata.setFirstName(adminRegistrationRequest.getFirstName());
        biodata.setPhoneNumber(adminRegistrationRequest.getPhoneNumber());
        biodata.setLastName(adminRegistrationRequest.getLastName());
        biodata.setPassWord(adminRegistrationRequest.getPassWord());
        map.setBiodata(biodata);
        return map;
    }
    public static AdminRegistrationResponse adminResponseMapper(Admin admin){
        AdminRegistrationResponse map = new AdminRegistrationResponse();
        Biodata biodata = admin.getBiodata();
        map.setFullName(biodata.getFirstName()+ " "+ biodata.getLastName());
        map.setEmail(biodata.getEmail());
        map.setPhoneNumber(biodata.getPhoneNumber());
        map.setPassWord(biodata.getPassWord());
        map.setCurrentDate(biodata.getCurrentDate());
        admin.setBiodata(biodata);

        return map;
    }
    public static User userRequestMapper(UserRegistrationRequest userRegistrationRequest){
        User map = new User();
        Biodata biodata = new Biodata();
        biodata.setFirstName(userRegistrationRequest.getFirstName());
        biodata.setLastName(userRegistrationRequest.getLastName());
        biodata.setEmail(userRegistrationRequest.getEmail());
        biodata.setPhoneNumber(userRegistrationRequest.getPhoneNumber());
        biodata.setPassWord(userRegistrationRequest.getPassWord());
        map.setBiodata(biodata);
        return map;
    }

    public static UserRegistrationResponse userResponseMapper(User user){
        UserRegistrationResponse map = new UserRegistrationResponse();
        map.setFullName(user.getBiodata().getFirstName()+ " " +user.getBiodata().getLastName());
        map.setUserId(user.getUserId());
        map.setEmail(user.getBiodata().getEmail());
        map.setPhoneNumber(user.getBiodata().getPhoneNumber());
        map.setCurrentDate(user.getBiodata().currentDate);
        return map;
    }
    public static Comment commentRequestMapper(CommentRequest commentRequest){
        Comment mapComment = new Comment();
        mapComment.setCommentBody(commentRequest.getCommentBody());
        return mapComment;
    }
    public static CommentResponse commentResponseMapper(Comment comment){
        CommentResponse commentResponseMap = new CommentResponse();
        commentResponseMap.setCommentId(comment.getCommentId());
        commentResponseMap.setCommentBody(comment.getCommentBody());
        commentResponseMap.setCurrentDate(comment.getCurrentDate());
        return commentResponseMap;
    }

    public static PostResponse postResponseMapper(Post post){
        PostResponse postResponseMap = new PostResponse();
        postResponseMap.setPostId(post.getPostId());
        postResponseMap.setPostTitle(post.getPostTitle());
        postResponseMap.setPostBody(post.getPostBody());
        postResponseMap.setCurrentDate(post.getLocalDate());
        return postResponseMap;
    }
    public static Post postRequestMapper(PostRequest postRequest){
        Post mapPost = new Post();
        mapPost.setPostBody(postRequest.getPostBody());
        mapPost.setPostId(postRequest.getPostId());
        mapPost.setPostTitle(postRequest.getPostTitle());
        return mapPost;
    }


}
