package com.sofka.relationalDB.controller;

import com.sofka.relationalDB.entity.Comment;
import com.sofka.relationalDB.entity.Post;
import com.sofka.relationalDB.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class Controller {
    @Autowired
    private PostService postService;

    @GetMapping("posts")
    public List<Post> getAllPosts(){
        return postService.findAllPosts();
    }

    @PostMapping("create/post")
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }

    @PostMapping("create/comment")
    public Post createComment(@RequestBody Comment comment){
        return postService.createComment(comment);
    }

    @DeleteMapping("delete/post")
    public void deletePost(@RequestBody Post post){
        postService.deletePost(post);
    }

    @DeleteMapping("delete/comment")
    public void deleteComment(@RequestBody Comment comment){
        postService.deleteComment(comment);
    }
}
