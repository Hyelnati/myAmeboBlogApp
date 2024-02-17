package com.myAmeboBlog.services;

import com.myAmeboBlog.data.models.Post;
import com.myAmeboBlog.data.repository.PostRepository;
import com.myAmeboBlog.dto.request.PostRequest;
import com.myAmeboBlog.dto.response.PostResponse;
import com.myAmeboBlog.utilities.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService {

    int count = 1;
    PostRepository postRepository;
    @Override
    public PostResponse savePost(PostRequest postRequest) {
        if(postAlreadyExist(postRequest.getPostTitle())) throw new IllegalArgumentException("Post something new");
        Post post = Mapper.postRequestMapper(postRequest);
        Post save = postRepository.savePost(post);
        count++;
        return Mapper.postResponseMapper(save);
    }
    private boolean postAlreadyExist(String title){
        Post findPost = postRepository.findPostByTitle(title);
        return findPost !=null;
    }

    @Override
    public PostResponse findPostByTitle(String title) {
        Post findPostByTitle = postRepository.findPostByTitle(title);
        if (findPostByTitle ==null) throw new IllegalArgumentException("No post");

        return Mapper.postResponseMapper(findPostByTitle);
    }

    @Override
    public List<Post> findAllPost() {
        if (postRepository.findAllPost().isEmpty()) throw new IllegalArgumentException("No post yet");

        return postRepository.findAllPost();
    }

    @Override
    public void deletePost(String title) {
        Post findPostByBody = postRepository.findPostByTitle(title);
        if (findPostByBody == null) throw new IllegalArgumentException("No post to delete");
        postRepository.deletePost(findPostByBody.postTitle);
        count--;
    }
    @Override
    public int count() {
        return count;
    }

}
